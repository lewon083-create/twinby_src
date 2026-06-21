package io.sentry;

import io.sentry.util.Objects;
import io.sentry.util.SampleRateUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class TracesSampler {

    @NotNull
    private final SentryOptions options;

    public TracesSampler(@NotNull SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options are required");
    }

    @NotNull
    public TracesSamplingDecision sample(@NotNull SamplingContext samplingContext) {
        Double dSample;
        Double dSample2;
        Double sampleRand = samplingContext.getSampleRand();
        TracesSamplingDecision samplingDecision = samplingContext.getTransactionContext().getSamplingDecision();
        if (samplingDecision != null) {
            return SampleRateUtils.backfilledSampleRand(samplingDecision);
        }
        if (this.options.getProfilesSampler() != null) {
            try {
                dSample = this.options.getProfilesSampler().sample(samplingContext);
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'ProfilesSamplerCallback' callback.", th2);
                dSample = null;
            }
        } else {
            dSample = null;
        }
        if (dSample == null) {
            dSample = this.options.getProfilesSampleRate();
        }
        Double d10 = dSample;
        Boolean boolValueOf = Boolean.valueOf(d10 != null && sample(d10, sampleRand));
        if (this.options.getTracesSampler() != null) {
            try {
                dSample2 = this.options.getTracesSampler().sample(samplingContext);
            } catch (Throwable th3) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'TracesSamplerCallback' callback.", th3);
                dSample2 = null;
            }
            if (dSample2 != null) {
                return new TracesSamplingDecision(Boolean.valueOf(sample(dSample2, sampleRand)), dSample2, sampleRand, boolValueOf, d10);
            }
        }
        TracesSamplingDecision parentSamplingDecision = samplingContext.getTransactionContext().getParentSamplingDecision();
        if (parentSamplingDecision != null) {
            return SampleRateUtils.backfilledSampleRand(parentSamplingDecision);
        }
        Double tracesSampleRate = this.options.getTracesSampleRate();
        Double dValueOf = tracesSampleRate != null ? Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.options.getBackpressureMonitor().getDownsampleFactor())) : null;
        if (dValueOf != null) {
            return new TracesSamplingDecision(Boolean.valueOf(sample(dValueOf, sampleRand)), dValueOf, sampleRand, boolValueOf, d10);
        }
        Boolean bool = Boolean.FALSE;
        return new TracesSamplingDecision(bool, null, sampleRand, bool, null);
    }

    public boolean sampleSessionProfile(double d10) {
        Double profileSessionSampleRate = this.options.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && sample(profileSessionSampleRate, Double.valueOf(d10));
    }

    private boolean sample(@NotNull Double d10, @NotNull Double d11) {
        return d10.doubleValue() >= d11.doubleValue();
    }
}

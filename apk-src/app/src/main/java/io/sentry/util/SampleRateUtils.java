package io.sentry.util;

import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.TracesSamplingDecision;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SampleRateUtils {
    @NotNull
    public static Double backfilledSampleRand(@Nullable Double d10, @Nullable Double d11, @Nullable Boolean bool) {
        if (d10 != null) {
            return d10;
        }
        double dNextDouble = SentryRandom.current().nextDouble();
        if (d11 == null || bool == null) {
            return Double.valueOf(dNextDouble);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d11.doubleValue() * dNextDouble);
        }
        return Double.valueOf(((1.0d - d11.doubleValue()) * dNextDouble) + d11.doubleValue());
    }

    public static boolean isValidContinuousProfilesSampleRate(@Nullable Double d10) {
        return isValidRate(d10, true);
    }

    public static boolean isValidProfilesSampleRate(@Nullable Double d10) {
        return isValidRate(d10, true);
    }

    private static boolean isValidRate(@Nullable Double d10, boolean z5) {
        return d10 == null ? z5 : !d10.isNaN() && d10.doubleValue() >= ConfigValue.DOUBLE_DEFAULT_VALUE && d10.doubleValue() <= 1.0d;
    }

    public static boolean isValidSampleRate(@Nullable Double d10) {
        return isValidRate(d10, true);
    }

    public static boolean isValidTracesSampleRate(@Nullable Double d10) {
        return isValidTracesSampleRate(d10, true);
    }

    public static boolean isValidTracesSampleRate(@Nullable Double d10, boolean z5) {
        return isValidRate(d10, z5);
    }

    @NotNull
    public static TracesSamplingDecision backfilledSampleRand(@NotNull TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision.getSampleRand() != null) {
            return tracesSamplingDecision;
        }
        return new TracesSamplingDecision(tracesSamplingDecision.getSampled(), tracesSamplingDecision.getSampleRate(), backfilledSampleRand(null, tracesSamplingDecision.getSampleRate(), tracesSamplingDecision.getSampled()), tracesSamplingDecision.getProfileSampled(), tracesSamplingDecision.getProfileSampleRate());
    }
}

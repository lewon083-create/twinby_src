package io.sentry.util;

import he.e;
import io.sentry.Baggage;
import io.sentry.BaggageHeader;
import io.sentry.FilterString;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISpan;
import io.sentry.NoOpLogger;
import io.sentry.PropagationContext;
import io.sentry.SentryOptions;
import io.sentry.SentryTraceHeader;
import io.sentry.SpanContext;
import io.sentry.TracesSamplingDecision;
import io.sentry.W3CTraceparentHeader;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class TracingUtils {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class PropagationContextHolder {

        @Nullable
        private PropagationContext propagationContext;

        private PropagationContextHolder() {
            this.propagationContext = null;
        }
    }

    @NotNull
    public static Baggage ensureBaggage(@Nullable Baggage baggage, @Nullable TracesSamplingDecision tracesSamplingDecision) {
        return ensureBaggage(baggage, tracesSamplingDecision == null ? null : tracesSamplingDecision.getSampled(), tracesSamplingDecision == null ? null : tracesSamplingDecision.getSampleRate(), tracesSamplingDecision != null ? tracesSamplingDecision.getSampleRand() : null);
    }

    public static boolean isIgnored(@Nullable List<FilterString> list, @Nullable String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Iterator<FilterString> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getFilterString().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator<FilterString> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().matches(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$maybeUpdateBaggage$5(IScope iScope, SentryOptions sentryOptions, PropagationContext propagationContext) {
        Baggage baggage = propagationContext.getBaggage();
        if (baggage.isMutable()) {
            baggage.setValuesFromScope(iScope, sentryOptions);
            baggage.freeze();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setTrace$3(PropagationContext propagationContext, IScope iScope) {
        iScope.withPropagationContext(new b(1, iScope, propagationContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startNewTrace$0(IScope iScope, PropagationContext propagationContext) {
        iScope.setPropagationContext(new PropagationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startNewTrace$1(IScope iScope) {
        iScope.withPropagationContext(new e(16, iScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$trace$4(PropagationContextHolder propagationContextHolder, SentryOptions sentryOptions, IScope iScope) {
        propagationContextHolder.propagationContext = maybeUpdateBaggage(iScope, sentryOptions);
    }

    @NotNull
    public static PropagationContext maybeUpdateBaggage(@NotNull IScope iScope, @NotNull SentryOptions sentryOptions) {
        return iScope.withPropagationContext(new b(2, iScope, sentryOptions));
    }

    public static void setTrace(@NotNull IScopes iScopes, @NotNull PropagationContext propagationContext) {
        iScopes.configureScope(new e(15, propagationContext));
    }

    private static boolean shouldAttachTracingHeaders(@NotNull String str, @NotNull SentryOptions sentryOptions) {
        return PropagationTargetsUtils.contain(sentryOptions.getTracePropagationTargets(), str);
    }

    public static boolean shouldContinueTrace(@NotNull SentryOptions sentryOptions, @Nullable Baggage baggage) {
        String effectiveOrgId = sentryOptions.getEffectiveOrgId();
        String strTrim = null;
        String orgId = baggage != null ? baggage.getOrgId() : null;
        if (orgId != null && !orgId.trim().isEmpty()) {
            strTrim = orgId.trim();
        }
        if (effectiveOrgId != null && strTrim != null && !effectiveOrgId.equals(strTrim)) {
            return false;
        }
        if (!sentryOptions.isStrictTraceContinuation()) {
            return true;
        }
        if (effectiveOrgId == null && strTrim == null) {
            return true;
        }
        return effectiveOrgId != null && effectiveOrgId.equals(strTrim);
    }

    public static void startNewTrace(@NotNull IScopes iScopes) {
        iScopes.configureScope(new ig.a(23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.sentry.util.TracingUtils$1] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Nullable
    public static TracingHeaders trace(@NotNull IScopes iScopes, @Nullable List<String> list, @Nullable ISpan iSpan) {
        SentryOptions options = iScopes.getOptions();
        W3CTraceparentHeader w3CTraceparentHeader = null;
        if (iSpan != null && !iSpan.isNoOp()) {
            SentryTraceHeader sentryTrace = iSpan.toSentryTrace();
            BaggageHeader baggageHeader = iSpan.toBaggageHeader(list);
            if (options.isPropagateTraceparent()) {
                SpanContext spanContext = iSpan.getSpanContext();
                w3CTraceparentHeader = new W3CTraceparentHeader(spanContext.getTraceId(), spanContext.getSpanId(), sentryTrace.isSampled());
            }
            return new TracingHeaders(sentryTrace, baggageHeader, w3CTraceparentHeader);
        }
        PropagationContextHolder propagationContextHolder = new PropagationContextHolder();
        iScopes.configureScope(new b(0, propagationContextHolder, options));
        if (propagationContextHolder.propagationContext == null) {
            return null;
        }
        PropagationContext propagationContext = propagationContextHolder.propagationContext;
        return new TracingHeaders(new SentryTraceHeader(propagationContext.getTraceId(), propagationContext.getSpanId(), propagationContext.isSampled()), BaggageHeader.fromBaggageAndOutgoingHeader(propagationContext.getBaggage(), list), options.isPropagateTraceparent() ? new W3CTraceparentHeader(propagationContext.getTraceId(), propagationContext.getSpanId(), propagationContext.isSampled()) : 0);
    }

    @Nullable
    public static TracingHeaders traceIfAllowed(@NotNull IScopes iScopes, @NotNull String str, @Nullable List<String> list, @Nullable ISpan iSpan) {
        SentryOptions options = iScopes.getOptions();
        if (options.isTraceSampling() && shouldAttachTracingHeaders(str, options)) {
            return trace(iScopes, list, iSpan);
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class TracingHeaders {

        @Nullable
        private final BaggageHeader baggageHeader;

        @NotNull
        private final SentryTraceHeader sentryTraceHeader;

        @Nullable
        private final W3CTraceparentHeader w3cTraceparentHeader;

        public TracingHeaders(@NotNull SentryTraceHeader sentryTraceHeader, @Nullable BaggageHeader baggageHeader) {
            this.sentryTraceHeader = sentryTraceHeader;
            this.baggageHeader = baggageHeader;
            this.w3cTraceparentHeader = null;
        }

        @Nullable
        public BaggageHeader getBaggageHeader() {
            return this.baggageHeader;
        }

        @NotNull
        public SentryTraceHeader getSentryTraceHeader() {
            return this.sentryTraceHeader;
        }

        @Nullable
        public W3CTraceparentHeader getW3cTraceparentHeader() {
            return this.w3cTraceparentHeader;
        }

        public TracingHeaders(@NotNull SentryTraceHeader sentryTraceHeader, @Nullable BaggageHeader baggageHeader, @Nullable W3CTraceparentHeader w3CTraceparentHeader) {
            this.sentryTraceHeader = sentryTraceHeader;
            this.baggageHeader = baggageHeader;
            this.w3cTraceparentHeader = w3CTraceparentHeader;
        }
    }

    @NotNull
    public static Baggage ensureBaggage(@Nullable Baggage baggage, @Nullable Boolean bool, @Nullable Double d10, @Nullable Double d11) {
        if (baggage == null) {
            baggage = new Baggage(NoOpLogger.getInstance());
        }
        if (baggage.getSampleRand() == null) {
            Double sampleRate = baggage.getSampleRate();
            if (sampleRate != null) {
                d10 = sampleRate;
            }
            baggage.setSampleRand(SampleRateUtils.backfilledSampleRand(d11, d10, bool));
        }
        if (baggage.isMutable() && baggage.isShouldFreeze()) {
            baggage.freeze();
        }
        return baggage;
    }
}

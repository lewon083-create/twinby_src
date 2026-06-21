package io.sentry;

import io.sentry.JsonObjectDeserializer;
import io.sentry.Scope;
import io.sentry.Sentry;
import io.sentry.hints.Resettable;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.util.CollectionUtils;
import io.sentry.util.HintUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements JsonObjectDeserializer.NextValue, Scope.IWithSession, HintUtils.SentryConsumer, ScopeCallback, Sentry.OptionsConfiguration, CollectionUtils.Predicate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26021b;

    public /* synthetic */ f(int i) {
        this.f26021b = i;
    }

    @Override // io.sentry.Scope.IWithSession
    public void accept(Session session) {
        SentryClient.lambda$captureEvent$0(session);
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        sentryOptions.setEnableExternalConfiguration(true);
    }

    @Override // io.sentry.JsonObjectDeserializer.NextValue
    public Object nextValue() {
        return JsonObjectDeserializer.lambda$parse$3();
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f26021b) {
            case 3:
                iScope.clear();
                break;
            default:
                iScope.clear();
                break;
        }
    }

    @Override // io.sentry.util.CollectionUtils.Predicate
    public boolean test(Object obj) {
        SentryStackFrame sentryStackFrame = (SentryStackFrame) obj;
        switch (this.f26021b) {
            case 6:
                return SentryStackTraceFactory.lambda$getInAppCallStack$0(sentryStackFrame);
            default:
                return SentryStackTraceFactory.lambda$getInAppCallStack$1(sentryStackFrame);
        }
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        ((Resettable) obj).reset();
    }
}

package io.sentry;

import io.sentry.Sentry;
import io.sentry.SentryFeedbackOptions;
import io.sentry.hints.Flushable;
import io.sentry.protocol.SentryId;
import io.sentry.util.HintUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements HintUtils.SentryConsumer, ScopeCallback, Sentry.OptionsConfiguration, SentryFeedbackOptions.IFormHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26008c;

    public /* synthetic */ b(int i, Object obj) {
        this.f26007b = i;
        this.f26008c = obj;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        ((EnvelopeSender) this.f26008c).lambda$processFile$0((Flushable) obj);
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        sentryOptions.setDsn((String) this.f26008c);
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f26007b) {
            case 1:
                Scopes.lambda$continueTrace$7((PropagationContext) this.f26008c, iScope);
                break;
            default:
                SentryTracer.lambda$updateBaggageValues$4((AtomicReference) this.f26008c, iScope);
                break;
        }
    }

    @Override // io.sentry.SentryFeedbackOptions.IFormHandler
    public void showForm(SentryId sentryId, SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
        ((SentryOptions) this.f26008c).lambda$new$4(sentryId, optionsConfigurator);
    }
}

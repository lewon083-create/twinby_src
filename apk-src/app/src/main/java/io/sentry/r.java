package io.sentry;

import io.sentry.clientreport.ClientReport;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26081d;

    public /* synthetic */ r(int i, Object obj, Object obj2) {
        this.f26079b = i;
        this.f26080c = obj;
        this.f26081d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f26079b) {
            case 0:
                return SentryEnvelopeItem.lambda$fromSession$0((ISerializer) this.f26080c, (Session) this.f26081d);
            case 1:
                return SentryEnvelopeItem.lambda$fromEvent$3((ISerializer) this.f26080c, (SentryBaseEvent) this.f26081d);
            case 2:
                return SentryEnvelopeItem.lambda$fromUserFeedback$6((ISerializer) this.f26080c, (UserFeedback) this.f26081d);
            case 3:
                return SentryEnvelopeItem.lambda$fromClientReport$21((ISerializer) this.f26080c, (ClientReport) this.f26081d);
            case 4:
                return SentryEnvelopeItem.lambda$fromCheckIn$9((ISerializer) this.f26080c, (CheckIn) this.f26081d);
            case 5:
                return SentryEnvelopeItem.lambda$fromLogs$27((ISerializer) this.f26080c, (SentryLogEvents) this.f26081d);
            case 6:
                return SentryEnvelopeItem.lambda$fromMetrics$30((ISerializer) this.f26080c, (SentryMetricsEvents) this.f26081d);
            default:
                return SentryWrapper.lambda$wrapCallable$0((IScopes) this.f26080c, (Callable) this.f26081d);
        }
    }
}

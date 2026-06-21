package io.sentry.transport;

import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.Enqueable;
import io.sentry.transport.AsyncHttpTransport;
import io.sentry.util.HintUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements HintUtils.SentryConsumer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26095c;

    public /* synthetic */ b(int i, Object obj) {
        this.f26094b = i;
        this.f26095c = obj;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public final void accept(Object obj) {
        switch (this.f26094b) {
            case 0:
                ((AsyncHttpTransport.EnvelopeSender) this.f26095c).lambda$flush$1((DiskFlushNotification) obj);
                break;
            case 1:
                ((AsyncHttpTransport) this.f26095c).lambda$send$0((Enqueable) obj);
                break;
            default:
                ((RateLimiter) this.f26095c).lambda$markHintWhenSendingFailed$2((DiskFlushNotification) obj);
                break;
        }
    }
}

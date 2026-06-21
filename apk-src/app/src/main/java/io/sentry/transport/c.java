package io.sentry.transport;

import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.HintUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements HintUtils.SentryConsumer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26096b;

    public /* synthetic */ c(int i) {
        this.f26096b = i;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public final void accept(Object obj) {
        switch (this.f26096b) {
            case 0:
                ((Retryable) obj).setRetry(true);
                break;
            case 1:
                ((Retryable) obj).setRetry(true);
                break;
            case 2:
                ((SubmissionResult) obj).setResult(false);
                break;
            default:
                ((SubmissionResult) obj).setResult(false);
                break;
        }
    }
}

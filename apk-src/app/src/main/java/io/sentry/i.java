package io.sentry;

import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;
import j3.h0;
import yads.oe2;
import yads.of1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements ScopeCallback, HintUtils.SentryConsumer, m3.k, of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26029c;

    public /* synthetic */ i(boolean z5, int i) {
        this.f26028b = i;
        this.f26029c = z5;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        switch (this.f26028b) {
            case 3:
                ((Retryable) obj).setRetry(this.f26029c);
                break;
            default:
                ((Retryable) obj).setRetry(this.f26029c);
                break;
        }
    }

    @Override // m3.k, yads.of1
    public void invoke(Object obj) {
        switch (this.f26028b) {
            case 5:
                ((h0) obj).onSkipSilenceEnabledChanged(this.f26029c);
                break;
            default:
                ((oe2) obj).onSkipSilenceEnabledChanged(this.f26029c);
                break;
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f26028b) {
            case 0:
                Scopes.lambda$close$3(this.f26029c, iScope);
                break;
            case 1:
                Scopes.lambda$close$4(this.f26029c, iScope);
                break;
            default:
                Scopes.lambda$close$5(this.f26029c, iScope);
                break;
        }
    }
}

package io.sentry.android.core;

import io.sentry.IScopes;
import io.sentry.SentryOptions;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25952e;

    public /* synthetic */ u(Object obj, IScopes iScopes, SentryAndroidOptions sentryAndroidOptions, int i) {
        this.f25949b = i;
        this.f25950c = obj;
        this.f25952e = iScopes;
        this.f25951d = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25949b) {
            case 0:
                ((SendCachedEnvelopeIntegration) this.f25950c).lambda$sendCachedEnvelopes$0((SentryAndroidOptions) this.f25951d, (IScopes) this.f25952e);
                break;
            case 1:
                ((ActivityFramesTracker) this.f25950c).lambda$runSafelyOnUiThread$5((Runnable) this.f25951d, (String) this.f25952e);
                break;
            case 2:
                ((AndroidContinuousProfiler) this.f25950c).lambda$sendChunks$1((SentryOptions) this.f25951d, (IScopes) this.f25952e);
                break;
            case 3:
                ((AnrIntegration) this.f25950c).lambda$register$0((IScopes) this.f25952e, (SentryAndroidOptions) this.f25951d);
                break;
            default:
                ((SystemEventsBreadcrumbsIntegration) this.f25950c).lambda$registerReceiver$0((IScopes) this.f25952e, (SentryAndroidOptions) this.f25951d);
                break;
        }
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i) {
        this.f25949b = i;
        this.f25950c = obj;
        this.f25951d = obj2;
        this.f25952e = obj3;
    }
}

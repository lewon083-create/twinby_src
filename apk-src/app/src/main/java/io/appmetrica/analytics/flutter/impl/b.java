package io.appmetrica.analytics.flutter.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pigeon.Result f21888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21890e;

    public /* synthetic */ b(Pigeon.Result result, Object obj, Object obj2, int i) {
        this.f21887b = i;
        this.f21888c = result;
        this.f21890e = obj;
        this.f21889d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21887b) {
            case 0:
                AppMetricaImpl.AnonymousClass1.lambda$onError$1(this.f21888c, (DeferredDeeplinkListener.Error) this.f21890e, (String) this.f21889d);
                break;
            case 1:
                AppMetricaImpl.AnonymousClass2.lambda$onError$1(this.f21888c, (DeferredDeeplinkParametersListener.Error) this.f21890e, (String) this.f21889d);
                break;
            default:
                AppMetricaImpl.AnonymousClass3.lambda$onRequestError$1(this.f21888c, (StartupParamsCallback.Result) this.f21890e, (StartupParamsCallback.Reason) this.f21889d);
                break;
        }
    }
}

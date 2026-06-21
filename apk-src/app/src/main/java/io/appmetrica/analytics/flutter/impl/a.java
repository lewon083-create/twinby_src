package io.appmetrica.analytics.flutter.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pigeon.Result f21885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21886d;

    public /* synthetic */ a(Pigeon.Result result, Object obj, int i) {
        this.f21884b = i;
        this.f21885c = result;
        this.f21886d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21884b) {
            case 0:
                AppMetricaImpl.AnonymousClass1.lambda$onDeeplinkLoaded$0(this.f21885c, (String) this.f21886d);
                break;
            case 1:
                AppMetricaImpl.AnonymousClass2.lambda$onParametersLoaded$0(this.f21885c, (Map) this.f21886d);
                break;
            default:
                AppMetricaImpl.AnonymousClass3.lambda$onReceive$0(this.f21885c, (StartupParamsCallback.Result) this.f21886d);
                break;
        }
    }
}

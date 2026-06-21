package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6 extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B6 f22194a;

    public C6(Handler handler, B6 b62) {
        super(handler);
        this.f22194a = b62;
    }

    public static void a(ResultReceiver resultReceiver, T3 t32) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            t32.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f22194a.a(i, bundle);
    }

    public static void a(ResultReceiver resultReceiver, Il il2, T3 t32) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", il2.f22465a);
            t32.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}

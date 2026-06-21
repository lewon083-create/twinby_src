package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ResultReceiverC0487sg extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0134eg f24738a;

    public ResultReceiverC0487sg(Handler handler, InterfaceC0134eg interfaceC0134eg) {
        super(handler);
        this.f24738a = interfaceC0134eg;
    }

    public static void a(ResultReceiver resultReceiver, C0338mg c0338mg) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c0338mg == null ? null : c0338mg.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            C0338mg c0338mg = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c0338mg = new C0338mg(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f24738a.a(c0338mg);
        }
    }
}

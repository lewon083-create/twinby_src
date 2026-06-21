package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tu0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10718a;

    public /* synthetic */ tu0(int i) {
        this.f10718a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f10718a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        fs1.f5425d = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            fs1.f5425d = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                synchronized (u9.f.f34380b) {
                    u9.f.f34381c = false;
                    u9.f.f34382d = false;
                    u9.i.h("Ad debug logging enablement is out of date.");
                    break;
                }
                com.google.android.gms.internal.measurement.h5.I(context);
                return;
        }
    }
}

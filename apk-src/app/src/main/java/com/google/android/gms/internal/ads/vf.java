package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vf implements AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11371b;

    public /* synthetic */ vf(int i, Object obj) {
        this.f11370a = i;
        this.f11371b = obj;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z5) {
        switch (this.f11370a) {
            case 0:
                if (z5) {
                    wf wfVar = (wf) this.f11371b;
                    wfVar.f11798a = System.currentTimeMillis();
                    wfVar.f11801d = true;
                    return;
                }
                wf wfVar2 = (wf) this.f11371b;
                long j10 = wfVar2.f11799b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j10 > 0) {
                    long j11 = wfVar2.f11799b;
                    if (jCurrentTimeMillis >= j11) {
                        wfVar2.f11800c = jCurrentTimeMillis - j11;
                    }
                }
                wfVar2.f11801d = false;
                return;
            default:
                h21 h21Var = (h21) this.f11371b;
                synchronized (h21Var) {
                    try {
                        if (z5) {
                            h21Var.f6007d = System.currentTimeMillis();
                            h21Var.f6010g = true;
                        } else {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j12 = h21Var.f6008e;
                            if (j12 > 0 && jCurrentTimeMillis2 >= j12) {
                                h21Var.f6009f = jCurrentTimeMillis2 - j12;
                            }
                            h21Var.f6010g = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }
}

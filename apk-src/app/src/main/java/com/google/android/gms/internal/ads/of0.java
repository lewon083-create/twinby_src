package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class of0 implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8685c;

    public /* synthetic */ of0(int i, Object obj) {
        this.f8684b = i;
        this.f8685c = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f8684b) {
            case 0:
                yf0 yf0Var = (yf0) this.f8685c;
                be0 be0Var = (be0) yf0Var.f12612e;
                be0Var.getClass();
                for (oe0 oe0Var : (CopyOnWriteArraySet) yf0Var.f12613f) {
                    if (!oe0Var.f8675d && oe0Var.f8674c) {
                        cw1 cw1VarD = oe0Var.f8673b.d();
                        oe0Var.f8673b = new uv1(0);
                        oe0Var.f8674c = false;
                        be0Var.f(oe0Var.f8672a, cw1VarD);
                    }
                    lo0 lo0Var = (lo0) yf0Var.f12611d;
                    lo0Var.getClass();
                    if (lo0Var.f7588a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            default:
                com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f8685c;
                cVar.getClass();
                int i = message.what;
                if (i == 1) {
                    ((em0) cVar.f13342f).b();
                    break;
                } else if (i == 2) {
                    ((om0) cVar.f13343g).b();
                    break;
                } else if (i == 3) {
                    ((rm0) cVar.f13344h).b();
                    break;
                } else if (i == 4) {
                    ((ym0) cVar.i).b();
                    break;
                }
                break;
        }
        return true;
    }
}

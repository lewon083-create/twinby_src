package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ih implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6490a;

    public /* synthetic */ ih(int i) {
        this.f6490a = i;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f6490a) {
            case 0:
                return new hh();
            case 1:
                q00 q00Var = new q00();
                q00Var.f9252a = null;
                return q00Var;
            case 2:
                return p9.k.C.f31302h;
            case 3:
                gx executorService = hx.f6279a;
                gr.G(executorService);
                Intrinsics.checkNotNullParameter(executorService, "executorService");
                return new xo0(4, executorService);
            case 4:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 5:
                String str = q9.r.f31959g.f31965f;
                gr.G(str);
                return str;
            case 6:
                return new ArrayDeque();
            case 7:
                return new c6(29);
            case 8:
                return new fp(11);
            case 9:
                return new fp(15);
            case 10:
                return p9.k.C.f31318y;
            case 11:
                return new r20();
            case 12:
                return ti.APP_OPEN;
            case 13:
                return "app_open_ad";
            case 14:
                return ti.BANNER;
            case 15:
                return "banner";
            case 16:
                return new h50();
            case 17:
                return new s70();
            case 18:
                y70 y70Var = new y70();
                wk wkVar = al.E1;
                q9.s sVar = q9.s.f31967e;
                y70Var.f12533b = ((Integer) sVar.f31970c.a(wkVar)).intValue();
                y70Var.f12534c = ((Integer) sVar.f31970c.a(al.f2991ee)).intValue();
                return y70Var;
            case 19:
                Set set = Collections.EMPTY_SET;
                gr.G(set);
                return set;
            case 20:
                Set set2 = Collections.EMPTY_SET;
                gr.G(set2);
                return set2;
            case 21:
                Set set3 = Collections.EMPTY_SET;
                gr.G(set3);
                return set3;
            case 22:
                Set set4 = Collections.EMPTY_SET;
                gr.G(set4);
                return set4;
            case 23:
                Set set5 = Collections.EMPTY_SET;
                gr.G(set5);
                return set5;
            case 24:
                Set set6 = Collections.EMPTY_SET;
                gr.G(set6);
                return set6;
            case 25:
                Set set7 = Collections.EMPTY_SET;
                gr.G(set7);
                return set7;
            case 26:
                Set set8 = Collections.EMPTY_SET;
                gr.G(set8);
                return set8;
            case 27:
                return new n80();
            case 28:
                return ti.INTERSTITIAL;
            default:
                return "interstitial";
        }
    }

    public ih(g80 g80Var) {
        this.f6490a = 20;
    }
}

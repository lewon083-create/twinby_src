package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yv implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns1 f12750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ns1 f12751c;

    public /* synthetic */ yv(ns1 ns1Var, ns1 ns1Var2, int i) {
        this.f12749a = i;
        this.f12750b = ns1Var;
        this.f12751c = ns1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f12749a) {
            case 0:
                return new xv((Context) this.f12750b.f8433a, (t9.e0) this.f12751c.f8433a);
            case 1:
                ExecutorService executorService = (ExecutorService) this.f12750b.f8433a;
                ux0 ux0Var = (ux0) this.f12751c.f8433a;
                String str = Build.VERSION.RELEASE;
                String str2 = Build.MODEL;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
                l7.o.t(sb2, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
                sb2.append(")");
                return new ey0(executorService, sb2.toString(), ux0Var.O());
            case 2:
                return new c21((Context) this.f12750b.f8433a, (ExecutorService) this.f12751c.f8433a);
            default:
                return new f21((Context) this.f12750b.f8433a, (ExecutorService) this.f12751c.f8433a);
        }
    }
}

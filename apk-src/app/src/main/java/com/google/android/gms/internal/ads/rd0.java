package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rd0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zd1 f9821c;

    public /* synthetic */ rd0(zd1 zd1Var, int i) {
        this.f9820b = i;
        this.f9821c = zd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9820b) {
            case 0:
                zd1 zd1Var = this.f9821c;
                wd0 wd0Var = ((sd0) zd1Var.f12972d).f10244a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) zd1Var.f12971c;
                wd0Var.getClass();
                if (!concurrentHashMap.isEmpty()) {
                    wd0Var.b(concurrentHashMap);
                    String strA = wd0Var.f11752f.a(concurrentHashMap);
                    t9.c0.m(strA);
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.f3218te)).booleanValue() || wd0Var.f11751e) {
                        wd0Var.f11749c.execute(new xd0(wd0Var, strA, 1));
                    }
                } else {
                    u9.i.c("Empty paramMap.");
                }
                break;
            case 1:
                zd1 zd1Var2 = this.f9821c;
                ((sd0) zd1Var2.f12972d).f10244a.a((ConcurrentHashMap) zd1Var2.f12971c, true);
                break;
            default:
                zd1 zd1Var3 = this.f9821c;
                ((sd0) zd1Var3.f12972d).f10244a.a((ConcurrentHashMap) zd1Var3.f12971c, false);
                break;
        }
    }
}

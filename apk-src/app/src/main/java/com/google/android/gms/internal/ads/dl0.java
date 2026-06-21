package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dl0 implements pn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4600b;

    public /* synthetic */ dl0(int i, Object obj) {
        this.f4599a = i;
        this.f4600b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        switch (this.f4599a) {
            case 0:
                return vv.d(new el0(t1.b.a((Context) this.f4600b, "com.google.android.gms.permission.AD_ID") == 0, 0));
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) this.f4600b).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return vv.d(new cn0(arrayList, 2));
            case 2:
                return vv.d(new el0(((iq0) this.f4600b).f6584q, 1));
            case 3:
                uo0 uo0Var = (uo0) this.f4600b;
                String str = null;
                if (uo0Var == null) {
                    return vv.d(new kl0(str, 2));
                }
                String str2 = uo0Var.f11034a;
                return ua.c.a(str2) ? vv.d(new kl0(str, 2)) : vv.d(new kl0(str2, 2));
            case 4:
                return vv.d(new ul0(1, (wp0) this.f4600b));
            case 5:
                return vv.d(new cn0((Bundle) this.f4600b, 0));
            default:
                return vv.K(vv.I(vv.d(new Bundle()), ((Long) q9.s.f31967e.f31970c.a(al.U4)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f4600b), u5.f10828o, hx.f6279a);
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        switch (this.f4599a) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 58;
            case 3:
                return 15;
            case 4:
                return 25;
            case 5:
                return 30;
            default:
                return 49;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tl0 implements pn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10658c;

    public /* synthetic */ tl0(int i, Object obj, Object obj2) {
        this.f10656a = i;
        this.f10657b = obj;
        this.f10658c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        switch (this.f10656a) {
            case 0:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.A3)).booleanValue()) {
                    return vv.d(new ul0(0, null));
                }
                bx bxVar = (bx) this.f10658c;
                return vv.K(bxVar.h(), u5.f10825l, (Executor) this.f10657b);
            case 1:
                return ((gx) ((r81) this.f10657b)).b(new ze(12, this));
            case 2:
                return ((gx) ((r81) this.f10657b)).b(new ze(18, this));
            case 3:
                t9.c0.m("HsdpMigrationSignal.produce");
                if (!((Boolean) q9.s.f31967e.f31970c.a(al.f2930ae)).booleanValue()) {
                    return vv.d(new tm0(null, 1));
                }
                boolean z5 = false;
                try {
                    if (((Intent) this.f10658c).resolveActivity(((Context) this.f10657b).getPackageManager()) != null) {
                        t9.c0.m("HSDP intent is supported");
                        z5 = true;
                    }
                } catch (Exception e3) {
                    p9.k.C.f31302h.d("HsdpMigrationSignal.isHsdpMigrationSupported", e3);
                }
                return vv.d(new tm0(Boolean.valueOf(z5), 1));
            case 4:
                return ((gx) ((r81) this.f10657b)).b(new ze(20, this));
            case 5:
                return ((gx) ((r81) this.f10657b)).b(new ze(22, this));
            case 6:
                n81 n81VarD = vv.d((String) this.f10658c);
                u5 u5Var = u5.f10827n;
                Executor executor = (Executor) this.f10657b;
                return vv.H(vv.K(n81VarD, u5Var, executor), Throwable.class, new np(11, this), executor);
            default:
                return ((gx) ((r81) this.f10657b)).b(new do0(1, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        switch (this.f10656a) {
            case 0:
                return 10;
            case 1:
                return 54;
            case 2:
                return 21;
            case 3:
                return 60;
            case 4:
                return 23;
            case 5:
                return 62;
            case 6:
                return 41;
            default:
                return 48;
        }
    }

    public tl0(u9.a aVar, r81 r81Var) {
        this.f10656a = 1;
        this.f10658c = aVar;
        this.f10657b = r81Var;
    }
}

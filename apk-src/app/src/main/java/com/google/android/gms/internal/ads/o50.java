package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o50 implements c31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8611d;

    public /* synthetic */ o50(Object obj, Object obj2, Object obj3, int i) {
        this.f8608a = i;
        this.f8609b = obj;
        this.f8610c = obj2;
        this.f8611d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.c31
    public final Object apply(Object obj) {
        switch (this.f8608a) {
            case 0:
                xp0 xp0Var = (xp0) obj;
                t9.i iVar = new t9.i((Context) this.f8609b);
                iVar.f33610c = xp0Var.B;
                iVar.f33613f = xp0Var.C.toString();
                iVar.f33612e = ((u9.a) this.f8610c).f34365b;
                iVar.f33611d = ((iq0) this.f8611d).f6575g;
                return iVar;
            case 1:
                sz szVar = (sz) this.f8609b;
                if (((xp0) this.f8610c).M) {
                    szVar.J0();
                }
                o10 o10Var = (o10) this.f8611d;
                szVar.n1();
                szVar.onPause();
                return o10Var.h0();
            case 2:
                sz szVar2 = (sz) this.f8609b;
                if (((xp0) this.f8610c).M) {
                    szVar2.J0();
                }
                v10 v10Var = (v10) this.f8611d;
                szVar2.n1();
                szVar2.onPause();
                return v10Var.h0();
            default:
                sz szVar3 = (sz) this.f8609b;
                if (((xp0) this.f8610c).M) {
                    szVar3.J0();
                }
                y10 y10Var = (y10) this.f8611d;
                szVar3.n1();
                szVar3.onPause();
                return y10Var.h0();
        }
    }
}

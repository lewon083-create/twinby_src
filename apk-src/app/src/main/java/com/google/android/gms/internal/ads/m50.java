package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m50 implements q70, z80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iq0 f7779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u9.a f7780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t9.e0 f7781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final se0 f7782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bs0 f7783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ff0 f7784h;

    public m50(Context context, iq0 iq0Var, u9.a aVar, t9.e0 e0Var, se0 se0Var, bs0 bs0Var, ff0 ff0Var) {
        this.f7778b = context;
        this.f7779c = iq0Var;
        this.f7780d = aVar;
        this.f7781e = e0Var;
        this.f7782f = se0Var;
        this.f7783g = bs0Var;
        this.f7784h = ff0Var;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void E(ku kuVar) {
        b();
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void a(aa.t tVar) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.K4)).booleanValue()) {
            b();
        }
    }

    public final void b() {
        String str;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.J4)).booleanValue()) {
            String str2 = this.f7779c.f6575g;
            yw ywVarN = this.f7781e.n();
            com.google.android.gms.ads.identifier.c cVar = p9.k.C.f31305l;
            boolean zF = this.f7784h.f();
            if (ywVarN != null) {
                cVar.getClass();
                str = ywVarN.f12769d;
            } else {
                str = null;
            }
            cVar.f0(this.f7778b, this.f7780d, false, ywVarN, str, str2, null, this.f7783g, null, null, zF);
        }
        this.f7782f.a();
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void D(String str) {
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void l(eq0 eq0Var) {
    }
}

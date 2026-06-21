package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y40 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oq0 f12492b;

    public /* synthetic */ y40(oq0 oq0Var, int i) {
        this.f12491a = i;
        this.f12492b = oq0Var;
    }

    public xp0 a() {
        xp0 xp0Var = (xp0) this.f12492b.f8763d;
        gr.G(xp0Var);
        return xp0Var;
    }

    public eq0 b() {
        eq0 eq0Var = (eq0) this.f12492b.f8762c;
        gr.G(eq0Var);
        return eq0Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f12491a) {
            case 0:
                xp0 xp0Var = (xp0) this.f12492b.f8763d;
                gr.G(xp0Var);
                return xp0Var;
            case 1:
                return (String) this.f12492b.f8764e;
            case 2:
                return this.f12492b.s();
            default:
                eq0 eq0Var = (eq0) this.f12492b.f8762c;
                gr.G(eq0Var);
                return eq0Var;
        }
    }
}

package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f13190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f13191b;

    public d1(o1 o1Var, i0 i0Var, b0 b0Var) {
        this.f13191b = o1Var;
        this.f13190a = b0Var;
    }

    @Override // com.google.android.gms.internal.auth.k1
    public final boolean a(l0 l0Var, l0 l0Var2) {
        this.f13191b.getClass();
        return l0Var.zzc.equals(l0Var2.zzc);
    }

    @Override // com.google.android.gms.internal.auth.k1
    public final void b(Object obj, byte[] bArr, int i, int i10, a4.g gVar) {
        l0 l0Var = (l0) obj;
        if (l0Var.zzc == n1.f13263e) {
            l0Var.zzc = n1.a();
        }
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.auth.k1
    public final int c(l0 l0Var) {
        this.f13191b.getClass();
        return l0Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.auth.k1
    public final void d(Object obj) {
        this.f13191b.getClass();
        n1 n1Var = ((l0) obj).zzc;
        if (n1Var.f13267d) {
            n1Var.f13267d = false;
        }
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.auth.k1
    public final void e(Object obj, Object obj2) {
        l1.a(this.f13191b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.k1
    public final boolean f(Object obj) {
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.auth.k1
    public final l0 g() {
        b0 b0Var = this.f13190a;
        return b0Var instanceof l0 ? ((l0) b0Var).b() : ((y1) ((l0) b0Var).h(5)).a();
    }
}

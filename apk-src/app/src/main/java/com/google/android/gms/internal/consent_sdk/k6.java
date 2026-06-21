package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k6 implements p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5 f13449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v6 f13450b;

    public k6(v6 v6Var, f5 f5Var) {
        m4 m4Var = o5.f13506a;
        this.f13450b = v6Var;
        this.f13449a = f5Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.p6
    public final void a(Object obj) {
        this.f13450b.getClass();
        u6 u6Var = ((t5) obj).zzc;
        if (u6Var.f13591d) {
            u6Var.f13591d = false;
        }
        m4 m4Var = o5.f13506a;
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.p6
    public final int b(t5 t5Var) {
        t5Var.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.consent_sdk.p6
    public final boolean c(t5 t5Var, t5 t5Var2) {
        return t5Var.zzc.equals(t5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.consent_sdk.p6
    public final void d(Object obj, d6 d6Var) {
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.p6
    public final void e(Object obj, Object obj2) {
        q6.o(obj, obj2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.p6
    public final int f(f5 f5Var) {
        u6 u6Var = ((t5) f5Var).zzc;
        int i = u6Var.f13590c;
        if (i != -1) {
            return i;
        }
        u6Var.f13590c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.p6
    public final boolean g(Object obj) {
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.p6
    public final t5 l() {
        f5 f5Var = this.f13449a;
        return f5Var instanceof t5 ? (t5) ((t5) f5Var).f(4) : ((s5) ((t5) f5Var).f(5)).b();
    }
}

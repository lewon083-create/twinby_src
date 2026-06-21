package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q31 implements o31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t31 f9324b = new t31();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile o31 f9325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9326d;

    public q31(o31 o31Var) {
        this.f9325c = o31Var;
    }

    @Override // com.google.android.gms.internal.ads.o31
    /* JADX INFO: renamed from: h */
    public final Object mo8h() {
        o31 o31Var = this.f9325c;
        mp0 mp0Var = mp0.f7968f;
        if (o31Var != mp0Var) {
            synchronized (this.f9324b) {
                try {
                    if (this.f9325c != mp0Var) {
                        Object objMo8h = this.f9325c.mo8h();
                        this.f9326d = objMo8h;
                        this.f9325c = mp0Var;
                        return objMo8h;
                    }
                } finally {
                }
            }
        }
        return this.f9326d;
    }

    public final String toString() {
        Object objG = this.f9325c;
        if (objG == mp0.f7968f) {
            String strValueOf = String.valueOf(this.f9326d);
            objG = t.z.g(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String strValueOf2 = String.valueOf(objG);
        return t.z.g(new StringBuilder(strValueOf2.length() + 19), "Suppliers.memoize(", strValueOf2, ")");
    }
}

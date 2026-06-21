package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f8151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f8152b;

    public n2(p2 p2Var, p2 p2Var2) {
        this.f8151a = p2Var;
        this.f8152b = p2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n2.class == obj.getClass()) {
            n2 n2Var = (n2) obj;
            if (this.f8151a.equals(n2Var.f8151a) && this.f8152b.equals(n2Var.f8152b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8152b.hashCode() + (this.f8151a.hashCode() * 31);
    }

    public final String toString() {
        p2 p2Var = this.f8151a;
        String string = p2Var.toString();
        p2 p2Var2 = this.f8152b;
        String strConcat = p2Var.equals(p2Var2) ? "" : ", ".concat(p2Var2.toString());
        return om1.n(new StringBuilder(pe.a.b(string.length() + 1, 1, strConcat)), "[", string, strConcat, "]");
    }
}

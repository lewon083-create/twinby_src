package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j31 extends f31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6700b;

    public j31(Object obj) {
        this.f6700b = obj;
    }

    @Override // com.google.android.gms.internal.ads.f31
    public final Object a() {
        return this.f6700b;
    }

    @Override // com.google.android.gms.internal.ads.f31
    public final f31 b(c31 c31Var) {
        Object objApply = c31Var.apply(this.f6700b);
        ix.m0(objApply, "the Function passed to Optional.transform() must not return null.");
        return new j31(objApply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j31) {
            return this.f6700b.equals(((j31) obj).f6700b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6700b.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.f6700b.toString();
        return t.z.g(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }
}

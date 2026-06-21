package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends q0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p0 f14276d = new p0(u.f14324d, u.f14323c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f14277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f14278c;

    public p0(v vVar, v vVar2) {
        this.f14277b = vVar;
        this.f14278c = vVar2;
        if (vVar.a(vVar2) > 0 || vVar == u.f14323c || vVar2 == u.f14324d) {
            StringBuilder sb2 = new StringBuilder(16);
            vVar.b(sb2);
            sb2.append("..");
            vVar2.c(sb2);
            throw new IllegalArgumentException("Invalid range: ".concat(sb2.toString()));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f14277b.equals(p0Var.f14277b) && this.f14278c.equals(p0Var.f14278c);
    }

    public final int hashCode() {
        return this.f14278c.hashCode() + (this.f14277b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(16);
        this.f14277b.b(sb2);
        sb2.append("..");
        this.f14278c.c(sb2);
        return sb2.toString();
    }
}

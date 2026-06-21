package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13290b;

    public v(Object obj) {
        this.f13290b = obj;
    }

    @Override // com.google.android.gms.internal.auth.u
    public final Object a() {
        return this.f13290b;
    }

    @Override // com.google.android.gms.internal.auth.u
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f13290b.equals(((v) obj).f13290b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13290b.hashCode() + 1502476572;
    }

    public final String toString() {
        return pe.a.f("Optional.of(", this.f13290b.toString(), ")");
    }
}

package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg f36622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f31 f36624c;

    public a31(tg tgVar, String str, f31 f31Var) {
        this.f36622a = tgVar;
        this.f36623b = str;
        this.f36624c = f31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a31)) {
            return false;
        }
        a31 a31Var = (a31) obj;
        return Intrinsics.a(this.f36622a, a31Var.f36622a) && Intrinsics.a(this.f36623b, a31Var.f36623b) && this.f36624c == a31Var.f36624c;
    }

    public final int hashCode() {
        return this.f36624c.hashCode() + k4.a(this.f36623b, this.f36622a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Identifiers(appMetricaIdentifiers=" + this.f36622a + ", mauid=" + this.f36623b + ", identifiersType=" + this.f36624c + ")";
    }
}

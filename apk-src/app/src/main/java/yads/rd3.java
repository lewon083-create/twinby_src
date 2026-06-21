package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rd3 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42559d;

    public rd3(int i, int i10, int i11) {
        this.f42557b = i;
        this.f42558c = i10;
        this.f42559d = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(rd3 rd3Var) {
        int i = this.f42557b;
        int i10 = rd3Var.f42557b;
        if (i != i10) {
            return Intrinsics.d(i, i10);
        }
        int i11 = this.f42558c;
        int i12 = rd3Var.f42558c;
        return i11 != i12 ? Intrinsics.d(i11, i12) : Intrinsics.d(this.f42559d, rd3Var.f42559d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd3)) {
            return false;
        }
        rd3 rd3Var = (rd3) obj;
        return this.f42557b == rd3Var.f42557b && this.f42558c == rd3Var.f42558c && this.f42559d == rd3Var.f42559d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42559d) + qd3.a(this.f42558c, Integer.hashCode(this.f42557b) * 31, 31);
    }

    public final String toString() {
        return this.f42557b + "." + this.f42558c + "." + this.f42559d;
    }
}

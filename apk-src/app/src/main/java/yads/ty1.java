package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ty1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12 f43486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f43487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4 f43488c;

    public ty1(v9 v9Var, d4 d4Var, f12 f12Var) {
        this.f43486a = f12Var;
        this.f43487b = v9Var;
        this.f43488c = d4Var;
    }

    public final d4 a() {
        return this.f43488c;
    }

    public final v9 b() {
        return this.f43487b;
    }

    public final f12 c() {
        return this.f43486a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty1)) {
            return false;
        }
        ty1 ty1Var = (ty1) obj;
        return Intrinsics.a(this.f43486a, ty1Var.f43486a) && Intrinsics.a(this.f43487b, ty1Var.f43487b) && Intrinsics.a(this.f43488c, ty1Var.f43488c);
    }

    public final int hashCode() {
        return this.f43488c.hashCode() + ((this.f43487b.hashCode() + (this.f43486a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdBlock(nativeAdResponse=" + this.f43486a + ", adResponse=" + this.f43487b + ", adConfiguration=" + this.f43488c + ")";
    }
}

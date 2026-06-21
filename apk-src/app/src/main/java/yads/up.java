package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class up {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty1 f43748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l52 f43749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o72 f43750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m72 f43751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zz1 f43752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h32 f43753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v12 f43754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nu2 f43755h;
    public final hy1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final va f43756j;

    public up(ty1 ty1Var, m12 m12Var, o72 o72Var, m72 m72Var, zz1 zz1Var, h32 h32Var, v12 v12Var, nu2 nu2Var, hy1 hy1Var, va vaVar) {
        this.f43748a = ty1Var;
        this.f43749b = m12Var;
        this.f43750c = o72Var;
        this.f43751d = m72Var;
        this.f43752e = zz1Var;
        this.f43753f = h32Var;
        this.f43754g = v12Var;
        this.f43755h = nu2Var;
        this.i = hy1Var;
        this.f43756j = vaVar;
    }

    public final va a() {
        return this.f43756j;
    }

    public final v12 b() {
        return this.f43754g;
    }

    public final h32 c() {
        return this.f43753f;
    }

    public final ty1 d() {
        return this.f43748a;
    }

    public final zz1 e() {
        return this.f43752e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up)) {
            return false;
        }
        up upVar = (up) obj;
        return Intrinsics.a(this.f43748a, upVar.f43748a) && Intrinsics.a(this.f43749b, upVar.f43749b) && Intrinsics.a(this.f43750c, upVar.f43750c) && Intrinsics.a(this.f43751d, upVar.f43751d) && Intrinsics.a(this.f43752e, upVar.f43752e) && Intrinsics.a(this.f43753f, upVar.f43753f) && Intrinsics.a(this.f43754g, upVar.f43754g) && Intrinsics.a(this.f43755h, upVar.f43755h) && Intrinsics.a(this.i, upVar.i) && this.f43756j == upVar.f43756j;
    }

    public final hy1 f() {
        return this.i;
    }

    public final l52 g() {
        return this.f43749b;
    }

    public final m72 h() {
        return this.f43751d;
    }

    public final int hashCode() {
        int iHashCode = (this.f43755h.hashCode() + ((this.f43754g.hashCode() + ((this.f43753f.hashCode() + ((this.f43752e.hashCode() + ((this.f43751d.hashCode() + ((this.f43750c.hashCode() + ((this.f43749b.hashCode() + (this.f43748a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        hy1 hy1Var = this.i;
        return this.f43756j.hashCode() + ((iHashCode + (hy1Var == null ? 0 : hy1Var.hashCode())) * 31);
    }

    public final o72 i() {
        return this.f43750c;
    }

    public final nu2 j() {
        return this.f43755h;
    }

    public final String toString() {
        return "BinderConfiguration(nativeAdBlock=" + this.f43748a + ", nativeValidator=" + this.f43749b + ", nativeVisualBlock=" + this.f43750c + ", nativeViewRenderer=" + this.f43751d + ", nativeAdFactoriesProvider=" + this.f43752e + ", forceImpressionConfigurator=" + this.f43753f + ", adViewRenderingValidator=" + this.f43754g + ", sdkEnvironmentModule=" + this.f43755h + ", nativeData=" + this.i + ", adStructureType=" + this.f43756j + ")";
    }
}

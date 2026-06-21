package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h4 extends lm3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f39016d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m4 f39017c;

    public h4(m4 m4Var, h82 h82Var) {
        super(h82Var);
        this.f39017c = m4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type com.monetization.ads.base.AdFetchError");
        return this.f39017c == ((h4) obj).f39017c;
    }

    public final int hashCode() {
        return this.f39017c.hashCode();
    }
}

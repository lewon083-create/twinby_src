package d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends a6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f15476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15477b;

    public t(androidx.lifecycle.u uVar, s callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f15476a = callback;
        this.f15477b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.a(this.f15476a, tVar.f15476a) && this.f15477b.equals(tVar.f15477b);
    }

    public final int hashCode() {
        return this.f15477b.hashCode() + (this.f15476a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f15476a + ", owner=" + this.f15477b + ')';
    }
}

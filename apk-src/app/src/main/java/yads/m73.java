package yads;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f40837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f83 f40838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ub3 f40839c;

    public m73(WeakReference weakReference, f83 f83Var, ub3 ub3Var) {
        this.f40837a = weakReference;
        this.f40838b = f83Var;
        this.f40839c = ub3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m73)) {
            return false;
        }
        m73 m73Var = (m73) obj;
        return Intrinsics.a(this.f40837a, m73Var.f40837a) && Intrinsics.a(this.f40838b, m73Var.f40838b) && Intrinsics.a(this.f40839c, m73Var.f40839c);
    }

    public final int hashCode() {
        return this.f40839c.f43629a.hashCode() + ((this.f40838b.hashCode() + (this.f40837a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TrackNoticeObject(manager=" + this.f40837a + ", notice=" + this.f40838b + ", validationResult=" + this.f40839c + ")";
    }
}

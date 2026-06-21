package wk;

import ij.d0;
import ij.s;
import ij.w;
import ij.z;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import uk.d1;
import uk.g1;
import uk.j1;
import uk.m1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f35315a;

    static {
        Intrinsics.checkNotNullParameter(w.f21359c, "<this>");
        Intrinsics.checkNotNullParameter(z.f21362c, "<this>");
        Intrinsics.checkNotNullParameter(s.f21353c, "<this>");
        Intrinsics.checkNotNullParameter(d0.f21332c, "<this>");
        sk.f[] elements = {g1.f34524b, j1.f34536b, d1.f34506b, m1.f34551b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f35315a = kotlin.collections.p.w(elements);
    }

    public static final boolean a(sk.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.isInline() && f35315a.contains(fVar);
    }
}

package t;

import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import g0.x2;
import g0.z2;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0.g f32957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jj.i f32958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jj.i f32959c;

    static {
        Class cls = Long.TYPE;
        Intrinsics.b(cls);
        g0.g gVar = new g0.g("camera2.streamSpec.streamUseCase", cls, null);
        Intrinsics.checkNotNullExpressionValue(gVar, "create(...)");
        f32957a = gVar;
        jj.i builder = new jj.i();
        int i = Build.VERSION.SDK_INT;
        z2 z2Var = z2.f19815e;
        z2 z2Var2 = z2.f19812b;
        z2 z2Var3 = z2.f19813c;
        if (i >= 33) {
            z2 z2Var4 = z2.f19817g;
            z2 z2Var5 = z2.f19814d;
            z2[] elements = {z2Var3, z2Var4, z2Var5};
            Intrinsics.checkNotNullParameter(elements, "elements");
            builder.put(4L, kotlin.collections.p.w(elements));
            z2[] elements2 = {z2Var3, z2Var4, z2Var5};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            builder.put(1L, kotlin.collections.p.w(elements2));
            builder.put(2L, kotlin.collections.o0.b(z2Var2));
            builder.put(3L, kotlin.collections.o0.b(z2Var));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        f32958b = builder.b();
        jj.i builder2 = new jj.i();
        if (i >= 33) {
            z2[] elements3 = {z2Var3, z2Var2, z2Var};
            Intrinsics.checkNotNullParameter(elements3, "elements");
            builder2.put(4L, kotlin.collections.p.w(elements3));
            z2[] elements4 = {z2Var3, z2Var};
            Intrinsics.checkNotNullParameter(elements4, "elements");
            builder2.put(3L, kotlin.collections.p.w(elements4));
        }
        Intrinsics.checkNotNullParameter(builder2, "builder");
        f32959c = builder2.b();
    }

    public static s.b a(g0.v0 v0Var, Long l10) {
        g0.g gVar = f32957a;
        if (v0Var.h(gVar) && Intrinsics.a(v0Var.a(gVar), l10)) {
            return null;
        }
        g0.q1 q1VarW = g0.q1.w(v0Var);
        Intrinsics.checkNotNullExpressionValue(q1VarW, "from(...)");
        q1VarW.y(gVar, l10);
        return new s.b(q1VarW);
    }

    public static boolean b(z2 z2Var, long j10, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (z2Var != z2.f19816f) {
            Long lValueOf = Long.valueOf(j10);
            jj.i iVar = f32958b;
            if (!iVar.containsKey(lValueOf)) {
                return false;
            }
            Object obj = iVar.get(Long.valueOf(j10));
            Intrinsics.b(obj);
            return ((Set) obj).contains(z2Var);
        }
        Long lValueOf2 = Long.valueOf(j10);
        jj.i iVar2 = f32959c;
        if (!iVar2.containsKey(lValueOf2)) {
            return false;
        }
        Object obj2 = iVar2.get(Long.valueOf(j10));
        Intrinsics.b(obj2);
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((z2) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(g0.v0 v0Var, z2 z2Var) {
        Object objG = v0Var.g(x2.A, Boolean.FALSE);
        Intrinsics.b(objG);
        if (((Boolean) objG).booleanValue()) {
            return false;
        }
        g0.g gVar = g0.g1.M;
        if (!v0Var.h(gVar)) {
            return false;
        }
        Object objA = v0Var.a(gVar);
        Intrinsics.b(objA);
        int iIntValue = ((Number) objA).intValue();
        int iOrdinal = z2Var.ordinal();
        if (iOrdinal == 0) {
            return iIntValue == 2;
        }
        if (iOrdinal != 3) {
            return false;
        }
        w.a.f34941a.i(PreviewUnderExposureQuirk.class);
        return false;
    }
}

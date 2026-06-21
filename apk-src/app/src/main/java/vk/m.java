package vk;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j0;
import uk.a1;
import uk.o0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uk.a0 f34887a;

    static {
        com.google.android.gms.internal.auth.g.D(j0.f27517a);
        f34887a = o0.a("kotlinx.serialization.json.JsonUnquotedLiteral", a1.f34493a);
    }

    public static final b0 a(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        b0 b0Var = lVar instanceof b0 ? (b0) lVar : null;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalArgumentException("Element " + g0.a(lVar.getClass()) + " is not a JsonPrimitive");
    }
}

package kotlin.jvm.internal;

import com.google.android.gms.internal.measurement.h5;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements dk.c, g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final h f27512c = new h(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f27513d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f27514b;

    static {
        List listF = kotlin.collections.s.f(Function0.class, Function1.class, Function2.class, wj.n.class, wj.o.class, wj.p.class, wj.q.class, wj.r.class, wj.s.class, wj.t.class, wj.a.class, wj.b.class, wj.c.class, wj.d.class, wj.e.class, wj.f.class, wj.g.class, wj.h.class, wj.i.class, wj.j.class, wj.k.class, wj.l.class, wj.m.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(listF, 10));
        int i = 0;
        for (Object obj : listF) {
            int i10 = i + 1;
            if (i < 0) {
                kotlin.collections.s.i();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i10;
        }
        f27513d = kotlin.collections.j0.k(arrayList);
    }

    public i(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f27514b = jClass;
    }

    @Override // kotlin.jvm.internal.g
    public final Class a() {
        return this.f27514b;
    }

    public final String b() {
        f27512c.getClass();
        Class jClass = this.f27514b;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String name = jClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String strA = h.a(name);
            return strA == null ? jClass.getCanonicalName() : strA;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive()) {
            String name2 = componentType.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            String strA2 = h.a(name2);
            if (strA2 != null) {
                strConcat = strA2.concat("Array");
            }
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String d() {
        f27512c.getClass();
        Class jClass = this.f27514b;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String name = jClass.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                String strB = h.b(name);
                return strB == null ? jClass.getSimpleName() : strB;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive()) {
                String name2 = componentType.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                String strB2 = h.b(name2);
                if (strB2 != null) {
                    strConcat = strB2.concat("Array");
                }
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            String strM = StringsKt.M(simpleName, enclosingMethod.getName() + '$', simpleName);
            if (strM != null) {
                return strM;
            }
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return StringsKt.L('$', simpleName, simpleName);
        }
        return StringsKt.M(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean e(Object obj) {
        f27512c.getClass();
        Class jClass = this.f27514b;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Map map = f27513d;
        Intrinsics.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return k0.c(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            Intrinsics.checkNotNullParameter(jClass, "<this>");
            jClass = h5.u(g0.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i) && h5.u(this).equals(h5.u((dk.c) obj));
    }

    public final int hashCode() {
        return h5.u(this).hashCode();
    }

    public final String toString() {
        return this.f27514b + " (Kotlin reflection is not available)";
    }
}

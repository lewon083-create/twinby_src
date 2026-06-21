package vk;

import d8.e0;
import kotlin.jvm.internal.Intrinsics;
import t.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f34872d = new b(new hi.h(false, true, "    ", "type", true, a.f34870c), xk.a.f36264a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi.h f34873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f34874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m4.d f34875c = new m4.d(20);

    public c(hi.h hVar, t0 t0Var) {
        this.f34873a = hVar;
        this.f34874b = t0Var;
    }

    public final Object a(String source, qk.a deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(source, "string");
        Intrinsics.checkNotNullParameter(this, "json");
        Intrinsics.checkNotNullParameter(source, "source");
        d1.b bVar = new d1.b(source);
        Object objW = new wk.n(this, wk.r.f35318d, bVar, deserializer.getDescriptor(), null).w(deserializer);
        if (bVar.h() == 10) {
            return objW;
        }
        d1.b.q(bVar, "Expected EOF after parsing, but had " + bVar.u().charAt(bVar.f15507c - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(qk.a serializer, Object obj) {
        char[] cArr;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        e0 e0Var = new e0(16, (byte) 0);
        wk.b bVar = wk.b.f35279c;
        synchronized (bVar) {
            kotlin.collections.l lVar = (kotlin.collections.l) bVar.f1433b;
            cArr = null;
            char[] cArr2 = (char[]) (lVar.isEmpty() ? null : lVar.removeLast());
            if (cArr2 != null) {
                bVar.f1432a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        e0Var.f15621d = cArr;
        try {
            wk.j.f(this, e0Var, serializer, obj);
            String string = e0Var.toString();
            char[] array = (char[]) e0Var.f15621d;
            Intrinsics.checkNotNullParameter(array, "array");
            bVar.x(array);
            return string;
        } catch (Throwable th2) {
            wk.b bVar2 = wk.b.f35279c;
            char[] array2 = (char[]) e0Var.f15621d;
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(array2, "array");
            bVar2.x(array2);
            throw th2;
        }
    }
}

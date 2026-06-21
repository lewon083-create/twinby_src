package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f1519c = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1521b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f1520a = new l0();

    public final c1 a(Class cls) {
        c1 c1VarW;
        Class cls2;
        c0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1521b;
        c1 c1Var = (c1) concurrentHashMap.get(cls);
        if (c1Var != null) {
            return c1Var;
        }
        l0 l0Var = this.f1520a;
        l0Var.getClass();
        Class cls3 = d1.f1370a;
        if (!z.class.isAssignableFrom(cls) && (cls2 = d1.f1370a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        b1 b1VarA = ((k0) l0Var.f1440a).a(cls);
        int i = b1VarA.f1365d;
        a aVar = b1VarA.f1362a;
        if ((i & 2) == 2) {
            if (z.class.isAssignableFrom(cls)) {
                c1VarW = new u0(d1.f1372c, s.f1469a, aVar);
            } else {
                k1 k1Var = d1.f1371b;
                r rVar = s.f1470b;
                if (rVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c1VarW = new u0(k1Var, rVar, aVar);
            }
        } else if (z.class.isAssignableFrom(cls)) {
            r rVar2 = null;
            v0 v0Var = w0.f1501b;
            h0 h0Var = i0.f1418b;
            k1 k1Var2 = d1.f1372c;
            if (t.z.m(b1VarA.a()) != 1) {
                rVar2 = s.f1469a;
            }
            r rVar3 = rVar2;
            p0 p0Var = q0.f1467b;
            if (!(b1VarA instanceof b1)) {
                int[] iArr = t0.f1476n;
                b1VarA.getClass();
                throw new ClassCastException();
            }
            c1VarW = t0.w(b1VarA, v0Var, h0Var, k1Var2, rVar3, p0Var);
        } else {
            r rVar4 = null;
            v0 v0Var2 = w0.f1500a;
            h0 h0Var2 = i0.f1417a;
            k1 k1Var3 = d1.f1371b;
            if (t.z.m(b1VarA.a()) != 1 && (rVar4 = s.f1470b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            r rVar5 = rVar4;
            p0 p0Var2 = q0.f1466a;
            if (!(b1VarA instanceof b1)) {
                int[] iArr2 = t0.f1476n;
                b1VarA.getClass();
                throw new ClassCastException();
            }
            c1VarW = t0.w(b1VarA, v0Var2, h0Var2, k1Var3, rVar5, p0Var2);
        }
        c1 c1Var2 = (c1) concurrentHashMap.putIfAbsent(cls, c1VarW);
        return c1Var2 != null ? c1Var2 : c1VarW;
    }
}

package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, z> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected j1 unknownFields;

    public z() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = j1.f1426f;
    }

    public static z d(Class cls) {
        z zVar = defaultInstanceMap.get(cls);
        if (zVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = (z) ((z) p1.d(cls)).c(6);
        if (zVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, zVar2);
        return zVar2;
    }

    public static Object e(Method method, z zVar, Object... objArr) {
        try {
            return method.invoke(zVar, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(z zVar, boolean z5) {
        byte bByteValue = ((Byte) zVar.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        z0 z0Var = z0.f1519c;
        z0Var.getClass();
        boolean zD = z0Var.a(zVar.getClass()).d(zVar);
        if (z5) {
            zVar.c(2);
        }
        return zD;
    }

    public static void j(Class cls, z zVar) {
        zVar.h();
        defaultInstanceMap.put(cls, zVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(c1 c1Var) {
        int iE;
        int iE2;
        if (g()) {
            if (c1Var == null) {
                z0 z0Var = z0.f1519c;
                z0Var.getClass();
                iE2 = z0Var.a(getClass()).e(this);
            } else {
                iE2 = c1Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(l7.o.i(iE2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (c1Var == null) {
            z0 z0Var2 = z0.f1519c;
            z0Var2.getClass();
            iE = z0Var2.a(getClass()).e(this);
        } else {
            iE = c1Var.e(this);
        }
        k(iE);
        return iE;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(n nVar) {
        z0 z0Var = z0.f1519c;
        z0Var.getClass();
        c1 c1VarA = z0Var.a(getClass());
        l0 l0Var = nVar.f1447a;
        if (l0Var == null) {
            l0Var = new l0(nVar);
        }
        c1VarA.b(this, l0Var);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z0 z0Var = z0.f1519c;
        z0Var.getClass();
        return z0Var.a(getClass()).g(this, (z) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            z0 z0Var = z0.f1519c;
            z0Var.getClass();
            return z0Var.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            z0 z0Var2 = z0.f1519c;
            z0Var2.getClass();
            this.memoizedHashCode = z0Var2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final z i() {
        return (z) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            throw new IllegalStateException(l7.o.i(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = s0.f1471a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        s0.c(this, sb2, 0);
        return sb2.toString();
    }
}

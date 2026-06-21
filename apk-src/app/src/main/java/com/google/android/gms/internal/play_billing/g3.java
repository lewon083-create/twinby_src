package com.google.android.gms.internal.play_billing;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g3 extends q2 {
    private static final Map zzb = new ConcurrentHashMap();
    protected j4 zzc;
    private int zzd;

    public g3() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = j4.f14219f;
    }

    public static g3 h(Class cls) {
        Map map = zzb;
        g3 g3Var = (g3) map.get(cls);
        if (g3Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                g3Var = (g3) map.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (g3Var != null) {
            return g3Var;
        }
        g3 g3Var2 = (g3) ((g3) o4.g(cls)).d(6);
        if (g3Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, g3Var2);
        return g3Var2;
    }

    public static Object i(Method method, g3 g3Var, Object... objArr) {
        try {
            return method.invoke(g3Var, objArr);
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

    public static void k(Class cls, g3 g3Var) {
        g3Var.j();
        zzb.put(cls, g3Var);
    }

    public static final boolean m(g3 g3Var, boolean z5) {
        byte bByteValue = ((Byte) g3Var.d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = c4.f14151c.a(g3Var.getClass()).a(g3Var);
        if (z5) {
            g3Var.d(2);
        }
        return zA;
    }

    @Override // com.google.android.gms.internal.play_billing.q2
    public final int a(f4 f4Var) {
        if (c()) {
            int iC = f4Var.c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException(l7.o.i(iC, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iC2 = f4Var.c(this);
        if (iC2 < 0) {
            throw new IllegalStateException(l7.o.i(iC2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) | iC2;
        return iC2;
    }

    public final boolean c() {
        return (this.zzd & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0;
    }

    public abstract Object d(int i);

    public final int e() {
        if (c()) {
            int iC = c4.f14151c.a(getClass()).c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException(l7.o.i(iC, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iC2 = c4.f14151c.a(getClass()).c(this);
        if (iC2 < 0) {
            throw new IllegalStateException(l7.o.i(iC2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) | iC2;
        return iC2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return c4.f14151c.a(getClass()).g(this, (g3) obj);
    }

    public final f3 f() {
        return (f3) d(5);
    }

    public final f3 g() {
        f3 f3Var = (f3) d(5);
        if (!f3Var.f14183b.equals(this)) {
            if (!f3Var.f14184c.c()) {
                g3 g3Var = (g3) f3Var.f14183b.d(4);
                c4.f14151c.a(g3Var.getClass()).d(g3Var, f3Var.f14184c);
                f3Var.f14184c = g3Var;
            }
            g3 g3Var2 = f3Var.f14184c;
            c4.f14151c.a(g3Var2.getClass()).d(g3Var2, this);
        }
        return f3Var;
    }

    public final int hashCode() {
        if (c()) {
            return c4.f14151c.a(getClass()).f(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iF = c4.f14151c.a(getClass()).f(this);
        this.zza = iF;
        return iF;
    }

    public final void j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void l() {
        this.zzd = (this.zzd & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) | Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = x3.f14369a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        x3.c(this, sb2, 0);
        return sb2.toString();
    }
}

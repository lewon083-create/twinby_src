package com.google.android.gms.internal.measurement;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k5 extends t4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected q6 zzc;

    public k5() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = q6.f13926f;
    }

    public static k5 l(Class cls) {
        Map map = zzd;
        k5 k5Var = (k5) map.get(cls);
        if (k5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                k5Var = (k5) map.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (k5Var != null) {
            return k5Var;
        }
        k5 k5Var2 = (k5) ((k5) v6.e(cls)).o(6);
        if (k5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, k5Var2);
        return k5Var2;
    }

    public static void m(Class cls, k5 k5Var) {
        k5Var.f();
        zzd.put(cls, k5Var);
    }

    public static Object n(Method method, k5 k5Var, Object... objArr) {
        try {
            return method.invoke(k5Var, objArr);
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

    @Override // com.google.android.gms.internal.measurement.t4
    public final int b(m6 m6Var) {
        if (e()) {
            int iC = m6Var.c(this);
            if (iC >= 0) {
                return iC;
            }
            StringBuilder sb2 = new StringBuilder(pe.a.a(iC, 42));
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iC);
            throw new IllegalStateException(sb2.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iC2 = m6Var.c(this);
        if (iC2 >= 0) {
            this.zzb = (this.zzb & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) | iC2;
            return iC2;
        }
        StringBuilder sb3 = new StringBuilder(pe.a.a(iC2, 42));
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iC2);
        throw new IllegalStateException(sb3.toString());
    }

    public final void d(a5 a5Var) {
        m6 m6VarA = j6.f13841c.a(getClass());
        z5 z5Var = a5Var.f13654c;
        if (z5Var == null) {
            z5Var = new z5(a5Var);
        }
        m6VarA.d(this, z5Var);
    }

    public final boolean e() {
        return (this.zzb & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return j6.f13841c.a(getClass()).e(this, (k5) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final void g() {
        j6.f13841c.a(getClass()).f(this);
        f();
    }

    public final j5 h() {
        return (j5) o(5);
    }

    public final int hashCode() {
        if (e()) {
            return j6.f13841c.a(getClass()).i(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int i10 = j6.f13841c.a(getClass()).i(this);
        this.zza = i10;
        return i10;
    }

    public final j5 i() {
        j5 j5Var = (j5) o(5);
        j5Var.f(this);
        return j5Var;
    }

    public final void j() {
        this.zzb = (this.zzb & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int iC = j6.f13841c.a(getClass()).c(this);
            if (iC >= 0) {
                return iC;
            }
            StringBuilder sb2 = new StringBuilder(pe.a.a(iC, 42));
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iC);
            throw new IllegalStateException(sb2.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iC2 = j6.f13841c.a(getClass()).c(this);
        if (iC2 >= 0) {
            this.zzb = (this.zzb & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) | iC2;
            return iC2;
        }
        StringBuilder sb3 = new StringBuilder(pe.a.a(iC2, 42));
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iC2);
        throw new IllegalStateException(sb3.toString());
    }

    public abstract Object o(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = e6.f13718a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        e6.b(this, sb2, 0);
        return sb2.toString();
    }
}

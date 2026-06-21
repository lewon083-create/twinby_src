package com.google.android.gms.internal.consent_sdk;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t5 extends f5 {
    private static final Map zzb = new ConcurrentHashMap();
    protected u6 zzc;
    private int zzd;

    public t5() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = u6.f13587e;
    }

    public static t5 h(Class cls) {
        Map map = zzb;
        t5 t5Var = (t5) map.get(cls);
        if (t5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t5Var = (t5) map.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (t5Var != null) {
            return t5Var;
        }
        t5 t5Var2 = (t5) ((t5) a7.g(cls)).f(6);
        if (t5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, t5Var2);
        return t5Var2;
    }

    public static Object i(Method method, t5 t5Var, Object... objArr) {
        try {
            return method.invoke(t5Var, objArr);
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

    public static void l(Class cls, t5 t5Var) {
        t5Var.k();
        zzb.put(cls, t5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.f5
    public final void a(l5 l5Var) {
        p6 p6VarA = m6.f13489c.a(getClass());
        d6 d6Var = l5Var.f13459b;
        if (d6Var == null) {
            d6Var = new d6(l5Var);
        }
        p6VarA.d(this, d6Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.f5
    public final int b(p6 p6Var) {
        if (e()) {
            int iF = p6Var.f(this);
            if (iF >= 0) {
                return iF;
            }
            throw new IllegalStateException(l7.o.i(iF, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iF2 = p6Var.f(this);
        if (iF2 < 0) {
            throw new IllegalStateException(l7.o.i(iF2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) | iF2;
        return iF2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.f5
    public final int c() {
        if (e()) {
            int iF = m6.f13489c.a(getClass()).f(this);
            if (iF >= 0) {
                return iF;
            }
            throw new IllegalStateException(l7.o.i(iF, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iF2 = m6.f13489c.a(getClass()).f(this);
        if (iF2 < 0) {
            throw new IllegalStateException(l7.o.i(iF2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) | iF2;
        return iF2;
    }

    public final void d() {
        this.zzd = (this.zzd & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) | Integer.MAX_VALUE;
    }

    public final boolean e() {
        return (this.zzd & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return m6.f13489c.a(getClass()).c(this, (t5) obj);
    }

    public abstract Object f(int i);

    public final s5 g() {
        return (s5) f(5);
    }

    public final int hashCode() {
        if (e()) {
            return m6.f13489c.a(getClass()).b(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iB = m6.f13489c.a(getClass()).b(this);
        this.zza = iB;
        return iB;
    }

    public final void j() {
        m6.f13489c.a(getClass()).a(this);
        k();
    }

    public final void k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = i6.f13412a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        i6.c(this, sb2, 0);
        return sb2.toString();
    }
}

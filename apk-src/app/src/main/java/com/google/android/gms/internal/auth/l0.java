package com.google.android.gms.internal.auth;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends b0 {
    private static final Map zzb = new ConcurrentHashMap();
    protected n1 zzc;
    private int zzd;

    public l0() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = n1.f13263e;
    }

    public static l0 a(Class cls) {
        Map map = zzb;
        l0 l0Var = (l0) map.get(cls);
        if (l0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                l0Var = (l0) map.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = (l0) ((l0) w1.c(cls)).h(6);
        if (l0Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, l0Var2);
        return l0Var2;
    }

    public static Object c(Method method, l0 l0Var, Object... objArr) {
        try {
            return method.invoke(l0Var, objArr);
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

    public static void e(z1 z1Var) {
        z1Var.d();
        zzb.put(z1.class, z1Var);
    }

    public final l0 b() {
        return (l0) h(4);
    }

    public final void d() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return h1.f13228c.a(getClass()).a(this, (l0) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) | Integer.MAX_VALUE;
    }

    public final boolean g() {
        return (this.zzd & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0;
    }

    public abstract Object h(int i);

    public final int hashCode() {
        if (g()) {
            return h1.f13228c.a(getClass()).c(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iC = h1.f13228c.a(getClass()).c(this);
        this.zza = iC;
        return iC;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = b1.f13174a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        b1.c(this, sb2, 0);
        return sb2.toString();
    }
}

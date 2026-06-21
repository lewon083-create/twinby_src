package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sn1 extends pm1 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, sn1> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc;
    protected ep1 zzt;

    public sn1() {
        this.zzq = 0;
        this.zzc = -1;
        this.zzt = ep1.f5026f;
    }

    public static Object j(Method method, sn1 sn1Var, Object... objArr) {
        try {
            return method.invoke(sn1Var, objArr);
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

    public static ho1 k(yn1 yn1Var) {
        int size = yn1Var.size();
        return ((ho1) yn1Var).b(size + size);
    }

    public static sn1 l(sn1 sn1Var, en1 en1Var, kn1 kn1Var) throws co1 {
        sn1 sn1VarP = sn1Var.p();
        try {
            yo1 yo1VarA = so1.f10369c.a(sn1VarP.getClass());
            androidx.datastore.preferences.protobuf.l lVar = (androidx.datastore.preferences.protobuf.l) en1Var.f5015d;
            if (lVar == null) {
                lVar = new androidx.datastore.preferences.protobuf.l(en1Var);
            }
            yo1VarA.c(sn1VarP, lVar, kn1Var);
            yo1VarA.a(sn1VarP);
            return sn1VarP;
        } catch (co1 e3) {
            if (e3.f4276b) {
                throw new co1(e3.getMessage(), e3);
            }
            throw e3;
        } catch (dp1 e7) {
            throw new co1(e7.getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof co1) {
                throw ((co1) e10.getCause());
            }
            throw new co1(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof co1) {
                throw ((co1) e11.getCause());
            }
            throw e11;
        }
    }

    public static sn1 m(sn1 sn1Var, bn1 bn1Var, kn1 kn1Var) {
        en1 en1VarW = bn1Var.w();
        sn1 sn1VarL = l(sn1Var, en1VarW, kn1Var);
        en1VarW.i(0);
        y(sn1VarL);
        return sn1VarL;
    }

    public static sn1 n(sn1 sn1Var, byte[] bArr, kn1 kn1Var) throws co1 {
        sn1 sn1VarX = x(sn1Var, bArr, bArr.length, kn1Var);
        y(sn1VarX);
        return sn1VarX;
    }

    public static sn1 s(Class cls) {
        sn1 sn1Var = zzd.get(cls);
        if (sn1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                sn1Var = zzd.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (sn1Var != null) {
            return sn1Var;
        }
        sn1 sn1Var2 = (sn1) ((sn1) jp1.f(cls)).v(6, null);
        if (sn1Var2 == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, sn1Var2);
        return sn1Var2;
    }

    public static void t(Class cls, sn1 sn1Var) {
        sn1Var.i();
        zzd.put(cls, sn1Var);
    }

    public static final boolean w(sn1 sn1Var, boolean z5) {
        byte bByteValue = ((Byte) sn1Var.v(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zE = so1.f10369c.a(sn1Var.getClass()).e(sn1Var);
        if (z5) {
            sn1Var.v(2, true == zE ? sn1Var : null);
        }
        return zE;
    }

    public static sn1 x(sn1 sn1Var, byte[] bArr, int i, kn1 kn1Var) throws co1 {
        if (i == 0) {
            return sn1Var;
        }
        sn1 sn1VarP = sn1Var.p();
        try {
            yo1 yo1VarA = so1.f10369c.a(sn1VarP.getClass());
            yo1VarA.j(sn1VarP, bArr, 0, i, new um1(kn1Var));
            yo1VarA.a(sn1VarP);
            return sn1VarP;
        } catch (co1 e3) {
            if (e3.f4276b) {
                throw new co1(e3.getMessage(), e3);
            }
            throw e3;
        } catch (dp1 e7) {
            throw new co1(e7.getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof co1) {
                throw ((co1) e10.getCause());
            }
            throw new co1(e10.getMessage(), e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void y(sn1 sn1Var) {
        if (sn1Var != null && !w(sn1Var, true)) {
            throw new co1(new dp1().getMessage());
        }
    }

    @Override // com.google.android.gms.internal.ads.pm1
    public final int d(yo1 yo1Var) {
        int iF;
        int iF2;
        if (h()) {
            if (yo1Var == null) {
                iF2 = so1.f10369c.a(getClass()).f(this);
            } else {
                iF2 = yo1Var.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            throw new IllegalStateException(l7.o.j(iF2, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(iF2).length() + 42)));
        }
        int i = this.zzc;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (yo1Var == null) {
            iF = so1.f10369c.a(getClass()).f(this);
        } else {
            iF = yo1Var.f(this);
        }
        g(iF);
        return iF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return so1.f10369c.a(getClass()).d(this, (sn1) obj);
    }

    public final void g(int i) {
        if (i < 0) {
            throw new IllegalStateException(l7.o.j(i, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i).length() + 42)));
        }
        this.zzc = i | (this.zzc & Integer.MIN_VALUE);
    }

    public final boolean h() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return so1.f10369c.a(getClass()).i(this);
        }
        if (this.zzq == 0) {
            this.zzq = so1.f10369c.a(getClass()).i(this);
        }
        return this.zzq;
    }

    public final void i() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final qo1 o() {
        return (qo1) v(7, null);
    }

    public final sn1 p() {
        return (sn1) v(4, null);
    }

    public final qn1 q() {
        return (qn1) v(5, null);
    }

    public final qn1 r() {
        qn1 qn1Var = (qn1) v(5, null);
        qn1Var.e(this);
        return qn1Var;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = mo1.f7963a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        mo1.b(this, sb2, 0);
        return sb2.toString();
    }

    public final void u(hn1 hn1Var) {
        yo1 yo1VarA = so1.f10369c.a(getClass());
        pp0 pp0Var = hn1Var.f6202b;
        if (pp0Var == null) {
            pp0Var = new pp0(hn1Var);
        }
        yo1VarA.g(this, pp0Var);
    }

    public abstract Object v(int i, sn1 sn1Var);
}

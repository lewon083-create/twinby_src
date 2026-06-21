package androidx.datastore.preferences.protobuf;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f1457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f1458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1 f1459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f1460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f1461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f1462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f1463g;

    static {
        Unsafe unsafeI = i();
        f1457a = unsafeI;
        f1458b = c.f1366a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        o1 n1Var = null;
        if (unsafeI != null) {
            if (!c.a()) {
                n1Var = new n1(unsafeI);
            } else if (zH) {
                n1Var = new m1(unsafeI, 1);
            } else if (zH2) {
                n1Var = new m1(unsafeI, 0);
            }
        }
        f1459c = n1Var;
        f1460d = n1Var == null ? false : n1Var.r();
        f1461e = n1Var == null ? false : n1Var.q();
        f1462f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && n1Var != null) {
            n1Var.i(fieldG);
        }
        f1463g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(p1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static boolean b(long j10, Object obj) {
        return ((byte) ((f1459c.f((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean c(long j10, Object obj) {
        return ((byte) ((f1459c.f((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f1457a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int e(Class cls) {
        if (f1461e) {
            return f1459c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f1461e) {
            f1459c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField(SentryLockReason.JsonKeys.ADDRESS);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean h(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f1458b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new l1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j10, byte b2) {
        f1459c.k(bArr, f1462f + j10, b2);
    }

    public static void k(Object obj, long j10, byte b2) {
        long j11 = (-4) & j10;
        int iF = f1459c.f(j11, obj);
        int i = ((~((int) j10)) & 3) << 3;
        m(((255 & b2) << i) | (iF & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))), j11, obj);
    }

    public static void l(Object obj, long j10, byte b2) {
        long j11 = (-4) & j10;
        int i = (((int) j10) & 3) << 3;
        m(((255 & b2) << i) | (f1459c.f(j11, obj) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))), j11, obj);
    }

    public static void m(int i, long j10, Object obj) {
        f1459c.n(i, j10, obj);
    }

    public static void n(Object obj, long j10, long j11) {
        f1459c.o(obj, j10, j11);
    }

    public static void o(long j10, Object obj, Object obj2) {
        f1459c.p(j10, obj, obj2);
    }
}

package com.google.android.gms.internal.ads;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f6921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f6922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ip1 f6923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f6924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f6926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f6927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f6928h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jp1.<clinit>():void");
    }

    public static int a(Class cls) {
        if (f6925e) {
            return ((Unsafe) f6923c.f6568b).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f6925e) {
            ((Unsafe) f6923c.f6568b).arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        int i = tm1.f10663a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField(SentryLockReason.JsonKeys.ADDRESS);
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void d(Object obj, long j10, byte b2) {
        Unsafe unsafe = (Unsafe) f6923c.f6568b;
        long j11 = (-4) & j10;
        int i = unsafe.getInt(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b2) << i10) | (i & (~(KotlinVersion.MAX_COMPONENT_VALUE << i10))));
    }

    public static void e(Object obj, long j10, byte b2) {
        Unsafe unsafe = (Unsafe) f6923c.f6568b;
        long j11 = (-4) & j10;
        int i = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b2) << i) | (unsafe.getInt(obj, j11) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static Object f(Class cls) {
        try {
            return f6921a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int g(long j10, Object obj) {
        return ((Unsafe) f6923c.f6568b).getInt(obj, j10);
    }

    public static void h(int i, long j10, Object obj) {
        ((Unsafe) f6923c.f6568b).putInt(obj, j10, i);
    }

    public static long i(long j10, Object obj) {
        return ((Unsafe) f6923c.f6568b).getLong(obj, j10);
    }

    public static void j(Object obj, long j10, long j11) {
        ((Unsafe) f6923c.f6568b).putLong(obj, j10, j11);
    }

    public static Object k(long j10, Object obj) {
        return ((Unsafe) f6923c.f6568b).getObject(obj, j10);
    }

    public static void l(long j10, Object obj, Object obj2) {
        ((Unsafe) f6923c.f6568b).putObject(obj, j10, obj2);
    }

    public static void m(byte[] bArr, long j10, byte b2) {
        f6923c.P(bArr, f6926f + j10, b2);
    }

    public static long n(ByteBuffer byteBuffer) {
        return ((Unsafe) f6923c.f6568b).getLong(byteBuffer, f6927g);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new fp1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean p(Class cls) {
        int i = tm1.f10663a;
        try {
            Class cls2 = f6922b;
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

    public static /* synthetic */ boolean q(long j10, Object obj) {
        return ((byte) ((((Unsafe) f6923c.f6568b).getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* synthetic */ boolean r(long j10, Object obj) {
        return ((byte) ((((Unsafe) f6923c.f6568b).getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }
}

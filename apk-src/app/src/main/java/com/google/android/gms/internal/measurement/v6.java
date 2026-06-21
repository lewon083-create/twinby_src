package com.google.android.gms.internal.measurement;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f14016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f14017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u6 f14018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f14019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f14020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f14021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f14022g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.v6.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f14020e) {
            f14018c.f14005a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i = v4.f14015a;
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

    public static void c(Object obj, long j10, byte b2) {
        Unsafe unsafe = f14018c.f14005a;
        long j11 = (-4) & j10;
        int i = unsafe.getInt(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b2) << i10) | (i & (~(KotlinVersion.MAX_COMPONENT_VALUE << i10))));
    }

    public static void d(Object obj, long j10, byte b2) {
        Unsafe unsafe = f14018c.f14005a;
        long j11 = (-4) & j10;
        int i = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b2) << i) | (unsafe.getInt(obj, j11) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static Object e(Class cls) {
        try {
            return f14016a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int f(long j10, Object obj) {
        return f14018c.f14005a.getInt(obj, j10);
    }

    public static void g(int i, long j10, Object obj) {
        f14018c.f14005a.putInt(obj, j10, i);
    }

    public static long h(long j10, Object obj) {
        return f14018c.f14005a.getLong(obj, j10);
    }

    public static void i(Object obj, long j10, long j11) {
        f14018c.f14005a.putLong(obj, j10, j11);
    }

    public static Object j(long j10, Object obj) {
        return f14018c.f14005a.getObject(obj, j10);
    }

    public static void k(long j10, Object obj, Object obj2) {
        f14018c.f14005a.putObject(obj, j10, obj2);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new r6());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean m(Class cls) {
        int i = v4.f14015a;
        try {
            Class cls2 = f14017b;
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

    public static /* synthetic */ boolean n(long j10, Object obj) {
        return ((byte) ((f14018c.f14005a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* synthetic */ boolean o(long j10, Object obj) {
        return ((byte) ((f14018c.f14005a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static int p(Class cls) {
        if (f14020e) {
            return f14018c.f14005a.arrayBaseOffset(cls);
        }
        return -1;
    }
}

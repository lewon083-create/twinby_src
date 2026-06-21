package com.google.android.gms.internal.consent_sdk;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f13325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f13326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z6 f13327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f13328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f13329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f13330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f13331g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.a7.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f13329e) {
            f13327c.f13642a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i = h5.f13404a;
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
        Unsafe unsafe = f13327c.f13642a;
        long j11 = (-4) & j10;
        int i = unsafe.getInt(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b2) << i10) | (i & (~(KotlinVersion.MAX_COMPONENT_VALUE << i10))));
    }

    public static void d(Object obj, long j10, byte b2) {
        Unsafe unsafe = f13327c.f13642a;
        long j11 = (-4) & j10;
        int i = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b2) << i) | (unsafe.getInt(obj, j11) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static int e(long j10, Object obj) {
        return f13327c.f13642a.getInt(obj, j10);
    }

    public static long f(long j10, Object obj) {
        return f13327c.f13642a.getLong(obj, j10);
    }

    public static Object g(Class cls) {
        try {
            return f13325a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static Object h(long j10, Object obj) {
        return f13327c.f13642a.getObject(obj, j10);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new w6());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(int i, long j10, Object obj) {
        f13327c.f13642a.putInt(obj, j10, i);
    }

    public static void k(Object obj, long j10, long j11) {
        f13327c.f13642a.putLong(obj, j10, j11);
    }

    public static void l(long j10, Object obj, Object obj2) {
        f13327c.f13642a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean m(long j10, Object obj) {
        return ((byte) ((f13327c.f13642a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean n(long j10, Object obj) {
        return ((byte) ((f13327c.f13642a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean o(Class cls) {
        int i = h5.f13404a;
        try {
            Class cls2 = f13326b;
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

    public static int p(Class cls) {
        if (f13329e) {
            return f13327c.f13642a.arrayBaseOffset(cls);
        }
        return -1;
    }
}

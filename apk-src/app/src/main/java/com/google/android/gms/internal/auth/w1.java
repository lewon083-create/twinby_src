package com.google.android.gms.internal.auth;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f13296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f13297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v1 f13298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f13299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f13300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f13301f;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.w1.<clinit>():void");
    }

    public static int a(long j10, Object obj) {
        return f13298c.f13292a.getInt(obj, j10);
    }

    public static long b(long j10, Object obj) {
        return f13298c.f13292a.getLong(obj, j10);
    }

    public static Object c(Class cls) {
        try {
            return f13296a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static Object d(long j10, Object obj) {
        return f13298c.f13292a.getObject(obj, j10);
    }

    public static Unsafe e() {
        try {
            return (Unsafe) AccessController.doPrivileged(new s1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void f(Object obj, long j10, boolean z5) {
        v1 v1Var = f13298c;
        long j11 = (-4) & j10;
        int i = v1Var.f13292a.getInt(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        v1Var.f13292a.putInt(obj, j11, ((z5 ? 1 : 0) << i10) | ((~(KotlinVersion.MAX_COMPONENT_VALUE << i10)) & i));
    }

    public static /* synthetic */ void g(Object obj, long j10, boolean z5) {
        v1 v1Var = f13298c;
        long j11 = (-4) & j10;
        int i = (((int) j10) & 3) << 3;
        v1Var.f13292a.putInt(obj, j11, ((z5 ? 1 : 0) << i) | ((~(KotlinVersion.MAX_COMPONENT_VALUE << i)) & v1Var.f13292a.getInt(obj, j11)));
    }

    public static void h(int i, long j10, Object obj) {
        f13298c.f13292a.putInt(obj, j10, i);
    }

    public static void i(Object obj, long j10, long j11) {
        f13298c.f13292a.putLong(obj, j10, j11);
    }

    public static void j(long j10, Object obj, Object obj2) {
        f13298c.f13292a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean k(long j10, Object obj) {
        return ((byte) ((f13298c.f13292a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean l(long j10, Object obj) {
        return ((byte) ((f13298c.f13292a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean m(Class cls) {
        int i = d0.f13189a;
        try {
            Class cls2 = f13297b;
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

    public static void n(Class cls) {
        if (f13300e) {
            f13298c.f13292a.arrayBaseOffset(cls);
        }
    }

    public static void o(Class cls) {
        if (f13300e) {
            f13298c.f13292a.arrayIndexScale(cls);
        }
    }

    public static Field p() {
        Field declaredField;
        Field declaredField2;
        int i = d0.f13189a;
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
}

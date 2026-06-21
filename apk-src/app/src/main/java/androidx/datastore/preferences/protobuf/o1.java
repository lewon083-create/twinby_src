package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f1455a;

    public o1(Unsafe unsafe) {
        this.f1455a = unsafe;
    }

    public final int a(Class cls) {
        return this.f1455a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f1455a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j10, Object obj);

    public abstract double d(long j10, Object obj);

    public abstract float e(long j10, Object obj);

    public final int f(long j10, Object obj) {
        return this.f1455a.getInt(obj, j10);
    }

    public final long g(long j10, Object obj) {
        return this.f1455a.getLong(obj, j10);
    }

    public final Object h(long j10, Object obj) {
        return this.f1455a.getObject(obj, j10);
    }

    public final long i(Field field) {
        return this.f1455a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j10, boolean z5);

    public abstract void k(Object obj, long j10, byte b2);

    public abstract void l(Object obj, long j10, double d10);

    public abstract void m(Object obj, long j10, float f10);

    public final void n(int i, long j10, Object obj) {
        this.f1455a.putInt(obj, j10, i);
    }

    public final void o(Object obj, long j10, long j11) {
        this.f1455a.putLong(obj, j10, j11);
    }

    public final void p(long j10, Object obj, Object obj2) {
        this.f1455a.putObject(obj, j10, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f1455a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            p1.a(th2);
            return false;
        }
    }

    public abstract boolean r();
}

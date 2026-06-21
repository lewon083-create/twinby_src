package qe;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import me.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f32106d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f32108c;

    public c() {
        Object obj;
        Field declaredField = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f32106d = cls;
            Field declaredField2 = cls.getDeclaredField("theUnsafe");
            declaredField2.setAccessible(true);
            obj = declaredField2.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f32107b = obj;
        try {
            declaredField = AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused2) {
        }
        this.f32108c = declaredField;
    }

    @Override // qe.b
    public final void a(AccessibleObject accessibleObject) {
        Field field;
        Object obj = this.f32107b;
        if (obj != null && (field = this.f32108c) != null) {
            try {
                Long l10 = (Long) f32106d.getMethod("objectFieldOffset", Field.class).invoke(obj, field);
                l10.getClass();
                f32106d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(obj, accessibleObject, l10, Boolean.TRUE);
                return;
            } catch (Exception unused) {
            }
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e3) {
            throw new q("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e3);
        }
    }
}

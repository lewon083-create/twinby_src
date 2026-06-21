package z2;

import com.google.android.gms.internal.ads.oc;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h1.i f45816b = new h1.i(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f45817a;

    public b0(h0 h0Var) {
        this.f45817a = h0Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        h1.i iVar = f45816b;
        h1.i iVar2 = (h1.i) iVar.get(classLoader);
        if (iVar2 == null) {
            iVar2 = new h1.i(0);
            iVar.put(classLoader, iVar2);
        }
        Class cls = (Class) iVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        iVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e3) {
            throw new oc(pe.a.f("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e3);
        } catch (ClassNotFoundException e7) {
            throw new oc(pe.a.f("Unable to instantiate fragment ", str, ": make sure class name exists"), e7);
        }
    }

    public final t a(String str) {
        try {
            return (t) c(this.f45817a.f45862v.f45996d.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e3) {
            throw new oc(pe.a.f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e7) {
            throw new oc(pe.a.f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (NoSuchMethodException e10) {
            throw new oc(pe.a.f("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e10);
        } catch (InvocationTargetException e11) {
            throw new oc(pe.a.f("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e11);
        }
    }
}

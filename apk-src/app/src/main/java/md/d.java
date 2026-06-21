package md;

import android.util.Log;
import com.google.android.gms.internal.ads.om1;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements yd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28839b;

    public /* synthetic */ d(int i, Object obj) {
        this.f28838a = i;
        this.f28839b = obj;
    }

    @Override // yd.a
    public final Object get() {
        switch (this.f28838a) {
            case 0:
                String str = (String) this.f28839b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new l("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e3) {
                    throw new l(pe.a.f("Could not instantiate ", str, "."), e3);
                } catch (InstantiationException e7) {
                    throw new l(pe.a.f("Could not instantiate ", str, "."), e7);
                } catch (NoSuchMethodException e10) {
                    throw new l(om1.k("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new l(om1.k("Could not instantiate ", str), e11);
                }
            case 1:
                return (ComponentRegistrar) this.f28839b;
            default:
                return new ae.c((fd.g) this.f28839b);
        }
    }
}

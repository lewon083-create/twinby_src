package u6;

import android.widget.FrameLayout;
import com.twinby.R;
import g2.n0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f34299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f34300c;

    static {
        a aVar = new a();
        aVar.f34301b = new ArrayList();
        aVar.f34302c = true;
        aVar.f34304e = false;
        aVar.f34305f = 0;
        aVar.f34302c = false;
        aVar.e(new j(2));
        aVar.e(new h());
        aVar.e(new j(1));
        f34298a = aVar;
        f34299b = new ThreadLocal();
        f34300c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, r rVar) {
        ArrayList arrayList = f34300c;
        if (arrayList.contains(frameLayout)) {
            return;
        }
        Field field = n0.f19900a;
        if (frameLayout.isLaidOut()) {
            arrayList.add(frameLayout);
            if (rVar == null) {
                rVar = f34298a;
            }
            r rVarClone = rVar.clone();
            ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).pause(frameLayout);
                }
            }
            if (rVarClone != null) {
                rVarClone.captureValues(frameLayout, true);
            }
            if (frameLayout.getTag(R.id.transition_current_scene) != null) {
                throw new ClassCastException();
            }
            frameLayout.setTag(R.id.transition_current_scene, null);
            if (rVarClone != null) {
                u uVar = new u();
                uVar.f34296b = rVarClone;
                uVar.f34297c = frameLayout;
                frameLayout.addOnAttachStateChangeListener(uVar);
                frameLayout.getViewTreeObserver().addOnPreDrawListener(uVar);
            }
        }
    }

    public static h1.e b() {
        h1.e eVar;
        ThreadLocal threadLocal = f34299b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (h1.e) weakReference.get()) != null) {
            return eVar;
        }
        h1.e eVar2 = new h1.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }
}

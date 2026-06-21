package yads;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41426a;

    public o1(Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.f41426a = arrayList;
        if (activity != null) {
            arrayList.add(new WeakReference(activity));
        }
    }

    public final void a(Activity activity) {
        synchronized (this) {
            try {
                ArrayList arrayList = this.f41426a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.a(((WeakReference) it.next()).get(), activity)) {
                            break;
                        }
                    }
                }
                this.f41426a.add(new WeakReference(activity));
                Objects.toString(activity);
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Activity activity) {
        Object next;
        synchronized (this) {
            try {
                Iterator it = this.f41426a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.a(((WeakReference) next).get(), activity)) {
                            break;
                        }
                    }
                }
                WeakReference weakReference = (WeakReference) next;
                if (weakReference != null) {
                    this.f41426a.remove(weakReference);
                    Objects.toString(activity);
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

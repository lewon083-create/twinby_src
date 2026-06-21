package s6;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.auth.g;
import com.twinby.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f32779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f32780e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f32783c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f32782b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f32781a = new HashMap();

    public a(Context context) {
        this.f32783c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f32779d == null) {
            synchronized (f32780e) {
                try {
                    if (f32779d == null) {
                        f32779d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f32779d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f32783c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f32782b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e3) {
                throw new oc(e3);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = this.f32781a;
        if (g.w()) {
            try {
                Trace.beginSection(g.M(cls.getSimpleName()));
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f32783c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th3) {
                throw new oc(th3);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}

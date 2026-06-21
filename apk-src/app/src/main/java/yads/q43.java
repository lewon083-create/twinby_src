package yads;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile q43 f42184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f42185c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f42186a = new LinkedHashMap();

    public final void a(ke1 ke1Var, Object obj) {
        synchronized (f42185c) {
            Set set = (Set) this.f42186a.get(ke1Var);
            if (set != null) {
                set.remove(obj);
            }
        }
    }

    public final void b(ke1 ke1Var, Object obj) {
        synchronized (f42185c) {
            try {
                Set linkedHashSet = (Set) this.f42186a.get(ke1Var);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f42186a.put(ke1Var, linkedHashSet);
                }
                linkedHashSet.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

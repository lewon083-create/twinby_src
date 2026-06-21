package md;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import m3.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements vd.d, vd.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f28856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f28857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nd.k f28858c;

    public k() {
        nd.k kVar = nd.k.f29327b;
        this.f28856a = new HashMap();
        this.f28857b = new ArrayDeque();
        this.f28858c = kVar;
    }

    @Override // vd.c
    public final void a(vd.a aVar) {
        Set<Map.Entry> setEntrySet;
        aVar.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.f28857b;
                if (arrayDeque != null) {
                    arrayDeque.add(aVar);
                    return;
                }
                synchronized (this) {
                    try {
                        Map map = (Map) this.f28856a.get(fd.b.class);
                        setEntrySet = map == null ? Collections.EMPTY_SET : map.entrySet();
                    } finally {
                    }
                }
                for (Map.Entry entry : setEntrySet) {
                    ((Executor) entry.getValue()).execute(new c0(3, entry, aVar));
                }
            } finally {
            }
        }
    }

    public final synchronized void b(Executor executor, vd.b bVar) {
        try {
            executor.getClass();
            if (!this.f28856a.containsKey(fd.b.class)) {
                this.f28856a.put(fd.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f28856a.get(fd.b.class)).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(com.google.firebase.messaging.q qVar) {
        qVar.getClass();
        if (this.f28856a.containsKey(fd.b.class)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f28856a.get(fd.b.class);
            concurrentHashMap.remove(qVar);
            if (concurrentHashMap.isEmpty()) {
                this.f28856a.remove(fd.b.class);
            }
        }
    }
}

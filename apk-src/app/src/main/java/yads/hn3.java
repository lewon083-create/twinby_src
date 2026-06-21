package yads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hn3 implements po2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f39258a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dq2 f39259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tr f39260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue f39261d;

    public hn3(tr trVar, PriorityBlockingQueue priorityBlockingQueue, dq2 dq2Var) {
        this.f39259b = dq2Var;
        this.f39260c = trVar;
        this.f39261d = priorityBlockingQueue;
    }

    public final synchronized boolean a(ro2 ro2Var) {
        try {
            String strC = ro2Var.c();
            if (!this.f39258a.containsKey(strC)) {
                this.f39258a.put(strC, null);
                ro2Var.a((po2) this);
                boolean z5 = om3.f41652a;
                return false;
            }
            List arrayList = (List) this.f39258a.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ro2Var.a("waiting-for-response");
            arrayList.add(ro2Var);
            this.f39258a.put(strC, arrayList);
            boolean z10 = om3.f41652a;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(ro2 ro2Var) {
        BlockingQueue blockingQueue;
        try {
            String strC = ro2Var.c();
            List list = (List) this.f39258a.remove(strC);
            if (list != null && !list.isEmpty()) {
                if (om3.f41652a) {
                    list.size();
                }
                ro2 ro2Var2 = (ro2) list.remove(0);
                this.f39258a.put(strC, list);
                ro2Var2.a((po2) this);
                if (this.f39260c != null && (blockingQueue = this.f39261d) != null) {
                    try {
                        blockingQueue.put(ro2Var2);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        tr trVar = this.f39260c;
                        trVar.f43423f = true;
                        trVar.interrupt();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void a(ro2 ro2Var, xp2 xp2Var) {
        List list;
        lr lrVar = xp2Var.f44787b;
        if (lrVar != null) {
            if (lrVar.f40642e >= System.currentTimeMillis()) {
                String strC = ro2Var.c();
                synchronized (this) {
                    list = (List) this.f39258a.remove(strC);
                }
                if (list != null) {
                    if (om3.f41652a) {
                        list.size();
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((hn0) this.f39259b).a((ro2) it.next(), xp2Var, null);
                    }
                    return;
                }
                return;
            }
        }
        b(ro2Var);
    }
}

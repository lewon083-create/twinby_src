package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ep2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f38224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f38225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f38226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f38227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mr f38228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xo f38229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dq2 f38230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d82[] f38231h;
    public tr i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f38232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f38233k;

    public ep2(mr mrVar, xo xoVar, int i) {
        this(mrVar, xoVar, i, new hn0(new Handler(Looper.getMainLooper())));
    }

    public final void a(ro2 ro2Var) {
        ro2Var.i = this;
        synchronized (this.f38225b) {
            this.f38225b.add(ro2Var);
        }
        ro2Var.f42664h = Integer.valueOf(this.f38224a.incrementAndGet());
        ro2Var.a("add-to-queue");
        a(ro2Var, 0);
        if (ro2Var.f42665j) {
            this.f38226c.add(ro2Var);
        } else {
            this.f38227d.add(ro2Var);
        }
    }

    public ep2(mr mrVar, xo xoVar, int i, hn0 hn0Var) {
        this.f38224a = new AtomicInteger();
        this.f38225b = new HashSet();
        this.f38226c = new PriorityBlockingQueue();
        this.f38227d = new PriorityBlockingQueue();
        this.f38232j = new ArrayList();
        this.f38233k = new ArrayList();
        this.f38228e = mrVar;
        this.f38229f = xoVar;
        this.f38231h = new d82[i];
        this.f38230g = hn0Var;
    }

    public final void a(dp2 dp2Var) {
        synchronized (this.f38225b) {
            try {
                for (ro2 ro2Var : this.f38225b) {
                    if (dp2Var.a(ro2Var)) {
                        ro2Var.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(ro2 ro2Var, int i) {
        wo2 wo2Var;
        synchronized (this.f38233k) {
            try {
                Iterator it = this.f38233k.iterator();
                while (it.hasNext()) {
                    ((to2) ((cp2) it.next())).getClass();
                    po poVar = ro2Var instanceof po ? (po) ro2Var : null;
                    if (poVar != null && i == 3 && (wo2Var = poVar.f41970u) != null) {
                        wo2Var.b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        tr trVar = this.i;
        if (trVar != null) {
            trVar.f43423f = true;
            trVar.interrupt();
        }
        for (d82 d82Var : this.f38231h) {
            if (d82Var != null) {
                d82Var.f37670f = true;
                d82Var.interrupt();
            }
        }
        tr trVar2 = new tr(this.f38226c, this.f38227d, this.f38228e, this.f38230g);
        this.i = trVar2;
        trVar2.start();
        for (int i = 0; i < this.f38231h.length; i++) {
            d82 d82Var2 = new d82(this.f38227d, this.f38229f, this.f38228e, this.f38230g);
            this.f38231h[i] = d82Var2;
            d82Var2.start();
        }
    }
}

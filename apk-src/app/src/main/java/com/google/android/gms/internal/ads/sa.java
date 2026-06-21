package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f10214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f10215h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f10216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f10217k;

    public sa(eq0 eq0Var, xp0 xp0Var, u60 u60Var, y60 y60Var, mo0 mo0Var, e60 e60Var, s70 s70Var, a70 a70Var, q80 q80Var, r50 r50Var, de0 de0Var) {
        this.f10208a = eq0Var;
        this.f10209b = xp0Var;
        this.f10210c = u60Var;
        this.f10211d = y60Var;
        this.f10212e = mo0Var;
        this.f10213f = e60Var;
        this.f10214g = s70Var;
        this.f10215h = a70Var;
        this.i = q80Var;
        this.f10216j = r50Var;
        this.f10217k = de0Var;
    }

    public void a() {
        ha haVar = (ha) this.f10215h;
        if (haVar != null) {
            haVar.f6079e = true;
            haVar.interrupt();
        }
        ma[] maVarArr = (ma[]) this.f10214g;
        for (int i = 0; i < 4; i++) {
            ma maVar = maVarArr[i];
            if (maVar != null) {
                maVar.f7826e = true;
                maVar.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = (PriorityBlockingQueue) this.f10210c;
        PriorityBlockingQueue priorityBlockingQueue2 = (PriorityBlockingQueue) this.f10211d;
        cb cbVar = (cb) this.f10212e;
        ox0 ox0Var = (ox0) this.f10217k;
        ha haVar2 = new ha(priorityBlockingQueue, priorityBlockingQueue2, cbVar, ox0Var);
        this.f10215h = haVar2;
        haVar2.start();
        for (int i10 = 0; i10 < 4; i10++) {
            ma maVar2 = new ma(priorityBlockingQueue2, (ut) this.f10213f, cbVar, ox0Var);
            maVarArr[i10] = maVar2;
            maVar2.start();
        }
    }

    public void b(qa qaVar) {
        qaVar.i = this;
        HashSet hashSet = (HashSet) this.f10209b;
        synchronized (hashSet) {
            hashSet.add(qaVar);
        }
        qaVar.f9378h = Integer.valueOf(((AtomicInteger) this.f10208a).incrementAndGet());
        qaVar.a("add-to-queue");
        c();
        ((PriorityBlockingQueue) this.f10210c).add(qaVar);
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f10216j;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public sa(cb cbVar, ut utVar) {
        ox0 ox0Var = new ox0(new Handler(Looper.getMainLooper()));
        this.f10208a = new AtomicInteger();
        this.f10209b = new HashSet();
        this.f10210c = new PriorityBlockingQueue();
        this.f10211d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.f10216j = new ArrayList();
        this.f10212e = cbVar;
        this.f10213f = utVar;
        this.f10214g = new ma[4];
        this.f10217k = ox0Var;
    }
}

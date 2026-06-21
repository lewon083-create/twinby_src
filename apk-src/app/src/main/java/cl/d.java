package cl;

import ac.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import nc.e;
import v7.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f2407h = new e();
    public static final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f2408j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f2413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f2415g;

    static {
        String name = al.b.f1047g + " TaskRunner";
        Intrinsics.checkNotNullParameter(name, "name");
        i = new d(new f(new al.a(name, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f2408j = logger;
    }

    public d(f backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f2409a = backend;
        this.f2410b = 10000;
        this.f2413e = new ArrayList();
        this.f2414f = new ArrayList();
        this.f2415g = new g(6, this);
    }

    public static final void a(d dVar, a aVar) {
        byte[] bArr = al.b.f1041a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f2395a);
        try {
            long jA = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, jA);
                Unit unit = Unit.f27471a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                Unit unit2 = Unit.f27471a;
                threadCurrentThread.setName(name);
                throw th2;
            }
        }
    }

    public final void b(a aVar, long j10) {
        byte[] bArr = al.b.f1041a;
        c cVar = aVar.f2397c;
        Intrinsics.b(cVar);
        if (cVar.f2404d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z5 = cVar.f2406f;
        cVar.f2406f = false;
        cVar.f2404d = null;
        this.f2413e.remove(cVar);
        if (j10 != -1 && !z5 && !cVar.f2403c) {
            cVar.d(aVar, j10, true);
        }
        if (cVar.f2405e.isEmpty()) {
            return;
        }
        this.f2414f.add(cVar);
    }

    public final a c() {
        boolean z5;
        byte[] bArr = al.b.f1041a;
        while (true) {
            ArrayList arrayList = this.f2414f;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z5 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f2405e.get(0);
                long jMax = Math.max(0L, aVar2.f2398d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z5 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.f2413e;
            if (aVar != null) {
                byte[] bArr2 = al.b.f1041a;
                aVar.f2398d = -1L;
                c cVar = aVar.f2397c;
                Intrinsics.b(cVar);
                cVar.f2405e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f2404d = aVar;
                arrayList2.add(cVar);
                if (z5 || (!this.f2411c && !arrayList.isEmpty())) {
                    g runnable = this.f2415g;
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    ((ThreadPoolExecutor) this.f2409a.f34767c).execute(runnable);
                }
                return aVar;
            }
            if (!this.f2411c) {
                this.f2411c = true;
                this.f2412d = jNanoTime + jMin;
                try {
                    try {
                        Intrinsics.checkNotNullParameter(this, "taskRunner");
                        long j10 = jMin / 1000000;
                        long j11 = jMin - (1000000 * j10);
                        if (j10 > 0 || jMin > 0) {
                            wait(j10, (int) j11);
                        }
                    } catch (InterruptedException unused) {
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((c) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            c cVar2 = (c) arrayList.get(size2);
                            cVar2.b();
                            if (cVar2.f2405e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.f2411c = false;
                }
            } else if (jMin < this.f2412d - jNanoTime) {
                Intrinsics.checkNotNullParameter(this, "taskRunner");
                notify();
            }
        }
        return null;
    }

    public final void d(c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = al.b.f1041a;
        if (taskQueue.f2404d == null) {
            boolean zIsEmpty = taskQueue.f2405e.isEmpty();
            ArrayList arrayList = this.f2414f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f2411c) {
            Intrinsics.checkNotNullParameter(this, "taskRunner");
            notify();
        } else {
            g runnable = this.f2415g;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            ((ThreadPoolExecutor) this.f2409a.f34767c).execute(runnable);
        }
    }

    public final c e() {
        int i10;
        synchronized (this) {
            i10 = this.f2410b;
            this.f2410b = i10 + 1;
        }
        return new c(this, o.i(i10, "Q"));
    }
}

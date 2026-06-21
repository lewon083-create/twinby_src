package ok;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import hk.c0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import mk.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f30712j = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30713k = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d8.k f30714l = new d8.k("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30716c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f30719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f30720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f30721h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(String str, int i10, int i11, long j10) {
        this.f30715b = i10;
        this.f30716c = i11;
        this.f30717d = j10;
        this.f30718e = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(u.k(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(u.j(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(u.k(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f30719f = new f();
        this.f30720g = new f();
        this.f30721h = new p((i10 + 1) * 2);
        this.controlState$volatile = ((long) i10) << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.f30721h) {
            try {
                if (f30713k.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f30712j;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f30715b) {
                    return 0;
                }
                if (i10 >= this.f30716c) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f30721h.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i12);
                this.f30721h.c(i12, aVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                aVar.start();
                return i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Runnable runnable, boolean z5) {
        i jVar;
        b bVar;
        k.f30735f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f30727b = jNanoTime;
            jVar.f30728c = z5;
        } else {
            jVar = new j(runnable, jNanoTime, z5);
        }
        boolean z10 = jVar.f30728c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30712j;
        long jAddAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !Intrinsics.a(aVar.i, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f30701d) != b.f30710f && (jVar.f30728c || bVar != b.f30707c)) {
            aVar.f30705h = true;
            m mVar = aVar.f30699b;
            mVar.getClass();
            jVar = (i) m.f30737b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f30741a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f30738c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.f30739d.get(mVar) != 127) {
                    if (jVar.f30728c) {
                        m.f30740e.incrementAndGet(mVar);
                    }
                    int i10 = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i10) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i10, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (!(jVar.f30728c ? this.f30720g.a(jVar) : this.f30719f.a(jVar))) {
                throw new RejectedExecutionException(u.o(new StringBuilder(), this.f30718e, " was terminated"));
            }
        }
        if (z10) {
            if (i() || h(jAddAndGet)) {
                return;
            }
            i();
            return;
        }
        if (i() || h(atomicLongFieldUpdater.get(this))) {
            return;
        }
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = ok.c.f30713k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof ok.a
            r3 = 0
            if (r1 == 0) goto L17
            ok.a r0 = (ok.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            ok.c r1 = r0.i
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            mk.p r1 = r8.f30721h
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = ok.c.f30712j     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            mk.p r5 = r8.f30721h
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.Intrinsics.b(r5)
            ok.a r5 = (ok.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            ok.m r5 = r5.f30699b
            ok.f r6 = r8.f30720g
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = ok.m.f30737b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            ok.i r7 = (ok.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            ok.i r7 = r5.a()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            ok.f r1 = r8.f30720g
            r1.b()
            ok.f r1 = r8.f30719f
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            ok.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            ok.f r1 = r8.f30719f
            java.lang.Object r1 = r1.d()
            ok.i r1 = (ok.i) r1
            if (r1 != 0) goto Lb2
            ok.f r1 = r8.f30720g
            java.lang.Object r1 = r1.d()
            ok.i r1 = (ok.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            ok.b r1 = ok.b.f30710f
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ok.c.i
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ok.c.f30712j
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ok.c.close():void");
    }

    public final void d(a aVar, int i10, int i11) {
        while (true) {
            long j10 = i.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f30714l) {
                            i12 = -1;
                            break;
                        }
                        if (objC == null) {
                            i12 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i12 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (i.compareAndSet(this, j10, ((long) i12) | j11)) {
                    return;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, false);
    }

    public final boolean h(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f30715b;
        if (i10 < i11) {
            int iA = a();
            if (iA == 1 && i11 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        d8.k kVar;
        int iB;
        while (true) {
            long j10 = i.get(this);
            a aVar = (a) this.f30721h.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    kVar = f30714l;
                    if (objC == kVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (i.compareAndSet(this, j10, ((long) iB) | j11)) {
                        aVar.g(kVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f30698j.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f30721h;
        int iA = pVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            a aVar = (a) pVar.b(i15);
            if (aVar != null) {
                m mVar = aVar.f30699b;
                mVar.getClass();
                int i16 = m.f30737b.get(mVar) != null ? (m.f30738c.get(mVar) - m.f30739d.get(mVar)) + 1 : m.f30738c.get(mVar) - m.f30739d.get(mVar);
                int iOrdinal = aVar.f30701d.ordinal();
                if (iOrdinal == 0) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i12++;
                } else if (iOrdinal == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new ij.j();
                    }
                    i14++;
                }
            }
        }
        long j10 = f30712j.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f30718e);
        sb5.append('@');
        sb5.append(c0.h(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.f30715b;
        sb5.append(i17);
        sb5.append(", max = ");
        om1.t(sb5, this.f30716c, "}, Worker States {CPU = ", i10, ", blocking = ");
        om1.t(sb5, i11, ", parked = ", i12, ", dormant = ");
        om1.t(sb5, i13, ", terminated = ", i14, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f30719f.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f30720g.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}

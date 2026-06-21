package hk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t0 extends u0 implements h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20712h = AtomicReferenceFieldUpdater.newUpdater(t0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(t0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20713j = AtomicIntegerFieldUpdater.newUpdater(t0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // hk.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long J() {
        /*
            r10 = this;
            d8.k r0 = hk.c0.f20643c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = hk.t0.f20712h
            boolean r2 = r10.K()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.N()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof mk.m
            if (r6 == 0) goto L3e
            r6 = r2
            mk.m r6 = (mk.m) r6
            java.lang.Object r7 = r6.d()
            d8.k r8 = mk.m.f28929g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            mk.m r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            kotlin.collections.l r2 = r10.f20718f
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof mk.m
            if (r2 == 0) goto L8d
            mk.m r1 = (mk.m) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = mk.m.f28928f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = hk.t0.i
            java.lang.Object r0 = r0.get(r10)
            hk.s0 r0 = (hk.s0) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            hk.r0[] r1 = r0.f28946a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f20702b
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.t0.J():long");
    }

    public void M(Runnable runnable) {
        N();
        if (!O(runnable)) {
            d0.f20652k.M(runnable);
            return;
        }
        Thread threadS = s();
        if (Thread.currentThread() != threadS) {
            LockSupport.unpark(threadS);
        }
    }

    public final void N() {
        r0 r0VarB;
        s0 s0Var = (s0) i.get(this);
        if (s0Var == null || mk.v.f28945b.get(s0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (s0Var) {
                try {
                    r0[] r0VarArr = s0Var.f28946a;
                    r0 r0Var = r0VarArr != null ? r0VarArr[0] : null;
                    if (r0Var != null) {
                        r0VarB = ((jNanoTime - r0Var.f20702b) > 0L ? 1 : ((jNanoTime - r0Var.f20702b) == 0L ? 0 : -1)) >= 0 ? O(r0Var) : false ? s0Var.b(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (r0VarB != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = hk.t0.f20712h
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = hk.t0.f20713j
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof mk.m
            if (r4 == 0) goto L47
            r4 = r1
            mk.m r4 = (mk.m) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            mk.m r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            d8.k r4 = hk.c0.f20643c
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            mk.m r3 = new mk.m
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.t0.O(java.lang.Runnable):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean P() {
        /*
            r7 = this;
            kotlin.collections.l r0 = r7.f20718f
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = hk.t0.i
            java.lang.Object r0 = r0.get(r7)
            hk.s0 r0 = (hk.s0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = mk.v.f28945b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = hk.t0.f20712h
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof mk.m
            if (r3 == 0) goto L4f
            mk.m r0 = (mk.m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = mk.m.f28928f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            d8.k r3 = hk.c0.f20643c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.t0.P():boolean");
    }

    public final void Q(long j10, r0 r0Var) {
        int iC;
        Thread threadS;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        if (f20713j.get(this) != 0) {
            iC = 1;
        } else {
            s0 s0Var = (s0) atomicReferenceFieldUpdater.get(this);
            if (s0Var == null) {
                s0 s0Var2 = new s0();
                s0Var2.f20709c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, s0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.b(obj);
                s0Var = (s0) obj;
            }
            iC = r0Var.c(j10, s0Var, this);
        }
        if (iC != 0) {
            if (iC == 1) {
                L(j10, r0Var);
                return;
            } else {
                if (iC != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        s0 s0Var3 = (s0) atomicReferenceFieldUpdater.get(this);
        if (s0Var3 != null) {
            synchronized (s0Var3) {
                r0[] r0VarArr = s0Var3.f28946a;
                r0Var = r0VarArr != null ? r0VarArr[0] : null;
            }
        }
        if (r0Var != r0Var || Thread.currentThread() == (threadS = s())) {
            return;
        }
        LockSupport.unpark(threadS);
    }

    public m0 h(long j10, w1 w1Var, CoroutineContext coroutineContext) {
        return c0.l(j10, w1Var, coroutineContext);
    }

    @Override // hk.h0
    public final void i(long j10, l lVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            p0 p0Var = new p0(this, j11 + jNanoTime, lVar);
            Q(jNanoTime, p0Var);
            lVar.w(new h(2, p0Var));
        }
    }

    @Override // hk.x
    public final void j(CoroutineContext coroutineContext, Runnable runnable) {
        M(runnable);
    }

    @Override // hk.u0
    public void shutdown() {
        r0 r0VarB;
        u1.f20719a.set(null);
        f20713j.set(this, 1);
        d8.k kVar = c0.f20643c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20712h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof mk.m)) {
                    if (obj != kVar) {
                        mk.m mVar = new mk.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((mk.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, kVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (J() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            s0 s0Var = (s0) i.get(this);
            if (s0Var == null) {
                return;
            }
            synchronized (s0Var) {
                r0VarB = mk.v.f28945b.get(s0Var) > 0 ? s0Var.b(0) : null;
            }
            if (r0VarB == null) {
                return;
            } else {
                L(jNanoTime, r0VarB);
            }
        }
    }
}

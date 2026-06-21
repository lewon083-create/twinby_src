package jk;

import a0.u;
import com.google.android.gms.internal.ads.xx1;
import com.google.android.gms.internal.measurement.h5;
import hk.b2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class c implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f26682c = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f26683d = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f26684e = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f26685f = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26686g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26687h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26688j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26689k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26690b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i10) {
        this.f26690b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(u.k(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.f26692a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f26684e.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (u()) {
            kVar2 = e.f26692a;
            Intrinsics.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f26709s;
    }

    public static final k b(c cVar, long j10, k kVar) {
        Object objB;
        c cVar2;
        k kVar2 = e.f26692a;
        d dVar = d.f26691b;
        loop0: while (true) {
            objB = mk.a.b(kVar, j10, dVar);
            if (!mk.a.e(objB)) {
                mk.r rVarC = mk.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26686g;
                    mk.r rVar = (mk.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.f28938c >= rVarC.f28938c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != rVar) {
                            if (rVarC.f()) {
                                rVarC.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = mk.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f26683d;
        if (zE) {
            cVar.s();
            if (kVar.f28938c * ((long) e.f26693b) < atomicLongFieldUpdater.get(cVar)) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) mk.a.c(objB);
            long j11 = kVar3.f28938c;
            if (j11 <= j10) {
                return kVar3;
            }
            long j12 = ((long) e.f26693b) * j11;
            while (true) {
                long j13 = f26682c.get(cVar);
                long j14 = 1152921504606846975L & j13;
                if (j14 >= j12) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f26682c.compareAndSet(cVar2, j13, (((long) ((int) (j13 >> 60))) << 60) + j14)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j11 * ((long) e.f26693b) < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.b();
            }
        }
        return null;
    }

    public static final void d(c cVar, Object obj, hk.l lVar) {
        Throwable thO = cVar.o();
        ij.k kVar = ij.m.f21341c;
        lVar.resumeWith(h5.s(thO));
    }

    public static final int e(c cVar, k kVar, int i10, Object obj, long j10, Object obj2, boolean z5) {
        kVar.n(i10, obj);
        if (z5) {
            return cVar.B(kVar, i10, obj, j10, obj2, z5);
        }
        Object objL = kVar.l(i10);
        if (objL == null) {
            if (cVar.f(j10)) {
                if (kVar.k(i10, null, e.f26695d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.k(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof b2) {
            kVar.n(i10, null);
            if (cVar.y(objL, obj)) {
                kVar.o(i10, e.i);
                return 0;
            }
            d8.k kVar2 = e.f26701k;
            if (kVar.f26715f.getAndSet((i10 * 2) + 1, kVar2) == kVar2) {
                return 5;
            }
            kVar.m(i10, true);
            return 5;
        }
        return cVar.B(kVar, i10, obj, j10, obj2, z5);
    }

    public static void q(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f26685f;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (!(obj instanceof hk.j)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        hk.j jVar = (hk.j) obj;
        Unit unit = Unit.f27471a;
        k kVar = e.f26692a;
        d8.k kVarF = jVar.f(unit, null);
        if (kVarF == null) {
            return false;
        }
        jVar.j(kVarF);
        return true;
    }

    public final Object A(k kVar, int i10, long j10, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f26715f;
        Object objL = kVar.l(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f26682c;
        if (objL == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f26704n;
                }
                if (kVar.k(i10, objL, obj)) {
                    k();
                    return e.f26703m;
                }
            }
        } else if (objL == e.f26695d && kVar.k(i10, objL, e.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            kVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object objL2 = kVar.l(i10);
            if (objL2 == null || objL2 == e.f26696e) {
                if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.k(i10, objL2, e.f26699h)) {
                        k();
                        return e.f26705o;
                    }
                } else {
                    if (obj == null) {
                        return e.f26704n;
                    }
                    if (kVar.k(i10, objL2, obj)) {
                        k();
                        return e.f26703m;
                    }
                }
            } else if (objL2 != e.f26695d) {
                d8.k kVar2 = e.f26700j;
                if (objL2 == kVar2) {
                    return e.f26705o;
                }
                if (objL2 == e.f26699h) {
                    return e.f26705o;
                }
                if (objL2 == e.f26702l) {
                    k();
                    return e.f26705o;
                }
                if (objL2 != e.f26698g && kVar.k(i10, objL2, e.f26697f)) {
                    boolean z5 = objL2 instanceof t;
                    if (z5) {
                        objL2 = ((t) objL2).f26722a;
                    }
                    if (z(objL2)) {
                        kVar.o(i10, e.i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        kVar.n(i10, null);
                        return obj3;
                    }
                    kVar.o(i10, kVar2);
                    kVar.i();
                    if (z5) {
                        k();
                    }
                    return e.f26705o;
                }
            } else if (kVar.k(i10, objL2, e.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                kVar.n(i10, null);
                return obj4;
            }
        }
    }

    public final int B(k kVar, int i10, Object obj, long j10, Object obj2, boolean z5) {
        while (true) {
            Object objL = kVar.l(i10);
            if (objL == null) {
                if (!f(j10) || z5) {
                    if (z5) {
                        if (kVar.k(i10, null, e.f26700j)) {
                            kVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.k(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.k(i10, null, e.f26695d)) {
                    break;
                }
            } else {
                if (objL != e.f26696e) {
                    d8.k kVar2 = e.f26701k;
                    if (objL == kVar2) {
                        kVar.n(i10, null);
                        return 5;
                    }
                    if (objL == e.f26699h) {
                        kVar.n(i10, null);
                        return 5;
                    }
                    if (objL == e.f26702l) {
                        kVar.n(i10, null);
                        s();
                        return 4;
                    }
                    kVar.n(i10, null);
                    if (objL instanceof t) {
                        objL = ((t) objL).f26722a;
                    }
                    if (y(objL, obj)) {
                        kVar.o(i10, e.i);
                        return 0;
                    }
                    if (kVar.f26715f.getAndSet((i10 * 2) + 1, kVar2) != kVar2) {
                        kVar.m(i10, true);
                    }
                    return 5;
                }
                if (kVar.k(i10, objL, e.f26695d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void C(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.u()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f26684e;
            if (atomicLongFieldUpdater.get(cVar) > j10) {
                break;
            } else {
                cVar = this;
            }
        }
        int i10 = e.f26694c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f26685f;
            if (i11 < i10) {
                long j11 = atomicLongFieldUpdater.get(cVar);
                if (j11 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j11 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater.get(cVar);
                    long j14 = atomicLongFieldUpdater2.get(cVar);
                    long j15 = j14 & 4611686018427387903L;
                    boolean z5 = (j14 & 4611686018427387904L) != 0;
                    if (j13 == j15 && j13 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z5) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j14, 4611686018427387904L + j15);
                    }
                }
                while (true) {
                    long j16 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j16, j16 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // jk.r
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x019a, code lost:
    
        return kotlin.Unit.f27471a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017c A[RETURN] */
    @Override // jk.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.Object r23, mj.a r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.c.c(java.lang.Object, mj.a):java.lang.Object");
    }

    public final boolean f(long j10) {
        return j10 < f26684e.get(this) || j10 < f26683d.get(this) + ((long) this.f26690b);
    }

    public final boolean g(Throwable th2, boolean z5) {
        c cVar;
        boolean z10;
        long j10;
        long j11;
        long j12;
        Object obj;
        long j13;
        long j14;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f26682c;
        if (!z5) {
            cVar = this;
            break;
        }
        do {
            j14 = atomicLongFieldUpdater.get(this);
            if (((int) (j14 >> 60)) != 0) {
                cVar = this;
                break;
            }
            k kVar = e.f26692a;
            cVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j14, (j14 & 1152921504606846975L) + (((long) 1) << 60)));
        d8.k kVar2 = e.f26709s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26688j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, kVar2, th2)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != kVar2) {
                z10 = false;
                break;
            }
        }
        if (z5) {
            do {
                j13 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j13, (((long) 3) << 60) + (j13 & 1152921504606846975L)));
        } else {
            do {
                j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 >> 60);
                if (i10 == 0) {
                    j11 = j10 & 1152921504606846975L;
                    j12 = 2;
                } else {
                    if (i10 != 1) {
                        break;
                    }
                    j11 = j10 & 1152921504606846975L;
                    j12 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j10, (j12 << 60) + j11));
        }
        s();
        if (z10) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f26689k;
                obj = atomicReferenceFieldUpdater2.get(this);
                d8.k kVar3 = obj == null ? e.f26707q : e.f26708r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, kVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                k0.b(1, obj);
                ((Function1) obj).invoke(m());
                return z10;
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (jk.k) ((mk.b) mk.b.f28908b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final jk.k h(long r13) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.c.h(long):jk.k");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf A[SYNTHETIC] */
    @Override // jk.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = jk.c.f26682c
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.r(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.f(r1)
            r1 = r1 ^ r10
        L1b:
            jk.i r13 = jk.j.f26713a
            if (r1 == 0) goto L20
            return r13
        L20:
            d8.k r6 = jk.e.f26700j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = jk.c.f26686g
            java.lang.Object r1 = r1.get(r15)
            jk.k r1 = (jk.k) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.r(r2, r9)
            int r14 = jk.e.f26693b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f28938c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            jk.k r3 = b(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.o()
            jk.h r2 = new jk.h
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = e(r0, r1, r2, r3, r4, r6, r7)
            if (r9 == 0) goto Lbf
            r3 = 1
            if (r9 == r3) goto Lbc
            r10 = 2
            if (r9 == r10) goto L9b
            r2 = 3
            if (r9 == r2) goto L93
            r2 = 4
            if (r9 == r2) goto L7c
            r2 = 5
            if (r9 == r2) goto L76
            goto L79
        L76:
            r1.b()
        L79:
            r10 = r3
            r9 = 0
            goto L56
        L7c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = jk.c.f26683d
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L89
            r1.b()
        L89:
            java.lang.Throwable r1 = r15.o()
            jk.h r2 = new jk.h
            r2.<init>(r1)
            return r2
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9b:
            if (r7 == 0) goto Laa
            r1.i()
            java.lang.Throwable r1 = r15.o()
            jk.h r2 = new jk.h
            r2.<init>(r1)
            return r2
        Laa:
            boolean r3 = r6 instanceof hk.b2
            if (r3 == 0) goto Lb1
            hk.b2 r6 = (hk.b2) r6
            goto Lb2
        Lb1:
            r6 = 0
        Lb2:
            if (r6 == 0) goto Lb8
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb8:
            r1.i()
            return r13
        Lbc:
            kotlin.Unit r1 = kotlin.Unit.f27471a
            return r1
        Lbf:
            r1.b()
            kotlin.Unit r1 = kotlin.Unit.f27471a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.c.i(java.lang.Object):java.lang.Object");
    }

    @Override // jk.r
    public final b iterator() {
        return new b(this);
    }

    public final void j(long j10) {
        k kVar = (k) f26687h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f26683d;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(((long) this.f26690b) + j11, f26684e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, 1 + j11)) {
                long j12 = e.f26693b;
                long j13 = j11 / j12;
                int i10 = (int) (j11 % j12);
                if (kVar.f28938c != j13) {
                    k kVarL = l(j13, kVar);
                    if (kVarL != null) {
                        kVar = kVarL;
                    }
                }
                k kVar2 = kVar;
                if (A(kVar2, i10, j11, null) != e.f26705o || j11 < p()) {
                    kVar2.b();
                }
                kVar = kVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        q(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.c.k():void");
    }

    public final k l(long j10, k kVar) {
        Object objB;
        long j11;
        k kVar2 = e.f26692a;
        d dVar = d.f26691b;
        loop0: while (true) {
            objB = mk.a.b(kVar, j10, dVar);
            if (!mk.a.e(objB)) {
                mk.r rVarC = mk.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26687h;
                    mk.r rVar = (mk.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f28938c >= rVarC.f28938c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.f()) {
                                rVarC.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (mk.a.e(objB)) {
            s();
            if (kVar.f28938c * ((long) e.f26693b) < p()) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) mk.a.c(objB);
            long j12 = kVar3.f28938c;
            if (!u() && j10 <= f26684e.get(this) / ((long) e.f26693b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
                    mk.r rVar2 = (mk.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f28938c >= j12 || !kVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (kVar3.f()) {
                                kVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j12 <= j10) {
                return kVar3;
            }
            long j13 = j12 * ((long) e.f26693b);
            do {
                j11 = f26683d.get(this);
                if (j11 >= j13) {
                    break;
                }
            } while (!f26683d.compareAndSet(this, j11, j13));
            if (j12 * ((long) e.f26693b) < p()) {
                kVar3.b();
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) f26688j.get(this);
    }

    public final Throwable n() {
        Throwable thM = m();
        return thM == null ? new l("Channel was closed") : thM;
    }

    public final Throwable o() {
        Throwable thM = m();
        return thM == null ? new xx1("Channel was closed") : thM;
    }

    public final long p() {
        return f26682c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (jk.k) ((mk.b) mk.b.f28908b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(long r14, boolean r16) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.c.r(long, boolean):boolean");
    }

    public final boolean s() {
        return r(f26682c.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0196, code lost:
    
        r16 = r7;
        r3 = (jk.k) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019f, code lost:
    
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.c.toString():java.lang.String");
    }

    public final boolean u() {
        long j10 = f26684e.get(this);
        return j10 == 0 || j10 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(long r5, jk.k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f28938c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            mk.b r0 = r7.c()
            jk.k r0 = (jk.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            mk.b r5 = r7.c()
            jk.k r5 = (jk.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = jk.c.i
            java.lang.Object r6 = r5.get(r4)
            mk.r r6 = (mk.r) r6
            long r0 = r6.f28938c
            long r2 = r7.f28938c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.c.v(long, jk.k):void");
    }

    public final Object w(Object obj, mj.a frame) {
        hk.l lVar = new hk.l(1, nj.f.b(frame));
        lVar.t();
        Throwable thO = o();
        ij.k kVar = ij.m.f21341c;
        lVar.resumeWith(h5.s(thO));
        Object objS = lVar.s();
        nj.a aVar = nj.a.f29512b;
        if (objS == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objS == aVar ? objS : Unit.f27471a;
    }

    public final void x(b2 b2Var, boolean z5) {
        if (b2Var instanceof hk.j) {
            mj.a aVar = (mj.a) b2Var;
            ij.k kVar = ij.m.f21341c;
            aVar.resumeWith(h5.s(z5 ? n() : o()));
            return;
        }
        if (!(b2Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + b2Var).toString());
        }
        b bVar = (b) b2Var;
        hk.l lVar = bVar.f26680c;
        Intrinsics.b(lVar);
        bVar.f26680c = null;
        bVar.f26679b = e.f26702l;
        Throwable thM = bVar.f26681d.m();
        if (thM == null) {
            ij.k kVar2 = ij.m.f21341c;
            lVar.resumeWith(Boolean.FALSE);
        } else {
            ij.k kVar3 = ij.m.f21341c;
            lVar.resumeWith(h5.s(thM));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof hk.j)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            hk.j jVar = (hk.j) obj;
            k kVar = e.f26692a;
            d8.k kVarF = jVar.f(obj2, null);
            if (kVarF == null) {
                return false;
            }
            jVar.j(kVarF);
            return true;
        }
        b bVar = (b) obj;
        hk.l lVar = bVar.f26680c;
        Intrinsics.b(lVar);
        bVar.f26680c = null;
        bVar.f26679b = obj2;
        Boolean bool = Boolean.TRUE;
        k kVar2 = e.f26692a;
        d8.k kVarF2 = lVar.f(bool, null);
        if (kVarF2 == null) {
            return false;
        }
        lVar.j(kVarF2);
        return true;
    }
}

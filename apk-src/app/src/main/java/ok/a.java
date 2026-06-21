package ok;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.f0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30698j = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f30699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f30700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f30701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f30702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f30703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30705h;
    public final /* synthetic */ c i;
    private volatile int indexInArray;

    @Nullable
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i) {
        this.i = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f30699b = new m();
        this.f30700c = new f0();
        this.f30701d = b.f30709e;
        this.nextParkedWorker = c.f30714l;
        int iNanoTime = (int) System.nanoTime();
        this.f30704g = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = ok.m.f30739d.get(r10);
        r0 = ok.m.f30738c.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (ok.m.f30740e.get(r10) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r10.b(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r8 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ok.i a(boolean r12) {
        /*
            r11 = this;
            ok.b r0 = r11.f30701d
            ok.b r1 = ok.b.f30706b
            ok.c r3 = r11.i
            r8 = 0
            r9 = 1
            ok.m r10 = r11.f30699b
            if (r0 != r1) goto Le
            goto L86
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ok.c.f30712j
        L10:
            long r4 = r0.get(r3)
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r4
            r6 = 42
            long r1 = r1 >> r6
            int r1 = (int) r1
            if (r1 != 0) goto L73
            r10.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = ok.m.f30737b
            java.lang.Object r0 = r12.get(r10)
            ok.i r0 = (ok.i) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f30728c
            if (r1 != r9) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r10, r0, r8)
            if (r1 == 0) goto L3a
            r8 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r10)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = ok.m.f30739d
            int r12 = r12.get(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = ok.m.f30738c
            int r0 = r0.get(r10)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = ok.m.f30740e
            int r1 = r1.get(r10)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            ok.i r1 = r10.b(r0, r9)
            if (r1 == 0) goto L4d
            r8 = r1
        L61:
            if (r8 != 0) goto L72
            ok.f r12 = r3.f30720g
            java.lang.Object r12 = r12.d()
            ok.i r12 = (ok.i) r12
            if (r12 != 0) goto L71
            ok.i r12 = r11.i(r9)
        L71:
            return r12
        L72:
            return r8
        L73:
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r6 = r4 - r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = ok.c.f30712j
            boolean r1 = r2.compareAndSet(r3, r4, r6)
            if (r1 == 0) goto L10
            ok.b r0 = ok.b.f30706b
            r11.f30701d = r0
        L86:
            if (r12 == 0) goto Lba
            int r12 = r3.f30715b
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L93
            goto L94
        L93:
            r9 = 0
        L94:
            if (r9 == 0) goto L9d
            ok.i r12 = r11.e()
            if (r12 == 0) goto L9d
            return r12
        L9d:
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = ok.m.f30737b
            java.lang.Object r12 = r12.getAndSet(r10, r8)
            ok.i r12 = (ok.i) r12
            if (r12 != 0) goto Lae
            ok.i r12 = r10.a()
        Lae:
            if (r12 == 0) goto Lb1
            return r12
        Lb1:
            if (r9 != 0) goto Lc1
            ok.i r12 = r11.e()
            if (r12 == 0) goto Lc1
            return r12
        Lba:
            ok.i r12 = r11.e()
            if (r12 == 0) goto Lc1
            return r12
        Lc1:
            r12 = 3
            ok.i r12 = r11.i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ok.a.a(boolean):ok.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i10 = this.f30704g;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f30704g = i13;
        int i14 = i - 1;
        return (i14 & i) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % i;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.i;
        if (iD == 0) {
            i iVar = (i) cVar.f30719f.d();
            return iVar != null ? iVar : (i) cVar.f30720g.d();
        }
        i iVar2 = (i) cVar.f30720g.d();
        return iVar2 != null ? iVar2 : (i) cVar.f30719f.d();
    }

    public final void f(int i) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.i.f30718e);
        sb2.append("-worker-");
        sb2.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb2.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f30701d;
        boolean z5 = bVar2 == b.f30706b;
        if (z5) {
            c.f30712j.addAndGet(this.i, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f30701d = bVar;
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ok.i i(int r26) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ok.a.i(int):ok.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ok.a.run():void");
    }
}

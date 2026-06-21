package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.os.Trace;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f3550h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f3551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f3552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f3553l;

    public b1(ut utVar, v0 v0Var, w0 w0Var) {
        this.f3553l = utVar;
        this.f3547e = v0Var;
        this.f3551j = w0Var;
        this.f3548f = new u0(0);
        this.f3549g = new ro0(0);
        this.f3550h = new ro0(0);
        rg0 rg0Var = new rg0();
        int i = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i = iHighestOneBit + iHighestOneBit;
        }
        rg0Var.f9931a = 0;
        rg0Var.f9932b = -1;
        rg0Var.f9933c = 0;
        rg0Var.f9934d = new long[i];
        rg0Var.f9935e = i - 1;
        this.i = rg0Var;
        this.f3543a = -9223372036854775807L;
        this.f3552k = bs.f3859d;
        this.f3544b = -9223372036854775807L;
        this.f3545c = -9223372036854775807L;
    }

    public void a(long j10, long j11) {
        final l6.i iVar = (l6.i) this.f3547e;
        o4.c cVar = (o4.c) iVar.f27979d;
        u0 u0Var = (u0) this.f3549g;
        o4.r rVar = (o4.r) this.f3548f;
        rg0 rg0Var = (rg0) this.f3551j;
        while (true) {
            int i = rg0Var.f9933c;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            long j12 = rg0Var.f9934d[rg0Var.f9931a];
            Long l10 = (Long) ((ro0) this.i).d(j12);
            if (l10 != null && l10.longValue() != this.f3546d) {
                this.f3546d = l10.longValue();
                rVar.e(2);
            }
            o4.r rVar2 = rVar;
            rg0 rg0Var2 = rg0Var;
            int iA = ((o4.r) this.f3548f).a(j12, j10, j11, this.f3546d, false, false, u0Var);
            if (iA != 5 && iA != 4) {
                ((w0) this.f3552k).a(j12, u0Var.f10771b);
            }
            if (iA == 0 || iA == 1) {
                this.f3544b = j12;
                boolean z5 = iA == 0;
                long jA = rg0Var2.a();
                j3.y0 y0Var = (j3.y0) ((ro0) this.f3550h).d(jA);
                if (y0Var != null && !y0Var.equals(j3.y0.f26415d) && !y0Var.equals((j3.y0) this.f3553l)) {
                    this.f3553l = y0Var;
                    j3.n nVar = new j3.n();
                    nVar.f26299t = y0Var.f26416a;
                    nVar.f26300u = y0Var.f26417b;
                    nVar.f26292m = j3.c0.n("video/raw");
                    iVar.f27978c = new j3.o(nVar);
                    cVar.i.execute(new m3.c0(8, iVar, y0Var));
                }
                long jNanoTime = z5 ? System.nanoTime() : u0Var.f10772c;
                rVar = rVar2;
                boolean z10 = rVar.f29688e != 3;
                rVar.f29688e = 3;
                rVar.f29694l.getClass();
                rVar.f29690g = m3.z.M(SystemClock.elapsedRealtime());
                if (z10 && cVar.f29605e != null) {
                    final int i10 = 0;
                    cVar.i.execute(new Runnable() { // from class: o4.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ((c) iVar.f27979d).f29608h.a();
                                    break;
                                default:
                                    ((c) iVar.f27979d).f29608h.b();
                                    break;
                            }
                        }
                    });
                }
                j3.o oVar = (j3.o) iVar.f27978c;
                cVar.f29609j.a(jA, jNanoTime, oVar == null ? new j3.o(new j3.n()) : oVar, null);
                o4.f fVar = (o4.f) cVar.f29604d.remove();
                fVar.f29613c.K0(fVar.f29611a, fVar.f29612b, jNanoTime);
            } else {
                if (iA == 2 || iA == 3) {
                    this.f3544b = j12;
                    rg0Var2.a();
                    final int i11 = 1;
                    cVar.i.execute(new Runnable() { // from class: o4.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    ((c) iVar.f27979d).f29608h.a();
                                    break;
                                default:
                                    ((c) iVar.f27979d).f29608h.b();
                                    break;
                            }
                        }
                    });
                    o4.f fVar2 = (o4.f) cVar.f29604d.remove();
                    o4.i iVar2 = fVar2.f29613c;
                    b4.m mVar = fVar2.f29611a;
                    int i12 = fVar2.f29612b;
                    Trace.beginSection("dropVideoBuffer");
                    mVar.g(i12);
                    Trace.endSection();
                    iVar2.P0(0, 1);
                } else {
                    if (iA != 4) {
                        if (iA != 5) {
                            throw new IllegalStateException(String.valueOf(iA));
                        }
                        return;
                    }
                    this.f3544b = j12;
                }
                rVar = rVar2;
            }
            rg0Var = rg0Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(long r24, long r26) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b1.b(long, long):void");
    }

    public b1(l6.i iVar, o4.r rVar, w0 w0Var) {
        this.f3547e = iVar;
        this.f3548f = rVar;
        this.f3552k = w0Var;
        this.f3549g = new u0(6);
        this.f3550h = new ro0(1);
        this.i = new ro0(1);
        rg0 rg0Var = new rg0();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        rg0Var.f9931a = 0;
        rg0Var.f9932b = -1;
        rg0Var.f9933c = 0;
        rg0Var.f9934d = new long[iHighestOneBit];
        rg0Var.f9935e = iHighestOneBit - 1;
        this.f3551j = rg0Var;
        this.f3543a = -9223372036854775807L;
        this.f3553l = j3.y0.f26415d;
        this.f3544b = -9223372036854775807L;
        this.f3545c = -9223372036854775807L;
    }
}

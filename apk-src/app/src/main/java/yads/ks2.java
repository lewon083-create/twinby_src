package yads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qe f40313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb2 f40315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public js2 f40316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public js2 f40317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public js2 f40318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40319g;

    public ks2(qe qeVar) {
        this.f40313a = qeVar;
        int iB = ((ib0) qeVar).b();
        this.f40314b = iB;
        this.f40315c = new lb2(32);
        js2 js2Var = new js2(iB, 0L);
        this.f40316d = js2Var;
        this.f40317e = js2Var;
        this.f40318f = js2Var;
    }

    public final void a(js2 js2Var) {
        if (js2Var.f39970c == null) {
            return;
        }
        ib0 ib0Var = (ib0) this.f40313a;
        synchronized (ib0Var) {
            js2 js2Var2 = js2Var;
            while (js2Var2 != null) {
                try {
                    pe[] peVarArr = ib0Var.f39486g;
                    int i = ib0Var.f39485f;
                    ib0Var.f39485f = i + 1;
                    pe peVar = js2Var2.f39970c;
                    peVar.getClass();
                    peVarArr[i] = peVar;
                    ib0Var.f39484e--;
                    js2Var2 = js2Var2.f39971d;
                    if (js2Var2 == null || js2Var2.f39970c == null) {
                        js2Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ib0Var.notifyAll();
        }
        js2Var.f39970c = null;
        js2Var.f39971d = null;
    }

    public final void a(long j10) {
        js2 js2Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            js2Var = this.f40316d;
            if (j10 < js2Var.f39969b) {
                break;
            }
            qe qeVar = this.f40313a;
            pe peVar = js2Var.f39970c;
            ib0 ib0Var = (ib0) qeVar;
            synchronized (ib0Var) {
                pe[] peVarArr = ib0Var.f39486g;
                int i = ib0Var.f39485f;
                ib0Var.f39485f = i + 1;
                peVarArr[i] = peVar;
                ib0Var.f39484e--;
                ib0Var.notifyAll();
            }
            js2 js2Var2 = this.f40316d;
            js2Var2.f39970c = null;
            js2 js2Var3 = js2Var2.f39971d;
            js2Var2.f39971d = null;
            this.f40316d = js2Var3;
        }
        if (this.f40317e.f39968a < js2Var.f39968a) {
            this.f40317e = js2Var;
        }
    }

    public static js2 a(js2 js2Var, long j10, ByteBuffer byteBuffer, int i) {
        while (j10 >= js2Var.f39969b) {
            js2Var = js2Var.f39971d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (js2Var.f39969b - j10));
            pe peVar = js2Var.f39970c;
            byteBuffer.put(peVar.f41903a, ((int) (j10 - js2Var.f39968a)) + peVar.f41904b, iMin);
            i -= iMin;
            j10 += (long) iMin;
            if (j10 == js2Var.f39969b) {
                js2Var = js2Var.f39971d;
            }
        }
        return js2Var;
    }

    public static js2 a(js2 js2Var, long j10, byte[] bArr, int i) {
        while (j10 >= js2Var.f39969b) {
            js2Var = js2Var.f39971d;
        }
        int i10 = i;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (js2Var.f39969b - j10));
            pe peVar = js2Var.f39970c;
            System.arraycopy(peVar.f41903a, ((int) (j10 - js2Var.f39968a)) + peVar.f41904b, bArr, i - i10, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == js2Var.f39969b) {
                js2Var = js2Var.f39971d;
            }
        }
        return js2Var;
    }

    public static js2 a(js2 js2Var, sa0 sa0Var, ls2 ls2Var, lb2 lb2Var) {
        js2 js2VarA;
        if (sa0Var.b(1073741824)) {
            long j10 = ls2Var.f40655b;
            int iR = 1;
            lb2Var.c(1);
            js2 js2VarA2 = a(js2Var, j10, lb2Var.f40463a, 1);
            long j11 = j10 + 1;
            byte b2 = lb2Var.f40463a[0];
            boolean z5 = (b2 & 128) != 0;
            int i = b2 & 127;
            m20 m20Var = sa0Var.f42863c;
            byte[] bArr = m20Var.f40751a;
            if (bArr == null) {
                m20Var.f40751a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            js2VarA = a(js2VarA2, j11, m20Var.f40751a, i);
            long j12 = j11 + ((long) i);
            if (z5) {
                lb2Var.c(2);
                js2VarA = a(js2VarA, j12, lb2Var.f40463a, 2);
                j12 += 2;
                iR = lb2Var.r();
            }
            int i10 = iR;
            int[] iArr = m20Var.f40754d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = m20Var.f40755e;
            if (iArr3 == null || iArr3.length < i10) {
                iArr3 = new int[i10];
            }
            int[] iArr4 = iArr3;
            if (z5) {
                int i11 = i10 * 6;
                lb2Var.c(i11);
                js2VarA = a(js2VarA, j12, lb2Var.f40463a, i11);
                j12 += (long) i11;
                lb2Var.e(0);
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr2[i12] = lb2Var.r();
                    iArr4[i12] = lb2Var.p();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = ls2Var.f40654a - ((int) (j12 - ls2Var.f40655b));
            }
            o73 o73Var = ls2Var.f40656c;
            int i13 = lb3.f40466a;
            m20Var.a(i10, iArr2, iArr4, o73Var.f41484b, m20Var.f40751a, o73Var.f41483a, o73Var.f41485c, o73Var.f41486d);
            long j13 = ls2Var.f40655b;
            int i14 = (int) (j12 - j13);
            ls2Var.f40655b = j13 + ((long) i14);
            ls2Var.f40654a -= i14;
        } else {
            js2VarA = js2Var;
        }
        if (sa0Var.b(268435456)) {
            lb2Var.c(4);
            js2 js2VarA3 = a(js2VarA, ls2Var.f40655b, lb2Var.f40463a, 4);
            int iP = lb2Var.p();
            ls2Var.f40655b += 4;
            ls2Var.f40654a -= 4;
            sa0Var.c(iP);
            js2 js2VarA4 = a(js2VarA3, ls2Var.f40655b, sa0Var.f42864d, iP);
            ls2Var.f40655b += (long) iP;
            int i15 = ls2Var.f40654a - iP;
            ls2Var.f40654a = i15;
            ByteBuffer byteBuffer = sa0Var.f42867g;
            if (byteBuffer != null && byteBuffer.capacity() >= i15) {
                sa0Var.f42867g.clear();
            } else {
                sa0Var.f42867g = ByteBuffer.allocate(i15);
            }
            return a(js2VarA4, ls2Var.f40655b, sa0Var.f42867g, ls2Var.f40654a);
        }
        sa0Var.c(ls2Var.f40654a);
        return a(js2VarA, ls2Var.f40655b, sa0Var.f42864d, ls2Var.f40654a);
    }
}

package yads;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import zl.c1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class px2 implements sj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u30 f42099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rb2 f42100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f42101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qr f42102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nr f42103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yr f42104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f42105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f42106h;
    private volatile boolean i;

    public px2(hm1 hm1Var, e30 e30Var, qr qrVar, Executor executor) {
        ni.a(hm1Var.f39245c);
        this.f42099a = a(hm1Var.f39245c.f37092a);
        this.f42100b = e30Var;
        this.f42101c = new ArrayList(hm1Var.f39245c.f37095d);
        this.f42102d = qrVar;
        this.f42105g = executor;
        this.f42103e = (nr) ni.a(qrVar.b());
        this.f42104f = qrVar.c();
        this.f42106h = new ArrayList();
    }

    private void b(cs2 cs2Var) {
        synchronized (this.f42106h) {
            this.f42106h.remove(cs2Var);
        }
    }

    public abstract ArrayList a(rr rrVar, ev0 ev0Var, boolean z5);

    @Override // yads.sj0
    public final void cancel() {
        synchronized (this.f42106h) {
            try {
                this.i = true;
                for (int i = 0; i < this.f42106h.size(); i++) {
                    ((cs2) this.f42106h.get(i)).cancel(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // yads.sj0
    public final void remove() {
        rr rrVarA = this.f42102d.a(null, 1, -1000);
        try {
            try {
                ArrayList arrayListA = a(rrVarA, (ev0) a((cs2) new lx2(this, rrVarA, this.f42099a), true), true);
                for (int i = 0; i < arrayListA.size(); i++) {
                    nr nrVar = this.f42103e;
                    yr yrVar = this.f42104f;
                    u30 u30Var = ((nx2) arrayListA.get(i)).f41390c;
                    ((c1) yrVar).getClass();
                    ((yy2) nrVar).c(yr.b(u30Var));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                nr nrVar2 = this.f42103e;
                yr yrVar2 = this.f42104f;
                u30 u30Var2 = this.f42099a;
                ((c1) yrVar2).getClass();
                ((yy2) nrVar2).c(yr.b(u30Var2));
                return;
            } catch (Exception unused2) {
            }
            nr nrVar3 = this.f42103e;
            yr yrVar3 = this.f42104f;
            u30 u30Var3 = this.f42099a;
            ((c1) yrVar3).getClass();
            ((yy2) nrVar3).c(yr.b(u30Var3));
        } catch (Throwable th2) {
            nr nrVar4 = this.f42103e;
            yr yrVar4 = this.f42104f;
            u30 u30Var4 = this.f42099a;
            ((c1) yrVar4).getClass();
            ((yy2) nrVar4).c(yr.b(u30Var4));
            throw th2;
        }
    }

    private void a(cs2 cs2Var) {
        synchronized (this.f42106h) {
            try {
                if (this.i) {
                    throw new InterruptedException();
                }
                this.f42106h.add(cs2Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object a(cs2 cs2Var, boolean z5) throws ExecutionException, InterruptedException, IOException {
        if (z5) {
            cs2Var.run();
            try {
                cs2Var.f37485c.a();
                return cs2Var.c();
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i = lb3.f40466a;
                throw e3;
            }
        }
        if (!this.i) {
            a(cs2Var);
            this.f42105g.execute(cs2Var);
            try {
                try {
                    cs2Var.f37485c.a();
                    Object objC = cs2Var.c();
                    cs2Var.f37485c.b();
                    synchronized (this.f42106h) {
                        this.f42106h.remove(cs2Var);
                    }
                    return objC;
                } catch (ExecutionException e7) {
                    Throwable cause2 = e7.getCause();
                    cause2.getClass();
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    int i10 = lb3.f40466a;
                    throw e7;
                }
            } catch (Throwable th2) {
                cs2Var.f37485c.b();
                b(cs2Var);
                throw th2;
            }
        }
        throw new InterruptedException();
    }

    public static u30 a(Uri uri) {
        Map map = Collections.EMPTY_MAP;
        ni.a(uri, "The uri must be set.");
        return new u30(uri, 0L, 1, null, map, 0L, -1L, null, 1, null);
    }

    private void a(int i) {
        synchronized (this.f42106h) {
            this.f42106h.remove(i);
        }
    }

    @Override // yads.sj0
    public final void a(rj0 rj0Var) throws Throwable {
        rr rrVarA;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        boolean z5 = true;
        try {
            rr rrVarA2 = this.f42102d.a();
            ev0 ev0VarA = (ev0) a((cs2) new lx2(this, rrVarA2, this.f42099a), false);
            if (!this.f42101c.isEmpty()) {
                ev0VarA = ((c30) ev0VarA).a(this.f42101c);
            }
            ArrayList arrayListA = a(rrVarA2, ev0VarA, false);
            Collections.sort(arrayListA);
            a(arrayListA, this.f42104f);
            int size = arrayListA.size();
            int size2 = arrayListA.size() - 1;
            int i = 0;
            long j10 = 0;
            long j11 = 0;
            while (size2 >= 0) {
                try {
                    u30 u30Var = ((nx2) arrayListA.get(size2)).f41390c;
                    ((c1) this.f42104f).getClass();
                    String strB = yr.b(u30Var);
                    boolean z10 = z5;
                    long j12 = u30Var.f43539g;
                    if (j12 == -1) {
                        long jA = qz.a(((yy2) this.f42103e).b(strB));
                        if (jA != -1) {
                            j12 = jA - u30Var.f43538f;
                        }
                    }
                    long j13 = j12;
                    long jA2 = ((yy2) this.f42103e).a(strB, u30Var.f43538f, j13);
                    j11 += jA2;
                    if (j13 != -1) {
                        if (j13 == jA2) {
                            i++;
                            arrayListA.remove(size2);
                        }
                        if (j10 != -1) {
                            j10 += j13;
                        }
                    } else {
                        j10 = -1;
                    }
                    size2--;
                    z5 = z10;
                } catch (Throwable th2) {
                    th = th2;
                    for (int i10 = 0; i10 < this.f42106h.size(); i10++) {
                        ((cs2) this.f42106h.get(i10)).cancel(true);
                    }
                    for (int size3 = this.f42106h.size() - 1; size3 >= 0; size3--) {
                        ((cs2) this.f42106h.get(size3)).f37485c.b();
                        a(size3);
                    }
                    throw th;
                }
            }
            boolean z11 = z5;
            mx2 mx2Var = rj0Var != null ? new mx2(rj0Var, j10, size, j11, i) : null;
            arrayDeque.addAll(arrayListA);
            while (!this.i && !arrayDeque.isEmpty()) {
                if (!arrayDeque2.isEmpty()) {
                    ox2 ox2Var = (ox2) arrayDeque2.removeFirst();
                    rrVarA = ox2Var.i;
                    bArr = ox2Var.f41762k;
                } else {
                    rrVarA = this.f42102d.a();
                    bArr = new byte[131072];
                }
                ox2 ox2Var2 = new ox2((nx2) arrayDeque.removeFirst(), rrVarA, mx2Var, bArr);
                a(ox2Var2);
                this.f42105g.execute(ox2Var2);
                for (int size4 = this.f42106h.size() - 1; size4 >= 0; size4--) {
                    ox2 ox2Var3 = (ox2) this.f42106h.get(size4);
                    if (arrayDeque.isEmpty() || ox2Var3.isDone()) {
                        try {
                            ox2Var3.f37485c.a();
                            ox2Var3.c();
                            a(size4);
                            arrayDeque2.addLast(ox2Var3);
                        } catch (ExecutionException e3) {
                            Throwable cause = e3.getCause();
                            cause.getClass();
                            if (cause instanceof IOException) {
                                throw ((IOException) cause);
                            }
                            throw cause;
                        }
                    }
                }
                ox2Var2.f37484b.b();
            }
            for (int i11 = 0; i11 < this.f42106h.size(); i11++) {
                ((cs2) this.f42106h.get(i11)).cancel(z11);
            }
            for (int size5 = this.f42106h.size() - (z11 ? 1 : 0); size5 >= 0; size5--) {
                ((cs2) this.f42106h.get(size5)).f37485c.b();
                a(size5);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.util.ArrayList r16, yads.yr r17) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.px2.a(java.util.ArrayList, yads.yr):void");
    }
}

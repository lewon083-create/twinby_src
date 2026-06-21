package yads;

import android.net.Uri;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lu implements ps2, ux2, ag1, eg1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f40663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nx0[] f40664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f40665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b30 f40666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tx2 f40667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dn1 f40668h;
    public final ae0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final hg1 f40669j = new hg1("ChunkSampleStream");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final gu f40670k = new gu();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f40671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f40672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final os2 f40673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final os2[] f40674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lo f40675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public cu f40676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public nx0 f40677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ku f40678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f40679t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f40680u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f40681v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public jo f40682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f40683x;

    public lu(int i, int[] iArr, nx0[] nx0VarArr, nc0 nc0Var, tx2 tx2Var, qe qeVar, long j10, tk0 tk0Var, pk0 pk0Var, ae0 ae0Var, dn1 dn1Var) {
        this.f40662b = i;
        this.f40663c = iArr;
        this.f40664d = nx0VarArr;
        this.f40666f = nc0Var;
        this.f40667g = tx2Var;
        this.f40668h = dn1Var;
        this.i = ae0Var;
        ArrayList arrayList = new ArrayList();
        this.f40671l = arrayList;
        this.f40672m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f40674o = new os2[length];
        this.f40665e = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        os2[] os2VarArr = new os2[i10];
        os2 os2VarA = os2.a(qeVar, tk0Var, pk0Var);
        this.f40673n = os2VarA;
        int i11 = 0;
        iArr2[0] = i;
        os2VarArr[0] = os2VarA;
        while (i11 < length) {
            os2 os2VarA2 = os2.a(qeVar);
            this.f40674o[i11] = os2VarA2;
            int i12 = i11 + 1;
            os2VarArr[i12] = os2VarA2;
            iArr2[i12] = this.f40663c[i11];
            i11 = i12;
        }
        this.f40675p = new lo(iArr2, os2VarArr);
        this.f40679t = j10;
        this.f40680u = j10;
    }

    public final jo a(int i) {
        jo joVar = (jo) this.f40671l.get(i);
        ArrayList arrayList = this.f40671l;
        int size = arrayList.size();
        int i10 = lb3.f40466a;
        if (i < 0 || size > arrayList.size() || i > size) {
            throw new IllegalArgumentException();
        }
        if (i != size) {
            arrayList.subList(i, size).clear();
        }
        this.f40681v = Math.max(this.f40681v, this.f40671l.size());
        int i11 = 0;
        this.f40673n.c(joVar.a(0));
        while (true) {
            os2[] os2VarArr = this.f40674o;
            if (i11 >= os2VarArr.length) {
                return joVar;
            }
            os2 os2Var = os2VarArr[i11];
            i11++;
            os2Var.c(joVar.a(i11));
        }
    }

    public final boolean b(int i) {
        os2 os2Var;
        jo joVar = (jo) this.f40671l.get(i);
        os2 os2Var2 = this.f40673n;
        if (os2Var2.f41709q + os2Var2.f41711s > joVar.a(0)) {
            return true;
        }
        int i10 = 0;
        do {
            os2[] os2VarArr = this.f40674o;
            if (i10 >= os2VarArr.length) {
                return false;
            }
            os2Var = os2VarArr[i10];
            i10++;
        } while (os2Var.f41709q + os2Var.f41711s <= joVar.a(i10));
        return true;
    }

    public final boolean c() {
        return this.f40679t != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x02b4  */
    @Override // yads.ux2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean continueLoading(long r57) {
        /*
            Method dump skipped, instruction units count: 1267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.lu.continueLoading(long):boolean");
    }

    public final void d() {
        os2 os2Var = this.f40673n;
        int iA = a(os2Var.f41709q + os2Var.f41711s, this.f40681v - 1);
        while (true) {
            int i = this.f40681v;
            if (i > iA) {
                return;
            }
            this.f40681v = i + 1;
            jo joVar = (jo) this.f40671l.get(i);
            nx0 nx0Var = joVar.f37503d;
            if (!nx0Var.equals(this.f40677r)) {
                dn1 dn1Var = this.f40668h;
                dn1Var.a(new jm1(1, this.f40662b, nx0Var, joVar.f37504e, joVar.f37505f, dn1Var.a(joVar.f37506g), -9223372036854775807L));
            }
            this.f40677r = nx0Var;
        }
    }

    @Override // yads.ux2
    public final long getBufferedPositionUs() {
        long j10;
        if (this.f40683x) {
            return Long.MIN_VALUE;
        }
        if (c()) {
            return this.f40679t;
        }
        long jMax = this.f40680u;
        jo joVar = (jo) gf.a.g(1, this.f40671l);
        if (!joVar.d()) {
            joVar = this.f40671l.size() > 1 ? (jo) gf.a.g(2, this.f40671l) : null;
        }
        if (joVar != null) {
            jMax = Math.max(jMax, joVar.f37507h);
        }
        os2 os2Var = this.f40673n;
        synchronized (os2Var) {
            j10 = os2Var.f41714v;
        }
        return Math.max(jMax, j10);
    }

    @Override // yads.ux2
    public final long getNextLoadPositionUs() {
        if (c()) {
            return this.f40679t;
        }
        if (this.f40683x) {
            return Long.MIN_VALUE;
        }
        return ((jo) gf.a.g(1, this.f40671l)).f37507h;
    }

    @Override // yads.ux2
    public final boolean isLoading() {
        return this.f40669j.b();
    }

    @Override // yads.ps2
    public final boolean isReady() {
        return !c() && this.f40673n.a(this.f40683x);
    }

    @Override // yads.ux2
    public final void reevaluateBuffer(long j10) {
        if (this.f40669j.f39175c == null && !c()) {
            if (this.f40669j.b()) {
                cu cuVar = this.f40676q;
                cuVar.getClass();
                boolean z5 = cuVar instanceof jo;
                if (z5 && b(this.f40671l.size() - 1)) {
                    return;
                }
                b30 b30Var = this.f40666f;
                List list = this.f40672m;
                nc0 nc0Var = (nc0) b30Var;
                if (nc0Var.f41222l == null && nc0Var.i.a(j10, cuVar, list)) {
                    cg1 cg1Var = this.f40669j.f39174b;
                    if (cg1Var == null) {
                        throw new IllegalStateException();
                    }
                    cg1Var.a(false);
                    if (z5) {
                        this.f40682w = (jo) cuVar;
                        return;
                    }
                    return;
                }
                return;
            }
            b30 b30Var2 = this.f40666f;
            List list2 = this.f40672m;
            nc0 nc0Var2 = (nc0) b30Var2;
            int size = (nc0Var2.f41222l != null || nc0Var2.i.f() < 2) ? list2.size() : nc0Var2.i.a(j10, list2);
            if (size < this.f40671l.size()) {
                if (this.f40669j.b()) {
                    throw new IllegalStateException();
                }
                int size2 = this.f40671l.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!b(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size == -1) {
                    return;
                }
                long j11 = ((jo) gf.a.g(1, this.f40671l)).f37507h;
                jo joVarA = a(size);
                if (this.f40671l.isEmpty()) {
                    this.f40679t = this.f40680u;
                }
                this.f40683x = false;
                dn1 dn1Var = this.f40668h;
                dn1Var.b(new jm1(1, this.f40662b, null, 3, null, dn1Var.a(joVarA.f37506g), dn1Var.a(j11)));
            }
        }
    }

    @Override // yads.ps2
    public final void a() throws IOException {
        this.f40669j.a(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
        os2 os2Var = this.f40673n;
        nk0 nk0Var = os2Var.f41701h;
        if (nk0Var != null && nk0Var.getState() == 1) {
            mk0 mk0VarC = os2Var.f41701h.c();
            mk0VarC.getClass();
            throw mk0VarC;
        }
        if (this.f40669j.b()) {
            return;
        }
        nc0 nc0Var = (nc0) this.f40666f;
        zo zoVar = nc0Var.f41222l;
        if (zoVar == null) {
            nc0Var.f41212a.a();
            return;
        }
        throw zoVar;
    }

    @Override // yads.eg1
    public final void b() {
        os2 os2Var = this.f40673n;
        os2Var.b(true);
        os2Var.d();
        for (os2 os2Var2 : this.f40674o) {
            os2Var2.b(true);
            os2Var2.d();
        }
        for (lc0 lc0Var : ((nc0) this.f40666f).f41219h) {
            fu fuVar = lc0Var.f40480a;
            if (fuVar != null) {
                ((ar) fuVar).f36837b.release();
            }
        }
        ku kuVar = this.f40678s;
        if (kuVar != null) {
            h30 h30Var = (h30) kuVar;
            synchronized (h30Var) {
                ve2 ve2Var = (ve2) h30Var.f39001o.remove(this);
                if (ve2Var != null) {
                    os2 os2Var3 = ve2Var.f44008a;
                    os2Var3.b(true);
                    os2Var3.d();
                }
            }
        }
    }

    @Override // yads.ag1
    public final void a(dg1 dg1Var, long j10, long j11, boolean z5) {
        cu cuVar = (cu) dg1Var;
        this.f40676q = null;
        this.f40682w = null;
        long j12 = cuVar.f37500a;
        Uri uri = cuVar.i.f43545c;
        xf1 xf1Var = new xf1();
        this.i.getClass();
        dn1 dn1Var = this.f40668h;
        dn1Var.a(xf1Var, new jm1(cuVar.f37502c, this.f40662b, cuVar.f37503d, cuVar.f37504e, cuVar.f37505f, dn1Var.a(cuVar.f37506g), dn1Var.a(cuVar.f37507h)));
        if (z5) {
            return;
        }
        if (c()) {
            this.f40673n.b(false);
            for (os2 os2Var : this.f40674o) {
                os2Var.b(false);
            }
        } else if (cuVar instanceof jo) {
            a(this.f40671l.size() - 1);
            if (this.f40671l.isEmpty()) {
                this.f40679t = this.f40680u;
            }
        }
        this.f40667g.a(this);
    }

    @Override // yads.ag1
    public final void a(dg1 dg1Var, long j10, long j11) {
        hu huVarB;
        cu cuVar = (cu) dg1Var;
        this.f40676q = null;
        nc0 nc0Var = (nc0) this.f40666f;
        nc0Var.getClass();
        if (cuVar instanceof t61) {
            int iA = nc0Var.i.a(((t61) cuVar).f37503d);
            lc0 lc0Var = nc0Var.f41219h[iA];
            if (lc0Var.f40483d == null && (huVarB = ((ar) lc0Var.f40480a).b()) != null) {
                lc0[] lc0VarArr = nc0Var.f41219h;
                no2 no2Var = lc0Var.f40481b;
                lc0VarArr[iA] = new lc0(lc0Var.f40484e, no2Var, lc0Var.f40482c, lc0Var.f40480a, lc0Var.f40485f, new k30(huVarB, no2Var.f41311c));
            }
        }
        ve2 ve2Var = nc0Var.f41218g;
        if (ve2Var != null) {
            long j12 = ve2Var.f44011d;
            if (j12 == -9223372036854775807L || cuVar.f37507h > j12) {
                ve2Var.f44011d = cuVar.f37507h;
            }
            ve2Var.f44012e.f44364h = true;
        }
        long j13 = cuVar.f37500a;
        Uri uri = cuVar.i.f43545c;
        xf1 xf1Var = new xf1();
        this.i.getClass();
        dn1 dn1Var = this.f40668h;
        dn1Var.b(xf1Var, new jm1(cuVar.f37502c, this.f40662b, cuVar.f37503d, cuVar.f37504e, cuVar.f37505f, dn1Var.a(cuVar.f37506g), dn1Var.a(cuVar.f37507h)));
        this.f40667g.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ca  */
    @Override // yads.ag1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.bg1 a(yads.dg1 r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.lu.a(yads.dg1, long, long, java.io.IOException, int):yads.bg1");
    }

    public final int a(int i, int i10) {
        do {
            i10++;
            if (i10 >= this.f40671l.size()) {
                return this.f40671l.size() - 1;
            }
        } while (((jo) this.f40671l.get(i10)).a(0) <= i);
        return i10 - 1;
    }

    @Override // yads.ps2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        if (c()) {
            return -3;
        }
        jo joVar = this.f40682w;
        if (joVar != null) {
            int iA = joVar.a(0);
            os2 os2Var = this.f40673n;
            if (iA <= os2Var.f41709q + os2Var.f41711s) {
                return -3;
            }
        }
        d();
        return this.f40673n.a(ox0Var, sa0Var, i, this.f40683x);
    }

    @Override // yads.ps2
    public final int a(long j10) throws Throwable {
        if (c()) {
            return 0;
        }
        int iA = this.f40673n.a(j10, this.f40683x);
        jo joVar = this.f40682w;
        if (joVar != null) {
            int iA2 = joVar.a(0);
            os2 os2Var = this.f40673n;
            iA = Math.min(iA, iA2 - (os2Var.f41709q + os2Var.f41711s));
        }
        os2 os2Var2 = this.f40673n;
        synchronized (os2Var2) {
            if (iA >= 0) {
                int i = os2Var2.f41711s + iA;
                if (i <= os2Var2.f41708p) {
                    os2Var2.f41711s = i;
                }
            }
            throw new IllegalArgumentException();
        }
        d();
        return iA;
    }
}

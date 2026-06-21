package i4;

import com.google.android.gms.internal.ads.e2;
import fh.nd;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j3.x f20962t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a[] f20963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f20964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j3.o0[] f20965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f20966o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nd f20967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long[][] f20969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.m f20970s;

    static {
        e2 e2Var = new e2();
        ad.h0 h0Var = ad.j0.f818c;
        ad.b1 b1Var = ad.b1.f768f;
        List list = Collections.EMPTY_LIST;
        ad.b1 b1Var2 = ad.b1.f768f;
        j3.s sVar = new j3.s();
        f20962t = new j3.x("MergingMediaSource", new j3.r(e2Var), null, new j3.t(sVar), j3.z.B, j3.v.f26403a);
    }

    public n0(a... aVarArr) {
        nd ndVar = new nd();
        this.f20963l = aVarArr;
        this.f20967p = ndVar;
        this.f20966o = new ArrayList(Arrays.asList(aVarArr));
        this.f20968q = -1;
        this.f20964m = new ArrayList(aVarArr.length);
        for (int i = 0; i < aVarArr.length; i++) {
            this.f20964m.add(new ArrayList());
        }
        this.f20965n = new j3.o0[aVarArr.length];
        this.f20969r = new long[0][];
        new HashMap();
        ad.q.d(8, "expectedKeys");
        ad.q.d(2, "expectedValuesPerKey");
        new ad.x0(ad.v.b(8)).f894g = new ad.w0();
    }

    @Override // i4.l
    public final void A(Object obj, a aVar, j3.o0 o0Var) {
        Integer num = (Integer) obj;
        if (this.f20970s != null) {
            return;
        }
        if (this.f20968q == -1) {
            this.f20968q = o0Var.h();
        } else if (o0Var.h() != this.f20968q) {
            this.f20970s = new androidx.datastore.preferences.protobuf.m();
            return;
        }
        int length = this.f20969r.length;
        j3.o0[] o0VarArr = this.f20965n;
        if (length == 0) {
            this.f20969r = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f20968q, o0VarArr.length);
        }
        ArrayList arrayList = this.f20966o;
        arrayList.remove(aVar);
        o0VarArr[num.intValue()] = o0Var;
        if (arrayList.isEmpty()) {
            q(o0VarArr[0]);
        }
    }

    @Override // i4.a
    public final a0 b(c0 c0Var, bb.e eVar, long j10) {
        a[] aVarArr = this.f20963l;
        int length = aVarArr.length;
        a0[] a0VarArr = new a0[length];
        j3.o0[] o0VarArr = this.f20965n;
        int iB = o0VarArr[0].b(c0Var.f20861a);
        for (int i = 0; i < length; i++) {
            c0 c0VarA = c0Var.a(o0VarArr[i].l(iB));
            a0VarArr[i] = aVarArr[i].b(c0VarA, eVar, j10 - this.f20969r[iB][i]);
            ((List) this.f20964m.get(i)).add(new m0(c0VarA, a0VarArr[i]));
        }
        return new l0(this.f20967p, this.f20969r[iB], a0VarArr);
    }

    @Override // i4.a
    public final j3.x j() {
        a[] aVarArr = this.f20963l;
        return aVarArr.length > 0 ? aVarArr[0].j() : f20962t;
    }

    @Override // i4.l, i4.a
    public final void l() throws androidx.datastore.preferences.protobuf.m {
        androidx.datastore.preferences.protobuf.m mVar = this.f20970s;
        if (mVar != null) {
            throw mVar;
        }
        super.l();
    }

    @Override // i4.a
    public final void p(p3.e0 e0Var) {
        this.f20945k = e0Var;
        this.f20944j = m3.z.o(null);
        int i = 0;
        while (true) {
            a[] aVarArr = this.f20963l;
            if (i >= aVarArr.length) {
                return;
            }
            B(Integer.valueOf(i), aVarArr[i]);
            i++;
        }
    }

    @Override // i4.a
    public final void r(a0 a0Var) {
        l0 l0Var = (l0) a0Var;
        int i = 0;
        while (true) {
            a[] aVarArr = this.f20963l;
            if (i >= aVarArr.length) {
                return;
            }
            List list = (List) this.f20964m.get(i);
            a0[] a0VarArr = l0Var.f20946b;
            boolean[] zArr = l0Var.f20947c;
            a0 a0Var2 = zArr[i] ? ((h1) a0VarArr[i]).f20921b : a0VarArr[i];
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((m0) list.get(i10)).f20959b.equals(a0Var2)) {
                    list.remove(i10);
                    break;
                }
                i10++;
            }
            a aVar = aVarArr[i];
            a0[] a0VarArr2 = l0Var.f20946b;
            aVar.r(zArr[i] ? ((h1) a0VarArr2[i]).f20921b : a0VarArr2[i]);
            i++;
        }
    }

    @Override // i4.l, i4.a
    public final void t() {
        super.t();
        Arrays.fill(this.f20965n, (Object) null);
        this.f20968q = -1;
        this.f20970s = null;
        ArrayList arrayList = this.f20966o;
        arrayList.clear();
        Collections.addAll(arrayList, this.f20963l);
    }

    @Override // i4.a
    public final void w(j3.x xVar) {
        this.f20963l[0].w(xVar);
    }

    @Override // i4.l
    public final c0 x(Object obj, c0 c0Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f20964m;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((m0) list.get(i)).f20958a.equals(c0Var)) {
                return ((m0) ((List) arrayList.get(0)).get(i)).f20958a;
            }
        }
        return null;
    }
}

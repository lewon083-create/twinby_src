package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sy1 extends tx1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n5 f10445r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nx1[] f10446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f10447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ci[] f10448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f10449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10450o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long[][] f10451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.m f10452q;

    static {
        v41 v41Var = x41.f12018c;
        r51 r51Var = r51.f9713f;
        List list = Collections.EMPTY_LIST;
        b4 b4Var = b4.f3576a;
        f10445r = new n5("MergingMediaSource", new h0(), null, new c2(), r7.B);
    }

    public sy1(bw1 bw1Var, nx1... nx1VarArr) {
        this.f10446k = nx1VarArr;
        this.f10449n = new ArrayList(Arrays.asList(nx1VarArr));
        this.f10447l = new ArrayList(nx1VarArr.length);
        int i = 0;
        while (true) {
            int length = nx1VarArr.length;
            if (i >= length) {
                this.f10448m = new ci[length];
                this.f10451p = new long[0][];
                new HashMap();
                ix.o(new m41(0).isEmpty());
                return;
            }
            this.f10447l.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void a(n5 n5Var) {
        this.f10446k[0].a(n5Var);
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void b(gy1 gy1Var) {
        py1 py1Var = (py1) gy1Var;
        int i = 0;
        while (true) {
            nx1[] nx1VarArr = this.f10446k;
            if (i >= nx1VarArr.length) {
                return;
            }
            List list = (List) this.f10447l.get(i);
            gy1[] gy1VarArr = py1Var.f9215b;
            boolean[] zArr = py1Var.f9216c;
            gy1 gy1Var2 = zArr[i] ? ((lz1) gy1VarArr[i]).f7696b : gy1VarArr[i];
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((ry1) list.get(i10)).f10097b.equals(gy1Var2)) {
                    list.remove(i10);
                    break;
                }
                i10++;
            }
            nx1 nx1Var = nx1VarArr[i];
            gy1[] gy1VarArr2 = py1Var.f9215b;
            nx1Var.b(zArr[i] ? ((lz1) gy1VarArr2[i]).f7696b : gy1VarArr2[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final gy1 c(hy1 hy1Var, i iVar, long j10) {
        nx1[] nx1VarArr = this.f10446k;
        int length = nx1VarArr.length;
        gy1[] gy1VarArr = new gy1[length];
        ci[] ciVarArr = this.f10448m;
        int iE = ciVarArr[0].e(hy1Var.f6299a);
        for (int i = 0; i < length; i++) {
            hy1 hy1VarA = hy1Var.a(ciVarArr[i].f(iE));
            gy1VarArr[i] = nx1VarArr[i].c(hy1VarA, iVar, j10 - this.f10451p[iE][i]);
            ((List) this.f10447l.get(i)).add(new ry1(hy1VarA, gy1VarArr[i]));
        }
        return new py1(this.f10451p[iE], gy1VarArr);
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final n5 f() {
        nx1[] nx1VarArr = this.f10446k;
        return nx1VarArr.length > 0 ? nx1VarArr[0].f() : f10445r;
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void h(em1 em1Var) {
        this.f10748j = em1Var;
        this.i = cq0.n();
        int i = 0;
        while (true) {
            nx1[] nx1VarArr = this.f10446k;
            if (i >= nx1VarArr.length) {
                return;
            }
            t(Integer.valueOf(i), nx1VarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.tx1, com.google.android.gms.internal.ads.nx1
    public final void j() {
        super.j();
        Arrays.fill(this.f10448m, (Object) null);
        this.f10450o = -1;
        this.f10452q = null;
        ArrayList arrayList = this.f10449n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f10446k);
    }

    @Override // com.google.android.gms.internal.ads.tx1, com.google.android.gms.internal.ads.nx1
    public final void r() throws androidx.datastore.preferences.protobuf.m {
        androidx.datastore.preferences.protobuf.m mVar = this.f10452q;
        if (mVar != null) {
            throw mVar;
        }
        super.r();
    }

    @Override // com.google.android.gms.internal.ads.tx1
    public final void s(Object obj, nx1 nx1Var, ci ciVar) {
        int iC;
        Integer num = (Integer) obj;
        if (this.f10452q != null) {
            return;
        }
        if (this.f10450o == -1) {
            iC = ciVar.c();
            this.f10450o = iC;
        } else {
            int iC2 = ciVar.c();
            int i = this.f10450o;
            if (iC2 != i) {
                this.f10452q = new androidx.datastore.preferences.protobuf.m();
                return;
            }
            iC = i;
        }
        int length = this.f10451p.length;
        ci[] ciVarArr = this.f10448m;
        if (length == 0) {
            this.f10451p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iC, ciVarArr.length);
        }
        ArrayList arrayList = this.f10449n;
        arrayList.remove(nx1Var);
        ciVarArr[num.intValue()] = ciVar;
        if (arrayList.isEmpty()) {
            k(ciVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.tx1
    public final /* synthetic */ hy1 v(Object obj, hy1 hy1Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f10447l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((ry1) list.get(i)).f10096a.equals(hy1Var)) {
                return ((ry1) ((List) arrayList.get(0)).get(i)).f10096a;
            }
        }
        return null;
    }
}

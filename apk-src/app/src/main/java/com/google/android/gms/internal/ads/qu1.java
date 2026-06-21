package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qu1 extends ci {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9594k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iz1 f9596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f9599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f9600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ci[] f9601h;
    public final Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f9602j;

    public qu1(ci[] ciVarArr, Object[] objArr, iz1 iz1Var) {
        this.f9596c = iz1Var;
        this.f9595b = iz1Var.f6660b.length;
        this.f9601h = ciVarArr;
        int length = ciVarArr.length;
        this.f9599f = new int[length];
        this.f9600g = new int[length];
        this.i = objArr;
        this.f9602j = new HashMap();
        int i = 0;
        int iA = 0;
        int iC = 0;
        int i10 = 0;
        while (i < ciVarArr.length) {
            ci ciVar = ciVarArr[i];
            this.f9601h[i10] = ciVar;
            this.f9600g[i10] = iA;
            this.f9599f[i10] = iC;
            iA += ciVar.a();
            iC += this.f9601h[i10].c();
            this.f9602j.put(objArr[i10], Integer.valueOf(i10));
            i++;
            i10++;
        }
        this.f9597d = iA;
        this.f9598e = iC;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int a() {
        return this.f9597d;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final nh b(int i, nh nhVar, long j10) {
        int[] iArr = this.f9600g;
        int iP = cq0.p(iArr, i + 1, false, false);
        int i10 = iArr[iP];
        int i11 = this.f9599f[iP];
        this.f9601h[iP].b(i - i10, nhVar, j10);
        Object objCreate = this.i[iP];
        if (!nh.f8296m.equals(nhVar.f8298a)) {
            objCreate = Pair.create(objCreate, nhVar.f8298a);
        }
        nhVar.f8298a = objCreate;
        nhVar.f8307k += i11;
        nhVar.f8308l += i11;
        return nhVar;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int c() {
        return this.f9598e;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final bh d(int i, bh bhVar, boolean z5) {
        int[] iArr = this.f9599f;
        int iP = cq0.p(iArr, i + 1, false, false);
        int i10 = this.f9600g[iP];
        this.f9601h[iP].d(i - iArr[iP], bhVar, z5);
        bhVar.f3786c += i10;
        if (z5) {
            Object obj = this.i[iP];
            Object obj2 = bhVar.f3785b;
            obj2.getClass();
            bhVar.f3785b = Pair.create(obj, obj2);
        }
        return bhVar;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int e(Object obj) {
        int iE;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f9602j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iE = this.f9601h[iIntValue].e(obj3)) != -1) {
                return this.f9599f[iIntValue] + iE;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final Object f(int i) {
        int[] iArr = this.f9599f;
        int iP = cq0.p(iArr, i + 1, false, false);
        return Pair.create(this.i[iP], this.f9601h[iP].f(i - iArr[iP]));
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int h(int i, int i10, boolean z5) {
        int[] iArr = this.f9600g;
        int iP = cq0.p(iArr, i + 1, false, false);
        int i11 = iArr[iP];
        ci[] ciVarArr = this.f9601h;
        int iH = ciVarArr[iP].h(i - i11, i10 != 2 ? i10 : 0, z5);
        if (iH != -1) {
            return i11 + iH;
        }
        int iP2 = p(iP, z5);
        while (iP2 != -1 && ciVarArr[iP2].g()) {
            iP2 = p(iP2, z5);
        }
        if (iP2 != -1) {
            return ciVarArr[iP2].k(z5) + iArr[iP2];
        }
        if (i10 == 2) {
            return k(z5);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int i(int i) {
        int[] iArr = this.f9600g;
        int iP = cq0.p(iArr, i + 1, false, false);
        int i10 = iArr[iP];
        ci[] ciVarArr = this.f9601h;
        int i11 = ciVarArr[iP].i(i - i10);
        if (i11 != -1) {
            return i10 + i11;
        }
        int iQ = q(iP, false);
        while (iQ != -1 && ciVarArr[iQ].g()) {
            iQ = q(iQ, false);
        }
        if (iQ == -1) {
            return -1;
        }
        return ciVarArr[iQ].j(false) + iArr[iQ];
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int j(boolean z5) {
        int iQ;
        int i = this.f9595b;
        if (i != 0) {
            if (z5) {
                int[] iArr = this.f9596c.f6660b;
                int length = iArr.length;
                iQ = length > 0 ? iArr[length - 1] : -1;
            } else {
                iQ = i - 1;
            }
            do {
                ci[] ciVarArr = this.f9601h;
                if (!ciVarArr[iQ].g()) {
                    return ciVarArr[iQ].j(z5) + this.f9600g[iQ];
                }
                iQ = q(iQ, z5);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int k(boolean z5) {
        if (this.f9595b != 0) {
            int iP = 0;
            if (z5) {
                int[] iArr = this.f9596c.f6660b;
                iP = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                ci[] ciVarArr = this.f9601h;
                if (!ciVarArr[iP].g()) {
                    return ciVarArr[iP].k(z5) + this.f9600g[iP];
                }
                iP = p(iP, z5);
            } while (iP != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final bh o(Object obj, bh bhVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f9602j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.f9600g[iIntValue];
        this.f9601h[iIntValue].o(obj3, bhVar);
        bhVar.f3786c += i;
        bhVar.f3785b = obj;
        return bhVar;
    }

    public final int p(int i, boolean z5) {
        if (!z5) {
            if (i >= this.f9595b - 1) {
                return -1;
            }
            return i + 1;
        }
        iz1 iz1Var = this.f9596c;
        int i10 = iz1Var.f6661c[i] + 1;
        int[] iArr = iz1Var.f6660b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int q(int i, boolean z5) {
        if (!z5) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        iz1 iz1Var = this.f9596c;
        int i10 = iz1Var.f6661c[i] - 1;
        if (i10 >= 0) {
            return iz1Var.f6660b[i10];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qu1(List list, iz1 iz1Var) {
        ci[] ciVarArr = new ci[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i10 = 0;
        while (it.hasNext()) {
            ciVarArr[i10] = ((du1) it.next()).j();
            i10++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((du1) it2.next()).h();
            i++;
        }
        this(ciVarArr, objArr, iz1Var);
    }
}

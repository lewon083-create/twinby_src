package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2 f11634a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j6 f11637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t5 f11638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11641h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jx1 f11642j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11645m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6 f11635b = new i6(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tk0 f11636c = new tk0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final tk0 f11643k = new tk0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tk0 f11644l = new tk0();

    public w5(w2 w2Var, j6 j6Var, t5 t5Var, jx1 jx1Var) {
        this.f11634a = w2Var;
        this.f11637d = j6Var;
        this.f11638e = t5Var;
        this.f11642j = jx1Var;
        this.f11637d = j6Var;
        this.f11638e = t5Var;
        w2Var.e(jx1Var);
        a();
    }

    public final void a() {
        i6 i6Var = this.f11635b;
        i6Var.f6385c = 0;
        i6Var.f6394m = 0L;
        i6Var.f6395n = false;
        i6Var.f6391j = false;
        i6Var.f6393l = false;
        i6Var.f6397p = null;
        this.f11639f = 0;
        this.f11641h = 0;
        this.f11640g = 0;
        this.i = 0;
        this.f11645m = false;
    }

    public final int b() {
        int i = !this.f11645m ? this.f11637d.f6732g[this.f11639f] : this.f11635b.i[this.f11639f] ? 1 : 0;
        return e() != null ? i | 1073741824 : i;
    }

    public final boolean c() {
        this.f11639f++;
        if (!this.f11645m) {
            return false;
        }
        int i = this.f11640g + 1;
        this.f11640g = i;
        int[] iArr = this.f11635b.f6388f;
        int i10 = this.f11641h;
        if (i != iArr[i10]) {
            return true;
        }
        this.f11641h = i10 + 1;
        this.f11640g = 0;
        return false;
    }

    public final int d(int i, int i10) {
        tk0 tk0Var;
        h6 h6VarE = e();
        if (h6VarE == null) {
            return 0;
        }
        int length = h6VarE.f6036d;
        i6 i6Var = this.f11635b;
        if (length != 0) {
            tk0Var = (tk0) i6Var.f6398q;
        } else {
            byte[] bArr = h6VarE.f6037e;
            String str = cq0.f4293a;
            length = bArr.length;
            tk0 tk0Var2 = this.f11644l;
            tk0Var2.z(length, bArr);
            tk0Var = tk0Var2;
        }
        boolean z5 = i6Var.f6391j && i6Var.f6392k[this.f11639f];
        boolean z10 = z5 || i10 != 0;
        int i11 = true != z10 ? 0 : 128;
        tk0 tk0Var3 = this.f11643k;
        tk0Var3.f10641a[0] = (byte) (i11 | length);
        tk0Var3.E(0);
        w2 w2Var = this.f11634a;
        w2Var.b(tk0Var3, 1, 1);
        w2Var.b(tk0Var, length, 1);
        if (!z10) {
            return length + 1;
        }
        tk0 tk0Var4 = this.f11636c;
        if (!z5) {
            tk0Var4.y(8);
            byte[] bArr2 = tk0Var4.f10641a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i10;
            bArr2[4] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[5] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[6] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[7] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            w2Var.b(tk0Var4, 8, 1);
            return length + 9;
        }
        int i12 = length + 1;
        tk0 tk0Var5 = (tk0) i6Var.f6398q;
        int iL = tk0Var5.L();
        tk0Var5.G(-2);
        int i13 = (iL * 6) + 2;
        if (i10 != 0) {
            tk0Var4.y(i13);
            byte[] bArr3 = tk0Var4.f10641a;
            tk0Var5.H(bArr3, 0, i13);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i10;
            bArr3[2] = (byte) ((i14 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr3[3] = (byte) (i14 & KotlinVersion.MAX_COMPONENT_VALUE);
        } else {
            tk0Var4 = tk0Var5;
        }
        w2Var.b(tk0Var4, i13, 1);
        return i12 + i13;
    }

    public final h6 e() {
        if (!this.f11645m) {
            return null;
        }
        i6 i6Var = this.f11635b;
        t5 t5Var = (t5) i6Var.f6396o;
        String str = cq0.f4293a;
        int i = t5Var.f10487a;
        h6 h6Var = (h6) i6Var.f6397p;
        if (h6Var == null) {
            h6Var = this.f11637d.f6726a.f5674l[i];
        }
        if (h6Var == null || !h6Var.f6033a) {
            return null;
        }
        return h6Var;
    }
}

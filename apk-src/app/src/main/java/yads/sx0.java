package yads;

import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p73 f43111a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q73 f43114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public re0 f43115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43118h;
    public int i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f43121l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j73 f43112b = new j73();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb2 f43113c = new lb2();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lb2 f43119j = new lb2(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lb2 f43120k = new lb2();

    public sx0(p73 p73Var, q73 q73Var, re0 re0Var) {
        this.f43111a = p73Var;
        this.f43114d = q73Var;
        this.f43115e = re0Var;
        a(q73Var, re0Var);
    }

    public final i73 a() {
        if (!this.f43121l) {
            return null;
        }
        j73 j73Var = this.f43112b;
        re0 re0Var = j73Var.f39748a;
        int i = lb3.f40466a;
        int i10 = re0Var.f42579a;
        i73 i73Var = j73Var.f39759m;
        if (i73Var == null) {
            i73[] i73VarArr = this.f43114d.f42203a.f39064k;
            i73Var = i73VarArr == null ? null : i73VarArr[i10];
        }
        if (i73Var == null || !i73Var.f39456a) {
            return null;
        }
        return i73Var;
    }

    public final void b() {
        j73 j73Var = this.f43112b;
        j73Var.f39751d = 0;
        j73Var.f39762p = 0L;
        j73Var.f39763q = false;
        j73Var.f39757k = false;
        j73Var.f39761o = false;
        j73Var.f39759m = null;
        this.f43116f = 0;
        this.f43118h = 0;
        this.f43117g = 0;
        this.i = 0;
        this.f43121l = false;
    }

    public final int a(int i, int i10) {
        lb2 lb2Var;
        i73 i73VarA = a();
        if (i73VarA == null) {
            return 0;
        }
        int length = i73VarA.f39459d;
        if (length != 0) {
            lb2Var = this.f43112b.f39760n;
        } else {
            byte[] bArr = i73VarA.f39460e;
            int i11 = lb3.f40466a;
            lb2 lb2Var2 = this.f43120k;
            int length2 = bArr.length;
            lb2Var2.f40463a = bArr;
            lb2Var2.f40465c = length2;
            lb2Var2.f40464b = 0;
            length = bArr.length;
            lb2Var = lb2Var2;
        }
        j73 j73Var = this.f43112b;
        boolean z5 = j73Var.f39757k && j73Var.f39758l[this.f43116f];
        boolean z10 = z5 || i10 != 0;
        lb2 lb2Var3 = this.f43119j;
        lb2Var3.f40463a[0] = (byte) ((z10 ? 128 : 0) | length);
        lb2Var3.e(0);
        this.f43111a.a(1, this.f43119j);
        this.f43111a.a(length, lb2Var);
        if (!z10) {
            return length + 1;
        }
        if (!z5) {
            this.f43113c.c(8);
            lb2 lb2Var4 = this.f43113c;
            byte[] bArr2 = lb2Var4.f40463a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i10 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[4] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[5] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[6] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[7] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f43111a.a(8, lb2Var4);
            return length + 9;
        }
        lb2 lb2Var5 = this.f43112b.f39760n;
        int iR = lb2Var5.r();
        lb2Var5.e(lb2Var5.f40464b - 2);
        int i12 = (iR * 6) + 2;
        if (i10 != 0) {
            this.f43113c.c(i12);
            byte[] bArr3 = this.f43113c.f40463a;
            lb2Var5.a(bArr3, 0, i12);
            int i13 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i10;
            bArr3[2] = (byte) ((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr3[3] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
            lb2Var5 = this.f43113c;
        }
        this.f43111a.a(i12, lb2Var5);
        return length + 1 + i12;
    }

    public final void a(q73 q73Var, re0 re0Var) {
        this.f43114d = q73Var;
        this.f43115e = re0Var;
        this.f43111a.a(q73Var.f42203a.f39060f);
        b();
    }
}

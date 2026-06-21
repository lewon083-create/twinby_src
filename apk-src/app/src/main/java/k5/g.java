package k5;

import com.google.android.gms.internal.ads.i6;
import kotlin.KotlinVersion;
import m3.z;
import q4.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f26911a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f26914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f26915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26918h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j3.o f26919j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f26922m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6 f26912b = new i6(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.p f26913c = new m3.p();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m3.p f26920k = new m3.p(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m3.p f26921l = new m3.p();

    public g(a0 a0Var, s sVar, d dVar, j3.o oVar) {
        this.f26911a = a0Var;
        this.f26914d = sVar;
        this.f26915e = dVar;
        this.f26919j = oVar;
        this.f26914d = sVar;
        this.f26915e = dVar;
        a0Var.a(oVar);
        e();
    }

    public final int a() {
        int i = !this.f26922m ? this.f26914d.f27016g[this.f26916f] : this.f26912b.i[this.f26916f] ? 1 : 0;
        return b() != null ? i | 1073741824 : i;
    }

    public final r b() {
        if (this.f26922m) {
            i6 i6Var = this.f26912b;
            d dVar = (d) i6Var.f6396o;
            String str = z.f28608a;
            int i = dVar.f26903a;
            r rVar = (r) i6Var.f6397p;
            if (rVar == null) {
                r[] rVarArr = this.f26914d.f27010a.f27004l;
                rVar = rVarArr == null ? null : rVarArr[i];
            }
            if (rVar != null && rVar.f27005a) {
                return rVar;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f26916f++;
        if (!this.f26922m) {
            return false;
        }
        int i = this.f26917g + 1;
        this.f26917g = i;
        int[] iArr = this.f26912b.f6388f;
        int i10 = this.f26918h;
        if (i != iArr[i10]) {
            return true;
        }
        this.f26918h = i10 + 1;
        this.f26917g = 0;
        return false;
    }

    public final int d(int i, int i10) {
        m3.p pVar;
        r rVarB = b();
        if (rVarB == null) {
            return 0;
        }
        int length = rVarB.f27008d;
        i6 i6Var = this.f26912b;
        if (length != 0) {
            pVar = (m3.p) i6Var.f6398q;
        } else {
            byte[] bArr = rVarB.f27009e;
            String str = z.f28608a;
            int length2 = bArr.length;
            m3.p pVar2 = this.f26921l;
            pVar2.K(length2, bArr);
            length = bArr.length;
            pVar = pVar2;
        }
        boolean z5 = i6Var.f6391j && i6Var.f6392k[this.f26916f];
        boolean z10 = z5 || i10 != 0;
        m3.p pVar3 = this.f26920k;
        pVar3.f28589a[0] = (byte) ((z10 ? 128 : 0) | length);
        pVar3.M(0);
        a0 a0Var = this.f26911a;
        a0Var.e(pVar3, 1, 1);
        a0Var.e(pVar, length, 1);
        if (!z10) {
            return length + 1;
        }
        m3.p pVar4 = this.f26913c;
        if (!z5) {
            pVar4.J(8);
            byte[] bArr2 = pVar4.f28589a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i10 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[4] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[5] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[6] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[7] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            a0Var.e(pVar4, 8, 1);
            return length + 9;
        }
        m3.p pVar5 = (m3.p) i6Var.f6398q;
        int iG = pVar5.G();
        pVar5.N(-2);
        int i11 = (iG * 6) + 2;
        if (i10 != 0) {
            pVar4.J(i11);
            byte[] bArr3 = pVar4.f28589a;
            pVar5.k(bArr3, 0, i11);
            int i12 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i10;
            bArr3[2] = (byte) ((i12 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr3[3] = (byte) (i12 & KotlinVersion.MAX_COMPONENT_VALUE);
        } else {
            pVar4 = pVar5;
        }
        a0Var.e(pVar4, i11, 1);
        return length + 1 + i11;
    }

    public final void e() {
        i6 i6Var = this.f26912b;
        i6Var.f6385c = 0;
        i6Var.f6394m = 0L;
        i6Var.f6395n = false;
        i6Var.f6391j = false;
        i6Var.f6393l = false;
        i6Var.f6397p = null;
        this.f26916f = 0;
        this.f26918h = 0;
        this.f26917g = 0;
        this.i = 0;
        this.f26922m = false;
    }
}

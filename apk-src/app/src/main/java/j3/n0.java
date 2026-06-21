package j3;

import ad.b1;
import android.net.Uri;
import com.google.android.gms.internal.ads.e2;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f26306q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x f26307r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f26309b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f26311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f26312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26315h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t f26316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26317k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f26318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f26319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26320n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26321o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f26322p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f26308a = f26306q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f26310c = f26307r;

    static {
        e2 e2Var = new e2();
        ad.h0 h0Var = ad.j0.f818c;
        b1 b1Var = b1.f768f;
        List list = Collections.EMPTY_LIST;
        b1 b1Var2 = b1.f768f;
        s sVar = new s();
        v vVar = v.f26403a;
        Uri uri = Uri.EMPTY;
        f26307r = new x("androidx.media3.common.Timeline", new r(e2Var), uri != null ? new u(uri, null, null, list, b1Var2, -9223372036854775807L) : null, new t(sVar), z.B, vVar);
        gf.a.o(1, 2, 3, 4, 5);
        gf.a.o(6, 7, 8, 9, 10);
        m3.z.G(11);
        m3.z.G(12);
        m3.z.G(13);
    }

    public final boolean a() {
        return this.f26316j != null;
    }

    public final void b(x xVar, Object obj, long j10, long j11, long j12, boolean z5, boolean z10, t tVar, long j13, long j14, int i, long j15) {
        this.f26308a = f26306q;
        this.f26310c = xVar != null ? xVar : f26307r;
        if (xVar != null) {
            u uVar = xVar.f26407b;
        }
        this.f26309b = null;
        this.f26311d = obj;
        this.f26312e = j10;
        this.f26313f = j11;
        this.f26314g = j12;
        this.f26315h = z5;
        this.i = z10;
        this.f26316j = tVar;
        this.f26318l = j13;
        this.f26319m = j14;
        this.f26320n = 0;
        this.f26321o = i;
        this.f26322p = j15;
        this.f26317k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n0.class.equals(obj.getClass())) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Objects.equals(this.f26308a, n0Var.f26308a) && Objects.equals(this.f26310c, n0Var.f26310c) && Objects.equals(this.f26311d, n0Var.f26311d) && Objects.equals(this.f26316j, n0Var.f26316j) && this.f26312e == n0Var.f26312e && this.f26313f == n0Var.f26313f && this.f26314g == n0Var.f26314g && this.f26315h == n0Var.f26315h && this.i == n0Var.i && this.f26317k == n0Var.f26317k && this.f26318l == n0Var.f26318l && this.f26319m == n0Var.f26319m && this.f26320n == n0Var.f26320n && this.f26321o == n0Var.f26321o && this.f26322p == n0Var.f26322p;
    }

    public final int hashCode() {
        int iHashCode = (this.f26310c.hashCode() + ((this.f26308a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f26311d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        t tVar = this.f26316j;
        int iHashCode3 = (iHashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31;
        long j10 = this.f26312e;
        int i = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f26313f;
        int i10 = (i + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f26314g;
        int i11 = (((((((i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f26315h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.f26317k ? 1 : 0)) * 31;
        long j13 = this.f26318l;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f26319m;
        int i13 = (((((i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f26320n) * 31) + this.f26321o) * 31;
        long j15 = this.f26322p;
        return i13 + ((int) (j15 ^ (j15 >>> 32)));
    }
}

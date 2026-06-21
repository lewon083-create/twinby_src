package u7;

import a0.u;
import io.sentry.TransactionOptions;
import l7.n;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34331b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l7.f f34334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l7.f f34335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f34336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f34337h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l7.c f34338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34339k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f34340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f34341m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f34342n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f34343o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f34344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f34345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f34346r;

    static {
        n.i("WorkSpec");
    }

    public j(String str, String str2) {
        l7.f fVar = l7.f.f28023c;
        this.f34334e = fVar;
        this.f34335f = fVar;
        this.f34338j = l7.c.i;
        this.f34340l = 1;
        this.f34341m = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        this.f34344p = -1L;
        this.f34346r = 1;
        this.f34330a = str;
        this.f34332c = str2;
    }

    public final long a() {
        int i;
        if (this.f34331b == 1 && (i = this.f34339k) > 0) {
            return Math.min(18000000L, this.f34340l == 2 ? this.f34341m * ((long) i) : (long) Math.scalb(this.f34341m, i - 1)) + this.f34342n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f34342n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f34336g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j10 = this.f34342n;
        if (j10 == 0) {
            j10 = this.f34336g + jCurrentTimeMillis2;
        }
        long j11 = this.i;
        long j12 = this.f34337h;
        if (j11 != j12) {
            return j10 + j12 + (j10 == 0 ? j11 * (-1) : 0L);
        }
        return j10 + (j10 != 0 ? j12 : 0L);
    }

    public final boolean b() {
        return !l7.c.i.equals(this.f34338j);
    }

    public final boolean c() {
        return this.f34337h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f34336g != jVar.f34336g || this.f34337h != jVar.f34337h || this.i != jVar.i || this.f34339k != jVar.f34339k || this.f34341m != jVar.f34341m || this.f34342n != jVar.f34342n || this.f34343o != jVar.f34343o || this.f34344p != jVar.f34344p || this.f34345q != jVar.f34345q || !this.f34330a.equals(jVar.f34330a) || this.f34331b != jVar.f34331b || !this.f34332c.equals(jVar.f34332c)) {
            return false;
        }
        String str = this.f34333d;
        if (str != null) {
            if (!str.equals(jVar.f34333d)) {
                return false;
            }
        } else if (jVar.f34333d != null) {
            return false;
        }
        return this.f34334e.equals(jVar.f34334e) && this.f34335f.equals(jVar.f34335f) && this.f34338j.equals(jVar.f34338j) && this.f34340l == jVar.f34340l && this.f34346r == jVar.f34346r;
    }

    public final int hashCode() {
        int iE = gf.a.e((z.m(this.f34331b) + (this.f34330a.hashCode() * 31)) * 31, 31, this.f34332c);
        String str = this.f34333d;
        int iHashCode = (this.f34335f.hashCode() + ((this.f34334e.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j10 = this.f34336g;
        int i = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f34337h;
        int i10 = (i + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.i;
        int iM = (z.m(this.f34340l) + ((((this.f34338j.hashCode() + ((i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f34339k) * 31)) * 31;
        long j13 = this.f34341m;
        int i11 = (iM + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f34342n;
        int i12 = (i11 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f34343o;
        int i13 = (i12 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f34344p;
        return z.m(this.f34346r) + ((((i13 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f34345q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return u.o(new StringBuilder("{WorkSpec: "), this.f34330a, "}");
    }
}

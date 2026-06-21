package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u63 implements xq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f43575s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f43576t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final hm1 f43577u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final wq f43578v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f43580c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f43582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f43583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f43584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43585h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f43586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f43587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public am1 f43588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f43589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f43590n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f43591o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f43592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f43593q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f43594r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43579b = f43575s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hm1 f43581d = f43577u;

    static {
        cm1 cm1Var;
        ul1 ul1Var = new ul1();
        xl1 xl1Var = new xl1();
        List list = Collections.EMPTY_LIST;
        um2 um2Var = um2.f43723f;
        em1 em1Var = em1.f38181d;
        Uri uri = Uri.EMPTY;
        if (xl1Var.f44754b != null && xl1Var.f44753a == null) {
            throw new IllegalStateException();
        }
        yl1 yl1Var = null;
        if (uri != null) {
            if (xl1Var.f44753a != null) {
                yl1Var = new yl1(xl1Var);
            }
            cm1Var = new cm1(uri, null, yl1Var, list, null, um2Var, null);
        } else {
            cm1Var = null;
        }
        f43577u = new hm1("com.monetization.ads.exoplayer2.Timeline", new wl1(ul1Var), cm1Var, new am1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), lm1.H, em1Var);
        f43578v = new zl.g0(23);
    }

    public static u63 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        hm1 hm1Var = bundle2 != null ? (hm1) hm1.f39243h.fromBundle(bundle2) : null;
        long j10 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
        long j11 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
        long j12 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
        boolean z5 = bundle.getBoolean(Integer.toString(5, 36), false);
        boolean z10 = bundle.getBoolean(Integer.toString(6, 36), false);
        Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
        am1 am1Var = bundle3 != null ? (am1) am1.f36772h.fromBundle(bundle3) : null;
        boolean z11 = bundle.getBoolean(Integer.toString(8, 36), false);
        long j13 = bundle.getLong(Integer.toString(9, 36), 0L);
        long j14 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
        int i = bundle.getInt(Integer.toString(11, 36), 0);
        int i10 = bundle.getInt(Integer.toString(12, 36), 0);
        long j15 = bundle.getLong(Integer.toString(13, 36), 0L);
        u63 u63Var = new u63();
        u63Var.a(f43576t, hm1Var, null, j10, j11, j12, z5, z10, am1Var, j13, j14, i, i10, j15);
        u63Var.f43589m = z11;
        return u63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u63.class.equals(obj.getClass())) {
            u63 u63Var = (u63) obj;
            if (lb3.a(this.f43579b, u63Var.f43579b) && lb3.a(this.f43581d, u63Var.f43581d) && lb3.a(this.f43582e, u63Var.f43582e) && lb3.a(this.f43588l, u63Var.f43588l) && this.f43583f == u63Var.f43583f && this.f43584g == u63Var.f43584g && this.f43585h == u63Var.f43585h && this.i == u63Var.i && this.f43586j == u63Var.f43586j && this.f43589m == u63Var.f43589m && this.f43590n == u63Var.f43590n && this.f43591o == u63Var.f43591o && this.f43592p == u63Var.f43592p && this.f43593q == u63Var.f43593q && this.f43594r == u63Var.f43594r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f43581d.hashCode() + ((this.f43579b.hashCode() + 217) * 31)) * 31;
        Object obj = this.f43582e;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        am1 am1Var = this.f43588l;
        int iHashCode3 = (iHashCode2 + (am1Var != null ? am1Var.hashCode() : 0)) * 31;
        long j10 = this.f43583f;
        int i = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f43584g;
        int i10 = (i + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f43585h;
        int i11 = (((((((i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.i ? 1 : 0)) * 31) + (this.f43586j ? 1 : 0)) * 31) + (this.f43589m ? 1 : 0)) * 31;
        long j13 = this.f43590n;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f43591o;
        int i13 = (((((i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f43592p) * 31) + this.f43593q) * 31;
        long j15 = this.f43594r;
        return i13 + ((int) (j15 ^ (j15 >>> 32)));
    }

    public final boolean a() {
        boolean z5 = this.f43587k;
        am1 am1Var = this.f43588l;
        if (z5 == (am1Var != null)) {
            return am1Var != null;
        }
        throw new IllegalStateException();
    }

    public final u63 a(Object obj, hm1 hm1Var, Object obj2, long j10, long j11, long j12, boolean z5, boolean z10, am1 am1Var, long j13, long j14, int i, int i10, long j15) {
        cm1 cm1Var;
        this.f43579b = obj;
        this.f43581d = hm1Var != null ? hm1Var : f43577u;
        this.f43580c = (hm1Var == null || (cm1Var = hm1Var.f39245c) == null) ? null : cm1Var.f37098g;
        this.f43582e = obj2;
        this.f43583f = j10;
        this.f43584g = j11;
        this.f43585h = j12;
        this.i = z5;
        this.f43586j = z10;
        this.f43587k = am1Var != null;
        this.f43588l = am1Var;
        this.f43590n = j13;
        this.f43591o = j14;
        this.f43592p = i;
        this.f43593q = i10;
        this.f43594r = j15;
        this.f43589m = false;
        return this;
    }
}

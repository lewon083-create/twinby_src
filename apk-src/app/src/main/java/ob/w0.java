package ob;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    public Long A;
    public long B;
    public String C;
    public int D;
    public int E;
    public long F;
    public String G;
    public byte[] H;
    public int I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public String P;
    public boolean Q;
    public long R;
    public long S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f30468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f30473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f30474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f30475h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f30476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f30477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f30478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f30479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f30480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f30482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f30483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f30484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f30485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f30486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f30487u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f30488v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f30489w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f30490x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f30491y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Long f30492z;

    public w0(l1 l1Var, String str) {
        pa.c0.i(l1Var);
        pa.c0.f(str);
        this.f30468a = l1Var;
        this.f30469b = str;
        i1 i1Var = l1Var.f30266h;
        l1.k(i1Var);
        i1Var.C();
    }

    public final void A(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.f30489w != j10;
        this.f30489w = j10;
    }

    public final void B(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.B != j10;
        this.B = j10;
    }

    public final String C() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.C;
    }

    public final String D() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.f30469b;
    }

    public final String E() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.f30470c;
    }

    public final void F(String str) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= !Objects.equals(this.f30470c, str);
        this.f30470c = str;
    }

    public final String G() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.f30471d;
    }

    public final void H(String str) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= true ^ Objects.equals(this.f30471d, str);
        this.f30471d = str;
    }

    public final void I(String str) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= !Objects.equals(this.f30472e, str);
        this.f30472e = str;
    }

    public final String J() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.f30473f;
    }

    public final void K(String str) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= !Objects.equals(this.f30473f, str);
        this.f30473f = str;
    }

    public final void L(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.f30475h != j10;
        this.f30475h = j10;
    }

    public final void M(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.i != j10;
        this.i = j10;
    }

    public final String N() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.f30476j;
    }

    public final void O(String str) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= !Objects.equals(this.f30476j, str);
        this.f30476j = str;
    }

    public final long P() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.f30477k;
    }

    public final void Q(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.f30477k != j10;
        this.f30477k = j10;
    }

    public final void R(String str) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= !Objects.equals(this.f30478l, str);
        this.f30478l = str;
    }

    public final void S(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.f30479m != j10;
        this.f30479m = j10;
    }

    public final void a(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.f30480n != j10;
        this.f30480n = j10;
    }

    public final long b() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.f30484r;
    }

    public final void c(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.f30484r != j10;
        this.f30484r = j10;
    }

    public final void d(boolean z5) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.f30481o != z5;
        this.f30481o = z5;
    }

    public final void e(long j10) {
        pa.c0.b(j10 >= 0);
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.f30474g != j10;
        this.f30474g = j10;
    }

    public final void f(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.R != j10;
        this.R = j10;
    }

    public final void g(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.S != j10;
        this.S = j10;
    }

    public final void h(long j10) {
        l1 l1Var = this.f30468a;
        i1 i1Var = l1Var.f30266h;
        s0 s0Var = l1Var.f30265g;
        l1.k(i1Var);
        i1Var.C();
        long j11 = this.f30474g + j10;
        String str = this.f30469b;
        if (j11 > 2147483647L) {
            l1.k(s0Var);
            s0Var.f30413j.g(s0.K(str), "Bundle index overflow. appId");
            j11 = (-1) + j10;
        }
        long j12 = this.F + 1;
        if (j12 > 2147483647L) {
            l1.k(s0Var);
            s0Var.f30413j.g(s0.K(str), "Delivery index overflow. appId");
            j12 = 0;
        }
        this.Q = true;
        this.f30474g = j11;
        this.F = j12;
    }

    public final void i(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.J != j10;
        this.J = j10;
    }

    public final void j(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.K != j10;
        this.K = j10;
    }

    public final void k(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.L != j10;
        this.L = j10;
    }

    public final void l(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.M != j10;
        this.M = j10;
    }

    public final void m(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.O != j10;
        this.O = j10;
    }

    public final void n(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.N != j10;
        this.N = j10;
    }

    public final boolean o() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.Q;
    }

    public final void p(int i) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.D != i;
        this.D = i;
    }

    public final void q(int i) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.E != i;
        this.E = i;
    }

    public final void r(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.F != j10;
        this.F = j10;
    }

    public final String s() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.G;
    }

    public final int t() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.I;
    }

    public final String u() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        String str = this.P;
        v(null);
        return str;
    }

    public final void v(String str) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= !Objects.equals(this.P, str);
        this.P = str;
    }

    public final Boolean w() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.f30483q;
    }

    public final void x(List list) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        if (Objects.equals(this.f30485s, list)) {
            return;
        }
        this.Q = true;
        this.f30485s = list != null ? new ArrayList(list) : null;
    }

    public final boolean y() {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        return this.f30487u;
    }

    public final void z(long j10) {
        i1 i1Var = this.f30468a.f30266h;
        l1.k(i1Var);
        i1Var.C();
        this.Q |= this.f30488v != j10;
        this.f30488v = j10;
    }
}

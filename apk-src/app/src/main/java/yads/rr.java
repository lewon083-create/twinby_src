package yads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import zl.c1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rr implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr f42702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p30 f42703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t53 f42704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p30 f42705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yr f42706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f42708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f42709h;
    public Uri i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u30 f42710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u30 f42711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p30 f42712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f42713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f42714n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f42715o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public bz2 f42716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f42717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f42718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f42719s;

    public rr(nr nrVar, p30 p30Var, dv0 dv0Var, pr prVar, yr yrVar, int i) {
        this.f42702a = nrVar;
        this.f42703b = dv0Var;
        this.f42706e = yrVar == null ? yr.f45147a : yrVar;
        this.f42707f = (i & 1) != 0;
        this.f42708g = false;
        this.f42709h = false;
        if (p30Var != null) {
            this.f42705d = p30Var;
            this.f42704c = prVar != null ? new t53(p30Var, prVar) : null;
        } else {
            this.f42705d = gd2.f38731a;
            this.f42704c = null;
        }
    }

    @Override // yads.p30
    public final void a(u83 u83Var) {
        u83Var.getClass();
        this.f42703b.a(u83Var);
        this.f42705d.a(u83Var);
    }

    @Override // yads.p30
    public final void close() {
        this.f42710j = null;
        this.i = null;
        this.f42714n = 0L;
        try {
            d();
        } catch (Throwable th2) {
            if (g() || (th2 instanceof kr)) {
                this.f42717q = true;
            }
            throw th2;
        }
    }

    public final void d() {
        p30 p30Var = this.f42712l;
        if (p30Var == null) {
            return;
        }
        try {
            p30Var.close();
        } finally {
            this.f42711k = null;
            this.f42712l = null;
            bz2 bz2Var = this.f42716p;
            if (bz2Var != null) {
                ((yy2) this.f42702a).a((zr) bz2Var);
                this.f42716p = null;
            }
        }
    }

    public final nr e() {
        return this.f42702a;
    }

    public final yr f() {
        return this.f42706e;
    }

    public final boolean g() {
        return this.f42712l == this.f42703b;
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return !g() ? this.f42705d.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.i;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) {
        long j10;
        if (i10 == 0) {
            return 0;
        }
        if (this.f42715o == 0) {
            return -1;
        }
        u30 u30Var = this.f42710j;
        u30Var.getClass();
        u30 u30Var2 = this.f42711k;
        u30Var2.getClass();
        try {
            if (this.f42714n >= this.f42719s) {
                a(u30Var, true);
            }
            p30 p30Var = this.f42712l;
            p30Var.getClass();
            int i11 = p30Var.read(bArr, i, i10);
            if (i11 == -1) {
                if (g()) {
                    j10 = -1;
                } else {
                    long j11 = u30Var2.f43539g;
                    if (j11 != -1) {
                        j10 = -1;
                        if (this.f42713m < j11) {
                        }
                    }
                    String str = u30Var.f43540h;
                    int i12 = lb3.f40466a;
                    this.f42715o = 0L;
                    if (this.f42712l == this.f42704c) {
                        rz rzVar = new rz();
                        rzVar.f42766a.put("exo_len", Long.valueOf(this.f42714n));
                        rzVar.f42767b.remove("exo_len");
                        ((yy2) this.f42702a).a(str, rzVar);
                        return i11;
                    }
                }
                long j12 = this.f42715o;
                if (j12 <= 0) {
                    if (j12 == j10) {
                    }
                }
                d();
                a(u30Var, false);
                return read(bArr, i, i10);
            }
            long j13 = i11;
            this.f42714n += j13;
            this.f42713m += j13;
            long j14 = this.f42715o;
            if (j14 != -1) {
                this.f42715o = j14 - j13;
                return i11;
            }
            return i11;
        } catch (Throwable th2) {
            if (g() || (th2 instanceof kr)) {
                this.f42717q = true;
            }
            throw th2;
        }
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        try {
            ((c1) this.f42706e).getClass();
            String strB = yr.b(u30Var);
            u30Var.getClass();
            Uri uri = u30Var.f43533a;
            long j10 = u30Var.f43534b;
            int i = u30Var.f43535c;
            byte[] bArr = u30Var.f43536d;
            Map map = u30Var.f43537e;
            long j11 = u30Var.f43538f;
            long j12 = u30Var.f43539g;
            int i10 = u30Var.i;
            Object obj = u30Var.f43541j;
            ni.a(uri, "The uri must be set.");
            u30 u30Var2 = new u30(uri, j10, i, bArr, map, j11, j12, strB, i10, obj);
            this.f42710j = u30Var2;
            nr nrVar = this.f42702a;
            Uri uri2 = u30Var2.f43533a;
            String strA = ((yy2) nrVar).b(strB).a();
            Uri uri3 = strA == null ? null : Uri.parse(strA);
            if (uri3 != null) {
                uri2 = uri3;
            }
            this.i = uri2;
            this.f42714n = u30Var.f43538f;
            boolean z5 = (this.f42708g && this.f42717q) || (this.f42709h && u30Var.f43539g == -1);
            this.f42718r = z5;
            if (z5) {
                this.f42715o = -1L;
            } else {
                long jA = qz.a(((yy2) this.f42702a).b(strB));
                this.f42715o = jA;
                if (jA != -1) {
                    long j13 = jA - u30Var.f43538f;
                    this.f42715o = j13;
                    if (j13 < 0) {
                        throw new q30(2008);
                    }
                }
            }
            long jMin = u30Var.f43539g;
            if (jMin != -1) {
                long j14 = this.f42715o;
                if (j14 != -1) {
                    jMin = Math.min(j14, jMin);
                }
                this.f42715o = jMin;
            }
            long j15 = this.f42715o;
            if (j15 > 0 || j15 == -1) {
                a(u30Var2, false);
            }
            long j16 = u30Var.f43539g;
            return j16 != -1 ? j16 : this.f42715o;
        } catch (Throwable th2) {
            if (g() || (th2 instanceof kr)) {
                this.f42717q = true;
            }
            throw th2;
        }
    }

    public final void a(u30 u30Var, boolean z5) throws InterruptedIOException {
        bz2 bz2VarC;
        long j10;
        u30 u30Var2;
        p30 p30Var;
        String str = u30Var.f43540h;
        int i = lb3.f40466a;
        if (this.f42718r) {
            bz2VarC = null;
        } else if (this.f42707f) {
            try {
                nr nrVar = this.f42702a;
                long j11 = this.f42714n;
                long j12 = this.f42715o;
                yy2 yy2Var = (yy2) nrVar;
                synchronized (yy2Var) {
                    yy2Var.a();
                    while (true) {
                        bz2VarC = yy2Var.c(str, j11, j12);
                        if (bz2VarC != null) {
                            break;
                        } else {
                            yy2Var.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            bz2VarC = ((yy2) this.f42702a).c(str, this.f42714n, this.f42715o);
        }
        if (bz2VarC == null) {
            p30 p30Var2 = this.f42705d;
            Uri uri = u30Var.f43533a;
            long j13 = u30Var.f43534b;
            int i10 = u30Var.f43535c;
            byte[] bArr = u30Var.f43536d;
            Map map = u30Var.f43537e;
            String str2 = u30Var.f43540h;
            int i11 = u30Var.i;
            j10 = -1;
            Object obj = u30Var.f43541j;
            long j14 = this.f42714n;
            long j15 = this.f42715o;
            ni.a(uri, "The uri must be set.");
            u30Var2 = new u30(uri, j13, i10, bArr, map, j14, j15, str2, i11, obj);
            bz2VarC = bz2VarC;
            p30Var = p30Var2;
        } else {
            j10 = -1;
            if (bz2VarC.f45520e) {
                Uri uriFromFile = Uri.fromFile(bz2VarC.f45521f);
                long j16 = bz2VarC.f45518c;
                long j17 = this.f42714n - j16;
                long jMin = bz2VarC.f45519d - j17;
                long j18 = this.f42715o;
                if (j18 != -1) {
                    jMin = Math.min(jMin, j18);
                }
                long j19 = jMin;
                int i12 = u30Var.f43535c;
                byte[] bArr2 = u30Var.f43536d;
                Map map2 = u30Var.f43537e;
                String str3 = u30Var.f43540h;
                int i13 = u30Var.i;
                Object obj2 = u30Var.f43541j;
                ni.a(uriFromFile, "The uri must be set.");
                u30Var2 = new u30(uriFromFile, j16, i12, bArr2, map2, j17, j19, str3, i13, obj2);
                p30Var = this.f42703b;
            } else {
                long jMin2 = bz2VarC.f45519d;
                if (jMin2 == -1) {
                    jMin2 = this.f42715o;
                } else {
                    long j20 = this.f42715o;
                    if (j20 != -1) {
                        jMin2 = Math.min(jMin2, j20);
                    }
                }
                long j21 = jMin2;
                Uri uri2 = u30Var.f43533a;
                long j22 = u30Var.f43534b;
                int i14 = u30Var.f43535c;
                byte[] bArr3 = u30Var.f43536d;
                Map map3 = u30Var.f43537e;
                String str4 = u30Var.f43540h;
                int i15 = u30Var.i;
                Object obj3 = u30Var.f43541j;
                long j23 = this.f42714n;
                ni.a(uri2, "The uri must be set.");
                u30Var2 = new u30(uri2, j22, i14, bArr3, map3, j23, j21, str4, i15, obj3);
                p30Var = this.f42704c;
                if (p30Var == null) {
                    p30Var = this.f42705d;
                    ((yy2) this.f42702a).a((zr) bz2VarC);
                    bz2VarC = null;
                }
            }
        }
        this.f42719s = (this.f42718r || p30Var != this.f42705d) ? Long.MAX_VALUE : this.f42714n + 102400;
        if (z5) {
            p30 p30Var3 = this.f42712l;
            p30 p30Var4 = this.f42705d;
            if (p30Var3 != p30Var4) {
                throw new IllegalStateException();
            }
            if (p30Var == p30Var4) {
                return;
            }
            try {
                d();
            } catch (Throwable th2) {
                if (!bz2VarC.f45520e) {
                    ((yy2) this.f42702a).a((zr) bz2VarC);
                }
                throw th2;
            }
        }
        if (bz2VarC != null && !bz2VarC.f45520e) {
            this.f42716p = bz2VarC;
        }
        this.f42712l = p30Var;
        this.f42711k = u30Var2;
        this.f42713m = 0L;
        long jA = p30Var.a(u30Var2);
        rz rzVar = new rz();
        if (u30Var2.f43539g == j10 && jA != j10) {
            this.f42715o = jA;
            rzVar.f42766a.put("exo_len", Long.valueOf(this.f42714n + jA));
            rzVar.f42767b.remove("exo_len");
        }
        if (!g()) {
            Uri uri3 = p30Var.getUri();
            this.i = uri3;
            Uri uri4 = !u30Var.f43533a.equals(uri3) ? this.i : null;
            if (uri4 == null) {
                rzVar.f42767b.add("exo_redir");
                rzVar.f42766a.remove("exo_redir");
            } else {
                String string = uri4.toString();
                HashMap map4 = rzVar.f42766a;
                string.getClass();
                map4.put("exo_redir", string);
                rzVar.f42767b.remove("exo_redir");
            }
        }
        if (this.f42712l == this.f42704c) {
            ((yy2) this.f42702a).a(str, rzVar);
        }
    }
}

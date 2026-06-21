package yads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rm1 f42971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ps2[] f42973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public um1 f42976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f42978h;
    public final ro[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v73 f42979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kn1 f42980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public sm1 f42981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l73 f42982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w73 f42983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f42984o;

    public sm1(ro[] roVarArr, long j10, v73 v73Var, ib0 ib0Var, kn1 kn1Var, um1 um1Var, w73 w73Var) {
        this.i = roVarArr;
        this.f42984o = j10;
        this.f42979j = v73Var;
        this.f42980k = kn1Var;
        an1 an1Var = um1Var.f43715a;
        this.f42972b = an1Var.f43366a;
        this.f42976f = um1Var;
        this.f42982m = l73.f40442e;
        this.f42983n = w73Var;
        this.f42973c = new ps2[roVarArr.length];
        this.f42978h = new boolean[roVarArr.length];
        this.f42971a = a(an1Var, kn1Var, ib0Var, um1Var.f43716b, um1Var.f43718d);
    }

    public final long a(w73 w73Var, long j10, boolean z5, boolean[] zArr) {
        w73 w73Var2;
        int i = 0;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= w73Var.f44301a) {
                break;
            }
            boolean[] zArr2 = this.f42978h;
            if (z5 || (w73Var2 = this.f42983n) == null || !lb3.a(w73Var.f44302b[i10], w73Var2.f44302b[i10]) || !lb3.a(w73Var.f44303c[i10], w73Var2.f44303c[i10])) {
                z10 = false;
            }
            zArr2[i10] = z10;
            i10++;
        }
        ps2[] ps2VarArr = this.f42973c;
        int i11 = 0;
        while (true) {
            ro[] roVarArr = this.i;
            if (i11 >= roVarArr.length) {
                break;
            }
            if (roVarArr[i11].f42644b == -2) {
                ps2VarArr[i11] = null;
            }
            i11++;
        }
        a();
        this.f42983n = w73Var;
        if (this.f42981l == null) {
            int i12 = 0;
            while (true) {
                w73 w73Var3 = this.f42983n;
                if (i12 >= w73Var3.f44301a) {
                    break;
                }
                boolean zA = w73Var3.a(i12);
                pp0 pp0Var = this.f42983n.f44303c[i12];
                if (zA && pp0Var != null) {
                    pp0Var.a();
                }
                i12++;
            }
        }
        long jA = this.f42971a.a(w73Var.f44303c, this.f42978h, this.f42973c, zArr, j10);
        ps2[] ps2VarArr2 = this.f42973c;
        int i13 = 0;
        while (true) {
            ro[] roVarArr2 = this.i;
            if (i13 >= roVarArr2.length) {
                break;
            }
            if (roVarArr2[i13].f42644b == -2 && this.f42983n.a(i13)) {
                ps2VarArr2[i13] = new xl0();
            }
            i13++;
        }
        this.f42975e = false;
        while (true) {
            ps2[] ps2VarArr3 = this.f42973c;
            if (i >= ps2VarArr3.length) {
                return jA;
            }
            if (ps2VarArr3[i] != null) {
                if (!w73Var.a(i)) {
                    throw new IllegalStateException();
                }
                if (this.i[i].f42644b != -2) {
                    this.f42975e = true;
                }
            } else if (w73Var.f44303c[i] != null) {
                throw new IllegalStateException();
            }
            i++;
        }
    }

    public final void b() {
        a();
        kn1 kn1Var = this.f42980k;
        rm1 rm1Var = this.f42971a;
        try {
            if (!(rm1Var instanceof tv)) {
                in1 in1Var = (in1) kn1Var.f40281c.remove(rm1Var);
                in1Var.getClass();
                in1Var.f39584a.a(rm1Var);
                in1Var.f39586c.remove(((ui1) rm1Var).f43675b);
                if (!kn1Var.f40281c.isEmpty()) {
                    Iterator it = kn1Var.i.iterator();
                    while (it.hasNext()) {
                        in1 in1Var2 = (in1) it.next();
                        if (in1Var2.f39586c.isEmpty()) {
                            hn1 hn1Var = (hn1) kn1Var.f40286h.get(in1Var2);
                            if (hn1Var != null) {
                                hn1Var.f39251a.a(hn1Var.f39252b);
                            }
                            it.remove();
                        }
                    }
                }
                if (in1Var.f39588e && in1Var.f39586c.isEmpty()) {
                    hn1 hn1Var2 = (hn1) kn1Var.f40286h.remove(in1Var);
                    hn1Var2.getClass();
                    hn1Var2.f39251a.c(hn1Var2.f39252b);
                    hn1Var2.f39251a.a((en1) hn1Var2.f39253c);
                    hn1Var2.f39251a.a((qk0) hn1Var2.f39253c);
                    kn1Var.i.remove(in1Var);
                    return;
                }
                return;
            }
            rm1 rm1Var2 = ((tv) rm1Var).f43445b;
            in1 in1Var3 = (in1) kn1Var.f40281c.remove(rm1Var2);
            in1Var3.getClass();
            in1Var3.f39584a.a(rm1Var2);
            in1Var3.f39586c.remove(((ui1) rm1Var2).f43675b);
            if (!kn1Var.f40281c.isEmpty()) {
                Iterator it2 = kn1Var.i.iterator();
                while (it2.hasNext()) {
                    in1 in1Var4 = (in1) it2.next();
                    if (in1Var4.f39586c.isEmpty()) {
                        hn1 hn1Var3 = (hn1) kn1Var.f40286h.get(in1Var4);
                        if (hn1Var3 != null) {
                            hn1Var3.f39251a.a(hn1Var3.f39252b);
                        }
                        it2.remove();
                    }
                }
            }
            if (in1Var3.f39588e && in1Var3.f39586c.isEmpty()) {
                hn1 hn1Var4 = (hn1) kn1Var.f40286h.remove(in1Var3);
                hn1Var4.getClass();
                hn1Var4.f39251a.c(hn1Var4.f39252b);
                hn1Var4.f39251a.a((en1) hn1Var4.f39253c);
                hn1Var4.f39251a.a((qk0) hn1Var4.f39253c);
                kn1Var.i.remove(in1Var3);
            }
        } catch (RuntimeException e3) {
            kh1.b("MediaPeriodHolder", kh1.a("Period release failed.", e3));
        }
    }

    public static rm1 a(an1 an1Var, kn1 kn1Var, ib0 ib0Var, long j10, long j11) {
        kn1Var.getClass();
        Object objC = e.c(an1Var.f43366a);
        an1 an1VarA = an1Var.a(e.b(an1Var.f43366a));
        in1 in1Var = (in1) kn1Var.f40282d.get(objC);
        in1Var.getClass();
        kn1Var.i.add(in1Var);
        hn1 hn1Var = (hn1) kn1Var.f40286h.get(in1Var);
        if (hn1Var != null) {
            hn1Var.f39251a.b(hn1Var.f39252b);
        }
        in1Var.f39586c.add(an1VarA);
        xi1 xi1Var = in1Var.f39584a;
        xi1Var.getClass();
        ui1 ui1Var = new ui1(an1VarA, ib0Var, j10);
        mo moVar = xi1Var.f44717k;
        if (ui1Var.f43678e == null) {
            ui1Var.f43678e = moVar;
            if (xi1Var.f44724r) {
                Object obj = an1VarA.f43366a;
                if (xi1Var.f44721o.f44059e != null && obj.equals(vi1.f44057f)) {
                    obj = xi1Var.f44721o.f44059e;
                }
                ui1Var.a(an1VarA.a(obj));
            } else {
                xi1Var.f44722p = ui1Var;
                if (!xi1Var.f44723q) {
                    xi1Var.f44723q = true;
                    xi1Var.a((Object) null, moVar);
                }
            }
            kn1Var.f40281c.put(ui1Var, in1Var);
            Iterator it = kn1Var.i.iterator();
            while (it.hasNext()) {
                in1 in1Var2 = (in1) it.next();
                if (in1Var2.f39586c.isEmpty()) {
                    hn1 hn1Var2 = (hn1) kn1Var.f40286h.get(in1Var2);
                    if (hn1Var2 != null) {
                        hn1Var2.f39251a.a(hn1Var2.f39252b);
                    }
                    it.remove();
                }
            }
            return j11 != -9223372036854775807L ? new tv(ui1Var, true, 0L, j11) : ui1Var;
        }
        throw new IllegalStateException();
    }

    public final void a() {
        if (this.f42981l != null) {
            return;
        }
        int i = 0;
        while (true) {
            w73 w73Var = this.f42983n;
            if (i >= w73Var.f44301a) {
                return;
            }
            boolean zA = w73Var.a(i);
            pp0 pp0Var = this.f42983n.f44303c[i];
            if (zA && pp0Var != null) {
                pp0Var.disable();
            }
            i++;
        }
    }
}

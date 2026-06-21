package yads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ss1 extends ry {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final hm1 f43062v;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f43063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f43064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mo[] f43065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v63[] f43066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f43067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hc0 f43068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f43069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ux1 f43070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f43071s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long[][] f43072t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public rs1 f43073u;

    static {
        ul1 ul1Var = new ul1();
        r51.g();
        um2 um2Var = um2.f43723f;
        f43062v = new hm1("MergingMediaSource", new wl1(ul1Var), null, new am1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), lm1.H, em1.f38181d);
    }

    public ss1(hc0 hc0Var, mo... moVarArr) {
        this.f43063k = false;
        this.f43064l = false;
        this.f43065m = moVarArr;
        this.f43068p = hc0Var;
        this.f43067o = new ArrayList(Arrays.asList(moVarArr));
        this.f43071s = -1;
        this.f43066n = new v63[moVarArr.length];
        this.f43072t = new long[0][];
        this.f43069q = new HashMap();
        this.f43070r = rx1.a().a().b();
    }

    @Override // yads.mo
    public final rm1 a(an1 an1Var, qe qeVar, long j10) {
        int length = this.f43065m.length;
        rm1[] rm1VarArr = new rm1[length];
        int iA = this.f43066n[0].a(an1Var.f43366a);
        for (int i = 0; i < length; i++) {
            rm1VarArr[i] = this.f43065m[i].a(an1Var.a(this.f43066n[i].a(iA)), qeVar, j10 - this.f43072t[iA][i]);
        }
        ps1 ps1Var = new ps1(this.f43068p, this.f43072t[iA], rm1VarArr);
        if (!this.f43064l) {
            return ps1Var;
        }
        Long l10 = (Long) this.f43069q.get(an1Var.f43366a);
        l10.getClass();
        tv tvVar = new tv(ps1Var, true, 0L, l10.longValue());
        this.f43070r.a(an1Var.f43366a, tvVar);
        return tvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        r14 = r14 + 1;
     */
    @Override // yads.ry
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r12, yads.mo r13, yads.v63 r14) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ss1.a(java.lang.Object, yads.mo, yads.v63):void");
    }

    @Override // yads.mo
    public final hm1 c() {
        mo[] moVarArr = this.f43065m;
        return moVarArr.length > 0 ? moVarArr[0].c() : f43062v;
    }

    @Override // yads.ry, yads.mo
    public final void d() throws rs1 {
        rs1 rs1Var = this.f43073u;
        if (rs1Var != null) {
            throw rs1Var;
        }
        super.d();
    }

    @Override // yads.ry, yads.mo
    public final void e() {
        super.e();
        Arrays.fill(this.f43066n, (Object) null);
        this.f43071s = -1;
        this.f43073u = null;
        this.f43067o.clear();
        Collections.addAll(this.f43067o, this.f43065m);
    }

    public ss1(mo[] moVarArr, int i) {
        this(new hc0(), moVarArr);
    }

    @Override // yads.ry
    public final an1 a(Object obj, an1 an1Var) {
        if (((Integer) obj).intValue() == 0) {
            return an1Var;
        }
        return null;
    }

    @Override // yads.mo
    public final void a(u83 u83Var) {
        this.f42764j = u83Var;
        this.i = lb3.a((Handler.Callback) null);
        for (int i = 0; i < this.f43065m.length; i++) {
            a(Integer.valueOf(i), this.f43065m[i]);
        }
    }

    @Override // yads.mo
    public final void a(rm1 rm1Var) {
        if (this.f43064l) {
            tv tvVar = (tv) rm1Var;
            ux1 ux1Var = this.f43070r;
            c0 c0Var = ux1Var.f37937b;
            if (c0Var == null) {
                c0Var = new c0(ux1Var);
                ux1Var.f37937b = c0Var;
            }
            Iterator it = c0Var.iterator();
            while (true) {
                o oVar = (o) it;
                if (!oVar.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) oVar.next();
                if (((tv) entry.getValue()).equals(tvVar)) {
                    ux1 ux1Var2 = this.f43070r;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ux1Var2.a().get(key);
                    if (collection != null) {
                        collection.remove(value);
                    }
                }
            }
            rm1Var = tvVar.f43445b;
        }
        ps1 ps1Var = (ps1) rm1Var;
        int i = 0;
        while (true) {
            mo[] moVarArr = this.f43065m;
            if (i >= moVarArr.length) {
                return;
            }
            mo moVar = moVarArr[i];
            rm1 rm1Var2 = ps1Var.f42003b[i];
            if (rm1Var2 instanceof ns1) {
                rm1Var2 = ((ns1) rm1Var2).f41345b;
            }
            moVar.a(rm1Var2);
            i++;
        }
    }
}

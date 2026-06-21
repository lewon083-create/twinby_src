package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.monetization.ads.exo.source.dash.i;
import java.io.IOException;
import yads.a23;
import yads.a30;
import yads.ae0;
import yads.af2;
import yads.am1;
import yads.an1;
import yads.bm1;
import yads.c30;
import yads.dn1;
import yads.eg1;
import yads.f30;
import yads.h30;
import yads.hc0;
import yads.hc2;
import yads.hg1;
import yads.hm1;
import yads.ig1;
import yads.io0;
import yads.jm1;
import yads.kh1;
import yads.lb3;
import yads.lu;
import yads.mo;
import yads.ni;
import yads.o30;
import yads.os2;
import yads.p30;
import yads.pk0;
import yads.qe;
import yads.rb2;
import yads.rm1;
import yads.sb2;
import yads.tk0;
import yads.u83;
import yads.vo;
import yads.we2;
import yads.xf1;
import yads.y13;
import yads.z13;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends mo {
    public hg1 A;
    public u83 B;
    public f30 C;
    public Handler D;
    public am1 E;
    public Uri F;
    public final Uri G;
    public boolean I;
    public long J;
    public long K;
    public int M;
    public int O;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hm1 f15037h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o30 f15038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a30 f15039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hc0 f15040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tk0 f15041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ae0 f15042n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f15044p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rb2 f15046r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Runnable f15050v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f15051w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p30 f15054z;
    public c30 H = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final vo f15043o = new vo();
    public final boolean i = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dn1 f15045q = b((an1) null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f15048t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseArray f15049u = new SparseArray();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f15052x = new c(this);
    public long N = -9223372036854775807L;
    public long L = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f15047s = new e(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ig1 f15053y = new f(this);

    static {
        io0.a("goog.exo.dash");
    }

    public i(hm1 hm1Var, o30 o30Var, rb2 rb2Var, a30 a30Var, hc0 hc0Var, tk0 tk0Var, ae0 ae0Var, long j10) {
        this.f15037h = hm1Var;
        this.E = hm1Var.f39246d;
        this.F = ((bm1) ni.a(hm1Var.f39245c)).f37092a;
        this.G = hm1Var.f39245c.f37092a;
        this.f15038j = o30Var;
        this.f15046r = rb2Var;
        this.f15039k = a30Var;
        this.f15041m = tk0Var;
        this.f15042n = ae0Var;
        this.f15044p = j10;
        this.f15040l = hc0Var;
        final int i = 0;
        this.f15050v = new Runnable(this) { // from class: te.a

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f33783c;

            {
                this.f33783c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f33783c.h();
                        break;
                    default:
                        this.f33783c.f();
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f15051w = new Runnable(this) { // from class: te.a

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f33783c;

            {
                this.f33783c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f33783c.h();
                        break;
                    default:
                        this.f33783c.f();
                        break;
                }
            }
        };
    }

    @Override // yads.mo
    public final rm1 a(an1 an1Var, qe qeVar, long j10) {
        int iIntValue = ((Integer) an1Var.f43366a).intValue() - this.O;
        dn1 dn1Var = new dn1(this.f40975c.f37847c, 0, an1Var, ((hc2) this.H.f37264m.get(iIntValue)).f39126b);
        pk0 pk0VarA = a(an1Var);
        int i = this.O + iIntValue;
        c30 c30Var = this.H;
        vo voVar = this.f15043o;
        a30 a30Var = this.f15039k;
        u83 u83Var = this.B;
        tk0 tk0Var = this.f15041m;
        ae0 ae0Var = this.f15042n;
        long j11 = this.L;
        ig1 ig1Var = this.f15053y;
        hc0 hc0Var = this.f15040l;
        c cVar = this.f15052x;
        af2 af2Var = this.f40979g;
        if (af2Var == null) {
            throw new IllegalStateException();
        }
        h30 h30Var = new h30(i, c30Var, voVar, iIntValue, a30Var, u83Var, tk0Var, pk0VarA, ae0Var, dn1Var, j11, ig1Var, qeVar, hc0Var, cVar, af2Var);
        this.f15049u.put(i, h30Var);
        return h30Var;
    }

    @Override // yads.mo
    public final hm1 c() {
        return this.f15037h;
    }

    @Override // yads.mo
    public final void d() {
        this.f15053y.a();
    }

    @Override // yads.mo
    public final void e() {
        this.I = false;
        this.f15054z = null;
        hg1 hg1Var = this.A;
        if (hg1Var != null) {
            hg1Var.a((eg1) null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.f15049u.clear();
        vo voVar = this.f15043o;
        voVar.f44100a.clear();
        voVar.f44101b.clear();
        voVar.f44102c.clear();
        this.f15041m.release();
    }

    public final /* synthetic */ void f() {
        a(false);
    }

    public final void g() {
        boolean z5;
        hg1 hg1Var = this.A;
        a aVar = new a(this);
        synchronized (a23.f36619b) {
            z5 = a23.f36620c;
        }
        if (z5) {
            aVar.a();
            return;
        }
        if (hg1Var == null) {
            hg1Var = new hg1("SntpClient");
        }
        hg1Var.a(new z13(), new y13(aVar), 1);
    }

    public final void h() {
        Uri uri;
        this.D.removeCallbacks(this.f15050v);
        hg1 hg1Var = this.A;
        if (hg1Var.f39175c != null) {
            return;
        }
        if (hg1Var.b()) {
            this.I = true;
            return;
        }
        synchronized (this.f15048t) {
            uri = this.F;
        }
        this.I = false;
        sb2 sb2Var = new sb2(this.f15054z, uri, 4, this.f15046r);
        this.A.a(sb2Var, this.f15047s, this.f15042n.a(4));
        dn1 dn1Var = this.f15045q;
        Uri uri2 = sb2Var.f42879b.f43533a;
        dn1Var.c(new xf1(), new jm1(sb2Var.f42880c, -1, null, 0, null, dn1Var.a(-9223372036854775807L), dn1Var.a(-9223372036854775807L)));
    }

    @Override // yads.mo
    public final void a(u83 u83Var) {
        this.B = u83Var;
        this.f15041m.prepare();
        tk0 tk0Var = this.f15041m;
        Looper looperMyLooper = Looper.myLooper();
        af2 af2Var = this.f40979g;
        if (af2Var != null) {
            tk0Var.a(looperMyLooper, af2Var);
            if (this.i) {
                a(false);
                return;
            }
            this.f15054z = this.f15038j.createDataSource();
            this.A = new hg1("DashMediaSource");
            this.D = lb3.a((Handler.Callback) null);
            h();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final void a(rm1 rm1Var) {
        h30 h30Var = (h30) rm1Var;
        we2 we2Var = h30Var.f39000n;
        we2Var.f44365j = true;
        we2Var.f44361e.removeCallbacksAndMessages(null);
        for (lu luVar : h30Var.f39006t) {
            luVar.f40678s = h30Var;
            os2 os2Var = luVar.f40673n;
            os2Var.a();
            os2Var.d();
            for (os2 os2Var2 : luVar.f40674o) {
                os2Var2.a();
                os2Var2.d();
            }
            luVar.f40669j.a(luVar);
        }
        h30Var.f39005s = null;
        this.f15049u.remove(h30Var.f38989b);
    }

    public final void a(IOException iOException) {
        kh1.b("DashMediaSource", kh1.a("Failed to resolve time offset.", iOException));
        a(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x053d  */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [int] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27, types: [int] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r15v12, types: [yads.pp0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r42) {
        /*
            Method dump skipped, instruction units count: 1430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.exo.source.dash.i.a(boolean):void");
    }
}

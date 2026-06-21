package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ot1 extends ip1 {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f8771f0 = 0;
    public final y5 A;
    public final long B;
    public final yd1 C;
    public final com.google.android.gms.internal.consent_sdk.c D;
    public final l91 E;
    public final HashMap F;
    public int G;
    public int H;
    public boolean I;
    public final tu1 J;
    public final uu1 K;
    public final et1 L;
    public qd M;
    public r7 N;
    public Object O;
    public Surface P;
    public final int Q;
    public yk0 R;
    public final s50 S;
    public float T;
    public boolean U;
    public final boolean V;
    public boolean W;
    public final int X;
    public boolean Y;
    public us1 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public r7 f8772a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public lu1 f8773b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f8774c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f8775d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f8776d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qd f8777e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public iz1 f8778e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cb0 f8779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f8780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vu1 f8781h;
    public final gx1[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gx1[] f8782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f8783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lo0 f8784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final in0 f8785m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ut1 f8786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final yf0 f8787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArraySet f8788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bh f8789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f8790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final bv1 f8792t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Looper f8793u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f8794v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c6 f8795w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ht1 f8796x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f8797y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final tr0 f8798z;

    static {
        e6.a("media3.exoplayer");
    }

    public ot1(dt1 dt1Var, vu1 vu1Var) {
        super(5);
        this.f8779f = new cb0();
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = cq0.f4293a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(str).length() + 1);
            sb2.append("Init ");
            sb2.append(hexString);
            sb2.append(" [AndroidXMedia3/1.9.0-beta01] [");
            sb2.append(str);
            sb2.append("]");
            rs.n("ExoPlayerImpl", sb2.toString());
            Context context = dt1Var.f4650a;
            c6 c6Var = dt1Var.f4651b;
            Looper looper = dt1Var.f4657h;
            this.f8780g = context.getApplicationContext();
            this.f8792t = new bv1(c6Var);
            this.X = dt1Var.i;
            this.S = dt1Var.f4658j;
            this.Q = dt1Var.f4659k;
            this.U = false;
            this.B = dt1Var.f4664p;
            ht1 ht1Var = new ht1(this);
            this.f8796x = ht1Var;
            this.f8797y = new y(1);
            this.i = ((ox0) dt1Var.f4652c.f9149c).j(new Handler(looper), ht1Var, ht1Var);
            this.f8782j = new gx1[2];
            int i = 0;
            while (true) {
                gx1[] gx1VarArr = this.f8782j;
                int length = gx1VarArr.length;
                if (i >= 2) {
                    break;
                }
                gx1 gx1Var = this.i[i];
                gx1VarArr[i] = null;
                i++;
            }
            this.f8783k = (b) dt1Var.f4654e.mo8h();
            dt1Var.f4653d.h();
            this.f8794v = (l) dt1Var.f4656g.mo8h();
            this.f8791s = dt1Var.f4660l;
            this.K = dt1Var.f4661m;
            this.J = dt1Var.f4662n;
            this.f8793u = looper;
            this.f8795w = c6Var;
            this.f8781h = vu1Var;
            this.f8787o = new yf0(new CopyOnWriteArraySet(), looper, looper.getThread(), c6Var, (be0) new jl1(17, this), true);
            this.f8788p = new CopyOnWriteArraySet();
            this.f8790r = new ArrayList();
            this.f8778e0 = new iz1();
            this.L = et1.f5067a;
            int length2 = this.i.length;
            this.f8775d = new g(new ru1[2], new d[2], no.f8387b, null);
            this.f8789q = new bh();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i10 = 0; i10 < 20; i10++) {
                int i11 = iArr[i10];
                ix.k0(!false);
                sparseBooleanArray.append(i11, true);
            }
            this.f8783k.getClass();
            ix.k0(!false);
            sparseBooleanArray.append(29, true);
            ix.k0(!false);
            cw1 cw1Var = new cw1(sparseBooleanArray);
            this.f8777e = new qd(cw1Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < cw1Var.f4351a.size(); i12++) {
                int iA = cw1Var.a(i12);
                ix.k0(!false);
                sparseBooleanArray2.append(iA, true);
            }
            ix.k0(!false);
            sparseBooleanArray2.append(4, true);
            ix.k0(!false);
            sparseBooleanArray2.append(10, true);
            ix.k0(!false);
            this.M = new qd(new cw1(sparseBooleanArray2));
            this.f8784l = this.f8795w.y(this.f8793u, null);
            in0 in0Var = new in0(15, this);
            this.f8785m = in0Var;
            this.f8773b0 = lu1.a(this.f8775d);
            this.f8792t.B(this.f8781h, this.f8793u);
            fv1 fv1Var = new fv1(dt1Var.f4671w);
            ut1 ut1Var = new ut1(this.f8780g, this.i, this.f8782j, this.f8783k, this.f8775d, (wt1) dt1Var.f4655f.mo8h(), this.f8794v, this.f8792t, this.K, dt1Var.f4672x, dt1Var.f4663o, this.f8793u, this.f8795w, in0Var, fv1Var, this.L);
            Looper looper2 = ut1Var.f11083k;
            lo0 lo0Var = ut1Var.i;
            this.f8786n = ut1Var;
            this.T = 1.0f;
            r7 r7Var = r7.B;
            this.N = r7Var;
            this.f8772a0 = r7Var;
            this.f8774c0 = -1;
            i41 i41Var = l50.f7396a;
            this.V = true;
            bv1 bv1Var = this.f8792t;
            bv1Var.getClass();
            this.f8787o.g(bv1Var);
            l lVar = this.f8794v;
            Handler handler = new Handler(this.f8793u);
            bv1 bv1Var2 = this.f8792t;
            n nVar = (n) lVar;
            nVar.getClass();
            bv1Var2.getClass();
            ox0 ox0Var = nVar.f8067d;
            CopyOnWriteArrayList<k> copyOnWriteArrayList = (CopyOnWriteArrayList) ox0Var.f8851c;
            for (k kVar : copyOnWriteArrayList) {
                if (kVar.f7038b == bv1Var2) {
                    kVar.f7039c = true;
                    copyOnWriteArrayList.remove(kVar);
                }
            }
            ((CopyOnWriteArrayList) ox0Var.f8851c).add(new k(handler, bv1Var2));
            this.f8788p.add(this.f8796x);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 31) {
                this.f8795w.y(looper2, null).e(new ft1(this.f8780g, dt1Var.f4669u, this, fv1Var));
            }
            yd1 yd1Var = new yd1(looper2, this.f8793u, this.f8795w, new pp0(9, this));
            this.C = yd1Var;
            kr0 kr0Var = new kr0(14, this);
            lo0 lo0Var2 = (lo0) yd1Var.f12600c;
            if (lo0Var2.f7588a.getLooper().getThread().isAlive()) {
                lo0Var2.e(kr0Var);
            }
            c6 c6Var2 = this.f8795w;
            fp fpVar = new fp(13);
            context.getApplicationContext();
            c6Var2.y(looper2, null);
            new bj.g(fpVar, c6Var2.y(looper, null));
            boolean z5 = (dt1Var.f4666r == Integer.MAX_VALUE || dt1Var.f4667s == Integer.MAX_VALUE) ? false : true;
            tr0 tr0Var = new tr0(context, looper2, this.f8795w);
            this.f8798z = tr0Var;
            if (tr0Var.f10701b != z5) {
                tr0Var.f10701b = z5;
                tr0Var.h(z5, tr0Var.f10702c);
            }
            c6 c6Var3 = this.f8795w;
            y5 y5Var = new y5(4);
            context.getApplicationContext();
            c6Var3.y(looper2, null);
            c6Var3.y(Looper.getMainLooper(), null);
            this.A = y5Var;
            int i14 = ju1.f6943a;
            bs bsVar = bs.f3859d;
            this.R = yk0.f12649c;
            this.E = i13 >= 34 ? new l91(this, context) : null;
            this.F = new HashMap();
            this.Z = us1.f11057b;
            this.D = new com.google.android.gms.internal.consent_sdk.c(this, this.f8796x, this.f8795w, dt1Var.f4665q, dt1Var.f4666r, dt1Var.f4667s, dt1Var.f4668t);
            lo0Var.b(38, this.J).a();
            s50 s50Var = this.S;
            Handler handler2 = lo0Var.f7588a;
            go0 go0VarG = lo0.g();
            go0VarG.f5884a = handler2.obtainMessage(31, 0, 0, s50Var);
            go0VarG.a();
            W1(1, 3, this.S);
            W1(2, 4, Integer.valueOf(this.Q));
            W1(2, 5, 0);
            W1(1, 9, Boolean.valueOf(this.U));
            W1(6, 8, this.f8797y);
            W1(-1, 16, Integer.valueOf(this.X));
            this.f8779f.a();
        } catch (Throwable th2) {
            this.f8779f.a();
            throw th2;
        }
    }

    public static us1 J1(us1 us1Var, List list) {
        HashMap map = new HashMap(us1Var.f11058a);
        HashSet hashSet = new HashSet(list);
        for (String str : us1Var.f11058a.keySet()) {
            if (!hashSet.contains(str)) {
                map.remove(str);
            }
        }
        return new us1(map);
    }

    public static long Q1(lu1 lu1Var) {
        nh nhVar = new nh();
        bh bhVar = new bh();
        ci ciVar = lu1Var.f7632a;
        ciVar.o(lu1Var.f7633b.f6299a, bhVar);
        long j10 = lu1Var.f7634c;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        ciVar.b(bhVar.f3786c, nhVar, 0L).getClass();
        return 0L;
    }

    public static lu1 S1(lu1 lu1Var, int i) {
        lu1 lu1VarD = lu1Var.d(i);
        return (i == 1 || i == 4) ? lu1VarD.f(false) : lu1VarD;
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final long B1() {
        J0();
        return cq0.r(O1(this.f8773b0));
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final long C1() {
        J0();
        return cq0.r(this.f8773b0.f7647q);
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final boolean D1() {
        J0();
        return this.f8773b0.f7633b.b();
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final int E1() {
        J0();
        if (D1()) {
            return this.f8773b0.f7633b.f6301c;
        }
        return -1;
    }

    public final void F1(float f10) {
        J0();
        String str = cq0.f4293a;
        float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.T == fMax) {
            return;
        }
        this.T = fMax;
        this.f8786n.i.b(32, Float.valueOf(fMax)).a();
        jl1 jl1Var = new jl1(fMax);
        yf0 yf0Var = this.f8787o;
        yf0Var.i(22, jl1Var);
        yf0Var.j();
    }

    public final void G1(yu1 yu1Var) {
        this.f8792t.f3919f.g(yu1Var);
    }

    public final void H1(jz jzVar) {
        J0();
        this.f8792t.f3919f.h(jzVar);
    }

    public final void I1() {
        String str;
        boolean zC;
        Context context;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = cq0.f4293a;
        HashSet hashSet = e6.f4841a;
        synchronized (e6.class) {
            str = e6.f4842b;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 40 + String.valueOf(str2).length() + 3 + String.valueOf(str).length() + 1);
        l7.o.t(sb2, "Release ", hexString, " [AndroidXMedia3/1.9.0-beta01] [", str2);
        sb2.append("] [");
        sb2.append(str);
        sb2.append("]");
        rs.n("ExoPlayerImpl", sb2.toString());
        J0();
        this.f8798z.e(false);
        y5 y5Var = this.A;
        if (y5Var.f12499c) {
            y5Var.f12499c = false;
        }
        l91 l91Var = this.E;
        if (l91Var != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) l91Var.f7465c).get()) != null) {
            context.unregisterDeviceIdChangeListener((nt1) l91Var.f7466d);
        }
        com.google.android.gms.internal.consent_sdk.c cVar = this.D;
        ((lo0) cVar.f13341e).f7588a.removeCallbacksAndMessages(null);
        ot1 ot1Var = (ot1) cVar.f13337a;
        ll0 ll0Var = (ll0) cVar.f13338b;
        ot1Var.J0();
        ll0Var.getClass();
        ot1Var.f8787o.h(ll0Var);
        ut1 ut1Var = this.f8786n;
        if (ut1Var.I || !ut1Var.f11083k.getThread().isAlive()) {
            zC = true;
        } else {
            ut1Var.I = true;
            cb0 cb0Var = new cb0();
            ut1Var.i.b(7, cb0Var).a();
            zC = cb0Var.c(ut1Var.f11093u);
        }
        if (!zC) {
            yf0 yf0Var = this.f8787o;
            yf0Var.i(10, jl1.f6880e);
            yf0Var.j();
        }
        this.f8787o.k();
        this.f8784l.f7588a.removeCallbacksAndMessages(null);
        l lVar = this.f8794v;
        bv1 bv1Var = this.f8792t;
        CopyOnWriteArrayList<k> copyOnWriteArrayList = (CopyOnWriteArrayList) ((n) lVar).f8067d.f8851c;
        for (k kVar : copyOnWriteArrayList) {
            if (kVar.f7038b == bv1Var) {
                kVar.f7039c = true;
                copyOnWriteArrayList.remove(kVar);
            }
        }
        this.f8773b0.getClass();
        lu1 lu1VarS1 = S1(this.f8773b0, 1);
        this.f8773b0 = lu1VarS1;
        lu1 lu1VarG = lu1VarS1.g(lu1VarS1.f7633b);
        this.f8773b0 = lu1VarG;
        lu1VarG.f7646p = lu1VarG.f7648r;
        this.f8773b0.f7647q = 0L;
        lo0 lo0Var = bv1Var.f3921h;
        lo0Var.getClass();
        lo0Var.e(new kr0(17, bv1Var));
        Surface surface = this.P;
        if (surface != null) {
            surface.release();
            this.P = null;
        }
        i41 i41Var = l50.f7396a;
        this.Y = true;
    }

    public final void J0() {
        this.f8779f.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f8793u;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = cq0.f4293a;
            Locale locale = Locale.US;
            String strF = t.z.f("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.V) {
                throw new IllegalStateException(strF);
            }
            rs.w("ExoPlayerImpl", strF, this.W ? null : new IllegalStateException());
            this.W = true;
        }
    }

    public final void K1(bt1 bt1Var) {
        lu1 lu1Var = this.f8773b0;
        lu1 lu1VarG = lu1Var.g(lu1Var.f7633b);
        lu1VarG.f7646p = lu1VarG.f7648r;
        lu1VarG.f7647q = 0L;
        lu1 lu1VarS1 = S1(lu1VarG, 1);
        if (bt1Var != null) {
            lu1VarS1 = lu1VarS1.e(bt1Var);
        }
        lu1 lu1Var2 = lu1VarS1;
        this.G++;
        Handler handler = this.f8786n.i.f7588a;
        go0 go0VarG = lo0.g();
        go0VarG.f5884a = handler.obtainMessage(6);
        go0VarG.a();
        P1(lu1Var2, 0, false, 5, -9223372036854775807L, -1);
    }

    public final int M1(lu1 lu1Var) {
        ci ciVar = lu1Var.f7632a;
        return ciVar.g() ? this.f8774c0 : ciVar.o(lu1Var.f7633b.f6299a, this.f8789q).f3786c;
    }

    public final long N1(lu1 lu1Var) {
        long jR = cq0.r(0L);
        hy1 hy1Var = lu1Var.f7633b;
        if (!hy1Var.b()) {
            return cq0.r(O1(lu1Var));
        }
        ci ciVar = lu1Var.f7632a;
        ciVar.o(hy1Var.f6299a, this.f8789q);
        long j10 = lu1Var.f7634c;
        if (j10 != -9223372036854775807L) {
            return cq0.r(j10) + jR;
        }
        ciVar.b(M1(lu1Var), (nh) this.f6568b, 0L).getClass();
        return jR;
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final long O() {
        J0();
        return N1(this.f8773b0);
    }

    public final long O1(lu1 lu1Var) {
        ci ciVar = lu1Var.f7632a;
        if (ciVar.g()) {
            return cq0.s(this.f8776d0);
        }
        long j10 = lu1Var.f7648r;
        hy1 hy1Var = lu1Var.f7633b;
        if (hy1Var.b()) {
            return j10;
        }
        ciVar.o(hy1Var.f6299a, this.f8789q);
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x056d A[LOOP:0: B:270:0x0565->B:272:0x056d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x057e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x058a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0597 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public final void P1(final com.google.android.gms.internal.ads.lu1 r33, int r34, boolean r35, int r36, long r37, int r39) {
        /*
            Method dump skipped, instruction units count: 1554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ot1.P1(com.google.android.gms.internal.ads.lu1, int, boolean, int, long, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.lu1 R1(com.google.android.gms.internal.ads.lu1 r23, com.google.android.gms.internal.ads.ci r24, android.util.Pair r25) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ot1.R1(com.google.android.gms.internal.ads.lu1, com.google.android.gms.internal.ads.ci, android.util.Pair):com.google.android.gms.internal.ads.lu1");
    }

    public final Pair T1(ci ciVar, int i, long j10) {
        if (ciVar.g()) {
            this.f8774c0 = i;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f8776d0 = j10;
            return null;
        }
        if (i == -1 || i >= ciVar.a()) {
            i = ciVar.k(false);
            ciVar.b(i, (nh) this.f6568b, 0L).getClass();
            j10 = cq0.r(0L);
        }
        return ciVar.m((nh) this.f6568b, this.f8789q, i, cq0.s(j10));
    }

    public final void U1(Surface surface) {
        Object obj = this.O;
        boolean z5 = false;
        boolean zC = true;
        if (obj != null && obj != surface) {
            z5 = true;
        }
        long j10 = z5 ? this.B : -9223372036854775807L;
        ut1 ut1Var = this.f8786n;
        if (!ut1Var.I && ut1Var.f11083k.getThread().isAlive()) {
            cb0 cb0Var = new cb0();
            ut1Var.i.b(30, new Pair(surface, cb0Var)).a();
            if (j10 != -9223372036854775807L) {
                zC = cb0Var.c(j10);
            }
        }
        if (z5) {
            Object obj2 = this.O;
            Surface surface2 = this.P;
            if (obj2 == surface2) {
                surface2.release();
                this.P = null;
            }
        }
        this.O = surface;
        if (zC) {
            return;
        }
        K1(new bt1(2, new oc("Detaching surface timed out."), 1003));
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final void V(int i, long j10) {
        J0();
        if (i == -1) {
            return;
        }
        ix.o(i >= 0);
        ci ciVar = this.f8773b0.f7632a;
        if (ciVar.g() || i < ciVar.a()) {
            bv1 bv1Var = this.f8792t;
            if (!bv1Var.i) {
                xu1 xu1VarT = bv1Var.t();
                bv1Var.i = true;
                bv1Var.r(xu1VarT, -1, new jl1(26, (byte) 0));
            }
            this.G++;
            if (D1()) {
                rs.r("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                st1 st1Var = new st1(0, this.f8773b0);
                st1Var.f(1);
                ot1 ot1Var = (ot1) this.f8785m.f6553c;
                ot1Var.f8784l.e(new th0(18, ot1Var, st1Var));
                return;
            }
            lu1 lu1VarD = this.f8773b0;
            int i10 = lu1VarD.f7636e;
            if (i10 == 3 || (i10 == 4 && !ciVar.g())) {
                lu1VarD = this.f8773b0.d(2);
            }
            int iZ1 = z1();
            lu1 lu1VarR1 = R1(lu1VarD, ciVar, T1(ciVar, i, j10));
            long jS = cq0.s(j10);
            ut1 ut1Var = this.f8786n;
            ut1Var.getClass();
            ut1Var.i.b(3, new tt1(ciVar, i, jS)).a();
            P1(lu1VarR1, 0, true, 1, O1(lu1VarR1), iZ1);
        }
    }

    public final void V1(int i, int i10) {
        yk0 yk0Var = this.R;
        if (i == yk0Var.f12650a && i10 == yk0Var.f12651b) {
            return;
        }
        this.R = new yk0(i, i10);
        jl1 jl1Var = new jl1(i, i10);
        yf0 yf0Var = this.f8787o;
        yf0Var.i(24, jl1Var);
        yf0Var.j();
        W1(2, 14, new yk0(i, i10));
    }

    public final void W1(int i, int i10, Object obj) {
        ut1 ut1Var;
        gx1[] gx1VarArr = this.i;
        int length = gx1VarArr.length;
        int i11 = 0;
        while (true) {
            ut1Var = this.f8786n;
            if (i11 >= 2) {
                break;
            }
            gx1 gx1Var = gx1VarArr[i11];
            if (i == -1 || gx1Var.f5933c == i) {
                M1(this.f8773b0);
                ci ciVar = this.f8773b0.f7632a;
                ou1 ou1Var = new ou1(ut1Var, gx1Var, ut1Var.f11083k);
                ix.k0(!ou1Var.f8811f);
                ou1Var.f8808c = i10;
                ix.k0(!ou1Var.f8811f);
                ou1Var.f8809d = obj;
                ou1Var.a();
            }
            i11++;
        }
        gx1[] gx1VarArr2 = this.f8782j;
        int length2 = gx1VarArr2.length;
        for (int i12 = 0; i12 < 2; i12++) {
            gx1 gx1Var2 = gx1VarArr2[i12];
            if (gx1Var2 != null && (i == -1 || gx1Var2.f5933c == i)) {
                M1(this.f8773b0);
                ci ciVar2 = this.f8773b0.f7632a;
                ou1 ou1Var2 = new ou1(ut1Var, gx1Var2, ut1Var.f11083k);
                ix.k0(!ou1Var2.f8811f);
                ou1Var2.f8808c = i10;
                ix.k0(!ou1Var2.f8811f);
                ou1Var2.f8809d = obj;
                ou1Var2.a();
            }
        }
    }

    public final void Y1(boolean z5) {
        J0();
        lu1 lu1Var = this.f8773b0;
        int i = lu1Var.f7644n;
        int i10 = 0;
        if (i == 1) {
            if (z5) {
                i = 1;
            } else {
                i = 1;
                i10 = 1;
            }
        }
        if (lu1Var.f7642l == z5 && i == i10 && lu1Var.f7643m == 1) {
            return;
        }
        this.G++;
        lu1 lu1VarH = lu1Var.h(1, i10, z5);
        int i11 = (i10 << 4) | 1;
        Handler handler = this.f8786n.i.f7588a;
        go0 go0VarG = lo0.g();
        go0VarG.f5884a = handler.obtainMessage(1, z5 ? 1 : 0, i11);
        go0VarG.a();
        P1(lu1VarH, 0, false, 5, -9223372036854775807L, -1);
    }

    public final long Z1() {
        J0();
        if (!D1()) {
            ci ciVarV1 = v1();
            if (ciVarV1.g()) {
                return -9223372036854775807L;
            }
            return cq0.r(ciVarV1.b(z1(), (nh) this.f6568b, 0L).f8306j);
        }
        lu1 lu1Var = this.f8773b0;
        hy1 hy1Var = lu1Var.f7633b;
        ci ciVar = lu1Var.f7632a;
        Object obj = hy1Var.f6299a;
        bh bhVar = this.f8789q;
        ciVar.o(obj, bhVar);
        return cq0.r(bhVar.b(hy1Var.f6300b, hy1Var.f6301c));
    }

    public final long a2() {
        J0();
        if (D1()) {
            lu1 lu1Var = this.f8773b0;
            return lu1Var.f7641k.equals(lu1Var.f7633b) ? cq0.r(this.f8773b0.f7646p) : Z1();
        }
        J0();
        if (this.f8773b0.f7632a.g()) {
            return this.f8776d0;
        }
        lu1 lu1Var2 = this.f8773b0;
        long j10 = 0;
        if (lu1Var2.f7641k.f6302d != lu1Var2.f7633b.f6302d) {
            return cq0.r(lu1Var2.f7632a.b(z1(), (nh) this.f6568b, 0L).f8306j);
        }
        long j11 = lu1Var2.f7646p;
        if (this.f8773b0.f7641k.b()) {
            lu1 lu1Var3 = this.f8773b0;
            lu1Var3.f7632a.o(lu1Var3.f7641k.f6299a, this.f8789q).f3789f.a(this.f8773b0.f7641k.f6300b).getClass();
        } else {
            j10 = j11;
        }
        lu1 lu1Var4 = this.f8773b0;
        lu1Var4.f7632a.o(lu1Var4.f7641k.f6299a, this.f8789q);
        return cq0.r(j10);
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final int c0() {
        J0();
        return this.f8773b0.f7636e;
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final int d0() {
        J0();
        return this.f8773b0.f7644n;
    }

    @Override // com.google.android.gms.internal.ads.ip1, com.google.android.gms.internal.ads.e70
    public final void e() {
        J0();
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final boolean e0() {
        J0();
        return this.f8773b0.f7642l;
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final void f0() {
        J0();
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final no h0() {
        J0();
        return (no) this.f8773b0.i.f5555e;
    }

    public final void r() {
        J0();
        K1(null);
        r51 r51Var = r51.f9713f;
        long j10 = this.f8773b0.f7648r;
        new l50(r51Var);
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final int t() {
        J0();
        if (D1()) {
            return this.f8773b0.f7633b.f6300b;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final ci v1() {
        J0();
        return this.f8773b0.f7632a;
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final int y1() {
        J0();
        if (!this.f8773b0.f7632a.g()) {
            lu1 lu1Var = this.f8773b0;
            return lu1Var.f7632a.e(lu1Var.f7633b.f6299a);
        }
        int i = this.f8774c0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final int z1() {
        J0();
        int iM1 = M1(this.f8773b0);
        if (iM1 == -1) {
            return 0;
        }
        return iM1;
    }
}

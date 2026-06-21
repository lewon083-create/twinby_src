package yads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import io.sentry.clientreport.DiscardedEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r32 {
    public final nj A;
    public final j83 B;
    public final c82 C;
    public final t20 D;
    public final wz1 E;
    public final String F;
    public final vw1 G;
    public final d83 H;
    public final x3 I;
    public final gv J;
    public final vi K;
    public n12 L;
    public final o32 M;
    public final List N;
    public final f42 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz1 f42459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m72 f42460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l52 f42461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o72 f42462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nu2 f42463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zz1 f42464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d4 f42465h;
    public final v9 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f12 f42466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final py2 f42467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j32 f42468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i10 f42469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s53 f42470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z51 f42471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oq f42472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p12 f42473q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final co1 f42474r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cj f42475s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e61 f42476t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ln2 f42477u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final bq f42478v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xp0 f42479w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final jy1 f42480x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mm2 f42481y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final yp0 f42482z;

    public /* synthetic */ r32(Context context, up upVar, hz1 hz1Var) {
        m72 m72VarH = upVar.h();
        l52 l52VarG = upVar.g();
        o72 o72VarI = upVar.i();
        ty1 ty1VarD = upVar.d();
        nu2 nu2VarJ = upVar.j();
        zz1 zz1VarE = upVar.e();
        h32 h32VarC = upVar.c();
        v12 v12VarB = upVar.b();
        hy1 hy1VarF = upVar.f();
        va vaVarA = upVar.a();
        d4 d4VarA = ty1VarD.a();
        e00 e00VarA = d4VarA.a();
        v9 v9VarB = ty1VarD.b();
        f12 f12VarC = ty1VarD.c();
        List listB = o72VarI.b();
        String strA = o72VarI.a();
        py2 py2VarB = f12VarC.b();
        j32 j32Var = new j32();
        i10 i10Var = new i10(j32Var);
        s53 s53Var = new s53();
        z51 z51Var = new z51();
        i92 i92Var = new i92();
        yc2 yc2VarA = yc2.f44998h.a(context);
        mn2 mn2Var = new mn2();
        oq oqVar = new oq();
        c61 c61Var = new c61();
        o5 o5VarA = zz1VarE.a();
        p12 p12VarA = o12.a();
        co1 co1Var = new co1(context, d4VarA, nu2VarJ);
        e9 e9Var = new e9(new y12(l52VarG), v12VarB);
        cj cjVar = new cj(listB);
        this(context, hz1Var, m72VarH, l52VarG, o72VarI, nu2VarJ, zz1VarE, h32VarC, hy1VarF, vaVarA, d4VarA, v9VarB, f12VarC, listB, py2VarB, j32Var, i10Var, s53Var, z51Var, i92Var, yc2VarA, mn2Var, oqVar, c61Var, p12VarA, co1Var, e9Var, cjVar, new g42(cjVar), new e61(context, v9VarB, d4VarA, nu2VarJ, o72VarI.c()), new ln2(listB), new bq(o5VarA, e00VarA, v9VarB, strA, ((lu3) nu2VarJ).a()), new xp0(context, nu2VarJ, o5VarA, e00VarA, v9VarB, strA), new jy1(context, nu2VarJ, o5VarA, e00VarA, strA), new mm2(context, nu2VarJ, o5VarA, e00VarA, v9VarB, strA), new yp0(listB), new nj(listB), new f5(new g02(strA)), new j83(), new c82(d4VarA, v9VarB, listB), new t20(context, d4VarA, nu2VarJ, hy1VarF != null ? hy1VarF.a() : null));
    }

    public final void b(n12 n12Var) {
        this.f42460c.a(n12Var, this.J);
        boolean z5 = Intrinsics.a(this.i.b(), t32.f43173c.a()) || Intrinsics.a(this.i.b(), t32.f43174d.a());
        if (this.C.a() && !z5) {
            loadImages();
        }
        List list = this.f42477u.f40613a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            pi piVarA = n12Var.a((oi) obj);
            if (piVarA != null && piVarA.b()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((oi) it.next()).f41540a);
        }
        this.f42480x.a(arrayList2, eo2.f38215y);
        g();
    }

    public final l52 e() {
        return this.f42461d;
    }

    public final void f() {
        h();
        j83 j83Var = this.B;
        Context context = this.f42458a;
        k83 k83Var = j83Var.f39779d;
        if (k83Var != null) {
            ((z0) k83Var.f40105b).b(context, k83Var);
        }
        j83Var.f39779d = null;
        w12 w12Var = j83Var.f39780e;
        if (w12Var != null) {
            w12Var.b();
        }
        j83Var.f39780e = null;
        n12 n12Var = this.L;
        if (n12Var != null) {
            this.f42460c.a(n12Var);
            this.H.a(n12Var);
            this.A.f41258b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r4 = this;
            yads.n12 r0 = r4.L
            if (r0 == 0) goto L12
            android.view.View r0 = r0.b()
            if (r0 == 0) goto L12
            boolean r0 = r0.isAttachedToWindow()
            r1 = 1
            if (r0 != r1) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L20
            yads.d83 r0 = r4.H
            android.content.Context r1 = r4.f42458a
            yads.o32 r2 = r4.M
            yads.n12 r3 = r4.L
            r0.a(r1, r2, r3)
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.r32.g():void");
    }

    public final void h() {
        this.H.a(this.M);
    }

    public abstract void loadImages();

    public final void a(View view, oi2 oi2Var, b22 b22Var) throws l02 {
        r32 r32Var;
        p12 p12Var = this.f42473q;
        p12Var.getClass();
        synchronized (p12.f41800b) {
            r32Var = (r32) p12Var.f41802a.get(view);
        }
        if (equals(r32Var)) {
            return;
        }
        if (r32Var != null) {
            r32Var.f();
        }
        a(this, this.f42473q);
        this.f42473q.a(view, this);
        a(new n12(b22Var, this.f42465h, this.f42463f, oi2Var, this.f42471o, this.f42464g, this.f42475s, this.O, this.f42468l, this.i, this.f42462e, this.f42459b, this.f42474r, this.f42467k, this.D, yf0.f45038b));
        a(view);
    }

    public final void a(n12 n12Var) throws l02 {
        n12Var.a();
        this.f42481y.a();
        this.f42472p.getClass();
        Map map = n12Var.f41136d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            pi piVar = (pi) entry.getValue();
            if (piVar != null && piVar.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        this.f42480x.a(arrayList, eo2.f38214x);
        List list = this.f42482z.f45136a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((oi) obj).f41545f) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            pi piVarA = n12Var.a((oi) obj2);
            if (piVarA == null || !piVarA.b()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(kotlin.collections.t.j(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((oi) it2.next()).f41540a);
        }
        if (!arrayList4.isEmpty()) {
            xp0 xp0Var = this.f42479w;
            ho2 ho2VarA = xp0Var.f44781b.a();
            ho2VarA.b("no_view_for_asset", DiscardedEvent.JsonKeys.REASON);
            ho2VarA.b(arrayList4, "assets");
            Map map2 = xp0Var.f44780a.f43949u;
            if (map2 != null) {
                ho2VarA.f39286a.putAll(map2);
            }
            c cVar = xp0Var.f44780a.i;
            ho2VarA.f39287b = cVar;
            xp0Var.f44782c.a(new go2(eo2.B.a(), kotlin.collections.j0.m(ho2VarA.f39286a), cVar));
        }
        this.L = n12Var;
        this.A.a(n12Var);
        ((m12) this.f42461d).a(n12Var);
        mp2 mp2VarB = ((m12) this.f42461d).b();
        if (mp2VarB.a()) {
            this.f42460c.a(n12Var);
            b(n12Var);
            return;
        }
        String strB = mp2VarB.b();
        this.f42478v.a(strB);
        String str = String.format("Resource for required view " + strB + " is not present", Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        throw new l02(str);
    }

    public r32(Context context, hz1 hz1Var, m72 m72Var, l52 l52Var, o72 o72Var, nu2 nu2Var, zz1 zz1Var, h32 h32Var, hy1 hy1Var, va vaVar, d4 d4Var, v9 v9Var, f12 f12Var, List list, py2 py2Var, j32 j32Var, i10 i10Var, s53 s53Var, z51 z51Var, i92 i92Var, yc2 yc2Var, mn2 mn2Var, oq oqVar, c61 c61Var, p12 p12Var, co1 co1Var, e9 e9Var, cj cjVar, g42 g42Var, e61 e61Var, ln2 ln2Var, bq bqVar, xp0 xp0Var, jy1 jy1Var, mm2 mm2Var, yp0 yp0Var, nj njVar, f5 f5Var, j83 j83Var, c82 c82Var, t20 t20Var) {
        this.f42458a = context;
        this.f42459b = hz1Var;
        this.f42460c = m72Var;
        this.f42461d = l52Var;
        this.f42462e = o72Var;
        this.f42463f = nu2Var;
        this.f42464g = zz1Var;
        this.f42465h = d4Var;
        this.i = v9Var;
        this.f42466j = f12Var;
        this.f42467k = py2Var;
        this.f42468l = j32Var;
        this.f42469m = i10Var;
        this.f42470n = s53Var;
        this.f42471o = z51Var;
        this.f42472p = oqVar;
        this.f42473q = p12Var;
        this.f42474r = co1Var;
        this.f42475s = cjVar;
        this.f42476t = e61Var;
        this.f42477u = ln2Var;
        this.f42478v = bqVar;
        this.f42479w = xp0Var;
        this.f42480x = jy1Var;
        this.f42481y = mm2Var;
        this.f42482z = yp0Var;
        this.A = njVar;
        this.B = j83Var;
        this.C = c82Var;
        this.D = t20Var;
        wz1 wz1VarA = zz1Var.b().a(context, d4Var, v9Var);
        this.E = wz1VarA;
        String strA = tb.a(this);
        this.F = strA;
        this.M = new o32(this);
        p32 p32Var = new p32(this);
        this.N = f12Var.a();
        this.O = g42Var.a();
        c61Var.getClass();
        b61 b61VarA = c61.a(context, wz1VarA, e61Var, f5Var, z51Var);
        List listE = o72Var.e();
        b61VarA.a(listE, o72Var.c());
        x3 x3Var = new x3(context, nu2Var, v9Var, d4Var, wz1VarA, s53Var);
        this.I = x3Var;
        this.J = new gv(x3Var, mn2Var, z51Var);
        vw1 vw1VarA = i92Var.a(context, d4Var, nu2Var, e61Var, p32Var, strA, vaVar);
        this.G = vw1VarA;
        h32Var.a(z51Var);
        z51Var.a(new g92(vw1VarA));
        d83 d83VarA = zz1Var.d().a(vw1VarA, new kn2(context, e9Var, v9Var, d4Var, nu2Var, vaVar, f5Var, z51Var, mn2Var, o72Var.d()), new n61(l52Var, listE), yc2Var);
        this.H = d83VarA;
        d83VarA.a(z51Var);
        d83VarA.a(v9Var, listE);
        this.K = new vi(list, x3Var, mn2Var, z51Var, hy1Var != null ? hy1Var.a() : null);
    }

    public void a(z00 z00Var) {
        this.E.f44534a.f45206b = z00Var;
    }

    public final void a(k22 k22Var) {
        this.I.f44586g.f37226e = k22Var;
        this.f42476t.f38037h = k22Var;
        f1 f1Var = this.E.f44535b;
        f1Var.f38320g = k22Var;
        f1Var.f38319f.f37953b.f39402k = k22Var;
        this.H.a(new o42(k22Var, this.A));
        this.f42478v.f37122c.f39558e = k22Var;
        this.f42479w.f44781b.f39558e = k22Var;
        this.f42480x.f40014b.f39558e = k22Var;
        this.f42481y.f40966c.f39558e = k22Var;
    }

    public final void a(View view) {
        z0 z0Var;
        j83 j83Var = this.B;
        q32 q32Var = new q32(this);
        j83Var.getClass();
        Context context = view.getContext();
        k83 k83Var = j83Var.f39779d;
        if (k83Var != null) {
            ((z0) k83Var.f40105b).b(context, k83Var);
        }
        Activity activity = null;
        j83Var.f39779d = null;
        w12 w12Var = j83Var.f39780e;
        if (w12Var != null) {
            w12Var.b();
        }
        j83Var.f39780e = null;
        a1 a1Var = j83Var.f39776a;
        Context context2 = view.getContext();
        a1Var.getClass();
        int i = 0;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                break;
            }
            int i10 = i + 1;
            if (i >= 10) {
                break;
            }
            if (context2 instanceof Activity) {
                activity = (Activity) context2;
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
                i = i10;
            }
        }
        if (activity != null) {
            j83Var.f39778c.getClass();
            z0 z0Var2 = z0.f45210g;
            if (z0Var2 == null) {
                synchronized (z0.f45209f) {
                    z0Var = z0.f45210g;
                    if (z0Var == null) {
                        z0Var = new z0();
                        z0.f45210g = z0Var;
                    }
                }
                z0Var2 = z0Var;
            }
            k83 k83Var2 = new k83(activity, q32Var, z0Var2);
            j83Var.f39779d = k83Var2;
            z0Var2.a(activity, k83Var2);
        }
        j83Var.f39777b.getClass();
        w12 w12Var2 = new w12(view, q32Var, new r12());
        j83Var.f39780e = w12Var2;
        w12Var2.a();
    }

    public static void a(r32 r32Var, p12 p12Var) {
        boolean z5;
        p12Var.getClass();
        synchronized (p12.f41800b) {
            Iterator it = p12Var.f41802a.entrySet().iterator();
            z5 = false;
            while (it.hasNext()) {
                if (((r32) ((Map.Entry) it.next()).getValue()) == r32Var) {
                    it.remove();
                    z5 = true;
                }
            }
        }
        if (z5) {
            r32Var.f();
        }
    }
}

package wl;

import com.google.android.gms.internal.ads.kv0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f35333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f35334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f35335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f35336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u f35337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f35338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w f35339h;
    public static final x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y f35340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f35341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f35342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f35343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f35344n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f35345o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f35346p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i f35347q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f35348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f35349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f35350t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final n f35351u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o f35352v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p f35353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f35354x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ a0[] f35355y;

    static {
        m mVar = new m();
        f35333b = mVar;
        r rVar = new r();
        f35334c = rVar;
        s sVar = new s();
        f35335d = sVar;
        t tVar = new t();
        f35336e = tVar;
        u uVar = new u();
        f35337f = uVar;
        v vVar = new v();
        f35338g = vVar;
        w wVar = new w();
        f35339h = wVar;
        x xVar = new x();
        i = xVar;
        y yVar = new y();
        f35340j = yVar;
        c cVar = new c();
        f35341k = cVar;
        d dVar = new d();
        f35342l = dVar;
        e eVar = new e();
        f35343m = eVar;
        f fVar = new f();
        f35344n = fVar;
        g gVar = new g();
        f35345o = gVar;
        h hVar = new h();
        f35346p = hVar;
        i iVar = new i();
        f35347q = iVar;
        j jVar = new j();
        f35348r = jVar;
        k kVar = new k();
        f35349s = kVar;
        l lVar = new l();
        f35350t = lVar;
        n nVar = new n();
        f35351u = nVar;
        o oVar = new o();
        f35352v = oVar;
        p pVar = new p();
        f35353w = pVar;
        f35355y = new a0[]{mVar, rVar, sVar, tVar, uVar, vVar, wVar, xVar, yVar, cVar, dVar, eVar, fVar, gVar, hVar, iVar, jVar, kVar, lVar, nVar, oVar, pVar, new a0() { // from class: wl.q
            @Override // wl.a0
            public final boolean c(kv0 kv0Var, b bVar) {
                return true;
            }
        }};
        f35354x = String.valueOf((char) 0);
    }

    public static boolean a(kv0 kv0Var) {
        if (kv0Var.f7316c == 5) {
            return tl.a.c(((f0) kv0Var).f35444d);
        }
        return false;
    }

    public static void b(k0 k0Var, b bVar) {
        bVar.f35362b.f35463c = c3.f35394f;
        bVar.f35371l = bVar.f35370k;
        bVar.f35370k = i;
        bVar.n(k0Var);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f35355y.clone();
    }

    public abstract boolean c(kv0 kv0Var, b bVar);
}

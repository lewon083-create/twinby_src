package yads;

import com.appsflyer.AdRevenueScheme;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f39392m = {wb.a(i1.class, "activityInteractionEventListener", "getActivityInteractionEventListener()Lcom/monetization/ads/base/tracker/interaction/ActivityInteractionEventListener;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f39393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f39394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final er0 f39395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n9 f39396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ko2 f39397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lr0 f39398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ir0 f39399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f39400h;
    public final nm2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h1 f39401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k22 f39402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f39403l;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ i1(android.content.Context r11, yads.d4 r12, yads.nu2 r13, yads.v9 r14, yads.g1 r15, yads.er0 r16) {
        /*
            r10 = this;
            r4 = r16
            yads.n9 r5 = new yads.n9
            r5.<init>()
            r0 = r13
            yads.lu3 r0 = (yads.lu3) r0
            r0.d()
            yads.su3 r1 = yads.su3.f43085a
            yads.fq3 r0 = r0.b()
            yads.ct1 r6 = yads.cf.a(r11, r0)
            if (r4 == 0) goto L20
            yads.lr0 r0 = new yads.lr0
            r0.<init>(r11, r12, r13, r4)
        L1e:
            r7 = r0
            goto L22
        L20:
            r0 = 0
            goto L1e
        L22:
            yads.ir0 r8 = yads.hr0.a(r11)
            yads.gw2 r13 = yads.fw2.a()
            yads.pt2 r11 = r13.a(r11)
            if (r11 == 0) goto L3d
            boolean r11 = r11.i()
            r13 = 1
            if (r11 != r13) goto L3d
        L37:
            r0 = r10
            r1 = r12
            r9 = r13
            r2 = r14
            r3 = r15
            goto L3f
        L3d:
            r13 = 0
            goto L37
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.i1.<init>(android.content.Context, yads.d4, yads.nu2, yads.v9, yads.g1, yads.er0):void");
    }

    public final go2 a(h1 h1Var, String str) {
        ho2 ho2VarA = this.f39396d.a(this.f39393a.f37617e);
        ho2VarA.b(h1Var.f38975b, "type");
        ho2VarA.b(this.f39393a.f37613a.f37950b, AdRevenueScheme.AD_TYPE);
        ho2VarA.b(this.f39393a.f37615c.f39118a, "ad_unit_id");
        ho2VarA.b(str, "interval");
        k22 k22Var = this.f39402k;
        if (k22Var != null) {
            ho2VarA = io2.a(ho2VarA, k22Var.a());
        }
        eo2 eo2Var = eo2.f38194c;
        Map map = ho2VarA.f39286a;
        v9 v9Var = this.f39394b;
        return new go2("returned_to_app", kotlin.collections.j0.m(map), v9Var != null ? v9Var.i : null);
    }

    public final void b(h1 h1Var) {
        Objects.toString(h1Var);
        this.f39403l = System.currentTimeMillis();
        this.f39401j = h1Var;
        if (h1Var == h1.f38971c && this.f39400h) {
            Map mapB = a(h1Var, null).b();
            v9 v9Var = this.f39394b;
            this.f39399g.a(new fr0(this.f39393a.a(), this.f39403l, h1Var, this.f39395c, mapB, v9Var != null ? v9Var.a() : null));
        }
    }

    public i1(d4 d4Var, v9 v9Var, g1 g1Var, er0 er0Var, n9 n9Var, ko2 ko2Var, lr0 lr0Var, ir0 ir0Var, boolean z5) {
        this.f39393a = d4Var;
        this.f39394b = v9Var;
        this.f39395c = er0Var;
        this.f39396d = n9Var;
        this.f39397e = ko2Var;
        this.f39398f = lr0Var;
        this.f39399g = ir0Var;
        this.f39400h = z5;
        this.i = om2.a(g1Var);
    }

    public final void a(h1 h1Var) {
        Objects.toString(h1Var);
        if (this.f39403l == 0 || this.f39401j != h1Var) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f39403l;
        this.f39397e.a(a(h1Var, td1.a(jCurrentTimeMillis)));
        nm2 nm2Var = this.i;
        dk.i iVar = f39392m[0];
        g1 g1Var = (g1) nm2Var.f41294a.get();
        if (g1Var != null) {
            g1Var.onReturnedToApplication();
        }
        lr0 lr0Var = this.f39398f;
        if (lr0Var != null) {
            lr0Var.a(jCurrentTimeMillis);
            if (this.f39400h) {
                this.f39399g.a(this.f39403l);
            }
        }
        this.f39403l = 0L;
        this.f39401j = null;
    }
}

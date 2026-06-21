package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zw implements xw, sg1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f45561j = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w83 f45562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w83 f45563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f45564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f45568h;
    public String i;

    public zw(ax axVar, bx bxVar, tg1 tg1Var) {
        this.f45562b = axVar;
        this.f45563c = bxVar;
        for (sw swVar : sw.values()) {
            a(tg1Var, swVar);
        }
        ((vg1) tg1Var).a(this);
    }

    public final boolean a() {
        boolean z5;
        synchronized (f45561j) {
            z5 = this.f45566f;
        }
        return z5;
    }

    public final String b() {
        String str;
        synchronized (f45561j) {
            str = this.f45564d;
        }
        return str;
    }

    public final String c() {
        String str;
        synchronized (f45561j) {
            str = this.f45565e;
        }
        return str;
    }

    public final String d() {
        String str;
        synchronized (f45561j) {
            str = this.f45567g;
        }
        return str;
    }

    public final String e() {
        String str;
        synchronized (f45561j) {
            str = this.f45568h;
        }
        return str;
    }

    public final void a(tg1 tg1Var, sw swVar) {
        ix ixVarA = this.f45563c.a(tg1Var, swVar);
        if (ixVarA == null) {
            ixVarA = this.f45562b.a(tg1Var, swVar);
        }
        a(ixVarA);
    }

    public final void a(ix ixVar) {
        if (ixVar instanceof dx) {
            this.f45566f = ((dx) ixVar).f37907a;
            return;
        }
        if (ixVar instanceof ex) {
            this.f45564d = ((ex) ixVar).f38271a;
            return;
        }
        if (ixVar instanceof fx) {
            this.f45565e = ((fx) ixVar).f38568a;
            return;
        }
        if (ixVar instanceof gx) {
            this.f45567g = ((gx) ixVar).f38931a;
        } else if (ixVar instanceof hx) {
            this.f45568h = ((hx) ixVar).f39352a;
        } else if (ixVar instanceof cx) {
            this.i = ((cx) ixVar).f37543a;
        }
    }
}

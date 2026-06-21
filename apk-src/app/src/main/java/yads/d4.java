package yads;

import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f37613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qx f37614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hb f37615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e03 f37616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g9 f37617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x42 f37618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ta3 f37619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f37620h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f37621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public sq1 f37622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f37623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f37624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f37626o;

    public /* synthetic */ d4(e00 e00Var) {
        this(e00Var, new qx(), new hb(), new e03());
    }

    public final e00 a() {
        return this.f37613a;
    }

    public final rd b() {
        return this.f37614b.f42415b;
    }

    public final km0 c() {
        return this.f37614b.f42414a;
    }

    public final void a(String str) {
        hb hbVar = this.f37615c;
        hbVar.getClass();
        if (str == null || StringsKt.D(str)) {
            nc1.c("Ad Unit Id can't be null or empty.", new Object[0]);
            return;
        }
        String str2 = hbVar.f39118a;
        if (str2 == null || str2.equals(str)) {
            hbVar.f39118a = str;
        } else {
            nc1.c("Ad Unit Id can't be set twice.", new Object[0]);
        }
    }

    public d4(e00 e00Var, qx qxVar, hb hbVar, e03 e03Var) {
        this.f37613a = e00Var;
        this.f37614b = qxVar;
        this.f37615c = hbVar;
        this.f37616d = e03Var;
        this.f37624m = true;
        this.f37626o = y11.f44886b;
    }
}

package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e00 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d00 f37941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e00 f37942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e00 f37943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e00 f37944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e00 f37945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e00 f37946h;
    public static final e00 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e00 f37947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ e00[] f37948k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ pj.a f37949l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37950b;

    static {
        e00 e00Var = new e00(0, "BANNER", "banner");
        f37942d = e00Var;
        e00 e00Var2 = new e00(1, "INTERSTITIAL", "interstitial");
        f37943e = e00Var2;
        e00 e00Var3 = new e00(2, "REWARDED", "rewarded");
        f37944f = e00Var3;
        e00 e00Var4 = new e00(3, "NATIVE", "native");
        f37945g = e00Var4;
        e00 e00Var5 = new e00(4, "INSTREAM", "instream");
        f37946h = e00Var5;
        e00 e00Var6 = new e00(5, "APPOPENAD", "appopenad");
        i = e00Var6;
        e00 e00Var7 = new e00(6, "RETAIL_MEDIA", "retail");
        e00 e00Var8 = new e00(7, "FEED", "feed");
        f37947j = e00Var8;
        e00[] e00VarArr = {e00Var, e00Var2, e00Var3, e00Var4, e00Var5, e00Var6, e00Var7, e00Var8};
        f37948k = e00VarArr;
        f37949l = hl.d.k(e00VarArr);
        f37941c = new d00();
    }

    public e00(int i10, String str, String str2) {
        this.f37950b = str2;
    }

    public static e00 valueOf(String str) {
        return (e00) Enum.valueOf(e00.class, str);
    }

    public static e00[] values() {
        return (e00[]) f37948k.clone();
    }
}

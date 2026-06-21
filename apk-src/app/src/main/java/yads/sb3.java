package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sb3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sb3 f42884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sb3 f42885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final sb3 f42886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final sb3 f42887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final sb3 f42888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final sb3 f42889h;
    public static final sb3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ sb3[] f42890j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42891b;

    static {
        sb3 sb3Var = new sb3(0, "NO_AD_VIEW", "no_ad_view");
        f42884c = sb3Var;
        sb3 sb3Var2 = new sb3(1, "NO_VISIBLE_ADS", "no_visible_ads");
        f42885d = sb3Var2;
        sb3 sb3Var3 = new sb3(2, "NOT_VISIBLE_FOR_PERCENT", "not_visible_for_percent");
        f42886e = sb3Var3;
        sb3 sb3Var4 = new sb3(3, "REQUIRED_ASSET_CAN_NOT_BE_VISIBLE", "required_asset_can_not_be_visible");
        f42887f = sb3Var4;
        sb3 sb3Var5 = new sb3(4, "SUPERVIEW_NULL", "superview_null");
        f42888g = sb3Var5;
        sb3 sb3Var6 = new sb3(5, "SUPERVIEW_HIDDEN", "superview_hidden");
        f42889h = sb3Var6;
        sb3 sb3Var7 = new sb3(6, "VISIBLE_AREA_TOO_SMALL", "visible_area_too_small");
        i = sb3Var7;
        sb3[] sb3VarArr = {sb3Var, sb3Var2, sb3Var3, sb3Var4, sb3Var5, sb3Var6, sb3Var7};
        f42890j = sb3VarArr;
        hl.d.k(sb3VarArr);
    }

    public sb3(int i10, String str, String str2) {
        this.f42891b = str2;
    }

    public static sb3 valueOf(String str) {
        return (sb3) Enum.valueOf(sb3.class, str);
    }

    public static sb3[] values() {
        return (sb3[]) f42890j.clone();
    }
}

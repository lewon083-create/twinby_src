package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vb3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vb3 f43988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vb3 f43989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vb3 f43990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ vb3[] f43991f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43992b;

    static {
        vb3 vb3Var = new vb3(0, "INCONSISTENT_ASSET_VALUE", "inconsistent_asset_value");
        f43988c = vb3Var;
        vb3 vb3Var2 = new vb3(1, "NO_VISIBLE_SPONSORED_ASSET", "no_visible_sponsored_asset");
        f43989d = vb3Var2;
        vb3 vb3Var3 = new vb3(2, "NO_VISIBLE_REQUIRED_ASSETS", "no_visible_required_assets");
        f43990e = vb3Var3;
        vb3[] vb3VarArr = {vb3Var, vb3Var2, vb3Var3};
        f43991f = vb3VarArr;
        hl.d.k(vb3VarArr);
    }

    public vb3(int i, String str, String str2) {
        this.f43992b = str2;
    }

    public static vb3 valueOf(String str) {
        return (vb3) Enum.valueOf(vb3.class, str);
    }

    public static vb3[] values() {
        return (vb3[]) f43991f.clone();
    }
}

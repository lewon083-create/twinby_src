package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c50 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c50 f37291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c50 f37292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c50 f37293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c50[] f37294f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37295b;

    static {
        c50 c50Var = new c50(0, "BIDDING", "Bidding");
        f37291c = c50Var;
        c50 c50Var2 = new c50(1, "WATERFALL", "Waterfall");
        f37292d = c50Var2;
        c50 c50Var3 = new c50(2, "NONE", "None");
        f37293e = c50Var3;
        c50[] c50VarArr = {c50Var, c50Var2, c50Var3};
        f37294f = c50VarArr;
        hl.d.k(c50VarArr);
    }

    public c50(int i, String str, String str2) {
        this.f37295b = str2;
    }

    public static c50 valueOf(String str) {
        return (c50) Enum.valueOf(c50.class, str);
    }

    public static c50[] values() {
        return (c50[]) f37294f.clone();
    }

    public final String a() {
        return this.f37295b;
    }
}

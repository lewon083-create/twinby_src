package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s61 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s61 f42816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s61 f42817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s61 f42818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s61 f42819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ s61[] f42820g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42821b;

    static {
        s61 s61Var = new s61(0, "INITIALIZATION", "initialization");
        f42816c = s61Var;
        s61 s61Var2 = new s61(1, "AD", "ad");
        f42817d = s61Var2;
        s61 s61Var3 = new s61(2, "INSTREAM", "instream");
        f42818e = s61Var3;
        s61 s61Var4 = new s61(3, "BIDDER_TOKEN", "bidder_token");
        f42819f = s61Var4;
        s61[] s61VarArr = {s61Var, s61Var2, s61Var3, s61Var4};
        f42820g = s61VarArr;
        hl.d.k(s61VarArr);
    }

    public s61(int i, String str, String str2) {
        this.f42821b = str2;
    }

    public static s61 valueOf(String str) {
        return (s61) Enum.valueOf(s61.class, str);
    }

    public static s61[] values() {
        return (s61[]) f42820g.clone();
    }
}

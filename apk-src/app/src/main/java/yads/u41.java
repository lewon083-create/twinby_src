package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u41 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u41 f43553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u41 f43554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u41 f43555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u41 f43556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u41[] f43557f;

    static {
        u41 u41Var = new u41(0, "PNG");
        f43553b = u41Var;
        u41 u41Var2 = new u41(1, "JPEG");
        f43554c = u41Var2;
        u41 u41Var3 = new u41(2, "GIF");
        f43555d = u41Var3;
        u41 u41Var4 = new u41(3, "UNKNOWN");
        f43556e = u41Var4;
        u41[] u41VarArr = {u41Var, u41Var2, u41Var3, u41Var4};
        f43557f = u41VarArr;
        hl.d.k(u41VarArr);
    }

    public u41(int i, String str) {
    }

    public static u41 valueOf(String str) {
        return (u41) Enum.valueOf(u41.class, str);
    }

    public static u41[] values() {
        return (u41[]) f43557f.clone();
    }
}

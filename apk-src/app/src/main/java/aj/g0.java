package aj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wd.d f960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g0 f962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g0 f963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g0[] f964g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f965b;

    static {
        g0 g0Var = new g0("PLATFORM_ENCODED", 0, 0);
        f961d = g0Var;
        g0 g0Var2 = new g0("JSON_ENCODED", 1, 1);
        f962e = g0Var2;
        g0 g0Var3 = new g0("UNEXPECTED_STRING", 2, 2);
        f963f = g0Var3;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3};
        f964g = g0VarArr;
        hl.d.k(g0VarArr);
        f960c = new wd.d();
    }

    public g0(String str, int i, int i10) {
        this.f965b = i10;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f964g.clone();
    }
}

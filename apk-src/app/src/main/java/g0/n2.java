package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n2 f19692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n2 f19693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n2[] f19694d;

    static {
        n2 n2Var = new n2("FEATURE_COMBINATION_TABLE", 0);
        f19692b = n2Var;
        n2 n2Var2 = new n2("CAPTURE_SESSION_TABLES", 1);
        f19693c = n2Var2;
        n2[] n2VarArr = {n2Var, n2Var2};
        f19694d = n2VarArr;
        hl.d.k(n2VarArr);
    }

    public static n2 valueOf(String str) {
        return (n2) Enum.valueOf(n2.class, str);
    }

    public static n2[] values() {
        return (n2[]) f19694d.clone();
    }
}

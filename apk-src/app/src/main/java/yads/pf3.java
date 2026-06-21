package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pf3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pf3 f41920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pf3 f41921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pf3 f41922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final pf3 f41923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pf3[] f41924f;

    static {
        pf3 pf3Var = new pf3(0, "PREROLL");
        f41920b = pf3Var;
        pf3 pf3Var2 = new pf3(1, "MIDROLL");
        f41921c = pf3Var2;
        pf3 pf3Var3 = new pf3(2, "POSTROLL");
        f41922d = pf3Var3;
        pf3 pf3Var4 = new pf3(3, "STANDALONE");
        f41923e = pf3Var4;
        pf3[] pf3VarArr = {pf3Var, pf3Var2, pf3Var3, pf3Var4};
        f41924f = pf3VarArr;
        hl.d.k(pf3VarArr);
    }

    public pf3(int i, String str) {
    }

    public static pf3 valueOf(String str) {
        return (pf3) Enum.valueOf(pf3.class, str);
    }

    public static pf3[] values() {
        return (pf3[]) f41924f.clone();
    }
}

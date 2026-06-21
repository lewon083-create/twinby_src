package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v80 f43925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v80 f43926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v80 f43927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v80[] f43928e;

    static {
        v80 v80Var = new v80(0, "SUCCESS");
        f43925b = v80Var;
        v80 v80Var2 = new v80(1, "WARNING");
        f43926c = v80Var2;
        v80 v80Var3 = new v80(2, "ERROR");
        f43927d = v80Var3;
        v80[] v80VarArr = {v80Var, v80Var2, v80Var3};
        f43928e = v80VarArr;
        hl.d.k(v80VarArr);
    }

    public v80(int i, String str) {
    }

    public static v80 valueOf(String str) {
        return (v80) Enum.valueOf(v80.class, str);
    }

    public static v80[] values() {
        return (v80[]) f43928e.clone();
    }
}

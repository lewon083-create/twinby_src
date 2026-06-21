package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ac2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ac2 f36683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ac2 f36684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ac2 f36685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ac2[] f36686e;

    static {
        ac2 ac2Var = new ac2(0, "INVALIDATED");
        f36683b = ac2Var;
        ac2 ac2Var2 = new ac2(1, "ACTIVE");
        f36684c = ac2Var2;
        ac2 ac2Var3 = new ac2(2, "PAUSED");
        f36685d = ac2Var3;
        ac2[] ac2VarArr = {ac2Var, ac2Var2, ac2Var3};
        f36686e = ac2VarArr;
        hl.d.k(ac2VarArr);
    }

    public ac2(int i, String str) {
    }

    public static ac2 valueOf(String str) {
        return (ac2) Enum.valueOf(ac2.class, str);
    }

    public static ac2[] values() {
        return (ac2[]) f36686e.clone();
    }
}

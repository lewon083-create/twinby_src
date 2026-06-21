package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z5 f45250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z5 f45251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z5 f45252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z5 f45253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z5 f45254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z5[] f45255g;

    static {
        z5 z5Var = new z5(0, "CANCELLED");
        f45250b = z5Var;
        z5 z5Var2 = new z5(1, "NOT_STARTED");
        f45251c = z5Var2;
        z5 z5Var3 = new z5(2, "LOADING");
        f45252d = z5Var3;
        z5 z5Var4 = new z5(3, "SUCCESSFULLY_LOADED");
        f45253e = z5Var4;
        z5 z5Var5 = new z5(4, "ERRONEOUSLY_LOADED");
        f45254f = z5Var5;
        z5[] z5VarArr = {z5Var, z5Var2, z5Var3, z5Var4, z5Var5};
        f45255g = z5VarArr;
        hl.d.k(z5VarArr);
    }

    public z5(int i, String str) {
    }

    public static z5 valueOf(String str) {
        return (z5) Enum.valueOf(z5.class, str);
    }

    public static z5[] values() {
        return (z5[]) f45255g.clone();
    }
}

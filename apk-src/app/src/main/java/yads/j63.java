package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j63 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j63 f39735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j63 f39736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j63 f39737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j63 f39738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j63 f39739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ j63[] f39740g;

    static {
        j63 j63Var = new j63(0, "TIME");
        f39735b = j63Var;
        j63 j63Var2 = new j63(1, "PERCENTAGE");
        f39736c = j63Var2;
        j63 j63Var3 = new j63(2, "START");
        f39737d = j63Var3;
        j63 j63Var4 = new j63(3, "END");
        f39738e = j63Var4;
        j63 j63Var5 = new j63(4, "POSITION");
        f39739f = j63Var5;
        j63[] j63VarArr = {j63Var, j63Var2, j63Var3, j63Var4, j63Var5};
        f39740g = j63VarArr;
        hl.d.k(j63VarArr);
    }

    public j63(int i, String str) {
    }

    public static j63 valueOf(String str) {
        return (j63) Enum.valueOf(j63.class, str);
    }

    public static j63[] values() {
        return (j63[]) f39740g.clone();
    }
}

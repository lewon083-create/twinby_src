package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n10 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n10 f41130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n10 f41131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n10[] f41132d;

    static {
        n10 n10Var = new n10(0, "TEXT");
        f41130b = n10Var;
        n10 n10Var2 = new n10(1, "IMAGE");
        f41131c = n10Var2;
        n10[] n10VarArr = {n10Var, n10Var2};
        f41132d = n10VarArr;
        hl.d.k(n10VarArr);
    }

    public n10(int i, String str) {
    }

    public static n10 valueOf(String str) {
        return (n10) Enum.valueOf(n10.class, str);
    }

    public static n10[] values() {
        return (n10[]) f41132d.clone();
    }
}

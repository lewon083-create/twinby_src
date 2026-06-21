package ni;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final le.a f29422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k1 f29423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k1 f29424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k1 f29425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k1 f29426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k1 f29427h;
    public static final k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ k1[] f29428j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29429b;

    static {
        k1 k1Var = new k1("CLOSEST_HIGHER", 0, 0);
        f29423d = k1Var;
        k1 k1Var2 = new k1("CLOSEST_HIGHER_THEN_LOWER", 1, 1);
        f29424e = k1Var2;
        k1 k1Var3 = new k1("CLOSEST_LOWER", 2, 2);
        f29425f = k1Var3;
        k1 k1Var4 = new k1("CLOSEST_LOWER_THEN_HIGHER", 3, 3);
        f29426g = k1Var4;
        k1 k1Var5 = new k1("NONE", 4, 4);
        f29427h = k1Var5;
        k1 k1Var6 = new k1("UNKNOWN", 5, 5);
        i = k1Var6;
        k1[] k1VarArr = {k1Var, k1Var2, k1Var3, k1Var4, k1Var5, k1Var6};
        f29428j = k1VarArr;
        hl.d.k(k1VarArr);
        f29422c = new le.a(9);
    }

    public k1(String str, int i10, int i11) {
        this.f29429b = i11;
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) f29428j.clone();
    }
}

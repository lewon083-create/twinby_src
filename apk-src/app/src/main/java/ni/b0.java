package ni;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l7.i f29350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f29351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f29352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f29353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0 f29354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b0[] f29355h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29356b;

    static {
        b0 b0Var = new b0("FRONT", 0, 0);
        f29351d = b0Var;
        b0 b0Var2 = new b0("BACK", 1, 1);
        f29352e = b0Var2;
        b0 b0Var3 = new b0("EXTERNAL", 2, 2);
        f29353f = b0Var3;
        b0 b0Var4 = new b0("UNKNOWN", 3, 3);
        f29354g = b0Var4;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4};
        f29355h = b0VarArr;
        hl.d.k(b0VarArr);
        f29350c = new l7.i(8);
    }

    public b0(String str, int i, int i10) {
        this.f29356b = i10;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f29355h.clone();
    }
}

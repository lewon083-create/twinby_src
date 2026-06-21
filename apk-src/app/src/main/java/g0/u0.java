package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f19772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u0 f19773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u0 f19774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u0 f19775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u0[] f19776f;

    static {
        u0 u0Var = new u0("ALWAYS_OVERRIDE", 0);
        f19772b = u0Var;
        u0 u0Var2 = new u0("HIGH_PRIORITY_REQUIRED", 1);
        f19773c = u0Var2;
        u0 u0Var3 = new u0("REQUIRED", 2);
        f19774d = u0Var3;
        u0 u0Var4 = new u0("OPTIONAL", 3);
        f19775e = u0Var4;
        f19776f = new u0[]{u0Var, u0Var2, u0Var3, u0Var4};
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) f19776f.clone();
    }
}

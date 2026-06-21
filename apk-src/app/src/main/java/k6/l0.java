package k6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f27115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l0[] f27116c;

    static {
        l0 l0Var = new l0("ALLOW", 0);
        f27115b = l0Var;
        f27116c = new l0[]{l0Var, new l0("PREVENT_WHEN_EMPTY", 1), new l0("PREVENT", 2)};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f27116c.clone();
    }
}

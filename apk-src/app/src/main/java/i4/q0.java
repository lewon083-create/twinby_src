package i4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f20987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f20988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q0 f20989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ q0[] f20990e;

    static {
        q0 q0Var = new q0("PASS_THROUGH", 0);
        f20987b = q0Var;
        q0 q0Var2 = new q0("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f20988c = q0Var2;
        q0 q0Var3 = new q0("DISCARDING", 2);
        f20989d = q0Var3;
        f20990e = new q0[]{q0Var, q0Var2, q0Var3};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f20990e.clone();
    }
}

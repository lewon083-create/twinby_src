package z2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f45949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f45950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r0 f45951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r0[] f45952e;

    static {
        r0 r0Var = new r0("NONE", 0);
        f45949b = r0Var;
        r0 r0Var2 = new r0("ADDING", 1);
        f45950c = r0Var2;
        r0 r0Var3 = new r0("REMOVING", 2);
        f45951d = r0Var3;
        f45952e = new r0[]{r0Var, r0Var2, r0Var3};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f45952e.clone();
    }
}

package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dn0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dn0 f37842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dn0 f37843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ dn0[] f37844d;

    static {
        dn0 dn0Var = new dn0(0, "FRAME");
        f37842b = dn0Var;
        dn0 dn0Var2 = new dn0(1, "TRACE");
        f37843c = dn0Var2;
        dn0[] dn0VarArr = {dn0Var, dn0Var2};
        f37844d = dn0VarArr;
        hl.d.k(dn0VarArr);
    }

    public dn0(int i, String str) {
    }

    public static dn0 valueOf(String str) {
        return (dn0) Enum.valueOf(dn0.class, str);
    }

    public static dn0[] values() {
        return (dn0[]) f37844d.clone();
    }
}

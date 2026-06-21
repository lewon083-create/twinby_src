package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c03 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c03 f37242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c03 f37243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c03 f37244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c03[] f37245f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37246b;

    static {
        c03 c03Var = new c03(0, "FIXED", "fixed");
        f37242c = c03Var;
        c03 c03Var2 = new c03(1, "FLEXIBLE", "flexible");
        f37243d = c03Var2;
        c03 c03Var3 = new c03(2, "SCREEN", "screen");
        c03 c03Var4 = new c03(3, "STICKY", "sticky");
        f37244e = c03Var4;
        c03[] c03VarArr = {c03Var, c03Var2, c03Var3, c03Var4};
        f37245f = c03VarArr;
        hl.d.k(c03VarArr);
    }

    public c03(int i, String str, String str2) {
        this.f37246b = str2;
    }

    public static c03 valueOf(String str) {
        return (c03) Enum.valueOf(c03.class, str);
    }

    public static c03[] values() {
        return (c03[]) f37245f.clone();
    }
}

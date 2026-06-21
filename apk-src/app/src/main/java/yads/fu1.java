package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fu1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fu1 f38549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fu1 f38550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fu1 f38551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ fu1[] f38552e;

    static {
        fu1 fu1Var = new fu1(0, "VERBOSE");
        fu1 fu1Var2 = new fu1(1, "DEBUG");
        fu1 fu1Var3 = new fu1(2, "INFO");
        f38549b = fu1Var3;
        fu1 fu1Var4 = new fu1(3, "WARNING");
        f38550c = fu1Var4;
        fu1 fu1Var5 = new fu1(4, "ERROR");
        f38551d = fu1Var5;
        fu1[] fu1VarArr = {fu1Var, fu1Var2, fu1Var3, fu1Var4, fu1Var5};
        f38552e = fu1VarArr;
        hl.d.k(fu1VarArr);
    }

    public fu1(int i, String str) {
    }

    public static fu1 valueOf(String str) {
        return (fu1) Enum.valueOf(fu1.class, str);
    }

    public static fu1[] values() {
        return (fu1[]) f38552e.clone();
    }
}

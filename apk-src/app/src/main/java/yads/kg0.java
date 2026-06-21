package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kg0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kg0 f40188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kg0 f40189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kg0 f40190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kg0[] f40191e;

    static {
        kg0 kg0Var = new kg0(0, "PHONE");
        f40188b = kg0Var;
        kg0 kg0Var2 = new kg0(1, "TABLET");
        f40189c = kg0Var2;
        kg0 kg0Var3 = new kg0(2, "TV");
        f40190d = kg0Var3;
        kg0[] kg0VarArr = {kg0Var, kg0Var2, kg0Var3};
        f40191e = kg0VarArr;
        hl.d.k(kg0VarArr);
    }

    public kg0(int i, String str) {
    }

    public static kg0 valueOf(String str) {
        return (kg0) Enum.valueOf(kg0.class, str);
    }

    public static kg0[] values() {
        return (kg0[]) f40191e.clone();
    }
}

package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tc2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tc2 f43269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc2 f43270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tc2 f43271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ tc2[] f43272e;

    static {
        tc2 tc2Var = new tc2(0, "SCREEN_ON");
        f43269b = tc2Var;
        tc2 tc2Var2 = new tc2(1, "SCREEN_OFF");
        f43270c = tc2Var2;
        tc2 tc2Var3 = new tc2(2, "USER_PRESENT");
        f43271d = tc2Var3;
        tc2[] tc2VarArr = {tc2Var, tc2Var2, tc2Var3};
        f43272e = tc2VarArr;
        hl.d.k(tc2VarArr);
    }

    public tc2(int i, String str) {
    }

    public static tc2 valueOf(String str) {
        return (tc2) Enum.valueOf(tc2.class, str);
    }

    public static tc2[] values() {
        return (tc2[]) f43272e.clone();
    }
}

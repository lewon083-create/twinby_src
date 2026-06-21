package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ty2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ty2 f43489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ty2 f43490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ty2 f43491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ty2[] f43492e;

    static {
        ty2 ty2Var = new ty2(0, "AD");
        f43489b = ty2Var;
        ty2 ty2Var2 = new ty2(1, "DSP");
        f43490c = ty2Var2;
        ty2 ty2Var3 = new ty2(2, "UNDEFINED");
        f43491d = ty2Var3;
        ty2[] ty2VarArr = {ty2Var, ty2Var2, ty2Var3};
        f43492e = ty2VarArr;
        hl.d.k(ty2VarArr);
    }

    public ty2(int i, String str) {
    }

    public static ty2 valueOf(String str) {
        return (ty2) Enum.valueOf(ty2.class, str);
    }

    public static ty2[] values() {
        return (ty2[]) f43492e.clone();
    }
}

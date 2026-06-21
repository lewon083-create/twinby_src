package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yh0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yh0 f45056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yh0 f45057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ yh0[] f45058d;

    static {
        yh0 yh0Var = new yh0(0, "BLOCK");
        f45056b = yh0Var;
        yh0 yh0Var2 = new yh0(1, "BLOCK_INNER_AD");
        f45057c = yh0Var2;
        yh0[] yh0VarArr = {yh0Var, yh0Var2};
        f45058d = yh0VarArr;
        hl.d.k(yh0VarArr);
    }

    public yh0(int i, String str) {
    }

    public static yh0 valueOf(String str) {
        return (yh0) Enum.valueOf(yh0.class, str);
    }

    public static yh0[] values() {
        return (yh0[]) f45058d.clone();
    }
}

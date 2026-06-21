package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yw1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yw1 f45175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yw1 f45176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ yw1[] f45177d;

    static {
        yw1 yw1Var = new yw1(0, "LEFT");
        f45175b = yw1Var;
        yw1 yw1Var2 = new yw1(1, "RIGHT");
        f45176c = yw1Var2;
        yw1[] yw1VarArr = {yw1Var, yw1Var2};
        f45177d = yw1VarArr;
        hl.d.k(yw1VarArr);
    }

    public yw1(int i, String str) {
    }

    public static yw1 valueOf(String str) {
        return (yw1) Enum.valueOf(yw1.class, str);
    }

    public static yw1[] values() {
        return (yw1[]) f45177d.clone();
    }
}

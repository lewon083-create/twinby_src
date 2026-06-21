package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ta3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ta3 f43253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ta3 f43254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ta3[] f43255d;

    static {
        ta3 ta3Var = new ta3(0, "AD");
        f43253b = ta3Var;
        ta3 ta3Var2 = new ta3(1, "PASSBACK");
        f43254c = ta3Var2;
        ta3[] ta3VarArr = {ta3Var, ta3Var2};
        f43255d = ta3VarArr;
        hl.d.k(ta3VarArr);
    }

    public ta3(int i, String str) {
    }

    public static ta3 valueOf(String str) {
        return (ta3) Enum.valueOf(ta3.class, str);
    }

    public static ta3[] values() {
        return (ta3[]) f43255d.clone();
    }
}

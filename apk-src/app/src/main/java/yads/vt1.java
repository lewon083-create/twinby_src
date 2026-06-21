package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vt1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vt1 f44119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vt1 f44120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vt1 f44121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ vt1[] f44122e;

    static {
        vt1 vt1Var = new vt1(0, "INITIALIZATION_NOT_STARTED");
        f44119b = vt1Var;
        vt1 vt1Var2 = new vt1(1, "INITIALIZING");
        f44120c = vt1Var2;
        vt1 vt1Var3 = new vt1(2, "INITIALIZED");
        f44121d = vt1Var3;
        vt1[] vt1VarArr = {vt1Var, vt1Var2, vt1Var3};
        f44122e = vt1VarArr;
        hl.d.k(vt1VarArr);
    }

    public vt1(int i, String str) {
    }

    public static vt1 valueOf(String str) {
        return (vt1) Enum.valueOf(vt1.class, str);
    }

    public static vt1[] values() {
        return (vt1[]) f44122e.clone();
    }
}

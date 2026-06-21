package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ak3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ak3 f36760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ak3 f36761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ak3 f36762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ak3[] f36763e;

    static {
        ak3 ak3Var = new ak3(0, "FIRST_QUARTILE");
        f36760b = ak3Var;
        ak3 ak3Var2 = new ak3(1, "MIDPOINT");
        f36761c = ak3Var2;
        ak3 ak3Var3 = new ak3(2, "THIRD_QUARTILE");
        f36762d = ak3Var3;
        ak3[] ak3VarArr = {ak3Var, ak3Var2, ak3Var3};
        f36763e = ak3VarArr;
        hl.d.k(ak3VarArr);
    }

    public ak3(int i, String str) {
    }

    public static ak3 valueOf(String str) {
        return (ak3) Enum.valueOf(ak3.class, str);
    }

    public static ak3[] values() {
        return (ak3[]) f36763e.clone();
    }
}

package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nj3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nj3 f41271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ nj3[] f41272c;

    static {
        nj3 nj3Var = new nj3(0, "FIT_XY");
        nj3 nj3Var2 = new nj3(1, "FIT_CENTER");
        f41271b = nj3Var2;
        nj3[] nj3VarArr = {nj3Var, nj3Var2, new nj3(2, "CENTER_CROP")};
        f41272c = nj3VarArr;
        hl.d.k(nj3VarArr);
    }

    public nj3(int i, String str) {
    }

    public static nj3 valueOf(String str) {
        return (nj3) Enum.valueOf(nj3.class, str);
    }

    public static nj3[] values() {
        return (nj3[]) f41272c.clone();
    }
}

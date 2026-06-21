package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nj1 f41267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nj1 f41268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final nj1 f41269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ nj1[] f41270e;

    static {
        nj1 nj1Var = new nj1(0, "EXACTLY");
        f41267b = nj1Var;
        nj1 nj1Var2 = new nj1(1, "AT_MOST");
        f41268c = nj1Var2;
        nj1 nj1Var3 = new nj1(2, "UNSPECIFIED");
        f41269d = nj1Var3;
        nj1[] nj1VarArr = {nj1Var, nj1Var2, nj1Var3};
        f41270e = nj1VarArr;
        hl.d.k(nj1VarArr);
    }

    public nj1(int i, String str) {
    }

    public static nj1 valueOf(String str) {
        return (nj1) Enum.valueOf(nj1.class, str);
    }

    public static nj1[] values() {
        return (nj1[]) f41270e.clone();
    }
}

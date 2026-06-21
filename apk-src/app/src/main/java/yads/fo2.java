package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fo2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fo2 f38518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fo2 f38519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fo2 f38520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ fo2[] f38521f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38522b;

    static {
        fo2 fo2Var = new fo2(0, "SUCCESS", "success");
        f38518c = fo2Var;
        fo2 fo2Var2 = new fo2(1, "ERROR", "error");
        f38519d = fo2Var2;
        fo2 fo2Var3 = new fo2(2, "NO_ADS", "no_ads");
        f38520e = fo2Var3;
        fo2[] fo2VarArr = {fo2Var, fo2Var2, fo2Var3, new fo2(3, "FILTERED", "filtered")};
        f38521f = fo2VarArr;
        hl.d.k(fo2VarArr);
    }

    public fo2(int i, String str, String str2) {
        this.f38522b = str2;
    }

    public static fo2 valueOf(String str) {
        return (fo2) Enum.valueOf(fo2.class, str);
    }

    public static fo2[] values() {
        return (fo2[]) f38521f.clone();
    }
}

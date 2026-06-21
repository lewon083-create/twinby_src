package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t32 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t32 f43173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t32 f43174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t32[] f43175e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43176b;

    static {
        t32 t32Var = new t32(0, "LoadingOnShow", "loading_on_show");
        f43173c = t32Var;
        t32 t32Var2 = new t32(1, "LoadingOnBack", "loading_on_back");
        f43174d = t32Var2;
        t32[] t32VarArr = {t32Var, t32Var2};
        f43175e = t32VarArr;
        hl.d.k(t32VarArr);
    }

    public t32(int i, String str, String str2) {
        this.f43176b = str2;
    }

    public static t32 valueOf(String str) {
        return (t32) Enum.valueOf(t32.class, str);
    }

    public static t32[] values() {
        return (t32[]) f43175e.clone();
    }

    public final String a() {
        return this.f43176b;
    }
}

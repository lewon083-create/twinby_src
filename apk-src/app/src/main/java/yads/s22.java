package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s22 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s22 f42792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s22 f42793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ s22[] f42794e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42795b;

    static {
        s22 s22Var = new s22(0, "CUSTOM", "custom");
        f42792c = s22Var;
        s22 s22Var2 = new s22(1, "TEMPLATE", "template");
        f42793d = s22Var2;
        s22[] s22VarArr = {s22Var, s22Var2};
        f42794e = s22VarArr;
        hl.d.k(s22VarArr);
    }

    public s22(int i, String str, String str2) {
        this.f42795b = str2;
    }

    public static s22 valueOf(String str) {
        return (s22) Enum.valueOf(s22.class, str);
    }

    public static s22[] values() {
        return (s22[]) f42794e.clone();
    }
}

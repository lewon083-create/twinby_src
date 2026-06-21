package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f31 f38360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f31[] f38361c;

    static {
        f31 f31Var = new f31(0, "PROD");
        f38360b = f31Var;
        f31[] f31VarArr = {f31Var, new f31(1, "PREDEFINED")};
        f38361c = f31VarArr;
        hl.d.k(f31VarArr);
    }

    public f31(int i, String str) {
    }

    public static f31 valueOf(String str) {
        return (f31) Enum.valueOf(f31.class, str);
    }

    public static f31[] values() {
        return (f31[]) f38361c.clone();
    }
}

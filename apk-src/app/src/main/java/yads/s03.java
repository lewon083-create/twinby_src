package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s03 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s03 f42777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s03[] f42778d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42779b;

    static {
        s03 s03Var = new s03(0, "NEXT", "next");
        s03 s03Var2 = new s03(1, "LAST", "last");
        f42777c = s03Var2;
        s03[] s03VarArr = {s03Var, s03Var2};
        f42778d = s03VarArr;
        hl.d.k(s03VarArr);
    }

    public s03(int i, String str, String str2) {
        this.f42779b = str2;
    }

    public static s03 valueOf(String str) {
        return (s03) Enum.valueOf(s03.class, str);
    }

    public static s03[] values() {
        return (s03[]) f42778d.clone();
    }
}

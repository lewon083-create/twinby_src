package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jj3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jj3 f39879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jj3 f39880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ jj3[] f39881d;

    static {
        jj3 jj3Var = new jj3(0, "LEFT_TOP");
        f39879b = jj3Var;
        jj3 jj3Var2 = new jj3(1, "CENTER");
        f39880c = jj3Var2;
        jj3[] jj3VarArr = {jj3Var, jj3Var2};
        f39881d = jj3VarArr;
        hl.d.k(jj3VarArr);
    }

    public jj3(int i, String str) {
    }

    public static jj3 valueOf(String str) {
        return (jj3) Enum.valueOf(jj3.class, str);
    }

    public static jj3[] values() {
        return (jj3[]) f39881d.clone();
    }
}

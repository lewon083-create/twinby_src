package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tr1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tr1 f43425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tr1 f43426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ tr1[] f43427d;

    static {
        tr1 tr1Var = new tr1(0, "INFO");
        f43425b = tr1Var;
        tr1 tr1Var2 = new tr1(1, "ERROR");
        f43426c = tr1Var2;
        tr1[] tr1VarArr = {tr1Var, tr1Var2};
        f43427d = tr1VarArr;
        hl.d.k(tr1VarArr);
    }

    public tr1(int i, String str) {
    }

    public static tr1 valueOf(String str) {
        return (tr1) Enum.valueOf(tr1.class, str);
    }

    public static tr1[] values() {
        return (tr1[]) f43427d.clone();
    }
}

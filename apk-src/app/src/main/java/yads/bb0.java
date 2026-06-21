package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ab0 f36980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bb0 f36981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bb0 f36982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ bb0[] f36983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pj.a f36984f;

    static {
        bb0 bb0Var = new bb0(0, "DEFAULT");
        f36981c = bb0Var;
        bb0 bb0Var2 = new bb0(1, "RESULT");
        f36982d = bb0Var2;
        bb0[] bb0VarArr = {bb0Var, bb0Var2};
        f36983e = bb0VarArr;
        f36984f = hl.d.k(bb0VarArr);
        f36980b = new ab0();
    }

    public bb0(int i, String str) {
    }

    public static bb0 valueOf(String str) {
        return (bb0) Enum.valueOf(bb0.class, str);
    }

    public static bb0[] values() {
        return (bb0[]) f36983e.clone();
    }
}

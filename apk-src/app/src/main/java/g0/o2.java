package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o2 f19705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o2 f19706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o2 f19707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o2 f19708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o2 f19709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ o2[] f19710g;

    static {
        o2 o2Var = new o2("PRIV", 0);
        f19705b = o2Var;
        o2 o2Var2 = new o2("YUV", 1);
        f19706c = o2Var2;
        o2 o2Var3 = new o2("JPEG", 2);
        f19707d = o2Var3;
        o2 o2Var4 = new o2("JPEG_R", 3);
        f19708e = o2Var4;
        o2 o2Var5 = new o2("RAW", 4);
        f19709f = o2Var5;
        o2[] o2VarArr = {o2Var, o2Var2, o2Var3, o2Var4, o2Var5};
        f19710g = o2VarArr;
        hl.d.k(o2VarArr);
    }

    public static o2 valueOf(String str) {
        return (o2) Enum.valueOf(o2.class, str);
    }

    public static o2[] values() {
        return (o2[]) f19710g.clone();
    }
}

package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k2 f19634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k2 f19635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k2 f19636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k2 f19637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k2 f19638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ k2[] f19639h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19640b;

    static {
        k2 k2Var = new k2("DEFAULT", 0, 0);
        f19634c = k2Var;
        k2 k2Var2 = new k2("PREVIEW", 1, 1);
        f19635d = k2Var2;
        k2 k2Var3 = new k2("VIDEO_RECORD", 2, 3);
        f19636e = k2Var3;
        k2 k2Var4 = new k2("STILL_CAPTURE", 3, 2);
        f19637f = k2Var4;
        k2 k2Var5 = new k2("VIDEO_CALL", 4, 5);
        k2 k2Var6 = new k2("PREVIEW_VIDEO_STILL", 5, 4);
        f19638g = k2Var6;
        k2[] k2VarArr = {k2Var, k2Var2, k2Var3, k2Var4, k2Var5, k2Var6, new k2("CROPPED_RAW", 6, 6)};
        f19639h = k2VarArr;
        hl.d.k(k2VarArr);
    }

    public k2(String str, int i, int i10) {
        this.f19640b = i10;
    }

    public static k2 valueOf(String str) {
        return (k2) Enum.valueOf(k2.class, str);
    }

    public static k2[] values() {
        return (k2[]) f19639h.clone();
    }
}

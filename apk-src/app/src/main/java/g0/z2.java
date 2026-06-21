package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z2 f19812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z2 f19813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z2 f19814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z2 f19815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z2 f19816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z2 f19817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ z2[] f19818h;

    static {
        z2 z2Var = new z2("IMAGE_CAPTURE", 0);
        f19812b = z2Var;
        z2 z2Var2 = new z2("PREVIEW", 1);
        f19813c = z2Var2;
        z2 z2Var3 = new z2("IMAGE_ANALYSIS", 2);
        f19814d = z2Var3;
        z2 z2Var4 = new z2("VIDEO_CAPTURE", 3);
        f19815e = z2Var4;
        z2 z2Var5 = new z2("STREAM_SHARING", 4);
        f19816f = z2Var5;
        z2 z2Var6 = new z2("METERING_REPEATING", 5);
        f19817g = z2Var6;
        f19818h = new z2[]{z2Var, z2Var2, z2Var3, z2Var4, z2Var5, z2Var6};
    }

    public static z2 valueOf(String str) {
        return (z2) Enum.valueOf(z2.class, str);
    }

    public static z2[] values() {
        return (z2[]) f19818h.clone();
    }
}

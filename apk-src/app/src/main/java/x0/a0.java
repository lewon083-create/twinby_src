package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f35506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f35507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f35508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f35509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f35510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f35511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a0 f35512h;
    public static final a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a0 f35513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a0[] f35514k;

    static {
        a0 a0Var = new a0("CONFIGURING", 0);
        f35506b = a0Var;
        a0 a0Var2 = new a0("PENDING_RECORDING", 1);
        f35507c = a0Var2;
        a0 a0Var3 = new a0("PENDING_PAUSED", 2);
        f35508d = a0Var3;
        a0 a0Var4 = new a0("IDLING", 3);
        f35509e = a0Var4;
        a0 a0Var5 = new a0("RECORDING", 4);
        f35510f = a0Var5;
        a0 a0Var6 = new a0("PAUSED", 5);
        f35511g = a0Var6;
        a0 a0Var7 = new a0("STOPPING", 6);
        f35512h = a0Var7;
        a0 a0Var8 = new a0("RESETTING", 7);
        i = a0Var8;
        a0 a0Var9 = new a0("ERROR", 8);
        f35513j = a0Var9;
        f35514k = new a0[]{a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6, a0Var7, a0Var8, a0Var9};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f35514k.clone();
    }
}

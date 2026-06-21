package ni;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final le.a f29442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f29443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f29444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f29445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f29446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f29447h;
    public static final n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f29448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f29449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n[] f29450l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29451b;

    static {
        n nVar = new n("CAMERA_DISABLED", 0, 0);
        f29443d = nVar;
        n nVar2 = new n("CAMERA_FATAL_ERROR", 1, 1);
        f29444e = nVar2;
        n nVar3 = new n("CAMERA_IN_USE", 2, 2);
        f29445f = nVar3;
        n nVar4 = new n("DO_NOT_DISTURB_MODE_ENABLED", 3, 3);
        f29446g = nVar4;
        n nVar5 = new n("MAX_CAMERAS_IN_USE", 4, 4);
        f29447h = nVar5;
        n nVar6 = new n("OTHER_RECOVERABLE_ERROR", 5, 5);
        i = nVar6;
        n nVar7 = new n("STREAM_CONFIG", 6, 6);
        f29448j = nVar7;
        n nVar8 = new n("UNKNOWN", 7, 7);
        f29449k = nVar8;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8};
        f29450l = nVarArr;
        hl.d.k(nVarArr);
        f29442c = new le.a(6);
    }

    public n(String str, int i10, int i11) {
        this.f29451b = i11;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f29450l.clone();
    }
}

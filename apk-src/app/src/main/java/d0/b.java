package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f15486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f15487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f15488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f15489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f15490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pj.b f15491g;

    static {
        b bVar = new b("DYNAMIC_RANGE", 0);
        f15486b = bVar;
        b bVar2 = new b("FPS_RANGE", 1);
        f15487c = bVar2;
        b bVar3 = new b("VIDEO_STABILIZATION", 2);
        f15488d = bVar3;
        b bVar4 = new b("IMAGE_FORMAT", 3);
        f15489e = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f15490f = bVarArr;
        f15491g = hl.d.k(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f15490f.clone();
    }
}

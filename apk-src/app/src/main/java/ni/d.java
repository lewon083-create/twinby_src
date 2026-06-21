package ni;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l7.i f29364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f29365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f29366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f29367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f29368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d[] f29369h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29370b;

    static {
        d dVar = new d("RATIO16TO9", 0, 0);
        f29365d = dVar;
        d dVar2 = new d("RATIO4TO3", 1, 1);
        f29366e = dVar2;
        d dVar3 = new d("RATIO_DEFAULT", 2, 2);
        f29367f = dVar3;
        d dVar4 = new d("UNKNOWN", 3, 3);
        f29368g = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f29369h = dVarArr;
        hl.d.k(dVarArr);
        f29364c = new l7.i(5);
    }

    public d(String str, int i, int i10) {
        this.f29370b = i10;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f29369h.clone();
    }
}

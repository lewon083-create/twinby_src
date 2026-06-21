package cj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g8.g f2354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ r[] f2355d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2356b;

    static {
        r[] rVarArr = {new r("DASH", 0, 0), new r("HLS", 1, 1), new r("SS", 2, 2)};
        f2355d = rVarArr;
        hl.d.k(rVarArr);
        f2354c = new g8.g(11);
    }

    public r(String str, int i, int i10) {
        this.f2356b = i10;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f2355d.clone();
    }
}

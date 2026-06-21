package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xy f44839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xy f44840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ xy[] f44841e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44842b;

    static {
        xy xyVar = new xy(0, "NETWORK", "network");
        f44839c = xyVar;
        xy xyVar2 = new xy(1, "CACHE", "cache");
        f44840d = xyVar2;
        xy[] xyVarArr = {xyVar, xyVar2};
        f44841e = xyVarArr;
        hl.d.k(xyVarArr);
    }

    public xy(int i, String str, String str2) {
        this.f44842b = str2;
    }

    public static xy valueOf(String str) {
        return (xy) Enum.valueOf(xy.class, str);
    }

    public static xy[] values() {
        return (xy[]) f44841e.clone();
    }
}

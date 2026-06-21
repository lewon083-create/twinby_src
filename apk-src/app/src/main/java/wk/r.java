package wk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f35318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f35319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f35320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f35321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ r[] f35322h;
    public static final /* synthetic */ pj.b i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f35323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f35324c;

    static {
        r rVar = new r("OBJ", 0, '{', '}');
        f35318d = rVar;
        r rVar2 = new r("LIST", 1, '[', ']');
        f35319e = rVar2;
        r rVar3 = new r("MAP", 2, '{', '}');
        f35320f = rVar3;
        r rVar4 = new r("POLY_OBJ", 3, '[', ']');
        f35321g = rVar4;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4};
        f35322h = rVarArr;
        i = hl.d.k(rVarArr);
    }

    public r(String str, int i10, char c8, char c9) {
        this.f35323b = c8;
        this.f35324c = c9;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f35322h.clone();
    }
}

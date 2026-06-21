package ni;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l7.b f29457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f29458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f29459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f29460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f29461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f29462h;
    public static final o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ o[] f29463j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29464b;

    static {
        o oVar = new o("CLOSED", 0, 0);
        f29458d = oVar;
        o oVar2 = new o("CLOSING", 1, 1);
        f29459e = oVar2;
        o oVar3 = new o("OPEN", 2, 2);
        f29460f = oVar3;
        o oVar4 = new o("OPENING", 3, 3);
        f29461g = oVar4;
        o oVar5 = new o("PENDING_OPEN", 4, 4);
        f29462h = oVar5;
        o oVar6 = new o("UNKNOWN", 5, 5);
        i = oVar6;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6};
        f29463j = oVarArr;
        hl.d.k(oVarArr);
        f29457c = new l7.b(7);
    }

    public o(String str, int i10, int i11) {
        this.f29464b = i11;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f29463j.clone();
    }
}

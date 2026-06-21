package ni;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final le.a f29378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f29379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f29380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f29381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e[] f29382g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29383b;

    static {
        e eVar = new e("AUTO", 0, 0);
        f29379d = eVar;
        e eVar2 = new e("NONE", 1, 1);
        f29380e = eVar2;
        e eVar3 = new e("UNKNOWN", 2, 2);
        f29381f = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        f29382g = eVarArr;
        hl.d.k(eVarArr);
        f29378c = new le.a(5);
    }

    public e(String str, int i, int i10) {
        this.f29383b = i10;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f29382g.clone();
    }
}

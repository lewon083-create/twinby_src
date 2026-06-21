package ni;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l7.b f29340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f29341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f29342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f29343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f29344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a0 f29345h;
    public static final /* synthetic */ a0[] i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29346b;

    static {
        a0 a0Var = new a0("LEVEL3", 0, 0);
        f29341d = a0Var;
        a0 a0Var2 = new a0("EXTERNAL", 1, 1);
        f29342e = a0Var2;
        a0 a0Var3 = new a0("FULL", 2, 2);
        f29343f = a0Var3;
        a0 a0Var4 = new a0("LEGACY", 3, 3);
        f29344g = a0Var4;
        a0 a0Var5 = new a0("LIMITED", 4, 4);
        f29345h = a0Var5;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4, a0Var5};
        i = a0VarArr;
        hl.d.k(a0VarArr);
        f29340c = new l7.b(8);
    }

    public a0(String str, int i10, int i11) {
        this.f29346b = i11;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) i.clone();
    }
}

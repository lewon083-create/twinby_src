package ni;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final le.a f29371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f29372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d0 f29373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d0[] f29374f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29375b;

    static {
        d0 d0Var = new d0("CAMERA_STATE", 0, 0);
        f29372d = d0Var;
        d0 d0Var2 = new d0("ZOOM_STATE", 1, 1);
        f29373e = d0Var2;
        d0[] d0VarArr = {d0Var, d0Var2};
        f29374f = d0VarArr;
        hl.d.k(d0VarArr);
        f29371c = new le.a(8);
    }

    public d0(String str, int i, int i10) {
        this.f29375b = i10;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f29374f.clone();
    }
}

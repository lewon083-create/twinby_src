package ni;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l7.b f29384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e0[] f29385d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29386b;

    static {
        e0[] e0VarArr = {new e0("AE", 0, 0), new e0("AF", 1, 1), new e0("AWB", 2, 2)};
        f29385d = e0VarArr;
        hl.d.k(e0VarArr);
        f29384c = new l7.b(9);
    }

    public e0(String str, int i, int i10) {
        this.f29386b = i10;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f29385d.clone();
    }
}

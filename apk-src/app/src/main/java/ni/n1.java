package ni;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l7.b f29454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n1[] f29455d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29456b;

    static {
        n1[] n1VarArr = {new n1("SD", 0, 0), new n1("HD", 1, 1), new n1("FHD", 2, 2), new n1("UHD", 3, 3), new n1("LOWEST", 4, 4), new n1("HIGHEST", 5, 5)};
        f29455d = n1VarArr;
        hl.d.k(n1VarArr);
        f29454c = new l7.b(10);
    }

    public n1(String str, int i, int i10) {
        this.f29456b = i10;
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) f29455d.clone();
    }
}

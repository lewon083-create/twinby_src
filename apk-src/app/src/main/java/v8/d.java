package v8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f34806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f34807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f34808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f34809e;

    static {
        d dVar = new d("DEFAULT", 0);
        f34806b = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f34807c = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f34808d = dVar3;
        f34809e = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f34809e.clone();
    }
}

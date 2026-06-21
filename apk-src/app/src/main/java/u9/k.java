package u9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f34393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f34394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f34395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f34396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k[] f34397f;

    static {
        k kVar = new k("SUCCESS", 0);
        f34393b = kVar;
        k kVar2 = new k("PERMANENT_FAILURE", 1);
        f34394c = kVar2;
        k kVar3 = new k("RETRIABLE_FAILURE", 2);
        f34395d = kVar3;
        k kVar4 = new k("BUFFERED", 3);
        f34396e = kVar4;
        f34397f = new k[]{kVar, kVar2, kVar3, kVar4};
    }

    public static k[] values() {
        return (k[]) f34397f.clone();
    }
}

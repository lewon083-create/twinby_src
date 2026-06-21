package id;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f21293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f21294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f21295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f21296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f21297f;

    static {
        b bVar = new b("AD_STORAGE", 0);
        f21293b = bVar;
        b bVar2 = new b("ANALYTICS_STORAGE", 1);
        f21294c = bVar2;
        b bVar3 = new b("AD_USER_DATA", 2);
        f21295d = bVar3;
        b bVar4 = new b("AD_PERSONALIZATION", 3);
        f21296e = bVar4;
        f21297f = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f21297f.clone();
    }
}

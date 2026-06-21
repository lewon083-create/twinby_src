package a3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b[] f412h;

    static {
        b bVar = new b("PENALTY_LOG", 0);
        f406b = bVar;
        b bVar2 = new b("PENALTY_DEATH", 1);
        f407c = bVar2;
        b bVar3 = new b("DETECT_FRAGMENT_REUSE", 2);
        f408d = bVar3;
        b bVar4 = new b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f409e = bVar4;
        b bVar5 = new b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f410f = bVar5;
        b bVar6 = new b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        b bVar7 = new b("DETECT_SET_USER_VISIBLE_HINT", 6);
        b bVar8 = new b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        b bVar9 = new b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f411g = bVar9;
        f412h = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f412h.clone();
    }
}

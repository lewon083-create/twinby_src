package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f19756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f19757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f19758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f19759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f19760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f19761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f19762h;
    public static final /* synthetic */ t[] i;

    static {
        t tVar = new t("UNKNOWN", 0);
        f19756b = tVar;
        t tVar2 = new t("INACTIVE", 1);
        f19757c = tVar2;
        t tVar3 = new t("SCANNING", 2);
        f19758d = tVar3;
        t tVar4 = new t("PASSIVE_FOCUSED", 3);
        f19759e = tVar4;
        t tVar5 = new t("PASSIVE_NOT_FOCUSED", 4);
        f19760f = tVar5;
        t tVar6 = new t("LOCKED_FOCUSED", 5);
        f19761g = tVar6;
        t tVar7 = new t("LOCKED_NOT_FOCUSED", 6);
        f19762h = tVar7;
        i = new t[]{tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) i.clone();
    }
}

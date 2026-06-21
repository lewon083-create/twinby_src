package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f19736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f19737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f19738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f19739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f19740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f19741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ s[] f19742h;

    static {
        s sVar = new s("UNKNOWN", 0);
        f19736b = sVar;
        s sVar2 = new s("INACTIVE", 1);
        f19737c = sVar2;
        s sVar3 = new s("SEARCHING", 2);
        f19738d = sVar3;
        s sVar4 = new s("FLASH_REQUIRED", 3);
        f19739e = sVar4;
        s sVar5 = new s("CONVERGED", 4);
        f19740f = sVar5;
        s sVar6 = new s("LOCKED", 5);
        f19741g = sVar6;
        f19742h = new s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f19742h.clone();
    }
}

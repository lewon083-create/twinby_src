package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f19766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f19767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f19768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f19769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u f19770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u[] f19771g;

    static {
        u uVar = new u("UNKNOWN", 0);
        f19766b = uVar;
        u uVar2 = new u("INACTIVE", 1);
        f19767c = uVar2;
        u uVar3 = new u("METERING", 2);
        f19768d = uVar3;
        u uVar4 = new u("CONVERGED", 3);
        f19769e = uVar4;
        u uVar5 = new u("LOCKED", 4);
        f19770f = uVar5;
        f19771g = new u[]{uVar, uVar2, uVar3, uVar4, uVar5};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f19771g.clone();
    }
}

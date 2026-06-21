package ok;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f30706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f30707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f30708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f30709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f30710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f30711g;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f30706b = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f30707c = bVar2;
        b bVar3 = new b("PARKING", 2);
        f30708d = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f30709e = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f30710f = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f30711g = bVarArr;
        hl.d.k(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f30711g.clone();
    }
}

package ti;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f33917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f33918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z[] f33919d;

    static {
        z zVar = new z("NOT_READY", 0);
        f33917b = zVar;
        z zVar2 = new z("READY", 1);
        f33918c = zVar2;
        f33919d = new z[]{zVar, zVar2};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f33919d.clone();
    }
}

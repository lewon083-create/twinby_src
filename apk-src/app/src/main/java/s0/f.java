package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f32395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f32396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f32397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f32398e;

    static {
        f fVar = new f("UNKNOWN", 0);
        f32395b = fVar;
        f fVar2 = new f("DEFAULT", 1);
        f32396c = fVar2;
        f fVar3 = new f("YUV", 2);
        f32397d = fVar3;
        f32398e = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f32398e.clone();
    }
}

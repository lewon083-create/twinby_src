package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s2 f19753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s2 f19754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s2[] f19755d;

    static {
        s2 s2Var = new s2("UPTIME", 0);
        f19753b = s2Var;
        s2 s2Var2 = new s2("REALTIME", 1);
        f19754c = s2Var2;
        f19755d = new s2[]{s2Var, s2Var2};
    }

    public static s2 valueOf(String str) {
        return (s2) Enum.valueOf(s2.class, str);
    }

    public static s2[] values() {
        return (s2[]) f19755d.clone();
    }
}

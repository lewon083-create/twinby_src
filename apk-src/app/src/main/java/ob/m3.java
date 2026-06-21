package ob;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m3 f30293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m3 f30294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ m3[] f30295d;

    static {
        m3 m3Var = new m3("CONSENT", 0);
        f30293b = m3Var;
        m3 m3Var2 = new m3("LEGITIMATE_INTEREST", 1);
        m3 m3Var3 = new m3("FLEXIBLE_CONSENT", 2);
        m3 m3Var4 = new m3("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f30294c = m3Var4;
        f30295d = new m3[]{m3Var, m3Var2, m3Var3, m3Var4};
    }

    public static m3[] values() {
        return (m3[]) f30295d.clone();
    }
}

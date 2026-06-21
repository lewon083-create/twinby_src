package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ip2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ip2 f39605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ip2 f39606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ip2[] f39607e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39608b;

    static {
        ip2 ip2Var = new ip2(0, "LIGHT", "light");
        f39605c = ip2Var;
        ip2 ip2Var2 = new ip2(1, "DARK", "dark");
        f39606d = ip2Var2;
        ip2[] ip2VarArr = {ip2Var, ip2Var2};
        f39607e = ip2VarArr;
        hl.d.k(ip2VarArr);
    }

    public ip2(int i, String str, String str2) {
        this.f39608b = str2;
    }

    public static ip2 valueOf(String str) {
        return (ip2) Enum.valueOf(ip2.class, str);
    }

    public static ip2[] values() {
        return (ip2[]) f39607e.clone();
    }
}

package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n83 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n83 f41190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n83 f41191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n83 f41192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n83 f41193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n83 f41194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n83 f41195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n83 f41196h;
    public static final n83 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n83 f41197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ n83[] f41198k;

    static {
        n83 n83Var = new n83(0, "ADTUNE_CLICK");
        f41190b = n83Var;
        n83 n83Var2 = new n83(1, "ADTUNE_ITEM_CLICK");
        f41191c = n83Var2;
        n83 n83Var3 = new n83(2, "CLICK");
        f41192d = n83Var3;
        n83 n83Var4 = new n83(3, "FALSE_CLICK");
        f41193e = n83Var4;
        n83 n83Var5 = new n83(4, "MEDIATION_IMPRESSION");
        f41194f = n83Var5;
        n83 n83Var6 = new n83(5, "MEDIATION_RESPONSE");
        f41195g = n83Var6;
        n83 n83Var7 = new n83(6, "MRC_IMPRESSION");
        f41196h = n83Var7;
        n83 n83Var8 = new n83(7, "RENDER");
        i = n83Var8;
        n83 n83Var9 = new n83(8, "SERVER_SIDE_REWARD");
        f41197j = n83Var9;
        n83[] n83VarArr = {n83Var, n83Var2, n83Var3, n83Var4, n83Var5, n83Var6, n83Var7, n83Var8, n83Var9, new n83(9, "UNKNOWN")};
        f41198k = n83VarArr;
        hl.d.k(n83VarArr);
    }

    public n83(int i10, String str) {
    }

    public static n83 valueOf(String str) {
        return (n83) Enum.valueOf(n83.class, str);
    }

    public static n83[] values() {
        return (n83[]) f41198k.clone();
    }
}

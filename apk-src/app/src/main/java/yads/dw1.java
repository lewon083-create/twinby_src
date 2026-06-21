package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dw1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cw1 f37903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dw1 f37904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ dw1[] f37905e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37906b;

    static {
        dw1 dw1Var = new dw1(0, "AD_VIDEO_COMPLETE", "advideocomplete");
        dw1 dw1Var2 = new dw1(1, "IMPRESSION_TRACKING_START", "impressionTrackingStart");
        dw1 dw1Var3 = new dw1(2, "IMPRESSION_TRACKING_SUCCESS", "impressionTrackingSuccess");
        dw1 dw1Var4 = new dw1(3, "CLOSE", "close");
        dw1 dw1Var5 = new dw1(4, "OPEN", "open");
        dw1 dw1Var6 = new dw1(5, "REWARDED_AD_COMPLETE", "rewardedAdComplete");
        dw1 dw1Var7 = new dw1(6, "USE_CUSTOM_CLOSE", "usecustomclose");
        dw1 dw1Var8 = new dw1(7, "UNSPECIFIED", "");
        f37904d = dw1Var8;
        dw1[] dw1VarArr = {dw1Var, dw1Var2, dw1Var3, dw1Var4, dw1Var5, dw1Var6, dw1Var7, dw1Var8, new dw1(8, "AD_RENDERED", "adRendered")};
        f37905e = dw1VarArr;
        hl.d.k(dw1VarArr);
        f37903c = new cw1();
    }

    public dw1(int i, String str, String str2) {
        this.f37906b = str2;
    }

    public static dw1 valueOf(String str) {
        return (dw1) Enum.valueOf(dw1.class, str);
    }

    public static dw1[] values() {
        return (dw1[]) f37905e.clone();
    }

    public final String a() {
        return this.f37906b;
    }
}

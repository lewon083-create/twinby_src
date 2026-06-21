package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pr0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pr0 f41996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pr0 f41997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final pr0 f41998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pr0[] f41999f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42000b;

    static {
        pr0 pr0Var = new pr0(0, "AD_POD_SKIP", "AdPodSkipFeatureToggle");
        pr0 pr0Var2 = new pr0(1, "INTERSTITIAL_PRELOADING", "InterstitialPreloading");
        pr0 pr0Var3 = new pr0(2, "REWARDED_PRELOADING", "RewardedPreloading");
        pr0 pr0Var4 = new pr0(3, "FIRST_VIDEO_PRELOADING_STRATEGY", "FirstVideoPreloadingStrategyFeatureToggle");
        f41996c = pr0Var4;
        pr0 pr0Var5 = new pr0(4, "TESTING_NEW_ADAPTER", "TestingNewAdapterFeatureToggle");
        f41997d = pr0Var5;
        pr0 pr0Var6 = new pr0(5, "FALLBACK_FOR_VIDEO", "FallbackForVideoFeatureToggle");
        f41998e = pr0Var6;
        pr0[] pr0VarArr = {pr0Var, pr0Var2, pr0Var3, pr0Var4, pr0Var5, pr0Var6, new pr0(6, "BACKGROUND_NATIVE_VIDEO_PRELOADING", "BackgroundNativeVideoPreloading"), new pr0(7, "DONT_WAIT_FOR_WEB_VIEW_LOAD_FINISH_ON_PRELOADING", "DontWaitForWebViewLoadFinishOnPreloading")};
        f41999f = pr0VarArr;
        hl.d.k(pr0VarArr);
    }

    public pr0(int i, String str, String str2) {
        this.f42000b = str2;
    }

    public static pr0 valueOf(String str) {
        return (pr0) Enum.valueOf(pr0.class, str);
    }

    public static pr0[] values() {
        return (pr0[]) f41999f.clone();
    }
}

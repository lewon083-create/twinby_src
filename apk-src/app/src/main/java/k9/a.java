package k9;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public enum a {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27254b;

    a(int i10) {
        this.f27254b = i10;
    }

    public static a a(int i10) {
        for (a aVar : values()) {
            if (aVar.f27254b == i10) {
                return aVar;
            }
        }
        return null;
    }
}

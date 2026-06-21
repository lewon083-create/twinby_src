package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f20 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f38332e = "yandex_tracking_events";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f38333f = "yandex_linear_creative_info";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3 f38334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gf1 f38335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d20 f38336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sp3 f38337d;

    public /* synthetic */ f20(Context context, ko2 ko2Var) {
        this(new up3(), new gf1(context, ko2Var, new lj(context, ko2Var, null, 12)));
    }

    public static d20 a() {
        return new d20(new kr0(new up3()), new up3());
    }

    public static sp3 b() {
        return new sp3(new b83(), "CreativeExtension", "Tracking");
    }

    public f20(up3 up3Var, gf1 gf1Var) {
        this.f38334a = up3Var;
        this.f38335b = gf1Var;
        this.f38336c = a();
        this.f38337d = b();
    }
}

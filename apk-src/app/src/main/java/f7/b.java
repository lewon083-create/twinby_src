package f7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f16666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f16667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f16668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f16669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f16670h;
    public static final b i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16672c;

    static {
        int i10 = 0;
        f16666d = new b("NONE", i10);
        f16667e = new b("FULL", i10);
        int i11 = 1;
        f16668f = new b("FLAT", i11);
        f16669g = new b("HALF_OPENED", i11);
        int i12 = 2;
        f16670h = new b("FOLD", i12);
        i = new b("HINGE", i12);
    }

    public /* synthetic */ b(String str, int i10) {
        this.f16671b = i10;
        this.f16672c = str;
    }

    public String toString() {
        switch (this.f16671b) {
            case 0:
                return (String) this.f16672c;
            case 1:
                return (String) this.f16672c;
            case 2:
                return (String) this.f16672c;
            default:
                return super.toString();
        }
    }

    public b(g7.a windowBackend) {
        this.f16671b = 3;
        n windowMetricsCalculator = n.f16694b;
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(windowBackend, "windowBackend");
        this.f16672c = windowBackend;
    }
}

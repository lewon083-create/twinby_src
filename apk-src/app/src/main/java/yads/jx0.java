package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jx0 implements kx0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f40004b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm2 f40005a = om2.a();

    static {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u(jx0.class, "forceImpressionTrackingListenerReference", "getForceImpressionTrackingListenerReference()Lcom/monetization/ads/base/impression/ForceImpressionTrackingListener;");
        kotlin.jvm.internal.g0.f27511a.getClass();
        f40004b = new dk.i[]{uVar};
    }

    @Override // yads.kx0
    public final void a() {
        nm2 nm2Var = this.f40005a;
        dk.i iVar = f40004b[0];
        kx0 kx0Var = (kx0) nm2Var.f41294a.get();
        if (kx0Var != null) {
            kx0Var.a();
        }
    }
}

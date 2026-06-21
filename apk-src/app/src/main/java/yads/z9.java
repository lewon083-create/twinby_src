package yads;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z9 implements f4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f45281b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm2 f45282a = om2.a(null);

    static {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u(z9.class, "adEventsReceiver", "getAdEventsReceiver()Lcom/monetization/ads/base/AdEventsReceiver;");
        kotlin.jvm.internal.g0.f27511a.getClass();
        f45281b = new dk.i[]{uVar};
    }

    @Override // yads.f4
    public final void a(int i, Bundle bundle) {
        nm2 nm2Var = this.f45282a;
        dk.i iVar = f45281b[0];
        f4 f4Var = (f4) nm2Var.f41294a.get();
        if (f4Var != null) {
            f4Var.a(i, bundle);
        }
    }

    public final void a(f4 f4Var) {
        nm2 nm2Var = this.f45282a;
        dk.i iVar = f45281b[0];
        nm2Var.getClass();
        nm2Var.f41294a = new WeakReference(f4Var);
    }
}

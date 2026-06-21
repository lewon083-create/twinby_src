package yads;

import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y92 implements od3, kotlin.jvm.internal.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z92 f44965a;

    public y92(z92 z92Var) {
        this.f44965a = z92Var;
    }

    @Override // yads.od3
    public final void a() {
        z92 z92Var = this.f44965a;
        synchronized (z92Var.f45287a) {
            z92Var.f45292f = true;
            Unit unit = Unit.f27471a;
        }
        z92Var.c();
        z92Var.f45290d.b();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof od3) && (obj instanceof kotlin.jvm.internal.m)) {
            return Intrinsics.a(getFunctionDelegate(), ((kotlin.jvm.internal.m) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.m
    public final Function getFunctionDelegate() {
        return new kotlin.jvm.internal.p(0, this.f44965a, z92.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}

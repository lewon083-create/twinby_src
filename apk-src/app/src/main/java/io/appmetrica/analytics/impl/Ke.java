package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ke implements InterfaceC0558vc, ActivationBarrierCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0480s9 f22570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0533uc f22571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0533uc f22572c;

    public Ke(@NotNull InterfaceC0480s9 interfaceC0480s9, @NotNull Pg pg, @NotNull C0401p4 c0401p4, @NotNull Ve ve2) {
        this.f22570a = interfaceC0480s9;
        C0533uc c0533uc = new C0533uc(pg, c0401p4, ve2);
        this.f22571b = c0533uc;
        this.f22572c = c0533uc;
        if (c0533uc.b()) {
            return;
        }
        C0382oa.k().a().subscribe(TimeUnit.SECONDS.toMillis(J7.f22517a.longValue()), C0382oa.k().w().d(), this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0558vc
    @NotNull
    public final G8 a() {
        return this.f22572c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f22571b.a();
        ((C0302l5) this.f22570a.a()).e();
    }
}

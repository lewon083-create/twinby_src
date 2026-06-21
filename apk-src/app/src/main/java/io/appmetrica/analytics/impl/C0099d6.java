package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0099d6 extends Og {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f23670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0538uh f23671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0477s6 f23672h;
    public final L1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0378o6 f23673j;

    public C0099d6(@NotNull Context context, @NotNull C0397p0 c0397p0, @Nullable Yk yk2, @NotNull C0538uh c0538uh) {
        super(c0397p0, yk2, c0538uh);
        this.f23670f = context;
        this.f23671g = c0538uh;
        this.f23672h = C0071c4.l().i();
        this.i = C0071c4.l().f();
        this.f23673j = new C0378o6(context);
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0588wh
    public final synchronized void a() {
        try {
            if (this.f24985c) {
                return;
            }
            this.f24985c = true;
            String strA = this.f23672h.f24729a.a();
            L1 l12 = this.i;
            Context context = this.f23670f;
            l12.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            if (Intrinsics.a(strA, serviceInfo != null ? serviceInfo.processName : null)) {
                this.f23673j.a(this.f23671g);
            } else {
                this.f24983a.c();
                this.f24985c = false;
                super.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0588wh
    public final boolean c() {
        this.f23673j.a(this.f23671g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0588wh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.f27471a;
    }
}

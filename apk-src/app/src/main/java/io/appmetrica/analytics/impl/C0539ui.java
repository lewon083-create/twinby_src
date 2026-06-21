package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ui, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0539ui extends C0295kn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RunnableC0514ti f24852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f24853e;

    public C0539ui(@NonNull Y4 y42, @NonNull Jl jl2, @NonNull ICommonExecutor iCommonExecutor) {
        super(y42, jl2);
        this.f24852d = new RunnableC0514ti(this);
        this.f24853e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C0295kn
    public final void a() {
        this.f24853e.remove(this.f24852d);
    }

    @Override // io.appmetrica.analytics.impl.C0295kn
    public final void f() {
        this.f24253b.a();
        C0264jh c0264jh = (C0264jh) ((Y4) this.f24252a).f23291k.a();
        if (c0264jh.f24160k.a(c0264jh.f24159j)) {
            String str = c0264jh.f24162m;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(Vd.a((Y4) this.f24252a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C0295kn
    public final void g() {
        this.f24853e.executeDelayed(this.f24852d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f24254c.get()) {
            return;
        }
        this.f24853e.remove(this.f24852d);
        if (((C0264jh) ((Y4) this.f24252a).f23291k.a()).f24157g > 0) {
            this.f24853e.executeDelayed(this.f24852d, TimeUnit.SECONDS.toMillis(((C0264jh) ((Y4) this.f24252a).f23291k.a()).f24157g));
        }
    }
}

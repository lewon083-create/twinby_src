package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0397p0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f24534k = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f24536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IAppMetricaService f24538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownLatch f24539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f24540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G1 f24541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final H1 f24542h;
    public final RunnableC0347n0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ServiceConnectionC0372o0 f24543j;

    public C0397p0(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, C0071c4.l().e(), new H1());
    }

    public final synchronized boolean a() {
        return this.f24538d != null;
    }

    public final void b() {
        synchronized (this.f24540f) {
            this.f24536b.remove(this.i);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f24536b;
        synchronized (this.f24540f) {
            try {
                iCommonExecutor.remove(this.i);
                if (!this.f24537c) {
                    iCommonExecutor.executeDelayed(this.i, f24534k);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Long l10) {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f24539e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l10.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (InterruptedException unused) {
        }
    }

    public C0397p0(Context context, ICommonExecutor iCommonExecutor, G1 g12, H1 h12) {
        this.f24538d = null;
        this.f24540f = new Object();
        this.i = new RunnableC0347n0(this);
        this.f24543j = new ServiceConnectionC0372o0(this);
        this.f24535a = context.getApplicationContext();
        this.f24536b = iCommonExecutor;
        this.f24537c = false;
        this.f24541g = g12;
        this.f24542h = h12;
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractCallableC0588wh implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C0563vh f24982d = new C0563vh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0397p0 f24983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Yk f24984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24985c;

    public AbstractCallableC0588wh(C0397p0 c0397p0, Yk yk2) {
        this.f24983a = c0397p0;
        this.f24984b = yk2;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(@Nullable Throwable th2) {
    }

    @NotNull
    public final C0397p0 b() {
        return this.f24983a;
    }

    public boolean c() {
        C0397p0 c0397p0 = this.f24983a;
        synchronized (c0397p0) {
            try {
                if (c0397p0.f24538d == null) {
                    c0397p0.f24539e = new CountDownLatch(1);
                    H1 h12 = c0397p0.f24542h;
                    Context context = c0397p0.f24535a;
                    h12.getClass();
                    Intent intentA = H1.a(context);
                    try {
                        c0397p0.f24541g.b(c0397p0.f24535a);
                        c0397p0.f24535a.bindService(intentA, c0397p0.f24543j, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f24983a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.f27471a;
    }

    public final boolean d() {
        return this.f24985c;
    }

    public final void a(boolean z5) {
        this.f24985c = z5;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f24985c) {
                return;
            }
            this.f24985c = true;
            int i = 0;
            do {
                C0397p0 c0397p0 = this.f24983a;
                synchronized (c0397p0) {
                    iAppMetricaService = c0397p0.f24538d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        Yk yk2 = this.f24984b;
                        if (yk2 != null && !((C0214hi) yk2).a()) {
                            return;
                        }
                        this.f24983a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i++;
                if (!c() || P1.f22818e.get()) {
                    return;
                }
            } while (i < 3);
        } catch (Throwable th2) {
            a(th2);
        }
    }
}

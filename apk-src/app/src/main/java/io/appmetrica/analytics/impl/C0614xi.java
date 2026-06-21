package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0614xi implements InterfaceC0087ck {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C0589wi f25023e = new C0589wi();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f25024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f25025g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0397p0 f25026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xj f25027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeProvider f25028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f25029d;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f25024f = timeUnit.toMillis(1L);
        f25025g = timeUnit.toMillis(4L);
    }

    public C0614xi(@NotNull C0397p0 c0397p0, @NotNull Xj xj2, @NotNull TimeProvider timeProvider) {
        this.f25026a = c0397p0;
        this.f25027b = xj2;
        this.f25028c = timeProvider;
        this.f25029d = C0071c4.l().g().b();
    }

    public final void a(@NotNull C0538uh c0538uh) {
        Callable og;
        ICommonExecutor iCommonExecutor = this.f25029d;
        if (c0538uh.f24848b) {
            Xj xj2 = this.f25027b;
            og = new C0099d6(xj2.f23259a, xj2.f23260b, xj2.f23261c, c0538uh);
        } else {
            Xj xj3 = this.f25027b;
            og = new Og(xj3.f23260b, xj3.f23261c, c0538uh);
        }
        iCommonExecutor.submit(og);
    }

    public final void b(@NotNull C0538uh c0538uh) {
        long jUptimeMillis = this.f25028c.uptimeMillis();
        Xj xj2 = this.f25027b;
        C0099d6 c0099d6 = new C0099d6(xj2.f23259a, xj2.f23260b, xj2.f23261c, c0538uh);
        long j10 = Intrinsics.a(Looper.myLooper(), Looper.getMainLooper()) ? f25024f : f25025g;
        if (this.f25026a.a()) {
            try {
                this.f25029d.submit(c0099d6).get(j10, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c0099d6.f24985c) {
            return;
        }
        try {
            c0099d6.a();
            Thread.sleep(Math.max(0L, j10 - (this.f25028c.uptimeMillis() - jUptimeMillis)));
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0087ck
    public final void reportData(int i, @NotNull Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f25029d;
        Xj xj2 = this.f25027b;
        iCommonExecutor.submit(new Mn(xj2.f23260b, xj2.f23261c, i, bundle));
    }

    public C0614xi(@NotNull C0397p0 c0397p0, @NotNull Xj xj2) {
        this(c0397p0, xj2, new SystemTimeProvider());
    }

    public final void a(@NotNull Af af2) {
        ICommonExecutor iCommonExecutor = this.f25029d;
        Xj xj2 = this.f25027b;
        iCommonExecutor.submit(new C0460re(xj2.f23260b, xj2.f23261c, af2));
    }

    public final void b(@NotNull Af af2) {
        ICommonExecutor iCommonExecutor = this.f25029d;
        Xj xj2 = this.f25027b;
        iCommonExecutor.submit(new Di(xj2.f23260b, xj2.f23261c, af2));
    }
}

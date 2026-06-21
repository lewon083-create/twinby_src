package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0117e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f23710g = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f23711h = "WatchDog-" + ThreadFactoryC0659zd.f25117a.incrementAndGet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f23712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f23713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f23714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0092d f23715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f23716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f23717f;

    public C0117e(Eb eb2) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f23712a = copyOnWriteArrayList;
        this.f23713b = new AtomicInteger();
        this.f23714c = new Handler(Looper.getMainLooper());
        this.f23716e = new AtomicBoolean();
        this.f23717f = new a0.d1(26, this);
        copyOnWriteArrayList.add(eb2);
    }

    public final /* synthetic */ void a() {
        this.f23716e.set(true);
    }

    public final synchronized void b() {
        C0092d c0092d = this.f23715d;
        if (c0092d != null) {
            c0092d.f23648a.set(false);
            this.f23715d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i) {
        AtomicInteger atomicInteger = this.f23713b;
        int i10 = 5;
        if (i >= 5) {
            i10 = i;
        }
        atomicInteger.set(i10);
        if (this.f23715d == null) {
            C0092d c0092d = new C0092d(this);
            this.f23715d = c0092d;
            try {
                c0092d.setName(f23711h);
            } catch (SecurityException unused) {
            }
            this.f23715d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i));
        }
    }
}

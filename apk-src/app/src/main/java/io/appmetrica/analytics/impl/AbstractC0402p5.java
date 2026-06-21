package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0402p5 implements InterfaceC0086cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f24561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f24562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public M5 f24563c;

    public AbstractC0402p5(@NonNull BaseRequestConfig.RequestConfigLoader<Object, M5> requestConfigLoader, @NonNull C0140em c0140em, @NonNull ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f24562b = requestConfigLoader;
        C0382oa.k().v().a(this);
        a(new M5(c0140em, C0382oa.k().v(), C0382oa.k().s(), argumentsMerger));
    }

    public final synchronized void a(@NonNull M5 m52) {
        this.f24563c = m52;
    }

    @NonNull
    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f24563c.componentArguments;
    }

    @NonNull
    public final synchronized C0140em c() {
        return this.f24563c.f22651a;
    }

    public final void d() {
        synchronized (this) {
            this.f24561a = null;
        }
    }

    public final synchronized void e() {
        this.f24561a = null;
    }

    public synchronized void a(@NonNull Object obj) {
        if (!((ArgumentsMerger) this.f24563c.componentArguments).compareWithOtherArguments(obj)) {
            a(new M5(c(), C0382oa.I.v(), C0382oa.I.s(), (ArgumentsMerger) ((ArgumentsMerger) this.f24563c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(@NonNull C0140em c0140em) {
        a(new M5(c0140em, C0382oa.I.v(), C0382oa.I.s(), b()));
        e();
    }

    @NonNull
    public final synchronized BaseRequestConfig a() {
        try {
            if (this.f24561a == null) {
                this.f24561a = this.f24562b.load(this.f24563c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f24561a;
    }
}

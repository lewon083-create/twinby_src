package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0626y5 implements G8, T8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M6 f25082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f25083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f25084c;

    public C0626y5(@NotNull M6 m62) {
        this.f25082a = m62;
        Integer[] elements = {Integer.valueOf(EnumC0078cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC0078cb.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC0078cb.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC0078cb.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC0078cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC0078cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC0078cb.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC0078cb.EVENT_TYPE_SEND_REVENUE_EVENT.a())};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setW = kotlin.collections.p.w(elements);
        this.f25083b = setW;
        this.f25084c = new AtomicLong(m62.a(setW));
        m62.a(this);
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void a() {
        this.f25084c.set(this.f25082a.a(this.f25083b));
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final boolean b() {
        return this.f25084c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void b(@NotNull List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f25083b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f25084c.addAndGet(-i);
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void a(@NotNull List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f25083b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f25084c.addAndGet(i);
    }
}

package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ICrashTransformer;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0278k6 implements Ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0253j6 f24205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f24206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N9 f24207c;

    public AbstractC0278k6(InterfaceC0253j6 interfaceC0253j6, ICrashTransformer iCrashTransformer, N9 n92) {
        this.f24205a = interfaceC0253j6;
        this.f24206b = iCrashTransformer;
        this.f24207c = n92;
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(Throwable th2, @NonNull V v5) {
        if (this.f24205a.a(th2)) {
            ICrashTransformer iCrashTransformer = this.f24206b;
            if (iCrashTransformer == null || th2 == null || (th2 = iCrashTransformer.process(th2)) != null) {
                Pn pnA = Sn.a(th2, v5, null, (String) this.f24207c.f22728b.a(), (Boolean) this.f24207c.f22729c.a());
                C0182gc c0182gc = (C0182gc) ((Ah) this).f22079d;
                c0182gc.f23178a.a().a(c0182gc.f23934b).a(pnA);
            }
        }
    }

    public final InterfaceC0253j6 b() {
        return this.f24205a;
    }

    public final ICrashTransformer a() {
        return this.f24206b;
    }
}

package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class C0388og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Oa f24519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0263jg f24520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ma f24521c;

    public C0388og(Oa oa2, InterfaceC0263jg interfaceC0263jg, Ma ma2) {
        this.f24519a = oa2;
        this.f24520b = interfaceC0263jg;
        this.f24521c = ma2;
    }

    public final void a(C0338mg c0338mg) {
        if (this.f24519a.a(c0338mg)) {
            this.f24520b.a(c0338mg);
            this.f24521c.a();
        }
    }

    @NonNull
    public final InterfaceC0263jg b() {
        return this.f24520b;
    }

    @NonNull
    public final Ma c() {
        return this.f24521c;
    }

    @NonNull
    public final Oa a() {
        return this.f24519a;
    }
}

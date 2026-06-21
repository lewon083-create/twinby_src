package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0082cf implements R7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C0412pf f23612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<C0056bf> f23613b;

    public C0082cf(@NonNull C0412pf c0412pf, @NonNull List<C0056bf> list) {
        this.f23612a = c0412pf;
        this.f23613b = list;
    }

    @Override // io.appmetrica.analytics.impl.R7
    @NonNull
    public final List<C0056bf> a() {
        return this.f23613b;
    }

    @Override // io.appmetrica.analytics.impl.R7
    public final Object b() {
        return this.f23612a;
    }

    public final C0412pf c() {
        return this.f23612a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreloadInfoData{chosenPreloadInfo=");
        sb2.append(this.f23612a);
        sb2.append(", candidates=");
        return a0.u.p(sb2, this.f23613b, '}');
    }
}

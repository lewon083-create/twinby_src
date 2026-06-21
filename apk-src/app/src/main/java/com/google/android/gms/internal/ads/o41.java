package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o41 extends q41 {
    public static final q41 f(int i) {
        return i < 0 ? q41.f9330b : i > 0 ? q41.f9331c : q41.f9329a;
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final q41 a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final q41 b(int i, int i10) {
        return f(Integer.compare(i, i10));
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final q41 c(boolean z5, boolean z10) {
        return f(Boolean.compare(z10, z5));
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final q41 d(boolean z5, boolean z10) {
        return f(Boolean.compare(z5, z10));
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final int e() {
        return 0;
    }
}

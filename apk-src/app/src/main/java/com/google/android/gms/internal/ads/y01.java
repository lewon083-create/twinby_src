package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y01 extends dv0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qy0 f12435f;

    public y01(Context context, ExecutorService executorService, qy0 qy0Var) {
        super(context, executorService, new sb.g().f32858a, false);
        this.f12435f = qy0Var;
    }

    @Override // com.google.android.gms.internal.ads.dv0
    public final void b(int i, long j10) {
        ((xy0) this.f12435f).a(null, null, i, j10);
        new sb.g().b(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.dv0
    public final void c(int i, long j10, Exception exc) {
        ((xy0) this.f12435f).a(null, exc, i, j10);
        new sb.g().b(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.dv0
    public final void d(int i, String str) {
        ((xy0) this.f12435f).a(str, null, i, -1L);
        new sb.g().b(Boolean.TRUE);
    }
}

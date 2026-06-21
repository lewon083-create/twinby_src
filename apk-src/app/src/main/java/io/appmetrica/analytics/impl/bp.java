package io.appmetrica.analytics.impl;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bp implements I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K1 f23527b;

    public /* synthetic */ bp(K1 k12, int i) {
        this.f23526a = i;
        this.f23527b = k12;
    }

    @Override // io.appmetrica.analytics.impl.I1
    public final boolean a(Intent intent) {
        switch (this.f23526a) {
            case 0:
                return K1.a(this.f23527b, intent);
            case 1:
                return K1.b(this.f23527b, intent);
            default:
                return K1.c(this.f23527b, intent);
        }
    }
}

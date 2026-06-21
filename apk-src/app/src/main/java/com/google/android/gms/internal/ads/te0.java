package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class te0 implements k80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f10592b = new Bundle();

    @Override // com.google.android.gms.internal.ads.k80
    public final synchronized void b(String str) {
        this.f10592b.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final synchronized void g(String str, String str2) {
        this.f10592b.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final synchronized void w(String str) {
        this.f10592b.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void F(String str) {
    }
}

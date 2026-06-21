package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 extends gu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jx f5793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ku f5794c;

    public gg0(jx jxVar, ku kuVar) {
        this.f5793b = jxVar;
        this.f5794c = kuVar;
    }

    @Override // com.google.android.gms.internal.ads.hu
    public final void Y2(ParcelFileDescriptor parcelFileDescriptor) {
        this.f5793b.b(new pg0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f5794c));
    }

    @Override // com.google.android.gms.internal.ads.hu
    public final void a3(ParcelFileDescriptor parcelFileDescriptor, ku kuVar) {
        this.f5793b.b(new pg0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), kuVar));
    }

    @Override // com.google.android.gms.internal.ads.hu
    public final void g1(t9.o oVar) {
        oVar.getClass();
        this.f5793b.d(new t9.n(oVar.f33635b, oVar.f33636c));
    }
}

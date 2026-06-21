package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fg0 extends gu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg0 f5361b;

    public fg0(hg0 hg0Var) {
        this.f5361b = hg0Var;
    }

    @Override // com.google.android.gms.internal.ads.hu
    public final void Y2(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        hg0 hg0Var = this.f5361b;
        hg0Var.f6133b.b(new pg0(autoCloseInputStream, hg0Var.f6137f));
    }

    @Override // com.google.android.gms.internal.ads.hu
    public final void a3(ParcelFileDescriptor parcelFileDescriptor, ku kuVar) {
        this.f5361b.f6133b.b(new pg0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), kuVar));
    }

    @Override // com.google.android.gms.internal.ads.hu
    public final void g1(t9.o oVar) {
        jx jxVar = this.f5361b.f6133b;
        oVar.getClass();
        jxVar.d(new t9.n(oVar.f33635b, oVar.f33636c));
    }
}

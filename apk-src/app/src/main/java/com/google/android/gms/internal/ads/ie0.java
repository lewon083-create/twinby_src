package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ie0 extends q9.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gk0 f6474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ je0 f6475c;

    public ie0(je0 je0Var, gk0 gk0Var) {
        this.f6474b = gk0Var;
        this.f6475c = je0Var;
    }

    @Override // q9.y
    public final void E(int i) {
        long j10 = this.f6475c.f6834a;
        hi hiVar = new hi("interstitial");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onAdFailedToLoad";
        hiVar.f6144e = Integer.valueOf(i);
        this.f6474b.t(hiVar);
    }

    @Override // q9.y
    public final void c() {
        long j10 = this.f6475c.f6834a;
        hi hiVar = new hi("interstitial");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onAdLoaded";
        this.f6474b.t(hiVar);
    }

    @Override // q9.y
    public final void d0(q9.x1 x1Var) {
        long j10 = this.f6475c.f6834a;
        int i = x1Var.f31976b;
        hi hiVar = new hi("interstitial");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onAdFailedToLoad";
        hiVar.f6144e = Integer.valueOf(i);
        this.f6474b.t(hiVar);
    }

    @Override // q9.y
    public final void k() {
        long j10 = this.f6475c.f6834a;
        hi hiVar = new hi("interstitial");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onAdOpened";
        this.f6474b.t(hiVar);
    }

    @Override // q9.y
    public final void m() {
        long j10 = this.f6475c.f6834a;
        hi hiVar = new hi("interstitial");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onAdClicked";
        String strA = hiVar.a();
        hp hpVar = (hp) this.f6474b.f5837c;
        Parcel parcelD0 = hpVar.D0();
        parcelD0.writeString(strA);
        hpVar.L1(parcelD0, 1);
    }

    @Override // q9.y
    public final void z() {
        long j10 = this.f6475c.f6834a;
        hi hiVar = new hi("interstitial");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onAdClosed";
        this.f6474b.t(hiVar);
    }

    @Override // q9.y
    public final void d() {
    }

    @Override // q9.y
    public final void f() {
    }

    @Override // q9.y
    public final void i() {
    }
}

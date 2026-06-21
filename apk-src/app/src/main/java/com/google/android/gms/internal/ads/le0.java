package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class le0 extends gv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ me0 f7497b;

    public le0(me0 me0Var) {
        this.f7497b = me0Var;
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void A3(q9.x1 x1Var) {
        me0 me0Var = this.f7497b;
        gk0 gk0Var = me0Var.f7870b;
        long j10 = me0Var.f7869a;
        int i = x1Var.f31976b;
        hi hiVar = new hi("rewarded");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onRewardedAdFailedToShow";
        hiVar.f6144e = Integer.valueOf(i);
        gk0Var.t(hiVar);
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void Z2(bv bvVar) {
        me0 me0Var = this.f7497b;
        gk0 gk0Var = me0Var.f7870b;
        long j10 = me0Var.f7869a;
        hi hiVar = new hi("rewarded");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onUserEarnedReward";
        hiVar.f6145f = bvVar.i();
        hiVar.f6146g = Integer.valueOf(bvVar.c());
        gk0Var.t(hiVar);
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void b(int i) {
        me0 me0Var = this.f7497b;
        gk0 gk0Var = me0Var.f7870b;
        long j10 = me0Var.f7869a;
        hi hiVar = new hi("rewarded");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onRewardedAdFailedToShow";
        hiVar.f6144e = Integer.valueOf(i);
        gk0Var.t(hiVar);
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void c() {
        me0 me0Var = this.f7497b;
        gk0 gk0Var = me0Var.f7870b;
        long j10 = me0Var.f7869a;
        hi hiVar = new hi("rewarded");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onRewardedAdClosed";
        gk0Var.t(hiVar);
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void d() {
        me0 me0Var = this.f7497b;
        gk0 gk0Var = me0Var.f7870b;
        long j10 = me0Var.f7869a;
        hi hiVar = new hi("rewarded");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onAdImpression";
        gk0Var.t(hiVar);
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void i() {
        me0 me0Var = this.f7497b;
        gk0 gk0Var = me0Var.f7870b;
        long j10 = me0Var.f7869a;
        hi hiVar = new hi("rewarded");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onRewardedAdOpened";
        gk0Var.t(hiVar);
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void n() {
        me0 me0Var = this.f7497b;
        gk0 gk0Var = me0Var.f7870b;
        long j10 = me0Var.f7869a;
        hi hiVar = new hi("rewarded");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onAdClicked";
        gk0Var.t(hiVar);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ke0 extends kv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ me0 f7206b;

    public ke0(me0 me0Var) {
        this.f7206b = me0Var;
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void a(q9.x1 x1Var) {
        me0 me0Var = this.f7206b;
        gk0 gk0Var = me0Var.f7870b;
        long j10 = me0Var.f7869a;
        int i = x1Var.f31976b;
        hi hiVar = new hi("rewarded");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onRewardedAdFailedToLoad";
        hiVar.f6144e = Integer.valueOf(i);
        gk0Var.t(hiVar);
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void i() {
        me0 me0Var = this.f7206b;
        gk0 gk0Var = me0Var.f7870b;
        long j10 = me0Var.f7869a;
        hi hiVar = new hi("rewarded");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onRewardedAdLoaded";
        gk0Var.t(hiVar);
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void t(int i) {
        me0 me0Var = this.f7206b;
        gk0 gk0Var = me0Var.f7870b;
        long j10 = me0Var.f7869a;
        hi hiVar = new hi("rewarded");
        hiVar.f6141b = Long.valueOf(j10);
        hiVar.f6143d = "onRewardedAdFailedToLoad";
        hiVar.f6144e = Integer.valueOf(i);
        gk0Var.t(hiVar);
    }
}

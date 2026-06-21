package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class st0 extends kv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y81 f10382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tp0 f10383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0 f10384d;

    public st0(ht0 ht0Var, y81 y81Var, tp0 tp0Var) {
        this.f10382b = y81Var;
        this.f10383c = tp0Var;
        this.f10384d = ht0Var;
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void a(q9.x1 x1Var) {
        String string = x1Var.e().toString();
        ht0 ht0Var = this.f10384d;
        String str = ht0Var.f6245e.f31981b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb2.append("Failed to load rewarded ad with error: ");
        sb2.append(string);
        sb2.append(", adUnitId: ");
        sb2.append(str);
        u9.i.h(sb2.toString());
        ht0Var.a(x1Var);
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void i() {
        Objects.requireNonNull(this.f10384d);
        this.f10382b.e(this.f10383c);
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void t(int i) {
    }
}

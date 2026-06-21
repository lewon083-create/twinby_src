package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tm0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f10662b;

    public /* synthetic */ tm0(Boolean bool, int i) {
        this.f10661a = i;
        this.f10662b = bool;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f10661a) {
            case 0:
                w50 w50Var = (w50) obj;
                Boolean bool = this.f10662b;
                if (bool != null) {
                    w50Var.f11646a.putBoolean("hw_accel", bool.booleanValue());
                }
                break;
            default:
                Bundle bundle = ((w50) obj).f11646a;
                Boolean bool2 = this.f10662b;
                if (bool2 == null) {
                    bundle.putInt("lft", -1);
                } else if (!bool2.booleanValue()) {
                    bundle.putInt("lft", 0);
                } else {
                    bundle.putInt("lft", 1);
                }
                break;
        }
    }
}

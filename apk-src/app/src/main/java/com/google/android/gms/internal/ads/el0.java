package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class el0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4996b;

    public /* synthetic */ el0(boolean z5, int i) {
        this.f4995a = i;
        this.f4996b = z5;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f4995a) {
            case 0:
                ((w50) obj).f11646a.putString("adid_p", true != this.f4996b ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                break;
            case 1:
                ((w50) obj).f11646a.putBoolean("ibrr", this.f4996b);
                break;
            default:
                w50 w50Var = (w50) obj;
                if (this.f4996b) {
                    w50Var.f11646a.putBoolean("sdk_prefetch", true);
                }
                break;
        }
    }
}

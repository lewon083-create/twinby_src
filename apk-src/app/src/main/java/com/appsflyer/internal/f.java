package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2467d;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.f2465b = i;
        this.f2466c = obj;
        this.f2467d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2465b) {
            case 0:
                AFb1iSDK.getMonetizationNetwork((AFb1iSDK) this.f2466c, (AFh1qSDK) this.f2467d);
                break;
            case 1:
                ((AFa1ySDK) this.f2466c).getCurrencyIso4217Code((AFh1mSDK) this.f2467d);
                break;
            case 2:
                ((AFj1nSDK) this.f2466c).G_((SensorEvent) this.f2467d);
                break;
            case 3:
                AFj1rSDK.getRevenue((AFj1rSDK) this.f2466c, (Context) this.f2467d);
                break;
            case 4:
                ((AFj1wSDK) this.f2466c).getMediationNetwork((Context) this.f2467d);
                break;
            default:
                AFj1ySDK.getRevenue((AFj1ySDK) this.f2466c, (Context) this.f2467d);
                break;
        }
    }
}

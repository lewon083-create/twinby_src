package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class of implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qf f8683c;

    public /* synthetic */ of(qf qfVar, int i) {
        this.f8682b = i;
        this.f8683c = qfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8682b) {
            case 0:
                qf qfVar = this.f8683c;
                qfVar.getClass();
                try {
                    if (qfVar.f9480f == null && qfVar.f9481g) {
                        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(qfVar.f9475a);
                        advertisingIdClient.start();
                        qfVar.f9480f = advertisingIdClient;
                        break;
                    }
                } catch (IOException | ma.h | ma.i unused) {
                    qfVar.f9480f = null;
                    return;
                }
                break;
            default:
                al.a(this.f8683c.f9475a);
                break;
        }
    }
}

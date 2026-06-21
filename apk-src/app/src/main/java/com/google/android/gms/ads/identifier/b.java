package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f2530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CountDownLatch f2532d;

    public b(AdvertisingIdClient advertisingIdClient, long j10) {
        super("AdIdClientAutoDisconnectThread");
        this.f2530b = new WeakReference(advertisingIdClient);
        this.f2531c = j10;
        this.f2532d = new CountDownLatch(1);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.f2530b;
        try {
            if (this.f2532d.await(this.f2531c, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
            }
        }
    }
}

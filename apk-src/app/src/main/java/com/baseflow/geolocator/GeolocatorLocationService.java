package com.baseflow.geolocator;

import a1.e;
import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import e8.b;
import g8.c;
import g8.f;
import g8.h;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class GeolocatorLocationService extends Service {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f2483l = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f2490h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f2484b = new b(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2485c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2486d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2487e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Activity f2488f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f2489g = null;
    public PowerManager.WakeLock i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WifiManager.WifiLock f2491j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f2492k = null;

    public final void a(c cVar) {
        WifiManager wifiManager;
        PowerManager powerManager;
        b();
        if (cVar.f20010b && (powerManager = (PowerManager) getApplicationContext().getSystemService("power")) != null) {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "GeolocatorLocationService:Wakelock");
            this.i = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            this.i.acquire();
        }
        if (!cVar.f20009a || (wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi")) == null) {
            return;
        }
        WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(Build.VERSION.SDK_INT < 29 ? 3 : 4, "GeolocatorLocationService:WifiLock");
        this.f2491j = wifiLockCreateWifiLock;
        wifiLockCreateWifiLock.setReferenceCounted(false);
        this.f2491j.acquire();
    }

    public final void b() {
        PowerManager.WakeLock wakeLock = this.i;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.i.release();
            this.i = null;
        }
        WifiManager.WifiLock wifiLock = this.f2491j;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.f2491j.release();
        this.f2491j = null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Log.d("FlutterGeolocator", "Binding to location service.");
        return this.f2484b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.d("FlutterGeolocator", "Creating service.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        f fVar;
        Log.d("FlutterGeolocator", "Destroying location service.");
        this.f2487e--;
        Log.d("FlutterGeolocator", "Stopping location service.");
        h hVar = this.f2490h;
        if (hVar != null && (fVar = this.f2489g) != null) {
            ((CopyOnWriteArrayList) fVar.f20030c).remove(hVar);
            hVar.e();
        }
        if (this.f2485c) {
            Log.d("FlutterGeolocator", "Stop service in foreground.");
            stopForeground(1);
            b();
            this.f2485c = false;
            this.f2492k = null;
        }
        this.f2489g = null;
        this.f2492k = null;
        Log.d("FlutterGeolocator", "Destroyed location service.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        return 1;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        Log.d("FlutterGeolocator", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}

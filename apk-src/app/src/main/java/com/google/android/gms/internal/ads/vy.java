package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vy implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11530f;

    public /* synthetic */ vy(sn0 sn0Var, long j10, pn0 pn0Var, Bundle bundle) {
        this.f11526b = 1;
        this.f11528d = sn0Var;
        this.f11527c = j10;
        this.f11529e = pn0Var;
        this.f11530f = bundle;
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f11529e).f14766b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        try {
            if (((FirebaseMessaging) this.f11529e).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e3) {
            String message = e3.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e3.getMessage() != null) {
                    throw e3;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e3.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f11526b) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheComplete");
                map.put("src", (String) this.f11528d);
                map.put("cachedSrc", (String) this.f11529e);
                map.put("totalDuration", Long.toString(this.f11527c));
                ((xy) this.f11530f).n(map);
                return;
            case 1:
                sn0 sn0Var = (sn0) this.f11528d;
                long j10 = this.f11527c;
                pn0 pn0Var = (pn0) this.f11529e;
                Bundle bundle = (Bundle) this.f11530f;
                p9.k kVar = p9.k.C;
                kVar.f31304k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
                if (((Boolean) dm.f4602a.r()).booleanValue()) {
                    String canonicalName = pn0Var.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = "";
                    }
                    StringBuilder sb2 = new StringBuilder(canonicalName.length() + 25 + String.valueOf(jElapsedRealtime).length());
                    sb2.append("Signal runtime (ms) : ");
                    sb2.append(canonicalName);
                    sb2.append(" = ");
                    sb2.append(jElapsedRealtime);
                    t9.c0.m(sb2.toString());
                }
                wk wkVar = al.B2;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    if (((Boolean) sVar.f31970c.a(al.H2)).booleanValue()) {
                        synchronized (sn0Var) {
                            int iJ = pn0Var.j();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iJ).length() + 3);
                            sb3.append("sig");
                            sb3.append(iJ);
                            bundle.putLong(sb3.toString(), jElapsedRealtime);
                        }
                    }
                    break;
                }
                if (((Boolean) sVar.f31970c.a(al.f3296z2)).booleanValue()) {
                    zd1 zd1VarA = ((sd0) sn0Var.f10351g).a();
                    zd1VarA.v("action", "lat_ms");
                    zd1VarA.v("lat_grp", "sig_lat_grp");
                    zd1VarA.v("lat_id", String.valueOf(pn0Var.j()));
                    zd1VarA.v("clat_ms", String.valueOf(jElapsedRealtime));
                    if (((Boolean) sVar.f31970c.a(al.A2)).booleanValue()) {
                        synchronized (sn0Var) {
                            sn0Var.f10345a++;
                            break;
                        }
                        zd1 zd1Var = kVar.f31302h.f3942c.f4702d;
                        synchronized (zd1Var) {
                            str = (String) zd1Var.f12972d;
                        }
                        zd1VarA.v("seq_num", str);
                        synchronized (sn0Var) {
                            try {
                                if (sn0Var.f10345a == ((Set) sn0Var.f10348d).size() && sn0Var.f10346b != 0) {
                                    sn0Var.f10345a = 0;
                                    kVar.f31304k.getClass();
                                    String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - sn0Var.f10346b);
                                    if (pn0Var.j() <= 39 || pn0Var.j() >= 52) {
                                        zd1VarA.v("lat_clsg", strValueOf);
                                    } else {
                                        zd1VarA.v("lat_gmssg", strValueOf);
                                    }
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    ((sd0) zd1VarA.f12972d).f10245b.execute(new rd0(zd1VarA, 1));
                    return;
                }
                return;
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f11528d;
                com.google.firebase.messaging.y yVarG = com.google.firebase.messaging.y.g();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f11529e;
                if (yVarG.o(firebaseMessaging.f14766b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f14773j = true;
                        }
                        if (!firebaseMessaging.i.h()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.f14773j = false;
                            }
                            if (!com.google.firebase.messaging.y.g().o(firebaseMessaging.f14766b)) {
                                return;
                            }
                        } else if (!com.google.firebase.messaging.y.g().n(firebaseMessaging.f14766b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.f14773j = false;
                                }
                            } else {
                                firebaseMessaging.l(this.f11527c);
                            }
                            if (!com.google.firebase.messaging.y.g().o(firebaseMessaging.f14766b)) {
                                return;
                            }
                        } else {
                            com.google.firebase.messaging.a0 a0Var = new com.google.firebase.messaging.a0();
                            a0Var.f14791c = this;
                            a0Var.a();
                            if (!com.google.firebase.messaging.y.g().o(firebaseMessaging.f14766b)) {
                                return;
                            }
                        }
                    } catch (IOException e3) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e3.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f14773j = false;
                            if (!com.google.firebase.messaging.y.g().o(firebaseMessaging.f14766b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th2) {
                    if (com.google.firebase.messaging.y.g().o(firebaseMessaging.f14766b)) {
                        wakeLock.release();
                    }
                    throw th2;
                }
        }
    }

    public vy(xy xyVar, String str, String str2, long j10) {
        this.f11526b = 0;
        this.f11528d = str;
        this.f11529e = str2;
        this.f11527c = j10;
        this.f11530f = xyVar;
    }

    public vy(FirebaseMessaging firebaseMessaging, long j10) {
        this.f11526b = 2;
        this.f11530f = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d8.x("firebase-iid-executor", 2));
        this.f11529e = firebaseMessaging;
        this.f11527c = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f14766b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f11528d = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }
}

package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.gms.internal.ads.u0;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14822d;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.f14820b = i;
        this.f14821c = obj;
        this.f14822d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        ComponentName componentNameStartService;
        switch (this.f14820b) {
            case 0:
                Context context = (Context) this.f14821c;
                Intent intent = (Intent) this.f14822d;
                y yVarG = y.g();
                yVarG.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) yVarG.f14902e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (yVarG) {
                    try {
                        str = (String) yVarG.f14899b;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        yVarG.f14899b = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        yVarG.f14899b = serviceInfo.name;
                                    }
                                    str = (String) yVarG.f14899b;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (yVarG.o(context)) {
                        componentNameStartService = h0.c(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e3) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e3);
                    i = 402;
                } catch (SecurityException e7) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e7);
                    i = 401;
                }
                return Integer.valueOf(i);
            case 1:
                ge.e eVar = (ge.e) this.f14821c;
                u0 u0Var = (u0) this.f14822d;
                he.m mVar = eVar.f20130h;
                synchronized (mVar.f20548b) {
                    mVar.f20547a.edit().putLong("fetch_timeout_in_seconds", u0Var.f10771b).putLong("minimum_fetch_interval_in_seconds", u0Var.f10772c).commit();
                    break;
                }
                return null;
            case 2:
                ge.e eVar2 = (ge.e) this.f14821c;
                ge.c cVar = (ge.c) this.f14822d;
                he.m mVar2 = eVar2.f20130h;
                HashMap map = cVar.f20120a;
                synchronized (mVar2.f20551e) {
                    try {
                        HashMap mapB = mVar2.b();
                        boolean z5 = false;
                        for (Map.Entry entry : map.entrySet()) {
                            String str3 = (String) entry.getKey();
                            String str4 = (String) entry.getValue();
                            if (str3.length() <= 250 && (str4 == null || str4.length() <= 500)) {
                                boolean z10 = true;
                                if (str4 != null) {
                                    z5 |= !Objects.equals(mapB.put(str3, str4), str4);
                                } else {
                                    if (mapB.remove(str3) == null) {
                                        z10 = false;
                                    }
                                    z5 |= z10;
                                }
                            }
                            Log.w("FirebaseRemoteConfig", String.format("Invalid custom signal: Custom signal keys must be %d characters or less, and values must be %d characters or less.", 250, 500));
                            return null;
                        }
                        if (!z5) {
                            return null;
                        }
                        if (mapB.size() > 100) {
                            Log.w("FirebaseRemoteConfig", String.format("Invalid custom signal: Too many custom signals provided. The maximum allowed is %d.", 100));
                            return null;
                        }
                        mVar2.f20547a.edit().putString("customSignals", new JSONObject(mapB).toString()).commit();
                        Log.d("FirebaseRemoteConfig", "Keys of updated custom signals: " + mVar2.b().keySet());
                        return null;
                    } finally {
                    }
                }
            default:
                he.c cVar2 = (he.c) this.f14821c;
                he.d dVar = (he.d) this.f14822d;
                he.n nVar = cVar2.f20492b;
                synchronized (nVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = nVar.f20553a.openFileOutput(nVar.f20554b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(dVar.f20495a.toString().getBytes("UTF-8"));
                    } finally {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
                return null;
        }
    }
}

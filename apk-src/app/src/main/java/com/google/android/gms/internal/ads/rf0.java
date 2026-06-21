package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f9930b;

    public rf0(Context context) {
        this.f9929a = context;
    }

    public final void a(gk0 gk0Var) {
        ServiceInfo serviceInfo;
        g gVar = this.f9930b;
        Context context = (Context) gVar.f5553c;
        if (gVar.a()) {
            rs.f("Service connection is valid. No need to re-initialize.");
            gk0Var.e(0);
            return;
        }
        int i = gVar.f5552b;
        if (i == 1) {
            rs.m("Client is already in the process of connecting to the service.");
            gk0Var.e(3);
            return;
        }
        if (i == 3) {
            rs.m("Client was already closed and can't be reused. Please create another instance.");
            gk0Var.e(3);
            return;
        }
        rs.f("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            gVar.f5552b = 0;
            rs.f("Install Referrer service unavailable on device.");
            gk0Var.e(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    z9 z9Var = new z9(gVar, gk0Var);
                    gVar.f5556f = z9Var;
                    try {
                        if (context.bindService(intent2, z9Var, 1)) {
                            rs.f("Service was bonded successfully.");
                            return;
                        }
                        rs.m("Connection to service is blocked.");
                        gVar.f5552b = 0;
                        gk0Var.e(1);
                        return;
                    } catch (SecurityException unused) {
                        rs.m("No permission to connect to service.");
                        gVar.f5552b = 0;
                        gk0Var.e(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        rs.m("Play Store missing or incompatible. Version 8.3.73 or later required.");
        gVar.f5552b = 0;
        gk0Var.e(2);
    }
}

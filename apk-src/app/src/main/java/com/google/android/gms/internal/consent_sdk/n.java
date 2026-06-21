package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.gms.internal.ads.f00;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements yc.g, h7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13493c;

    public /* synthetic */ n(Object obj, Object obj2) {
        this.f13492b = obj;
        this.f13493c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public c a(Activity activity, yc.d dVar) throws n1 {
        Bundle bundle;
        String string;
        List list;
        PackageInfo packageInfo;
        Application application = (Application) this.f13492b;
        f00 f00VarE = dVar.f45611b;
        if (f00VarE == null) {
            f00VarE = new ad.m0(application).e();
        }
        c cVar = new c();
        cVar.f13341e = Collections.EMPTY_MAP;
        cVar.i = Collections.EMPTY_LIST;
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new n1(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        cVar.f13337a = string;
        if (f00VarE.f5159b) {
            ArrayList arrayList = new ArrayList();
            int i = f00VarE.f5160c;
            if (i == 1) {
                arrayList.add(v.f13592b);
            } else if (i == 2) {
                arrayList.add(v.f13595e);
            } else if (i == 3) {
                arrayList.add(v.f13593c);
            } else if (i == 4) {
                arrayList.add(v.f13594d);
            }
            arrayList.add(v.f13596f);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        cVar.i = list;
        cVar.f13341e = ((g) this.f13493c).a();
        cVar.f13340d = Boolean.valueOf(dVar.f45610a);
        cVar.f13339c = Locale.getDefault().toLanguageTag();
        ad.m0 m0Var = new ad.m0(2, (byte) 0);
        m0Var.f839c = 1;
        int i10 = Build.VERSION.SDK_INT;
        m0Var.f841e = Integer.valueOf(i10);
        m0Var.f840d = Build.MODEL;
        m0Var.f839c = 2;
        cVar.f13338b = m0Var;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
        Object arrayList2 = Collections.EMPTY_LIST;
        yVar.f14902e = arrayList2;
        yVar.f14899b = Integer.valueOf(configuration.screenWidthDp);
        yVar.f14900c = Integer.valueOf(configuration.screenHeightDp);
        yVar.f14901d = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i10 >= 28) {
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        w wVar = new w();
                        wVar.f13600b = Integer.valueOf(rect.left);
                        wVar.f13601c = Integer.valueOf(rect.right);
                        wVar.f13599a = Integer.valueOf(rect.top);
                        wVar.f13602d = Integer.valueOf(rect.bottom);
                        arrayList2.add(wVar);
                    }
                }
            }
        }
        yVar.f14902e = arrayList2;
        cVar.f13342f = yVar;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        u uVar = new u();
        uVar.f13555a = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        uVar.f13556b = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            uVar.f13557c = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        cVar.f13343g = uVar;
        cVar.f13344h = new m4(23);
        return cVar;
    }

    @Override // yc.g
    public void f(k kVar) {
        kVar.a((Activity) this.f13492b, (vi.d) this.f13493c);
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    public Object j() {
        s sVar = (s) ((g7) this.f13492b).j();
        Handler handler = f0.f13385a;
        h0.c(handler);
        return new r(sVar, handler, ((t.x1) this.f13493c).j());
    }
}

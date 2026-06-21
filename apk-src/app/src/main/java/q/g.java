package q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.messaging.y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.d f31543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f31544b;

    public g(b.d dVar, ComponentName componentName) {
        this.f31543a = dVar;
        this.f31544b = componentName;
    }

    public static void a(Context context, String str, h hVar) {
        hVar.f31545b = context.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        context.bindService(intent, hVar, 33);
    }

    public static String b(Context context, List list) {
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final y c(a aVar) {
        b.d dVar = this.f31543a;
        f fVar = new f(aVar);
        try {
            if (!((b.b) dVar).c0(fVar)) {
                return null;
            }
            y yVar = new y();
            yVar.f14899b = new Object();
            yVar.f14900c = dVar;
            yVar.f14901d = fVar;
            yVar.f14902e = this.f31544b;
            return yVar;
        } catch (RemoteException unused) {
            return null;
        }
    }
}

package io.flutter.plugins.firebase.messaging;

import a0.e;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import androidx.lifecycle.d0;
import com.google.firebase.messaging.x;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.ProfilingTraceData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ni.i;
import org.json.JSONObject;
import ri.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f25771a = new HashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        boolean z5;
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (a.a.f10b == null) {
            Context applicationContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
            Log.d("FLTFireContextHolder", "received application context.");
            a.a.f10b = applicationContext;
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        x xVar = new x(intent.getExtras());
        if (xVar.f() != null) {
            f25771a.put(xVar.e(), xVar);
            i iVarR = i.r();
            iVarR.getClass();
            iVarR.s().edit().putString(xVar.e(), new JSONObject(e.n(xVar)).toString()).apply();
            StringBuilder sbJ = pe.a.j(iVarR.s().getString("notification_ids", ""));
            sbJ.append(xVar.e());
            sbJ.append(StringUtils.COMMA);
            String string = sbJ.toString();
            ArrayList arrayList = new ArrayList(Arrays.asList(string.split(StringUtils.COMMA)));
            if (arrayList.size() > 100) {
                String str = (String) arrayList.get(0);
                iVarR.s().edit().remove(str).apply();
                string = string.replace(str + StringUtils.COMMA, "");
            }
            iVarR.s().edit().putString("notification_ids", string).apply();
        }
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if ((keyguardManager == null || !keyguardManager.isKeyguardLocked()) && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                    if (d0.f1548l == null) {
                        d0.f1548l = new d0();
                    }
                    d0.f1548l.i(xVar);
                    return;
                }
            }
        }
        Intent intent2 = new Intent(context, (Class<?>) FlutterFirebaseMessagingBackgroundService.class);
        Parcel parcelObtain = Parcel.obtain();
        xVar.writeToParcel(parcelObtain, 0);
        intent2.putExtra("notification", parcelObtain.marshall());
        Bundle bundle = xVar.f14895b;
        String string2 = bundle.getString("google.original_priority");
        if (string2 == null) {
            string2 = bundle.getString("google.priority");
        }
        if ("high".equals(string2)) {
            z5 = true;
        } else {
            ProfilingTraceData.TRUNCATION_REASON_NORMAL.equals(string2);
            z5 = false;
        }
        List list = FlutterFirebaseMessagingBackgroundService.i;
        ComponentName componentName = new ComponentName(context, (Class<?>) FlutterFirebaseMessagingBackgroundService.class);
        synchronized (a.f25772g) {
            m mVarB = a.b(context, componentName, true, 2020, z5);
            mVarB.b(2020);
            try {
                mVarB.a(intent2);
            } catch (IllegalStateException e3) {
                if (!z5) {
                    throw e3;
                }
                a.b(context, componentName, true, 2020, false).a(intent2);
            }
        }
    }
}

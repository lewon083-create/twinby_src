package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f14257a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            g(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            f(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        g(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static void b(Bundle bundle, String str, long j10) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j10);
    }

    public static Bundle c(boolean z5, boolean z10, boolean z11, String str, long j10) {
        Bundle bundle = new Bundle();
        b(bundle, str, j10);
        if (z5) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z10 && z11) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static d8.j d(Intent intent, String str) {
        if (intent != null) {
            d8.i iVarA = d8.j.a();
            iVarA.f15634b = a(intent.getExtras(), str);
            iVarA.f15635c = e(intent.getExtras(), str);
            return iVarA.a();
        }
        g("BillingHelper", "Got null intent!");
        d8.i iVarA2 = d8.j.a();
        iVarA2.f15634b = 6;
        iVarA2.f15635c = "An internal error occurred.";
        return iVarA2.a();
    }

    public static String e(Bundle bundle, String str) {
        if (bundle == null) {
            g(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            f(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        g(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static void f(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i -= iMin;
            }
        }
    }

    public static void g(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void h(String str, String str2, Throwable th2) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th2 == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Bundle i(d8.j jVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", jVar.f15636a);
        bundle.putString("DEBUG_MESSAGE", jVar.f15637b);
        bundle.putInt("LOG_REASON", i - 1);
        return bundle;
    }

    public static Purchase j(String str, String str2) {
        if (str == null || str2 == null) {
            f("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e3) {
            g("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e3.toString()));
            return null;
        }
    }
}

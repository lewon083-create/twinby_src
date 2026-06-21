package io.appmetrica.analytics.logger.common.impl;

import android.util.Log;
import com.google.android.gms.internal.ads.om1;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static String a(String str, String str2, Object... objArr) {
        StringBuilder sbK = pe.a.k(str, " ");
        if (str2 == null) {
            str2 = "";
        } else if (objArr != null && objArr.length != 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (Throwable th2) {
                StringBuilder sbP = om1.p("Attention!!! Invalid log format. See exception details above. Message: ", str2, "; arguments: ");
                sbP.append(Arrays.toString(objArr));
                str2 = sbP.toString();
                Log.e("[LogMessageConstructor]", str2, th2);
            }
        }
        Locale locale = Locale.US;
        sbK.append("[" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + "] " + str2);
        return sbK.toString();
    }
}

package yads;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o82 {
    public static void a(Context context, r82 r82Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            n82 n82Var = new n82(r82Var);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), n82Var);
            telephonyManager.unregisterTelephonyCallback(n82Var);
        } catch (RuntimeException unused) {
            r82Var.a(5);
        }
    }
}

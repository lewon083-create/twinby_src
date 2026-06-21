package yads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import io.sentry.SentryBaseEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ry2 {
    public static SharedPreferences a(ry2 ry2Var, Context context, String str) {
        Object objS;
        ry2Var.getClass();
        try {
            ij.k kVar = ij.m.f21341c;
            Object systemService = context.getSystemService(SentryBaseEvent.JsonKeys.USER);
            Intrinsics.c(systemService, "null cannot be cast to non-null type android.os.UserManager");
            objS = Boolean.valueOf(((UserManager) systemService).isUserUnlocked());
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        Object obj = Boolean.TRUE;
        if (objS instanceof ij.l) {
            objS = obj;
        }
        return !((Boolean) objS).booleanValue() ? context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0) : context.getSharedPreferences(str, 0);
    }
}

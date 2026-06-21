package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import com.google.android.gms.internal.measurement.h5;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFj1hSDK implements AFj1iSDK {
    @Override // com.appsflyer.internal.AFj1iSDK
    public final String getMediationNetwork() {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.c(obj, "");
            objS = (String) obj;
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = h5.s(th2);
        }
        return (String) (objS instanceof ij.l ? "" : objS);
    }
}

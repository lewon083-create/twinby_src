package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ll, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0318ll implements FunctionWithThrowable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0343ml f24317a;

    public C0318ll(C0343ml c0343ml) {
        this.f24317a = c0343ml;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* JADX INFO: renamed from: apply */
    public final Object mo625apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C0343ml c0343ml = this.f24317a;
        if (c0343ml.f24381b.hasPermission(c0343ml.f24380a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}

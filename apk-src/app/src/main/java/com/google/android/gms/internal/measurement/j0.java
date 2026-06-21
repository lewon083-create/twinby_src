package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface j0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(l0 l0Var);

    void getAppInstanceId(l0 l0Var);

    void getCachedAppInstanceId(l0 l0Var);

    void getConditionalUserProperties(String str, String str2, l0 l0Var);

    void getCurrentScreenClass(l0 l0Var);

    void getCurrentScreenName(l0 l0Var);

    void getGmpAppId(l0 l0Var);

    void getMaxUserProperties(String str, l0 l0Var);

    void getSessionId(l0 l0Var);

    void getTestFlag(l0 l0Var, int i);

    void getUserProperties(String str, String str2, boolean z5, l0 l0Var);

    void initForTests(Map map);

    void initialize(xa.a aVar, t0 t0Var, long j10);

    void isDataCollectionEnabled(l0 l0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z5, boolean z10, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, l0 l0Var, long j10);

    void logHealthData(int i, String str, xa.a aVar, xa.a aVar2, xa.a aVar3);

    void onActivityCreated(xa.a aVar, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(v0 v0Var, Bundle bundle, long j10);

    void onActivityDestroyed(xa.a aVar, long j10);

    void onActivityDestroyedByScionActivityInfo(v0 v0Var, long j10);

    void onActivityPaused(xa.a aVar, long j10);

    void onActivityPausedByScionActivityInfo(v0 v0Var, long j10);

    void onActivityResumed(xa.a aVar, long j10);

    void onActivityResumedByScionActivityInfo(v0 v0Var, long j10);

    void onActivitySaveInstanceState(xa.a aVar, l0 l0Var, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(v0 v0Var, l0 l0Var, long j10);

    void onActivityStarted(xa.a aVar, long j10);

    void onActivityStartedByScionActivityInfo(v0 v0Var, long j10);

    void onActivityStopped(xa.a aVar, long j10);

    void onActivityStoppedByScionActivityInfo(v0 v0Var, long j10);

    void performAction(Bundle bundle, l0 l0Var, long j10);

    void registerOnMeasurementEventListener(q0 q0Var);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(n0 n0Var);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(xa.a aVar, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(v0 v0Var, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z5);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(q0 q0Var);

    void setInstanceIdProvider(s0 s0Var);

    void setMeasurementEnabled(boolean z5, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, xa.a aVar, boolean z5, long j10);

    void unregisterOnMeasurementEventListener(q0 q0Var);
}

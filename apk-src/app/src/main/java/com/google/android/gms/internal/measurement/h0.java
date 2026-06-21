package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends cb.a implements j0 {
    @Override // com.google.android.gms.internal.measurement.j0
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeLong(j10);
        T0(parcelD0, 23);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        y.b(parcelD0, bundle);
        T0(parcelD0, 9);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void endAdUnitExposure(String str, long j10) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeLong(j10);
        T0(parcelD0, 24);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void generateEventId(l0 l0Var) {
        Parcel parcelD0 = D0();
        y.c(parcelD0, l0Var);
        T0(parcelD0, 22);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getAppInstanceId(l0 l0Var) {
        Parcel parcelD0 = D0();
        y.c(parcelD0, l0Var);
        T0(parcelD0, 20);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getCachedAppInstanceId(l0 l0Var) {
        Parcel parcelD0 = D0();
        y.c(parcelD0, l0Var);
        T0(parcelD0, 19);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getConditionalUserProperties(String str, String str2, l0 l0Var) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        y.c(parcelD0, l0Var);
        T0(parcelD0, 10);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getCurrentScreenClass(l0 l0Var) {
        Parcel parcelD0 = D0();
        y.c(parcelD0, l0Var);
        T0(parcelD0, 17);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getCurrentScreenName(l0 l0Var) {
        Parcel parcelD0 = D0();
        y.c(parcelD0, l0Var);
        T0(parcelD0, 16);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getGmpAppId(l0 l0Var) {
        Parcel parcelD0 = D0();
        y.c(parcelD0, l0Var);
        T0(parcelD0, 21);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getMaxUserProperties(String str, l0 l0Var) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        y.c(parcelD0, l0Var);
        T0(parcelD0, 6);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getSessionId(l0 l0Var) {
        Parcel parcelD0 = D0();
        y.c(parcelD0, l0Var);
        T0(parcelD0, 46);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void getUserProperties(String str, String str2, boolean z5, l0 l0Var) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        ClassLoader classLoader = y.f14090a;
        parcelD0.writeInt(z5 ? 1 : 0);
        y.c(parcelD0, l0Var);
        T0(parcelD0, 5);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void initialize(xa.a aVar, t0 t0Var, long j10) {
        Parcel parcelD0 = D0();
        y.c(parcelD0, aVar);
        y.b(parcelD0, t0Var);
        parcelD0.writeLong(j10);
        T0(parcelD0, 1);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z5, boolean z10, long j10) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        y.b(parcelD0, bundle);
        parcelD0.writeInt(z5 ? 1 : 0);
        parcelD0.writeInt(1);
        parcelD0.writeLong(j10);
        T0(parcelD0, 2);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void logHealthData(int i, String str, xa.a aVar, xa.a aVar2, xa.a aVar3) {
        Parcel parcelD0 = D0();
        parcelD0.writeInt(5);
        parcelD0.writeString(str);
        y.c(parcelD0, aVar);
        y.c(parcelD0, aVar2);
        y.c(parcelD0, aVar3);
        T0(parcelD0, 33);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivityCreatedByScionActivityInfo(v0 v0Var, Bundle bundle, long j10) {
        Parcel parcelD0 = D0();
        y.b(parcelD0, v0Var);
        y.b(parcelD0, bundle);
        parcelD0.writeLong(j10);
        T0(parcelD0, 53);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivityDestroyedByScionActivityInfo(v0 v0Var, long j10) {
        Parcel parcelD0 = D0();
        y.b(parcelD0, v0Var);
        parcelD0.writeLong(j10);
        T0(parcelD0, 54);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivityPausedByScionActivityInfo(v0 v0Var, long j10) {
        Parcel parcelD0 = D0();
        y.b(parcelD0, v0Var);
        parcelD0.writeLong(j10);
        T0(parcelD0, 55);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivityResumedByScionActivityInfo(v0 v0Var, long j10) {
        Parcel parcelD0 = D0();
        y.b(parcelD0, v0Var);
        parcelD0.writeLong(j10);
        T0(parcelD0, 56);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivitySaveInstanceStateByScionActivityInfo(v0 v0Var, l0 l0Var, long j10) {
        Parcel parcelD0 = D0();
        y.b(parcelD0, v0Var);
        y.c(parcelD0, l0Var);
        parcelD0.writeLong(j10);
        T0(parcelD0, 57);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivityStartedByScionActivityInfo(v0 v0Var, long j10) {
        Parcel parcelD0 = D0();
        y.b(parcelD0, v0Var);
        parcelD0.writeLong(j10);
        T0(parcelD0, 51);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void onActivityStoppedByScionActivityInfo(v0 v0Var, long j10) {
        Parcel parcelD0 = D0();
        y.b(parcelD0, v0Var);
        parcelD0.writeLong(j10);
        T0(parcelD0, 52);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void resetAnalyticsData(long j10) {
        Parcel parcelD0 = D0();
        parcelD0.writeLong(j10);
        T0(parcelD0, 12);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void retrieveAndUploadBatches(n0 n0Var) {
        Parcel parcelD0 = D0();
        y.c(parcelD0, n0Var);
        T0(parcelD0, 58);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel parcelD0 = D0();
        y.b(parcelD0, bundle);
        parcelD0.writeLong(j10);
        T0(parcelD0, 8);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel parcelD0 = D0();
        y.b(parcelD0, bundle);
        parcelD0.writeLong(j10);
        T0(parcelD0, 45);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setCurrentScreenByScionActivityInfo(v0 v0Var, String str, String str2, long j10) {
        Parcel parcelD0 = D0();
        y.b(parcelD0, v0Var);
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        parcelD0.writeLong(j10);
        T0(parcelD0, 50);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setDataCollectionEnabled(boolean z5) {
        Parcel parcelD0 = D0();
        ClassLoader classLoader = y.f14090a;
        parcelD0.writeInt(z5 ? 1 : 0);
        T0(parcelD0, 39);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelD0 = D0();
        y.b(parcelD0, bundle);
        T0(parcelD0, 42);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setMeasurementEnabled(boolean z5, long j10) {
        Parcel parcelD0 = D0();
        ClassLoader classLoader = y.f14090a;
        parcelD0.writeInt(z5 ? 1 : 0);
        parcelD0.writeLong(j10);
        T0(parcelD0, 11);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setSessionTimeoutDuration(long j10) {
        Parcel parcelD0 = D0();
        parcelD0.writeLong(j10);
        T0(parcelD0, 14);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setUserId(String str, long j10) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeLong(j10);
        T0(parcelD0, 7);
    }

    @Override // com.google.android.gms.internal.measurement.j0
    public final void setUserProperty(String str, String str2, xa.a aVar, boolean z5, long j10) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        y.c(parcelD0, aVar);
        parcelD0.writeInt(z5 ? 1 : 0);
        parcelD0.writeLong(j10);
        T0(parcelD0, 4);
    }
}

package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1aSDK;
import com.google.android.gms.internal.measurement.h5;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
final class AFb1iSDK implements Application.ActivityLifecycleCallbacks {
    private final AFi1oSDK AFAdRevenueData;
    private final Runnable areAllFieldsValid;
    private ScheduledFuture<?> component4;
    private final ScheduledExecutorService getCurrencyIso4217Code;
    private volatile boolean getMediationNetwork;
    private final AFa1mSDK getMonetizationNetwork;
    final AFb1aSDK.AFa1tSDK getRevenue;

    public AFb1iSDK(ScheduledExecutorService scheduledExecutorService, AFa1mSDK aFa1mSDK, AFi1oSDK aFi1oSDK, AFb1aSDK.AFa1tSDK aFa1tSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        Intrinsics.checkNotNullParameter(aFi1oSDK, "");
        Intrinsics.checkNotNullParameter(aFa1tSDK, "");
        this.getCurrencyIso4217Code = scheduledExecutorService;
        this.getMonetizationNetwork = aFa1mSDK;
        this.AFAdRevenueData = aFi1oSDK;
        this.getRevenue = aFa1tSDK;
        this.areAllFieldsValid = new e(0, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFb1iSDK aFb1iSDK) {
        Object objS;
        Intrinsics.checkNotNullParameter(aFb1iSDK, "");
        aFb1iSDK.getMediationNetwork = false;
        try {
            ij.k kVar = ij.m.f21341c;
            aFb1iSDK.getRevenue.getMediationNetwork();
            objS = Unit.f27471a;
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = h5.s(th2);
        }
        Throwable thA = ij.m.a(objS);
        if (thA != null) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", thA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1iSDK aFb1iSDK, AFh1qSDK aFh1qSDK) {
        Object objS;
        Intrinsics.checkNotNullParameter(aFb1iSDK, "");
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        try {
            ij.k kVar = ij.m.f21341c;
            aFb1iSDK.getRevenue.getRevenue(aFh1qSDK);
            objS = Unit.f27471a;
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = h5.s(th2);
        }
        Throwable thA = ij.m.a(objS);
        if (thA != null) {
            AFLogger.afErrorLog("Listener thrown an exception: ", thA, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFa1mSDK aFa1mSDK = this.getMonetizationNetwork;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1mSDK.AFAdRevenueData) {
            aFa1mSDK.AFAdRevenueData = intent;
        }
        this.AFAdRevenueData.getMonetizationNetwork(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.getMediationNetwork) {
            ScheduledExecutorService scheduledExecutorService = this.getCurrencyIso4217Code;
            Runnable runnable = this.areAllFieldsValid;
            AFb1aSDK.AFa1zSDK aFa1zSDK = AFb1aSDK.AFa1zSDK;
            this.component4 = scheduledExecutorService.schedule(runnable, AFb1aSDK.AFa1zSDK.getMediationNetwork(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!this.getMediationNetwork) {
            this.getMediationNetwork = true;
            this.getCurrencyIso4217Code.execute(new f(0, this, new AFh1qSDK(activity, this.AFAdRevenueData)));
        } else {
            ScheduledFuture<?> scheduledFuture = this.component4;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}

package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f13405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f13406c;

    public i(k kVar, Activity activity) {
        Objects.requireNonNull(kVar);
        this.f13406c = kVar;
        this.f13405b = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        k kVar = this.f13406c;
        Dialog dialog = kVar.f13436g;
        AtomicReference atomicReference = kVar.f13440l;
        if (dialog == null || !kVar.f13441m) {
            return;
        }
        dialog.setOwnerActivity(activity);
        s sVar = kVar.f13431b;
        if (sVar != null) {
            sVar.f13545a = activity;
        }
        i iVar = (i) atomicReference.getAndSet(null);
        if (iVar != null) {
            iVar.f13406c.f13430a.unregisterActivityLifecycleCallbacks(iVar);
            i iVar2 = new i(kVar, activity);
            kVar.f13430a.registerActivityLifecycleCallbacks(iVar2);
            atomicReference.set(iVar2);
        }
        Dialog dialog2 = kVar.f13436g;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.f13405b) {
            return;
        }
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        k kVar = this.f13406c;
        if (zIsChangingConfigurations && kVar.f13441m && (dialog = kVar.f13436g) != null) {
            dialog.dismiss();
            return;
        }
        n1 n1Var = new n1(3, "Activity is destroyed.");
        Dialog dialog2 = kVar.f13436g;
        if (dialog2 != null) {
            dialog2.dismiss();
            kVar.f13436g = null;
        }
        kVar.f13431b.f13545a = null;
        i iVar = (i) kVar.f13440l.getAndSet(null);
        if (iVar != null) {
            iVar.f13406c.f13430a.unregisterActivityLifecycleCallbacks(iVar);
        }
        yc.a aVar = (yc.a) kVar.f13439k.getAndSet(null);
        if (aVar == null) {
            return;
        }
        kVar.d(n1Var);
        aVar.a(n1Var.a());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

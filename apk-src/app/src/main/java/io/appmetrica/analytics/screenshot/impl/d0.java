package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f25472a;

    public d0(g0 g0Var) {
        this.f25472a = g0Var;
    }

    public static final Boolean a(g0 g0Var, d0 d0Var, C0683n c0683n, ActivityManager activityManager) {
        Object next;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        if (runningServices == null) {
            runningServices = kotlin.collections.b0.f27475b;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        Iterator<T> it = runningServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.a(((ActivityManager.RunningServiceInfo) next).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) next) != null) {
            ((C0692x) g0Var.f25477b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(g0Var.f25478c.postDelayed(d0Var, TimeUnit.SECONDS.toMillis(c0683n.f25503b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0683n c0683n = this.f25472a.f25480e;
        if (this.f25472a.f25479d || c0683n == null || !c0683n.f25502a) {
            return;
        }
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f25472a.f25476a.getContext(), "activity", "running service screenshot captor", "ActivityManager", new com.google.firebase.messaging.o(this.f25472a, this, c0683n, 15));
    }
}

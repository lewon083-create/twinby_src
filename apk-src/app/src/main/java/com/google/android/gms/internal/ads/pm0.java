package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pm0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cloneable f9108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9109d;

    public /* synthetic */ pm0(Object obj, Object obj2, Cloneable cloneable, int i) {
        this.f9106a = i;
        this.f9107b = obj;
        this.f9109d = obj2;
        this.f9108c = cloneable;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        switch (this.f9106a) {
            case 0:
                Bundle bundle = ((w50) obj).f11646a;
                bundle.putString("consent_string", (String) this.f9107b);
                bundle.putString("fc_consent", (String) this.f9109d);
                Bundle bundle2 = (Bundle) this.f9108c;
                if (bundle2 != null) {
                    bundle.putBundle("iab_consent_info", bundle2);
                }
                break;
            case 1:
                Bundle bundle3 = ((w50) obj).f11646a;
                bundle3.putString("rtb", (String) this.f9107b);
                if (((Boolean) q9.s.f31967e.f31970c.a(al.T4)).booleanValue()) {
                    String str = (String) this.f9109d;
                    if (!str.isEmpty()) {
                        bundle3.putString("cld_status", str);
                    }
                }
                Bundle bundle4 = (Bundle) this.f9108c;
                if (!bundle4.isEmpty()) {
                    bundle3.putBundle("adapter_initialization_status", bundle4);
                }
                break;
            default:
                w50 w50Var = (w50) obj;
                if (((Boolean) em.f5001a.r()).booleanValue()) {
                    Bundle bundle5 = new Bundle();
                    t9.g0 g0Var = p9.k.C.f31297c;
                    String className = null;
                    try {
                        ActivityManager activityManager = (ActivityManager) ((Context) this.f9107b).getSystemService("activity");
                        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                            className = runningTaskInfo.topActivity.getClassName();
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    bundle5.putString("activity", className);
                    Bundle bundle6 = new Bundle();
                    q9.g3 g3Var = (q9.g3) this.f9109d;
                    bundle6.putInt("width", g3Var.f31879f);
                    bundle6.putInt("height", g3Var.f31876c);
                    bundle5.putBundle(RRWebVideoEvent.JsonKeys.SIZE, bundle6);
                    ArrayList arrayList = (ArrayList) this.f9108c;
                    if (!arrayList.isEmpty()) {
                        bundle5.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
                    }
                    w50Var.f11646a.putBundle("view_hierarchy", bundle5);
                    break;
                }
                break;
        }
    }

    public pm0(String str, String str2, Bundle bundle) {
        this.f9106a = 1;
        this.f9107b = str;
        this.f9108c = bundle;
        this.f9109d = str2;
    }
}

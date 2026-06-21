package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0289kh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q5 f24246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f24247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0045b4 f24248d;

    public RunnableC0289kh(Context context, Q5 q5, Bundle bundle, C0045b4 c0045b4) {
        this.f24245a = context;
        this.f24246b = q5;
        this.f24247c = bundle;
        this.f24248d = c0045b4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            I3 i3A = I3.a(this.f24245a, this.f24247c);
            if (i3A == null) {
                return;
            }
            Q3 q3A = Q3.a(i3A);
            C0112dj c0112djV = C0382oa.I.v();
            c0112djV.a(i3A.f22439b.getAppVersion(), i3A.f22439b.getAppBuildNumber());
            c0112djV.a(i3A.f22439b.getDeviceType());
            C0426q4 c0426q4 = new C0426q4(new Yl(i3A), new C0401p4(i3A.f22439b, AbstractC0207hb.c(i3A.f22438a.f22072a.getAsString("PROCESS_CFG_CLIDS"))), i3A.f22438a.f22073b);
            this.f24248d.a(q3A, c0426q4).a(this.f24246b, c0426q4);
        } catch (Throwable th2) {
            Pj pj2 = AbstractC0366nj.f24449a;
            String str = "Exception during processing event with type: " + this.f24246b.f22863d + " (" + this.f24246b.f22864e + "): " + th2.getMessage();
            pj2.getClass();
            pj2.a(new C0391oj(str, th2));
        }
    }
}

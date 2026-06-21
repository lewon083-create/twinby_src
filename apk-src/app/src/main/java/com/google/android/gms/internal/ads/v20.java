package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v20 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w20 f11214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Throwable f11215d;

    public /* synthetic */ v20(w20 w20Var, Throwable th2, int i) {
        this.f11213b = i;
        this.f11214c = w20Var;
        this.f11215d = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11213b) {
            case 0:
                Context context = this.f11214c.f11596a;
                boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.Ab)).booleanValue();
                Throwable th2 = this.f11215d;
                if (!zBooleanValue) {
                    xt.a(context).c("AttributionReportingSampled", th2);
                } else {
                    xt.e(context).c("AttributionReporting", th2);
                }
                break;
            default:
                Context context2 = this.f11214c.f11596a;
                boolean zBooleanValue2 = ((Boolean) q9.s.f31967e.f31970c.a(al.Ab)).booleanValue();
                Throwable th3 = this.f11215d;
                if (!zBooleanValue2) {
                    xt.a(context2).c("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th3);
                } else {
                    xt.e(context2).c("AttributionReporting.getUpdatedUrlAndRegisterSource", th3);
                }
                break;
        }
    }
}

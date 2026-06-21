package io.sentry.android.core;

import android.content.res.Configuration;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.m1;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yads.fj3;
import yads.mr0;
import yads.su1;
import yads.tu1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25936e;

    public /* synthetic */ n(long j10, su1 su1Var, tu1 tu1Var) {
        this.f25933b = 5;
        this.f25934c = j10;
        this.f25935d = su1Var;
        this.f25936e = tu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25933b;
        Object obj = this.f25936e;
        Object obj2 = this.f25935d;
        long j10 = this.f25934c;
        switch (i) {
            case 0:
                ((AppComponentsBreadcrumbsIntegration) obj2).lambda$onConfigurationChanged$0(j10, (Configuration) obj);
                return;
            case 1:
                BufferCaptureStrategy.onScreenshotRecorded$lambda$2((BufferCaptureStrategy) obj2, (Function2) obj, j10);
                return;
            case 2:
                s3.t tVar = ((o4.v) obj2).f29701b;
                String str = m3.z.f28608a;
                s3.y yVar = tVar.f32648b;
                t3.d dVar = yVar.f32714t;
                t3.a aVarY = dVar.y();
                dVar.z(aVarY, 26, new md.a(aVarY, obj, j10));
                if (yVar.T == obj) {
                    yVar.f32708n.e(26, new qg.a(12));
                    return;
                }
                return;
            case 3:
                sb.g gVar = (sb.g) obj;
                try {
                    FirebaseAnalytics firebaseAnalytics = ((oi.j) obj2).f30690b;
                    if (firebaseAnalytics == null) {
                        Intrinsics.g("analytics");
                        throw null;
                    }
                    m1 m1Var = firebaseAnalytics.f14753a;
                    m1Var.getClass();
                    m1Var.c(new c1(m1Var, j10));
                    gVar.b(null);
                    return;
                } catch (Exception e3) {
                    gVar.a(e3);
                    return;
                }
            case 4:
                ((fj3) obj2).a(obj, j10);
                return;
            default:
                mr0.a(j10, (Function0) obj2, (Function0) obj);
                return;
        }
    }

    public /* synthetic */ n(Object obj, long j10, Object obj2, int i) {
        this.f25933b = i;
        this.f25935d = obj;
        this.f25934c = j10;
        this.f25936e = obj2;
    }

    public /* synthetic */ n(Object obj, Object obj2, long j10, int i) {
        this.f25933b = i;
        this.f25935d = obj;
        this.f25936e = obj2;
        this.f25934c = j10;
    }
}

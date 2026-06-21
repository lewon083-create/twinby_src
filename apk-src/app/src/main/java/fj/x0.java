package fj;

import a0.o2;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import g0.s2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19456f;

    public /* synthetic */ x0(int i, Object obj, Object obj2, Object obj3, boolean z5) {
        this.f19452b = i;
        this.f19454d = obj;
        this.f19455e = obj2;
        this.f19456f = obj3;
        this.f19453c = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19452b) {
            case 0:
                z0 pigeon_instanceArg = (z0) this.f19454d;
                WebView webViewArg = (WebView) this.f19455e;
                String urlArg = (String) this.f19456f;
                boolean z5 = this.f19453c;
                m mVar = pigeon_instanceArg.f19466a;
                ch.a callback = new ch.a(6);
                mVar.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
                Intrinsics.checkNotNullParameter(urlArg, "urlArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                a1.m mVar2 = mVar.f19374a;
                mVar2.getClass();
                if (((c) mVar2.f363c).d(pigeon_instanceArg)) {
                    new s7.g((ii.f) mVar2.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", mVar2.m(), iVar).K(kotlin.collections.s.f(pigeon_instanceArg, webViewArg, urlArg, Boolean.valueOf(z5)), new k0(5, callback));
                    return;
                }
                ij.k kVar = ij.m.f21341c;
                om1.r("missing-instance-error", "Callback to `WebViewClient.doUpdateVisitedHistory` failed because native instance was not in the instance manager.", "");
                int i = z0.f19465c;
                return;
            case 1:
                Context context = (Context) this.f19454d;
                boolean z10 = this.f19453c;
                s3.y yVar = (s3.y) this.f19455e;
                t3.j jVar = (t3.j) this.f19456f;
                MediaMetricsManager mediaMetricsManagerI = t3.h.i(context.getSystemService("media_metrics"));
                iVar = mediaMetricsManagerI != null ? new t3.i(context, mediaMetricsManagerI.createPlaybackSession()) : null;
                if (iVar == null) {
                    m3.b.s("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z10) {
                    t3.d dVar = yVar.f32714t;
                    dVar.getClass();
                    dVar.f33422f.a(iVar);
                }
                LogSessionId sessionId = iVar.f33443d.getSessionId();
                synchronized (jVar) {
                    m4.d dVar2 = jVar.f33467b;
                    dVar2.getClass();
                    LogSessionId logSessionId = (LogSessionId) dVar2.f28630b;
                    LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                    h5.r(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                    dVar2.f28630b = sessionId;
                }
                return;
            default:
                x0.b0 b0Var = (x0.b0) this.f19454d;
                o2 o2Var = (o2) this.f19455e;
                s2 s2Var = (s2) this.f19456f;
                boolean z11 = this.f19453c;
                o2 o2Var2 = b0Var.f35562z;
                if (o2Var2 != null && !o2Var2.a()) {
                    b0Var.f35562z.d();
                }
                b0Var.f35544j0 = z11;
                b0Var.f35562z = o2Var;
                b0Var.A = s2Var;
                b0Var.h(o2Var, s2Var, true);
                return;
        }
    }

    public /* synthetic */ x0(Context context, boolean z5, s3.y yVar, t3.j jVar) {
        this.f19452b = 1;
        this.f19454d = context;
        this.f19453c = z5;
        this.f19455e = yVar;
        this.f19456f = jVar;
    }
}

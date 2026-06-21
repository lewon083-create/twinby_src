package fj;

import com.google.android.gms.internal.ads.om1;
import fh.bz;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.BaseCaptureStrategy;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.protocol.SentryId;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f19392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f19396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f19397h;

    public /* synthetic */ o(p pVar, String str, String str2, String str3, String str4, long j10) {
        this.f19391b = 0;
        this.f19393d = pVar;
        this.f19394e = str;
        this.f19395f = str2;
        this.f19396g = str3;
        this.f19397h = str4;
        this.f19392c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f19391b;
        Object obj = this.f19397h;
        Object obj2 = this.f19396g;
        Object obj3 = this.f19395f;
        Object obj4 = this.f19394e;
        Object obj5 = this.f19393d;
        switch (i) {
            case 0:
                p pigeon_instanceArg = (p) obj5;
                String urlArg = (String) obj4;
                String userAgentArg = (String) obj3;
                String contentDispositionArg = (String) obj2;
                String mimetypeArg = (String) obj;
                q qVar = pigeon_instanceArg.f19400b;
                int i10 = 4;
                ch.a callback = new ch.a(4);
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(urlArg, "urlArg");
                Intrinsics.checkNotNullParameter(userAgentArg, "userAgentArg");
                Intrinsics.checkNotNullParameter(contentDispositionArg, "contentDispositionArg");
                Intrinsics.checkNotNullParameter(mimetypeArg, "mimetypeArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                a1.m mVar = qVar.f19403a;
                mVar.getClass();
                if (!((c) mVar.f363c).d(pigeon_instanceArg)) {
                    ij.k kVar = ij.m.f21341c;
                    om1.r("missing-instance-error", "Callback to `DownloadListener.onDownloadStart` failed because native instance was not in the instance manager.", "");
                } else {
                    new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", mVar.m(), (Object) null).K(kotlin.collections.s.f(pigeon_instanceArg, urlArg, userAgentArg, contentDispositionArg, mimetypeArg, Long.valueOf(this.f19392c)), new bz(i10, callback));
                }
                break;
            case 1:
                BufferCaptureStrategy.createCurrentSegment$lambda$5((BufferCaptureStrategy) obj5, this.f19392c, (Date) obj4, (SentryId) obj3, (ScreenshotRecorderConfig) obj2, (Function1) obj);
                break;
            default:
                SessionCaptureStrategy.createCurrentSegment$lambda$4((SessionCaptureStrategy) obj5, this.f19392c, (Date) obj4, (SentryId) obj3, (ScreenshotRecorderConfig) obj2, (Function1) obj);
                break;
        }
    }

    public /* synthetic */ o(BaseCaptureStrategy baseCaptureStrategy, long j10, Date date, SentryId sentryId, ScreenshotRecorderConfig screenshotRecorderConfig, Function1 function1, int i) {
        this.f19391b = i;
        this.f19393d = baseCaptureStrategy;
        this.f19392c = j10;
        this.f19394e = date;
        this.f19395f = sentryId;
        this.f19396g = screenshotRecorderConfig;
        this.f19397h = function1;
    }
}

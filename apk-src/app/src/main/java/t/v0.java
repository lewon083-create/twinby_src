package t;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.ImageWriter;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import com.google.android.gms.internal.ads.vs1;
import com.google.android.gms.internal.ads.y50;
import com.google.android.gms.internal.ads.yi0;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yads.ao0;
import yads.cl;
import yads.cq;
import yads.ct1;
import yads.dd0;
import yads.do0;
import yads.f02;
import yads.fj3;
import yads.go2;
import yads.nx0;
import yads.rj3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f33308d;

    public /* synthetic */ v0(int i, Object obj, Object obj2) {
        this.f33306b = i;
        this.f33307c = obj;
        this.f33308d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yi0 yi0Var;
        switch (this.f33306b) {
            case 0:
                a0.u1 u1Var = (a0.u1) this.f33307c;
                j1.h hVar = (j1.h) this.f33308d;
                try {
                    String[] strArrC = ((u.p) u1Var.f231g).c();
                    Intrinsics.checkNotNullExpressionValue(strArrC, "getCameraIdList(...)");
                    ArrayList arrayList = new ArrayList(strArrC.length);
                    for (String primaryCameraId : strArrC) {
                        Intrinsics.b(primaryCameraId);
                        Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
                        ArrayList cameraIds = kotlin.collections.s.g(primaryCameraId);
                        Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
                        arrayList.add(new a0.v(cameraIds, null));
                    }
                    Log.d("Camera2PresenceSrc", "[FetchData] Refreshed camera list: " + CollectionsKt.I(arrayList, null, null, null, null, 63));
                    u1Var.e(arrayList, null);
                    hVar.b(arrayList);
                } catch (u.a e3) {
                    Log.e("Camera2PresenceSrc", "[FetchData] Failed to get camera list for refresh.", e3);
                    a0.x xVar = new a0.x(e3);
                    Intrinsics.checkNotNullExpressionValue(xVar, "createFrom(...)");
                    u1Var.e(null, xVar);
                    hVar.d(xVar);
                    return;
                }
                break;
            case 1:
                a0.e2 e2Var = (a0.e2) this.f33307c;
                ka.k kVar = (ka.k) this.f33308d;
                e2Var.a();
                ((AtomicBoolean) kVar.f27325d).set(false);
                ImageWriter imageWriter = (ImageWriter) kVar.f27324c;
                if (imageWriter != null) {
                    imageWriter.close();
                }
                break;
            case 2:
                ((t3.i) this.f33307c).f33443d.reportTrackChangeEvent((TrackChangeEvent) this.f33308d);
                break;
            case 3:
                ((t3.i) this.f33307c).f33443d.reportNetworkEvent((NetworkEvent) this.f33308d);
                break;
            case 4:
                ((t3.i) this.f33307c).f33443d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f33308d);
                break;
            case 5:
                ((t3.i) this.f33307c).f33443d.reportPlaybackMetrics((PlaybackMetrics) this.f33308d);
                break;
            case 6:
                ((t3.i) this.f33307c).f33443d.reportPlaybackStateEvent((PlaybackStateEvent) this.f33308d);
                break;
            case 7:
                io.appmetrica.analytics.idsync.impl.n.a((io.appmetrica.analytics.idsync.impl.n) this.f33307c, (RequestConfig) this.f33308d);
                break;
            case 8:
                o4.v vVar = (o4.v) this.f33307c;
                s3.b bVar = (s3.b) this.f33308d;
                s3.t tVar = vVar.f29701b;
                String str = m3.z.f28608a;
                r3.b.l(tVar.f32648b.G, bVar);
                break;
            case 9:
                o4.v vVar2 = (o4.v) this.f33307c;
                synchronized (((vs1) this.f33308d)) {
                }
                s3.t tVar2 = vVar2.f29701b;
                String str2 = m3.z.f28608a;
                t3.d dVar = tVar2.f32648b.f32714t;
                dVar.z(dVar.v((i4.c0) dVar.f33420d.f31950e), 1013, new t3.b(28));
                break;
            case 10:
                s7.g gVar = (s7.g) this.f33307c;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.f33308d).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) gVar.f32797d).post(new v0(11, gVar, routedDevice));
                }
                break;
            case 11:
                s7.g gVar2 = (s7.g) this.f33307c;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f33308d;
                if (((u3.p) gVar2.f32798e) != null && (yi0Var = ((u3.s) ((ni.i) gVar2.f32796c).f29407c).f34179h) != null && !audioDeviceInfo.equals((AudioDeviceInfo) yi0Var.f12629j)) {
                    yi0Var.f12629j = audioDeviceInfo;
                    yi0Var.e(u3.b.c((Context) yi0Var.f12623c, (j3.d) yi0Var.f12630k, audioDeviceInfo));
                }
                break;
            case 12:
                c0.c cVar = (c0.c) this.f33307c;
                a0.u1 u1Var2 = (a0.u1) this.f33308d;
                HashSet hashSet = new HashSet();
                if (cVar != null) {
                    hashSet.addAll(cVar.f2179a);
                }
                ((a0.f2) u1Var2.f232h).getClass();
                break;
            case 13:
                ((w1.b) this.f33307c).f((Typeface) this.f33308d);
                break;
            case 14:
                ((Executor) this.f33307c).execute((Runnable) this.f33308d);
                break;
            case 15:
                ((x0.h) this.f33307c).f35608k.accept((x0.s0) this.f33308d);
                break;
            case 16:
                x0.k0 k0Var = (x0.k0) this.f33307c;
                if (((g0.a1) this.f33308d) == k0Var.f35632q) {
                    k0Var.J();
                }
                break;
            case 17:
                x0.g0 g0Var = (x0.g0) this.f33307c;
                g0.d2 d2Var = (g0.d2) this.f33308d;
                ((ArrayList) d2Var.f19527b.f19731f).remove(g0Var);
                d2Var.f19530e.remove(g0Var);
                break;
            case 18:
                ((x0.q) ((y50) this.f33307c).f12508j).b((Surface) this.f33308d);
                break;
            case 19:
                ((z3.b) ((y3.k) ((y3.q) this.f33307c).f36403d.f29407c).f36357c.f46029e.get(((y3.j) this.f33308d).f36343n)).c(true);
                break;
            case 20:
                z3.b bVar2 = (z3.b) this.f33307c;
                Uri uri = (Uri) this.f33308d;
                bVar2.f46021j = false;
                bVar2.d(uri);
                break;
            case 21:
                ((ao0) this.f33307c).a((do0) this.f33308d);
                break;
            case 22:
                ((cl) this.f33307c).b((String) this.f33308d);
                break;
            case 23:
                cq.a((cq) this.f33307c, (Bitmap) this.f33308d);
                break;
            case 24:
                ct1.a((ct1) this.f33307c, (go2) this.f33308d);
                break;
            case 25:
                ct1.a((ct1) this.f33307c, (Map) this.f33308d);
                break;
            case 26:
                ct1.a((ct1) this.f33307c, (Throwable) this.f33308d);
                break;
            case 27:
                ((dd0) this.f33307c).b((nx0) this.f33308d);
                break;
            case 28:
                f02.a((f02) this.f33307c, (View) this.f33308d);
                break;
            default:
                ((fj3) this.f33307c).a((rj3) this.f33308d);
                break;
        }
    }
}

package a0;

import a0.b1;
import android.content.ClipData;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.util.Log;
import android.util.Size;
import android.view.ContentInfo;
import android.view.PointerIcon;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.a90;
import com.google.android.gms.internal.ads.h91;
import com.google.android.gms.internal.ads.k81;
import com.google.android.gms.internal.ads.ox0;
import com.google.android.gms.internal.ads.uv1;
import com.google.android.gms.location.LocationAvailability;
import com.vk.api.sdk.exceptions.VKApiCodes;
import f9.g;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.MeasurementUnit;
import io.sentry.protocol.Message;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import yads.t70;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class b1 implements k0.c, a7.t, k81, me.u, me.n, g2.e, oa.j, m4.p, ii.o, k6.q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f44b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f45c;

    public /* synthetic */ b1(int i, Object obj) {
        this.f44b = i;
        this.f45c = obj;
    }

    public static boolean t(int i) {
        return (48 <= i && i <= 57) || i == 35 || i == 42;
    }

    public static q0.b v(f0.b bVar) throws l1 {
        q0.b bVar2 = bVar.f16485a;
        r1 r1Var = (r1) bVar2.f31549a;
        Rect rect = bVar2.f31553e;
        try {
            byte[] bArrB = com.google.android.gms.internal.auth.m.B(r1Var, rect, bVar.f16486b, bVar2.f31554f);
            try {
                i0.g gVar = new i0.g(new x2.g(new ByteArrayInputStream(bArrB)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                int i = bVar2.f31554f;
                Matrix matrix = bVar2.f31555g;
                RectF rectF = i0.q.f20812a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                return new q0.b(bArrB, gVar, 256, size, rect2, i, matrix2, bVar2.f31556h);
            } catch (IOException e3) {
                throw new l1("Failed to extract Exif from YUV-generated JPEG", e3, 0);
            }
        } catch (p0.a e7) {
            throw new l1("Failed to encode the image to JPEG.", e7, 1);
        }
    }

    @Override // g2.e
    public ClipData a() {
        return ((ContentInfo) this.f45c).getClip();
    }

    @Override // oa.j
    public /* synthetic */ void b(Object obj) {
        ((kb.c) obj).onLocationAvailability((LocationAvailability) this.f45c);
    }

    @Override // a7.t
    public String[] c() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f45c).getSupportedFeatures();
    }

    @Override // a7.t
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) rl.b.c(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f45c).createWebView(webView));
    }

    public void d(String str) {
        ki.b bVar = (ki.b) ((h3.e) this.f45c).f20375c;
        if (h3.e.f20373e == null) {
            ki.a aVar = new ki.a();
            aVar.put("alias", 1010);
            aVar.put("allScroll", 1013);
            aVar.put("basic", 1000);
            aVar.put("cell", 1006);
            aVar.put("click", 1002);
            aVar.put("contextMenu", 1001);
            aVar.put("copy", 1011);
            aVar.put("forbidden", 1012);
            aVar.put("grab", 1020);
            aVar.put("grabbing", 1021);
            aVar.put("help", 1003);
            aVar.put("move", 1013);
            aVar.put(MeasurementUnit.NONE, 0);
            aVar.put("noDrop", 1012);
            aVar.put("precise", 1007);
            aVar.put("text", 1008);
            aVar.put("resizeColumn", 1014);
            aVar.put("resizeDown", 1015);
            aVar.put("resizeUpLeft", 1016);
            aVar.put("resizeDownRight", 1017);
            aVar.put("resizeLeft", 1014);
            aVar.put("resizeLeftRight", 1014);
            aVar.put("resizeRight", 1014);
            aVar.put("resizeRow", 1015);
            aVar.put("resizeUp", 1015);
            aVar.put("resizeUpDown", 1015);
            aVar.put("resizeUpLeft", 1017);
            aVar.put("resizeUpRight", 1016);
            aVar.put("resizeUpLeftDownRight", 1017);
            aVar.put("resizeUpRightDownLeft", 1016);
            aVar.put("verticalText", 1009);
            aVar.put("wait", Integer.valueOf(VKApiCodes.CODE_PHONE_ALREADY_USED));
            aVar.put("zoomIn", 1018);
            aVar.put("zoomOut", 1019);
            h3.e.f20373e = aVar;
        }
        bVar.setPointerIcon(PointerIcon.getSystemIcon(((xh.s) bVar).getContext(), ((Integer) h3.e.f20373e.getOrDefault(str, 1000)).intValue()));
    }

    @Override // g2.e
    public int e() {
        return ((ContentInfo) this.f45c).getFlags();
    }

    @Override // g2.e
    public ContentInfo f() {
        return (ContentInfo) this.f45c;
    }

    @Override // g2.e
    public int g() {
        return ((ContentInfo) this.f45c).getSource();
    }

    @Override // a7.t
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) rl.b.c(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f45c).getProfileStore());
    }

    @Override // a7.t
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) rl.b.c(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f45c).getStatics());
    }

    @Override // a7.t
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) rl.b.c(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f45c).getWebkitToCompatConverter());
    }

    public void h(String str, String str2) {
        a7.l lVar = (a7.l) this.f45c;
        String strA = e4.n.a(str.trim());
        String strTrim = str2.trim();
        lVar.getClass();
        ad.q.c(strA, strTrim);
        ad.v vVarA = (ad.v) lVar.f491c;
        if (vVarA == null) {
            vVarA = ad.v.a();
            lVar.f491c = vVarA;
        }
        ad.e0 g0Var = (ad.e0) vVarA.get(strA);
        if (g0Var == null) {
            ad.h0 h0Var = ad.j0.f818c;
            ad.q.d(4, "expectedSize");
            g0Var = new ad.g0(4);
            ad.v vVarA2 = (ad.v) lVar.f491c;
            if (vVarA2 == null) {
                vVarA2 = ad.v.a();
                lVar.f491c = vVarA2;
            }
            vVarA2.put(strA, g0Var);
        }
        g0Var.a(strTrim);
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        a90 a90Var = (a90) this.f45c;
        aa.t tVar = (aa.t) obj;
        synchronized (a90Var) {
            a90Var.A1(new ox0(19, tVar));
        }
    }

    public void j(List list) {
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = m3.z.f28608a;
            String[] strArrSplit = str.split(":\\s?", 2);
            if (strArrSplit.length == 2) {
                h(strArrSplit[0], strArrSplit[1]);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        a90 a90Var = (a90) this.f45c;
        String message = th2.getMessage();
        synchronized (a90Var) {
            a90Var.A1(new h91(message, 6));
        }
    }

    public void l(int i, boolean z5) {
        uv1 uv1Var = (uv1) this.f45c;
        if (z5) {
            uv1Var.a(i);
        } else {
            uv1Var.getClass();
        }
    }

    @Override // m4.p
    public Object m(Uri uri, p3.j jVar) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = ((XmlPullParserFactory) this.f45c).newPullParser();
            xmlPullParserNewPullParser.setInput(jVar, null);
            return (h4.c) new h4.h(uri.toString()).e(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e3) {
            if (e3.getDetail() instanceof IOException) {
                throw ((IOException) e3.getDetail());
            }
            throw j3.d0.b(null, e3);
        }
    }

    public Object n(Object obj) throws Exception {
        q0.b bVarV;
        f0.b bVar = (f0.b) obj;
        q0.b bVar2 = bVar.f16485a;
        try {
            int i = bVar2.f31551c;
            Object obj2 = bVar2.f31549a;
            if (i == 35) {
                bVarV = v(bVar);
            } else {
                if (i != 256 && i != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + i);
                }
                bVarV = u(bVar, i);
            }
            ((r1) obj2).close();
            return bVarV;
        } catch (Throwable th2) {
            ((r1) bVar2.f31549a).close();
            throw th2;
        }
    }

    public boolean o(int i, int i10) {
        k6.c cVar = (k6.c) this.f45c;
        Object obj = ((List) cVar.f27046d).get(i);
        Object obj2 = ((List) cVar.f27047e).get(i10);
        if (obj != null && obj2 != null) {
            return ((t70) ((k6.e) cVar.f27048f).f27053b.f20376d).areContentsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // k0.c
    public void onFailure(Throwable th2) throws Exception {
        switch (this.f44b) {
            case 0:
                ((e1) this.f45c).close();
                break;
            default:
                ((j1.h) this.f45c).d(th2);
                break;
        }
    }

    @Override // ii.o
    public void onMethodCall(ii.n nVar, ii.p pVar) {
        Object obj;
        switch (this.f44b) {
            case 16:
                h3.e eVar = (h3.e) this.f45c;
                io.flutter.plugin.platform.n nVar2 = (io.flutter.plugin.platform.n) eVar.f20376d;
                if (nVar2 == null) {
                    return;
                }
                String str = nVar.f21315a;
                obj = nVar.f21316b;
                switch (str) {
                    case "create":
                        Map map = (Map) obj;
                        ByteBuffer byteBufferWrap = map.containsKey(Message.JsonKeys.PARAMS) ? ByteBuffer.wrap((byte[]) map.get(Message.JsonKeys.PARAMS)) : null;
                        try {
                            int iIntValue = ((Integer) map.get("id")).intValue();
                            String str2 = (String) map.get("viewType");
                            int iIntValue2 = ((Integer) map.get("direction")).intValue();
                            io.flutter.plugin.platform.p pVar2 = (io.flutter.plugin.platform.p) ((io.flutter.plugin.platform.n) eVar.f20376d).f25711c;
                            io.flutter.plugin.platform.g gVar = (io.flutter.plugin.platform.g) ((HashMap) pVar2.f25712b.f25711c).get(str2);
                            if (gVar == null) {
                                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                            }
                            io.flutter.plugin.platform.f fVarA = gVar.a(pVar2.f25714d, byteBufferWrap != null ? gVar.f25692a.decodeMessage(byteBufferWrap) : null);
                            View view = fVarA.getView();
                            if (view == null) {
                                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                            }
                            view.setLayoutDirection(iIntValue2);
                            pVar2.f25719j.put(iIntValue, fVarA);
                            ((hi.g) pVar).success(null);
                            return;
                        } catch (IllegalStateException e3) {
                            ((hi.g) pVar).b("error", Log.getStackTraceString(e3), null);
                            return;
                        }
                    case "clearFocus":
                        try {
                            ((io.flutter.plugin.platform.n) eVar.f20376d).q(((Integer) obj).intValue());
                            ((hi.g) pVar).success(null);
                            return;
                        } catch (IllegalStateException e7) {
                            ((hi.g) pVar).b("error", Log.getStackTraceString(e7), null);
                            return;
                        }
                    case "touch":
                        List list = (List) obj;
                        try {
                            ((io.flutter.plugin.platform.n) eVar.f20376d).n(new hi.d(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            ((hi.g) pVar).success(null);
                            return;
                        } catch (IllegalStateException e10) {
                            ((hi.g) pVar).b("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case "setDirection":
                        Map map2 = (Map) obj;
                        try {
                            ((io.flutter.plugin.platform.n) eVar.f20376d).d(((Integer) map2.get("id")).intValue(), ((Integer) map2.get("direction")).intValue());
                            ((hi.g) pVar).success(null);
                            return;
                        } catch (IllegalStateException e11) {
                            ((hi.g) pVar).b("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case "isSurfaceControlEnabled":
                        FlutterJNI flutterJNI = ((io.flutter.plugin.platform.p) nVar2.f25711c).f25716f;
                        ((hi.g) pVar).success(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                        return;
                    case "dispose":
                        try {
                            ((io.flutter.plugin.platform.n) eVar.f20376d).s(((Integer) ((Map) obj).get("id")).intValue());
                            ((hi.g) pVar).success(null);
                            return;
                        } catch (IllegalStateException e12) {
                            ((hi.g) pVar).b("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    default:
                        ((hi.g) pVar).a();
                        return;
                }
            default:
                if (!"check".equals(nVar.f21315a)) {
                    ((hi.g) pVar).a();
                    return;
                } else {
                    ConnectivityManager connectivityManager = (ConnectivityManager) ((m7.a) this.f45c).f28696c;
                    ((hi.g) pVar).success(m7.a.o(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
                    return;
                }
        }
    }

    @Override // k0.c
    public void onSuccess(Object obj) {
        switch (this.f44b) {
            case 0:
                break;
            default:
                j1.h hVar = (j1.h) this.f45c;
                try {
                    hVar.b(obj);
                } catch (Throwable th2) {
                    hVar.d(th2);
                }
                break;
        }
    }

    public boolean p(int i, int i10) {
        k6.c cVar = (k6.c) this.f45c;
        Object obj = ((List) cVar.f27046d).get(i);
        Object obj2 = ((List) cVar.f27047e).get(i10);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((t70) ((k6.e) cVar.f27048f).f27053b.f20376d).areItemsTheSame(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [bi.a] */
    public Bitmap q(ByteBuffer byteBuffer, bi.d dVar) {
        try {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: bi.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    b1 b1Var = this.f2151a;
                    ColorSpace.Named unused = ColorSpace.Named.SRGB;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                    imageDecoder.setAllocator(1);
                    g gVar = (g) b1Var.f45c;
                    if (gVar != null) {
                        Size size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(gVar.f16709b, size.getWidth(), size.getHeight());
                    }
                }
            });
        } catch (IOException e3) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e3);
            return null;
        }
    }

    public Object r(me.p pVar, Class cls) {
        return ((com.google.gson.internal.bind.k) this.f45c).f14975c.c(pVar, cls);
    }

    public Object s(int i, int i10) {
        k6.c cVar = (k6.c) this.f45c;
        Object obj = ((List) cVar.f27046d).get(i);
        Object obj2 = ((List) cVar.f27047e).get(i10);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return ((t70) ((k6.e) cVar.f27048f).f27053b.f20376d).getChangePayload(obj, obj2);
    }

    public String toString() {
        switch (this.f44b) {
            case 11:
                return "ContentInfoCompat{" + ((ContentInfo) this.f45c) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r2 != (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r1 = java.util.Arrays.copyOfRange(r3, r2, r0.limit());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q0.b u(f0.b r12, int r13) {
        /*
            r11 = this;
            q0.b r12 = r12.f16485a
            java.lang.Object r0 = r11.f45c
            ni.i r0 = (ni.i) r0
            java.lang.Object r1 = r12.f31549a
            a0.r1 r1 = (a0.r1) r1
            java.lang.Object r0 = r0.f29407c
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r0 = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) r0
            r2 = 0
            if (r0 != 0) goto L29
            a0.q1[] r0 = r1.f()
            r0 = r0[r2]
            java.nio.ByteBuffer r0 = r0.e()
            int r1 = r0.capacity()
            byte[] r1 = new byte[r1]
            r0.rewind()
            r0.get(r1)
        L27:
            r3 = r1
            goto L84
        L29:
            a0.q1[] r0 = r1.f()
            r0 = r0[r2]
            java.nio.ByteBuffer r0 = r0.e()
            int r1 = r0.capacity()
            byte[] r3 = new byte[r1]
            r0.rewind()
            r0.get(r3)
            r4 = 2
            r5 = r4
        L41:
            int r6 = r5 + 4
            r7 = -1
            if (r6 > r1) goto L68
            r6 = r3[r5]
            if (r6 == r7) goto L4b
            goto L68
        L4b:
            if (r6 != r7) goto L56
            int r6 = r5 + 1
            r6 = r3[r6]
            r7 = -38
            if (r6 != r7) goto L56
            goto L7b
        L56:
            int r6 = r5 + 2
            r6 = r3[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r7 = r5 + 3
            r7 = r3[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L41
        L68:
            int r2 = r4 + 1
            if (r2 <= r1) goto L6e
            r2 = r7
            goto L79
        L6e:
            r5 = r3[r4]
            if (r5 != r7) goto L9a
            r5 = r3[r2]
            r6 = -40
            if (r5 != r6) goto L9a
            r2 = r4
        L79:
            if (r2 == r7) goto L84
        L7b:
            int r0 = r0.limit()
            byte[] r1 = java.util.Arrays.copyOfRange(r3, r2, r0)
            goto L27
        L84:
            i0.g r4 = r12.f31550b
            java.util.Objects.requireNonNull(r4)
            android.util.Size r6 = r12.f31552d
            android.graphics.Rect r7 = r12.f31553e
            int r8 = r12.f31554f
            android.graphics.Matrix r9 = r12.f31555g
            g0.v r10 = r12.f31556h
            q0.b r2 = new q0.b
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        L9a:
            r5 = r13
            r4 = r2
            r13 = r5
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.b1.u(f0.b, int):q0.b");
    }

    public b1(zh.b bVar, int i) {
        this.f44b = i;
        switch (i) {
            case 17:
                new ii.q(bVar, "flutter/scribe", ii.l.f21314a, null).b(new v7.f(19, this));
                break;
            case 18:
                new ii.q(bVar, "flutter/spellcheck", ii.x.f21321b, null).b(new v7.f(20, this));
                break;
            default:
                new ii.q(bVar, "flutter/mousecursor", ii.x.f21321b, null).b(new v7.f(17, this));
                break;
        }
    }

    public b1(int i) {
        this.f44b = i;
        switch (i) {
            case 9:
                this.f45c = new a7.l(5);
                return;
            case 13:
                try {
                    this.f45c = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e3) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e3);
                }
            case 19:
                this.f45c = new LinkedHashMap(0, 0.75f, true);
                return;
            case 22:
                this.f45c = new uv1(1);
                return;
            default:
                this.f45c = new LinkedHashSet();
                return;
        }
    }

    public b1(ii.f fVar) {
        this.f44b = 14;
        this.f45c = new s7.g(fVar, "flutter/keyevent", ii.k.f21313a, (Object) null);
    }

    public b1(g0.a2 a2Var) {
        this.f44b = 10;
        this.f45c = new ni.i(a2Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b1(String str, String str2, int i) {
        this(9);
        this.f44b = 9;
        h("User-Agent", str);
        h("CSeq", String.valueOf(i));
        if (str2 != null) {
            h("Session", str2);
        }
    }

    public b1(ContentInfo contentInfo) {
        this.f44b = 11;
        contentInfo.getClass();
        this.f45c = a2.d.l(contentInfo);
    }

    public b1(ii.g sink) {
        this.f44b = 4;
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f45c = sink;
    }
}

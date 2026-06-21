package fj;

import android.util.Log;
import android.view.View;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.tasks.Task;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.photos.PhotosService;
import g2.x1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k0 implements ii.c, ii.b, g2.q, zc.e, sb.f, ApiResponseParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19369b;

    public /* synthetic */ k0(int i) {
        this.f19369b = i;
    }

    @Override // zc.e
    public Object apply(Object obj) {
        return ad.j0.w(Integer.valueOf(((j4.i) obj).f26482b));
    }

    @Override // sb.f
    public Task c(Object obj) {
        switch (this.f19369b) {
            case 12:
                break;
            default:
                break;
        }
        return b4.s(null);
    }

    @Override // ii.c
    public void i(Object obj) {
        switch (this.f19369b) {
            case 0:
                if (!(obj instanceof List)) {
                    ij.k kVar = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished'.", "");
                    int i = z0.f19465c;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        ij.k kVar2 = ij.m.f21341c;
                        Unit unit = Unit.f27471a;
                        int i10 = z0.f19465c;
                    } else {
                        ij.k kVar3 = ij.m.f21341c;
                        Object obj2 = list.get(0);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        h5.s(new a((String) obj2, (String) obj3, (String) list.get(2)));
                        int i11 = z0.f19465c;
                    }
                }
                break;
            case 1:
                if (!(obj instanceof List)) {
                    ij.k kVar4 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest'.", "");
                    int i12 = z0.f19465c;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        ij.k kVar5 = ij.m.f21341c;
                        Unit unit2 = Unit.f27471a;
                        int i13 = z0.f19465c;
                    } else {
                        ij.k kVar6 = ij.m.f21341c;
                        Object obj4 = list2.get(0);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        h5.s(new a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i14 = z0.f19465c;
                    }
                }
                break;
            case 2:
                if (!(obj instanceof List)) {
                    ij.k kVar7 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission'.", "");
                    int i15 = z0.f19465c;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        ij.k kVar8 = ij.m.f21341c;
                        Unit unit3 = Unit.f27471a;
                        int i16 = z0.f19465c;
                    } else {
                        ij.k kVar9 = ij.m.f21341c;
                        Object obj6 = list3.get(0);
                        Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        h5.s(new a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i17 = z0.f19465c;
                    }
                }
                break;
            case 3:
                if (!(obj instanceof List)) {
                    ij.k kVar10 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError'.", "");
                    int i18 = z0.f19465c;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        ij.k kVar11 = ij.m.f21341c;
                        Unit unit4 = Unit.f27471a;
                        int i19 = z0.f19465c;
                    } else {
                        ij.k kVar12 = ij.m.f21341c;
                        Object obj8 = list4.get(0);
                        Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        h5.s(new a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i20 = z0.f19465c;
                    }
                }
                break;
            case 4:
                if (!(obj instanceof List)) {
                    ij.k kVar13 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged'.", "");
                    int i21 = z0.f19465c;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        ij.k kVar14 = ij.m.f21341c;
                        Unit unit5 = Unit.f27471a;
                        int i22 = z0.f19465c;
                    } else {
                        ij.k kVar15 = ij.m.f21341c;
                        Object obj10 = list5.get(0);
                        Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        h5.s(new a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i23 = z0.f19465c;
                    }
                }
                break;
            default:
                if (!(obj instanceof List)) {
                    ij.k kVar16 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory'.", "");
                    int i24 = z0.f19465c;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        ij.k kVar17 = ij.m.f21341c;
                        Unit unit6 = Unit.f27471a;
                        int i25 = z0.f19465c;
                    } else {
                        ij.k kVar18 = ij.m.f21341c;
                        Object obj12 = list6.get(0);
                        Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        h5.s(new a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i26 = z0.f19465c;
                    }
                }
                break;
        }
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(me.p pVar) {
        switch (this.f19369b) {
            case 14:
                return PhotosService.m432photosGetTags$lambda173(pVar);
            case 15:
                return PhotosService.m435photosGetUserPhotosExtended$lambda187(pVar);
            case 16:
                return PhotosService.m419photosGetAllExtended$lambda100(pVar);
            case 17:
                return PhotosService.m441photosReorderAlbums$lambda213(pVar);
            case 18:
                return PhotosService.m418photosGetAllComments$lambda109(pVar);
            case 19:
                return PhotosService.m420photosGetById$lambda116(pVar);
            case 20:
                return PhotosService.m409photosDeleteAlbum$lambda27(pVar);
            case 21:
                return PhotosService.m453photosSaveWallPhoto$lambda263(pVar);
            case 22:
                return PhotosService.m437photosMakeCover$lambda196(pVar);
            case 23:
                return PhotosService.m438photosMove$lambda200(pVar);
            case 24:
                return PhotosService.m411photosEdit$lambda33(pVar);
            case 25:
                return PhotosService.m445photosRestore$lambda229(pVar);
            case 26:
                return PhotosService.m448photosSaveMarketAlbumPhoto$lambda245(pVar);
            case 27:
                return PhotosService.m427photosGetMarketUploadServer$lambda151(pVar);
            case 28:
                return PhotosService.m417photosGetAll$lambda91(pVar);
            default:
                return PhotosService.m429photosGetNewTags$lambda160(pVar);
        }
    }

    @Override // ii.b
    public void q(Object obj, h3.e reply) {
        List listF;
        List listF2;
        switch (this.f19369b) {
            case 6:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Intrinsics.c(obj2, "null cannot be cast to non-null type android.webkit.WebViewClient");
                WebViewClient webViewClient = (WebViewClient) obj2;
                Object obj3 = list.get(1);
                Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                try {
                } catch (Throwable exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof a) {
                        a aVar = exception;
                        listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                    } else {
                        listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                    }
                }
                if (!(webViewClient instanceof z0)) {
                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                }
                ((z0) webViewClient).f19467b = zBooleanValue;
                listF = kotlin.collections.r.c(null);
                reply.i(listF);
                return;
            default:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                try {
                    listF2 = kotlin.collections.r.c(Boolean.valueOf(d4.m((String) obj4)));
                    break;
                } catch (Throwable exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    if (exception2 instanceof a) {
                        a aVar2 = exception2;
                        listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                    } else {
                        listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                    }
                }
                reply.i(listF2);
                return;
        }
    }

    public /* synthetic */ k0(int i, Object obj) {
        this.f19369b = i;
    }

    @Override // g2.q
    public x1 l(View view, x1 x1Var) {
        return x1Var;
    }
}

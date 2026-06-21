package fj;

import android.location.Location;
import android.net.http.SslError;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.webkit.WebStorage;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0 implements ii.c, ii.b, j1.i, OnCompleteListener, sb.d, sb.c, sb.a, gj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19308c;

    public /* synthetic */ b0(int i, Object obj) {
        this.f19307b = i;
        this.f19308c = obj;
    }

    @Override // gj.c
    public boolean a(View view) {
        for (Class cls : (Class[]) this.f19308c) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    @Override // sb.a
    public Object g(Task task) {
        return (he.o) ((sb.m) this.f19308c).getResult();
    }

    @Override // ii.c
    public void i(Object obj) {
        int i = this.f19307b;
        f fVar = (f) this.f19308c;
        switch (i) {
            case 0:
                if (!(obj instanceof List)) {
                    ij.k kVar = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance'.", "")));
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        ij.k kVar2 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar3 = ij.m.f21341c;
                        Object obj2 = list.get(0);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj2, (String) obj3, (String) list.get(2)))));
                    }
                }
                break;
            case 1:
                if (!(obj instanceof List)) {
                    ij.k kVar4 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance'.", "")));
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        ij.k kVar5 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar6 = ij.m.f21341c;
                        Object obj4 = list2.get(0);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj4, (String) obj5, (String) list2.get(2)))));
                    }
                }
                break;
            case 2:
            case 8:
            case 16:
            case 19:
            default:
                if (!(obj instanceof List)) {
                    ij.k kVar7 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance'.", "")));
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        ij.k kVar8 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar9 = ij.m.f21341c;
                        Object obj6 = list3.get(0);
                        Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj6, (String) obj7, (String) list3.get(2)))));
                    }
                }
                break;
            case 3:
                if (!(obj instanceof List)) {
                    ij.k kVar10 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance'.", "")));
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        ij.k kVar11 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar12 = ij.m.f21341c;
                        Object obj8 = list4.get(0);
                        Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj8, (String) obj9, (String) list4.get(2)))));
                    }
                }
                break;
            case 4:
                if (!(obj instanceof List)) {
                    ij.k kVar13 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance'.", "")));
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        ij.k kVar14 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar15 = ij.m.f21341c;
                        Object obj10 = list5.get(0);
                        Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj10, (String) obj11, (String) list5.get(2)))));
                    }
                }
                break;
            case 5:
                if (!(obj instanceof List)) {
                    ij.k kVar16 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance'.", "")));
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        ij.k kVar17 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar18 = ij.m.f21341c;
                        Object obj12 = list6.get(0);
                        Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj12, (String) obj13, (String) list6.get(2)))));
                    }
                }
                break;
            case 6:
                if (!(obj instanceof List)) {
                    ij.k kVar19 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance'.", "")));
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        ij.k kVar20 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar21 = ij.m.f21341c;
                        Object obj14 = list7.get(0);
                        Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj14, (String) obj15, (String) list7.get(2)))));
                    }
                }
                break;
            case 7:
                if (!(obj instanceof List)) {
                    ij.k kVar22 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance'.", "")));
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        ij.k kVar23 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar24 = ij.m.f21341c;
                        Object obj16 = list8.get(0);
                        Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj16, (String) obj17, (String) list8.get(2)))));
                    }
                }
                break;
            case 9:
                if (!(obj instanceof List)) {
                    ij.k kVar25 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance'.", "")));
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        ij.k kVar26 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar27 = ij.m.f21341c;
                        Object obj18 = list9.get(0);
                        Intrinsics.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj18, (String) obj19, (String) list9.get(2)))));
                    }
                }
                break;
            case 10:
                if (!(obj instanceof List)) {
                    ij.k kVar28 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance'.", "")));
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        ij.k kVar29 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar30 = ij.m.f21341c;
                        Object obj20 = list10.get(0);
                        Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj20, (String) obj21, (String) list10.get(2)))));
                    }
                }
                break;
            case 11:
                if (!(obj instanceof List)) {
                    ij.k kVar31 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance'.", "")));
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        ij.k kVar32 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar33 = ij.m.f21341c;
                        Object obj22 = list11.get(0);
                        Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj22, (String) obj23, (String) list11.get(2)))));
                    }
                }
                break;
            case 12:
                if (!(obj instanceof List)) {
                    ij.k kVar34 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance'.", "")));
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        ij.k kVar35 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar36 = ij.m.f21341c;
                        Object obj24 = list12.get(0);
                        Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj24, (String) obj25, (String) list12.get(2)))));
                    }
                }
                break;
            case 13:
                if (!(obj instanceof List)) {
                    ij.k kVar37 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance'.", "")));
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        ij.k kVar38 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar39 = ij.m.f21341c;
                        Object obj26 = list13.get(0);
                        Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj26, (String) obj27, (String) list13.get(2)))));
                    }
                }
                break;
            case 14:
                if (!(obj instanceof List)) {
                    ij.k kVar40 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance'.", "")));
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        ij.k kVar41 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar42 = ij.m.f21341c;
                        Object obj28 = list14.get(0);
                        Intrinsics.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj28, (String) obj29, (String) list14.get(2)))));
                    }
                }
                break;
            case 15:
                if (!(obj instanceof List)) {
                    ij.k kVar43 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance'.", "")));
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        ij.k kVar44 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar45 = ij.m.f21341c;
                        Object obj30 = list15.get(0);
                        Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        Intrinsics.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj30, (String) obj31, (String) list15.get(2)))));
                    }
                }
                break;
            case 17:
                if (!(obj instanceof List)) {
                    ij.k kVar46 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance'.", "")));
                } else {
                    List list16 = (List) obj;
                    if (list16.size() <= 1) {
                        ij.k kVar47 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar48 = ij.m.f21341c;
                        Object obj32 = list16.get(0);
                        Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list16.get(1);
                        Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj32, (String) obj33, (String) list16.get(2)))));
                    }
                }
                break;
            case 18:
                if (!(obj instanceof List)) {
                    ij.k kVar49 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance'.", "")));
                } else {
                    List list17 = (List) obj;
                    if (list17.size() <= 1) {
                        ij.k kVar50 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar51 = ij.m.f21341c;
                        Object obj34 = list17.get(0);
                        Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        Object obj35 = list17.get(1);
                        Intrinsics.c(obj35, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj34, (String) obj35, (String) list17.get(2)))));
                    }
                }
                break;
            case 20:
                if (!(obj instanceof List)) {
                    ij.k kVar52 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance'.", "")));
                } else {
                    List list18 = (List) obj;
                    if (list18.size() <= 1) {
                        ij.k kVar53 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar54 = ij.m.f21341c;
                        Object obj36 = list18.get(0);
                        Intrinsics.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        Object obj37 = list18.get(1);
                        Intrinsics.c(obj37, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new a((String) obj36, (String) obj37, (String) list18.get(2)))));
                    }
                }
                break;
        }
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        switch (this.f19307b) {
            case 22:
                g0.l0 l0Var = (g0.l0) this.f19308c;
                synchronized (l0Var.f19646a) {
                    l0Var.f19650e = hVar;
                    break;
                }
                return "CameraRepository-deinit";
            default:
                bb.e eVar = (bb.e) this.f19308c;
                hl.d.s().execute(new e1.y(21, eVar, hVar));
                return eVar + " [fetch@" + SystemClock.uptimeMillis() + "]";
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        hi.g gVar = ((g8.b) this.f19308c).f20008b;
        if (!task.isSuccessful()) {
            gVar.b(om1.b(3), om1.a(3), null);
            return;
        }
        kb.f fVar = (kb.f) task.getResult();
        if (fVar == null) {
            gVar.b(om1.b(3), om1.a(3), null);
        } else {
            kb.h hVar = fVar.f27336a.f27338c;
            gVar.success(Boolean.valueOf((hVar != null && hVar.f27339b) || (hVar != null && hVar.f27340c)));
        }
    }

    @Override // sb.c
    public void onFailure(Exception exc) {
        e8.e eVar = (e8.e) this.f19308c;
        Log.e("Geolocator", "Error trying to get last the last known GPS location");
        eVar.onError(2);
    }

    @Override // sb.d
    public void onSuccess(Object obj) {
        switch (this.f19307b) {
            case 25:
                g8.e eVar = (g8.e) this.f19308c;
                eVar.h(eVar.f20025f);
                break;
            default:
                ((e8.e) this.f19308c).a((Location) obj);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ii.b
    public void q(Object obj, h3.e reply) {
        List listF;
        List listF2;
        List listF3;
        List listF4;
        switch (this.f19307b) {
            case 2:
                m mVar = (m) this.f19308c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj2).longValue();
                Object obj3 = list.get(1);
                Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                try {
                    ((c) mVar.f19374a.f363c).a(jLongValue, new u((String) obj3, mVar));
                    listF = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof a) {
                        a aVar = exception;
                        listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                    } else {
                        listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                    }
                }
                reply.i(listF);
                return;
            case 8:
                i iVar = (i) this.f19308c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                int i = 0;
                Object obj4 = list2.get(0);
                Intrinsics.c(obj4, "null cannot be cast to non-null type android.net.http.SslError");
                SslError sslError = (SslError) obj4;
                Object obj5 = list2.get(1);
                Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType");
                n0 n0Var = (n0) obj5;
                try {
                } catch (Throwable exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    if (exception2 instanceof a) {
                        a aVar2 = exception2;
                        listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                    } else {
                        listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                    }
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        i = 4;
                        listF2 = kotlin.collections.r.c(Boolean.valueOf(sslError.hasError(i)));
                        reply.i(listF2);
                        return;
                    case 1:
                        i = 1;
                        listF2 = kotlin.collections.r.c(Boolean.valueOf(sslError.hasError(i)));
                        reply.i(listF2);
                        return;
                    case 2:
                        i = 2;
                        listF2 = kotlin.collections.r.c(Boolean.valueOf(sslError.hasError(i)));
                        reply.i(listF2);
                        return;
                    case 3:
                        i = 5;
                        listF2 = kotlin.collections.r.c(Boolean.valueOf(sslError.hasError(i)));
                        reply.i(listF2);
                        return;
                    case 4:
                        listF2 = kotlin.collections.r.c(Boolean.valueOf(sslError.hasError(i)));
                        reply.i(listF2);
                        return;
                    case 5:
                        i = 3;
                        listF2 = kotlin.collections.r.c(Boolean.valueOf(sslError.hasError(i)));
                        reply.i(listF2);
                        return;
                    case 6:
                        iVar.f19355a.getClass();
                        throw new IllegalArgumentException(n0Var + " doesn't represent a native value.");
                    default:
                        i = -1;
                        listF2 = kotlin.collections.r.c(Boolean.valueOf(sslError.hasError(i)));
                        reply.i(listF2);
                        return;
                }
            case 16:
                i iVar2 = (i) this.f19308c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj6 = ((List) obj).get(0);
                Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((c) iVar2.f19355a.f363c).a(((Long) obj6).longValue(), WebStorage.getInstance());
                    listF3 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception3) {
                    Intrinsics.checkNotNullParameter(exception3, "exception");
                    if (exception3 instanceof a) {
                        a aVar3 = exception3;
                        listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                    } else {
                        listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                    }
                }
                reply.i(listF3);
                return;
            default:
                m mVar2 = (m) this.f19308c;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj7 = ((List) obj).get(0);
                Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((c) mVar2.f19374a.f363c).a(((Long) obj7).longValue(), new z0(mVar2));
                    listF4 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception4) {
                    Intrinsics.checkNotNullParameter(exception4, "exception");
                    if (exception4 instanceof a) {
                        a aVar4 = exception4;
                        listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                    } else {
                        listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                    }
                }
                reply.i(listF4);
                return;
        }
    }
}

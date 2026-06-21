package fj;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g0 implements ii.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f19350c;

    public /* synthetic */ g0(l0 l0Var, int i) {
        this.f19349b = i;
        this.f19350c = l0Var;
    }

    @Override // ii.c
    public final void i(Object obj) {
        int i = this.f19349b;
        l0 l0Var = this.f19350c;
        switch (i) {
            case 0:
                if (!(obj instanceof List)) {
                    ij.k kVar = ij.m.f21341c;
                    l0Var.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt'.", "")));
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        l0Var.invoke(new ij.m((String) list.get(0)));
                    } else {
                        ij.k kVar2 = ij.m.f21341c;
                        Object obj2 = list.get(0);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        l0Var.invoke(new ij.m(h5.s(new a((String) obj2, (String) obj3, (String) list.get(2)))));
                    }
                }
                break;
            case 1:
                if (!(obj instanceof List)) {
                    ij.k kVar3 = ij.m.f21341c;
                    l0Var.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert'.", "")));
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        ij.k kVar4 = ij.m.f21341c;
                        l0Var.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar5 = ij.m.f21341c;
                        Object obj4 = list2.get(0);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        l0Var.invoke(new ij.m(h5.s(new a((String) obj4, (String) obj5, (String) list2.get(2)))));
                    }
                }
                break;
            case 2:
                if (!(obj instanceof List)) {
                    ij.k kVar6 = ij.m.f21341c;
                    l0Var.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser'.", "")));
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        ij.k kVar7 = ij.m.f21341c;
                        Object obj6 = list3.get(0);
                        Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        l0Var.invoke(new ij.m(h5.s(new a((String) obj6, (String) obj7, (String) list3.get(2)))));
                    } else if (list3.get(0) != null) {
                        Object obj8 = list3.get(0);
                        Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        l0Var.invoke(new ij.m((List) obj8));
                    } else {
                        ij.k kVar8 = ij.m.f21341c;
                        l0Var.invoke(new ij.m(h5.s(new a("null-error", "Flutter api returned null value for non-null return value.", ""))));
                    }
                }
                break;
            default:
                if (!(obj instanceof List)) {
                    ij.k kVar9 = ij.m.f21341c;
                    l0Var.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm'.", "")));
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        ij.k kVar10 = ij.m.f21341c;
                        Object obj9 = list4.get(0);
                        Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list4.get(1);
                        Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        l0Var.invoke(new ij.m(h5.s(new a((String) obj9, (String) obj10, (String) list4.get(2)))));
                    } else if (list4.get(0) != null) {
                        Object obj11 = list4.get(0);
                        Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                        l0Var.invoke(new ij.m((Boolean) obj11));
                    } else {
                        ij.k kVar11 = ij.m.f21341c;
                        l0Var.invoke(new ij.m(h5.s(new a("null-error", "Flutter api returned null value for non-null return value.", ""))));
                    }
                }
                break;
        }
    }
}

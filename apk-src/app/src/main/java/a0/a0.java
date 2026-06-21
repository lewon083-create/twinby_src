package a0;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.twinby.MainActivity;
import com.yandex.mobile.ads.common.InitializationListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements j1.i, g0.j1, OnCompleteListener, ii.o, p.a, g9.b, InitializationListener, ii.c, ii.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13c;

    public /* synthetic */ a0(int i, Object obj) {
        this.f12b = i;
        this.f13c = obj;
    }

    @Override // g0.j1
    public void a(g0.k1 k1Var) {
        boolean z5;
        switch (this.f12b) {
            case 1:
                w1 w1Var = (w1) this.f13c;
                synchronized (w1Var.f250b) {
                    w1Var.f252d++;
                    break;
                }
                w1Var.f(k1Var);
                return;
            default:
                t.x1 x1Var = (t.x1) this.f13c;
                boolean z10 = false;
                try {
                    r1 r1VarAcquireLatestImage = k1Var.acquireLatestImage();
                    if (r1VarAcquireLatestImage != null) {
                        x1Var.n(r1VarAcquireLatestImage);
                        return;
                    }
                    f0.o oVar = (f0.o) x1Var.f33317b;
                    if (oVar != null) {
                        int i = oVar.f16529a;
                        l1 l1Var = new l1("Failed to acquire latest image", null, 2);
                        b4.e();
                        f0.o oVar2 = (f0.o) x1Var.f33317b;
                        if (oVar2 == null || oVar2.f16529a != i) {
                            return;
                        }
                        f0.q qVar = oVar2.f16536h;
                        f0.f fVar = qVar.f16542a;
                        b4.e();
                        if (qVar.f16548g) {
                            return;
                        }
                        b4.e();
                        int i10 = fVar.f16495a;
                        if (i10 > 0) {
                            fVar.f16495a = i10 - 1;
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            b4.e();
                            fVar.f16497c.execute(new e1.y(13, fVar, l1Var));
                        }
                        qVar.a();
                        qVar.f16546e.d(l1Var);
                        if (z5) {
                            qVar.f16543b.d(fVar);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (IllegalStateException e3) {
                    f0.o oVar3 = (f0.o) x1Var.f33317b;
                    if (oVar3 != null) {
                        int i11 = oVar3.f16529a;
                        l1 l1Var2 = new l1("Failed to acquire latest image", e3, 2);
                        b4.e();
                        f0.o oVar4 = (f0.o) x1Var.f33317b;
                        if (oVar4 == null || oVar4.f16529a != i11) {
                            return;
                        }
                        f0.q qVar2 = oVar4.f16536h;
                        f0.f fVar2 = qVar2.f16542a;
                        b4.e();
                        if (qVar2.f16548g) {
                            return;
                        }
                        b4.e();
                        int i12 = fVar2.f16495a;
                        if (i12 > 0) {
                            fVar2.f16495a = i12 - 1;
                            z10 = true;
                        }
                        if (!z10) {
                            b4.e();
                            fVar2.f16497c.execute(new e1.y(13, fVar2, l1Var2));
                        }
                        qVar2.a();
                        qVar2.f16546e.d(l1Var2);
                        if (z10) {
                            qVar2.f16543b.d(fVar2);
                            return;
                        }
                        return;
                    }
                    return;
                }
        }
    }

    @Override // p.a
    public Object apply(Object obj) {
        return Long.valueOf(((e1.c0) this.f13c).o(((Long) obj).longValue()));
    }

    @Override // g9.b
    public Object execute() {
        SQLiteDatabase sQLiteDatabaseA;
        int i = this.f12b;
        Object obj = this.f13c;
        switch (i) {
            case 14:
                f9.j jVar = (f9.j) ((f9.c) obj);
                jVar.getClass();
                int i10 = b9.a.f1990e;
                com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
                yVar.f14900c = null;
                yVar.f14901d = new ArrayList();
                yVar.f14902e = null;
                yVar.f14899b = "";
                HashMap map = new HashMap();
                sQLiteDatabaseA = jVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    b9.a aVar = (b9.a) f9.j.l(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new com.google.firebase.messaging.o(jVar, map, yVar, 4));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 15:
                f9.j jVar2 = (f9.j) ((f9.d) obj);
                long jB = jVar2.f16714c.b() - jVar2.f16716e.f16700d;
                sQLiteDatabaseA = jVar2.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jB)};
                    Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    try {
                        Cursor cursor = cursorRawQuery;
                        while (cursor.moveToNext()) {
                            jVar2.i(cursor.getInt(0), b9.c.MESSAGE_TOO_OLD, cursor.getString(1));
                            break;
                        }
                        cursorRawQuery.close();
                        int iDelete = sQLiteDatabaseA.delete("events", "timestamp_ms < ?", strArr);
                        sQLiteDatabaseA.setTransactionSuccessful();
                        sQLiteDatabaseA.endTransaction();
                        return Integer.valueOf(iDelete);
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                } finally {
                }
            case 16:
                f9.j jVar3 = (f9.j) ((f9.c) ((com.google.android.gms.internal.consent_sdk.c) obj).i);
                sQLiteDatabaseA = jVar3.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    sQLiteDatabaseA.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseA.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + jVar3.f16714c.b()).execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                s7.g gVar = (s7.g) obj;
                Iterator it = ((Iterable) ((f9.j) ((f9.d) gVar.f32796c)).d(new e5.g(10))).iterator();
                while (it.hasNext()) {
                    ((ka.k) gVar.f32797d).R((y8.j) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // ii.c
    public void i(Object obj) {
        int i = this.f12b;
        Object obj2 = this.f13c;
        switch (i) {
            case 20:
                fj.h hVar = (fj.h) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar = ij.m.f21341c;
                    hVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference'.", "")));
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        ij.k kVar2 = ij.m.f21341c;
                        hVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar3 = ij.m.f21341c;
                        Object obj3 = list.get(0);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        Object obj4 = list.get(1);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        hVar.invoke(new ij.m(h5.s(new fj.a((String) obj3, (String) obj4, (String) list.get(2)))));
                    }
                }
                break;
            case 21:
                fj.f fVar = (fj.f) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar4 = ij.m.f21341c;
                    fVar.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance'.", "")));
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        ij.k kVar5 = ij.m.f21341c;
                        fVar.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar6 = ij.m.f21341c;
                        Object obj5 = list2.get(0);
                        Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        Object obj6 = list2.get(1);
                        Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        fVar.invoke(new ij.m(h5.s(new fj.a((String) obj5, (String) obj6, (String) list2.get(2)))));
                    }
                }
                break;
            case 22:
                fj.f fVar2 = (fj.f) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar7 = ij.m.f21341c;
                    fVar2.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance'.", "")));
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        ij.k kVar8 = ij.m.f21341c;
                        fVar2.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar9 = ij.m.f21341c;
                        Object obj7 = list3.get(0);
                        Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        Object obj8 = list3.get(1);
                        Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        fVar2.invoke(new ij.m(h5.s(new fj.a((String) obj7, (String) obj8, (String) list3.get(2)))));
                    }
                }
                break;
            case 23:
                fj.f fVar3 = (fj.f) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar10 = ij.m.f21341c;
                    fVar3.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance'.", "")));
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        ij.k kVar11 = ij.m.f21341c;
                        fVar3.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar12 = ij.m.f21341c;
                        Object obj9 = list4.get(0);
                        Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list4.get(1);
                        Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        fVar3.invoke(new ij.m(h5.s(new fj.a((String) obj9, (String) obj10, (String) list4.get(2)))));
                    }
                }
                break;
            case 24:
                fj.f fVar4 = (fj.f) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar13 = ij.m.f21341c;
                    fVar4.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance'.", "")));
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        ij.k kVar14 = ij.m.f21341c;
                        fVar4.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar15 = ij.m.f21341c;
                        Object obj11 = list5.get(0);
                        Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        Object obj12 = list5.get(1);
                        Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        fVar4.invoke(new ij.m(h5.s(new fj.a((String) obj11, (String) obj12, (String) list5.get(2)))));
                    }
                }
                break;
            case 25:
                fj.f fVar5 = (fj.f) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar16 = ij.m.f21341c;
                    fVar5.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance'.", "")));
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        ij.k kVar17 = ij.m.f21341c;
                        fVar5.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar18 = ij.m.f21341c;
                        Object obj13 = list6.get(0);
                        Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        Object obj14 = list6.get(1);
                        Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        fVar5.invoke(new ij.m(h5.s(new fj.a((String) obj13, (String) obj14, (String) list6.get(2)))));
                    }
                }
                break;
            case 26:
                fj.f fVar6 = (fj.f) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar19 = ij.m.f21341c;
                    fVar6.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance'.", "")));
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        ij.k kVar20 = ij.m.f21341c;
                        fVar6.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar21 = ij.m.f21341c;
                        Object obj15 = list7.get(0);
                        Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        Object obj16 = list7.get(1);
                        Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        fVar6.invoke(new ij.m(h5.s(new fj.a((String) obj15, (String) obj16, (String) list7.get(2)))));
                    }
                }
                break;
            case 27:
            default:
                fj.f fVar7 = (fj.f) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar22 = ij.m.f21341c;
                    fVar7.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance'.", "")));
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        ij.k kVar23 = ij.m.f21341c;
                        fVar7.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar24 = ij.m.f21341c;
                        Object obj17 = list8.get(0);
                        Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        Object obj18 = list8.get(1);
                        Intrinsics.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        fVar7.invoke(new ij.m(h5.s(new fj.a((String) obj17, (String) obj18, (String) list8.get(2)))));
                    }
                }
                break;
            case 28:
                fj.f fVar8 = (fj.f) obj2;
                if (!(obj instanceof List)) {
                    ij.k kVar25 = ij.m.f21341c;
                    fVar8.invoke(new ij.m(om1.h("dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance'.", "")));
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        ij.k kVar26 = ij.m.f21341c;
                        fVar8.invoke(new ij.m(Unit.f27471a));
                    } else {
                        ij.k kVar27 = ij.m.f21341c;
                        Object obj19 = list9.get(0);
                        Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        Object obj20 = list9.get(1);
                        Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        fVar8.invoke(new ij.m(h5.s(new fj.a((String) obj19, (String) obj20, (String) list9.get(2)))));
                    }
                }
                break;
        }
    }

    @Override // j1.i
    public Object m(j1.h completer) {
        ed.d dVar;
        switch (this.f12b) {
            case 0:
                b0 b0Var = (b0) this.f13c;
                b0Var.f40n.e();
                g0.l0 l0Var = b0Var.f28a;
                synchronized (l0Var.f19646a) {
                    try {
                        if (l0Var.f19647b.isEmpty()) {
                            dVar = l0Var.f19649d;
                            if (dVar == null) {
                                dVar = k0.l.f26777d;
                            }
                        } else {
                            j1.k kVarW = l0Var.f19649d;
                            if (kVarW == null) {
                                kVarW = i0.o.w(new fj.b0(22, l0Var));
                                l0Var.f19649d = kVarW;
                            }
                            l0Var.f19648c.addAll(l0Var.f19647b.values());
                            for (g0.f0 f0Var : l0Var.f19647b.values()) {
                                f0Var.release().a(new e1.y(18, l0Var, f0Var), hl.d.j());
                            }
                            l0Var.f19647b.clear();
                            dVar = kVarW;
                        }
                    } finally {
                    }
                }
                dVar.a(new d(1, b0Var, completer), b0Var.f31d);
                return "CameraX shutdownInternal";
            case 1:
            default:
                hk.g0 this_asListenableFuture = (hk.g0) this.f13c;
                Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
                Intrinsics.checkNotNullParameter(completer, "completer");
                this_asListenableFuture.E(true, new hk.n0(1, new d6.a(0, completer, this_asListenableFuture)));
                return "Deferred.asListenableFuture";
            case 2:
                a1.g gVar = (a1.g) this.f13c;
                gVar.f326a.execute(new d(7, gVar, completer));
                return "AudioSource-release";
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f12b) {
            case 5:
                com.google.firebase.messaging.h0.b((Intent) this.f13c);
                break;
            case 6:
                ((com.google.firebase.messaging.j0) this.f13c).f14844b.d(null);
                break;
            default:
                ((ScheduledFuture) this.f13c).cancel(false);
                break;
        }
    }

    @Override // ii.o
    public void onMethodCall(ii.n call, ii.p result) {
        MainActivity mainActivity = (MainActivity) this.f13c;
        int i = MainActivity.f15086l;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.f21315a;
        if (str.equals("startListening")) {
            mainActivity.f15088k = true;
            ((hi.g) result).success(Boolean.TRUE);
        } else {
            if (!str.equals("stopListening")) {
                ((hi.g) result).a();
                return;
            }
            mainActivity.f15088k = false;
            ((hi.g) result).success(Boolean.FALSE);
        }
    }

    @Override // ii.b
    public void q(Object obj, h3.e reply) {
        List listF;
        fj.q qVar = (fj.q) this.f13c;
        Intrinsics.checkNotNullParameter(reply, "reply");
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object obj2 = ((List) obj).get(0);
        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
        try {
            ((fj.c) qVar.f19403a.f363c).a(((Long) obj2).longValue(), new fj.p(qVar));
            listF = kotlin.collections.r.c(null);
        } catch (Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            if (exception instanceof fj.a) {
                fj.a aVar = exception;
                listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
            } else {
                listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
            }
        }
        reply.i(listF);
    }
}

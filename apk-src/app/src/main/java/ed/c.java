package ed;

import a0.b1;
import aa.l;
import aa.v;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.ProgressBar;
import bb.e;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.jq0;
import com.google.android.gms.internal.ads.kc0;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.internal.ads.n81;
import com.google.android.gms.internal.ads.qq0;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.xt;
import com.google.android.gms.internal.ads.ye;
import com.google.android.gms.internal.auth.m;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.firebase.messaging.a0;
import d8.n0;
import d8.p;
import hk.w0;
import hk.x;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.SentryStackFrame;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k6.o;
import kotlin.Unit;
import l6.i;
import ma.f;
import ma.j;
import oa.d0;
import oa.n;
import ob.b4;
import ob.c3;
import ob.d3;
import ob.e4;
import ob.g0;
import ob.g4;
import ob.k2;
import ob.l0;
import ob.l1;
import ob.o3;
import ob.r1;
import ob.s0;
import ob.t1;
import ob.z0;
import ob.z3;
import p9.k;
import pa.c0;
import pa.q;
import q9.f2;
import q9.f3;
import q9.s;
import sb.g;
import yi.f0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f16335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16336d;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f16334b = i;
        this.f16335c = obj;
        this.f16336d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, oa.h] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, oa.h] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void a() {
        n nVar = (n) this.f16336d;
        if (nVar.f29863c) {
            d0 d0Var = (d0) this.f16335c;
            ma.b bVar = d0Var.f29832b;
            boolean z5 = false;
            if (bVar.f28761c != 0 && bVar.f28762d != null) {
                ?? r32 = nVar.f29862b;
                Activity activityA = nVar.a();
                PendingIntent pendingIntent = bVar.f28762d;
                c0.i(pendingIntent);
                int i = d0Var.f29831a;
                int i10 = GoogleApiActivity.f2625c;
                Intent intent = new Intent(activityA, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", false);
                r32.startActivityForResult(intent, 1);
                return;
            }
            Activity activityA2 = nVar.a();
            int i11 = bVar.f28761c;
            f fVar = nVar.f29866f;
            if (fVar.b(activityA2, null, i11) != null) {
                fVar.f(nVar.a(), nVar.f29862b, bVar.f28761c, nVar);
                return;
            }
            if (bVar.f28761c != 18) {
                int i12 = d0Var.f29831a;
                nVar.f29864d.set(null);
                nVar.f29868h.h(bVar, i12);
                return;
            }
            Activity activityA3 = nVar.a();
            ProgressBar progressBar = new ProgressBar(activityA3, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activityA3);
            builder.setView(progressBar);
            builder.setMessage(q.b(activityA3, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            f.h(activityA3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", nVar);
            Context applicationContext = nVar.a().getApplicationContext();
            i iVar = new i(11, this, alertDialogCreate, z5);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme(SentryStackFrame.JsonKeys.PACKAGE);
            a0 a0Var = new a0(iVar);
            t1.b.d(applicationContext, a0Var, intentFilter);
            a0Var.f14790b = applicationContext;
            if (j.c(applicationContext)) {
                return;
            }
            n nVar2 = (n) this.f16336d;
            nVar2.f29864d.set(null);
            kw0 kw0Var = nVar2.f29868h.f29849o;
            kw0Var.sendMessage(kw0Var.obtainMessage(3));
            if (alertDialogCreate.isShowing()) {
                alertDialogCreate.dismiss();
            }
            synchronized (a0Var) {
                try {
                    Context context = a0Var.f14790b;
                    if (context != null) {
                        context.unregisterReceiver(a0Var);
                    }
                    a0Var.f14790b = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f16335c).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        nd.j.f29321g.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f16335c), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f16335c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f16336d     // Catch: java.lang.Throwable -> L58
            nd.j r2 = (nd.j) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f29323c     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f16336d     // Catch: java.lang.Throwable -> L20
            nd.j r0 = (nd.j) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f29324d     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f29325e     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f29325e = r6     // Catch: java.lang.Throwable -> L20
            r0.f29324d = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f16336d     // Catch: java.lang.Throwable -> L20
            nd.j r4 = (nd.j) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f29323c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f16335c = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f16336d     // Catch: java.lang.Throwable -> L20
            nd.j r0 = (nd.j) r0     // Catch: java.lang.Throwable -> L20
            r0.f29324d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f16335c     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f16335c = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = nd.j.f29321g     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f16335c     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f16335c = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.c.b():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        jq0 jq0Var;
        o oVar;
        int i;
        byte b2;
        int i10;
        int i11;
        switch (this.f16334b) {
            case 0:
                b bVar = (b) this.f16336d;
                try {
                    bVar.onSuccess(m.i((Future) this.f16335c));
                    return;
                } catch (ExecutionException e3) {
                    bVar.onFailure(e3.getCause());
                    return;
                } catch (Throwable th2) {
                    bVar.onFailure(th2);
                    return;
                }
            case 1:
                l lVar = (l) this.f16335c;
                kc0 kc0Var = ((kc0[]) this.f16336d)[0];
                if (kc0Var != null) {
                    qq0 qq0Var = lVar.f626g;
                    n81 n81VarD = vv.d(kc0Var);
                    synchronized (qq0Var) {
                        qq0Var.f9577a.addFirst(n81VarD);
                    }
                    return;
                }
                return;
            case 2:
                ((aa.a) ((v) this.f16335c).f714c).f538b.evaluateJavascript((String) this.f16336d, null);
                return;
            case 3:
                aa.a aVar = (aa.a) this.f16335c;
                String str = (String) this.f16336d;
                WebView webView = aVar.f538b;
                Context context = aVar.f537a;
                Uri uriB = Uri.parse(str);
                try {
                    uriB = (!((Boolean) s.f31967e.f31970c.a(al.f3067jd)).booleanValue() || (jq0Var = aVar.f540d) == null) ? aVar.f539c.b(uriB, context, webView, null) : jq0Var.a(uriB, context, webView, null);
                    break;
                } catch (ye e7) {
                    u9.i.d("Failed to append the click signal to URL: ", e7);
                    k.C.f31302h.d("TaggingLibraryJsInterface.recordClick", e7);
                }
                aVar.i.b(uriB.toString(), null, null, null);
                return;
            case 4:
                e eVar = (e) this.f16335c;
                g gVar = (g) this.f16336d;
                Context context2 = (Context) eVar.f2019c;
                String string = e.M(context2).getString(CommonUrlParts.APP_SET_ID, null);
                long j10 = e.M(context2).getLong("app_set_id_last_used_time", -1L);
                long j11 = j10 != -1 ? 33696000000L + j10 : -1L;
                if (string != null && System.currentTimeMillis() <= j11) {
                    try {
                        e.N(context2);
                    } catch (bb.d e10) {
                        gVar.a(e10);
                        return;
                    }
                    break;
                } else {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context2.getSharedPreferences("app_set_id_storage", 0).edit().putString(CommonUrlParts.APP_SET_ID, string).commit()) {
                            String strValueOf = String.valueOf(context2.getPackageName());
                            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                            throw new bb.d("Failed to store the app set ID.");
                        }
                        e.N(context2);
                        if (!context2.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String strValueOf2 = String.valueOf(context2.getPackageName());
                            Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new bb.d("Failed to store the app set ID creation time.");
                        }
                    } catch (bb.d e11) {
                        gVar.a(e11);
                        return;
                    }
                }
                gVar.b(new ga.b(string, 1));
                return;
            case 5:
                ((d2.e) this.f16335c).accept(this.f16336d);
                return;
            case 6:
                d8.e eVar2 = (d8.e) this.f16335c;
                f0 f0Var = (f0) this.f16336d;
                eVar2.getClass();
                eVar2.A(f0Var, n0.f15670l, 24, null);
                return;
            case 7:
                d8.e eVar3 = (d8.e) this.f16335c;
                s3.q qVar = (s3.q) this.f16336d;
                d8.j jVar = n0.f15670l;
                eVar3.H(24, 4, jVar);
                ((jh.b) qVar.f32631c).e(ya.e.h(jVar));
                return;
            case 8:
                d8.e eVar4 = (d8.e) this.f16335c;
                p pVar = (p) this.f16336d;
                eVar4.getClass();
                d8.j jVar2 = n0.f15670l;
                eVar4.H(24, 7, jVar2);
                pVar.onProductDetailsResponse(jVar2, new ArrayList());
                return;
            case 9:
                d8.e eVar5 = (d8.e) this.f16335c;
                f0 f0Var2 = (f0) this.f16336d;
                eVar5.getClass();
                eVar5.G(f0Var2, n0.f15670l, 24, null);
                return;
            case 10:
                d8.e eVar6 = (d8.e) this.f16335c;
                f0 f0Var3 = (f0) this.f16336d;
                d8.j jVar3 = n0.f15670l;
                eVar6.H(24, 13, jVar3);
                f0Var3.c(jVar3);
                return;
            case 11:
                ((hk.l) this.f16336d).C((w0) this.f16335c, Unit.f27471a);
                return;
            case 12:
                ((hk.l) this.f16335c).C((ik.d) this.f16336d, Unit.f27471a);
                return;
            case 13:
                k6.c cVar = (k6.c) this.f16336d;
                k6.e eVar7 = (k6.e) cVar.f27048f;
                if (eVar7.f27058g == cVar.f27045c) {
                    List list = (List) cVar.f27047e;
                    o oVar2 = (o) this.f16335c;
                    List list2 = eVar7.f27057f;
                    eVar7.f27056e = list;
                    eVar7.f27057f = Collections.unmodifiableList(list);
                    v7.f fVar = eVar7.f27052a;
                    int[] iArr = (int[]) oVar2.f27144e;
                    ArrayList arrayList = (ArrayList) oVar2.f27143d;
                    int i12 = oVar2.f27140a;
                    b1 b1Var = (b1) oVar2.f27146g;
                    k6.f fVar2 = new k6.f(fVar);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i13 = oVar2.f27142c;
                    int i14 = 1;
                    int size = arrayList.size() - 1;
                    int i15 = i13;
                    int i16 = i12;
                    while (size >= 0) {
                        k6.n nVar = (k6.n) arrayList.get(size);
                        int i17 = nVar.f27136a;
                        int i18 = i14;
                        int i19 = nVar.f27138c;
                        int[] iArr2 = iArr;
                        int i20 = i17 + i19;
                        int i21 = nVar.f27137b;
                        ArrayList arrayList2 = arrayList;
                        int i22 = i21 + i19;
                        int i23 = i12;
                        while (true) {
                            int i24 = 0;
                            if (i16 > i20) {
                                i16--;
                                int i25 = iArr2[i16];
                                if ((i25 & 12) != 0) {
                                    i10 = i20;
                                    int i26 = i25 >> 4;
                                    k6.q qVarA = o.a(arrayDeque, i26, false);
                                    if (qVarA != null) {
                                        int i27 = (i23 - qVarA.f27154b) - 1;
                                        fVar2.a(i16, i27);
                                        if ((i25 & 4) != 0) {
                                            i11 = i15;
                                            fVar2.l(i27, i18, b1Var.s(i16, i26));
                                        } else {
                                            i11 = i15;
                                        }
                                    } else {
                                        i11 = i15;
                                        boolean z5 = i18;
                                        arrayDeque.add(new k6.q(i16, (i23 - i16) - (z5 ? 1 : 0), z5));
                                    }
                                } else {
                                    i10 = i20;
                                    i11 = i15;
                                    fVar2.j(i16, i18);
                                    i23--;
                                }
                                i15 = i11;
                                i20 = i10;
                                i18 = 1;
                            } else {
                                while (i15 > i22) {
                                    i15--;
                                    int i28 = ((int[]) oVar2.f27145f)[i15];
                                    if ((i28 & 12) != 0) {
                                        int i29 = i28 >> 4;
                                        oVar = oVar2;
                                        if (o.a(arrayDeque, i29, true) == null) {
                                            b2 = true;
                                            i = 0;
                                            arrayDeque.add(new k6.q(i15, i23 - i16, false));
                                        } else {
                                            b2 = true;
                                            i = 0;
                                            fVar2.a((i23 - r5.f27154b) - 1, i16);
                                            if ((i28 & 4) != 0) {
                                                fVar2.l(i16, 1, b1Var.s(i29, i15));
                                            }
                                        }
                                    } else {
                                        oVar = oVar2;
                                        i = i24;
                                        fVar2.c(i16, 1);
                                        i23++;
                                    }
                                    i24 = i;
                                    oVar2 = oVar;
                                }
                                o oVar3 = oVar2;
                                int i30 = i21;
                                int i31 = i17;
                                while (i24 < i19) {
                                    if ((iArr2[i31] & 15) == 2) {
                                        fVar2.l(i31, 1, b1Var.s(i31, i30));
                                    }
                                    i31++;
                                    i30++;
                                    i24++;
                                }
                                size--;
                                i14 = 1;
                                i15 = i21;
                                i16 = i17;
                                iArr = iArr2;
                                arrayList = arrayList2;
                                i12 = i23;
                                oVar2 = oVar3;
                            }
                        }
                    }
                    fVar2.b();
                    eVar7.a(list2);
                    return;
                }
                return;
            case 14:
                k6.m mVar = (k6.m) this.f16336d;
                ArrayList<k6.k> arrayList3 = (ArrayList) this.f16335c;
                for (k6.k kVar : arrayList3) {
                    ArrayList arrayList4 = mVar.f27128r;
                    long j12 = mVar.f1708f;
                    androidx.recyclerview.widget.p pVar2 = kVar.f27101a;
                    View view = pVar2 == null ? null : pVar2.itemView;
                    androidx.recyclerview.widget.p pVar3 = kVar.f27102b;
                    View view2 = pVar3 != null ? pVar3.itemView : null;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(j12);
                        arrayList4.add(kVar.f27101a);
                        duration.translationX(kVar.f27105e - kVar.f27103c);
                        duration.translationY(kVar.f27106f - kVar.f27104d);
                        duration.alpha(0.0f).setListener(new k6.j(mVar, kVar, duration, view, 0)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                        arrayList4.add(kVar.f27102b);
                        viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j12).alpha(1.0f).setListener(new k6.j(mVar, kVar, viewPropertyAnimatorAnimate, view2, 1)).start();
                    }
                }
                arrayList3.clear();
                mVar.f27124n.remove(arrayList3);
                return;
            case 15:
                k9.e eVar8 = (k9.e) this.f16335c;
                try {
                    eVar8.f27258b.X(f3.a(eVar8.f27257a, (f2) this.f16336d));
                    return;
                } catch (RemoteException e12) {
                    u9.i.f("Failed to load ad.", e12);
                    return;
                }
            case 16:
                l9.c cVar2 = (l9.c) this.f16335c;
                l9.b bVar2 = (l9.b) this.f16336d;
                cVar2.getClass();
                try {
                    cVar2.f27273b.b(bVar2.f27259a);
                    return;
                } catch (IllegalStateException e13) {
                    xt.a(cVar2.getContext()).c("AdManagerAdView.loadAd", e13);
                    return;
                }
            case 17:
                la.k kVar2 = (la.k) this.f16335c;
                int i32 = ((la.l) this.f16336d).f28090a;
                synchronized (kVar2) {
                    la.l lVar2 = (la.l) kVar2.f28088f.get(i32);
                    if (lVar2 != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i32);
                        kVar2.f28088f.remove(i32);
                        lVar2.b(new c7.k("Timed out waiting for response", null));
                        kVar2.c();
                    }
                    break;
                }
                return;
            case 18:
                mk.g gVar2 = (mk.g) this.f16336d;
                x xVar = gVar2.f28917e;
                int i33 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f16335c).run();
                    } catch (Throwable th3) {
                        hk.c0.j(kotlin.coroutines.g.f27499b, th3);
                    }
                    Runnable runnableM = gVar2.m();
                    if (runnableM == null) {
                        return;
                    }
                    this.f16335c = runnableM;
                    i33++;
                    if (i33 >= 16 && xVar.k(gVar2)) {
                        xVar.j(gVar2, this);
                        return;
                    }
                    break;
                }
                break;
            case 19:
                try {
                    b();
                    return;
                } catch (Error e14) {
                    synchronized (((nd.j) this.f16336d).f29323c) {
                        ((nd.j) this.f16336d).f29324d = 1;
                        throw e14;
                    }
                }
            case 20:
                oa.k kVar3 = (oa.k) this.f16335c;
                oa.j jVar4 = (oa.j) this.f16336d;
                Object obj = kVar3.f29859b;
                if (obj == null) {
                    return;
                }
                jVar4.b(obj);
                return;
            case 21:
                a();
                return;
            case 22:
                t1 t1Var = (t1) this.f16335c;
                t1Var.g();
                if (l7.b.e()) {
                    t1Var.e().L(this);
                    return;
                }
                ob.o oVar4 = (ob.o) this.f16336d;
                boolean z10 = oVar4.f30318c != 0;
                oVar4.f30318c = 0L;
                if (z10) {
                    oVar4.a();
                    return;
                }
                return;
            case 23:
                z3 z3Var = ((r1) this.f16336d).f30382b;
                z3Var.B();
                ob.e eVar9 = (ob.e) this.f16335c;
                if (eVar9.f30075d.h() == null) {
                    z3Var.getClass();
                    String str2 = eVar9.f30073b;
                    c0.i(str2);
                    g4 g4VarQ = z3Var.Q(str2);
                    if (g4VarQ != null) {
                        z3Var.Z(eVar9, g4VarQ);
                        return;
                    }
                    return;
                }
                z3Var.getClass();
                String str3 = eVar9.f30073b;
                c0.i(str3);
                g4 g4VarQ2 = z3Var.Q(str3);
                if (g4VarQ2 != null) {
                    z3Var.Y(eVar9, g4VarQ2);
                    return;
                }
                return;
            case 24:
                k2 k2Var = (k2) this.f16336d;
                k2Var.C();
                k2Var.D();
                Bundle bundle = (Bundle) this.f16335c;
                String string2 = bundle.getString("name");
                c0.f(string2);
                l1 l1Var = (l1) k2Var.f15951b;
                if (!l1Var.a()) {
                    s0 s0Var = l1Var.f30265g;
                    l1.k(s0Var);
                    s0Var.f30418o.f("Conditional property not cleared since app measurement is disabled");
                    return;
                } else {
                    b4 b4Var = new b4(0L, null, string2, "");
                    try {
                        e4 e4Var = l1Var.f30267j;
                        l1.h(e4Var);
                        bundle.getString(CommonUrlParts.APP_ID);
                        l1Var.n().V(new ob.e(bundle.getString(CommonUrlParts.APP_ID), "", b4Var, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), e4Var.d0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                        return;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 25:
                ((k2) this.f16336d).T((Boolean) this.f16335c, true);
                return;
            case 26:
                k2 k2Var2 = ((AppMeasurementDynamiteService) this.f16336d).f14422b.f30271n;
                l1.i(k2Var2);
                i iVar = (i) this.f16335c;
                k2Var2.C();
                k2Var2.D();
                i iVar2 = k2Var2.f30219e;
                if (iVar != iVar2) {
                    c0.k("EventInterceptor already set.", iVar2 == null);
                }
                k2Var2.f30219e = iVar;
                return;
            case 27:
                k2 k2Var3 = (k2) this.f16335c;
                k2Var3.C();
                if (Build.VERSION.SDK_INT < 30) {
                    return;
                }
                List<o3> list3 = (List) this.f16336d;
                z0 z0Var = ((l1) k2Var3.f15951b).f30264f;
                l1.h(z0Var);
                SparseArray sparseArrayI = z0Var.I();
                for (o3 o3Var : list3) {
                    int i34 = o3Var.f30332d;
                    if (!sparseArrayI.contains(i34) || ((Long) sparseArrayI.get(i34)).longValue() < o3Var.f30331c) {
                        k2Var3.a0().add(o3Var);
                    }
                }
                k2Var3.b0();
                return;
            case 28:
                l1 l1Var2 = (l1) ((k2) this.f16335c).f15951b;
                l0 l0VarQ = l1Var2.q();
                String str4 = (String) this.f16336d;
                String str5 = l0VarQ.f30259r;
                boolean z11 = false;
                if (str5 != null && !str5.equals(str4)) {
                    z11 = true;
                }
                l0VarQ.f30259r = str4;
                if (z11) {
                    l1Var2.q().H();
                    return;
                }
                return;
            default:
                c3 c3Var = (c3) this.f16336d;
                synchronized (c3Var) {
                    try {
                        c3Var.f29985b = false;
                        d3 d3Var = c3Var.f29987d;
                        if (!d3Var.T()) {
                            s0 s0Var2 = ((l1) d3Var.f15951b).f30265g;
                            l1.k(s0Var2);
                            s0Var2.f30418o.f("Connected to service");
                            g0 g0Var = (g0) this.f16335c;
                            d3Var.C();
                            d3Var.f30067e = g0Var;
                            d3Var.P();
                            d3Var.R();
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f16334b) {
            case 0:
                u7.f fVar = new u7.f(c.class.getSimpleName(), 10);
                b bVar = (b) this.f16336d;
                x0.v vVar = new x0.v(12);
                ((x0.v) fVar.f34324e).f35682d = vVar;
                fVar.f34324e = vVar;
                vVar.f35681c = bVar;
                return fVar.toString();
            case 19:
                Runnable runnable = (Runnable) this.f16335c;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((nd.j) this.f16336d).f29324d;
                sb2.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(int i, Object obj, Object obj2, boolean z5) {
        this.f16334b = i;
        this.f16336d = obj;
        this.f16335c = obj2;
    }

    public /* synthetic */ c(d8.e eVar, s3.q qVar, d8.k kVar) {
        this.f16334b = 7;
        this.f16335c = eVar;
        this.f16336d = qVar;
    }

    public c(n nVar, d0 d0Var) {
        this.f16334b = 21;
        Objects.requireNonNull(nVar);
        this.f16336d = nVar;
        this.f16335c = d0Var;
    }

    public c(nd.j jVar) {
        this.f16334b = 19;
        this.f16336d = jVar;
    }
}

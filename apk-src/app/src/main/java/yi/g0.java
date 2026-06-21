package yi;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.b7;
import d8.n0;
import io.sentry.TransactionOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import t.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d8.e f45660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f45661c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f45663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m4.d f45664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f45665g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Activity f45662d = null;

    public g0(Context context, m4.d dVar, t0 t0Var) {
        this.f45661c = t0Var;
        this.f45663e = context;
        this.f45664f = dVar;
    }

    public static b a() {
        return new b("UNAVAILABLE", "BillingClient is unset. Try reconnecting.", null);
    }

    public static void d(ii.f fVar, final g0 g0Var) {
        d dVar = d.f45645a;
        Object obj = null;
        s7.g gVar = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isReady", dVar, obj);
        if (g0Var != null) {
            final int i = 0;
            gVar.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar2 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar2.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar2 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.startConnection", dVar, obj);
        if (g0Var != null) {
            final int i10 = 9;
            gVar2.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i10) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.endConnection", dVar, obj);
        if (g0Var != null) {
            final int i11 = 10;
            gVar3.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i11) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.getBillingConfigAsync", dVar, obj);
        if (g0Var != null) {
            final int i12 = 11;
            gVar4.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i12) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.launchBillingFlow", dVar, obj);
        if (g0Var != null) {
            final int i13 = 12;
            gVar5.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i13) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.acknowledgePurchase", dVar, obj);
        if (g0Var != null) {
            final int i14 = 13;
            gVar6.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i14) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar6.L(null);
        }
        s7.g gVar7 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.consumeAsync", dVar, obj);
        if (g0Var != null) {
            final int i15 = 1;
            gVar7.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i15) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar7.L(null);
        }
        s7.g gVar8 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchasesAsync", dVar, obj);
        if (g0Var != null) {
            final int i16 = 2;
            gVar8.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i16) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar8.L(null);
        }
        s7.g gVar9 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchaseHistoryAsync", dVar, obj);
        if (g0Var != null) {
            final int i17 = 3;
            gVar9.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i17) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar9.L(null);
        }
        s7.g gVar10 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryProductDetailsAsync", dVar, obj);
        if (g0Var != null) {
            final int i18 = 4;
            gVar10.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i18) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar10.L(null);
        }
        s7.g gVar11 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isFeatureSupported", dVar, obj);
        if (g0Var != null) {
            final int i19 = 5;
            gVar11.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i19) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar11.L(null);
        }
        s7.g gVar12 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync", dVar, obj);
        if (g0Var != null) {
            final int i20 = 6;
            gVar12.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i20) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar12.L(null);
        }
        s7.g gVar13 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.showAlternativeBillingOnlyInformationDialog", dVar, obj);
        if (g0Var != null) {
            final int i21 = 7;
            gVar13.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i21) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar13.L(null);
        }
        s7.g gVar14 = new s7.g(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync", dVar, obj);
        if (g0Var == null) {
            gVar14.L(null);
        } else {
            final int i22 = 8;
            gVar14.L(new ii.b(g0Var) { // from class: yi.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g0 f45638c;

                {
                    this.f45638c = g0Var;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    d8.e eVar2;
                    switch (i22) {
                        case 0:
                            g0 g0Var2 = this.f45638c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                eVar2 = g0Var2.f45660b;
                            } catch (Throwable th2) {
                                arrayList = wa.a.z(th2);
                            }
                            if (eVar2 == null) {
                                throw g0.a();
                            }
                            arrayList.add(0, Boolean.valueOf(eVar2.b()));
                            eVar.i(arrayList);
                            return;
                        case 1:
                            g0 g0Var3 = this.f45638c;
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar = new jh.b(arrayList2, eVar, 20);
                            d8.e eVar3 = g0Var3.f45660b;
                            if (eVar3 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                s3.q qVar = new s3.q(28, bVar);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.k kVar = new d8.k(0);
                                kVar.f15640c = str;
                                eVar3.f(kVar, qVar);
                                return;
                            } catch (RuntimeException e3) {
                                bVar.f26626c.i(wa.a.z(new b("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            g0 g0Var4 = this.f45638c;
                            ArrayList arrayList3 = new ArrayList();
                            t tVar = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 21);
                            if (g0Var4.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                d8.u uVar = new d8.u();
                                uVar.f15702c = ya.e.E(tVar);
                                g0Var4.f45660b.d(uVar.a(), new s3.q(25, bVar2));
                                return;
                            } catch (RuntimeException e7) {
                                bVar2.f26626c.i(wa.a.z(new b("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 3:
                            g0 g0Var5 = this.f45638c;
                            ArrayList arrayList4 = new ArrayList();
                            t tVar2 = (t) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList4, eVar, 22);
                            d8.e eVar4 = g0Var5.f45660b;
                            if (eVar4 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                String strE = ya.e.E(tVar2);
                                s3.q qVar2 = new s3.q(27, bVar3);
                                if (!eVar4.b()) {
                                    d8.j jVar = n0.f15669k;
                                    eVar4.H(2, 11, jVar);
                                    qVar2.onPurchaseHistoryResponse(jVar, null);
                                } else if (d8.e.m(new aa.e(eVar4, strE, (Object) qVar2, 7), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(7, eVar4, qVar2), eVar4.D(), eVar4.q()) == null) {
                                    d8.j jVarN = eVar4.n();
                                    eVar4.H(25, 11, jVarN);
                                    qVar2.onPurchaseHistoryResponse(jVarN, null);
                                }
                                return;
                            } catch (RuntimeException e10) {
                                bVar3.f26626c.i(wa.a.z(new b("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 4:
                            g0 g0Var6 = this.f45638c;
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj2).get(0);
                            jh.b bVar4 = new jh.b(arrayList5, eVar, 23);
                            if (g0Var6.f45660b == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                a7.l lVar = new a7.l(11);
                                lVar.j(ya.e.D(list));
                                g0Var6.f45660b.c(lVar.a(), new oi.i(26, g0Var6, bVar4));
                                return;
                            } catch (RuntimeException e11) {
                                bVar4.f26626c.i(wa.a.z(new b("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 5:
                            g0 g0Var7 = this.f45638c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, g0Var7.b((h) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th3) {
                                arrayList6 = wa.a.z(th3);
                            }
                            eVar.i(arrayList6);
                            return;
                        case 6:
                            g0 g0Var8 = this.f45638c;
                            jh.b bVar5 = new jh.b(new ArrayList(), eVar, 24);
                            d8.e eVar5 = g0Var8.f45660b;
                            if (eVar5 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar5.i(new f0(0, bVar5));
                                return;
                            } catch (RuntimeException e12) {
                                bVar5.f26626c.i(wa.a.z(new b("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                        case 7:
                            g0 g0Var9 = this.f45638c;
                            jh.b bVar6 = new jh.b(new ArrayList(), eVar, 25);
                            d8.e eVar6 = g0Var9.f45660b;
                            if (eVar6 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            Activity activity = g0Var9.f45662d;
                            if (activity == null) {
                                eVar.i(wa.a.z(new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                eVar6.k(activity, new f0(1, bVar6));
                                return;
                            } catch (RuntimeException e13) {
                                bVar6.f26626c.i(wa.a.z(new b("error", e13.getMessage(), Log.getStackTraceString(e13))));
                                return;
                            }
                        case 8:
                            g0 g0Var10 = this.f45638c;
                            jh.b bVar7 = new jh.b(new ArrayList(), eVar, 16);
                            d8.e eVar7 = g0Var10.f45660b;
                            if (eVar7 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar7.g(new s3.q(26, bVar7));
                                return;
                            } catch (RuntimeException e14) {
                                bVar7.f26626c.i(wa.a.z(new b("error", e14.getMessage(), Log.getStackTraceString(e14))));
                                return;
                            }
                        case 9:
                            g0 g0Var11 = this.f45638c;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            boolean z5 = false;
                            Long l10 = (Long) arrayList8.get(0);
                            g gVar22 = (g) arrayList8.get(1);
                            p pVar = (p) arrayList8.get(2);
                            jh.b bVar8 = new jh.b(arrayList7, eVar, 17);
                            if (g0Var11.f45660b == null) {
                                t0 t0Var = g0Var11.f45661c;
                                Context context = g0Var11.f45663e;
                                m4.d dVar2 = g0Var11.f45664f;
                                t0Var.getClass();
                                d8.c cVar = new d8.c(context);
                                if (pVar != null && pVar.f45699a.booleanValue()) {
                                    z5 = true;
                                }
                                cVar.f15585a = new fd.b(z5, false);
                                int iOrdinal = gVar22.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        cVar.f15589e = true;
                                    } else if (iOrdinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + gVar22 + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        cVar.f15588d = new oi.i(22, t0Var, dVar2);
                                    }
                                }
                                cVar.f15587c = new xi.d(dVar2);
                                g0Var11.f45660b = cVar.a();
                            }
                            try {
                                g0Var11.f45660b.l(new b7(g0Var11, bVar8, l10));
                                return;
                            } catch (RuntimeException e15) {
                                bVar8.f26626c.i(wa.a.z(new b("error", e15.getMessage(), Log.getStackTraceString(e15))));
                                return;
                            }
                        case 10:
                            g0 g0Var12 = this.f45638c;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                d8.e eVar8 = g0Var12.f45660b;
                                if (eVar8 != null) {
                                    eVar8.a();
                                    g0Var12.f45660b = null;
                                }
                                arrayList9.add(0, null);
                                break;
                            } catch (Throwable th4) {
                                arrayList9 = wa.a.z(th4);
                            }
                            eVar.i(arrayList9);
                            return;
                        case 11:
                            g0 g0Var13 = this.f45638c;
                            jh.b bVar9 = new jh.b(new ArrayList(), eVar, 18);
                            d8.e eVar9 = g0Var13.f45660b;
                            if (eVar9 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                eVar9.h(new f0(2, bVar9));
                                return;
                            } catch (RuntimeException e16) {
                                bVar9.f26626c.i(wa.a.z(new b("error", e16.getMessage(), Log.getStackTraceString(e16))));
                                return;
                            }
                        case 12:
                            g0 g0Var14 = this.f45638c;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, g0Var14.c((j) ((ArrayList) obj2).get(0)));
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = wa.a.z(th5);
                            }
                            eVar.i(arrayList10);
                            return;
                        default:
                            g0 g0Var15 = this.f45638c;
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar10 = new jh.b(arrayList11, eVar, 19);
                            d8.e eVar10 = g0Var15.f45660b;
                            if (eVar10 == null) {
                                eVar.i(wa.a.z(g0.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                d8.b bVar11 = new d8.b();
                                bVar11.f15582a = str2;
                                eVar10.e(bVar11, new s3.q(29, bVar10));
                                return;
                            } catch (RuntimeException e17) {
                                bVar10.f26626c.i(wa.a.z(new b("error", e17.getMessage(), Log.getStackTraceString(e17))));
                                return;
                            }
                    }
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean b(yi.h r17) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yi.g0.b(yi.h):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yi.l c(yi.j r11) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yi.g0.c(yi.j):yi.l");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Context context;
        if (this.f45662d != activity || (context = this.f45663e) == null) {
            return;
        }
        ((Application) context).unregisterActivityLifecycleCallbacks(this);
        d8.e eVar = this.f45660b;
        if (eVar != null) {
            eVar.a();
            this.f45660b = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

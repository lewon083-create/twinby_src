package aa;

import android.animation.ValueAnimator;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.sz;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.measurement.b4;
import g2.b1;
import g2.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import ob.d3;
import ob.e1;
import ob.e4;
import ob.g3;
import ob.g4;
import ob.k2;
import ob.l1;
import ob.r1;
import ob.s0;
import ob.v0;
import ob.w1;
import ob.y1;
import ob.z0;
import ob.z3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f723e;

    public /* synthetic */ y(int i) {
        this.f720b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.y.a():void");
    }

    private final void b() {
        AtomicReference atomicReference;
        d3 d3Var;
        l1 l1Var;
        z0 z0Var;
        AtomicReference atomicReference2 = (AtomicReference) this.f721c;
        synchronized (atomicReference2) {
            try {
                try {
                    d3Var = (d3) this.f723e;
                    l1Var = (l1) d3Var.f15951b;
                    z0Var = l1Var.f30264f;
                    l1.h(z0Var);
                } catch (Throwable th2) {
                    ((AtomicReference) this.f721c).notify();
                    throw th2;
                }
            } catch (RemoteException e3) {
                s0 s0Var = ((l1) ((d3) this.f723e).f15951b).f30265g;
                l1.k(s0Var);
                s0Var.f30411g.g(e3, "Failed to get app instance id");
                atomicReference = (AtomicReference) this.f721c;
            }
            if (z0Var.J().i(w1.ANALYTICS_STORAGE)) {
                ob.g0 g0Var = d3Var.f30067e;
                if (g0Var != null) {
                    atomicReference2.set(g0Var.b1((g4) this.f722d));
                    String str = (String) atomicReference2.get();
                    if (str != null) {
                        k2 k2Var = ((l1) d3Var.f15951b).f30271n;
                        l1.i(k2Var);
                        k2Var.f30222h.set(str);
                        z0 z0Var2 = l1Var.f30264f;
                        l1.h(z0Var2);
                        z0Var2.f30583h.e(str);
                    }
                    d3Var.P();
                    atomicReference = (AtomicReference) this.f721c;
                    atomicReference.notify();
                    return;
                }
                s0 s0Var2 = l1Var.f30265g;
                l1.k(s0Var2);
                s0Var2.f30411g.f("Failed to get app instance id");
            } else {
                s0 s0Var3 = l1Var.f30265g;
                l1.k(s0Var3);
                s0Var3.f30415l.f("Analytics storage consent denied; will not get app instance id");
                k2 k2Var2 = ((l1) d3Var.f15951b).f30271n;
                l1.i(k2Var2);
                k2Var2.f30222h.set(null);
                z0 z0Var3 = l1Var.f30264f;
                l1.h(z0Var3);
                z0Var3.f30583h.e(null);
                atomicReference2.set(null);
            }
            atomicReference2.notify();
        }
    }

    private final void c() {
        u7.j jVarH = ((WorkDatabase) this.f721c).n().h((String) this.f722d);
        if (jVarH == null || !jVarH.b()) {
            return;
        }
        synchronized (((t7.b) this.f723e).f33531d) {
            ((t7.b) this.f723e).f33534g.put((String) this.f722d, jVarH);
            ((t7.b) this.f723e).f33535h.add(jVarH);
            t7.b bVar = (t7.b) this.f723e;
            bVar.i.b(bVar.f33535h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        JSONObject jSONObject;
        int i;
        sb.m mVarN;
        ob.u uVar;
        e4 e4Var;
        l1 l1Var;
        z0 z0Var;
        s0 s0Var;
        int i10 = 3;
        Object objCall = null;
        strB1 = null;
        String strB1 = null;
        boolean zBooleanValue = true;
        zAcceptThirdPartyCookies = false;
        boolean zAcceptThirdPartyCookies = false;
        switch (this.f720b) {
            case 0:
                a aVar = (a) this.f721c;
                Bundle bundle = (Bundle) this.f722d;
                v vVar = (v) this.f723e;
                t9.h0 h0Var = p9.k.C.f31300f;
                Context context = aVar.f537a;
                h0Var.getClass();
                CookieManager cookieManagerI = t9.h0.i();
                bundle.putBoolean("accept_3p_cookie", cookieManagerI != null ? cookieManagerI.acceptThirdPartyCookies(aVar.f538b) : false);
                v7.f.n(context, new k9.g((k9.f) new k9.f(2).r(bundle, AdMobAdapter.class)), vVar);
                return;
            case 1:
                i0 i0Var = (i0) this.f721c;
                Object obj = this.f722d;
                Pair pair = (Pair) this.f723e;
                if (obj instanceof WebView) {
                    Context context2 = i0Var.f600c;
                    p9.k.C.f31300f.getClass();
                    CookieManager cookieManagerI2 = t9.h0.i();
                    if (cookieManagerI2 != null) {
                        zAcceptThirdPartyCookies = cookieManagerI2.acceptThirdPartyCookies((WebView) obj);
                    }
                }
                HashMap map = i0Var.f598a;
                Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
                k0 k0Var = (k0) map.get(boolValueOf);
                if (k0Var != null) {
                    p9.k.C.f31304k.getClass();
                    if (k0Var.f619c > System.currentTimeMillis()) {
                        i0Var.e(k0Var, pair, true);
                        return;
                    }
                }
                HashMap map2 = i0Var.f599b;
                List arrayList = (List) map2.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(boolValueOf, arrayList);
                }
                arrayList.add(pair);
                return;
            case 2:
                String str = (String) this.f722d;
                Pair[] pairArr = (Pair[]) this.f723e;
                wd0 wd0Var = (wd0) this.f721c;
                wd0Var.getClass();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(wd0Var.f11747a);
                if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str)) {
                    concurrentHashMap.put("action", str);
                }
                for (Pair pair2 : pairArr) {
                    String str2 = (String) pair2.first;
                    String str3 = (String) pair2.second;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        concurrentHashMap.put(str2, str3);
                    }
                }
                wd0Var.a(concurrentHashMap, false);
                return;
            case 3:
                synchronized (bf.m.f2140g) {
                    bf.m.a((bf.m) this.f723e, (bf.e) this.f721c);
                    break;
                }
                ((hi.g) this.f722d).success(null);
                return;
            case 4:
                String str4 = (String) this.f721c;
                if (TextUtils.isEmpty(str4)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                String str5 = (String) this.f722d;
                String lowerCase = str4.toLowerCase();
                if (TextUtils.isEmpty(str5)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str5);
                    } catch (JSONException unused) {
                        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str5);
                        return;
                    }
                }
                com.google.android.gms.internal.consent_sdk.g0[] g0VarArr = (com.google.android.gms.internal.consent_sdk.g0[]) this.f723e;
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                for (com.google.android.gms.internal.consent_sdk.g0 g0Var : g0VarArr) {
                    FutureTask futureTask = new FutureTask(new e(g0Var, lowerCase, jSONObject, i10));
                    g0Var.mo10h().execute(futureTask);
                    try {
                    } catch (InterruptedException e3) {
                        Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e3);
                    } catch (ExecutionException e7) {
                        Log.d("UserMessagingPlatform", pe.a.f("Failed to run Action[", lowerCase, "]: "), e7.getCause());
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                    break;
                }
                return;
            case 5:
                com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f721c;
                yc.c cVar2 = (yc.c) this.f722d;
                b8.a aVar2 = (b8.a) this.f723e;
                ((Handler) cVar.f13338b).post(new com.google.android.gms.internal.consent_sdk.h(i10, cVar2));
                if (aVar2.f1988c != 2) {
                    ((com.google.android.gms.internal.consent_sdk.o) cVar.f13341e).b();
                    return;
                }
                return;
            case 6:
                try {
                    objCall = ((k) this.f721c).call();
                    break;
                } catch (Exception unused2) {
                }
                ((Handler) this.f723e).post(new ed.c(5, (d2.e) this.f722d, objCall));
                return;
            case 7:
                ((d8.i0) this.f721c).N((fe.c) this.f722d, (d8.p) this.f723e);
                return;
            case 8:
                ((d8.i0) this.f721c).M((d8.k) this.f722d, (s3.q) this.f723e);
                return;
            case 9:
                ((d8.i0) this.f721c).L((d8.b) this.f722d, (s3.q) this.f723e);
                return;
            case 10:
                new ut(z ? 1 : 0, (Context) this.f721c, ((k9.g) this.f722d).f27259a).p((da.a) this.f723e);
                return;
            case 11:
                x0.h((View) this.f721c, (a1.e) this.f722d);
                ((ValueAnimator) this.f723e).start();
                return;
            case 12:
                la.a aVar3 = (la.a) this.f722d;
                Intent intent = aVar3.f28060b;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    mVarN = b4.s(null);
                } else {
                    Bundle bundle2 = new Bundle();
                    Intent intent2 = aVar3.f28060b;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle2.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar3.f28060b;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle2.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context3 = (Context) this.f721c;
                    bundle2.putBoolean("supports_message_handled", true);
                    la.m mVarL = la.m.l(context3);
                    synchronized (mVarL) {
                        i = mVarL.f28098c;
                        mVarL.f28098c = i + 1;
                    }
                    mVarN = mVarL.n(new la.l(i, 2, bundle2, 0));
                }
                mVarN.b(la.h.f28077c, new he.b((CountDownLatch) this.f723e));
                return;
            case 13:
                try {
                    zBooleanValue = ((Boolean) ((w7.j) this.f723e).get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused3) {
                }
                ((m7.c) this.f721c).c((String) this.f722d, zBooleanValue);
                return;
            case 14:
                w7.j jVar = (w7.j) this.f722d;
                m7.m mVar = (m7.m) this.f723e;
                try {
                    ((ed.d) this.f721c).get();
                    l7.n.g().e(m7.m.f28738u, "Starting work for " + mVar.f28743f.f34332c, new Throwable[0]);
                    mVar.f28755s = mVar.f28744g.startWork();
                    jVar.l(mVar.f28755s);
                    return;
                } catch (Throwable th2) {
                    jVar.k(th2);
                    return;
                }
            case 15:
                String str6 = (String) this.f722d;
                m7.m mVar2 = (m7.m) this.f723e;
                try {
                    try {
                        l7.m mVar3 = (l7.m) ((w7.j) this.f721c).get();
                        if (mVar3 == null) {
                            l7.n.g().f(m7.m.f28738u, mVar2.f28743f.f34332c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                        } else {
                            l7.n.g().e(m7.m.f28738u, String.format("%s returned a %s result.", mVar2.f28743f.f34332c, mVar3), new Throwable[0]);
                            mVar2.i = mVar3;
                        }
                        break;
                    } catch (InterruptedException e10) {
                        e = e10;
                        l7.n.g().f(m7.m.f28738u, str6 + " failed because it threw an exception/error", e);
                    } catch (CancellationException e11) {
                        l7.n.g().h(m7.m.f28738u, str6 + " was cancelled", e11);
                    } catch (ExecutionException e12) {
                        e = e12;
                        l7.n.g().f(m7.m.f28738u, str6 + " failed because it threw an exception/error", e);
                    }
                    mVar2.b();
                    return;
                } catch (Throwable th3) {
                    mVar2.b();
                    throw th3;
                }
            case 16:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f723e;
                Context context4 = (Context) this.f722d;
                Intent intent4 = (Intent) this.f721c;
                try {
                    boolean booleanExtra = intent4.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent4.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent4.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent4.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    l7.n.g().e(ConstraintProxyUpdateReceiver.f1775a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                    v7.g.a(context4, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    v7.g.a(context4, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    v7.g.a(context4, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    v7.g.a(context4, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 17:
                g4 g4Var = (g4) this.f722d;
                z3 z3Var = ((r1) this.f723e).f30382b;
                z3Var.B();
                ob.e eVar = (ob.e) this.f721c;
                if (eVar.f30075d.h() == null) {
                    z3Var.Z(eVar, g4Var);
                    return;
                } else {
                    z3Var.Y(eVar, g4Var);
                    return;
                }
            case 18:
                ob.v vVar2 = (ob.v) this.f721c;
                g4 g4Var2 = (g4) this.f722d;
                r1 r1Var = (r1) this.f723e;
                r1Var.getClass();
                z3 z3Var2 = r1Var.f30382b;
                if ("_cmp".equals(vVar2.f30454b) && (uVar = vVar2.f30455c) != null) {
                    Bundle bundle3 = uVar.f30430b;
                    if (bundle3.size() != 0) {
                        String string = bundle3.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            z3Var2.b().f30416m.g(vVar2.toString(), "Event has been filtered ");
                            vVar2 = new ob.v("_cmpx", uVar, vVar2.f30456d, vVar2.f30457e);
                        }
                    }
                }
                String str7 = vVar2.f30454b;
                e1 e1Var = z3Var2.f30605b;
                v0 v0Var = z3Var2.f30611h;
                z3.T(e1Var);
                String str8 = g4Var2.f30131b;
                com.google.android.gms.internal.measurement.d0 d0Var = TextUtils.isEmpty(str8) ? null : (com.google.android.gms.internal.measurement.d0) e1Var.f30088k.b(str8);
                if (d0Var == null) {
                    z3Var2.b().f30418o.g(g4Var2.f30131b, "EES not loaded for");
                    z3Var2.B();
                    z3Var2.h(vVar2, g4Var2);
                    return;
                }
                try {
                    bb.e eVar2 = d0Var.f13694c;
                    z3.T(v0Var);
                    HashMap mapS0 = v0.s0(vVar2.f30455c.f(), true);
                    String strG = y1.g(str7, y1.f30545c, y1.f30543a);
                    if (strG == null) {
                        strG = str7;
                    }
                    if (d0Var.a(new com.google.android.gms.internal.measurement.b(strG, vVar2.f30457e, mapS0))) {
                        if (((com.google.android.gms.internal.measurement.b) eVar2.f2020d).equals((com.google.android.gms.internal.measurement.b) eVar2.f2019c)) {
                            z3Var2.B();
                            z3Var2.h(vVar2, g4Var2);
                        } else {
                            z3Var2.b().f30418o.g(str7, "EES edited event");
                            z3.T(v0Var);
                            ob.v vVarG = v0.G((com.google.android.gms.internal.measurement.b) eVar2.f2020d);
                            z3Var2.B();
                            z3Var2.h(vVarG, g4Var2);
                        }
                        if (((ArrayList) eVar2.f2021e).isEmpty()) {
                            return;
                        }
                        for (com.google.android.gms.internal.measurement.b bVar : (ArrayList) eVar2.f2021e) {
                            z3Var2.b().f30418o.g(bVar.f13665a, "EES logging created event");
                            z3.T(v0Var);
                            ob.v vVarG2 = v0.G(bVar);
                            z3Var2.B();
                            z3Var2.h(vVarG2, g4Var2);
                        }
                        return;
                    }
                } catch (com.google.android.gms.internal.measurement.p0 unused4) {
                    z3Var2.b().f30411g.h(g4Var2.f30132c, "EES error. appId, eventName", str7);
                }
                z3Var2.b().f30418o.g(str7, "EES was not applied to event");
                z3Var2.B();
                z3Var2.h(vVar2, g4Var2);
                return;
            case 19:
                r1 r1Var2 = (r1) this.f723e;
                r1Var2.f30382b.B();
                r1Var2.f30382b.d((String) this.f722d, (ob.v) this.f721c);
                return;
            case 20:
                g4 g4Var3 = (g4) this.f722d;
                z3 z3Var3 = ((r1) this.f723e).f30382b;
                z3Var3.B();
                ob.b4 b4Var = (ob.b4) this.f721c;
                if (b4Var.h() == null) {
                    z3Var3.W(b4Var.f29965c, g4Var3);
                    return;
                } else {
                    z3Var3.V(b4Var, g4Var3);
                    return;
                }
            case 21:
                a();
                return;
            case 22:
                b();
                return;
            case 23:
                com.google.android.gms.internal.measurement.l0 l0Var = (com.google.android.gms.internal.measurement.l0) this.f722d;
                d3 d3Var = (d3) this.f723e;
                try {
                    try {
                        l1Var = (l1) d3Var.f15951b;
                        z0Var = l1Var.f30264f;
                        s0Var = l1Var.f30265g;
                        l1.h(z0Var);
                    } catch (RemoteException e13) {
                        s0 s0Var2 = ((l1) d3Var.f15951b).f30265g;
                        l1.k(s0Var2);
                        s0Var2.f30411g.g(e13, "Failed to get app instance id");
                    }
                    if (z0Var.J().i(w1.ANALYTICS_STORAGE)) {
                        ob.g0 g0Var2 = d3Var.f30067e;
                        if (g0Var2 != null) {
                            strB1 = g0Var2.b1((g4) this.f721c);
                            if (strB1 != null) {
                                k2 k2Var = l1Var.f30271n;
                                l1.i(k2Var);
                                k2Var.f30222h.set(strB1);
                                l1.h(z0Var);
                                z0Var.f30583h.e(strB1);
                            }
                            d3Var.P();
                            e4Var = ((l1) d3Var.f15951b).f30267j;
                            l1.h(e4Var);
                            e4Var.j0(strB1, l0Var);
                            return;
                        }
                        l1.k(s0Var);
                        s0Var.f30411g.f("Failed to get app instance id");
                    } else {
                        l1.k(s0Var);
                        s0Var.f30415l.f("Analytics storage consent denied; will not get app instance id");
                        k2 k2Var2 = l1Var.f30271n;
                        l1.i(k2Var2);
                        k2Var2.f30222h.set(null);
                        l1.h(z0Var);
                        z0Var.f30583h.e(null);
                    }
                    e4Var = l1Var.f30267j;
                    l1.h(e4Var);
                    e4Var.j0(strB1, l0Var);
                    return;
                } catch (Throwable th4) {
                    e4 e4Var2 = ((l1) d3Var.f15951b).f30267j;
                    l1.h(e4Var2);
                    e4Var2.j0(null, l0Var);
                    throw th4;
                }
            case 24:
                d3 d3Var2 = (d3) this.f721c;
                g4 g4Var4 = (g4) this.f722d;
                ob.d dVar = (ob.d) this.f723e;
                l1 l1Var2 = (l1) d3Var2.f15951b;
                ob.g0 g0Var3 = d3Var2.f30067e;
                if (g0Var3 == null) {
                    s0 s0Var3 = l1Var2.f30265g;
                    l1.k(s0Var3);
                    s0Var3.f30411g.f("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    g0Var3.z2(g4Var4, dVar);
                    d3Var2.P();
                    return;
                } catch (RemoteException e14) {
                    s0 s0Var4 = l1Var2.f30265g;
                    l1.k(s0Var4);
                    s0Var4.f30411g.h(Long.valueOf(dVar.f29993b), "[sgtm] Failed to update batch upload status, rowId, exception", e14);
                    return;
                }
            case 25:
                ni.i iVar = (ni.i) this.f721c;
                s0 s0Var5 = (s0) this.f722d;
                JobParameters jobParameters = (JobParameters) this.f723e;
                s0Var5.f30418o.f("AppMeasurementJobService processed last upload request.");
                ((g3) ((Service) iVar.f29407c)).c(jobParameters);
                return;
            case 26:
                com.google.android.gms.internal.ads.i0 i0Var2 = (com.google.android.gms.internal.ads.i0) this.f721c;
                String str9 = (String) this.f722d;
                HashMap map3 = (HashMap) this.f723e;
                sz szVar = (sz) i0Var2.f6315e;
                if (szVar != null) {
                    szVar.c(str9, map3);
                    return;
                }
                return;
            case 27:
                c();
                return;
            default:
                ((m7.l) this.f721c).f28735g.g((String) this.f722d, (bb.e) this.f723e);
                return;
        }
    }

    public /* synthetic */ y(int i, Object obj, Object obj2, Object obj3, boolean z5) {
        this.f720b = i;
        this.f723e = obj;
        this.f721c = obj2;
        this.f722d = obj3;
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i) {
        this.f720b = i;
        this.f721c = obj;
        this.f722d = obj2;
        this.f723e = obj3;
    }

    public y(d3 d3Var, AtomicReference atomicReference, g4 g4Var) {
        this.f720b = 22;
        this.f721c = atomicReference;
        this.f722d = g4Var;
        Objects.requireNonNull(d3Var);
        this.f723e = d3Var;
    }

    public y(View view, b1 b1Var, a1.e eVar, ValueAnimator valueAnimator) {
        this.f720b = 11;
        this.f721c = view;
        this.f722d = eVar;
        this.f723e = valueAnimator;
    }
}

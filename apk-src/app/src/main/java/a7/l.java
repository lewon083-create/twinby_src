package a7;

import a0.k1;
import a0.u;
import a0.u1;
import ad.m0;
import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.play_billing.c0;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.tasks.Task;
import fh.of;
import g0.d0;
import g0.m1;
import ii.x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements WebMessageListenerBoundaryInterface, z6.a, sb.a, f.b, k0.c, oa.j, ii.o, io.flutter.plugin.editing.a, j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f491c;

    public /* synthetic */ l(int i) {
        this.f490b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e0.d f(b0.a r5, java.util.List r6) {
        /*
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            r3 = r6
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L13
        L11:
            r3 = r2
            goto L28
        L13:
            java.util.Iterator r3 = r6.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L11
            java.lang.Object r4 = r3.next()
            a0.q2 r4 = (a0.q2) r4
            boolean r4 = r4 instanceof a0.k1
            if (r4 == 0) goto L17
            r3 = r1
        L28:
            if (r0 == 0) goto L34
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L34
            goto L4f
        L34:
            java.util.Iterator r6 = r6.iterator()
        L38:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r6.next()
            a0.q2 r0 = (a0.q2) r0
            boolean r4 = r0 instanceof a0.a2
            if (r4 != 0) goto L4e
            boolean r0 = l0.f.z(r0)
            if (r0 == 0) goto L38
        L4e:
            r2 = r1
        L4f:
            d0.b r6 = r5.a()
            int r6 = r6.ordinal()
            r0 = 0
            if (r6 == 0) goto L73
            if (r6 == r1) goto L73
            r1 = 2
            if (r6 == r1) goto L73
            r1 = 3
            if (r6 != r1) goto L6d
            c0.d r6 = c0.d.f2182e
            java.lang.String r6 = r6.toString()
            if (r3 != 0) goto L6b
            goto L8d
        L6b:
            r6 = r0
            goto L8d
        L6d:
            ij.j r5 = new ij.j
            r5.<init>()
            throw r5
        L73:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            c0.d r1 = c0.d.f2181d
            r6.append(r1)
            java.lang.String r1 = " or "
            r6.append(r1)
            c0.d r1 = c0.d.f2183f
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            if (r2 != 0) goto L6b
        L8d:
            if (r6 == 0) goto L94
            e0.d r0 = new e0.d
            r0.<init>(r6, r5)
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.l.f(b0.a, java.util.List):e0.d");
    }

    public fe.c a() {
        if (((c0) this.f491c) != null) {
            return new fe.c(this);
        }
        throw new IllegalArgumentException("Product list must be set to a non empty list.");
    }

    @Override // oa.j
    public void b(Object obj) {
        oa.i iVar;
        i4 i4Var = ((gb.g) this.f491c).f20074c;
        synchronized (i4Var) {
            i4Var.f13781b = false;
            iVar = (oa.i) ((oa.k) i4Var.f13782c).f29860c;
        }
        if (iVar != null) {
            ((gb.a) i4Var.f13783d).c(iVar, 2441);
        }
    }

    public c7.d c(Object obj, kotlin.jvm.internal.i clazz, Activity activity, h7.b consumer) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter("addWindowLayoutInfoListener", "addMethodName");
        Intrinsics.checkNotNullParameter("removeWindowLayoutInfoListener", "removeMethodName");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Object objNewProxyInstance = Proxy.newProxyInstance((ClassLoader) this.f491c, new Class[]{l()}, new c7.c(clazz, consumer));
        Intrinsics.checkNotNullExpressionValue(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, l()).invoke(obj, activity, objNewProxyInstance);
        return new c7.d(obj.getClass().getMethod("removeWindowLayoutInfoListener", l()), obj, objNewProxyInstance);
    }

    public e0.e d(u1 u1Var, ArrayList arrayList, int i, List list) {
        if (i < arrayList.size()) {
            int i10 = i + 1;
            e0.e eVarD = d(u1Var, arrayList, i10, CollectionsKt.M(list, arrayList.get(i)));
            return eVarD instanceof e0.a ? eVarD : d(u1Var, arrayList, i10, list);
        }
        LinkedHashSet linkedHashSetD = q0.d((Set) u1Var.f231g, list);
        com.google.android.gms.internal.auth.g.e("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + linkedHashSetD + ", useCases = " + ((List) u1Var.f229e));
        d0 d0Var = (d0) this.f491c;
        c0.c cVar = new c0.c(linkedHashSetD);
        d0Var.getClass();
        Iterator it = linkedHashSetD.iterator();
        while (true) {
            if (it.hasNext()) {
                b0.a aVar = (b0.a) it.next();
                if (!aVar.b(u1Var, d0Var)) {
                    com.google.android.gms.internal.auth.g.e("CameraInfoInternal", aVar + " is not supported.");
                    break;
                }
            } else {
                try {
                    a.a.s(d0Var, u1Var, cVar);
                    return new e0.a(new c0.c(linkedHashSetD));
                } catch (IllegalArgumentException | l0.d e3) {
                    com.google.android.gms.internal.auth.g.f("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e3);
                }
            }
        }
        return e0.b.f15880a;
    }

    @Override // f.b
    public void e(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f491c;
        f.a aVar = (f.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f16448c;
        int i = o1.d(intent, "ProxyBillingActivityV2").f15636a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f2423e;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i10 = aVar.f16447b;
        if (i10 != -1 || i != 0) {
            o1.g("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i10 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // sb.a
    public Object g(Task task) {
        a1.e eVar = (a1.e) this.f491c;
        if (task.isSuccessful() || task.h()) {
            return task;
        }
        Exception exception = task.getException();
        if (!(exception instanceof na.d)) {
            return task;
        }
        int i = ((na.d) exception).f29186b.f2633b;
        return (i == 43001 || i == 43002 || i == 43003 || i == 17) ? ((bb.e) eVar.f324d).b() : i == 43000 ? b4.q(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : i != 15 ? task : b4.q(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public String h(String str, String str2) {
        ji.a aVar = (ji.a) this.f491c;
        Context contextCreateConfigurationContext = aVar.f26635b;
        if (str2 != null) {
            Locale localeA = ji.a.a(str2);
            Configuration configuration = new Configuration(aVar.f26635b.getResources().getConfiguration());
            configuration.setLocale(localeA);
            contextCreateConfigurationContext = aVar.f26635b.createConfigurationContext(configuration);
        }
        int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", aVar.f26635b.getPackageName());
        if (identifier != 0) {
            return contextCreateConfigurationContext.getResources().getString(identifier);
        }
        return null;
    }

    public void i(int i) {
        f2.g.h("The specified lens facing is invalid.", i != -1);
        ((LinkedHashSet) this.f491c).add(new m1(i));
    }

    public void j(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d8.t tVar = (d8.t) it.next();
            if (!"play_pass_subs".equals(tVar.f15700b)) {
                hashSet.add(tVar.f15700b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        this.f491c = c0.r(arrayList);
    }

    public void k() {
        k1 k1Var = (k1) this.f491c;
        synchronized (k1Var.f141r) {
            try {
                Integer num = (Integer) k1Var.f141r.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != k1Var.I()) {
                    k1Var.L();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Class l() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.f491c).loadClass("java.util.function.Consumer");
        Intrinsics.checkNotNullExpressionValue(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        k0.m mVar = (k0.m) this.f491c;
        f2.g.h("The result can only set once!", mVar.f26785g == null);
        mVar.f26785g = hVar;
        return "ListFuture[" + this + "]";
    }

    @Override // k0.c
    public void onFailure(Throwable th2) {
        j1.h hVar = (j1.h) this.f491c;
        if (th2 instanceof TimeoutException) {
            hVar.d(th2);
        } else {
            hVar.b(Collections.EMPTY_LIST);
        }
    }

    @Override // ii.o
    public void onMethodCall(ii.n nVar, ii.p pVar) {
        int i = 2;
        switch (this.f490b) {
            case 20:
                h3.e eVar = (h3.e) this.f491c;
                li.a aVar = (li.a) eVar.f20376d;
                if (aVar == null) {
                    return;
                }
                String str = nVar.f21315a;
                Object obj = nVar.f21316b;
                if (str.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj;
                        ((li.a) eVar.f20376d).b((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), (hi.g) pVar);
                        return;
                    } catch (IllegalStateException e3) {
                        ((hi.g) pVar).b("error", e3.getMessage(), null);
                        return;
                    }
                }
                if (!str.equals("ProcessText.queryTextActions")) {
                    ((hi.g) pVar).a();
                    return;
                }
                try {
                    ((hi.g) pVar).success(aVar.c());
                    return;
                } catch (IllegalStateException e7) {
                    ((hi.g) pVar).b("error", e7.getMessage(), null);
                    return;
                }
            default:
                fe.c cVar = (fe.c) this.f491c;
                m0 m0Var = (m0) cVar.f16785c;
                if (m0Var == null) {
                    return;
                }
                switch (nVar.f21315a) {
                    case "SensitiveContent.getContentSensitivity":
                        try {
                            int iK = m0Var.k();
                            if (iK == 0) {
                                i = 0;
                            } else if (iK == 1) {
                                i = 1;
                            } else if (iK != 2) {
                                i = 3;
                            }
                            ((hi.g) pVar).success(Integer.valueOf(i));
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e10) {
                            ((hi.g) pVar).b("error", e10.getMessage(), null);
                            return;
                        }
                    case "SensitiveContent.setContentSensitivity":
                        int iIntValue = ((Integer) nVar.f21316b).intValue();
                        try {
                            m0 m0Var2 = (m0) cVar.f16785c;
                            if (iIntValue == 0) {
                                i = 0;
                            } else if (iIntValue == 1) {
                                i = 1;
                            } else if (iIntValue != 2) {
                                throw new IllegalArgumentException(u.k(iIntValue, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
                            }
                            m0Var2.r(i);
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e11) {
                            ((hi.g) pVar).b("error", e11.getMessage(), null);
                            return;
                        }
                    case "SensitiveContent.isSupported":
                        m0Var.getClass();
                        ((hi.g) pVar).success(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                        return;
                    default:
                        ((hi.g) pVar).a();
                        return;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[ORIG_RETURN, RETURN] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPostMessage(android.webkit.WebView r4, java.lang.reflect.InvocationHandler r5, android.net.Uri r6, boolean r7, java.lang.reflect.InvocationHandler r8) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.l.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override // k0.c
    public void onSuccess(Object obj) {
        List list = (List) obj;
        list.getClass();
        ((j1.h) this.f491c).b(new ArrayList(list));
    }

    public /* synthetic */ l(int i, Object obj) {
        this.f490b = i;
        this.f491c = obj;
    }

    public l(zh.b bVar, int i) {
        this.f490b = i;
        switch (i) {
            case 22:
                this.f491c = new s7.g(bVar, "flutter/system", ii.k.f21313a, (Object) null);
                break;
            default:
                of ofVar = new of();
                ii.q qVar = new ii.q(bVar, "flutter/navigation", ii.l.f21314a, null);
                this.f491c = qVar;
                qVar.b(ofVar);
                break;
        }
    }

    public l(ClassLoader loader) {
        this.f490b = 8;
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.f491c = loader;
    }

    public l(ii.f fVar) {
        this.f490b = 18;
        new ii.q(fVar, "flutter/keyboard", x.f21321b, null).b(new h3.e(this));
    }

    public l(d0 cameraInfoInternal) {
        this.f490b = 13;
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        this.f491c = cameraInfoInternal;
    }

    public l(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f490b = 23;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f491c = new i2.g(uri, clipDescription, uri2);
        } else {
            this.f491c = new ka.k(uri, clipDescription, uri2, 12);
        }
    }

    public l() {
        this.f490b = 1;
        this.f491c = new LinkedHashSet();
    }
}

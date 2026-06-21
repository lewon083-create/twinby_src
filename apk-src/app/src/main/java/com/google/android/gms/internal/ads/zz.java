package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zz implements y71, com.google.android.gms.internal.consent_sdk.g0, com.google.android.gms.internal.consent_sdk.h7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f13156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f13157h;
    public final Object i;

    public /* synthetic */ zz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.f13151b = obj;
        this.f13152c = obj2;
        this.f13153d = obj3;
        this.f13154e = obj4;
        this.f13155f = obj5;
        this.f13156g = obj6;
        this.f13157h = obj7;
        this.i = obj8;
    }

    public static final g0.y b(zz zzVar, a0.w wVar) {
        Iterator it = wVar.f239a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ((a0.t) next).getClass();
            g0.k kVar = a0.t.f222a;
            if (!Intrinsics.a(kVar, kVar)) {
                synchronized (g0.d1.f19537a) {
                }
                Intrinsics.b((Context) zzVar.f13151b);
            }
        }
        return g0.z.f19810a;
    }

    public static final void c(zz zzVar, int i) {
        a0.b0 b0Var = (a0.b0) zzVar.f13156g;
        if (b0Var == null) {
            return;
        }
        t.p pVar = b0Var.f34g;
        if (pVar == null) {
            throw new IllegalStateException("CameraX not initialized yet.");
        }
        y.a aVar = pVar.f33204b;
        synchronized (aVar.f36291a) {
            try {
                int i10 = aVar.f36297g;
                if (i == i10) {
                    return;
                }
                aVar.f36297g = i;
                ArrayList<g0.n0> arrayList = new ArrayList(aVar.f36293c);
                if (i10 == 2 && i != 2) {
                    aVar.f36296f.clear();
                }
                for (g0.n0 n0Var : arrayList) {
                    synchronized (n0Var.f19685b) {
                        boolean z5 = true;
                        n0Var.f19686c = i == 2 ? 2 : 1;
                        boolean z10 = i10 != 2 && i == 2;
                        if (i10 != 2 || i == 2) {
                            z5 = false;
                        }
                        if (z10 || z5) {
                            n0Var.b();
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static w0.b d(zz zzVar, androidx.lifecycle.u uVar, a0.w wVar, a0.u1 u1Var) {
        w0.b bVarB;
        a0.g0 secondaryCompositionSettings = a0.g0.f85e;
        Trace.beginSection(com.google.android.gms.internal.auth.g.M("CX:bindToLifecycle-internal"));
        try {
            com.google.android.gms.internal.measurement.b4.e();
            a0.b0 b0Var = (a0.b0) zzVar.f13156g;
            Intrinsics.b(b0Var);
            g0.f0 camera = wVar.c(b0Var.f28a.c());
            Intrinsics.checkNotNullExpressionValue(camera, "select(...)");
            camera.o(true);
            g0.c adapterCameraInfo = zzVar.e(wVar);
            a0.v vVarG = a.a.g(adapterCameraInfo, null);
            w0.e eVar = (w0.e) zzVar.f13155f;
            synchronized (eVar.f34953a) {
                bVarB = (w0.b) eVar.f34954b.get(new w0.a(System.identityHashCode(uVar), vVarG));
            }
            Collection collectionD = ((w0.e) zzVar.f13155f).d();
            for (a0.q2 q2Var : (List) u1Var.f229e) {
                for (Object obj : collectionD) {
                    Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
                    w0.b bVar = (w0.b) obj;
                    if (bVar.r(q2Var) && !Intrinsics.a(bVar.e(), uVar)) {
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{q2Var}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (bVarB == null) {
                w0.e eVar2 = (w0.e) zzVar.f13155f;
                a0.b0 b0Var2 = (a0.b0) zzVar.f13156g;
                Intrinsics.b(b0Var2);
                com.google.firebase.messaging.y yVar = b0Var2.f37k;
                if (yVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                Intrinsics.checkNotNullParameter(camera, "camera");
                Intrinsics.checkNotNullParameter(adapterCameraInfo, "adapterCameraInfo");
                Intrinsics.checkNotNullParameter(secondaryCompositionSettings, "compositionSettings");
                Intrinsics.checkNotNullParameter(secondaryCompositionSettings, "secondaryCompositionSettings");
                bVarB = eVar2.b(uVar, new l0.f(camera, null, adapterCameraInfo, null, secondaryCompositionSettings, secondaryCompositionSettings, (y.a) yVar.f14900c, (h3.e) yVar.f14902e, (g0.a3) yVar.f14901d));
            }
            if (!((List) u1Var.f229e).isEmpty()) {
                w0.e eVar3 = (w0.e) zzVar.f13155f;
                a0.b0 b0Var3 = (a0.b0) zzVar.f13156g;
                Intrinsics.b(b0Var3);
                t.p pVar = b0Var3.f34g;
                if (pVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                eVar3.a(bVarB, u1Var, pVar.f33204b);
                ((HashSet) zzVar.i).add(new w0.a(System.identityHashCode(uVar), vVarG));
            }
            return bVarB;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r7.equals("non_personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r7.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r7.equals("CONSENT_SIGNAL_SUFFICIENT") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r7.equals("personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r7.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r7 = 3;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    @Override // com.google.android.gms.internal.consent_sdk.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zz.a(java.lang.String, org.json.JSONObject):boolean");
    }

    public g0.c e(a0.w cameraSelector) {
        Object cVar;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Trace.beginSection(com.google.android.gms.internal.auth.g.M("CX:getCameraInfo"));
        try {
            a0.b0 b0Var = (a0.b0) this.f13156g;
            Intrinsics.b(b0Var);
            g0.d0 d0VarP = cameraSelector.c(b0Var.f28a.c()).p();
            Intrinsics.checkNotNullExpressionValue(d0VarP, "getCameraInfoInternal(...)");
            g0.y yVarB = b(this, cameraSelector);
            String primaryCameraId = d0VarP.e();
            Intrinsics.checkNotNullExpressionValue(primaryCameraId, "getCameraId(...)");
            g0.k kVar = yVarB.L;
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            ArrayList cameraIds = kotlin.collections.s.g(primaryCameraId);
            Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
            a0.v vVar = new a0.v(cameraIds, kVar);
            synchronized (this.f13152c) {
                try {
                    cVar = ((HashMap) this.f13157h).get(vVar);
                    if (cVar == null) {
                        cVar = new g0.c(d0VarP, yVarB);
                        ((HashMap) this.f13157h).put(vVar, cVar);
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (g0.c) cVar;
        } finally {
            Trace.endSection();
        }
    }

    public void f() {
        Trace.beginSection(com.google.android.gms.internal.auth.g.M("CX:unbindAll"));
        try {
            com.google.android.gms.internal.measurement.b4.e();
            c(this, 0);
            ((w0.e) this.f13155f).k((HashSet) this.i);
            Unit unit = Unit.f27471a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.consent_sdk.c j() {
        Application application = (Application) ((com.google.android.gms.internal.consent_sdk.d6) this.f13151b).f13360c;
        Handler handler = com.google.android.gms.internal.consent_sdk.f0.f13385a;
        com.google.android.gms.internal.consent_sdk.h0.c(handler);
        com.google.android.gms.internal.consent_sdk.e0 e0Var = com.google.android.gms.internal.consent_sdk.f0.f13386b;
        com.google.android.gms.internal.consent_sdk.h0.c(e0Var);
        return new com.google.android.gms.internal.consent_sdk.c(application, handler, e0Var, (com.google.android.gms.internal.consent_sdk.g) ((com.google.android.gms.internal.consent_sdk.g7) this.f13153d).j(), (com.google.android.gms.internal.consent_sdk.o) ((com.google.android.gms.internal.consent_sdk.g7) this.f13154e).j(), ((com.google.android.gms.internal.consent_sdk.h4) this.f13155f).a(), ((com.google.firebase.messaging.y) this.f13156g).j(), (com.google.android.gms.internal.consent_sdk.r0) ((com.google.android.gms.internal.consent_sdk.g7) this.f13157h).j(), (com.google.android.gms.internal.consent_sdk.a0) ((com.google.android.gms.internal.consent_sdk.g7) this.i).j());
    }

    @Override // com.google.android.gms.internal.ads.y71
    public ed.d h() {
        fp fpVar = p9.k.C.f31298d;
        Context context = (Context) this.f13151b;
        j0 j0Var = new j0(0, 0, 0);
        l6.i iVar = (l6.i) this.f13154e;
        si siVar = new si();
        ph0 ph0Var = (ph0) this.f13155f;
        jq0 jq0Var = (jq0) this.f13156g;
        sd0 sd0Var = (sd0) this.f13157h;
        sz szVarE = fp.e(context, j0Var, "", false, false, (xe) this.f13152c, null, (u9.a) this.f13153d, null, iVar, siVar, null, null, ph0Var, jq0Var, sd0Var);
        ni niVar = new ni(szVarE);
        szVarE.q0().f7062h = new yz(niVar, 0);
        szVarE.loadUrl((String) this.i);
        return niVar;
    }

    public void i(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("action");
        String queryParameter2 = uri.getQueryParameter("args");
        com.google.android.gms.internal.consent_sdk.g0[] g0VarArr = {this, (s7.g) this.f13156g};
        com.google.android.gms.internal.consent_sdk.r0 r0Var = (com.google.android.gms.internal.consent_sdk.r0) this.f13155f;
        r0Var.getClass();
        r0Var.f13537a.execute(new aa.y(queryParameter, queryParameter2, g0VarArr, 4));
    }

    public zz() {
        w0.e eVar;
        this.f13152c = new Object();
        k0.l lVar = k0.l.f26777d;
        Intrinsics.checkNotNullExpressionValue(lVar, "immediateFuture(...)");
        this.f13154e = lVar;
        synchronized (w0.e.f34951f) {
            try {
                if (w0.e.f34952g == null) {
                    w0.e.f34952g = new w0.e();
                }
                eVar = w0.e.f34952g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(eVar, "getInstance(...)");
        this.f13155f = eVar;
        this.f13157h = new HashMap();
        this.i = new HashSet();
    }

    @Override // com.google.android.gms.internal.consent_sdk.g0
    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public Executor mo10h() {
        final Handler handler = (Handler) this.f13153d;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.t
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }
}

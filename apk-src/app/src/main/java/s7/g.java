package s7;

import a0.a0;
import ad.b1;
import ad.q;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.google.android.gms.internal.ads.l7;
import com.google.android.gms.internal.ads.zz;
import com.google.android.gms.internal.consent_sdk.c2;
import com.google.android.gms.internal.consent_sdk.d6;
import com.google.android.gms.internal.consent_sdk.f0;
import com.google.android.gms.internal.consent_sdk.g0;
import com.google.android.gms.internal.consent_sdk.g7;
import com.google.android.gms.internal.consent_sdk.h7;
import com.google.android.gms.internal.consent_sdk.j7;
import com.google.android.gms.internal.consent_sdk.k;
import com.google.android.gms.internal.consent_sdk.z2;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.y9;
import com.google.android.gms.internal.measurement.z5;
import com.google.firebase.messaging.y;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.yandex.varioqub.config.model.ConfigValue;
import e1.n;
import fh.zf;
import ii.o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.Message;
import j1.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i;
import n5.l;
import n5.m;
import ob.d0;
import ob.l1;
import ob.s0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pa.c0;
import t.m2;
import t.z;
import x0.b0;
import z2.h0;
import z2.j0;
import z2.m0;
import z2.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements cf.c, g0, h7, m, m2, o, n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static g f32794f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f32795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f32796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f32797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f32798e;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f32795b = obj;
        this.f32796c = obj2;
        this.f32798e = obj4;
        this.f32797d = obj3;
    }

    public static synchronized g B(Context context, x7.a aVar) {
        try {
            if (f32794f == null) {
                g gVar = new g();
                Context applicationContext = context.getApplicationContext();
                gVar.f32795b = new a(applicationContext, aVar);
                gVar.f32796c = new b(applicationContext, aVar);
                gVar.f32797d = new e(applicationContext, aVar);
                gVar.f32798e = new f(applicationContext, aVar);
                f32794f = gVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f32794f;
    }

    public static void I(long j10, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public static void u(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbK = pe.a.k(str, ": EGL error: 0x");
        sbK.append(Integer.toHexString(iEglGetError));
        throw new RuntimeException(sbK.toString());
    }

    public List A() {
        ArrayList arrayList;
        if (((ArrayList) this.f32795b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f32795b)) {
            arrayList = new ArrayList((ArrayList) this.f32795b);
        }
        return arrayList;
    }

    public w0 C(i modelClass, String key) {
        w0 viewModel;
        w0 w0VarA;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (((zf) this.f32798e)) {
            try {
                z0 z0Var = (z0) this.f32795b;
                z0Var.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                viewModel = (w0) z0Var.f1619a.get(key);
                if (modelClass.e(viewModel)) {
                    y0 y0Var = (y0) this.f32796c;
                    if (y0Var instanceof t0) {
                        t0 t0Var = (t0) y0Var;
                        Intrinsics.b(viewModel);
                        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                        p pVar = t0Var.f1594e;
                        if (pVar != null) {
                            o6.e eVar = t0Var.f1595f;
                            Intrinsics.b(eVar);
                            p0.a(viewModel, eVar, pVar);
                        }
                    }
                    Intrinsics.c(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    f3.d extras = new f3.d((f3.c) this.f32797d);
                    extras.b(p0.f1582d, key);
                    y0 factory = (y0) this.f32796c;
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    Intrinsics.checkNotNullParameter(extras, "extras");
                    try {
                        try {
                            w0VarA = factory.b(modelClass, extras);
                        } catch (AbstractMethodError unused) {
                            w0VarA = factory.a(h5.t(modelClass));
                        }
                    } catch (AbstractMethodError unused2) {
                        w0VarA = factory.e(h5.t(modelClass), extras);
                    }
                    viewModel = w0VarA;
                    z0 z0Var2 = (z0) this.f32795b;
                    z0Var2.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                    w0 w0Var = (w0) z0Var2.f1619a.put(key, viewModel);
                    if (w0Var != null) {
                        w0Var.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return viewModel;
    }

    public void D(m0 m0Var) {
        t tVar = m0Var.f45905c;
        String str = tVar.f45972f;
        HashMap map = (HashMap) this.f32796c;
        if (map.get(str) != null) {
            return;
        }
        map.put(tVar.f45972f, m0Var);
        if (h0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + tVar);
        }
    }

    public void E() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f32795b;
        EGLSurface eGLSurface = (EGLSurface) this.f32797d;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) this.f32796c)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void F(m0 m0Var) {
        HashMap map = (HashMap) this.f32796c;
        t tVar = m0Var.f45905c;
        if (tVar.C) {
            ((j0) this.f32798e).f(tVar);
        }
        if (map.get(tVar.f45972f) == m0Var && ((m0) map.put(tVar.f45972f, null)) != null && h0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + tVar);
        }
    }

    public void G() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f32795b;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void H() {
        if (!Objects.equals((EGLDisplay) this.f32795b, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglDestroySurface((EGLDisplay) this.f32795b, (EGLSurface) this.f32797d);
            EGL14.eglDestroyContext((EGLDisplay) this.f32795b, (EGLContext) this.f32796c);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f32795b);
        }
        ((Surface) this.f32798e).release();
        this.f32795b = EGL14.EGL_NO_DISPLAY;
        this.f32796c = EGL14.EGL_NO_CONTEXT;
        this.f32797d = EGL14.EGL_NO_SURFACE;
        this.f32798e = null;
    }

    public w3.b J(List list) {
        w3.b bVar;
        HashMap map = (HashMap) this.f32797d;
        ArrayList arrayListT = t(list);
        if (arrayListT.size() < 2) {
            return (w3.b) q.i(arrayListT, null);
        }
        Collections.sort(arrayListT, new d2.a(16));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i10 = ((w3.b) arrayListT.get(0)).f35027c;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayListT.size()) {
                break;
            }
            w3.b bVar2 = (w3.b) arrayListT.get(i11);
            if (i10 == bVar2.f35027c) {
                arrayList.add(new Pair(bVar2.f35026b, Integer.valueOf(bVar2.f35028d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (w3.b) arrayListT.get(0);
            }
        }
        w3.b bVar3 = (w3.b) map.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List listSubList = arrayListT.subList(0, arrayList.size());
        int i12 = 0;
        for (int i13 = 0; i13 < listSubList.size(); i13++) {
            i12 += ((w3.b) listSubList.get(i13)).f35028d;
        }
        int iNextInt = ((Random) this.f32798e).nextInt(i12);
        int i14 = 0;
        while (true) {
            if (i >= listSubList.size()) {
                bVar = (w3.b) q.j(listSubList);
                break;
            }
            bVar = (w3.b) listSubList.get(i);
            i14 += bVar.f35028d;
            if (iNextInt < i14) {
                break;
            }
            i++;
        }
        map.put(arrayList, bVar);
        return bVar;
    }

    public void K(Object obj, ii.c cVar) {
        ((ii.f) this.f32795b).g((String) this.f32796c, ((ii.m) this.f32797d).encodeMessage(obj), cVar == null ? null : new ii.a(0, this, cVar));
    }

    public void L(ii.b bVar) {
        String str = (String) this.f32796c;
        ii.f fVar = (ii.f) this.f32795b;
        t.t0 t0Var = (t.t0) this.f32798e;
        if (t0Var != null) {
            fVar.b(str, bVar != null ? new h3.e(16, (Object) this, (Object) bVar, false) : null, t0Var);
        } else {
            fVar.d(str, bVar != null ? new h3.e(16, (Object) this, (Object) bVar, false) : null);
        }
    }

    public Bundle M(Bundle bundle, String str) {
        HashMap map = (HashMap) this.f32797d;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle N() {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.g.N():android.os.Bundle");
    }

    public com.google.android.gms.internal.measurement.n O(y yVar, y3... y3VarArr) {
        com.google.android.gms.internal.measurement.n nVarB = com.google.android.gms.internal.measurement.n.B1;
        for (y3 y3Var : y3VarArr) {
            nVarB = wa.a.B(y3Var);
            rl.b.J((y) this.f32797d);
            if ((nVarB instanceof com.google.android.gms.internal.measurement.o) || (nVarB instanceof com.google.android.gms.internal.measurement.m)) {
                nVarB = ((com.google.android.gms.internal.measurement.t) this.f32795b).c(yVar, nVarB);
            }
        }
        return nVarB;
    }

    public void P(Bundle bundle) {
        String str = (String) this.f32795b;
        ob.z0 z0Var = (ob.z0) this.f32798e;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesG = z0Var.G();
        l1 l1Var = (l1) z0Var.f15951b;
        SharedPreferences.Editor editorEdit = sharedPreferencesG.edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        t8.a();
                        if (l1Var.f30263e.M(null, d0.Q0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                s0 s0Var = l1Var.f30265g;
                                l1.k(s0Var);
                                s0Var.f30411g.g(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                s0 s0Var2 = l1Var.f30265g;
                                l1.k(s0Var2);
                                s0Var2.f30411g.g(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e3) {
                        s0 s0Var3 = l1Var.f30265g;
                        l1.k(s0Var3);
                        s0Var3.f30411g.g(e3, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f32797d = bundle2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x0212. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025f  */
    @Override // com.google.android.gms.internal.consent_sdk.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r20, org.json.JSONObject r21) {
        /*
            Method dump skipped, instruction units count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.g.a(java.lang.String, org.json.JSONObject):boolean");
    }

    @Override // t.m2
    public void b(TotalCaptureResult totalCaptureResult) {
        if (((h) this.f32797d) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = (Rect) this.f32798e;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            ((h) this.f32797d).b(null);
            this.f32797d = null;
            this.f32798e = null;
        }
    }

    @Override // e1.n
    public void c(e1.h hVar) {
        if (((b0) this.f32798e).X == null) {
            ((i7.h) this.f32796c).accept(hVar);
        }
    }

    @Override // e1.n
    public void d(e1.i iVar) throws Exception {
        x0.h hVar = (x0.h) this.f32797d;
        b0 b0Var = (b0) this.f32798e;
        if (b0Var.f35546k0 == 3) {
            iVar.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }
        if (b0Var.D != null) {
            try {
                b0Var.M(iVar, hVar);
                iVar.close();
                return;
            } catch (Throwable th2) {
                try {
                    iVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (b0Var.f35555s) {
            com.google.android.gms.internal.auth.g.e("Recorder", "Drop audio data since recording is stopping.");
        } else {
            b0Var.W.c(new e1.g(iVar));
            if (b0Var.V != null) {
                com.google.android.gms.internal.auth.g.e("Recorder", "Received audio data. Starting muxer...");
                b0Var.F(hVar);
            } else {
                com.google.android.gms.internal.auth.g.e("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
            }
        }
        iVar.close();
    }

    @Override // t.m2
    public float e() {
        Float f10 = (Float) ((u.i) this.f32795b).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 != null && f10.floatValue() >= 1.0f) {
            return f10.floatValue();
        }
        return 1.0f;
    }

    @Override // e1.n
    public void f(a0 a0Var) {
        ((b0) this.f32798e).J = a0Var;
    }

    @Override // e1.n
    public void g() {
        ((h) this.f32795b).b(null);
    }

    @Override // com.google.android.gms.internal.consent_sdk.g0
    /* JADX INFO: renamed from: h */
    public Executor mo10h() {
        return (Executor) this.f32798e;
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    public /* bridge */ /* synthetic */ Object j() {
        return new z2((com.google.android.gms.internal.consent_sdk.g) ((g7) this.f32795b).j(), ((zz) this.f32796c).j(), (com.google.android.gms.internal.consent_sdk.o) ((g7) this.f32797d).j(), (com.google.android.gms.internal.consent_sdk.a0) ((g7) this.f32798e).j());
    }

    @Override // t.m2
    public float k() {
        return 1.0f;
    }

    @Override // t.m2
    public void l(s.a aVar) {
        Rect rect = (Rect) this.f32796c;
        if (rect != null) {
            aVar.c(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // t.m2
    public void m(float f10, h hVar) {
        ((Rect) ((u.i) this.f32795b).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)).getClass();
        float fWidth = r0.width() / f10;
        float fHeight = r0.height() / f10;
        float fWidth2 = (r0.width() - fWidth) / 2.0f;
        float fHeight2 = (r0.height() - fHeight) / 2.0f;
        this.f32796c = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        h hVar2 = (h) this.f32797d;
        if (hVar2 != null) {
            hVar2.d(new a0.o("There is a new zoomRatio being set"));
        }
        this.f32798e = (Rect) this.f32796c;
        this.f32797d = hVar;
    }

    @Override // cf.c
    public void n(Object obj, String str) {
        this.f32796c = "sqlite_error";
        this.f32797d = str;
        this.f32798e = obj;
    }

    @Override // t.m2
    public Rect o() {
        Rect rect = (Rect) this.f32796c;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) ((u.i) this.f32795b).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // ii.o
    public void onMethodCall(ii.n nVar, ii.p pVar) {
        final int i;
        final int i10;
        boolean z5;
        final int i11;
        yc.d dVar;
        boolean z10;
        boolean z11;
        i = 3;
        i10 = 2;
        i11 = 1;
        switch (nVar.f21315a) {
            case "ConsentInformation#reset":
                z2 z2VarZ = z();
                z2VarZ.f13633c.f13502c.set(null);
                com.google.android.gms.internal.consent_sdk.g gVar = z2VarZ.f13631a;
                Application application = gVar.f13390a;
                HashSet hashSet = gVar.f13392c;
                com.google.android.gms.internal.consent_sdk.h0.e(application, hashSet);
                hashSet.clear();
                gVar.f13391b.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
                synchronized (z2VarZ.f13634d) {
                    z2VarZ.f13637g = false;
                    break;
                }
                ((hi.g) pVar).success(null);
                return;
            case "UserMessagingPlatform#loadAndShowConsentFormIfRequired":
                Activity activity = (Activity) this.f32798e;
                if (activity == null) {
                    ((hi.g) pVar).b(CommonUrlParts.Values.FALSE_INTEGER, "UserMessagingPlatform#loadAndShowConsentFormIfRequired called before plugin has been registered to an activity.", null);
                    return;
                }
                vi.d dVar2 = new vi.d((hi.g) pVar, 0);
                com.google.android.gms.internal.consent_sdk.c cVarR = com.google.android.gms.internal.consent_sdk.c.r(activity);
                if (((z2) ((g7) cVarR.f13344h).j()).a()) {
                    dVar2.a(null);
                    return;
                }
                ((Queue) ((com.google.android.gms.internal.consent_sdk.a0) ((g7) cVarR.f13343g).j()).i.get()).add(Long.valueOf(System.currentTimeMillis()));
                com.google.android.gms.internal.consent_sdk.o oVar = (com.google.android.gms.internal.consent_sdk.o) ((g7) cVarR.f13341e).j();
                f0.a();
                oVar.a(new com.google.android.gms.internal.consent_sdk.n(activity, dVar2), new d6(i10, dVar2), true);
                return;
            case "ConsentInformation#requestConsentInfoUpdate":
                if (((Activity) this.f32798e) == null) {
                    ((hi.g) pVar).b(CommonUrlParts.Values.FALSE_INTEGER, "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", null);
                    return;
                }
                vi.b bVar = (vi.b) nVar.a(Message.JsonKeys.PARAMS);
                if (bVar == null) {
                    dVar = new yc.d(new yc.d());
                } else {
                    Activity activity2 = (Activity) this.f32798e;
                    yc.d dVar3 = new yc.d();
                    Boolean bool = bVar.f34863a;
                    if (bool != null) {
                        dVar3.f45610a = bool.booleanValue();
                    }
                    vi.a aVar = bVar.f34864b;
                    if (aVar != null) {
                        ad.m0 m0Var = new ad.m0(activity2);
                        Integer num = aVar.f34861a;
                        if (num != null) {
                            m0Var.f839c = num.intValue();
                        }
                        List list = aVar.f34862b;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((ArrayList) m0Var.f840d).add((String) it.next());
                            }
                        }
                        dVar3.f45611b = m0Var.e();
                    }
                    dVar = new yc.d(dVar3);
                }
                yc.d dVar4 = dVar;
                z2 z2VarZ2 = z();
                Activity activity3 = (Activity) this.f32798e;
                hi.g gVar2 = (hi.g) pVar;
                ti.t0 t0Var = new ti.t0(gVar2);
                g8.b bVar2 = new g8.b();
                bVar2.f20008b = gVar2;
                synchronized (z2VarZ2.f13634d) {
                    z2VarZ2.f13637g = true;
                    break;
                }
                z2VarZ2.i = dVar4;
                ((Queue) z2VarZ2.f13636f.f13319f.get()).add(Long.valueOf(System.currentTimeMillis()));
                com.google.android.gms.internal.consent_sdk.c cVar = z2VarZ2.f13632b;
                cVar.getClass();
                ((Executor) cVar.f13339c).execute(new j7(cVar, activity3, dVar4, t0Var, bVar2, 0));
                return;
            case "ConsentForm#show":
                k kVar = (k) nVar.a("consentForm");
                if (kVar == null) {
                    ((hi.g) pVar).b(CommonUrlParts.Values.FALSE_INTEGER, "ConsentForm#show", null);
                    return;
                } else {
                    kVar.a((Activity) this.f32798e, new vi.e((hi.g) pVar));
                    return;
                }
            case "ConsentForm#dispose":
                k kVar2 = (k) nVar.a("consentForm");
                if (kVar2 == null) {
                    Log.w(CommonUrlParts.Values.FALSE_INTEGER, "Called dispose on ad that has been freed");
                } else {
                    ((vi.c) this.f32795b).f34865a.remove(Integer.valueOf(kVar2.hashCode()));
                }
                ((hi.g) pVar).success(null);
                return;
            case "UserMessagingPlatform#showPrivacyOptionsForm":
                Activity activity4 = (Activity) this.f32798e;
                if (activity4 == null) {
                    ((hi.g) pVar).b(CommonUrlParts.Values.FALSE_INTEGER, "UserMessagingPlatform#showPrivacyOptionsForm called before plugin has been registered to an activity.", null);
                    return;
                }
                final vi.d dVar5 = new vi.d((hi.g) pVar, 1);
                com.google.android.gms.internal.consent_sdk.o oVar2 = (com.google.android.gms.internal.consent_sdk.o) ((g7) com.google.android.gms.internal.consent_sdk.c.r(activity4).f13341e).j();
                oVar2.getClass();
                f0.a();
                z2 z2Var = (z2) ((g7) com.google.android.gms.internal.consent_sdk.c.r(activity4).f13344h).j();
                if (z2Var == null) {
                    Handler handler = f0.f13385a;
                    final int i12 = false ? 1 : 0;
                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    dVar5.a(new n1(1, "No consentInformation.").a());
                                    break;
                                case 1:
                                    dVar5.a(new n1(3, "No valid response received yet.").a());
                                    break;
                                case 2:
                                    dVar5.a(new n1(3, "Privacy options form is not required.").a());
                                    break;
                                default:
                                    dVar5.a(new n1(3, "Privacy options form is being loading. Please try again later.").a());
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (z2Var.f13633c.f13502c.get() != null || z2Var.b() == 2) {
                    if (z2Var.b() == 2) {
                        f0.f13385a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        dVar5.a(new n1(1, "No consentInformation.").a());
                                        break;
                                    case 1:
                                        dVar5.a(new n1(3, "No valid response received yet.").a());
                                        break;
                                    case 2:
                                        dVar5.a(new n1(3, "Privacy options form is not required.").a());
                                        break;
                                    default:
                                        dVar5.a(new n1(3, "Privacy options form is being loading. Please try again later.").a());
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    k kVar3 = (k) oVar2.f13503d.get();
                    if (kVar3 == null) {
                        f0.f13385a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        dVar5.a(new n1(1, "No consentInformation.").a());
                                        break;
                                    case 1:
                                        dVar5.a(new n1(3, "No valid response received yet.").a());
                                        break;
                                    case 2:
                                        dVar5.a(new n1(3, "Privacy options form is not required.").a());
                                        break;
                                    default:
                                        dVar5.a(new n1(3, "Privacy options form is being loading. Please try again later.").a());
                                        break;
                                }
                            }
                        });
                        return;
                    } else {
                        kVar3.a(activity4, dVar5);
                        oVar2.f13501b.execute(new com.google.android.gms.internal.consent_sdk.h(i11, oVar2));
                        return;
                    }
                }
                f0.f13385a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                dVar5.a(new n1(1, "No consentInformation.").a());
                                break;
                            case 1:
                                dVar5.a(new n1(3, "No valid response received yet.").a());
                                break;
                            case 2:
                                dVar5.a(new n1(3, "Privacy options form is not required.").a());
                                break;
                            default:
                                dVar5.a(new n1(3, "Privacy options form is being loading. Please try again later.").a());
                                break;
                        }
                    }
                });
                if (z2Var.c()) {
                    synchronized (z2Var.f13635e) {
                        z11 = z2Var.f13638h;
                        break;
                    }
                    if (!z11) {
                        synchronized (z2Var.f13635e) {
                            z2Var.f13638h = true;
                            break;
                        }
                        com.google.android.gms.internal.consent_sdk.c cVar2 = z2Var.f13632b;
                        yc.d dVar6 = z2Var.i;
                        c2 c2Var = new c2(z2Var);
                        c2 c2Var2 = new c2(z2Var);
                        cVar2.getClass();
                        ((Executor) cVar2.f13339c).execute(new j7(cVar2, activity4, dVar6, c2Var, c2Var2, 0));
                        return;
                    }
                }
                boolean zC = z2Var.c();
                synchronized (z2Var.f13635e) {
                    z10 = z2Var.f13638h;
                    break;
                }
                Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zC + ", retryRequestIsInProgress=" + z10);
                return;
            case "ConsentInformation#isConsentFormAvailable":
                ((hi.g) pVar).success(Boolean.valueOf(z().f13633c.f13502c.get() != null));
                return;
            case "UserMessagingPlatform#loadConsentForm":
                Context context = (Context) this.f32796c;
                hi.g gVar3 = (hi.g) pVar;
                r3.b bVar3 = new r3.b(24, this, gVar3, z5);
                m4.d dVar7 = new m4.d(gVar3);
                com.google.android.gms.internal.consent_sdk.c cVarR2 = com.google.android.gms.internal.consent_sdk.c.r(context);
                ((Queue) ((com.google.android.gms.internal.consent_sdk.a0) ((g7) cVarR2.f13343g).j()).f13320g.get()).add(Long.valueOf(System.currentTimeMillis()));
                ((com.google.android.gms.internal.consent_sdk.o) ((g7) cVarR2.f13341e).j()).a(bVar3, dVar7, false);
                return;
            case "ConsentInformation#getPrivacyOptionsRequirementStatus":
                int iM = z.m(z().b());
                if (iM == 1) {
                    ((hi.g) pVar).success(0);
                    return;
                } else if (iM != 2) {
                    ((hi.g) pVar).success(2);
                    return;
                } else {
                    ((hi.g) pVar).success(1);
                    return;
                }
            case "ConsentInformation#canRequestAds":
                ((hi.g) pVar).success(Boolean.valueOf(z().a()));
                return;
            case "ConsentInformation#getConsentStatus":
                z2 z2VarZ3 = z();
                ((hi.g) pVar).success(Integer.valueOf(z2VarZ3.c() ? z2VarZ3.f13631a.f13391b.getInt("consent_status", 0) : 0));
                return;
            default:
                ((hi.g) pVar).a();
                return;
        }
    }

    @Override // n5.m
    public void p(byte[] bArr, int i, int i10, l lVar, m3.g gVar) {
        l3.b bVar;
        int i11;
        int i12;
        int iZ;
        int i13;
        int i14;
        int iC;
        l7 l7Var = (l7) this.f32797d;
        m3.p pVar = (m3.p) this.f32796c;
        m3.p pVar2 = (m3.p) this.f32795b;
        pVar2.K(i + i10, bArr);
        pVar2.M(i);
        if (((Inflater) this.f32798e) == null) {
            this.f32798e = new Inflater();
        }
        if (m3.z.L(pVar2, pVar, (Inflater) this.f32798e)) {
            pVar2.K(pVar.f28591c, pVar.f28589a);
        }
        int i15 = 0;
        l7Var.f7411c = 0;
        int[] iArr = l7Var.f7409a;
        m3.p pVar3 = (m3.p) l7Var.i;
        l7Var.f7412d = 0;
        l7Var.f7413e = 0;
        l7Var.f7414f = 0;
        l7Var.f7415g = 0;
        l7Var.f7416h = 0;
        pVar3.J(0);
        l7Var.f7410b = false;
        ArrayList arrayList = new ArrayList();
        while (pVar2.a() >= 3) {
            int i16 = pVar2.f28591c;
            int iZ2 = pVar2.z();
            int iG = pVar2.G();
            int i17 = pVar2.f28590b + iG;
            if (i17 > i16) {
                pVar2.M(i16);
                i11 = i15;
                bVar = null;
            } else {
                char c8 = 128;
                if (iZ2 != 128) {
                    switch (iZ2) {
                        case 20:
                            if (iG % 5 == 2) {
                                pVar2.N(2);
                                Arrays.fill(iArr, i15);
                                int i18 = iG / 5;
                                int i19 = i15;
                                while (i19 < i18) {
                                    int iZ3 = pVar2.z();
                                    char c9 = c8;
                                    double dZ = pVar2.z();
                                    double dZ2 = pVar2.z() - 128;
                                    double dZ3 = pVar2.z() - 128;
                                    iArr[iZ3] = m3.z.j((int) ((dZ3 * 1.772d) + dZ), 0, KotlinVersion.MAX_COMPONENT_VALUE) | (pVar2.z() << 24) | (m3.z.j((int) ((1.402d * dZ2) + dZ), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (m3.z.j((int) ((dZ - (0.34414d * dZ3)) - (dZ2 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 8);
                                    i19++;
                                    c8 = c9;
                                    l7Var = l7Var;
                                }
                                l7Var.f7410b = true;
                            }
                            break;
                        case 21:
                            if (iG >= 4) {
                                pVar2.N(3);
                                int i20 = iG - 4;
                                if (((128 & pVar2.z()) != 0 ? 1 : i15) == 0) {
                                    i13 = pVar3.f28590b;
                                    i14 = pVar3.f28591c;
                                    if (i13 < i14 && i20 > 0) {
                                        int iMin = Math.min(i20, i14 - i13);
                                        pVar2.k(pVar3.f28589a, i13, iMin);
                                        pVar3.M(i13 + iMin);
                                    }
                                } else if (i20 >= 7 && (iC = pVar2.C()) >= 4) {
                                    l7Var.f7415g = pVar2.G();
                                    l7Var.f7416h = pVar2.G();
                                    pVar3.J(iC - 4);
                                    i20 = iG - 11;
                                    i13 = pVar3.f28590b;
                                    i14 = pVar3.f28591c;
                                    if (i13 < i14) {
                                        int iMin2 = Math.min(i20, i14 - i13);
                                        pVar2.k(pVar3.f28589a, i13, iMin2);
                                        pVar3.M(i13 + iMin2);
                                    }
                                }
                            }
                            break;
                        case 22:
                            if (iG >= 19) {
                                l7Var.f7411c = pVar2.G();
                                l7Var.f7412d = pVar2.G();
                                pVar2.N(11);
                                l7Var.f7413e = pVar2.G();
                                l7Var.f7414f = pVar2.G();
                            }
                            break;
                    }
                    i11 = 0;
                    bVar = null;
                } else {
                    if (l7Var.f7411c == 0 || l7Var.f7412d == 0 || l7Var.f7415g == 0 || l7Var.f7416h == 0 || (i12 = pVar3.f28591c) == 0 || pVar3.f28590b != i12 || !l7Var.f7410b) {
                        bVar = null;
                    } else {
                        pVar3.M(0);
                        int i21 = l7Var.f7415g * l7Var.f7416h;
                        int[] iArr2 = new int[i21];
                        int i22 = 0;
                        while (i22 < i21) {
                            int iZ4 = pVar3.z();
                            if (iZ4 != 0) {
                                iZ = i22 + 1;
                                iArr2[i22] = iArr[iZ4];
                            } else {
                                int iZ5 = pVar3.z();
                                if (iZ5 != 0) {
                                    iZ = ((iZ5 & 64) == 0 ? iZ5 & 63 : ((iZ5 & 63) << 8) | pVar3.z()) + i22;
                                    Arrays.fill(iArr2, i22, iZ, (iZ5 & 128) == 0 ? iArr[0] : iArr[pVar3.z()]);
                                }
                            }
                            i22 = iZ;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, l7Var.f7415g, l7Var.f7416h, Bitmap.Config.ARGB_8888);
                        float f10 = l7Var.f7413e;
                        float f11 = l7Var.f7411c;
                        float f12 = f10 / f11;
                        float f13 = l7Var.f7414f;
                        float f14 = l7Var.f7412d;
                        bVar = new l3.b(null, null, null, bitmapCreateBitmap, f13 / f14, 0, 0, f12, 0, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, l7Var.f7415g / f11, l7Var.f7416h / f14, false, -16777216, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0.0f, 0);
                    }
                    i11 = 0;
                    l7Var.f7411c = 0;
                    l7Var.f7412d = 0;
                    l7Var.f7413e = 0;
                    l7Var.f7414f = 0;
                    l7Var.f7415g = 0;
                    l7Var.f7416h = 0;
                    pVar3.J(0);
                    l7Var.f7410b = false;
                }
                pVar2.M(i17);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i15 = i11;
        }
        gVar.accept(new n5.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // t.m2
    public void q() {
        this.f32798e = null;
        this.f32796c = null;
        h hVar = (h) this.f32797d;
        if (hVar != null) {
            hVar.d(new a0.o("Camera is not active."));
            this.f32797d = null;
        }
    }

    public void r(t tVar) {
        if (((ArrayList) this.f32795b).contains(tVar)) {
            throw new IllegalStateException("Fragment already added: " + tVar);
        }
        synchronized (((ArrayList) this.f32795b)) {
            ((ArrayList) this.f32795b).add(tVar);
        }
        tVar.f45977l = true;
    }

    @Override // n5.m
    public int s() {
        return 2;
    }

    @Override // cf.c
    public void success(Object obj) {
        this.f32795b = obj;
    }

    public ArrayList t(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.f32795b;
        I(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.f32796c;
        I(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            w3.b bVar = (w3.b) list.get(i);
            if (!map.containsKey(bVar.f35026b) && !map2.containsKey(Integer.valueOf(bVar.f35027c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public t v(String str) {
        m0 m0Var = (m0) ((HashMap) this.f32796c).get(str);
        if (m0Var != null) {
            return m0Var.f45905c;
        }
        return null;
    }

    public t w(String str) {
        for (m0 m0Var : ((HashMap) this.f32796c).values()) {
            if (m0Var != null) {
                t tVarW = m0Var.f45905c;
                if (!str.equals(tVarW.f45972f)) {
                    tVarW = tVarW.f45987v.f45844c.w(str);
                }
                if (tVarW != null) {
                    return tVarW;
                }
            }
        }
        return null;
    }

    public ArrayList x() {
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : ((HashMap) this.f32796c).values()) {
            if (m0Var != null) {
                arrayList.add(m0Var);
            }
        }
        return arrayList;
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : ((HashMap) this.f32796c).values()) {
            if (m0Var != null) {
                arrayList.add(m0Var.f45905c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public z2 z() {
        z2 z2Var = (z2) this.f32797d;
        if (z2Var != null) {
            return z2Var;
        }
        z2 z2Var2 = (z2) ((g7) com.google.android.gms.internal.consent_sdk.c.r((Context) this.f32796c).f13344h).j();
        this.f32797d = z2Var2;
        return z2Var2;
    }

    public g(int i) {
        switch (i) {
            case 13:
                this.f32795b = new m3.p();
                this.f32796c = new m3.p();
                this.f32797d = new l7(1);
                break;
            case 19:
                Random random = new Random();
                this.f32797d = new HashMap();
                this.f32798e = random;
                this.f32795b = new HashMap();
                this.f32796c = new HashMap();
                break;
            case 22:
                this.f32795b = new ArrayList();
                this.f32796c = new HashMap();
                this.f32797d = new HashMap();
                break;
            default:
                com.google.android.gms.internal.measurement.t tVar = new com.google.android.gms.internal.measurement.t(0);
                this.f32795b = tVar;
                y yVar = new y((y) null, tVar);
                this.f32797d = yVar;
                this.f32796c = yVar.C();
                z5 z5Var = new z5(1);
                this.f32798e = z5Var;
                yVar.E("require", new y9(z5Var));
                ((HashMap) z5Var.f14118a).put("internal.platform", g1.f13753b);
                yVar.E("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE)));
                break;
        }
    }

    public g(ob.z0 z0Var, String str) {
        this.f32798e = z0Var;
        c0.f(str);
        this.f32795b = str;
        this.f32796c = new Bundle();
    }

    public g(z0 store, y0 factory, f3.c defaultExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.f32795b = store;
        this.f32796c = factory;
        this.f32797d = defaultExtras;
        this.f32798e = new zf();
    }

    public g(b1 b1Var, n3.i iVar, n3.i iVar2, n3.i iVar3) {
        Object objR;
        if (b1Var != null) {
            objR = ad.j0.r(b1Var);
        } else {
            ad.h0 h0Var = ad.j0.f818c;
            objR = b1.f768f;
        }
        this.f32795b = objR;
        this.f32796c = iVar;
        this.f32797d = iVar2;
        this.f32798e = iVar3;
    }
}

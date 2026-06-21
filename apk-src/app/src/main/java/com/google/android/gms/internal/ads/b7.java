package com.google.android.gms.internal.ads;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b7 implements b2, yz1, q4.m, d8.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3660e;

    public /* synthetic */ b7(b bVar, uz1 uz1Var, boolean z5, int[] iArr) {
        this.f3658c = bVar;
        this.f3659d = uz1Var;
        this.f3657b = z5;
        this.f3660e = iArr;
    }

    @Override // q4.m
    public void G() {
        SparseArray sparseArray = (SparseArray) this.f3660e;
        ((q4.m) this.f3658c).G();
        if (this.f3657b) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((n5.o) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b2
    public w2 O(int i, int i10) {
        b2 b2Var = (b2) this.f3658c;
        if (i10 != 3) {
            this.f3657b = true;
            return b2Var.O(i, i10);
        }
        SparseArray sparseArray = (SparseArray) this.f3660e;
        c7 c7Var = (c7) sparseArray.get(i);
        if (c7Var != null) {
            return c7Var;
        }
        c7 c7Var2 = new c7(b2Var.O(i, 3), (z6) this.f3659d);
        sparseArray.put(i, c7Var2);
        return c7Var2;
    }

    @Override // q4.m
    public q4.a0 P(int i, int i10) {
        SparseArray sparseArray = (SparseArray) this.f3660e;
        q4.m mVar = (q4.m) this.f3658c;
        if (i10 != 3) {
            this.f3657b = true;
            return mVar.P(i, i10);
        }
        n5.o oVar = (n5.o) sparseArray.get(i);
        if (oVar != null) {
            return oVar;
        }
        n5.o oVar2 = new n5.o(mVar.P(i, i10), (n5.k) this.f3659d);
        sparseArray.put(i, oVar2);
        return oVar2;
    }

    @Override // com.google.android.gms.internal.ads.b2
    public void U(o2 o2Var) {
        ((b2) this.f3658c).U(o2Var);
    }

    public l6.i a() {
        Intent intent = (Intent) this.f3658c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f3657b);
        ((ob.z) this.f3659d).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i >= 34) {
            if (((ActivityOptions) this.f3660e) == null) {
                this.f3660e = ActivityOptions.makeBasic();
            }
            f0.g.l((ActivityOptions) this.f3660e);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.f3660e) == null) {
                this.f3660e = ActivityOptions.makeBasic();
            }
            h2.d.e((ActivityOptions) this.f3660e, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f3660e;
        return new l6.i(24, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    @Override // com.google.android.gms.internal.ads.yz1
    public r51 b(int i, pi piVar, int[] iArr) {
        b bVar = (b) this.f3658c;
        uz1 uz1Var = (uz1) this.f3659d;
        qz1 qz1Var = new qz1(bVar, uz1Var);
        int i10 = ((int[]) this.f3660e)[i];
        v41 v41Var = x41.f12018c;
        fs1.y(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < piVar.f9070a) {
            int i13 = i;
            pi piVar2 = piVar;
            pz1 pz1Var = new pz1(i13, piVar2, i11, uz1Var, iArr[i11], this.f3657b, qz1Var);
            int length = objArrCopyOf.length;
            int i14 = i12 + 1;
            int iD = s41.d(length, i14);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i12] = pz1Var;
            i11++;
            i12 = i14;
            i = i13;
            piVar = piVar2;
        }
        return x41.x(i12, objArrCopyOf);
    }

    public void c() {
        m3.v vVar = (m3.v) this.f3660e;
        if (this.f3657b) {
            vVar.c(new io.appmetrica.analytics.impl.lp(10, this));
            this.f3657b = false;
        }
    }

    public String d() {
        if (!this.f3657b) {
            this.f3657b = true;
            ob.z0 z0Var = (ob.z0) this.f3660e;
            this.f3659d = z0Var.G().getString((String) this.f3658c, null);
        }
        return (String) this.f3659d;
    }

    public void e(String str) {
        SharedPreferences.Editor editorEdit = ((ob.z0) this.f3660e).G().edit();
        editorEdit.putString((String) this.f3658c, str);
        editorEdit.apply();
        this.f3659d = str;
    }

    @Override // q4.m
    public void j(q4.t tVar) {
        ((q4.m) this.f3658c).j(tVar);
    }

    @Override // d8.f
    public void onBillingServiceDisconnected() {
        m4.d dVar = ((yi.g0) this.f3660e).f45664f;
        Long l10 = (Long) this.f3659d;
        t9.h0 h0Var = new t9.h0();
        dVar.getClass();
        String str = "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected";
        new s7.g((ii.f) dVar.f28630b, str, yi.d.f45645a, (Object) null).K(new ArrayList(Collections.singletonList(l10)), new oi.i(23, h0Var, str));
    }

    @Override // d8.f
    public void onBillingSetupFinished(d8.j jVar) {
        if (this.f3657b) {
            Log.d("InAppPurchasePlugin", "Tried to call onBillingSetupFinished multiple times.");
        } else {
            this.f3657b = true;
            ((jh.b) this.f3658c).e(ya.e.h(jVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.b2
    public void u() {
        ((b2) this.f3658c).u();
        if (!this.f3657b) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.f3660e;
            if (i >= sparseArray.size()) {
                return;
            }
            ((c7) sparseArray.valueAt(i)).i = true;
            i++;
        }
    }

    public b7(ua uaVar) {
        this.f3657b = false;
        this.f3658c = null;
        this.f3659d = null;
        this.f3660e = uaVar;
    }

    public b7(Object obj, ga gaVar) {
        this.f3657b = false;
        this.f3658c = obj;
        this.f3659d = gaVar;
        this.f3660e = null;
    }

    public b7(b2 b2Var, z6 z6Var) {
        this.f3658c = b2Var;
        this.f3659d = z6Var;
        this.f3660e = new SparseArray();
    }

    public b7(ob.z0 z0Var, String str) {
        this.f3660e = z0Var;
        pa.c0.f(str);
        this.f3658c = str;
    }

    public b7(Context context, b bVar, Boolean bool) {
        AudioManager audioManagerC = context == null ? null : nz.c(context);
        if (audioManagerC == null || (bool != null && bool.booleanValue())) {
            this.f3658c = null;
            this.f3657b = false;
            this.f3659d = null;
            this.f3660e = null;
            return;
        }
        Spatializer spatializer = audioManagerC.getSpatializer();
        this.f3658c = spatializer;
        this.f3657b = spatializer.getImmersiveAudioLevel() != 0;
        vz1 vz1Var = new vz1(this, bVar);
        this.f3660e = vz1Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.f3659d = handler;
        spatializer.addOnSpatializerStateChangedListener(new ja(handler, 2), vz1Var);
    }

    public b7(q4.m mVar, n5.k kVar) {
        this.f3658c = mVar;
        this.f3659d = kVar;
        this.f3660e = new SparseArray();
    }

    public b7(Context context, Looper looper, Looper looper2, s3.t tVar, m3.t tVar2) {
        this.f3658c = context.getApplicationContext();
        this.f3660e = tVar2.a(looper, null);
        this.f3659d = new k3.a(this, tVar2.a(looper2, null), tVar);
    }

    public b7(Context context, String str, l6.i iVar, boolean z5) {
        this.f3658c = context;
        this.f3659d = str;
        this.f3660e = iVar;
        this.f3657b = z5;
    }

    public b7(yi.g0 g0Var, jh.b bVar, Long l10) {
        this.f3660e = g0Var;
        this.f3658c = bVar;
        this.f3659d = l10;
        this.f3657b = false;
    }

    public b7() {
        this.f3658c = new Intent("android.intent.action.VIEW");
        this.f3659d = new ob.z(24);
        this.f3657b = true;
    }

    public b7(com.google.firebase.messaging.y yVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f3658c = intent;
        this.f3659d = new ob.z(24);
        this.f3657b = true;
        if (yVar != null) {
            intent.setPackage(((ComponentName) yVar.f14902e).getPackageName());
            q.f fVar = (q.f) yVar.f14901d;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", fVar);
            intent.putExtras(bundle);
        }
    }

    public b7(Context context, l4.p pVar, Boolean bool) {
        AudioManager audioManagerN = context == null ? null : k3.f.n(context);
        if (audioManagerN != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = audioManagerN.getSpatializer();
            this.f3658c = spatializer;
            this.f3657b = spatializer.getImmersiveAudioLevel() != 0;
            l4.k kVar = new l4.k(pVar);
            this.f3660e = kVar;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            Handler handler = new Handler(looperMyLooper);
            this.f3659d = handler;
            spatializer.addOnSpatializerStateChangedListener(new s3.x(1, handler), kVar);
            return;
        }
        this.f3658c = null;
        this.f3657b = false;
        this.f3659d = null;
        this.f3660e = null;
    }
}

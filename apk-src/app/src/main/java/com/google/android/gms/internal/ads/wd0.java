package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f11749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u9.l f11750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ba.a f11752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11754h;
    public final AtomicBoolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f11755j;

    public wd0(gx gxVar, u9.l lVar, ka.k kVar, ba.a aVar, Context context) {
        HashMap map = new HashMap();
        this.f11747a = map;
        this.i = new AtomicBoolean();
        this.f11755j = new AtomicReference(new Bundle());
        this.f11749c = gxVar;
        this.f11750d = lVar;
        wk wkVar = al.f3223u2;
        q9.s sVar = q9.s.f31967e;
        this.f11751e = ((Boolean) sVar.f31970c.a(wkVar)).booleanValue();
        this.f11752f = aVar;
        wk wkVar2 = al.f3296z2;
        yk ykVar = sVar.f31970c;
        this.f11753g = ((Boolean) ykVar.a(wkVar2)).booleanValue();
        this.f11754h = ((Boolean) ykVar.a(al.J7)).booleanValue();
        this.f11748b = context;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put(OperatingSystem.TYPE, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        p9.k kVar2 = p9.k.C;
        t9.g0 g0Var = kVar2.f31297c;
        bx bxVar = kVar2.f31302h;
        map.put(Device.TYPE, t9.g0.Q());
        map.put(App.TYPE, (String) kVar.f27325d);
        Context context2 = (Context) kVar.f27324c;
        map.put("is_lite_sdk", true != t9.g0.g(context2) ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        ArrayList arrayListZ = sVar.f31968a.z();
        if (((Boolean) ykVar.a(al.E7)).booleanValue()) {
            arrayListZ.addAll(bxVar.g().n().i);
        }
        map.put("e", TextUtils.join(StringUtils.COMMA, arrayListZ));
        map.put("sdkVersion", (String) kVar.f27326e);
        if (((Boolean) ykVar.a(al.Bc)).booleanValue()) {
            map.put("is_bstar", true != t9.g0.e(context2) ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        }
        if (((Boolean) ykVar.a(al.Ga)).booleanValue() && ((Boolean) ykVar.a(al.O2)).booleanValue()) {
            String str = bxVar.f3946g;
            map.put("plugin", str == null ? "" : str);
        }
    }

    public final void a(Map map, boolean z5) {
        if (map.isEmpty()) {
            u9.i.c("Empty paramMap.");
            return;
        }
        b(map);
        String strA = this.f11752f.a(map);
        t9.c0.m(strA);
        boolean z10 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f11751e) {
            if (!z5 || this.f11753g) {
                if (!z10 || this.f11754h) {
                    this.f11749c.execute(new xd0(this, strA, 0));
                }
            }
        }
    }

    public final void b(Map map) {
        Bundle bundleE;
        if (map == null || map.isEmpty()) {
            u9.i.c("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.i.getAndSet(true);
        AtomicReference atomicReference = this.f11755j;
        if (!andSet) {
            String str = (String) q9.s.f31967e.f31970c.a(al.Lb);
            gw gwVar = new gw(this, str);
            if (TextUtils.isEmpty(str)) {
                bundleE = Bundle.EMPTY;
            } else {
                Context context = this.f11748b;
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(gwVar);
                bundleE = com.google.android.gms.internal.auth.m.E(context, str);
            }
            atomicReference.set(bundleE);
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }
}

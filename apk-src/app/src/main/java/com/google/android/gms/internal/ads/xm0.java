package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import io.sentry.ProfilingTraceData;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xm0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq0 f12198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PackageInfo f12199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t9.e0 f12200c;

    public xm0(iq0 iq0Var, PackageInfo packageInfo, t9.e0 e0Var) {
        this.f12198a = iq0Var;
        this.f12199b = packageInfo;
        this.f12200c = e0Var;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        int i;
        JSONObject jSONObject;
        String str;
        JSONArray jSONArrayOptJSONArray;
        int i10;
        iq0 iq0Var = this.f12198a;
        ArrayList<String> arrayList = iq0Var.f6576h;
        w50 w50Var = (w50) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            w50Var.f11646a.putInt("native_version", 0);
            return;
        }
        Bundle bundle = w50Var.f11646a;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", iq0Var.i);
        wm wmVar = iq0Var.f6577j;
        if (wmVar != null) {
            if (wmVar.f11844b > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i11 = wmVar.i;
                String str2 = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
                if (!"unknown".equals(str2)) {
                    bundle.putString("native_media_orientation", str2);
                }
            }
            int i12 = wmVar.f11846d;
            String str3 = i12 != 0 ? i12 != 1 ? i12 != 2 ? "unknown" : "landscape" : "portrait" : "any";
            if (!"unknown".equals(str3)) {
                bundle.putString("native_image_orientation", str3);
            }
            bundle.putBoolean("native_multiple_images", wmVar.f11847e);
            bundle.putBoolean("use_custom_mute", wmVar.f11850h);
            wm wmVar2 = this.f12198a.f6577j;
            if (wmVar2 != null && (i10 = wmVar2.f11851j) != 0) {
                bundle.putBoolean("sccg_tap", wmVar2.f11852k);
                bundle.putInt("sccg_dir", i10);
            }
        }
        PackageInfo packageInfo = this.f12199b;
        int i13 = packageInfo != null ? packageInfo.versionCode : 0;
        t9.e0 e0Var = this.f12200c;
        e0Var.i();
        synchronized (e0Var.f33564a) {
            i = e0Var.f33580r;
        }
        if (i13 > i) {
            e0Var.i();
            synchronized (e0Var.f33564a) {
                try {
                    e0Var.f33582t = new JSONObject();
                    SharedPreferences.Editor editor = e0Var.f33570g;
                    if (editor != null) {
                        editor.remove("native_advanced_settings");
                        e0Var.f33570g.apply();
                    }
                    e0Var.j();
                } finally {
                }
            }
            e0Var.i();
            synchronized (e0Var.f33564a) {
                try {
                    if (e0Var.f33580r != i13) {
                        e0Var.f33580r = i13;
                        SharedPreferences.Editor editor2 = e0Var.f33570g;
                        if (editor2 != null) {
                            editor2.putInt(ProfilingTraceData.JsonKeys.VERSION_CODE, i13);
                            e0Var.f33570g.apply();
                        }
                        e0Var.j();
                    }
                } finally {
                }
            }
        }
        e0Var.i();
        synchronized (e0Var.f33564a) {
            jSONObject = e0Var.f33582t;
        }
        String string = null;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(iq0Var.f6575g)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i14 = iq0Var.f6579l;
        if (i14 > 1) {
            bundle.putInt("max_num_ads", i14);
        }
        wp wpVar = iq0Var.f6570b;
        if (wpVar != null) {
            String str4 = wpVar.f11866d;
            if (TextUtils.isEmpty(str4)) {
                if (wpVar.f11864b >= 2) {
                    int i15 = wpVar.f11867e;
                    str = (i15 == 2 || i15 != 3) ? "l" : "p";
                } else {
                    int i16 = wpVar.f11865c;
                    if (i16 == 1) {
                        str = "l";
                    } else if (i16 != 2) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 41);
                        sb2.append("Instream ad video aspect ratio ");
                        sb2.append(i16);
                        sb2.append(" is wrong.");
                        u9.i.e(sb2.toString());
                        str = "l";
                    } else {
                        str = "p";
                    }
                }
                bundle.putString("ia_var", str);
            } else {
                bundle.putString("ad_tag", str4);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f2960cd)).booleanValue() || wmVar == null) {
            return;
        }
        q9.b3 b3Var = wmVar.f11849g;
        if (b3Var != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", b3Var.f31791b);
            bundle2.putBoolean("clickToExpandRequested", b3Var.f31793d);
            bundle2.putBoolean("customControlsRequested", b3Var.f31792c);
            bundle.putBundle(RRWebVideoEvent.EVENT_TAG, bundle2);
        }
        bundle.putBoolean("disable_image_loading", wmVar.f11845c);
        bundle.putInt("preferred_ad_choices_position", wmVar.f11848f);
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void i(Object obj) {
        int i;
        iq0 iq0Var = this.f12198a;
        ArrayList arrayList = iq0Var.f6576h;
        w50 w50Var = (w50) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Bundle bundle = w50Var.f11647b;
        wm wmVar = iq0Var.f6577j;
        if (wmVar == null || (i = wmVar.f11851j) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", wmVar.f11852k);
        bundle.putInt("sccg_dir", i);
    }
}

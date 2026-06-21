package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yk implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f12646g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12640a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConditionVariable f12641b = new ConditionVariable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f12642c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f12643d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f12644e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f12645f = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JSONObject f12647h = new JSONObject();
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12648j = false;

    public final Object a(wk wkVar) {
        if (!this.f12641b.block(5000L)) {
            synchronized (this.f12640a) {
                try {
                    if (!this.f12643d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f12642c || this.f12644e == null || this.f12648j) {
            synchronized (this.f12640a) {
                if (this.f12642c && this.f12644e != null && !this.f12648j) {
                }
                return wkVar.c();
            }
        }
        int i = wkVar.f11822a;
        if (i != 2) {
            if (i == 1 && this.f12647h.has(wkVar.f11823b)) {
                return wkVar.a(this.f12647h);
            }
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return wkVar.b(this.f12644e);
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        Bundle bundle = this.f12645f;
        if (bundle == null) {
            return wkVar.c();
        }
        switch (wkVar.f11826e) {
            case 0:
                String str = wkVar.f11823b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) wkVar.c();
            case 1:
                String str2 = wkVar.f11823b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str2)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str2))) : (Integer) wkVar.c();
            case 2:
                String str3 = wkVar.f11823b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str3)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str3))) : (Long) wkVar.c();
            case 3:
                String str4 = wkVar.f11823b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str4)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str4))) : (Float) wkVar.c();
            default:
                String str5 = wkVar.f11823b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str5)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str5)) : (String) wkVar.c();
        }
    }

    public final Object b(wk wkVar) {
        return (this.f12642c || this.f12643d) ? a(wkVar) : wkVar.c();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!"flag_configuration".equals(str) || sharedPreferences == null) {
            return;
        }
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                String string = sharedPreferences.getString("flag_configuration", "{}");
                StrictMode.setThreadPolicy(threadPolicy);
                this.f12647h = new JSONObject(string);
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (JSONException unused) {
        }
    }
}

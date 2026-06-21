package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gw implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5921c;

    public /* synthetic */ gw(wd0 wd0Var, String str) {
        this.f5919a = 1;
        this.f5921c = wd0Var;
        this.f5920b = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f5919a) {
            case 0:
                iw iwVar = (iw) this.f5921c;
                synchronized (iwVar) {
                    try {
                        for (hw hwVar : iwVar.f6626b) {
                            String str2 = (String) this.f5920b;
                            iw iwVar2 = hwVar.f6275a;
                            HashMap map = hwVar.f6276b;
                            iwVar2.getClass();
                            if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                                n90 n90Var = iwVar2.f6628d;
                                ((ua.a) n90Var.f8248c).getClass();
                                ((zv) n90Var.f8249d).a(-1, System.currentTimeMillis());
                            }
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 1:
                wd0 wd0Var = (wd0) this.f5921c;
                String str3 = (String) this.f5920b;
                wd0Var.f11755j.set(com.google.android.gms.internal.auth.m.E(wd0Var.f11748b, str3));
                return;
            default:
                JSONObject jSONObject = (JSONObject) this.f5920b;
                if (str != null && ((List) this.f5921c).contains(str)) {
                    try {
                        Object obj = sharedPreferences.getAll().get(str);
                        if (obj == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj);
                        }
                        return;
                    } catch (JSONException e3) {
                        p9.k.C.f31302h.e("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e3);
                        return;
                    }
                }
                return;
        }
    }

    public gw() {
        this.f5919a = 2;
        this.f5920b = new JSONObject();
    }

    public gw(iw iwVar, String str) {
        this.f5919a = 0;
        Objects.requireNonNull(iwVar);
        this.f5921c = iwVar;
        this.f5920b = str;
    }
}

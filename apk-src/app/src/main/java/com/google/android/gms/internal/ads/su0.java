package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class su0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WindowManager f10392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f10393b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static float f10394c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i, int i10, int i11, int i12) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f10394c);
            jSONObject.put("y", i10 / f10394c);
            jSONObject.put("width", i11 / f10394c);
            jSONObject.put("height", i12 / f10394c);
            return jSONObject;
        } catch (JSONException e3) {
            vv.m("Error with creating viewStateObject", e3);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e3) {
            StringBuilder sb2 = new StringBuilder(str.length() + 47);
            sb2.append("JSONException during JSONObject.put for name [");
            sb2.append(str);
            sb2.append("]");
            vv.m(sb2.toString(), e3);
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    public static void d(JSONObject jSONObject) {
        float f10;
        float f11;
        if (f10392a != null) {
            Point point = new Point(0, 0);
            f10392a.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = f10394c;
            f10 = f12 / f13;
            f11 = point.y / f13;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f11);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(org.json.JSONObject r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.su0.e(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}

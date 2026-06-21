package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j30 implements vq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dh f6698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PowerManager f6699d;

    public j30(Context context, dh dhVar) {
        this.f6697b = context;
        this.f6698c = dhVar;
        this.f6699d = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.vq
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject i(m30 m30Var) throws JSONException {
        boolean z5;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        eh ehVar = m30Var.f7756e;
        if (ehVar == null) {
            jSONObject = new JSONObject();
        } else {
            dh dhVar = this.f6698c;
            if (dhVar.f4567b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z10 = ehVar.f4943a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", dhVar.f4569d).put("activeViewJSON", dhVar.f4567b).put("timestamp", m30Var.f7754c).put("adFormat", dhVar.f4566a).put("hashCode", dhVar.f4568c).put("isMraid", false).put("isStopped", false).put("isPaused", m30Var.f7753b).put("isNative", dhVar.f4570e).put("isScreenOn", this.f6699d.isInteractive());
            t9.a aVar = p9.k.C.i;
            synchronized (aVar) {
                z5 = aVar.f33541a;
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("appMuted", z5).put("appVolume", r10.i.a());
            Context context = this.f6697b;
            jSONObjectPut2.put("deviceVolume", t9.a.b(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut3 = jSONObject3.put("windowVisibility", ehVar.f4944b).put("isAttachedToWindow", z10);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = ehVar.f4945c;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("viewBox", jSONObject4.put(RRWebVideoEvent.JsonKeys.TOP, rect.top).put("bottom", rect.bottom).put(RRWebVideoEvent.JsonKeys.LEFT, rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = ehVar.f4946d;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("adBox", jSONObject5.put(RRWebVideoEvent.JsonKeys.TOP, rect2.top).put("bottom", rect2.bottom).put(RRWebVideoEvent.JsonKeys.LEFT, rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = ehVar.f4947e;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("globalVisibleBox", jSONObject6.put(RRWebVideoEvent.JsonKeys.TOP, rect3.top).put("bottom", rect3.bottom).put(RRWebVideoEvent.JsonKeys.LEFT, rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", ehVar.f4948f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = ehVar.f4949g;
            JSONObject jSONObjectPut7 = jSONObjectPut6.put("localVisibleBox", jSONObject7.put(RRWebVideoEvent.JsonKeys.TOP, rect4.top).put("bottom", rect4.bottom).put(RRWebVideoEvent.JsonKeys.LEFT, rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", ehVar.f4950h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = ehVar.i;
            jSONObjectPut7.put("hitBox", jSONObject8.put(RRWebVideoEvent.JsonKeys.TOP, rect5.top).put("bottom", rect5.bottom).put(RRWebVideoEvent.JsonKeys.LEFT, rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", m30Var.f7752a);
            if (((Boolean) q9.s.f31967e.f31970c.a(al.N1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = ehVar.f4952k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put(RRWebVideoEvent.JsonKeys.TOP, rect6.top).put("bottom", rect6.bottom).put(RRWebVideoEvent.JsonKeys.LEFT, rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(m30Var.f7755d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vu0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vu0 f11481g = new vu0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Handler f11482h = new Handler(Looper.getMainLooper());
    public static Handler i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ke f11483j = new ke(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ke f11484k = new ke(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11490f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11485a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11486b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yi0 f11488d = new yi0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zd1 f11487c = new zd1(21);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ut f11489e = new ut(20, new oq0(28));

    public static void b() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(f11483j);
            i.postDelayed(f11484k, 200L);
        }
    }

    public final void a(View view, nu0 nu0Var, JSONObject jSONObject, boolean z5) {
        Object obj;
        boolean z10;
        int i10;
        if (ix.f(view) == null) {
            yi0 yi0Var = this.f11488d;
            char c8 = ((HashSet) yi0Var.f12626f).contains(view) ? (char) 1 : yi0Var.f12622b ? (char) 2 : (char) 3;
            if (c8 == 3) {
                return;
            }
            JSONObject jSONObjectF = nu0Var.f(view);
            su0.c(jSONObject, jSONObjectF);
            HashMap map = (HashMap) yi0Var.f12623c;
            if (map.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) map.get(view);
                if (obj2 != null) {
                    map.remove(view);
                }
                obj = obj2;
            }
            boolean z11 = false;
            if (obj != null) {
                try {
                    jSONObjectF.put("adSessionId", obj);
                } catch (JSONException e3) {
                    vv.m("Error with setting ad session id", e3);
                }
                WeakHashMap weakHashMap = (WeakHashMap) yi0Var.f12630k;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z11 = true;
                }
                try {
                    jSONObjectF.put("hasWindowFocus", Boolean.valueOf(z11));
                } catch (JSONException e7) {
                    vv.m("Error with setting has window focus", e7);
                }
                boolean zContains = ((HashSet) yi0Var.f12629j).contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectF.put("isPipActive", objValueOf);
                    } catch (JSONException e10) {
                        vv.m("Error with setting is picture-in-picture active", e10);
                    }
                }
                yi0Var.f12622b = true;
                return;
            }
            HashMap map2 = (HashMap) yi0Var.f12624d;
            uu0 uu0Var = (uu0) map2.get(view);
            if (uu0Var != null) {
                map2.remove(view);
            }
            if (uu0Var != null) {
                iu0 iu0Var = uu0Var.f11099a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = uu0Var.f11100b;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    jSONArray.put((String) arrayList.get(i11));
                }
                try {
                    jSONObjectF.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectF.put("friendlyObstructionClass", iu0Var.f6614b);
                    jSONObjectF.put("friendlyObstructionPurpose", iu0Var.f6615c);
                    jSONObjectF.put("friendlyObstructionReason", iu0Var.f6616d);
                } catch (JSONException e11) {
                    vv.m("Error with setting friendly obstruction", e11);
                }
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = z5 || z10;
            boolean z13 = c8 == 1;
            nu0Var.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z13) {
                    for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                        a(viewGroup.getChildAt(i12), nu0Var, jSONObjectF, z12);
                    }
                    return;
                }
                HashMap map3 = new HashMap();
                for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                    View childAt = viewGroup.getChildAt(i13);
                    ArrayList arrayList2 = (ArrayList) map3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        map3.put(Float.valueOf(childAt.getZ()), arrayList2);
                    }
                    arrayList2.add(childAt);
                }
                ArrayList arrayList3 = new ArrayList(map3.keySet());
                Collections.sort(arrayList3);
                int size2 = arrayList3.size();
                int i14 = 0;
                while (i14 < size2) {
                    ArrayList arrayList4 = (ArrayList) map3.get((Float) arrayList3.get(i14));
                    int size3 = arrayList4.size();
                    int i15 = 0;
                    while (true) {
                        i10 = i14 + 1;
                        if (i15 < size3) {
                            a((View) arrayList4.get(i15), nu0Var, jSONObjectF, z12);
                            i15++;
                        }
                    }
                    i14 = i10;
                }
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yu0 extends wu0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f12745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f12746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12748f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(ut utVar, HashSet hashSet, JSONObject jSONObject, long j10, int i) {
        super(utVar);
        this.f12748f = i;
        this.f12745c = new HashSet(hashSet);
        this.f12746d = jSONObject;
        this.f12747e = j10;
    }

    @Override // com.google.android.gms.internal.ads.wu0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        fu0 fu0Var;
        switch (this.f12748f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (fu0Var = fu0.f5441c) != null) {
                    for (ut0 ut0Var : Collections.unmodifiableCollection(fu0Var.f5442a)) {
                        if (this.f12745c.contains(ut0Var.f11069g)) {
                            ou0 ou0Var = ut0Var.f11066d;
                            if (this.f12747e >= ou0Var.f8804c) {
                                ou0Var.f8805d = 2;
                                c6.f4048h.A(ou0Var.c(), "setNativeViewHierarchy", str, ou0Var.f8802a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public void b(String str) {
        fu0 fu0Var = fu0.f5441c;
        if (fu0Var != null) {
            for (ut0 ut0Var : Collections.unmodifiableCollection(fu0Var.f5442a)) {
                if (this.f12745c.contains(ut0Var.f11069g)) {
                    ou0 ou0Var = ut0Var.f11066d;
                    if (this.f12747e >= ou0Var.f8804c && ou0Var.f8805d != 3) {
                        ou0Var.f8805d = 3;
                        c6.f4048h.A(ou0Var.c(), "setNativeViewHierarchy", str, ou0Var.f8802a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f12748f) {
            case 0:
                return this.f12746d.toString();
            default:
                ut utVar = this.f11899b;
                JSONObject jSONObject = (JSONObject) utVar.f11061c;
                JSONObject jSONObject2 = this.f12746d;
                if (su0.e(jSONObject2, jSONObject)) {
                    return null;
                }
                utVar.f11061c = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.wu0, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f12748f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}

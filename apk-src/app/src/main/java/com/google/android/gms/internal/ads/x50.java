package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x50 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12047e;

    public /* synthetic */ x50(or0 or0Var, ku kuVar, or0 or0Var2) {
        this.f12044b = 1;
        this.f12045c = or0Var;
        this.f12046d = kuVar;
        this.f12047e = or0Var2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        int i = this.f12044b;
        Object obj = this.f12047e;
        Object obj2 = this.f12045c;
        Object obj3 = this.f12046d;
        switch (i) {
            case 0:
                y50 y50Var = (y50) obj3;
                Bundle bundle2 = (Bundle) obj;
                w50 w50Var = (w50) ((or0) obj2).f8767d.get();
                Bundle bundle3 = w50Var.f11646a;
                String str = (String) ((ed.d) ((js1) y50Var.f12508j).j()).get();
                boolean z5 = false;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.M7)).booleanValue() && ((t9.e0) y50Var.f12510l).t()) {
                    z5 = true;
                }
                String str2 = (String) y50Var.f12506g;
                PackageInfo packageInfo = (PackageInfo) y50Var.i;
                ArrayList arrayList = (ArrayList) y50Var.f12507h;
                String str3 = (String) y50Var.f12505f;
                return new ku(bundle3, (u9.a) y50Var.f12503d, (ApplicationInfo) y50Var.f12504e, str3, arrayList, packageInfo, str, str2, null, null, z5, ((iq0) y50Var.f12511m).a(), bundle2, w50Var.f11647b, y50Var.f12501b);
            case 1:
                lu luVar = (lu) ((or0) obj2).f8767d.get();
                if (((Boolean) q9.s.f31967e.f31970c.a(al.B2)).booleanValue() && (bundle = ((ku) obj3).f7308n) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", luVar.f7623j);
                    bundle.putLong("get-ad-dictionary-sdkcore-end", luVar.f7624k);
                }
                return new ah0((JSONObject) ((or0) obj).f8767d.get(), luVar);
            case 2:
                pm0 pm0Var = jn0.f6889k;
                JSONArray jSONArray = new JSONArray();
                for (ed.d dVar : (ArrayList) obj3) {
                    if (((JSONObject) dVar.get()) != null) {
                        jSONArray.put(dVar.get());
                    }
                }
                String str4 = (String) obj2;
                Bundle bundle4 = (Bundle) obj;
                if (jSONArray.length() != 0) {
                    return new pm0(jSONArray.toString(), str4, bundle4);
                }
                if (((Boolean) q9.s.f31967e.f31970c.a(al.T4)).booleanValue()) {
                    return new pm0(new JSONArray().toString(), str4, bundle4);
                }
                return null;
            default:
                ((t11) obj3).f10464a.a((bz0) obj2, null, (byte[]) obj);
                return null;
        }
    }

    public /* synthetic */ x50(Object obj, Object obj2, Cloneable cloneable, int i) {
        this.f12044b = i;
        this.f12046d = obj;
        this.f12045c = obj2;
        this.f12047e = cloneable;
    }

    public /* synthetic */ x50(ArrayList arrayList, Bundle bundle, String str) {
        this.f12044b = 2;
        this.f12046d = arrayList;
        this.f12047e = bundle;
        this.f12045c = str;
    }
}

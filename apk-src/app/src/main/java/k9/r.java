package k9;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q9.i3;
import q9.y1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f27281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f27282b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f27283c;

    public r(y1 y1Var) {
        this.f27281a = y1Var;
        if (y1Var != null) {
            try {
                List<i3> listK = y1Var.k();
                if (listK != null) {
                    for (i3 i3Var : listK) {
                        k kVar = i3Var != null ? new k(i3Var) : null;
                        if (kVar != null) {
                            this.f27282b.add(kVar);
                        }
                    }
                }
            } catch (RemoteException e3) {
                u9.i.f("Could not forward getAdapterResponseInfo to ResponseInfo.", e3);
            }
        }
        y1 y1Var2 = this.f27281a;
        if (y1Var2 == null) {
            return;
        }
        try {
            i3 i3VarM = y1Var2.m();
            if (i3VarM != null) {
                this.f27283c = new k(i3VarM);
            }
        } catch (RemoteException e7) {
            u9.i.f("Could not forward getLoadedAdapterResponse to ResponseInfo.", e7);
        }
    }

    public final Bundle a() {
        try {
            y1 y1Var = this.f27281a;
            if (y1Var != null) {
                return y1Var.f();
            }
        } catch (RemoteException e3) {
            u9.i.f("Could not forward getResponseExtras to ResponseInfo.", e3);
        }
        return new Bundle();
    }

    public final JSONObject b() throws JSONException {
        String strC;
        JSONObject jSONObject = new JSONObject();
        String strI = null;
        y1 y1Var = this.f27281a;
        if (y1Var != null) {
            try {
                strC = y1Var.c();
            } catch (RemoteException e3) {
                u9.i.f("Could not forward getResponseId to ResponseInfo.", e3);
                strC = null;
            }
        } else {
            strC = null;
        }
        if (strC == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strC);
        }
        if (y1Var != null) {
            try {
                strI = y1Var.i();
            } catch (RemoteException e7) {
                u9.i.f("Could not forward getMediationAdapterClassName to ResponseInfo.", e7);
            }
        }
        if (strI == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strI);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f27282b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((k) it.next()).a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        k kVar = this.f27283c;
        if (kVar != null) {
            jSONObject.put("Loaded Adapter Response", kVar.a());
        }
        Bundle bundleA = a();
        if (bundleA != null) {
            jSONObject.put("Response Extras", q9.r.f31959g.f31960a.l(bundleA));
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}

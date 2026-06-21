package yads;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nw3 implements tv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv3 f41360a;

    public nw3(vw3 vw3Var) {
        this.f41360a = vw3Var;
    }

    @Override // yads.tv3
    public final JSONObject a(View view) {
        JSONObject jSONObjectA = ow3.a(0, 0, 0, 0);
        try {
            jSONObjectA.put("noOutputDevice", mw3.f41059a[hg0.a(vv3.a() != 1 ? 2 : bx3.f37167a)] == 1);
            return jSONObjectA;
        } catch (JSONException e3) {
            Log.e("OMIDLIB", "Error with setting output device status", e3);
            return jSONObjectA;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.tv3
    public final void a(View view, JSONObject jSONObject, qv3 qv3Var, boolean z5, boolean z10) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        qw3 qw3Var = qw3.f42411c;
        if (qw3Var != null) {
            Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(qw3Var.f42413b);
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionUnmodifiableCollection.size() * 2) + 3);
            Iterator it = collectionUnmodifiableCollection.iterator();
            while (it.hasNext()) {
                View view2 = (View) ((zv3) it.next()).f45555d.get();
                if (view2 != null && kx3.d(view2) && (rootView = view2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fB = kx3.b(rootView);
                    int size = arrayList.size();
                    while (size > 0 && kx3.b((View) arrayList.get(size - 1)) > fB) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((a93) qv3Var).a((View) it2.next(), this.f41360a, jSONObject, z10);
        }
    }
}

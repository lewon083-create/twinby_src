package yads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vw3 implements tv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f44216a = new int[2];

    @Override // yads.tv3
    public final JSONObject a(View view) {
        if (view == null) {
            return ow3.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f44216a);
        int[] iArr = this.f44216a;
        return ow3.a(iArr[0], iArr[1], width, height);
    }

    @Override // yads.tv3
    public final void a(View view, JSONObject jSONObject, qv3 qv3Var, boolean z5, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (!z5) {
                while (i < viewGroup.getChildCount()) {
                    ((a93) qv3Var).a(viewGroup.getChildAt(i), this, jSONObject, z10);
                    i++;
                }
                return;
            }
            HashMap map = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) map.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((a93) qv3Var).a((View) it2.next(), this, jSONObject, z10);
                }
            }
        }
    }
}

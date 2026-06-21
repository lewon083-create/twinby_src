package ti;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33801b;

    public /* synthetic */ c(int i, Object obj) {
        this.f33800a = i;
        this.f33801b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f33800a) {
            case 0:
                int measuredHeight = view.getMeasuredHeight();
                d dVar = (d) this.f33801b;
                if (measuredHeight != dVar.i) {
                    ka.k kVar = dVar.f33867b;
                    int i17 = dVar.f33834a;
                    kVar.getClass();
                    HashMap map = new HashMap();
                    map.put("adId", Integer.valueOf(i17));
                    map.put("eventName", "onFluidAdHeightChanged");
                    map.put("height", Integer.valueOf(measuredHeight));
                    kVar.I(map);
                }
                dVar.i = measuredHeight;
                return;
            default:
                throw null;
        }
    }
}

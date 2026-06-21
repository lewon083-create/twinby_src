package yads;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fx1 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewParent parent = view != null ? view.getParent() : null;
        ViewParent parent2 = parent != null ? parent.getParent() : null;
        y6.m mVar = parent2 instanceof y6.m ? (y6.m) parent2 : null;
        if (mVar != null) {
            mVar.callOnClick();
        }
    }
}

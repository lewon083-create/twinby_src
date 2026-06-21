package y6;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k6.f1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f36501p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar) {
        super(1);
        this.f36501p = mVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c(f1 f1Var, int[] iArr) {
        m mVar = this.f36501p;
        int offscreenPageLimit = mVar.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.c(f1Var, iArr);
            return;
        }
        int pageSize = mVar.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.i
    public final void onInitializeAccessibilityNodeInfo(androidx.recyclerview.widget.k kVar, f1 f1Var, h2.f fVar) {
        super.onInitializeAccessibilityNodeInfo(kVar, f1Var, fVar);
        this.f36501p.f36525u.getClass();
    }

    @Override // androidx.recyclerview.widget.i
    public final void onInitializeAccessibilityNodeInfoForItem(androidx.recyclerview.widget.k kVar, f1 f1Var, View view, h2.f fVar) {
        m mVar = (m) this.f36501p.f36525u.f14902e;
        fVar.f20360a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(mVar.getOrientation() == 1 ? mVar.f36513h.getPosition(view) : 0, 1, mVar.getOrientation() == 0 ? mVar.f36513h.getPosition(view) : 0, 1, false, false));
    }

    @Override // androidx.recyclerview.widget.i
    public final boolean performAccessibilityAction(androidx.recyclerview.widget.k kVar, f1 f1Var, int i, Bundle bundle) {
        this.f36501p.f36525u.getClass();
        return super.performAccessibilityAction(kVar, f1Var, i, bundle);
    }

    @Override // androidx.recyclerview.widget.i
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z5, boolean z10) {
        return false;
    }
}

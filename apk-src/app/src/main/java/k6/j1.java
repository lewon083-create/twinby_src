package k6;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class j1 extends g2.b {
    private final i1 mItemDelegate;
    final RecyclerView mRecyclerView;

    public j1(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        g2.b itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof i1)) {
            this.mItemDelegate = new i1(this);
        } else {
            this.mItemDelegate = (i1) itemDelegate;
        }
    }

    public g2.b getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // g2.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // g2.b
    public void onInitializeAccessibilityNodeInfo(View view, h2.f fVar) {
        super.onInitializeAccessibilityNodeInfo(view, fVar);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(fVar);
    }

    @Override // g2.b
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}

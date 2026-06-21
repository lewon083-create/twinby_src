package k6;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends g2.b {
    private Map<View, g2.b> mOriginalItemDelegates = new WeakHashMap();
    final j1 mRecyclerViewDelegate;

    public i1(j1 j1Var) {
        this.mRecyclerViewDelegate = j1Var;
    }

    @Override // g2.b
    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        g2.b bVar = this.mOriginalItemDelegates.get(view);
        return bVar != null ? bVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // g2.b
    public h2.i getAccessibilityNodeProvider(View view) {
        g2.b bVar = this.mOriginalItemDelegates.get(view);
        return bVar != null ? bVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
    }

    public g2.b getAndRemoveOriginalDelegateForItem(View view) {
        return this.mOriginalItemDelegates.remove(view);
    }

    @Override // g2.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        g2.b bVar = this.mOriginalItemDelegates.get(view);
        if (bVar != null) {
            bVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // g2.b
    public final void onInitializeAccessibilityNodeInfo(View view, h2.f fVar) {
        if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
            super.onInitializeAccessibilityNodeInfo(view, fVar);
            return;
        }
        this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, fVar);
        g2.b bVar = this.mOriginalItemDelegates.get(view);
        if (bVar != null) {
            bVar.onInitializeAccessibilityNodeInfo(view, fVar);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, fVar);
        }
    }

    @Override // g2.b
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        g2.b bVar = this.mOriginalItemDelegates.get(view);
        if (bVar != null) {
            bVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // g2.b
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        g2.b bVar = this.mOriginalItemDelegates.get(viewGroup);
        return bVar != null ? bVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // g2.b
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        g2.b bVar = this.mOriginalItemDelegates.get(view);
        if (bVar != null) {
            if (bVar.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
        } else if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        return this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
    }

    public void saveOriginalDelegate(View view) {
        View.AccessibilityDelegate accessibilityDelegateB = g2.n0.b(view);
        g2.b bVar = accessibilityDelegateB == null ? null : accessibilityDelegateB instanceof g2.a ? ((g2.a) accessibilityDelegateB).f19827a : new g2.b(accessibilityDelegateB);
        if (bVar == null || bVar == this) {
            return;
        }
        this.mOriginalItemDelegates.put(view, bVar);
    }

    @Override // g2.b
    public void sendAccessibilityEvent(View view, int i) {
        g2.b bVar = this.mOriginalItemDelegates.get(view);
        if (bVar != null) {
            bVar.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // g2.b
    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        g2.b bVar = this.mOriginalItemDelegates.get(view);
        if (bVar != null) {
            bVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}

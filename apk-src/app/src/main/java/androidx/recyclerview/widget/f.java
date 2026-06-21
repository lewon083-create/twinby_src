package androidx.recyclerview.widget;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1702a;

    public f(RecyclerView recyclerView) {
        this.f1702a = recyclerView;
    }

    public final void a(k6.a aVar) {
        int i = aVar.f27019a;
        RecyclerView recyclerView = this.f1702a;
        if (i == 1) {
            recyclerView.mLayout.onItemsAdded(recyclerView, aVar.f27020b, aVar.f27022d);
            return;
        }
        if (i == 2) {
            recyclerView.mLayout.onItemsRemoved(recyclerView, aVar.f27020b, aVar.f27022d);
        } else if (i == 4) {
            recyclerView.mLayout.onItemsUpdated(recyclerView, aVar.f27020b, aVar.f27022d, aVar.f27021c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.mLayout.onItemsMoved(recyclerView, aVar.f27020b, aVar.f27022d, 1);
        }
    }

    public final p b(int i) {
        RecyclerView recyclerView = this.f1702a;
        p pVarFindViewHolderForPosition = recyclerView.findViewHolderForPosition(i, true);
        if (pVarFindViewHolderForPosition != null) {
            b bVar = recyclerView.mChildHelper;
            if (!bVar.f1687c.contains(pVarFindViewHolderForPosition.itemView)) {
                return pVarFindViewHolderForPosition;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }
}

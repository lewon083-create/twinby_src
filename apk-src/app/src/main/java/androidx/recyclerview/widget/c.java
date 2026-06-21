package androidx.recyclerview.widget;

import java.util.Arrays;
import k6.u0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f1692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1693d;

    public final void a(int i, int i10) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i11 = this.f1693d;
        int i12 = i11 * 2;
        int[] iArr = this.f1692c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f1692c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i12 >= iArr.length) {
            int[] iArr3 = new int[i11 * 4];
            this.f1692c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f1692c;
        iArr4[i12] = i;
        iArr4[i12 + 1] = i10;
        this.f1693d++;
    }

    public final void b(RecyclerView recyclerView, boolean z5) {
        this.f1693d = 0;
        int[] iArr = this.f1692c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        i iVar = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || iVar == null || !iVar.isItemPrefetchEnabled()) {
            return;
        }
        if (z5) {
            if (!recyclerView.mAdapterHelper.g()) {
                iVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            iVar.collectAdjacentPrefetchPositions(this.f1690a, this.f1691b, recyclerView.mState, this);
        }
        int i = this.f1693d;
        if (i > iVar.mPrefetchMaxCountObserved) {
            iVar.mPrefetchMaxCountObserved = i;
            iVar.mPrefetchMaxObservedInInitialPrefetch = z5;
            recyclerView.mRecycler.m();
        }
    }
}

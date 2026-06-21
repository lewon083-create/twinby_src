package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.h5;
import g2.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import k6.i1;
import k6.j1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f1710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f1715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1716h;

    public k(RecyclerView recyclerView) {
        this.f1716h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1709a = arrayList;
        this.f1710b = null;
        this.f1711c = new ArrayList();
        this.f1712d = Collections.unmodifiableList(arrayList);
        this.f1713e = 2;
        this.f1714f = 2;
    }

    public static void d(ViewGroup viewGroup, boolean z5) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                d((ViewGroup) childAt, true);
            }
        }
        if (z5) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    public final void a(p pVar, boolean z5) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(pVar);
        View view = pVar.itemView;
        RecyclerView recyclerView = this.f1716h;
        j1 j1Var = recyclerView.mAccessibilityDelegate;
        if (j1Var != null) {
            g2.b itemDelegate = j1Var.getItemDelegate();
            n0.k(view, itemDelegate instanceof i1 ? ((i1) itemDelegate).getAndRemoveOriginalDelegateForItem(view) : null);
        }
        if (z5) {
            if (recyclerView.mRecyclerListeners.size() > 0) {
                recyclerView.mRecyclerListeners.get(0).getClass();
                throw new ClassCastException();
            }
            g gVar = recyclerView.mAdapter;
            if (gVar != null) {
                gVar.onViewRecycled(pVar);
            }
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.d(pVar);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + pVar);
            }
        }
        pVar.mBindingAdapter = null;
        pVar.mOwnerRecyclerView = null;
        j jVarC = c();
        jVarC.getClass();
        int itemViewType = pVar.getItemViewType();
        ArrayList arrayList = jVarC.a(itemViewType).f27040a;
        if (jVarC.mScrap.get(itemViewType).f27041b <= arrayList.size()) {
            h5.c(pVar.itemView);
        } else {
            if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(pVar)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            pVar.resetInternal();
            arrayList.add(pVar);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.f1716h;
        if (i >= 0 && i < recyclerView.mState.b()) {
            return !recyclerView.mState.f27070g ? i : recyclerView.mAdapterHelper.f(i, 0);
        }
        StringBuilder sbM = l7.o.m(i, "invalid position ", ". State item count is ");
        sbM.append(recyclerView.mState.b());
        sbM.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public final j c() {
        if (this.f1715g == null) {
            j jVar = new j();
            jVar.mScrap = new SparseArray<>();
            jVar.mAttachCountForClearing = 0;
            jVar.mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());
            this.f1715g = jVar;
            e();
        }
        return this.f1715g;
    }

    public final void e() {
        if (this.f1715g != null) {
            RecyclerView recyclerView = this.f1716h;
            if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            this.f1715g.attachForPoolingContainer(recyclerView.mAdapter);
        }
    }

    public final void f() {
        ArrayList arrayList = this.f1711c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            c cVar = this.f1716h.mPrefetchRegistry;
            int[] iArr = cVar.f1692c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            cVar.f1693d = 0;
        }
    }

    public final void g(int i) {
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f1711c;
        p pVar = (p) arrayList.get(i);
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + pVar);
        }
        a(pVar, true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        p childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
        RecyclerView recyclerView = this.f1716h;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        i(childViewHolderInt);
        if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
            return;
        }
        recyclerView.mItemAnimator.d(childViewHolderInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d4, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(androidx.recyclerview.widget.p r12) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.i(androidx.recyclerview.widget.p):void");
    }

    public final void j(View view) {
        p childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f1716h;
        if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.f1710b == null) {
                this.f1710b = new ArrayList();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.f1710b.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
            throw new IllegalArgumentException(gf.a.i(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        childViewHolderInt.setScrapContainer(this, false);
        this.f1709a.add(childViewHolderInt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x053d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.p k(int r32, long r33) {
        /*
            Method dump skipped, instruction units count: 1385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.k(int, long):androidx.recyclerview.widget.p");
    }

    public final void l(p pVar) {
        if (pVar.mInChangeScrap) {
            this.f1710b.remove(pVar);
        } else {
            this.f1709a.remove(pVar);
        }
        pVar.mScrapContainer = null;
        pVar.mInChangeScrap = false;
        pVar.clearReturnedFromScrapFlag();
    }

    public final void m() {
        i iVar = this.f1716h.mLayout;
        this.f1714f = this.f1713e + (iVar != null ? iVar.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f1711c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1714f; size--) {
            g(size);
        }
    }
}

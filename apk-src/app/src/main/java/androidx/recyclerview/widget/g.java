package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import g2.n0;
import java.lang.reflect.Field;
import java.util.List;
import k6.l0;
import k6.m0;
import k6.w0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    private final m0 mObservable = new m0();
    private boolean mHasStableIds = false;
    private l0 mStateRestorationPolicy = l0.f27115b;

    public final void bindViewHolder(p pVar, int i) {
        boolean z5 = pVar.mBindingAdapter == null;
        if (z5) {
            pVar.mPosition = i;
            if (hasStableIds()) {
                pVar.mItemId = getItemId(i);
            }
            pVar.setFlags(1, 519);
            int i10 = c2.j.f2200a;
            Trace.beginSection("RV OnBindView");
        }
        pVar.mBindingAdapter = this;
        if (RecyclerView.sDebugAssertionsEnabled) {
            if (pVar.itemView.getParent() == null) {
                View view = pVar.itemView;
                Field field = n0.f19900a;
                if (view.isAttachedToWindow() != pVar.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + pVar.isTmpDetached() + ", attached to window: " + pVar.itemView.isAttachedToWindow() + ", holder: " + pVar);
                }
            }
            if (pVar.itemView.getParent() == null) {
                View view2 = pVar.itemView;
                Field field2 = n0.f19900a;
                if (view2.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + pVar);
                }
            }
        }
        onBindViewHolder(pVar, i, pVar.getUnmodifiedPayloads());
        if (z5) {
            pVar.clearPayload();
            ViewGroup.LayoutParams layoutParams = pVar.itemView.getLayoutParams();
            if (layoutParams instanceof w0) {
                ((w0) layoutParams).f27222c = true;
            }
            int i11 = c2.j.f2200a;
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 : getItemCount() > 0;
    }

    public final p createViewHolder(ViewGroup viewGroup, int i) {
        try {
            int i10 = c2.j.f2200a;
            Trace.beginSection("RV CreateView");
            p pVarOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (pVarOnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            pVarOnCreateViewHolder.mItemViewType = i;
            Trace.endSection();
            return pVarOnCreateViewHolder;
        } catch (Throwable th2) {
            int i11 = c2.j.f2200a;
            Trace.endSection();
            throw th2;
        }
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1L;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyItemMoved(int i, int i10) {
        this.mObservable.b(i, i10);
    }

    public final void notifyItemRangeChanged(int i, int i10, Object obj) {
        this.mObservable.c(i, i10, obj);
    }

    public final void notifyItemRangeInserted(int i, int i10) {
        this.mObservable.d(i, i10);
    }

    public final void notifyItemRangeRemoved(int i, int i10) {
        this.mObservable.e(i, i10);
    }

    public abstract void onBindViewHolder(p pVar, int i);

    public void onBindViewHolder(p pVar, int i, List<Object> list) {
        onBindViewHolder(pVar, i);
    }

    public abstract p onCreateViewHolder(ViewGroup viewGroup, int i);

    public boolean onFailedToRecycleView(p pVar) {
        return false;
    }

    public void registerAdapterDataObserver(k6.n0 n0Var) {
        this.mObservable.registerObserver(n0Var);
    }

    public void setHasStableIds(boolean z5) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z5;
    }

    public void unregisterAdapterDataObserver(k6.n0 n0Var) {
        this.mObservable.unregisterObserver(n0Var);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public void onViewAttachedToWindow(p pVar) {
    }

    public void onViewDetachedFromWindow(p pVar) {
    }

    public void onViewRecycled(p pVar) {
    }
}

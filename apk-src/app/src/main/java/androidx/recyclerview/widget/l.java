package androidx.recyclerview.widget;

import java.lang.reflect.Field;
import java.util.ArrayList;
import k6.n0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1717a;

    public l(RecyclerView recyclerView) {
        this.f1717a = recyclerView;
    }

    @Override // k6.n0
    public final void a() {
        RecyclerView recyclerView = this.f1717a;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.f27069f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (recyclerView.mAdapterHelper.g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // k6.n0
    public final void b(int i, int i10, Object obj) {
        RecyclerView recyclerView = this.f1717a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a aVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = aVar.f1680b;
        if (i10 < 1) {
            return;
        }
        arrayList.add(aVar.h(obj, 4, i, i10));
        aVar.f1684f |= 4;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // k6.n0
    public final void c(int i, int i10) {
        RecyclerView recyclerView = this.f1717a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a aVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = aVar.f1680b;
        if (i10 < 1) {
            return;
        }
        arrayList.add(aVar.h(null, 1, i, i10));
        aVar.f1684f |= 1;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // k6.n0
    public final void d(int i, int i10) {
        RecyclerView recyclerView = this.f1717a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a aVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = aVar.f1680b;
        if (i == i10) {
            return;
        }
        arrayList.add(aVar.h(null, 8, i, i10));
        aVar.f1684f |= 8;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // k6.n0
    public final void e(int i, int i10) {
        RecyclerView recyclerView = this.f1717a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a aVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = aVar.f1680b;
        if (i10 < 1) {
            return;
        }
        arrayList.add(aVar.h(null, 2, i, i10));
        aVar.f1684f |= 2;
        if (arrayList.size() == 1) {
            f();
        }
    }

    public final void f() {
        boolean z5 = RecyclerView.POST_UPDATES_ON_ANIMATION;
        RecyclerView recyclerView = this.f1717a;
        if (!z5 || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
            Field field = g2.n0.f19900a;
            recyclerView.postOnAnimation(runnable);
        }
    }
}

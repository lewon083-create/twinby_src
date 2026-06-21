package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v7.f f1685a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f1689e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1688d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.ads.identifier.c f1686b = new com.google.android.gms.ads.identifier.c(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1687c = new ArrayList();

    public b(v7.f fVar) {
        this.f1685a = fVar;
    }

    public final void a(View view, int i, boolean z5) {
        RecyclerView recyclerView = (RecyclerView) this.f1685a.f34767c;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f1686b.a0(childCount, z5);
        if (z5) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z5) {
        RecyclerView recyclerView = (RecyclerView) this.f1685a.f34767c;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f1686b.a0(childCount, z5);
        if (z5) {
            i(view);
        }
        p childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(gf.a.i(recyclerView, sb2));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + childViewHolderInt);
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(childCount);
            throw new IllegalArgumentException(gf.a.i(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int iF = f(i);
        this.f1686b.c0(iF);
        RecyclerView recyclerView = (RecyclerView) this.f1685a.f34767c;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            p childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(childViewHolderInt);
                    throw new IllegalArgumentException(gf.a.i(recyclerView, sb2));
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                }
                childViewHolderInt.addFlags(256);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(iF);
            throw new IllegalArgumentException(gf.a.i(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return ((RecyclerView) this.f1685a.f34767c).getChildAt(f(i));
    }

    public final int e() {
        return ((RecyclerView) this.f1685a.f34767c).getChildCount() - this.f1687c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) this.f1685a.f34767c).getChildCount();
        int i10 = i;
        while (i10 < childCount) {
            com.google.android.gms.ads.identifier.c cVar = this.f1686b;
            int iX = i - (i10 - cVar.X(i10));
            if (iX == 0) {
                while (cVar.Z(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += iX;
        }
        return -1;
    }

    public final View g(int i) {
        return ((RecyclerView) this.f1685a.f34767c).getChildAt(i);
    }

    public final int h() {
        return ((RecyclerView) this.f1685a.f34767c).getChildCount();
    }

    public final void i(View view) {
        this.f1687c.add(view);
        p childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState((RecyclerView) this.f1685a.f34767c);
        }
    }

    public final void j(View view) {
        p childViewHolderInt;
        if (!this.f1687c.remove(view) || (childViewHolderInt = RecyclerView.getChildViewHolderInt(view)) == null) {
            return;
        }
        childViewHolderInt.onLeftHiddenState((RecyclerView) this.f1685a.f34767c);
    }

    public final String toString() {
        return this.f1686b.toString() + ", hidden list:" + this.f1687c.size();
    }
}

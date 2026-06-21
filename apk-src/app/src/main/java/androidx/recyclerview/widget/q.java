package androidx.recyclerview.widget;

import android.view.View;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;
import k6.n1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1732a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1733b = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1734c = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1735d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f1737f;

    public q(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f1737f = staggeredGridLayoutManager;
        this.f1736e = i;
    }

    public final void a() {
        View view = (View) gf.a.g(1, this.f1732a);
        n1 n1Var = (n1) view.getLayoutParams();
        this.f1734c = this.f1737f.mPrimaryOrientation.b(view);
        n1Var.getClass();
    }

    public final void b() {
        this.f1732a.clear();
        this.f1733b = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        this.f1734c = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        this.f1735d = 0;
    }

    public final int c() {
        return this.f1737f.mReverseLayout ? e(r1.size() - 1, -1) : e(0, this.f1732a.size());
    }

    public final int d() {
        return this.f1737f.mReverseLayout ? e(0, this.f1732a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f1737f;
        int iK = staggeredGridLayoutManager.mPrimaryOrientation.k();
        int iG = staggeredGridLayoutManager.mPrimaryOrientation.g();
        int i11 = i10 > i ? 1 : -1;
        while (i != i10) {
            View view = (View) this.f1732a.get(i);
            int iE = staggeredGridLayoutManager.mPrimaryOrientation.e(view);
            int iB = staggeredGridLayoutManager.mPrimaryOrientation.b(view);
            boolean z5 = iE <= iG;
            boolean z10 = iB >= iK;
            if (z5 && z10 && (iE < iK || iB > iG)) {
                return staggeredGridLayoutManager.getPosition(view);
            }
            i += i11;
        }
        return -1;
    }

    public final int f(int i) {
        int i10 = this.f1734c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f1732a.size() == 0) {
            return i;
        }
        a();
        return this.f1734c;
    }

    public final View g(int i, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f1737f;
        ArrayList arrayList = this.f1732a;
        View view = null;
        if (i10 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view2) >= i) || ((!staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            View view3 = (View) arrayList.get(i11);
            if ((staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view3) <= i) || ((!staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i11++;
            view = view3;
        }
        return view;
    }

    public final int h(int i) {
        int i10 = this.f1733b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        ArrayList arrayList = this.f1732a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        n1 n1Var = (n1) view.getLayoutParams();
        this.f1733b = this.f1737f.mPrimaryOrientation.e(view);
        n1Var.getClass();
        return this.f1733b;
    }
}

package y6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.internal.ads.pf;
import com.google.android.gms.internal.ads.v7;
import com.google.firebase.messaging.y;
import g2.n0;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f36507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f36508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f36509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f36512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f36513h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Parcelable f36514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k f36515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f36516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f36517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f36518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m4.d f36519o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f36520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.h f36521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f36522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f36523s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f36524t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final y f36525u;

    public m(Context context) {
        super(context);
        this.f36507b = new Rect();
        this.f36508c = new Rect();
        e eVar = new e();
        this.f36509d = eVar;
        int i = 0;
        this.f36511f = false;
        this.f36512g = new d(i, this);
        this.i = -1;
        this.f36521q = null;
        this.f36522r = false;
        int i10 = 1;
        this.f36523s = true;
        this.f36524t = -1;
        y yVar = new y();
        yVar.f14902e = this;
        yVar.f14899b = new xi.d(yVar);
        yVar.f14900c = new ni.i(27, yVar);
        this.f36525u = yVar;
        k kVar = new k(this, context);
        this.f36515k = kVar;
        Field field = n0.f19900a;
        kVar.setId(View.generateViewId());
        this.f36515k.setDescendantFocusability(131072);
        g gVar = new g(this);
        this.f36513h = gVar;
        this.f36515k.setLayoutManager(gVar);
        this.f36515k.setScrollingTouchSlop(1);
        int[] iArr = x6.a.f35976a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        n0.j(this, context, iArr, null, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f36515k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f36515k.addOnChildAttachStateChangeListener(new f());
            c cVar = new c(this);
            this.f36517m = cVar;
            this.f36519o = new m4.d(cVar);
            j jVar = new j(this);
            this.f36516l = jVar;
            jVar.attachToRecyclerView(this.f36515k);
            this.f36515k.addOnScrollListener(this.f36517m);
            e eVar2 = new e();
            this.f36518n = eVar2;
            this.f36517m.f36486a = eVar2;
            e eVar3 = new e(this, i);
            e eVar4 = new e(this, i10);
            ((ArrayList) eVar2.f36500e).add(eVar3);
            ((ArrayList) this.f36518n.f36500e).add(eVar4);
            y yVar2 = this.f36525u;
            k kVar2 = this.f36515k;
            yVar2.getClass();
            kVar2.setImportantForAccessibility(2);
            yVar2.f14901d = new d(i10, yVar2);
            m mVar = (m) yVar2.f14902e;
            if (mVar.getImportantForAccessibility() == 0) {
                mVar.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f36518n.f36500e).add(eVar);
            b bVar = new b();
            this.f36520p = bVar;
            ((ArrayList) this.f36518n.f36500e).add(bVar);
            k kVar3 = this.f36515k;
            attachViewToParent(kVar3, 0, kVar3.getLayoutParams());
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a() {
        androidx.recyclerview.widget.g adapter;
        if (this.i == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f36514j != null) {
            this.f36514j = null;
        }
        int iMax = Math.max(0, Math.min(this.i, adapter.getItemCount() - 1));
        this.f36510e = iMax;
        this.i = -1;
        this.f36515k.scrollToPosition(iMax);
        this.f36525u.x();
    }

    public final void b(int i, boolean z5) {
        Object obj = this.f36519o.f28630b;
        c(i, z5);
    }

    public final void c(int i, boolean z5) {
        e eVar;
        androidx.recyclerview.widget.g adapter = getAdapter();
        if (adapter == null) {
            if (this.i != -1) {
                this.i = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        int i10 = this.f36510e;
        if (iMin == i10 && this.f36517m.f36491f == 0) {
            return;
        }
        if (iMin == i10 && z5) {
            return;
        }
        double d10 = i10;
        this.f36510e = iMin;
        this.f36525u.x();
        c cVar = this.f36517m;
        if (cVar.f36491f != 0) {
            cVar.d();
            v7 v7Var = cVar.f36492g;
            d10 = ((double) v7Var.f11284b) + ((double) v7Var.f11283a);
        }
        c cVar2 = this.f36517m;
        cVar2.getClass();
        cVar2.f36490e = z5 ? 2 : 3;
        boolean z10 = cVar2.i != iMin;
        cVar2.i = iMin;
        cVar2.b(2);
        if (z10 && (eVar = cVar2.f36486a) != null) {
            eVar.onPageSelected(iMin);
        }
        if (!z5) {
            this.f36515k.scrollToPosition(iMin);
            return;
        }
        double d11 = iMin;
        if (Math.abs(d11 - d10) <= 3.0d) {
            this.f36515k.smoothScrollToPosition(iMin);
            return;
        }
        this.f36515k.scrollToPosition(d11 > d10 ? iMin - 3 : iMin + 3);
        k kVar = this.f36515k;
        kVar.post(new pf(iMin, kVar));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f36515k.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f36515k.canScrollVertically(i);
    }

    public final void d() {
        j jVar = this.f36516l;
        if (jVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = jVar.findSnapView(this.f36513h);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f36513h.getPosition(viewFindSnapView);
        if (position != this.f36510e && getScrollState() == 0) {
            this.f36518n.onPageSelected(position);
        }
        this.f36511f = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof l) {
            int i = ((l) parcelable).f36504b;
            sparseArray.put(this.f36515k.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f36525u.getClass();
        this.f36525u.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public androidx.recyclerview.widget.g getAdapter() {
        return this.f36515k.getAdapter();
    }

    public int getCurrentItem() {
        return this.f36510e;
    }

    public int getItemDecorationCount() {
        return this.f36515k.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f36524t;
    }

    public int getOrientation() {
        return this.f36513h.f1665a == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        int orientation = getOrientation();
        k kVar = this.f36515k;
        if (orientation == 0) {
            height = kVar.getWidth() - kVar.getPaddingLeft();
            paddingBottom = kVar.getPaddingRight();
        } else {
            height = kVar.getHeight() - kVar.getPaddingTop();
            paddingBottom = kVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f36517m.f36491f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m mVar = (m) this.f36525u.f14902e;
        if (mVar.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (mVar.getOrientation() == 1) {
            itemCount = mVar.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = mVar.getAdapter().getItemCount();
            itemCount = 1;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(itemCount, itemCount2, false, 0));
        androidx.recyclerview.widget.g adapter = mVar.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !mVar.f36523s) {
            return;
        }
        if (mVar.f36510e > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (mVar.f36510e < itemCount3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        int measuredWidth = this.f36515k.getMeasuredWidth();
        int measuredHeight = this.f36515k.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f36507b;
        rect.left = paddingLeft;
        rect.right = (i11 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i12 - i10) - getPaddingBottom();
        Rect rect2 = this.f36508c;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f36515k.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f36511f) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        measureChild(this.f36515k, i, i10);
        int measuredWidth = this.f36515k.getMeasuredWidth();
        int measuredHeight = this.f36515k.getMeasuredHeight();
        int measuredState = this.f36515k.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.i = lVar.f36505c;
        this.f36514j = lVar.f36506d;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f36504b = this.f36515k.getId();
        int i = this.i;
        if (i == -1) {
            i = this.f36510e;
        }
        lVar.f36505c = i;
        Parcelable parcelable = this.f36514j;
        if (parcelable != null) {
            lVar.f36506d = parcelable;
            return lVar;
        }
        this.f36515k.getAdapter();
        return lVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(m.class.getSimpleName().concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.f36525u.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        y yVar = this.f36525u;
        m mVar = (m) yVar.f14902e;
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        int currentItem = i == 8192 ? mVar.getCurrentItem() - 1 : mVar.getCurrentItem() + 1;
        m mVar2 = (m) yVar.f14902e;
        if (mVar2.f36523s) {
            mVar2.c(currentItem, true);
        }
        return true;
    }

    public void setAdapter(androidx.recyclerview.widget.g gVar) {
        androidx.recyclerview.widget.g adapter = this.f36515k.getAdapter();
        y yVar = this.f36525u;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver((d) yVar.f14901d);
        } else {
            yVar.getClass();
        }
        d dVar = this.f36512g;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(dVar);
        }
        this.f36515k.setAdapter(gVar);
        this.f36510e = 0;
        a();
        y yVar2 = this.f36525u;
        yVar2.x();
        if (gVar != null) {
            gVar.registerAdapterDataObserver((d) yVar2.f14901d);
        }
        if (gVar != null) {
            gVar.registerAdapterDataObserver(dVar);
        }
    }

    public void setCurrentItem(int i) {
        b(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f36525u.x();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f36524t = i;
        this.f36515k.requestLayout();
    }

    public void setOrientation(int i) {
        this.f36513h.setOrientation(i);
        this.f36525u.x();
    }

    public void setPageTransformer(i iVar) {
        if (iVar != null) {
            if (!this.f36522r) {
                this.f36521q = this.f36515k.getItemAnimator();
                this.f36522r = true;
            }
            this.f36515k.setItemAnimator(null);
        } else if (this.f36522r) {
            this.f36515k.setItemAnimator(this.f36521q);
            this.f36521q = null;
            this.f36522r = false;
        }
        this.f36520p.getClass();
        if (iVar == null) {
            return;
        }
        this.f36520p.getClass();
        this.f36520p.getClass();
    }

    public void setUserInputEnabled(boolean z5) {
        this.f36523s = z5;
        this.f36525u.x();
    }
}

package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.twinby.R;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 extends ListView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f28178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a1 f28184h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f28185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f28186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j2.d f28187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c1 f28188m;

    public d1(Context context, boolean z5) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f28178b = new Rect();
        this.f28179c = 0;
        this.f28180d = 0;
        this.f28181e = 0;
        this.f28182f = 0;
        this.f28185j = z5;
        setCacheColorHint(0);
    }

    public final int a(int i, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i11 = 0;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i10) {
                return i10;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.d1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f28178b;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f28188m != null) {
            return;
        }
        super.drawableStateChanged();
        a1 a1Var = this.f28184h;
        if (a1Var != null) {
            a1Var.f28157c = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f28186k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f28185j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f28185j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f28185j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f28185j && this.i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f28188m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f28188m == null) {
            c1 c1Var = new c1(0, this);
            this.f28188m = c1Var;
            post(c1Var);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !y0.f28408d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        y0.f28405a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        y0.f28406b.invoke(this, Integer.valueOf(iPointToPosition));
                        y0.f28407c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e7) {
                        e7.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f28186k && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f28183g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        c1 c1Var = this.f28188m;
        if (c1Var != null) {
            d1 d1Var = (d1) c1Var.f28173c;
            d1Var.f28188m = null;
            d1Var.removeCallbacks(c1Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z5) {
        this.i = z5;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a1 a1Var = null;
        if (drawable != null) {
            a1 a1Var2 = new a1();
            Drawable drawable2 = a1Var2.f28156b;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            a1Var2.f28156b = drawable;
            drawable.setCallback(a1Var2);
            a1Var2.f28157c = true;
            a1Var = a1Var2;
        }
        this.f28184h = a1Var;
        super.setSelector(a1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f28179c = rect.left;
        this.f28180d = rect.top;
        this.f28181e = rect.right;
        this.f28182f = rect.bottom;
    }
}

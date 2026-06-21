package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.twinby.R;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g2.n0;
import java.lang.reflect.Field;
import m.a2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f1076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f1077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1081h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1082j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.a aVar = new m.a(this);
        Field field = n0.f19900a;
        setBackground(aVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f20293a);
        boolean z5 = false;
        this.f1078e = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f1079f = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f1082j = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1081h = true;
            this.f1080g = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1081h ? !(this.f1078e != null || this.f1079f != null) : this.f1080g == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1078e;
        if (drawable != null && drawable.isStateful()) {
            this.f1078e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1079f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1079f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1080g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1080g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1078e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1079f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1080g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1076c = findViewById(R.id.action_bar);
        this.f1077d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1075b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        super.onLayout(z5, i, i10, i11, i12);
        boolean z10 = true;
        if (this.f1081h) {
            Drawable drawable = this.f1080g;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f1078e == null) {
                z10 = false;
            } else if (this.f1076c.getVisibility() == 0) {
                this.f1078e.setBounds(this.f1076c.getLeft(), this.f1076c.getTop(), this.f1076c.getRight(), this.f1076c.getBottom());
            } else {
                View view = this.f1077d;
                if (view == null || view.getVisibility() != 0) {
                    this.f1078e.setBounds(0, 0, 0, 0);
                } else {
                    this.f1078e.setBounds(this.f1077d.getLeft(), this.f1077d.getTop(), this.f1077d.getRight(), this.f1077d.getBottom());
                }
            }
            this.i = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        if (this.f1076c == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f1082j) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
        }
        super.onMeasure(i, i10);
        if (this.f1076c == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1078e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1078e);
        }
        this.f1078e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1076c;
            if (view != null) {
                this.f1078e.setBounds(view.getLeft(), this.f1076c.getTop(), this.f1076c.getRight(), this.f1076c.getBottom());
            }
        }
        boolean z5 = false;
        if (!this.f1081h ? !(this.f1078e != null || this.f1079f != null) : this.f1080g == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1080g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1080g);
        }
        this.f1080g = drawable;
        boolean z5 = this.f1081h;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z5 && (drawable2 = this.f1080g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z5 ? !(this.f1078e != null || this.f1079f != null) : this.f1080g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1079f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1079f);
        }
        this.f1079f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.i && this.f1079f != null) {
                throw null;
            }
        }
        boolean z5 = false;
        if (!this.f1081h ? !(this.f1078e != null || this.f1079f != null) : this.f1080g == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z5) {
        this.f1075b = z5;
        setDescendantFocusability(z5 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z5 = i == 0;
        Drawable drawable = this.f1078e;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
        Drawable drawable2 = this.f1079f;
        if (drawable2 != null) {
            drawable2.setVisible(z5, false);
        }
        Drawable drawable3 = this.f1080g;
        if (drawable3 != null) {
            drawable3.setVisible(z5, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1078e;
        boolean z5 = this.f1081h;
        if (drawable == drawable2 && !z5) {
            return true;
        }
        if (drawable == this.f1079f && this.i) {
            return true;
        }
        return (drawable == this.f1080g && z5) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(a2 a2Var) {
    }
}

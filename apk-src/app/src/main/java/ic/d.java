package ic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import m.h1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends h1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f21262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f21263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f21264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21265t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f21266u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21267v;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f21263r = new Rect();
        this.f21264s = new Rect();
        this.f21265t = 119;
        this.f21266u = true;
        this.f21267v = false;
        k.a(context, attributeSet, 0, 0);
        int[] iArr = vb.a.f34816g;
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f21265t = typedArrayObtainStyledAttributes.getInt(1, this.f21265t);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f21266u = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f21262q;
        if (drawable != null) {
            if (this.f21267v) {
                this.f21267v = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z5 = this.f21266u;
                Rect rect = this.f21263r;
                if (z5) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f21265t;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f21264s;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f21262q;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f21262q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f21262q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f21262q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f21265t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21262q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // m.h1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        super.onLayout(z5, i, i10, i11, i12);
        this.f21267v = z5 | this.f21267v;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f21267v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f21262q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f21262q);
            }
            this.f21262q = drawable;
            this.f21267v = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f21265t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f21265t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f21265t = i;
            if (i == 119 && this.f21262q != null) {
                this.f21262q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f21262q;
    }
}

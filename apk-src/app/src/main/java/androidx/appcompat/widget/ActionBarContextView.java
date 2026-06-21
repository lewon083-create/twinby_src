package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.twinby.R;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g2.n0;
import java.lang.reflect.Field;
import l7.o;
import m.k3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f1086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f1087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f1088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f1089h;
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f1090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1093m;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f20296d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : a.a.i(context, resourceId);
        Field field = n0.f19900a;
        setBackground(drawable);
        this.f1091k = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1092l = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f1083b = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int b(View view, int i, int i10, int i11, boolean z5) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iC = o.c(i11, measuredHeight, 2, i10);
        if (z5) {
            view.layout(i - measuredWidth, iC, i, measuredHeight + iC);
        } else {
            view.layout(i, iC, i + measuredWidth, measuredHeight + iC);
        }
        return z5 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f1089h == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1089h = linearLayout;
            this.i = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1090j = (TextView) this.f1089h.findViewById(R.id.action_bar_subtitle);
            int i = this.f1091k;
            if (i != 0) {
                this.i.setTextAppearance(getContext(), i);
            }
            int i10 = this.f1092l;
            if (i10 != 0) {
                this.f1090j.setTextAppearance(getContext(), i10);
            }
        }
        this.i.setText(this.f1086e);
        this.f1090j.setText(this.f1087f);
        boolean zIsEmpty = TextUtils.isEmpty(this.f1086e);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1087f);
        this.f1090j.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f1089h.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f1089h.getParent() == null) {
            addView(this.f1089h);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1083b;
    }

    public CharSequence getSubtitle() {
        return this.f1087f;
    }

    public CharSequence getTitle() {
        return this.f1086e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, h.a.f20293a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1085d = false;
        }
        if (!this.f1085d) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1085d = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1085d = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        boolean zA = k3.a(this);
        int paddingRight = zA ? (i11 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f1089h;
        if (linearLayout != null && this.f1088g == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f1089h, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view = this.f1088g;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, zA);
        }
        if (zA) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f1083b;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
        LinearLayout linearLayout = this.f1089h;
        if (linearLayout != null && this.f1088g == null) {
            if (this.f1093m) {
                this.f1089h.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1089h.getMeasuredWidth();
                boolean z5 = measuredWidth <= paddingLeft;
                if (z5) {
                    paddingLeft -= measuredWidth;
                }
                this.f1089h.setVisibility(z5 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR), iMakeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f1088g;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                iMin = Math.min(i13, iMin);
            }
            this.f1088g.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(iMin, i14));
        }
        if (this.f1083b > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1084c = false;
        }
        if (!this.f1084c) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1084c = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1084c = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f1083b = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1088g;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1088g = view;
        if (view != null && (linearLayout = this.f1089h) != null) {
            removeView(linearLayout);
            this.f1089h = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1087f = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1086e = charSequence;
        a();
        n0.l(this, charSequence);
    }

    public void setTitleOptional(boolean z5) {
        if (z5 != this.f1093m) {
            requestLayout();
        }
        this.f1093m = z5;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

package com.google.android.material.internal;

import a.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bc.e;
import g2.n0;
import ic.d;
import java.lang.reflect.Field;
import l.j;
import l.q;
import m.g1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends d implements q {
    public static final int[] G = {R.attr.state_checked};
    public FrameLayout A;
    public j B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final e F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14641y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CheckedTextView f14642z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e eVar = new e(3, this);
        this.F = eVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.twinby.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.twinby.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.twinby.R.id.design_menu_item_text);
        this.f14642z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        n0.k(checkedTextView, eVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(com.twinby.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // l.q
    public final void b(j jVar) {
        StateListDrawable stateListDrawable;
        this.B = jVar;
        int i = jVar.f27648a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.twinby.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            Field field = n0.f19900a;
            setBackground(stateListDrawable);
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.f27652e);
        setIcon(jVar.getIcon());
        View view = jVar.f27672z;
        if (view == null) {
            view = null;
        }
        setActionView(view);
        setContentDescription(jVar.f27663q);
        a.p(this, jVar.f27664r);
        j jVar2 = this.B;
        CharSequence charSequence = jVar2.f27652e;
        CheckedTextView checkedTextView = this.f14642z;
        if (charSequence == null && jVar2.getIcon() == null) {
            View view2 = this.B.f27672z;
            if ((view2 != null ? view2 : null) != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.A;
                if (frameLayout != null) {
                    g1 g1Var = (g1) frameLayout.getLayoutParams();
                    ((LinearLayout.LayoutParams) g1Var).width = -1;
                    this.A.setLayoutParams(g1Var);
                    return;
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            g1 g1Var2 = (g1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) g1Var2).width = -2;
            this.A.setLayoutParams(g1Var2);
        }
    }

    @Override // l.q
    public j getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        j jVar = this.B;
        if (jVar != null && jVar.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z5) {
        refreshDrawableState();
        if (this.f14641y != z5) {
            this.f14641y = z5;
            this.F.sendAccessibilityEvent(this.f14642z, 2048);
        }
    }

    public void setChecked(boolean z5) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f14642z;
        checkedTextView.setChecked(z5);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z5 ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.C);
            }
            int i = this.f14639w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f14640x) {
            if (this.E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = w1.j.f34987a;
                Drawable drawable2 = resources.getDrawable(com.twinby.R.drawable.navigation_empty_icon, theme);
                this.E = drawable2;
                if (drawable2 != null) {
                    int i10 = this.f14639w;
                    drawable2.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.E;
        }
        this.f14642z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f14642z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f14639w = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        j jVar = this.B;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f14642z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z5) {
        this.f14640x = z5;
    }

    public void setTextAppearance(int i) {
        this.f14642z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f14642z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f14642z.setText(charSequence);
    }
}

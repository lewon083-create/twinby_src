package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.b4;
import com.twinby.R;
import g2.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p1.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends e implements d {
    public final int[] A;
    public final float[] B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final String[] G;
    public float H;
    public final ColorStateList I;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ClockHandView f14720u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f14721v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f14722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f14723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SparseArray f14724y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f14725z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14721v = new Rect();
        this.f14722w = new RectF();
        this.f14723x = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f14724y = sparseArray;
        this.B = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vb.a.f34812c, R.attr.materialClockStyle, 2131887240);
        Resources resources = getResources();
        ColorStateList colorStateListU = b4.u(context, typedArrayObtainStyledAttributes, 1);
        this.I = colorStateListU;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f14720u = clockHandView;
        this.C = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListU.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListU.getDefaultColor());
        this.A = new int[]{colorForState, colorForState, colorStateListU.getDefaultColor()};
        clockHandView.f14728d.add(this);
        int defaultColor = t1.b.b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListU2 = b4.u(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListU2 != null ? colorStateListU2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f14725z = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.G = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z5 = false;
        for (int i = 0; i < Math.max(this.G.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.G.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.G[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i10 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                z5 = i10 > 1 ? true : z5;
                n0.k(textView, this.f14725z);
                textView.setTextColor(this.I);
            }
        }
        ClockHandView clockHandView2 = this.f14720u;
        if (clockHandView2.f14727c && !z5) {
            clockHandView2.f14737n = 1;
        }
        clockHandView2.f14727c = z5;
        clockHandView2.invalidate();
        this.D = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.F = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        m mVar = new m();
        mVar.b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i10 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i10 == null) {
                    i10 = 1;
                }
                if (!map.containsKey(i10)) {
                    map.put(i10, new ArrayList());
                }
                ((List) map.get(i10)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f14744s * 0.66f) : this.f14744s;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id2 = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id2);
                HashMap map2 = mVar.f30915c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id2), new p1.h());
                }
                p1.i iVar = ((p1.h) map2.get(Integer.valueOf(id2))).f30842d;
                iVar.f30883z = R.id.circle_center;
                iVar.A = iRound;
                iVar.B = size;
                size += 360.0f / list.size();
            }
        }
        mVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f14724y;
            if (i11 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i11)).setVisibility(0);
            i11++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f14720u.f14732h;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f14724y;
            int size = sparseArray.size();
            rect = this.f14721v;
            rectF = this.f14722w;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f10) {
                    textView = textView2;
                    f10 = fHeight;
                }
            }
            i++;
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextView textView3 = (TextView) sparseArray.get(i10);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f14723x);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.A, this.B, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.G.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        super.onLayout(z5, i, i10, i11, i12);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.F / Math.max(Math.max(this.D / displayMetrics.heightPixels, this.E / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}

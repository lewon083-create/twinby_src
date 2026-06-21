package com.google.android.material.timepicker;

import a0.d1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.twinby.R;
import g2.n0;
import java.lang.reflect.Field;
import nc.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d1 f14743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nc.g f14745t;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        nc.g gVar = new nc.g();
        this.f14745t = gVar;
        nc.h hVar = new nc.h(0.5f);
        j jVarE = gVar.f29225b.f29209a.e();
        jVarE.f29251e = hVar;
        jVarE.f29252f = hVar;
        jVarE.f29253g = hVar;
        jVarE.f29254h = hVar;
        gVar.setShapeAppearanceModel(jVarE.a());
        this.f14745t.j(ColorStateList.valueOf(-1));
        nc.g gVar2 = this.f14745t;
        Field field = n0.f19900a;
        setBackground(gVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vb.a.f34823o, R.attr.materialClockStyle, 0);
        this.f14744s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f14743r = new d1(10, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            Field field = n0.f19900a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            d1 d1Var = this.f14743r;
            handler.removeCallbacks(d1Var);
            handler.post(d1Var);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            d1 d1Var = this.f14743r;
            handler.removeCallbacks(d1Var);
            handler.post(d1Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f14745t.j(ColorStateList.valueOf(i));
    }
}

package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import bc.e;
import g2.n0;
import ic.a;
import m.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends v implements Checkable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f14635h = {R.attr.state_checked};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14638g;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.twinby.R.attr.imageButtonStyle);
        this.f14637f = true;
        this.f14638g = true;
        n0.k(this, new e(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f14636e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f14636e ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f14635h) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f28536b);
        setChecked(aVar.f21228d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f21228d = this.f14636e;
        return aVar;
    }

    public void setCheckable(boolean z5) {
        if (this.f14637f != z5) {
            this.f14637f = z5;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (!this.f14637f || this.f14636e == z5) {
            return;
        }
        this.f14636e = z5;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z5) {
        this.f14638g = z5;
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        if (this.f14638g) {
            super.setPressed(z5);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f14636e);
    }
}

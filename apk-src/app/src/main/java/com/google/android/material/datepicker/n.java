package com.google.android.material.datepicker;

import android.view.View;
import g2.x1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements g2.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f14595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14597d;

    public n(View view) {
        this.f14595b = view;
    }

    @Override // g2.q
    public x1 l(View view, x1 x1Var) {
        int i = x1Var.f19943a.h(519).f35690b;
        int i10 = this.f14596c;
        View view2 = this.f14595b;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f14597d + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return x1Var;
    }

    public n(View view, int i, int i10) {
        this.f14596c = i;
        this.f14595b = view;
        this.f14597d = i10;
    }
}

package com.google.android.material.datepicker;

import a0.b1;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.pf;
import com.google.android.material.button.MaterialButton;
import g2.n0;
import k6.j0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m<S> extends v {
    public int W;
    public c X;
    public q Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public d f14588a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public RecyclerView f14589b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public RecyclerView f14590c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public View f14591d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View f14592e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public View f14593f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public View f14594g0;

    @Override // z2.t
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.W);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.X);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.Y);
    }

    public final void Q(q qVar) {
        u uVar = (u) this.f14590c0.getAdapter();
        int iD = uVar.f14628c.f14562b.d(qVar);
        int iD2 = iD - uVar.f14628c.f14562b.d(this.Y);
        boolean z5 = Math.abs(iD2) > 3;
        boolean z10 = iD2 > 0;
        this.Y = qVar;
        if (z5 && z10) {
            this.f14590c0.scrollToPosition(iD - 3);
            this.f14590c0.post(new pf(this, iD, 8));
        } else if (!z5) {
            this.f14590c0.post(new pf(this, iD, 8));
        } else {
            this.f14590c0.scrollToPosition(iD + 3);
            this.f14590c0.post(new pf(this, iD, 8));
        }
    }

    public final void R(int i) {
        this.Z = i;
        if (i == 2) {
            this.f14589b0.getLayoutManager().scrollToPosition(this.Y.f14614d - ((z) this.f14589b0.getAdapter()).f14633c.X.f14562b.f14614d);
            this.f14593f0.setVisibility(0);
            this.f14594g0.setVisibility(8);
            this.f14591d0.setVisibility(8);
            this.f14592e0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f14593f0.setVisibility(8);
            this.f14594g0.setVisibility(0);
            this.f14591d0.setVisibility(0);
            this.f14592e0.setVisibility(0);
            Q(this.Y);
        }
    }

    @Override // z2.t
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f45973g;
        }
        this.W = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.X = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.Y = (q) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // z2.t
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i10;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(l(), this.W);
        this.f14588a0 = new d(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        q qVar = this.X.f14562b;
        if (o.U(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.twinby.R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i = com.twinby.R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = M().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.twinby.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.twinby.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.twinby.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.twinby.R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = r.f14619e;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.twinby.R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(com.twinby.R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(com.twinby.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.twinby.R.id.mtrl_calendar_days_of_week);
        n0.k(gridView, new h(0));
        int i12 = this.X.f14566f;
        gridView.setAdapter((ListAdapter) (i12 > 0 ? new f(i12) : new f()));
        gridView.setNumColumns(qVar.f14615e);
        gridView.setEnabled(false);
        this.f14590c0 = (RecyclerView) viewInflate.findViewById(com.twinby.R.id.mtrl_calendar_months);
        this.f14590c0.setLayoutManager(new i(this, i10, i10));
        this.f14590c0.setTag("MONTHS_VIEW_GROUP_TAG");
        u uVar = new u(contextThemeWrapper, this.X, new b1(5, this));
        this.f14590c0.setAdapter(uVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.twinby.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.twinby.R.id.mtrl_calendar_year_selector_frame);
        this.f14589b0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f14589b0.setLayoutManager(new GridLayoutManager(integer));
            this.f14589b0.setAdapter(new z(this));
            this.f14589b0.addItemDecoration(new j(this));
        }
        if (viewInflate.findViewById(com.twinby.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.twinby.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            n0.k(materialButton, new bc.e(1, this));
            View viewFindViewById = viewInflate.findViewById(com.twinby.R.id.month_navigation_previous);
            this.f14591d0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.twinby.R.id.month_navigation_next);
            this.f14592e0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f14593f0 = viewInflate.findViewById(com.twinby.R.id.mtrl_calendar_year_selector_frame);
            this.f14594g0 = viewInflate.findViewById(com.twinby.R.id.mtrl_calendar_day_selector_frame);
            R(1);
            materialButton.setText(this.Y.c());
            this.f14590c0.addOnScrollListener(new k(this, uVar, materialButton));
            materialButton.setOnClickListener(new l(0, this));
            this.f14592e0.setOnClickListener(new g(this, uVar, 1));
            this.f14591d0.setOnClickListener(new g(this, uVar, 0));
        }
        if (!o.U(contextThemeWrapper, R.attr.windowFullscreen)) {
            new j0().attachToRecyclerView(this.f14590c0);
        }
        this.f14590c0.scrollToPosition(uVar.f14628c.f14562b.d(this.Y));
        n0.k(this.f14590c0, new h(1));
        return viewInflate;
    }
}

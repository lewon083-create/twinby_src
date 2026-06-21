package com.google.android.material.datepicker;

import a0.b1;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.twinby.R;
import java.util.Calendar;
import k6.w0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends androidx.recyclerview.widget.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f14628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1 f14629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14630e;

    public u(ContextThemeWrapper contextThemeWrapper, c cVar, b1 b1Var) {
        q qVar = cVar.f14562b;
        q qVar2 = cVar.f14563c;
        q qVar3 = cVar.f14565e;
        if (qVar.f14612b.compareTo(qVar3.f14612b) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (qVar3.f14612b.compareTo(qVar2.f14612b) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f14630e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * r.f14619e) + (o.U(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f14628c = cVar;
        this.f14629d = b1Var;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.g
    public final int getItemCount() {
        return this.f14628c.f14568h;
    }

    @Override // androidx.recyclerview.widget.g
    public final long getItemId(int i) {
        Calendar calendarA = x.a(this.f14628c.f14562b.f14612b);
        calendarA.add(2, i);
        calendarA.set(5, 1);
        Calendar calendarA2 = x.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.g
    public final void onBindViewHolder(androidx.recyclerview.widget.p pVar, int i) {
        t tVar = (t) pVar;
        c cVar = this.f14628c;
        Calendar calendarA = x.a(cVar.f14562b.f14612b);
        calendarA.add(2, i);
        q qVar = new q(calendarA);
        tVar.f14626l.setText(qVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) tVar.f14627m.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !qVar.equals(materialCalendarGridView.a().f14621b)) {
            new r(qVar, cVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.g
    public final androidx.recyclerview.widget.p onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!o.U(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new t(linearLayout, false);
        }
        linearLayout.setLayoutParams(new w0(-1, this.f14630e));
        return new t(linearLayout, true);
    }
}

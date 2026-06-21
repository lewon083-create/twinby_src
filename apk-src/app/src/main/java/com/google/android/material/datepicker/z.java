package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.twinby.R;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends androidx.recyclerview.widget.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f14633c;

    public z(m mVar) {
        this.f14633c = mVar;
    }

    @Override // androidx.recyclerview.widget.g
    public final int getItemCount() {
        return this.f14633c.X.f14567g;
    }

    @Override // androidx.recyclerview.widget.g
    public final void onBindViewHolder(androidx.recyclerview.widget.p pVar, int i) {
        y yVar = (y) pVar;
        m mVar = this.f14633c;
        int i10 = mVar.X.f14562b.f14614d + i;
        yVar.f14632l.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i10)));
        TextView textView = yVar.f14632l;
        Context context = textView.getContext();
        textView.setContentDescription(x.b().get(1) == i10 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10)));
        d dVar = mVar.f14588a0;
        if (x.b().get(1) == i10) {
            wd.d dVar2 = dVar.f14570b;
        } else {
            wd.d dVar3 = dVar.f14569a;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.g
    public final androidx.recyclerview.widget.p onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new y((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}

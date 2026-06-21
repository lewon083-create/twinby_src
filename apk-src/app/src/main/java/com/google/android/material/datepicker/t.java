package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.twinby.R;
import g2.a0;
import g2.n0;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.recyclerview.widget.p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f14626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MaterialCalendarGridView f14627m;

    public t(LinearLayout linearLayout, boolean z5) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f14626l = textView;
        Field field = n0.f19900a;
        new a0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(textView, Boolean.TRUE);
        this.f14627m = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z5) {
            return;
        }
        textView.setVisibility(8);
    }
}

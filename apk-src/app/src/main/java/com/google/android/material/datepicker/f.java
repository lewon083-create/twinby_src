package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.twinby.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends BaseAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14572e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Calendar f14573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14575d;

    static {
        f14572e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public f() {
        Calendar calendarC = x.c(null);
        this.f14573b = calendarC;
        this.f14574c = calendarC.getMaximum(7);
        this.f14575d = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f14574c;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i10 = this.f14574c;
        if (i >= i10) {
            return null;
        }
        int i11 = i + this.f14575d;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i10 = i + this.f14575d;
        int i11 = this.f14574c;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.f14573b;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, f14572e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public f(int i) {
        Calendar calendarC = x.c(null);
        this.f14573b = calendarC;
        this.f14574c = calendarC.getMaximum(7);
        this.f14575d = i;
    }
}

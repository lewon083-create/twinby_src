package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import k6.a1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f14583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f14584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f14585c;

    public k(m mVar, u uVar, MaterialButton materialButton) {
        this.f14585c = mVar;
        this.f14583a = uVar;
        this.f14584b = materialButton;
    }

    @Override // k6.a1
    public final void a(RecyclerView recyclerView, int i, int i10) {
        c cVar = this.f14583a.f14628c;
        m mVar = this.f14585c;
        int iM = i < 0 ? ((LinearLayoutManager) mVar.f14590c0.getLayoutManager()).m() : ((LinearLayoutManager) mVar.f14590c0.getLayoutManager()).n();
        Calendar calendarA = x.a(cVar.f14562b.f14612b);
        calendarA.add(2, iM);
        mVar.Y = new q(calendarA);
        Calendar calendarA2 = x.a(cVar.f14562b.f14612b);
        calendarA2.add(2, iM);
        calendarA2.set(5, 1);
        Calendar calendarA3 = x.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        long timeInMillis = calendarA3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = x.f14631a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f14584b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }

    @Override // k6.a1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f14584b.getText());
        }
    }
}

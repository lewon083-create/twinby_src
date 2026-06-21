package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f14624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f14625c;

    public s(u uVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f14625c = uVar;
        this.f14624b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j10) {
        MaterialCalendarGridView materialCalendarGridView = this.f14624b;
        r rVarA = materialCalendarGridView.a();
        if (i < rVarA.a() || i > rVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((m) this.f14625c.f14629d.f45c).X.f14564d.f14571b) {
            throw null;
        }
    }
}

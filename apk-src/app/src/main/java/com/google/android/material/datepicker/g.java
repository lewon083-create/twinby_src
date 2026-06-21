package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f14577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f14578d;

    public /* synthetic */ g(m mVar, u uVar, int i) {
        this.f14576b = i;
        this.f14578d = mVar;
        this.f14577c = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14576b) {
            case 0:
                m mVar = this.f14578d;
                int iN = ((LinearLayoutManager) mVar.f14590c0.getLayoutManager()).n() - 1;
                if (iN >= 0) {
                    Calendar calendarA = x.a(this.f14577c.f14628c.f14562b.f14612b);
                    calendarA.add(2, iN);
                    mVar.Q(new q(calendarA));
                }
                break;
            default:
                m mVar2 = this.f14578d;
                int iM = ((LinearLayoutManager) mVar2.f14590c0.getLayoutManager()).m() + 1;
                if (iM < mVar2.f14590c0.getAdapter().getItemCount()) {
                    Calendar calendarA2 = x.a(this.f14577c.f14628c.f14562b.f14612b);
                    calendarA2.add(2, iM);
                    mVar2.Q(new q(calendarA2));
                }
                break;
        }
    }
}

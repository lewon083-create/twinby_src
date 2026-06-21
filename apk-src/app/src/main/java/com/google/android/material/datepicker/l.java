package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14587c;

    public /* synthetic */ l(int i, Object obj) {
        this.f14586b = i;
        this.f14587c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14586b) {
            case 0:
                m mVar = (m) this.f14587c;
                int i = mVar.Z;
                if (i == 2) {
                    mVar.R(1);
                    return;
                } else {
                    if (i == 1) {
                        mVar.R(2);
                        return;
                    }
                    return;
                }
            case 1:
                ((o) this.f14587c).S();
                throw null;
            default:
                s9.d dVar = (s9.d) this.f14587c;
                dVar.f32828x = 2;
                dVar.f32808c.finish();
                return;
        }
    }
}

package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k6.f1;
import k6.s0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f14582a;

    public j(m mVar) {
        this.f14582a = mVar;
        x.c(null);
        x.c(null);
    }

    @Override // k6.s0
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, f1 f1Var) {
        if ((recyclerView.getAdapter() instanceof z) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f14582a.getClass();
            throw null;
        }
    }
}

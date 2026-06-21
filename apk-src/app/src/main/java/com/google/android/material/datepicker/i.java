package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k6.f1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends LinearLayoutManager {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f14580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m f14581q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, int i, int i10) {
        super(i);
        this.f14581q = mVar;
        this.f14580p = i10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c(f1 f1Var, int[] iArr) {
        int i = this.f14580p;
        m mVar = this.f14581q;
        if (i == 0) {
            iArr[0] = mVar.f14590c0.getWidth();
            iArr[1] = mVar.f14590c0.getWidth();
        } else {
            iArr[0] = mVar.f14590c0.getHeight();
            iArr[1] = mVar.f14590c0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final void smoothScrollToPosition(RecyclerView recyclerView, f1 f1Var, int i) {
        cc.a aVar = new cc.a(recyclerView.getContext());
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }
}

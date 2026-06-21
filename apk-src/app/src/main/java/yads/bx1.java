package yads;

import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bx1 extends y6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y6.m f37165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiBannerControlsContainer f37166b;

    public bx1(y6.m mVar, MultiBannerControlsContainer multiBannerControlsContainer) {
        this.f37165a = mVar;
        this.f37166b = multiBannerControlsContainer;
    }

    @Override // y6.h
    public final void onPageSelected(int i) {
        androidx.recyclerview.widget.g adapter = this.f37165a.getAdapter();
        this.f37166b.a(i, adapter != null ? adapter.getItemCount() : 0);
    }
}

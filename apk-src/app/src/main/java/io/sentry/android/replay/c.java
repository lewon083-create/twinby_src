package io.sentry.android.replay;

import android.view.View;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25978b;

    public /* synthetic */ c(int i, Object obj) {
        this.f25977a = i;
        this.f25978b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f25977a) {
            case 0:
                WindowRecorder.attachLayoutListener$lambda$1((WindowRecorder) this.f25978b, view, i, i10, i11, i12, i13, i14, i15, i16);
                break;
            default:
                MultiBannerControlsContainer.a((MultiBannerControlsContainer) this.f25978b, view, i, i10, i11, i12, i13, i14, i15, i16);
                break;
        }
    }
}

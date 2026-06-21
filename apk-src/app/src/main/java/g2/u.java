package g2;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScrollFeedbackProvider f19926b;

    public u(NestedScrollView nestedScrollView) {
        this.f19926b = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // g2.v
    public final void onScrollLimit(int i, int i10, int i11, boolean z5) {
        this.f19926b.onScrollLimit(i, i10, i11, z5);
    }

    @Override // g2.v
    public final void onScrollProgress(int i, int i10, int i11, int i12) {
        this.f19926b.onScrollProgress(i, i10, i11, i12);
    }
}

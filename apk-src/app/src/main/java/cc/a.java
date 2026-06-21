package cc;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import k6.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2261a = 1;

    public /* synthetic */ a(Context context) {
        super(context);
    }

    @Override // k6.c0
    public float a(DisplayMetrics displayMetrics) {
        switch (this.f2261a) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.a(displayMetrics);
        }
    }

    @Override // k6.c0
    public int calculateDxToMakeVisible(View view, int i) {
        switch (this.f2261a) {
            case 0:
                throw null;
            default:
                return super.calculateDxToMakeVisible(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.n
    public PointF computeScrollVectorForPosition(int i) {
        switch (this.f2261a) {
            case 0:
                return null;
            default:
                return super.computeScrollVectorForPosition(i);
        }
    }

    public a(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}

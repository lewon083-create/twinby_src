package cc;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.twinby.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k6.f1;
import k6.s0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f2262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2263b;

    public b() {
        Paint paint = new Paint();
        this.f2262a = paint;
        this.f2263b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // k6.s0
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, f1 f1Var) {
        super.onDrawOver(canvas, recyclerView, f1Var);
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f2262a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f2263b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).getClass();
            paint.setColor(x1.a.b(0.0f, -65281, -16776961));
            float paddingTop = ((CarouselLayoutManager) recyclerView.getLayoutManager()).getPaddingTop();
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
            canvas.drawLine(0.0f, paddingTop, 0.0f, carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom(), paint);
        }
    }
}

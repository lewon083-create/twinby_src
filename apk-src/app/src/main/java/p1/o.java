package p1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30916b;

    public o(Context context) {
        super(context);
        this.f30916b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z5) {
        this.f30916b = z5;
    }

    public void setGuidelineBegin(int i) {
        d dVar = (d) getLayoutParams();
        if (this.f30916b && dVar.f30776a == i) {
            return;
        }
        dVar.f30776a = i;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i) {
        d dVar = (d) getLayoutParams();
        if (this.f30916b && dVar.f30778b == i) {
            return;
        }
        dVar.f30778b = i;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f10) {
        d dVar = (d) getLayoutParams();
        if (this.f30916b && dVar.f30780c == f10) {
            return;
        }
        dVar.f30780c = f10;
        setLayoutParams(dVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}

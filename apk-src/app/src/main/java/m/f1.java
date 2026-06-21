package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l.a f28206c;

    public /* synthetic */ f1(l.a aVar, int i) {
        this.f28205b = i;
        this.f28206c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28205b) {
            case 0:
                ViewParent parent = this.f28206c.f27584e.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                l.a aVar = this.f28206c;
                aVar.a();
                View view = aVar.f27584e;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    aVar.f27587h = true;
                    break;
                }
                break;
        }
    }
}

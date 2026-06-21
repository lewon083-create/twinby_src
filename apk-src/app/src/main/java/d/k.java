package d;

import a0.d1;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements j, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15450b = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f15451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f15453e;

    public k(n nVar) {
        this.f15453e = nVar;
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f15452d) {
            return;
        }
        this.f15452d = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f15451c = runnable;
        View decorView = this.f15453e.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        if (!this.f15452d) {
            decorView.postOnAnimation(new d1(13, this));
        } else if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z5;
        Runnable runnable = this.f15451c;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f15450b) {
                this.f15452d = false;
                this.f15453e.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f15451c = null;
        q fullyDrawnReporter = this.f15453e.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f15466b) {
            z5 = fullyDrawnReporter.f15467c;
        }
        if (z5) {
            this.f15452d = false;
            this.f15453e.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15453e.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

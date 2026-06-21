package yads;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f02 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f38310c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile f02 f38311d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f38312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38313b;

    public f02(Handler handler) {
        this.f38312a = handler;
    }

    public final void a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f38313b) {
                view.setAlpha(view.getAlpha() / 2);
                this.f38313b = true;
            }
            this.f38312a.postDelayed(new t.v0(28, this, view), 100L);
        }
    }

    public static final void a(f02 f02Var, View view) {
        if (f02Var.f38313b) {
            view.setAlpha(view.getAlpha() * 2);
            f02Var.f38313b = false;
        }
    }
}

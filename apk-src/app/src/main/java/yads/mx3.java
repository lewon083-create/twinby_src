package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mx3 implements sw3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static mx3 f41099f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f41100a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dx3 f41101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dw3 f41102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yw3 f41103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qw3 f41104e;

    public mx3(dx3 dx3Var, dw3 dw3Var) {
        this.f41101b = dx3Var;
        this.f41102c = dw3Var;
    }

    @Override // yads.sw3
    public final void a(boolean z5) {
        if (!z5) {
            a93.f36657g.getClass();
            Handler handler = a93.i;
            if (handler != null) {
                handler.removeCallbacks(a93.f36660k);
                a93.i = null;
                return;
            }
            return;
        }
        a93.f36657g.getClass();
        if (a93.i == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            a93.i = handler2;
            handler2.post(a93.f36659j);
            a93.i.postDelayed(a93.f36660k, 200L);
        }
    }

    public static mx3 a() {
        if (f41099f == null) {
            f41099f = new mx3(new dx3(), new dw3());
        }
        return f41099f;
    }
}

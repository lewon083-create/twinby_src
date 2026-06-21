package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vu2 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final CopyOnWriteArrayList f44174f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nu2 f44175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hk.a0 f44176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt1 f44177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f44178e;

    public vu2(Context context, lu3 lu3Var, hk.a0 a0Var, wt1 wt1Var) {
        this.f44175b = lu3Var;
        this.f44176c = a0Var;
        this.f44177d = wt1Var;
        this.f44178e = context.getApplicationContext();
    }

    @Override // java.lang.Runnable
    public final void run() {
        cv2 cv2Var = new cv2(this.f44178e, this.f44175b, this.f44176c, new w5(), null, null, 2097136);
        f44174f.add(cv2Var);
        hk.c0.m(this.f44176c, null, new uu2(cv2Var, this, null), 3);
    }
}

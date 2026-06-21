package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jd2 extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f39833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f39834f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final id2 f39836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39837d;

    public jd2(id2 id2Var, SurfaceTexture surfaceTexture, boolean z5) {
        super(surfaceTexture);
        this.f39836c = id2Var;
        this.f39835b = z5;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f39836c) {
            try {
                if (!this.f39837d) {
                    id2 id2Var = this.f39836c;
                    id2Var.f39503c.getClass();
                    id2Var.f39503c.sendEmptyMessage(2);
                    this.f39837d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

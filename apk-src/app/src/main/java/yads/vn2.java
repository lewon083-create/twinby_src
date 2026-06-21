package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk3 f44095a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xn2 f44097c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dq f44096b = new dq();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tn2 f44098d = new tn2();

    public vn2(gk3 gk3Var, u62 u62Var) {
        this.f44095a = gk3Var;
        this.f44097c = new xn2(gk3Var, u62Var);
    }

    public final void a() {
        h72 h72Var = (h72) this.f44095a.b();
        if (h72Var != null) {
            wn2 wn2Var = h72Var.f39052c.f41821a;
            xn2 xn2Var = this.f44097c;
            xn2Var.getClass();
            wn2Var.setVisibility(4);
            wn2Var.f44433a.setOnClickListener(xn2Var.f44774a);
            Bitmap bitmap = h72Var.f39051b.getBitmap();
            if (bitmap != null) {
                this.f44096b.f37876a.execute(new cq(bitmap, new un2(this, h72Var, wn2Var), new Handler(Looper.getMainLooper()), new kq()));
            }
        }
    }
}

package yads;

import android.graphics.Bitmap;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cq implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f37470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final un2 f37471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f37472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kq f37473e;

    public cq(Bitmap bitmap, un2 un2Var, Handler handler, kq kqVar) {
        this.f37470b = bitmap;
        this.f37471c = un2Var;
        this.f37472d = handler;
        this.f37473e = kqVar;
    }

    public final void a(Bitmap bitmap) {
        this.f37472d.post(new t.v0(23, this, bitmap));
    }

    @Override // java.lang.Runnable
    public final void run() {
        kq kqVar = this.f37473e;
        Bitmap bitmapA = this.f37470b;
        kqVar.getClass();
        try {
            bitmapA = kq.a(bitmapA, 0.1d);
        } catch (Throwable unused) {
        }
        a(bitmapA);
    }

    public static final void a(cq cqVar, Bitmap bitmap) {
        un2 un2Var = cqVar.f37471c;
        tn2 tn2Var = un2Var.f43733a.f44098d;
        h72 h72Var = un2Var.f43734b;
        wn2 wn2Var = un2Var.f43735c;
        tn2Var.getClass();
        tn2.a(h72Var, wn2Var, bitmap);
    }
}

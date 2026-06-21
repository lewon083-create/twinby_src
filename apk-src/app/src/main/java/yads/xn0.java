package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.List;
import yads.oe2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xn0 implements gj3, dl, c63, zs1, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, xk, rk, d43, rn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao0 f44771a;

    public xn0(ao0 ao0Var) {
        this.f44771a = ao0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
        this.f44771a.a(surfaceTexture);
        this.f44771a.a(i, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f44771a.a((Surface) null);
        this.f44771a.a(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
        this.f44771a.a(i, i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i10, int i11) {
        this.f44771a.a(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        ao0 ao0Var = this.f44771a;
        if (ao0Var.M) {
            ao0Var.a(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ao0 ao0Var = this.f44771a;
        if (ao0Var.M) {
            ao0Var.a((Surface) null);
        }
        this.f44771a.a(0, 0);
    }

    public final /* synthetic */ void a(oe2 oe2Var) {
        oe2Var.a(this.f44771a.G);
    }

    public final void a(List list) {
        rf1 rf1Var = this.f44771a.f36804j;
        rf1Var.a(27, new s3.r(list, 1));
        rf1Var.a();
    }

    public final void a(q20 q20Var) {
        this.f44771a.getClass();
        rf1 rf1Var = this.f44771a.f36804j;
        rf1Var.a(27, new yi.f0(17, q20Var));
        rf1Var.a();
    }

    public final void a(vs1 vs1Var) {
        ao0 ao0Var = this.f44771a;
        lm1 lm1Var = ao0Var.Y;
        lm1Var.getClass();
        km1 km1Var = new km1(lm1Var);
        int i = 0;
        while (true) {
            us1[] us1VarArr = vs1Var.f44117b;
            if (i >= us1VarArr.length) {
                break;
            }
            us1VarArr[i].a(km1Var);
            i++;
        }
        ao0Var.Y = new lm1(km1Var);
        lm1 lm1VarA = this.f44771a.a();
        if (!lm1VarA.equals(this.f44771a.G)) {
            ao0 ao0Var2 = this.f44771a;
            ao0Var2.G = lm1VarA;
            ao0Var2.f36804j.a(14, new yi.f0(15, this));
        }
        this.f44771a.f36804j.a(28, new yi.f0(16, vs1Var));
        this.f44771a.f36804j.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void a(Object obj, long j10) {
        ((kb0) this.f44771a.f36809o).a(obj, j10);
        ao0 ao0Var = this.f44771a;
        if (ao0Var.I == obj) {
            rf1 rf1Var = ao0Var.f36804j;
            rf1Var.a(26, new zl.g0(29));
            rf1Var.a();
        }
    }

    public final void a(boolean z5) {
        ao0 ao0Var = this.f44771a;
        if (ao0Var.U == z5) {
            return;
        }
        ao0Var.U = z5;
        rf1 rf1Var = ao0Var.f36804j;
        rf1Var.a(23, new io.sentry.i(z5, 6));
        rf1Var.a();
    }

    public final void a() {
        ig0 ig0VarA = ao0.a(this.f44771a.f36817w);
        if (ig0VarA.equals(this.f44771a.X)) {
            return;
        }
        ao0 ao0Var = this.f44771a;
        ao0Var.X = ig0VarA;
        rf1 rf1Var = ao0Var.f36804j;
        rf1Var.a(29, new yi.f0(14, ig0VarA));
        rf1Var.a();
    }

    public final void a(final boolean z5, final int i) {
        rf1 rf1Var = this.f44771a.f36804j;
        rf1Var.a(30, new of1() { // from class: zl.b1
            @Override // yads.of1
            public final void invoke(Object obj) {
                ((oe2) obj).a(z5, i);
            }
        });
        rf1Var.a();
    }

    public final void a(rj3 rj3Var) {
        this.f44771a.getClass();
        rf1 rf1Var = this.f44771a.f36804j;
        rf1Var.a(25, new yi.f0(18, rj3Var));
        rf1Var.a();
    }
}

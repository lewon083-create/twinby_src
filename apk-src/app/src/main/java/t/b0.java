package t;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.ba;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0.i f32949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0.d f32950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.v0 f32951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f32952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ba f32953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f32954f;

    public b0(c0 c0Var, j0.i iVar, j0.d dVar, long j10) {
        this.f32954f = c0Var;
        this.f32949a = iVar;
        this.f32950b = dVar;
        this.f32953e = new ba(this, j10);
    }

    public final boolean a() {
        if (this.f32952d == null) {
            return false;
        }
        this.f32954f.v("Cancelling scheduled re-open: " + this.f32951c, null);
        this.f32951c.f1601c = true;
        this.f32951c = null;
        this.f32952d.cancel(false);
        this.f32952d = null;
        return true;
    }

    public final void b() {
        f2.g.h(null, this.f32951c == null);
        f2.g.h(null, this.f32952d == null);
        ba baVar = this.f32953e;
        baVar.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (baVar.f3689c == -1) {
            baVar.f3689c = jUptimeMillis;
        }
        long j10 = jUptimeMillis - baVar.f3689c;
        long jC = baVar.c();
        c0 c0Var = this.f32954f;
        if (j10 >= jC) {
            baVar.f3689c = -1L;
            com.google.android.gms.internal.auth.g.k("Camera2CameraImpl", "Camera reopening attempted for " + baVar.c() + "ms without success.");
            c0Var.G(4, null, false);
            return;
        }
        this.f32951c = new androidx.lifecycle.v0(this, this.f32949a);
        c0Var.v("Attempting camera re-open in " + baVar.a() + "ms: " + this.f32951c + " activeResuming = " + c0Var.H, null);
        this.f32952d = this.f32950b.schedule(this.f32951c, (long) baVar.a(), TimeUnit.MILLISECONDS);
    }

    public final boolean c() {
        c0 c0Var = this.f32954f;
        if (!c0Var.H) {
            return false;
        }
        int i = c0Var.f32976l;
        return i == 1 || i == 2;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f32954f.v("CameraDevice.onClosed()", null);
        f2.g.h("Unexpected onClose callback on camera device: " + cameraDevice, this.f32954f.f32975k == null);
        int iM = z.m(this.f32954f.M);
        if (iM == 1 || iM == 5) {
            f2.g.h(null, this.f32954f.f32981q.isEmpty());
            this.f32954f.t();
        } else {
            if (iM != 6 && iM != 7) {
                throw new IllegalStateException("Camera closed while in state: ".concat(z.n(this.f32954f.M)));
            }
            c0 c0Var = this.f32954f;
            int i = c0Var.f32976l;
            if (i == 0) {
                c0Var.K(false);
            } else {
                c0Var.v("Camera closed due to error: ".concat(c0.x(i)), null);
                b();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f32954f.v("CameraDevice.onDisconnected()", null);
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        c0 c0Var = this.f32954f;
        c0Var.f32975k = cameraDevice;
        c0Var.f32976l = i;
        r3.b bVar = c0Var.L;
        ((c0) bVar.f32189d).v("Camera receive onErrorCallback", null);
        bVar.o();
        int iM = z.m(this.f32954f.M);
        if (iM != 1) {
            switch (iM) {
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String id2 = cameraDevice.getId();
                    String strX = c0.x(i);
                    String strL = z.l(this.f32954f.M);
                    StringBuilder sbJ = z.j("CameraDevice.onError(): ", id2, " failed with ", strX, " while in ");
                    sbJ.append(strL);
                    sbJ.append(" state. Will attempt recovering from error.");
                    com.google.android.gms.internal.auth.g.e("Camera2CameraImpl", sbJ.toString());
                    f2.g.h("Attempt to handle open error from non open state: ".concat(z.n(this.f32954f.M)), this.f32954f.M == 9 || this.f32954f.M == 10 || this.f32954f.M == 11 || this.f32954f.M == 8 || this.f32954f.M == 7);
                    int i10 = 3;
                    if (i != 1 && i != 2 && i != 4) {
                        com.google.android.gms.internal.auth.g.k("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + c0.x(i) + " closing camera.");
                        this.f32954f.G(6, new a0.g(null, i == 3 ? 5 : 6), true);
                        this.f32954f.s();
                        return;
                    }
                    com.google.android.gms.internal.auth.g.e("Camera2CameraImpl", z.f("Attempt to reopen camera[", cameraDevice.getId(), "] after error[", c0.x(i), "]"));
                    c0 c0Var2 = this.f32954f;
                    f2.g.h("Can only reopen camera device after error if the camera device is actually in an error state.", c0Var2.f32976l != 0);
                    if (i == 1) {
                        i10 = 2;
                    } else if (i == 2) {
                        i10 = 1;
                    }
                    c0Var2.G(8, new a0.g(null, i10), true);
                    c0Var2.s();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: ".concat(z.n(this.f32954f.M)));
            }
        }
        String id3 = cameraDevice.getId();
        String strX2 = c0.x(i);
        String strL2 = z.l(this.f32954f.M);
        StringBuilder sbJ2 = z.j("CameraDevice.onError(): ", id3, " failed with ", strX2, " while in ");
        sbJ2.append(strL2);
        sbJ2.append(" state. Will finish closing camera.");
        com.google.android.gms.internal.auth.g.k("Camera2CameraImpl", sbJ2.toString());
        this.f32954f.s();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f32954f.v("CameraDevice.onOpened()", null);
        c0 c0Var = this.f32954f;
        c0Var.f32975k = cameraDevice;
        c0Var.f32976l = 0;
        this.f32953e.f3689c = -1L;
        int iM = z.m(c0Var.M);
        if (iM == 1 || iM == 5) {
            f2.g.h(null, this.f32954f.f32981q.isEmpty());
            this.f32954f.f32975k.close();
            this.f32954f.f32975k = null;
        } else {
            if (iM != 6 && iM != 7 && iM != 8) {
                throw new IllegalStateException("onOpened() should not be possible from state: ".concat(z.n(this.f32954f.M)));
            }
            this.f32954f.F(10);
            g0.n0 n0Var = this.f32954f.f32985u;
            String id2 = cameraDevice.getId();
            c0 c0Var2 = this.f32954f;
            if (n0Var.e(id2, c0Var2.f32984t.c(c0Var2.f32975k.getId()))) {
                this.f32954f.D();
            }
        }
    }
}

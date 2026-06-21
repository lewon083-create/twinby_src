package t;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33053b;

    public g1(List list, int i) {
        this.f33052a = i;
        switch (i) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.f33053b = arrayList;
                arrayList.addAll(list);
                break;
            default:
                this.f33053b = list.isEmpty() ? new a1() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new z0(list);
                break;
        }
    }

    @Override // t.e2
    public void a(h2 h2Var) {
        switch (this.f33052a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f33053b).onActive((CameraCaptureSession) ((r3.b) h2Var.q().f27180c).f32188c);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f33053b).iterator();
                while (it.hasNext()) {
                    ((e2) it.next()).a(h2Var);
                }
                break;
        }
    }

    @Override // t.e2
    public void b(h2 h2Var) {
        switch (this.f33052a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f33053b).onCaptureQueueEmpty((CameraCaptureSession) ((r3.b) h2Var.q().f27180c).f32188c);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f33053b).iterator();
                while (it.hasNext()) {
                    ((e2) it.next()).b(h2Var);
                }
                break;
        }
    }

    @Override // t.e2
    public void c(h2 h2Var) {
        switch (this.f33052a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f33053b).onClosed((CameraCaptureSession) ((r3.b) h2Var.q().f27180c).f32188c);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f33053b).iterator();
                while (it.hasNext()) {
                    ((e2) it.next()).c(h2Var);
                }
                break;
        }
    }

    @Override // t.e2
    public final void d(h2 h2Var) {
        switch (this.f33052a) {
            case 0:
                synchronized (((h1) this.f33053b).f33063a) {
                    try {
                        switch (z.m(((h1) this.f33053b).f33071j)) {
                            case 0:
                            case 2:
                            case 3:
                            case 7:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(z.o(((h1) this.f33053b).f33071j)));
                            case 1:
                                com.google.android.gms.internal.auth.g.e("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                                break;
                            case 4:
                            case 5:
                            case 6:
                                ((h1) this.f33053b).e();
                                break;
                        }
                        com.google.android.gms.internal.auth.g.k("CaptureSession", "CameraCaptureSession.onConfigureFailed() ".concat(z.o(((h1) this.f33053b).f33071j)));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f33053b).onConfigureFailed((CameraCaptureSession) ((r3.b) h2Var.q().f27180c).f32188c);
                return;
            default:
                Iterator it = ((ArrayList) this.f33053b).iterator();
                while (it.hasNext()) {
                    ((e2) it.next()).d(h2Var);
                }
                return;
        }
    }

    @Override // t.e2
    public final void e(h2 h2Var) {
        switch (this.f33052a) {
            case 0:
                synchronized (((h1) this.f33053b).f33063a) {
                    try {
                        switch (z.m(((h1) this.f33053b).f33071j)) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(z.o(((h1) this.f33053b).f33071j)));
                            case 4:
                                h2Var.i();
                                break;
                            case 5:
                                ((h1) this.f33053b).f33067e = h2Var;
                                break;
                            case 6:
                                ((h1) this.f33053b).p(8);
                                ((h1) this.f33053b).f33067e = h2Var;
                                com.google.android.gms.internal.auth.g.e("CaptureSession", "Attempting to send capture request onConfigured");
                                h1 h1Var = (h1) this.f33053b;
                                h1Var.l(h1Var.f33068f);
                                h1 h1Var2 = (h1) this.f33053b;
                                h1Var2.f33077p.e().a(new a0(3, h1Var2), hl.d.j());
                                break;
                        }
                        com.google.android.gms.internal.auth.g.e("CaptureSession", "CameraCaptureSession.onConfigured() mState=".concat(z.o(((h1) this.f33053b).f33071j)));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f33053b).onConfigured((CameraCaptureSession) ((r3.b) h2Var.q().f27180c).f32188c);
                return;
            default:
                Iterator it = ((ArrayList) this.f33053b).iterator();
                while (it.hasNext()) {
                    ((e2) it.next()).e(h2Var);
                }
                return;
        }
    }

    @Override // t.e2
    public final void f(h2 h2Var) {
        switch (this.f33052a) {
            case 0:
                synchronized (((h1) this.f33053b).f33063a) {
                    try {
                        if (z.m(((h1) this.f33053b).f33071j) == 0) {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(z.o(((h1) this.f33053b).f33071j)));
                        }
                        com.google.android.gms.internal.auth.g.e("CaptureSession", "CameraCaptureSession.onReady() ".concat(z.o(((h1) this.f33053b).f33071j)));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f33053b).onReady((CameraCaptureSession) ((r3.b) h2Var.q().f27180c).f32188c);
                return;
            default:
                Iterator it = ((ArrayList) this.f33053b).iterator();
                while (it.hasNext()) {
                    ((e2) it.next()).f(h2Var);
                }
                return;
        }
    }

    @Override // t.e2
    public final void g(h2 h2Var) {
        switch (this.f33052a) {
            case 0:
                synchronized (((h1) this.f33053b).f33063a) {
                    try {
                        if (((h1) this.f33053b).f33071j == 1) {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(z.o(((h1) this.f33053b).f33071j)));
                        }
                        com.google.android.gms.internal.auth.g.e("CaptureSession", "onSessionFinished()");
                        ((h1) this.f33053b).e();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.f33053b).iterator();
                while (it.hasNext()) {
                    ((e2) it.next()).g(h2Var);
                }
                return;
        }
    }

    @Override // t.e2
    public void h(h2 h2Var, Surface surface) {
        switch (this.f33052a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f33053b).onSurfacePrepared((CameraCaptureSession) ((r3.b) h2Var.q().f27180c).f32188c, surface);
                break;
            case 2:
                Iterator it = ((ArrayList) this.f33053b).iterator();
                while (it.hasNext()) {
                    ((e2) it.next()).h(h2Var, surface);
                }
                break;
        }
    }

    public g1(h1 h1Var) {
        this.f33052a = 0;
        this.f33053b = h1Var;
    }

    private final void i(h2 h2Var) {
    }
}

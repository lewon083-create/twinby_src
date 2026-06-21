package t;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33328b;

    public /* synthetic */ z0(int i, Object obj) {
        this.f33327a = i;
        this.f33328b = obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.f33327a) {
            case 0:
                Iterator it = ((ArrayList) this.f33328b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                break;
            case 1:
                h2 h2Var = (h2) this.f33328b;
                h2Var.j(cameraCaptureSession);
                h2Var.a(h2Var);
                break;
            default:
                super.onActive(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.f33327a) {
            case 0:
                Iterator it = ((ArrayList) this.f33328b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                break;
            case 1:
                h2 h2Var = (h2) this.f33328b;
                h2Var.j(cameraCaptureSession);
                h2Var.b(h2Var);
                break;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f33327a) {
            case 0:
                Iterator it = ((ArrayList) this.f33328b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                break;
            case 1:
                h2 h2Var = (h2) this.f33328b;
                h2Var.j(cameraCaptureSession);
                h2Var.c(h2Var);
                break;
            default:
                super.onClosed(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        j1.h hVar;
        switch (this.f33327a) {
            case 0:
                Iterator it = ((ArrayList) this.f33328b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((h2) this.f33328b).j(cameraCaptureSession);
                    h2 h2Var = (h2) this.f33328b;
                    h2Var.d(h2Var);
                    synchronized (((h2) this.f33328b).f33081a) {
                        f2.g.g(((h2) this.f33328b).i, "OpenCaptureSession completer should not null");
                        h2 h2Var2 = (h2) this.f33328b;
                        hVar = h2Var2.i;
                        h2Var2.i = null;
                        break;
                    }
                    hVar.d(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th2) {
                    synchronized (((h2) this.f33328b).f33081a) {
                        f2.g.g(((h2) this.f33328b).i, "OpenCaptureSession completer should not null");
                        h2 h2Var3 = (h2) this.f33328b;
                        j1.h hVar2 = h2Var3.i;
                        h2Var3.i = null;
                        hVar2.d(new IllegalStateException("onConfigureFailed"));
                        throw th2;
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        j1.h hVar;
        switch (this.f33327a) {
            case 0:
                Iterator it = ((ArrayList) this.f33328b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((h2) this.f33328b).j(cameraCaptureSession);
                    h2 h2Var = (h2) this.f33328b;
                    h2Var.e(h2Var);
                    synchronized (((h2) this.f33328b).f33081a) {
                        f2.g.g(((h2) this.f33328b).i, "OpenCaptureSession completer should not null");
                        h2 h2Var2 = (h2) this.f33328b;
                        hVar = h2Var2.i;
                        h2Var2.i = null;
                        break;
                    }
                    hVar.b(null);
                    return;
                } catch (Throwable th2) {
                    synchronized (((h2) this.f33328b).f33081a) {
                        f2.g.g(((h2) this.f33328b).i, "OpenCaptureSession completer should not null");
                        h2 h2Var3 = (h2) this.f33328b;
                        j1.h hVar2 = h2Var3.i;
                        h2Var3.i = null;
                        hVar2.b(null);
                        throw th2;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ka.k kVar = (ka.k) this.f33328b;
                    ImageWriter imageWriterNewInstance = ImageWriter.newInstance(inputSurface, 1);
                    if (((AtomicBoolean) kVar.f27325d).get()) {
                        if (((ImageWriter) kVar.f27324c) != null) {
                            com.google.android.gms.internal.auth.g.O("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                            ((ImageWriter) kVar.f27324c).close();
                        }
                        kVar.f27324c = imageWriterNewInstance;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.f33327a) {
            case 0:
                Iterator it = ((ArrayList) this.f33328b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                break;
            case 1:
                h2 h2Var = (h2) this.f33328b;
                h2Var.j(cameraCaptureSession);
                h2Var.f(h2Var);
                break;
            default:
                super.onReady(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.f33327a) {
            case 0:
                Iterator it = ((ArrayList) this.f33328b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                break;
            case 1:
                h2 h2Var = (h2) this.f33328b;
                h2Var.j(cameraCaptureSession);
                h2Var.h(h2Var, surface);
                break;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                break;
        }
    }

    public z0(List list) {
        this.f33327a = 0;
        this.f33328b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof a1)) {
                ((ArrayList) this.f33328b).add(stateCallback);
            }
        }
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }
}

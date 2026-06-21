package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import fh.of;
import g0.r2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33046b;

    public e0(g0.p pVar) {
        this.f33045a = 1;
        if (pVar == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f33046b = pVar;
    }

    public static int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof r2) && (num = (Integer) ((r2) captureRequest.getTag()).f19735a.get("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
        switch (this.f33045a) {
            case 0:
                Iterator it = ((ArrayList) this.f33046b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
                }
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        r2 r2Var;
        switch (this.f33045a) {
            case 0:
                Iterator it = ((ArrayList) this.f33046b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            case 1:
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                Object tag = captureRequest.getTag();
                if (tag != null) {
                    f2.g.a("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof r2);
                    r2Var = (r2) tag;
                } else {
                    r2Var = r2.f19734b;
                }
                ((g0.p) this.f33046b).b(a(captureRequest), new r3.b(5, r2Var, totalCaptureResult));
                return;
            default:
                synchronized (((h1) this.f33046b).f33063a) {
                    try {
                        g0.h2 h2Var = ((h1) this.f33046b).f33068f;
                        if (h2Var == null) {
                            return;
                        }
                        g0.s0 s0Var = h2Var.f19589g;
                        com.google.android.gms.internal.auth.g.e("CaptureSession", "Submit FLASH_MODE_OFF request");
                        h1 h1Var = (h1) this.f33046b;
                        h1Var.f33076o.getClass();
                        h1Var.k(Collections.singletonList(fd.b.a(s0Var)));
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f33045a) {
            case 0:
                Iterator it = ((ArrayList) this.f33046b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            case 1:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ((g0.p) this.f33046b).c(a(captureRequest), new of());
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f33045a) {
            case 0:
                Iterator it = ((ArrayList) this.f33046b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        switch (this.f33045a) {
            case 0:
                Iterator it = ((ArrayList) this.f33046b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
                }
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j10) {
        switch (this.f33045a) {
            case 0:
                Iterator it = ((ArrayList) this.f33046b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j10);
                }
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j10);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        switch (this.f33045a) {
            case 0:
                Iterator it = ((ArrayList) this.f33046b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                }
                break;
            case 1:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                ((g0.p) this.f33046b).d(a(captureRequest));
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                break;
        }
    }

    public e0(List list) {
        this.f33045a = 0;
        this.f33046b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof f0)) {
                ((ArrayList) this.f33046b).add(captureCallback);
            }
        }
    }

    public e0(h1 h1Var) {
        this.f33045a = 2;
        this.f33046b = h1Var;
    }
}

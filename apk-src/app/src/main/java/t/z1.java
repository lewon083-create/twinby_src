package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureRequest f33329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f33330b;

    public z1(CaptureRequest forwardedRequest, m delegate) {
        Intrinsics.checkNotNullParameter(forwardedRequest, "forwardedRequest");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f33329a = forwardedRequest;
        this.f33330b = delegate;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession session, CaptureRequest request, Surface target, long j10) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f33330b.onCaptureBufferLost(session, this.f33329a, target, j10);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f33330b.onCaptureCompleted(session, this.f33329a, result);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession session, CaptureRequest request, CaptureFailure failure) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.f33330b.onCaptureFailed(session, this.f33329a, failure);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession session, CaptureRequest request, CaptureResult partialResult) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(partialResult, "partialResult");
        this.f33330b.onCaptureProgressed(session, this.f33329a, partialResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession session, int i) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f33330b.onCaptureSequenceAborted(session, i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession session, int i, long j10) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f33330b.onCaptureSequenceCompleted(session, i, j10);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession session, CaptureRequest request, long j10, long j11) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f33330b.onCaptureStarted(session, this.f33329a, j10, j11);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession session, CaptureRequest request, long j10, long j11) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f33330b.onReadoutStarted(session, this.f33329a, j10, j11);
    }
}

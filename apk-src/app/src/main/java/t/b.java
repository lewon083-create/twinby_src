package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u.i f32943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Range f32944c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j1.h f32946e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f32948g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f32945d = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f32947f = 1.0f;

    public b(u.i iVar) {
        boolean z5 = false;
        this.f32948g = false;
        this.f32943b = iVar;
        this.f32944c = (Range) iVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) iVar.f33962b.f28630b).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (iArr[i] == 1) {
                        z5 = true;
                        break;
                    }
                    i++;
                }
            }
        }
        this.f32948g = z5;
    }

    @Override // t.m2
    public final void b(TotalCaptureResult totalCaptureResult) {
        if (this.f32946e != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 == null) {
                return;
            }
            if (this.f32947f == f10.floatValue()) {
                this.f32946e.b(null);
                this.f32946e = null;
            }
        }
    }

    @Override // t.m2
    public final float e() {
        return ((Float) this.f32944c.getUpper()).floatValue();
    }

    @Override // t.m2
    public final float k() {
        return ((Float) this.f32944c.getLower()).floatValue();
    }

    @Override // t.m2
    public final void l(s.a options) {
        options.c(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f32945d));
        if (this.f32948g) {
            Intrinsics.checkNotNullParameter(options, "options");
            g0.u0 priority = g0.u0.f19774d;
            Intrinsics.checkNotNullParameter(priority, "priority");
            if (Build.VERSION.SDK_INT >= 34) {
                options.c(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
            }
        }
    }

    @Override // t.m2
    public final void m(float f10, j1.h hVar) {
        this.f32945d = f10;
        j1.h hVar2 = this.f32946e;
        if (hVar2 != null) {
            hVar2.d(new a0.o("There is a new zoomRatio being set"));
        }
        this.f32947f = this.f32945d;
        this.f32946e = hVar;
    }

    @Override // t.m2
    public final Rect o() {
        Rect rect = (Rect) this.f32943b.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // t.m2
    public final void q() {
        this.f32945d = 1.0f;
        j1.h hVar = this.f32946e;
        if (hVar != null) {
            hVar.d(new a0.o("Camera is not active."));
            this.f32946e = null;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zx extends lw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SensorManager f13140a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Display f13142c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f13145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kw0 f13146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ay f13147h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f13143d = new float[9];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f13144e = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13141b = new Object();

    public zx(Context context) {
        this.f13140a = (SensorManager) context.getSystemService("sensor");
        this.f13142c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.lw0
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f13141b) {
            try {
                if (this.f13145f == null) {
                    this.f13145f = new float[9];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        float[] fArr2 = this.f13143d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f13142c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, VKApiCodes.CODE_INVALID_PHOTO_FORMAT, this.f13144e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(fArr2, VKApiCodes.CODE_INVALID_PHOTO_FORMAT, 130, this.f13144e);
        } else if (rotation != 3) {
            System.arraycopy(fArr2, 0, this.f13144e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(fArr2, 130, 1, this.f13144e);
        }
        float[] fArr3 = this.f13144e;
        float f10 = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f10;
        float f11 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f11;
        float f12 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f12;
        synchronized (this.f13141b) {
            System.arraycopy(fArr3, 0, this.f13145f, 0, 9);
        }
        ay ayVar = this.f13147h;
        if (ayVar != null) {
            Object obj = ayVar.f3473v;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
    }

    public final void b() {
        if (this.f13146g == null) {
            return;
        }
        this.f13140a.unregisterListener(this);
        this.f13146g.post(new ke(3));
        this.f13146g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.f13141b) {
            try {
                float[] fArr2 = this.f13145f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

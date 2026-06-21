package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qf0 extends lw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SensorManager f9490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Sensor f9491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ff0 f9494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9495g;

    public qf0(Context context) {
        this.f9489a = context;
    }

    @Override // com.google.android.gms.internal.ads.lw0
    public final void a(SensorEvent sensorEvent) {
        wk wkVar = al.f3065ja;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10))) >= ((Float) ykVar2.a(al.f3080ka)).floatValue()) {
                p9.k.C.f31304k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f9492d + ((long) ((Integer) ykVar2.a(al.f3097la)).intValue()) <= jCurrentTimeMillis) {
                    if (this.f9492d + ((long) ((Integer) ykVar2.a(al.f3110ma)).intValue()) < jCurrentTimeMillis) {
                        this.f9493e = 0;
                    }
                    t9.c0.m("Shake detected.");
                    this.f9492d = jCurrentTimeMillis;
                    int i = this.f9493e + 1;
                    this.f9493e = i;
                    ff0 ff0Var = this.f9494f;
                    if (ff0Var == null || i != ((Integer) ykVar2.a(al.f3126na)).intValue()) {
                        return;
                    }
                    ff0Var.e(new df0(0), ef0.f4932d);
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                wk wkVar = al.f3065ja;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    if (this.f9490b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f9489a.getSystemService("sensor");
                        this.f9490b = sensorManager2;
                        if (sensorManager2 == null) {
                            u9.i.h("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f9491c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f9495g && (sensorManager = this.f9490b) != null && (sensor = this.f9491c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        p9.k.C.f31304k.getClass();
                        this.f9492d = System.currentTimeMillis() - ((long) ((Integer) sVar.f31970c.a(al.f3097la)).intValue());
                        this.f9495g = true;
                        t9.c0.m("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ue0 extends lw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SensorManager f10918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sensor f10919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10920c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f10921d = Float.valueOf(0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10925h;
    public ff0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10926j;

    public ue0(Context context) {
        p9.k.C.f31304k.getClass();
        this.f10922e = System.currentTimeMillis();
        this.f10923f = 0;
        this.f10924g = false;
        this.f10925h = false;
        this.i = null;
        this.f10926j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f10918a = sensorManager;
        if (sensorManager != null) {
            this.f10919b = sensorManager.getDefaultSensor(4);
        } else {
            this.f10919b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.lw0
    public final void a(SensorEvent sensorEvent) {
        wk wkVar = al.f3139oa;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            p9.k.C.f31304k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f10922e + ((long) ((Integer) ykVar2.a(al.f3169qa)).intValue()) < jCurrentTimeMillis) {
                this.f10923f = 0;
                this.f10922e = jCurrentTimeMillis;
                this.f10924g = false;
                this.f10925h = false;
                this.f10920c = this.f10921d.floatValue();
            }
            float fFloatValue = this.f10921d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.f10921d = Float.valueOf(fFloatValue);
            float f10 = this.f10920c;
            wk wkVar2 = al.f3154pa;
            if (fFloatValue > ((Float) ykVar2.a(wkVar2)).floatValue() + f10) {
                this.f10920c = this.f10921d.floatValue();
                this.f10925h = true;
            } else if (this.f10921d.floatValue() < this.f10920c - ((Float) ykVar2.a(wkVar2)).floatValue()) {
                this.f10920c = this.f10921d.floatValue();
                this.f10924g = true;
            }
            if (this.f10921d.isInfinite()) {
                this.f10921d = Float.valueOf(0.0f);
                this.f10920c = 0.0f;
            }
            if (this.f10924g && this.f10925h) {
                t9.c0.m("Flick detected.");
                this.f10922e = jCurrentTimeMillis;
                int i = this.f10923f + 1;
                this.f10923f = i;
                this.f10924g = false;
                this.f10925h = false;
                ff0 ff0Var = this.i;
                if (ff0Var == null || i != ((Integer) ykVar2.a(al.f3183ra)).intValue()) {
                    return;
                }
                ff0Var.e(new df0(1), ef0.f4932d);
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3139oa)).booleanValue()) {
                    if (!this.f10926j && (sensorManager = this.f10918a) != null && (sensor = this.f10919b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f10926j = true;
                        t9.c0.m("Listening for flick gestures.");
                    }
                    if (this.f10918a == null || this.f10919b == null) {
                        u9.i.h("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

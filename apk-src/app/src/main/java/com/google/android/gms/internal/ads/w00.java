package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yp1 f11560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xr1 f11561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f11562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f11563e = new AtomicBoolean(false);

    public w00(ScheduledExecutorService scheduledExecutorService) {
        this.f11562d = scheduledExecutorService;
    }

    public final void a() {
        try {
            String strC = com.google.android.gms.internal.measurement.d4.m("GET_VARIATIONS_HEADER") ? z6.b.c() : null;
            if (strC != null && !strC.isEmpty()) {
                this.f11559a = strC;
                byte[] bArrDecode = Base64.decode(strC, 10);
                this.f11560b = yp1.z(bArrDecode, kn1.a());
                wk wkVar = al.Z9;
                q9.s sVar = q9.s.f31967e;
                yk ykVar = sVar.f31970c;
                yk ykVar2 = sVar.f31970c;
                if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
                    this.f11561c = xr1.z(bArrDecode, kn1.a());
                }
                if (((Boolean) ykVar2.a(al.X9)).booleanValue() && ((Boolean) ykVar2.a(al.W9)).booleanValue()) {
                    this.f11562d.schedule(new s(27, this), ((Integer) ykVar2.a(al.Y9)).intValue(), TimeUnit.MINUTES);
                }
            }
        } catch (co1 e3) {
            e = e3;
            p9.k.C.f31302h.e("ChromeVariations", e);
        } catch (IllegalArgumentException e7) {
            e = e7;
            p9.k.C.f31302h.e("ChromeVariations", e);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.util.Range;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f11557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Range f11558d;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r7, long r9) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 == 0) goto Ld
            r2 = r4
            goto Le
        Ld:
            r2 = r3
        Le:
            com.google.android.gms.internal.measurement.h5.h(r2)
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L16
            r3 = r4
        L16:
            com.google.android.gms.internal.measurement.h5.h(r3)
            long r2 = r6.f11555a
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L31
            long r4 = r6.f11556b
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L31
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 == 0) goto L31
            long r0 = r9 - r4
            double r0 = (double) r0
            long r2 = r7 - r2
            double r2 = (double) r2
            double r0 = r0 / r2
            goto L3d
        L31:
            android.util.Range r0 = r6.f11558d
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
        L3d:
            android.util.Range r2 = r6.f11558d
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Comparable r0 = r2.clamp(r0)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            double r2 = r6.f11557c
            r4 = 4605380979056443392(0x3fe99999a0000000, double:0.800000011920929)
            double r2 = r2 * r4
            r4 = 4596373779801702400(0x3fc99999a0000000, double:0.20000000298023224)
            double r0 = r0 * r4
            double r0 = r0 + r2
            r6.f11557c = r0
            r6.f11555a = r7
            r6.f11556b = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w0.a(long, long):void");
    }

    public void b() {
        this.f11557c = ((Double) this.f11558d.getUpper()).doubleValue();
        this.f11555a = -9223372036854775807L;
        this.f11556b = -9223372036854775807L;
    }

    public void c(float f10) {
        com.google.android.gms.internal.measurement.h5.h(f10 > 0.0f);
        this.f11558d = new Range(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE), Double.valueOf(1.0d / ((double) f10)));
        b();
    }

    public void d() {
        this.f11557c = ((Double) this.f11558d.getUpper()).doubleValue();
        this.f11555a = -9223372036854775807L;
        this.f11556b = -9223372036854775807L;
    }
}

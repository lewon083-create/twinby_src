package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class eg extends ig {
    public final cf i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f4940k;

    public eg(qf qfVar, jd jdVar, int i, cf cfVar, long j10, long j11) {
        super(qfVar, "MHYgRB9ZLJ711MlDBgDgyPDdkDVVlHwuqDeF/1i1ByNixJnhURH1lj12DYAv6vPJ", "+dsC4zlVzClLb/gffysp/RM/1OAwcqKcuzzXTv3qmQk=", jdVar, i, 11);
        this.i = cfVar;
        this.f4939j = j10;
        this.f4940k = j11;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void a() {
        cf cfVar = this.i;
        if (cfVar != null) {
            String str = (String) this.f6485f.invoke(null, (NetworkCapabilities) cfVar.f4193c, Long.valueOf(this.f4939j), Long.valueOf(this.f4940k));
            af afVar = new af();
            HashMap mapN = pn1.n(str);
            if (mapN != null) {
                afVar.I = (Long) mapN.get(0);
                afVar.J = (Long) mapN.get(1);
                afVar.K = (Long) mapN.get(2);
            }
            jd jdVar = this.f6484e;
            synchronized (jdVar) {
                try {
                    long jLongValue = afVar.I.longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).I0(jLongValue);
                    if (((Long) afVar.J).longValue() >= 0) {
                        long jLongValue2 = ((Long) afVar.J).longValue();
                        jdVar.b();
                        ((wd) jdVar.f9560c).g0(jLongValue2);
                    }
                    if (((Long) afVar.K).longValue() >= 0) {
                        long jLongValue3 = ((Long) afVar.K).longValue();
                        jdVar.b();
                        ((wd) jdVar.f9560c).h0(jLongValue3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}

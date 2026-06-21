package yads;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p8 {
    public static AdQualityVerifierAdapter a() {
        ij.l lVarS;
        try {
            ij.k kVar = ij.m.f21341c;
            qm2.a("com.yandex.mobile.ads.quality.AdQualityVerifierAdapter", new Object[0]);
            lVarS = null;
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            lVarS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        Throwable thA = ij.m.a(lVarS);
        if (thA != null) {
            thA.getMessage();
        }
        if (lVarS != null) {
            lVarS = null;
        }
        if (lVarS == null) {
            return null;
        }
        throw new ClassCastException();
    }
}

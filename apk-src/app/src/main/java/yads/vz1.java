package yads;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vz1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oi f44230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3 f44231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n12 f44232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mn2 f44233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kf1 f44234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx0 f44235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hk.a0 f44236g = z10.b(null);

    public vz1(kx0 kx0Var, mn2 mn2Var, y3 y3Var, n12 n12Var, oi oiVar, kf1 kf1Var) {
        this.f44230a = oiVar;
        this.f44231b = y3Var;
        this.f44232c = n12Var;
        this.f44233d = mn2Var;
        this.f44234e = kf1Var;
        this.f44235f = kx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jElapsedRealtime;
        Long l10 = this.f44233d.f40972a;
        if (l10 != null) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - l10.longValue();
        } else {
            jElapsedRealtime = 0;
        }
        kf1 kf1Var = this.f44234e;
        if (kf1Var == null || jElapsedRealtime < kf1Var.f40185e || !this.f44230a.f41544e) {
            return;
        }
        hk.c0.m(this.f44236g, null, new uz1(this, view, null), 3);
    }
}

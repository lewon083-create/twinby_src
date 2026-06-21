package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd0 f4557a;

    public dd0(sd0 sd0Var) {
        this.f4557a = sd0Var;
    }

    public final boolean a(nw0 nw0Var) {
        boolean zK = nw0Var.K();
        u9.k kVar = u9.k.f34393b;
        sd0 sd0Var = this.f4557a;
        if (zK) {
            zd1 zd1VarA = sd0Var.a();
            zd1VarA.v("action", "aq_ad_closed");
            zd1VarA.v("gqi", nw0Var.C());
            zd1VarA.v("aq_ad_duration", String.valueOf(nw0Var.D()));
            zd1VarA.v("aq_ad_bounce_cnt", String.valueOf(nw0Var.E()));
            zd1VarA.v("aq_time_away", String.valueOf(nw0Var.H()));
            return zd1VarA.x().equals(kVar);
        }
        zd1 zd1VarA2 = sd0Var.a();
        zd1VarA2.v("action", "aq_ad_kill");
        zd1VarA2.v("gqi", nw0Var.C());
        zd1VarA2.v("aq_ad_duration", String.valueOf(nw0Var.D()));
        zd1VarA2.v("aq_ad_bounce_cnt", String.valueOf(nw0Var.E()));
        zd1VarA2.v("aq_time_away", String.valueOf(nw0Var.H()));
        zd1VarA2.v("aq_is_os_kill", String.valueOf(nw0Var.G()));
        return zd1VarA2.x().equals(kVar);
    }
}

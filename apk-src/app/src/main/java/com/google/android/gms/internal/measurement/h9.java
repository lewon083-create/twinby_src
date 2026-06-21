package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h9 implements g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4 f13776a;

    static {
        boolean z5 = true;
        com.google.android.gms.internal.auth.q qVar = new com.google.android.gms.internal.auth.q(m4.a(), z5, z5);
        f13776a = qVar.b("measurement.session_stitching_token_enabled", false);
        qVar.b("measurement.link_sst_to_sid", true);
    }
}

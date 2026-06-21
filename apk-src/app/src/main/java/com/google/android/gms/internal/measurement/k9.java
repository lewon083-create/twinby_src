package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k9 implements j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4 f13859a;

    static {
        boolean z5 = true;
        com.google.android.gms.internal.auth.q qVar = new com.google.android.gms.internal.auth.q(m4.a(), z5, z5);
        f13859a = qVar.b("measurement.client.sessions.enable_fix_background_engagement", false);
        qVar.b("measurement.client.sessions.enable_pause_engagement_in_background", true);
        qVar.a(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }
}

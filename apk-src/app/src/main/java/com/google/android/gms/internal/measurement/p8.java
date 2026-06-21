package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p8 implements o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4 f13923a;

    static {
        boolean z5 = true;
        com.google.android.gms.internal.auth.q qVar = new com.google.android.gms.internal.auth.q(m4.a(), z5, z5);
        qVar.b("measurement.sdk.collection.enable_extend_user_property_size", true);
        f13923a = qVar.b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        qVar.a(0L, "measurement.id.sdk.collection.last_deep_link_referrer2");
    }
}

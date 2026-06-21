package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o7 implements n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4 f13909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n4 f13910b;

    static {
        boolean z5 = true;
        com.google.android.gms.internal.auth.q qVar = new com.google.android.gms.internal.auth.q(m4.a(), z5, z5);
        qVar.b("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        qVar.b("measurement.set_default_event_parameters_with_backfill.service", true);
        qVar.a(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        f13909a = qVar.b("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f13910b = qVar.b("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        qVar.b("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a8 implements z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4 f13661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n4 f13662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n4 f13663c;

    static {
        boolean z5 = true;
        com.google.android.gms.internal.auth.q qVar = new com.google.android.gms.internal.auth.q(m4.a(), z5, z5);
        qVar.b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f13661a = qVar.b("measurement.audience.refresh_event_count_filters_timestamp", false);
        f13662b = qVar.b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f13663c = qVar.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}

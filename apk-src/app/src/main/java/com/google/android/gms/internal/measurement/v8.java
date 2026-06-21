package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v8 implements u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4 f14025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n4 f14026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n4 f14027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n4 f14028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n4 f14029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n4 f14030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n4 f14031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n4 f14032h;

    static {
        boolean z5 = true;
        com.google.android.gms.internal.auth.q qVar = new com.google.android.gms.internal.auth.q(m4.a(), z5, z5);
        qVar.b("measurement.rb.attribution.ad_campaign_info", true);
        qVar.b("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f14025a = qVar.b("measurement.rb.attribution.client2", true);
        f14026b = qVar.b("measurement.rb.attribution.followup1.service", false);
        qVar.b("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f14027c = qVar.b("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        qVar.b("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f14028d = qVar.b("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f14029e = qVar.b("measurement.rb.attribution.retry_disposition", false);
        f14030f = qVar.b("measurement.rb.attribution.service", true);
        f14031g = qVar.b("measurement.rb.attribution.enable_trigger_redaction", true);
        f14032h = qVar.b("measurement.rb.attribution.uuid_generation", true);
        qVar.a(0L, "measurement.id.rb.attribution.retry_disposition");
        qVar.b("measurement.rb.attribution.improved_retry", true);
    }
}

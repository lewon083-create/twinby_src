package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s8 implements r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4 f13961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n4 f13962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n4 f13963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n4 f13964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n4 f13965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n4 f13966f;

    static {
        boolean z5 = true;
        com.google.android.gms.internal.auth.q qVar = new com.google.android.gms.internal.auth.q(m4.a(), z5, z5);
        f13961a = qVar.b("measurement.test.boolean_flag", false);
        f13962b = qVar.a(-1L, "measurement.test.cached_long_flag");
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = n4.f13887g;
        f13963c = new n4(qVar, "measurement.test.double_flag", dValueOf, 2);
        f13964d = qVar.a(-2L, "measurement.test.int_flag");
        f13965e = qVar.a(-1L, "measurement.test.long_flag");
        f13966f = qVar.e("measurement.test.string_flag", "---");
    }
}

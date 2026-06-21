package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f13631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f13632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f13633c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f13636f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13634d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13635e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13637g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13638h = false;
    public yc.d i = new yc.d(new yc.d());

    public z2(g gVar, c cVar, o oVar, a0 a0Var) {
        this.f13631a = gVar;
        this.f13632b = cVar;
        this.f13633c = oVar;
        this.f13636f = a0Var;
    }

    public final boolean a() {
        g gVar = this.f13631a;
        if (!gVar.f13391b.getBoolean("is_pub_misconfigured", false)) {
            int i = !c() ? 0 : gVar.f13391b.getInt("consent_status", 0);
            if (i != 1 && i != 3) {
                return false;
            }
        }
        return true;
    }

    public final int b() {
        if (!c()) {
            return 1;
        }
        String string = this.f13631a.f13391b.getString("privacy_options_requirement_status", "UNKNOWN");
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("UNKNOWN")) {
            return 1;
        }
        if (string.equals("NOT_REQUIRED")) {
            return 2;
        }
        if (string.equals("REQUIRED")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.".concat(string));
    }

    public final boolean c() {
        boolean z5;
        synchronized (this.f13634d) {
            z5 = this.f13637g;
        }
        return z5;
    }
}

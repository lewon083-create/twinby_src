package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q30 implements fh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sz f9317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f9318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j30 f9319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ua.a f9320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9321f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9322g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m30 f9323h = new m30();

    public q30(Executor executor, j30 j30Var, ua.a aVar) {
        this.f9318c = executor;
        this.f9319d = j30Var;
        this.f9320e = aVar;
    }

    @Override // com.google.android.gms.internal.ads.fh
    public final void I(eh ehVar) {
        boolean z5 = this.f9322g ? false : ehVar.f4951j;
        m30 m30Var = this.f9323h;
        m30Var.f7752a = z5;
        this.f9320e.getClass();
        m30Var.f7754c = SystemClock.elapsedRealtime();
        m30Var.f7756e = ehVar;
        if (this.f9321f) {
            a();
        }
    }

    public final void a() {
        try {
            JSONObject jSONObjectI = this.f9319d.i(this.f9323h);
            if (this.f9317b != null) {
                this.f9318c.execute(new l81(18, this, jSONObjectI));
            }
        } catch (JSONException e3) {
            t9.c0.n("Failed to call video active view js", e3);
        }
    }
}

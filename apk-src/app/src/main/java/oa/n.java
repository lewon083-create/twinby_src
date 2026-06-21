package oa;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.ads.kw0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f29863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f29864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kw0 f29865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ma.f f29866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1.f f29867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f29868h;

    public n(h hVar, e eVar) {
        ma.f fVar = ma.f.f28773d;
        this.f29862b = hVar;
        this.f29864d = new AtomicReference(null);
        this.f29865e = new kw0(Looper.getMainLooper(), 2);
        this.f29866f = fVar;
        this.f29867g = new h1.f(0);
        this.f29868h = eVar;
        hVar.f(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oa.h] */
    public final Activity a() {
        Activity activityC = this.f29862b.c();
        pa.c0.i(activityC);
        return activityC;
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.f29864d.set(bundle.getBoolean("resolving_error", false) ? new d0(new ma.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void c() {
        this.f29863c = false;
        e eVar = this.f29868h;
        eVar.getClass();
        synchronized (e.f29835s) {
            try {
                if (eVar.f29846l == this) {
                    eVar.f29846l = null;
                    eVar.f29847m.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        if (this.f29867g.isEmpty()) {
            return;
        }
        this.f29868h.e(this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ma.b bVar = new ma.b(13, null, null);
        AtomicReference atomicReference = this.f29864d;
        d0 d0Var = (d0) atomicReference.get();
        int i = d0Var == null ? -1 : d0Var.f29831a;
        atomicReference.set(null);
        this.f29868h.h(bVar, i);
    }
}

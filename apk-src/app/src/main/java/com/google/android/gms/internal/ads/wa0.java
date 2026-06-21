package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wa0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kc0 f11707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ua.a f11708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public co f11709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public so f11710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f11712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f11713h;

    public wa0(kc0 kc0Var, ua.a aVar) {
        this.f11707b = kc0Var;
        this.f11708c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.f11713h;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f11711f != null && this.f11712g != null) {
            HashMap map = new HashMap();
            map.put("id", this.f11711f);
            this.f11708c.getClass();
            map.put("time_interval", String.valueOf(System.currentTimeMillis() - this.f11712g.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f11707b.d(map);
        }
        this.f11711f = null;
        this.f11712g = null;
        WeakReference weakReference2 = this.f11713h;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.f11713h = null;
    }
}

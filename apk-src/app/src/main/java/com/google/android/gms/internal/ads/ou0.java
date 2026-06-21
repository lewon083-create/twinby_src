package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ou0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8802a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8804c = System.nanoTime();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8805d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zu0 f8803b = new zu0(null);

    public ou0(String str) {
        this.f8802a = str;
    }

    public void b() {
        this.f8803b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView c() {
        return (WebView) this.f8803b.get();
    }

    public void d(ut0 ut0Var, k7 k7Var) {
        e(ut0Var, k7Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.android.gms.internal.ads.ut0 r10, com.google.android.gms.internal.ads.k7 r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ou0.e(com.google.android.gms.internal.ads.ut0, com.google.android.gms.internal.ads.k7, org.json.JSONObject):void");
    }

    public final void f(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        su0.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        c6.f4048h.A(c(), "setLastActivity", jSONObject);
    }

    public void a() {
    }
}

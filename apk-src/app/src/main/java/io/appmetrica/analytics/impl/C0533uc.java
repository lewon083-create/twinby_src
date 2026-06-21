package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.uc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0533uc implements G8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pg f24842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ve f24843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24844c = "activation_unlock_event_sending";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f24845d;

    public C0533uc(@NotNull Pg pg, @NotNull C0401p4 c0401p4, @NotNull Ve ve2) {
        this.f24842a = pg;
        this.f24843b = ve2;
        this.f24845d = new AtomicBoolean(ve2.a(false) || a(c0401p4));
    }

    public final void a(String str) {
        try {
            Pj pj2 = AbstractC0366nj.f24449a;
            String str2 = this.f24844c;
            JSONObject jSONObjectPut = new JSONObject().put("source", str).put("framework", FrameworkDetector.framework());
            N9 n9I = C0382oa.I.i();
            Bundle applicationMetaData = n9I.f22730d.getApplicationMetaData(n9I.f22727a);
            JSONObject jSONObjectPut2 = jSONObjectPut.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C0317lk c0317lk = C0382oa.I.D;
            String string = jSONObjectPut2.put("activation_offset", TimeUnit.SECONDS.convert(c0317lk.f24315a.currentTimeMillis() - c0317lk.f24316b, TimeUnit.MILLISECONDS)).toString();
            pj2.getClass();
            pj2.a(new Nj(str2, string));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final boolean b() {
        String str;
        if (!this.f24845d.get() && (str = ((C0264jh) this.f24842a.a()).f24162m) != null && !str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f24845d.compareAndSet(false, true)) {
            this.f24843b.b(true);
            a("activation");
        }
        return this.f24845d.get();
    }

    public final void a() {
        if (this.f24845d.compareAndSet(false, true)) {
            this.f24843b.b(true);
            a("timer");
        }
    }

    public static boolean a(C0401p4 c0401p4) {
        String str = c0401p4.f24547a;
        return (str == null || str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}

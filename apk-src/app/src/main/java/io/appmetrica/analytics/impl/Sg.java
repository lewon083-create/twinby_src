package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Sg extends Qg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IReporter f22966b;

    public Sg(@NonNull Y4 y42, @NonNull IReporter iReporter) {
        super(y42);
        this.f22966b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NonNull Q5 q5) {
        Hc hc2 = (Hc) Hc.f22417c.get(q5.f22863d);
        HashMap map = new HashMap();
        map.put("type", hc2.f22418a);
        map.put("delivery_method", hc2.f22419b);
        this.f22966b.reportEvent("crash_saved", map);
        return false;
    }
}

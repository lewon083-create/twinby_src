package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Mi implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qo f22692a = new qo();

    @Override // io.appmetrica.analytics.impl.ro
    public final po a(Revenue revenue) {
        po poVar;
        qo qoVar = this.f22692a;
        Rf rf = new Rf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            poVar = new po(rf, true, "");
        } else {
            poVar = new po(rf, false, "Invalid quantity value " + num);
        }
        List<po> listAsList = Arrays.asList(poVar);
        qoVar.getClass();
        return qoVar.a(listAsList);
    }
}

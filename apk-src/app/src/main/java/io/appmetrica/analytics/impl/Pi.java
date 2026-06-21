package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Pi implements InterfaceC0530u9 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0530u9
    public final Integer a(@NonNull O8 o82) {
        EnumC0078cb enumC0078cb = o82.f22782h;
        if (enumC0078cb != null) {
            return (Integer) Of.f22803c.get(enumC0078cb);
        }
        Map map = Of.f22801a;
        return null;
    }
}

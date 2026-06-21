package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Rf implements ro {
    @Override // io.appmetrica.analytics.impl.ro
    public final po a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new po(this, true, "");
        }
        return new po(this, false, "Invalid quantity value " + num);
    }
}

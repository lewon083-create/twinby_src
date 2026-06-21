package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class H2 implements ro {
    @Override // io.appmetrica.analytics.impl.ro
    public final po a(Object obj) {
        C0142eo[] c0142eoArr = ((C0220ho) obj).f24029a;
        return (c0142eoArr == null || c0142eoArr.length == 0) ? new po(this, false, "attributes list is empty") : new po(this, true, "");
    }
}

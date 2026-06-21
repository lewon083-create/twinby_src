package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0457rb implements ro {
    @Override // io.appmetrica.analytics.impl.ro
    public final po a(String str) {
        return str == null ? new po(this, false, "key is null") : str.startsWith(H7.f22415b) ? new po(this, false, "key starts with appmetrica") : str.length() > 200 ? new po(this, false, "key length more then 200 characters") : new po(this, true, "");
    }
}

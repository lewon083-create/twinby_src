package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sb extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public sb(rb rbVar, qb qbVar, long j10) {
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(j10);
        super(String.format(locale, zb.a("bk3t6gFTc30="), Long.valueOf(rbVar.f9793b), Long.valueOf(qbVar.f9414b), lValueOf));
        Optional.of(qbVar);
        Optional.of(lValueOf);
    }

    public sb(rb rbVar, Exception exc) {
        super(String.format(Locale.US, zb.a("bk0="), Long.valueOf(rbVar.f9793b)), exc);
        Optional.empty();
        Optional.empty();
    }
}

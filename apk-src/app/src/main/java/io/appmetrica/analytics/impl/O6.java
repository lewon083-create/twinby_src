package io.appmetrica.analytics.impl;

import com.google.android.gms.internal.ads.om1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class O6 implements Ig {
    @Override // io.appmetrica.analytics.impl.Ig
    @NotNull
    public final String a(@NotNull String str) {
        return om1.k("/appmetrica/analytics/db/", str);
    }
}

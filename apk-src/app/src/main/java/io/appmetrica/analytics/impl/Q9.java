package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Q9 extends R9 {
    @Override // io.appmetrica.analytics.impl.R9
    public final S9 b(@NonNull FeatureInfo featureInfo) {
        return new S9(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}

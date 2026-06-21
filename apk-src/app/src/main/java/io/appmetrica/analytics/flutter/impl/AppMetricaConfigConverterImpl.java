package io.appmetrica.analytics.flutter.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.flutter.utils.Converter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AppMetricaConfigConverterImpl implements Pigeon.AppMetricaConfigConverterPigeon {
    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigConverterPigeon
    @NonNull
    public String toJson(@NonNull Pigeon.AppMetricaConfigPigeon appMetricaConfigPigeon) {
        return Converter.toNative(appMetricaConfigPigeon).toJson();
    }
}

package io.appmetrica.analytics.flutter.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AppMetricaLibraryAdapterImpl implements Pigeon.AppMetricaLibraryAdapterPigeon {

    @NonNull
    private final Context context;

    public AppMetricaLibraryAdapterImpl(@NonNull Context context) {
        this.context = context;
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon
    public void subscribeForAutoCollectedData(@NonNull String str) {
        AppMetricaLibraryAdapter.subscribeForAutoCollectedData(this.context, str);
    }
}

package io.appmetrica.analytics.coreapi.internal.data;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IBinaryDataHelper {
    byte[] get(@NonNull String str);

    void insert(@NonNull String str, @NonNull byte[] bArr);

    void remove(@NonNull String str);
}

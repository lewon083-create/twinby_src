package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Qm implements Pm {
    @NonNull
    public abstract IBinaryDataHelper a(@NonNull Context context);

    @NonNull
    public abstract ProtobufStateStorage<Object> a(@NonNull Context context, @NonNull IBinaryDataHelper iBinaryDataHelper);

    @NonNull
    public abstract IBinaryDataHelper b(@NonNull Context context);

    @Override // io.appmetrica.analytics.impl.Pm, io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory
    @NonNull
    public final ProtobufStateStorage<Object> create(@NonNull Context context) {
        return a(context, a(context));
    }

    @Override // io.appmetrica.analytics.impl.Pm, io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory
    @NonNull
    public final ProtobufStateStorage<Object> createForMigration(@NonNull Context context) {
        return a(context, b(context));
    }
}

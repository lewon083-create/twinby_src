package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mo implements La {
    @Override // io.appmetrica.analytics.impl.La
    @Nullable
    public final String a(@NotNull Context context) {
        C0243im c0243im;
        try {
            Pm pmA = Om.a(C0243im.class);
            if (pmA == null) {
                return null;
            }
            Qm qm = (Qm) pmA;
            ProtobufStateStorage<Object> protobufStateStorageA = qm.a(context, qm.a(context));
            if (protobufStateStorageA == null || (c0243im = (C0243im) protobufStateStorageA.read()) == null) {
                return null;
            }
            return c0243im.f24093a;
        } catch (Throwable unused) {
            return null;
        }
    }
}

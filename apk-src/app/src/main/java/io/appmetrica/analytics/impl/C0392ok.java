package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0392ok implements Jc {
    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(@NotNull Context context) {
        Qm qm = (Qm) Om.a(C0243im.class);
        ProtobufStateStorage<Object> protobufStateStorageA = qm.a(context, qm.b(context));
        C0243im c0243im = (C0243im) protobufStateStorageA.read();
        C0218hm c0218hmA = c0243im.a(c0243im.f24104m);
        c0218hmA.f24012o = 0L;
        protobufStateStorageA.save(new C0243im(c0218hmA));
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0115dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f23707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo f23708b;

    public C0115dm(ProtobufStateStorage protobufStateStorage, vo voVar) {
        this.f23707a = protobufStateStorage;
        this.f23708b = voVar;
    }

    public C0115dm(Context context) {
        this(((Qm) Om.a(C0243im.class)).create(context), C0382oa.k().D().a());
    }
}

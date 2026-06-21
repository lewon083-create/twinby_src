package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Lf implements ProtobufStateStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f22613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f22614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f22615d;

    public Lf(@NonNull String str, @NonNull IBinaryDataHelper iBinaryDataHelper, @NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f22612a = str;
        this.f22613b = iBinaryDataHelper;
        this.f22614c = protobufStateSerializer;
        this.f22615d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f22613b.remove(this.f22612a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    @NonNull
    public final Object read() {
        try {
            byte[] bArr = this.f22613b.get(this.f22612a);
            if (bArr != null && bArr.length != 0) {
                return this.f22615d.toModel((MessageNano) this.f22614c.toState(bArr));
            }
            return this.f22615d.toModel((MessageNano) this.f22614c.defaultValue());
        } catch (Throwable unused) {
            return this.f22615d.toModel((MessageNano) this.f22614c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(@NonNull Object obj) {
        this.f22613b.insert(this.f22612a, this.f22614c.toByteArray((MessageNano) this.f22615d.fromModel(obj)));
    }
}

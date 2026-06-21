package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0093d0 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f23650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0228i6 f23651b;

    public C0093d0() {
        this(new W(new C0594wn()), new C0228i6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5 fromModel(@NonNull C0067c0 c0067c0) {
        T5 t52 = new T5();
        t52.f23001a = this.f23650a.fromModel(c0067c0.f23528a);
        String str = c0067c0.f23529b;
        if (str != null) {
            t52.f23002b = str;
        }
        t52.f23003c = this.f23651b.a(c0067c0.f23530c);
        return t52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0093d0(W w10, C0228i6 c0228i6) {
        this.f23650a = w10;
        this.f23651b = c0228i6;
    }

    @NonNull
    public final C0067c0 a(@NonNull T5 t52) {
        throw new UnsupportedOperationException();
    }
}

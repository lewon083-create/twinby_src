package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0594wn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Al f24990a;

    public C0594wn() {
        this(new Al());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0047b6 fromModel(@NonNull C0569vn c0569vn) {
        C0047b6 c0047b6 = new C0047b6();
        Integer num = c0569vn.f24948e;
        c0047b6.f23491e = num == null ? -1 : num.intValue();
        c0047b6.f23490d = c0569vn.f24947d;
        c0047b6.f23488b = c0569vn.f24945b;
        c0047b6.f23487a = c0569vn.f24944a;
        c0047b6.f23489c = c0569vn.f24946c;
        Al al2 = this.f24990a;
        List list = c0569vn.f24949f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Cl((StackTraceElement) it.next()));
        }
        c0047b6.f23492f = al2.fromModel(arrayList);
        return c0047b6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0594wn(Al al2) {
        this.f24990a = al2;
    }

    @NonNull
    public final C0569vn a(@NonNull C0047b6 c0047b6) {
        throw new UnsupportedOperationException();
    }
}

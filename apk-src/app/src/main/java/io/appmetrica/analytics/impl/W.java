package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class W implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0594wn f23179a;

    public W(@NonNull C0594wn c0594wn) {
        this.f23179a = c0594wn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 fromModel(@NonNull V v5) {
        S5 s52 = new S5();
        C0569vn c0569vn = v5.f23109a;
        if (c0569vn != null) {
            s52.f22945a = this.f23179a.fromModel(c0569vn);
        }
        s52.f22946b = new C0047b6[v5.f23110b.size()];
        Iterator it = v5.f23110b.iterator();
        int i = 0;
        while (it.hasNext()) {
            s52.f22946b[i] = this.f23179a.fromModel((C0569vn) it.next());
            i++;
        }
        String str = v5.f23111c;
        if (str != null) {
            s52.f22947c = str;
        }
        return s52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final V a(@NonNull S5 s52) {
        throw new UnsupportedOperationException();
    }
}

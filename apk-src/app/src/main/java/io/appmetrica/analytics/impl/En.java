package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class En implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Al f22307a;

    public En() {
        this(new Al());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0073c6 fromModel(@NonNull Fn fn) {
        C0073c6 c0073c6 = new C0073c6();
        c0073c6.f23560a = (String) WrapUtils.getOrDefault(fn.f22353a, "");
        c0073c6.f23561b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(fn.f22354b, ""));
        List<Cl> list = fn.f22355c;
        if (list != null) {
            c0073c6.f23562c = this.f22307a.fromModel(list);
        }
        Fn fn2 = fn.f22356d;
        if (fn2 != null) {
            c0073c6.f23563d = fromModel(fn2);
        }
        List list2 = fn.f22357e;
        int i = 0;
        if (list2 == null) {
            c0073c6.f23564e = new C0073c6[0];
            return c0073c6;
        }
        c0073c6.f23564e = new C0073c6[list2.size()];
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c0073c6.f23564e[i] = fromModel((Fn) it.next());
            i++;
        }
        return c0073c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public En(Al al2) {
        this.f22307a = al2;
    }

    @NonNull
    public final Fn a(@NonNull C0073c6 c0073c6) {
        throw new UnsupportedOperationException();
    }
}

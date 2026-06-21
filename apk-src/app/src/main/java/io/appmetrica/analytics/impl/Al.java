package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Al implements ListConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bl f22082a = new Bl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0021a6[] fromModel(@NonNull List<Cl> list) {
        C0021a6[] c0021a6Arr = new C0021a6[list.size()];
        Iterator<Cl> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            c0021a6Arr[i] = this.f22082a.fromModel(it.next());
            i++;
        }
        return c0021a6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<Cl> a(C0021a6[] c0021a6Arr) {
        throw new UnsupportedOperationException();
    }
}

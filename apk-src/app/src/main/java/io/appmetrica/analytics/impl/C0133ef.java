package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0133ef implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0437qf f23767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ze f23768b;

    public C0133ef() {
        this(new C0437qf(), new Ze());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0337mf fromModel(@NonNull C0082cf c0082cf) {
        C0337mf c0337mf = new C0337mf();
        c0337mf.f24370a = this.f23767a.fromModel(c0082cf.f23612a);
        c0337mf.f24371b = new C0312lf[c0082cf.f23613b.size()];
        Iterator<C0056bf> it = c0082cf.f23613b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c0337mf.f24371b[i] = this.f23768b.fromModel(it.next());
            i++;
        }
        return c0337mf;
    }

    public C0133ef(C0437qf c0437qf, Ze ze) {
        this.f23767a = c0437qf;
        this.f23768b = ze;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0082cf toModel(@NonNull C0337mf c0337mf) {
        C0412pf model;
        ArrayList arrayList = new ArrayList(c0337mf.f24371b.length);
        for (C0312lf c0312lf : c0337mf.f24371b) {
            arrayList.add(this.f23768b.toModel(c0312lf));
        }
        C0287kf c0287kf = c0337mf.f24370a;
        if (c0287kf == null) {
            model = this.f23767a.toModel(new C0287kf());
        } else {
            model = this.f23767a.toModel(c0287kf);
        }
        return new C0082cf(model, arrayList);
    }
}

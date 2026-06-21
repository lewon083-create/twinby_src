package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ValidationException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Dn implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ro f22262a;

    public Dn(@NonNull ro roVar) {
        this.f22262a = roVar;
    }

    @Override // io.appmetrica.analytics.impl.ro
    public final po a(Object obj) {
        po poVarA = this.f22262a.a(obj);
        if (poVarA.f24595a) {
            return poVarA;
        }
        throw new ValidationException(poVarA.f24596b);
    }

    @NonNull
    public final ro a() {
        return this.f22262a;
    }
}

package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Yd implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23329a;

    public Yd(@NonNull String str) {
        this.f23329a = str;
    }

    @Override // io.appmetrica.analytics.impl.ro
    public final po a(Collection<Object> collection) {
        return ko.a((Collection) collection) ? new po(this, false, a0.u.o(new StringBuilder(), this.f23329a, " is null or empty.")) : new po(this, true, "");
    }
}

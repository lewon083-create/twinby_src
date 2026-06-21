package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class C2 implements ExternalAttribution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B9 f22185a;

    public C2(@NotNull B9 b92) {
        this.f22185a = b92;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    @NotNull
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f22185a);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExternalAttribution(type=`");
        sb2.append(L9.a(this.f22185a.f22136a));
        sb2.append("`value=`");
        return a0.u.o(sb2, new String(this.f22185a.f22137b, Charsets.UTF_8), "`)");
    }
}

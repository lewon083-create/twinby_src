package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0429q7 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0311le f24620a;

    public C0429q7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0404p7 fromModel(@NotNull C0478s7 c0478s7) {
        C0404p7 c0404p7 = new C0404p7();
        Long l10 = c0478s7.f24730a;
        if (l10 != null) {
            c0404p7.f24565a = l10.longValue();
        }
        Long l11 = c0478s7.f24731b;
        if (l11 != null) {
            c0404p7.f24566b = l11.longValue();
        }
        Boolean bool = c0478s7.f24732c;
        if (bool != null) {
            c0404p7.f24567c = this.f24620a.fromModel(bool).intValue();
        }
        return c0404p7;
    }

    public C0429q7(@NotNull C0311le c0311le) {
        this.f24620a = c0311le;
    }

    public /* synthetic */ C0429q7(C0311le c0311le, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0311le() : c0311le);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0478s7 toModel(@NotNull C0404p7 c0404p7) {
        C0404p7 c0404p72 = new C0404p7();
        long j10 = c0404p7.f24565a;
        Long lValueOf = Long.valueOf(j10);
        if (j10 == c0404p72.f24565a) {
            lValueOf = null;
        }
        long j11 = c0404p7.f24566b;
        return new C0478s7(lValueOf, j11 != c0404p72.f24566b ? Long.valueOf(j11) : null, this.f24620a.a(c0404p7.f24567c));
    }
}

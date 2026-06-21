package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0578w7 implements ProtobufConverter {
    @NonNull
    public final BigDecimal a(@NonNull C0204h8 c0204h8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0204h8 fromModel(@NonNull BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC0628y7.f25089a;
        int i = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC0628y7.f25089a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC0628y7.f25090b) >= 0) {
                C0603x7 c0603x7 = new C0603x7(Long.valueOf(bigIntegerUnscaledValue.longValue()).longValue(), Integer.valueOf(i).intValue());
                C0204h8 c0204h8 = new C0204h8();
                c0204h8.f23966a = c0603x7.f25008a;
                c0204h8.f23967b = c0603x7.f25009b;
                return c0204h8;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i++;
        }
    }
}

package io.sentry;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum SentryAttributeType {
    STRING,
    BOOLEAN,
    INTEGER,
    DOUBLE,
    ARRAY;

    @NotNull
    public static SentryAttributeType inferFrom(@Nullable Object obj) {
        return obj instanceof Boolean ? BOOLEAN : ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte) || (obj instanceof BigInteger) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong)) ? INTEGER : obj instanceof Number ? DOUBLE : ((obj instanceof Collection) || (obj != null && obj.getClass().isArray())) ? ARRAY : STRING;
    }

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}

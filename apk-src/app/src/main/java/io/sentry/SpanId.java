package io.sentry;

import io.sentry.util.LazyEvaluator;
import io.sentry.util.StringUtils;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SpanId implements JsonSerializable {
    public static final SpanId EMPTY_ID = new SpanId(StringUtils.PROPER_NIL_UUID.replace("-", "").substring(0, 16));

    @NotNull
    private final LazyEvaluator<String> lazyValue;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SpanId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SpanId deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            return new SpanId(objectReader.nextString());
        }
    }

    public SpanId(@NotNull String str) {
        Objects.requireNonNull(str, "value is required");
        this.lazyValue = new LazyEvaluator<>(new u(3, str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SpanId.class != obj.getClass()) {
            return false;
        }
        return this.lazyValue.getValue().equals(((SpanId) obj).lazyValue.getValue());
    }

    public int hashCode() {
        return this.lazyValue.getValue().hashCode();
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.value(this.lazyValue.getValue());
    }

    public String toString() {
        return this.lazyValue.getValue();
    }

    public SpanId() {
        this.lazyValue = new LazyEvaluator<>(new g(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0(String str) {
        return str;
    }
}

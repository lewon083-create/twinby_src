package io.sentry.protocol;

import com.google.android.gms.internal.ads.om1;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.StringUtils;
import io.sentry.util.UUIDStringUtils;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryId implements JsonSerializable {
    public static final SentryId EMPTY_ID = new SentryId(StringUtils.PROPER_NIL_UUID.replace("-", ""));

    @NotNull
    private final LazyEvaluator<String> lazyStringValue;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryId deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            return new SentryId(objectReader.nextString());
        }
    }

    public SentryId() {
        this((UUID) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$new$0(UUID uuid) {
        return lambda$new$1(UUIDStringUtils.toSentryIdString(uuid));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    /* JADX INFO: renamed from: normalize, reason: merged with bridge method [inline-methods] */
    public String lambda$new$1(@NotNull String str) {
        return StringUtils.normalizeUUID(str).replace("-", "");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SentryId.class != obj.getClass()) {
            return false;
        }
        return this.lazyStringValue.getValue().equals(((SentryId) obj).lazyStringValue.getValue());
    }

    public int hashCode() {
        return this.lazyStringValue.getValue().hashCode();
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.value(toString());
    }

    public String toString() {
        return this.lazyStringValue.getValue();
    }

    public SentryId(@Nullable final UUID uuid) {
        if (uuid == null) {
            this.lazyStringValue = new LazyEvaluator<>(new b());
        } else {
            final int i = 0;
            this.lazyStringValue = new LazyEvaluator<>(new LazyEvaluator.Evaluator(this) { // from class: io.sentry.protocol.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SentryId f26071b;

                {
                    this.f26071b = this;
                }

                @Override // io.sentry.util.LazyEvaluator.Evaluator
                public final Object evaluate() {
                    switch (i) {
                        case 0:
                            return this.f26071b.lambda$new$0((UUID) uuid);
                        default:
                            return this.f26071b.lambda$new$1((String) uuid);
                    }
                }
            });
        }
    }

    public SentryId(@NotNull String str) {
        final String strNormalizeUUID = StringUtils.normalizeUUID(str);
        if (strNormalizeUUID.length() != 32 && strNormalizeUUID.length() != 36) {
            throw new IllegalArgumentException(om1.k("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ", str));
        }
        if (strNormalizeUUID.length() == 36) {
            final int i = 1;
            this.lazyStringValue = new LazyEvaluator<>(new LazyEvaluator.Evaluator(this) { // from class: io.sentry.protocol.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SentryId f26071b;

                {
                    this.f26071b = this;
                }

                @Override // io.sentry.util.LazyEvaluator.Evaluator
                public final Object evaluate() {
                    switch (i) {
                        case 0:
                            return this.f26071b.lambda$new$0((UUID) strNormalizeUUID);
                        default:
                            return this.f26071b.lambda$new$1((String) strNormalizeUUID);
                    }
                }
            });
        } else {
            this.lazyStringValue = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.protocol.c
                @Override // io.sentry.util.LazyEvaluator.Evaluator
                public final Object evaluate() {
                    return SentryId.lambda$new$2(strNormalizeUUID);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$2(String str) {
        return str;
    }
}

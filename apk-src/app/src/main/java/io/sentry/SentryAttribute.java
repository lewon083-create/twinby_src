package io.sentry;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryAttribute {

    @NotNull
    private final String name;

    @Nullable
    private final SentryAttributeType type;

    @Nullable
    private final Object value;

    private SentryAttribute(@NotNull String str, @Nullable SentryAttributeType sentryAttributeType, @Nullable Object obj) {
        this.name = str;
        this.type = sentryAttributeType;
        this.value = obj;
    }

    @NotNull
    public static SentryAttribute arrayAttribute(@NotNull String str, @Nullable Collection<?> collection) {
        return new SentryAttribute(str, SentryAttributeType.ARRAY, collection);
    }

    @NotNull
    public static SentryAttribute booleanAttribute(@NotNull String str, @Nullable Boolean bool) {
        return new SentryAttribute(str, SentryAttributeType.BOOLEAN, bool);
    }

    @NotNull
    public static SentryAttribute doubleAttribute(@NotNull String str, @Nullable Double d10) {
        return new SentryAttribute(str, SentryAttributeType.DOUBLE, d10);
    }

    @NotNull
    public static SentryAttribute integerAttribute(@NotNull String str, @Nullable Integer num) {
        return new SentryAttribute(str, SentryAttributeType.INTEGER, num);
    }

    @NotNull
    public static SentryAttribute named(@NotNull String str, @Nullable Object obj) {
        return new SentryAttribute(str, null, obj);
    }

    @NotNull
    public static SentryAttribute stringAttribute(@NotNull String str, @Nullable String str2) {
        return new SentryAttribute(str, SentryAttributeType.STRING, str2);
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public SentryAttributeType getType() {
        return this.type;
    }

    @Nullable
    public Object getValue() {
        return this.value;
    }

    @NotNull
    public static SentryAttribute arrayAttribute(@NotNull String str, @Nullable Object[] objArr) {
        return new SentryAttribute(str, SentryAttributeType.ARRAY, objArr);
    }
}

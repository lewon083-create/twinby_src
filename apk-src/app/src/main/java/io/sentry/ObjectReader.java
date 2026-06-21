package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface ObjectReader extends Closeable {
    @Nullable
    static Date dateOrNull(@Nullable String str, @NotNull ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return DateUtils.getDateTime(str);
            } catch (Exception unused) {
                return DateUtils.getDateTimeWithMillisPrecision(str);
            }
        } catch (Exception e3) {
            iLogger.log(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", e3);
            return null;
        }
    }

    void beginArray();

    void beginObject();

    void endArray();

    void endObject();

    boolean hasNext();

    boolean nextBoolean();

    @Nullable
    Boolean nextBooleanOrNull();

    @Nullable
    Date nextDateOrNull(ILogger iLogger);

    double nextDouble();

    @Nullable
    Double nextDoubleOrNull();

    float nextFloat();

    @Nullable
    Float nextFloatOrNull();

    int nextInt();

    @Nullable
    Integer nextIntegerOrNull();

    @Nullable
    <T> List<T> nextListOrNull(@NotNull ILogger iLogger, @NotNull JsonDeserializer<T> jsonDeserializer);

    long nextLong();

    @Nullable
    Long nextLongOrNull();

    @Nullable
    <T> Map<String, List<T>> nextMapOfListOrNull(@NotNull ILogger iLogger, @NotNull JsonDeserializer<T> jsonDeserializer);

    @Nullable
    <T> Map<String, T> nextMapOrNull(@NotNull ILogger iLogger, @NotNull JsonDeserializer<T> jsonDeserializer);

    @NotNull
    String nextName();

    void nextNull();

    @Nullable
    Object nextObjectOrNull();

    @Nullable
    <T> T nextOrNull(@NotNull ILogger iLogger, @NotNull JsonDeserializer<T> jsonDeserializer);

    String nextString();

    @Nullable
    String nextStringOrNull();

    @Nullable
    TimeZone nextTimeZoneOrNull(ILogger iLogger);

    void nextUnknown(ILogger iLogger, Map<String, Object> map, String str);

    @NotNull
    JsonToken peek();

    void setLenient(boolean z5);

    void skipValue();
}

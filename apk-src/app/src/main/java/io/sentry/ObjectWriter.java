package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface ObjectWriter {
    ObjectWriter beginArray();

    ObjectWriter beginObject();

    ObjectWriter endArray();

    ObjectWriter endObject();

    @Nullable
    String getIndent();

    ObjectWriter jsonValue(@Nullable String str);

    ObjectWriter name(@NotNull String str);

    ObjectWriter nullValue();

    void setIndent(@Nullable String str);

    void setLenient(boolean z5);

    ObjectWriter value(double d10);

    ObjectWriter value(long j10);

    ObjectWriter value(@NotNull ILogger iLogger, @Nullable Object obj);

    ObjectWriter value(@Nullable Boolean bool);

    ObjectWriter value(@Nullable Number number);

    ObjectWriter value(@Nullable String str);

    ObjectWriter value(boolean z5);
}

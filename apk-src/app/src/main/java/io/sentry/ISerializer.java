package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface ISerializer {
    @Nullable
    <T> T deserialize(@NotNull Reader reader, @NotNull Class<T> cls);

    @Nullable
    <T, R> T deserializeCollection(@NotNull Reader reader, @NotNull Class<T> cls, @Nullable JsonDeserializer<R> jsonDeserializer);

    @Nullable
    SentryEnvelope deserializeEnvelope(@NotNull InputStream inputStream);

    @NotNull
    String serialize(@NotNull Map<String, Object> map);

    void serialize(@NotNull SentryEnvelope sentryEnvelope, @NotNull OutputStream outputStream);

    <T> void serialize(@NotNull T t10, @NotNull Writer writer);
}

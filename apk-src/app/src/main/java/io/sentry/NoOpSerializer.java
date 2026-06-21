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
final class NoOpSerializer implements ISerializer {
    private static final NoOpSerializer instance = new NoOpSerializer();

    private NoOpSerializer() {
    }

    public static NoOpSerializer getInstance() {
        return instance;
    }

    @Override // io.sentry.ISerializer
    @Nullable
    public <T> T deserialize(@NotNull Reader reader, @NotNull Class<T> cls) {
        return null;
    }

    @Override // io.sentry.ISerializer
    @Nullable
    public <T, R> T deserializeCollection(@NotNull Reader reader, @NotNull Class<T> cls, @Nullable JsonDeserializer<R> jsonDeserializer) {
        return null;
    }

    @Override // io.sentry.ISerializer
    @Nullable
    public SentryEnvelope deserializeEnvelope(@NotNull InputStream inputStream) {
        return null;
    }

    @Override // io.sentry.ISerializer
    public void serialize(@NotNull SentryEnvelope sentryEnvelope, @NotNull OutputStream outputStream) {
    }

    @Override // io.sentry.ISerializer
    public <T> void serialize(@NotNull T t10, @NotNull Writer writer) {
    }

    @Override // io.sentry.ISerializer
    @NotNull
    public String serialize(@NotNull Map<String, Object> map) {
        return "";
    }
}

package io.sentry;

import io.sentry.util.Objects;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class CustomSamplingContext {

    @NotNull
    private final Map<String, Object> data = new HashMap();

    @Nullable
    public Object get(@NotNull String str) {
        Objects.requireNonNull(str, "key is required");
        return this.data.get(str);
    }

    @NotNull
    public Map<String, Object> getData() {
        return this.data;
    }

    public void set(@NotNull String str, @Nullable Object obj) {
        Objects.requireNonNull(str, "key is required");
        this.data.put(str, obj);
    }
}

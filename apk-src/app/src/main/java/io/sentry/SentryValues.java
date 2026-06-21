package io.sentry;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class SentryValues<T> {
    private final List<T> values;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String VALUES = "values";
    }

    public SentryValues(@Nullable List<T> list) {
        this.values = new ArrayList(list == null ? new ArrayList<>(0) : list);
    }

    @NotNull
    public List<T> getValues() {
        return this.values;
    }
}

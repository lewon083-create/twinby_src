package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface CompositePerformanceCollector {
    void close();

    void onSpanFinished(@NotNull ISpan iSpan);

    void onSpanStarted(@NotNull ISpan iSpan);

    void start(@NotNull ITransaction iTransaction);

    void start(@NotNull String str);

    @Nullable
    List<PerformanceCollectionData> stop(@NotNull ITransaction iTransaction);

    @Nullable
    List<PerformanceCollectionData> stop(@NotNull String str);
}

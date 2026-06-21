package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class DuplicateEventDetectionEventProcessor implements EventProcessor {

    @NotNull
    private final Map<Throwable, Object> capturedObjects = Collections.synchronizedMap(new WeakHashMap());

    @NotNull
    private final SentryOptions options;

    public DuplicateEventDetectionEventProcessor(@NotNull SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @NotNull
    private static List<Throwable> allCauses(@NotNull Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2.getCause() != null) {
            arrayList.add(th2.getCause());
            th2 = th2.getCause();
        }
        return arrayList;
    }

    private static <T> boolean containsAnyKey(@NotNull Map<T, Object> map, @NotNull List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public Long getOrder() {
        return 1000L;
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public SentryEvent process(@NotNull SentryEvent sentryEvent, @NotNull Hint hint) {
        if (!this.options.isEnableDeduplication()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Event deduplication is disabled.", new Object[0]);
            return sentryEvent;
        }
        Throwable throwable = sentryEvent.getThrowable();
        if (throwable == null) {
            return sentryEvent;
        }
        if (this.capturedObjects.containsKey(throwable) || containsAnyKey(this.capturedObjects, allCauses(throwable))) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", sentryEvent.getEventId());
            return null;
        }
        this.capturedObjects.put(throwable, null);
        return sentryEvent;
    }
}

package io.sentry.internal.eventprocessor;

import io.sentry.EventProcessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class EventProcessorAndOrder implements Comparable<EventProcessorAndOrder> {

    @NotNull
    private final EventProcessor eventProcessor;

    @NotNull
    private final Long order;

    public EventProcessorAndOrder(@NotNull EventProcessor eventProcessor, @Nullable Long l10) {
        this.eventProcessor = eventProcessor;
        if (l10 == null) {
            this.order = Long.valueOf(System.nanoTime());
        } else {
            this.order = l10;
        }
    }

    @NotNull
    public EventProcessor getEventProcessor() {
        return this.eventProcessor;
    }

    @NotNull
    public Long getOrder() {
        return this.order;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull EventProcessorAndOrder eventProcessorAndOrder) {
        return this.order.compareTo(eventProcessorAndOrder.order);
    }
}

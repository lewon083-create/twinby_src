package io.sentry.util;

import io.sentry.EventProcessor;
import io.sentry.internal.eventprocessor.EventProcessorAndOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class EventProcessorUtils {
    public static List<EventProcessor> unwrap(@Nullable List<EventProcessorAndOrder> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<EventProcessorAndOrder> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getEventProcessor());
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }
}

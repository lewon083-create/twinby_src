package io.sentry.clientreport;

import io.sentry.DataCategory;
import io.sentry.util.LazyEvaluator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class AtomicClientReportStorage implements IClientReportStorage {

    @NotNull
    private final LazyEvaluator<Map<ClientReportKey, AtomicLong>> lostEventCounts = new LazyEvaluator<>(new a());

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$new$0() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (DiscardReason discardReason : DiscardReason.values()) {
            for (DataCategory dataCategory : DataCategory.values()) {
                concurrentHashMap.put(new ClientReportKey(discardReason.getReason(), dataCategory.getCategory()), new AtomicLong(0L));
            }
        }
        return Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.IClientReportStorage
    public void addCount(ClientReportKey clientReportKey, Long l10) {
        AtomicLong atomicLong = this.lostEventCounts.getValue().get(clientReportKey);
        if (atomicLong != null) {
            atomicLong.addAndGet(l10.longValue());
        }
    }

    @Override // io.sentry.clientreport.IClientReportStorage
    public List<DiscardedEvent> resetCountsAndGet() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<ClientReportKey, AtomicLong> entry : this.lostEventCounts.getValue().entrySet()) {
            long andSet = entry.getValue().getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new DiscardedEvent(entry.getKey().getReason(), entry.getKey().getCategory(), lValueOf));
            }
        }
        return arrayList;
    }
}

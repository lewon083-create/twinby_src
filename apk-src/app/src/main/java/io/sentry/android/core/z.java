package io.sentry.android.core;

import io.sentry.ISpan;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return SpanFrameMetricsCollector.lambda$new$0((ISpan) obj, (ISpan) obj2);
    }
}

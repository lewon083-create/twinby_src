package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class FullyDisplayedReporter {

    @NotNull
    private static final FullyDisplayedReporter instance = new FullyDisplayedReporter();

    @NotNull
    private final List<FullyDisplayedReporterListener> listeners = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface FullyDisplayedReporterListener {
        void onFullyDrawn();
    }

    private FullyDisplayedReporter() {
    }

    @NotNull
    public static FullyDisplayedReporter getInstance() {
        return instance;
    }

    public void registerFullyDrawnListener(@NotNull FullyDisplayedReporterListener fullyDisplayedReporterListener) {
        this.listeners.add(fullyDisplayedReporterListener);
    }

    public void reportFullyDrawn() {
        Iterator<FullyDisplayedReporterListener> it = this.listeners.iterator();
        this.listeners.clear();
        while (it.hasNext()) {
            it.next().onFullyDrawn();
        }
    }
}

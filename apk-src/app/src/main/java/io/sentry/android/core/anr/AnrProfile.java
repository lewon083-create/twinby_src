package io.sentry.android.core.anr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AnrProfile {
    public final long endTimeMs;
    public final List<AnrStackTrace> stacks;
    public final long startTimeMs;

    public AnrProfile(@NotNull List<AnrStackTrace> list) {
        this.stacks = new ArrayList(list.size());
        for (AnrStackTrace anrStackTrace : list) {
            if (anrStackTrace != null) {
                this.stacks.add(anrStackTrace);
            }
        }
        Collections.sort(this.stacks);
        if (this.stacks.isEmpty()) {
            this.startTimeMs = 0L;
            this.endTimeMs = 0L;
        } else {
            this.startTimeMs = this.stacks.get(0).timestampMs;
            this.endTimeMs = this.stacks.get(r5.size() - 1).timestampMs + 10000;
        }
    }
}

package io.sentry.android.core;

import io.sentry.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class ApplicationNotResponding extends RuntimeException {
    private static final long serialVersionUID = 252541144579117016L;

    @Nullable
    private final Thread thread;

    public ApplicationNotResponding(@Nullable String str) {
        super(str);
        this.thread = null;
    }

    @Nullable
    public Thread getThread() {
        return this.thread;
    }

    public ApplicationNotResponding(@Nullable String str, @NotNull Thread thread) {
        super(str);
        Thread thread2 = (Thread) Objects.requireNonNull(thread, "Thread must be provided.");
        this.thread = thread2;
        setStackTrace(thread2.getStackTrace());
    }
}

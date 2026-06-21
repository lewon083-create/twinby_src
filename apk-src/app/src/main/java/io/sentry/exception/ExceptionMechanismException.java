package io.sentry.exception;

import io.sentry.protocol.Mechanism;
import io.sentry.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExceptionMechanismException extends RuntimeException {
    private static final long serialVersionUID = 142345454265713915L;

    @NotNull
    private final Mechanism exceptionMechanism;
    private final boolean snapshot;

    @Nullable
    private final Thread thread;

    @NotNull
    private final Throwable throwable;

    public ExceptionMechanismException(@NotNull Mechanism mechanism, @NotNull Throwable th2, @Nullable Thread thread, boolean z5) {
        this.exceptionMechanism = (Mechanism) Objects.requireNonNull(mechanism, "Mechanism is required.");
        this.throwable = (Throwable) Objects.requireNonNull(th2, "Throwable is required.");
        this.thread = thread;
        this.snapshot = z5;
    }

    @NotNull
    public Mechanism getExceptionMechanism() {
        return this.exceptionMechanism;
    }

    @Nullable
    public Thread getThread() {
        return this.thread;
    }

    @NotNull
    public Throwable getThrowable() {
        return this.throwable;
    }

    public boolean isSnapshot() {
        return this.snapshot;
    }

    public ExceptionMechanismException(@NotNull Mechanism mechanism, @NotNull Throwable th2, @Nullable Thread thread) {
        this(mechanism, th2, thread, false);
    }
}

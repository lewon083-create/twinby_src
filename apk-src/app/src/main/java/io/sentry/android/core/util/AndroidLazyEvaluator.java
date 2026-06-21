package io.sentry.android.core.util;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidLazyEvaluator<T> {

    @NotNull
    private final AndroidEvaluator<T> evaluator;

    @Nullable
    private volatile T value = null;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface AndroidEvaluator<T> {
        @Nullable
        T evaluate(@NotNull Context context);
    }

    public AndroidLazyEvaluator(@NotNull AndroidEvaluator<T> androidEvaluator) {
        this.evaluator = androidEvaluator;
    }

    @Nullable
    public T getValue(@NotNull Context context) {
        if (this.value == null) {
            synchronized (this) {
                try {
                    if (this.value == null) {
                        this.value = this.evaluator.evaluate(context);
                    }
                } finally {
                }
            }
        }
        return this.value;
    }

    public void resetValue() {
        synchronized (this) {
            this.value = null;
        }
    }

    public void setValue(@Nullable T t10) {
        synchronized (this) {
            this.value = t10;
        }
    }
}

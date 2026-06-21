package io.sentry;

import io.sentry.UpdateStatus;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpDistributionApi implements IDistributionApi {
    private static final NoOpDistributionApi instance = new NoOpDistributionApi();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class CompletedFuture<T> implements Future<T> {
        private final T result;

        public CompletedFuture(T t10) {
            this.result = t10;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z5) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.result;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, @NotNull TimeUnit timeUnit) {
            return this.result;
        }
    }

    private NoOpDistributionApi() {
    }

    public static NoOpDistributionApi getInstance() {
        return instance;
    }

    @Override // io.sentry.IDistributionApi
    @NotNull
    public Future<UpdateStatus> checkForUpdate() {
        return new CompletedFuture(UpdateStatus.UpToDate.getInstance());
    }

    @Override // io.sentry.IDistributionApi
    @NotNull
    public UpdateStatus checkForUpdateBlocking() {
        return UpdateStatus.UpToDate.getInstance();
    }

    @Override // io.sentry.IDistributionApi
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.IDistributionApi
    public void downloadUpdate(@NotNull UpdateInfo updateInfo) {
    }
}

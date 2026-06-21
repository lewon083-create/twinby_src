package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class UpdateStatus {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class NewRelease extends UpdateStatus {

        @NotNull
        private final UpdateInfo info;

        public NewRelease(@NotNull UpdateInfo updateInfo) {
            this.info = updateInfo;
        }

        @NotNull
        public UpdateInfo getInfo() {
            return this.info;
        }

        public String toString() {
            return "UpdateStatus.NewRelease{info=" + this.info + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class NoNetwork extends UpdateStatus {

        @NotNull
        private final String message;

        public NoNetwork(@NotNull String str) {
            this.message = str;
        }

        @NotNull
        public String getMessage() {
            return this.message;
        }

        public String toString() {
            return a0.u.o(new StringBuilder("UpdateStatus.NoNetwork{message='"), this.message, "'}");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class UpToDate extends UpdateStatus {
        private static final UpToDate INSTANCE = new UpToDate();

        private UpToDate() {
        }

        public static UpToDate getInstance() {
            return INSTANCE;
        }

        public String toString() {
            return "UpdateStatus.UpToDate{}";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class UpdateError extends UpdateStatus {

        @NotNull
        private final String message;

        public UpdateError(@NotNull String str) {
            this.message = str;
        }

        @NotNull
        public String getMessage() {
            return this.message;
        }

        public String toString() {
            return a0.u.o(new StringBuilder("UpdateStatus.UpdateError{message='"), this.message, "'}");
        }
    }
}

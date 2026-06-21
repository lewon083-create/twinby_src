package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class FilesystemPropertiesLoader implements PropertiesLoader {

    @NotNull
    private final String filePath;
    private boolean logNonExisting;

    @NotNull
    private final ILogger logger;

    public FilesystemPropertiesLoader(@NotNull String str, @NotNull ILogger iLogger) {
        this(str, iLogger, true);
    }

    @Override // io.sentry.config.PropertiesLoader
    @Nullable
    public Properties load() {
        try {
            File file = new File(this.filePath.trim());
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    return properties;
                } finally {
                }
            }
            if (file.isFile()) {
                if (!file.canRead()) {
                    this.logger.log(SentryLevel.ERROR, "Failed to load Sentry configuration since it is not readable: %s", this.filePath);
                }
            } else if (this.logNonExisting) {
                this.logger.log(SentryLevel.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", this.filePath);
            }
            return null;
        } catch (Throwable th2) {
            this.logger.log(SentryLevel.ERROR, th2, "Failed to load Sentry configuration from file: %s", this.filePath);
            return null;
        }
    }

    public FilesystemPropertiesLoader(@NotNull String str, @NotNull ILogger iLogger, boolean z5) {
        this.filePath = str;
        this.logger = iLogger;
        this.logNonExisting = z5;
    }
}

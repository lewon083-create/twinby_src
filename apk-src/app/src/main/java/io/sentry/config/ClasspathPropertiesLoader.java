package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.ClassLoaderUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class ClasspathPropertiesLoader implements PropertiesLoader {

    @NotNull
    private final ClassLoader classLoader;

    @NotNull
    private final String fileName;

    @NotNull
    private final ILogger logger;

    public ClasspathPropertiesLoader(@NotNull String str, @Nullable ClassLoader classLoader, @NotNull ILogger iLogger) {
        this.fileName = str;
        this.classLoader = ClassLoaderUtils.classLoaderOrDefault(classLoader);
        this.logger = iLogger;
    }

    @Override // io.sentry.config.PropertiesLoader
    @Nullable
    public Properties load() {
        try {
            InputStream resourceAsStream = this.classLoader.getResourceAsStream(this.fileName);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } finally {
                }
            } finally {
            }
        } catch (IOException e3) {
            this.logger.log(SentryLevel.ERROR, e3, "Failed to load Sentry configuration from classpath resource: %s", this.fileName);
            return null;
        }
    }

    public ClasspathPropertiesLoader(@NotNull ILogger iLogger) {
        this("sentry.properties", ClasspathPropertiesLoader.class.getClassLoader(), iLogger);
    }
}

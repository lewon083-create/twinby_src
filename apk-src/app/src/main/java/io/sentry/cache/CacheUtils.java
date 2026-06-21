package io.sentry.cache;

import io.sentry.JsonDeserializer;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class CacheUtils {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static void delete(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull String str2) {
        File fileEnsureCacheDir = ensureCacheDir(sentryOptions, str);
        if (fileEnsureCacheDir == null) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileEnsureCacheDir, str2);
        sentryOptions.getLogger().log(SentryLevel.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        sentryOptions.getLogger().log(SentryLevel.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    @Nullable
    public static File ensureCacheDir(@NotNull SentryOptions sentryOptions, @NotNull String str) {
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    @Nullable
    public static <T, R> T read(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull String str2, @NotNull Class<T> cls, @Nullable JsonDeserializer<R> jsonDeserializer) {
        File fileEnsureCacheDir = ensureCacheDir(sentryOptions, str);
        if (fileEnsureCacheDir == null) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileEnsureCacheDir, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), UTF_8));
                try {
                    T t10 = jsonDeserializer == null ? (T) sentryOptions.getSerializer().deserialize(bufferedReader, cls) : (T) sentryOptions.getSerializer().deserializeCollection(bufferedReader, cls, jsonDeserializer);
                    bufferedReader.close();
                    return t10;
                } finally {
                }
            } catch (Throwable th2) {
                sentryOptions.getLogger().log(SentryLevel.ERROR, th2, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    public static <T> void store(@NotNull SentryOptions sentryOptions, @NotNull T t10, @NotNull String str, @NotNull String str2) {
        File fileEnsureCacheDir = ensureCacheDir(sentryOptions, str);
        if (fileEnsureCacheDir == null) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileEnsureCacheDir, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, UTF_8));
                try {
                    sentryOptions.getSerializer().serialize(t10, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, th2, "Error persisting entity: %s", str2);
        }
    }
}

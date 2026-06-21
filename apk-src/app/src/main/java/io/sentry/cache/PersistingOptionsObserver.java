package io.sentry.cache;

import io.sentry.IOptionsObserver;
import io.sentry.JsonDeserializer;
import io.sentry.SentryOptions;
import io.sentry.protocol.SdkVersion;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class PersistingOptionsObserver implements IOptionsObserver {
    public static final String DIST_FILENAME = "dist.json";
    public static final String ENVIRONMENT_FILENAME = "environment.json";
    public static final String OPTIONS_CACHE = ".options-cache";
    public static final String PROGUARD_UUID_FILENAME = "proguard-uuid.json";
    public static final String RELEASE_FILENAME = "release.json";
    public static final String REPLAY_ERROR_SAMPLE_RATE_FILENAME = "replay-error-sample-rate.json";
    public static final String SDK_VERSION_FILENAME = "sdk-version.json";
    public static final String TAGS_FILENAME = "tags.json";

    @NotNull
    private final SentryOptions options;

    public PersistingOptionsObserver(@NotNull SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    private void delete(@NotNull String str) {
        CacheUtils.delete(this.options, OPTIONS_CACHE, str);
    }

    @Nullable
    public static <T> T read(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull Class<T> cls) {
        return (T) read(sentryOptions, str, cls, null);
    }

    private <T> void store(@NotNull T t10, @NotNull String str) {
        CacheUtils.store(this.options, t10, OPTIONS_CACHE, str);
    }

    @Override // io.sentry.IOptionsObserver
    public void setDist(@Nullable String str) {
        if (str == null) {
            delete(DIST_FILENAME);
        } else {
            store(str, DIST_FILENAME);
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setEnvironment(@Nullable String str) {
        if (str == null) {
            delete(ENVIRONMENT_FILENAME);
        } else {
            store(str, ENVIRONMENT_FILENAME);
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setProguardUuid(@Nullable String str) {
        if (str == null) {
            delete(PROGUARD_UUID_FILENAME);
        } else {
            store(str, PROGUARD_UUID_FILENAME);
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setRelease(@Nullable String str) {
        if (str == null) {
            delete(RELEASE_FILENAME);
        } else {
            store(str, RELEASE_FILENAME);
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setReplayErrorSampleRate(@Nullable Double d10) {
        if (d10 == null) {
            delete(REPLAY_ERROR_SAMPLE_RATE_FILENAME);
        } else {
            store(d10.toString(), REPLAY_ERROR_SAMPLE_RATE_FILENAME);
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setSdkVersion(@Nullable SdkVersion sdkVersion) {
        if (sdkVersion == null) {
            delete(SDK_VERSION_FILENAME);
        } else {
            store(sdkVersion, SDK_VERSION_FILENAME);
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setTags(@NotNull Map<String, String> map) {
        store(map, "tags.json");
    }

    @Nullable
    public static <T, R> T read(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull Class<T> cls, @Nullable JsonDeserializer<R> jsonDeserializer) {
        return (T) CacheUtils.read(sentryOptions, OPTIONS_CACHE, str, cls, jsonDeserializer);
    }
}

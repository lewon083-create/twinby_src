package io.sentry;

import io.sentry.protocol.SdkVersion;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IOptionsObserver {
    void setDist(@Nullable String str);

    void setEnvironment(@Nullable String str);

    void setProguardUuid(@Nullable String str);

    void setRelease(@Nullable String str);

    void setReplayErrorSampleRate(@Nullable Double d10);

    void setSdkVersion(@Nullable SdkVersion sdkVersion);

    void setTags(@NotNull Map<String, String> map);
}

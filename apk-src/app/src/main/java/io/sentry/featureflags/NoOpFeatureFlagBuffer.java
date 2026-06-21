package io.sentry.featureflags;

import io.sentry.protocol.FeatureFlags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpFeatureFlagBuffer implements IFeatureFlagBuffer {
    private static final NoOpFeatureFlagBuffer instance = new NoOpFeatureFlagBuffer();

    public static NoOpFeatureFlagBuffer getInstance() {
        return instance;
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    @Nullable
    public FeatureFlags getFeatureFlags() {
        return null;
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IFeatureFlagBuffer m621clone() {
        return instance;
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    public void add(@Nullable String str, @Nullable Boolean bool) {
    }
}

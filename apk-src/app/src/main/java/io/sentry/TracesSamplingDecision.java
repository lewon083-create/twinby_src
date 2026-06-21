package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class TracesSamplingDecision {

    @Nullable
    private final Double profileSampleRate;

    @NotNull
    private final Boolean profileSampled;

    @Nullable
    private final Double sampleRand;

    @Nullable
    private final Double sampleRate;

    @NotNull
    private final Boolean sampled;

    public TracesSamplingDecision(@NotNull Boolean bool) {
        this(bool, null);
    }

    @Nullable
    public Double getProfileSampleRate() {
        return this.profileSampleRate;
    }

    @NotNull
    public Boolean getProfileSampled() {
        return this.profileSampled;
    }

    @Nullable
    public Double getSampleRand() {
        return this.sampleRand;
    }

    @Nullable
    public Double getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public Boolean getSampled() {
        return this.sampled;
    }

    public TracesSamplingDecision(@NotNull Boolean bool, @Nullable Double d10) {
        this(bool, d10, null, Boolean.FALSE, null);
    }

    public TracesSamplingDecision(@NotNull Boolean bool, @Nullable Double d10, @Nullable Double d11) {
        this(bool, d10, d11, Boolean.FALSE, null);
    }

    public TracesSamplingDecision(@NotNull Boolean bool, @Nullable Double d10, @NotNull Boolean bool2, @Nullable Double d11) {
        this(bool, d10, null, bool2, d11);
    }

    public TracesSamplingDecision(@NotNull Boolean bool, @Nullable Double d10, @Nullable Double d11, @NotNull Boolean bool2, @Nullable Double d12) {
        this.sampled = bool;
        this.sampleRate = d10;
        this.sampleRand = d11;
        this.profileSampled = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.profileSampleRate = d12;
    }
}

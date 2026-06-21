package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class SpanOptions {

    @Nullable
    private SentryDate startTimestamp = null;

    @NotNull
    private ScopeBindingMode scopeBindingMode = ScopeBindingMode.AUTO;
    private boolean trimStart = false;
    private boolean trimEnd = false;
    private boolean isIdle = false;

    @Nullable
    protected String origin = SpanContext.DEFAULT_ORIGIN;

    @Nullable
    public String getOrigin() {
        return this.origin;
    }

    @NotNull
    public ScopeBindingMode getScopeBindingMode() {
        return this.scopeBindingMode;
    }

    @Nullable
    public SentryDate getStartTimestamp() {
        return this.startTimestamp;
    }

    public boolean isIdle() {
        return this.isIdle;
    }

    public boolean isTrimEnd() {
        return this.trimEnd;
    }

    public boolean isTrimStart() {
        return this.trimStart;
    }

    public void setIdle(boolean z5) {
        this.isIdle = z5;
    }

    public void setOrigin(@Nullable String str) {
        this.origin = str;
    }

    public void setScopeBindingMode(@NotNull ScopeBindingMode scopeBindingMode) {
        this.scopeBindingMode = scopeBindingMode;
    }

    public void setStartTimestamp(@Nullable SentryDate sentryDate) {
        this.startTimestamp = sentryDate;
    }

    public void setTrimEnd(boolean z5) {
        this.trimEnd = z5;
    }

    public void setTrimStart(boolean z5) {
        this.trimStart = z5;
    }
}

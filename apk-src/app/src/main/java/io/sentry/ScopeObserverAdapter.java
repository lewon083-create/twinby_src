package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.Collection;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ScopeObserverAdapter implements IScopeObserver {
    @Override // io.sentry.IScopeObserver
    public void clearAttachments() {
    }

    @Override // io.sentry.IScopeObserver
    public void addAttachment(@NotNull Attachment attachment) {
    }

    @Override // io.sentry.IScopeObserver
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb) {
    }

    @Override // io.sentry.IScopeObserver
    public void removeExtra(@NotNull String str) {
    }

    @Override // io.sentry.IScopeObserver
    public void removeTag(@NotNull String str) {
    }

    @Override // io.sentry.IScopeObserver
    public void setBreadcrumbs(@NotNull Collection<Breadcrumb> collection) {
    }

    @Override // io.sentry.IScopeObserver
    public void setContexts(@NotNull Contexts contexts) {
    }

    @Override // io.sentry.IScopeObserver
    public void setExtras(@NotNull Map<String, Object> map) {
    }

    @Override // io.sentry.IScopeObserver
    public void setFingerprint(@NotNull Collection<String> collection) {
    }

    @Override // io.sentry.IScopeObserver
    public void setLevel(@Nullable SentryLevel sentryLevel) {
    }

    @Override // io.sentry.IScopeObserver
    public void setReplayId(@NotNull SentryId sentryId) {
    }

    @Override // io.sentry.IScopeObserver
    public void setRequest(@Nullable Request request) {
    }

    @Override // io.sentry.IScopeObserver
    public void setTags(@NotNull Map<String, String> map) {
    }

    @Override // io.sentry.IScopeObserver
    public void setTransaction(@Nullable String str) {
    }

    @Override // io.sentry.IScopeObserver
    public void setUser(@Nullable User user) {
    }

    @Override // io.sentry.IScopeObserver
    public void setExtra(@NotNull String str, @NotNull String str2) {
    }

    @Override // io.sentry.IScopeObserver
    public void setTag(@NotNull String str, @NotNull String str2) {
    }

    @Override // io.sentry.IScopeObserver
    public void setTrace(@Nullable SpanContext spanContext, @NotNull IScope iScope) {
    }
}

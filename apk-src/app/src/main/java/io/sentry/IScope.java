package io.sentry;

import io.sentry.Scope;
import io.sentry.featureflags.IFeatureFlagBuffer;
import io.sentry.internal.eventprocessor.EventProcessorAndOrder;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.FeatureFlags;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IScope {
    void addAttachment(@NotNull Attachment attachment);

    void addBreadcrumb(@NotNull Breadcrumb breadcrumb);

    void addBreadcrumb(@NotNull Breadcrumb breadcrumb, @Nullable Hint hint);

    void addEventProcessor(@NotNull EventProcessor eventProcessor);

    void addFeatureFlag(@Nullable String str, @Nullable Boolean bool);

    void assignTraceContext(@NotNull SentryEvent sentryEvent);

    void bindClient(@NotNull ISentryClient iSentryClient);

    void clear();

    void clearAttachments();

    void clearBreadcrumbs();

    void clearSession();

    void clearTransaction();

    @NotNull
    /* JADX INFO: renamed from: clone */
    IScope m607clone();

    @Nullable
    Session endSession();

    @NotNull
    List<Attachment> getAttachments();

    @NotNull
    Map<String, SentryAttribute> getAttributes();

    @NotNull
    Queue<Breadcrumb> getBreadcrumbs();

    @NotNull
    ISentryClient getClient();

    @NotNull
    Contexts getContexts();

    @NotNull
    List<EventProcessor> getEventProcessors();

    @NotNull
    List<EventProcessorAndOrder> getEventProcessorsWithOrder();

    @NotNull
    Map<String, Object> getExtras();

    @NotNull
    IFeatureFlagBuffer getFeatureFlagBuffer();

    @Nullable
    FeatureFlags getFeatureFlags();

    @NotNull
    List<String> getFingerprint();

    @NotNull
    SentryId getLastEventId();

    @Nullable
    SentryLevel getLevel();

    @NotNull
    SentryOptions getOptions();

    @NotNull
    PropagationContext getPropagationContext();

    @NotNull
    SentryId getReplayId();

    @Nullable
    Request getRequest();

    @Nullable
    String getScreen();

    @Nullable
    Session getSession();

    @Nullable
    ISpan getSpan();

    @NotNull
    Map<String, String> getTags();

    @Nullable
    ITransaction getTransaction();

    @Nullable
    String getTransactionName();

    @Nullable
    User getUser();

    void removeAttribute(@Nullable String str);

    void removeContexts(@Nullable String str);

    void removeExtra(@Nullable String str);

    void removeTag(@Nullable String str);

    void replaceOptions(@NotNull SentryOptions sentryOptions);

    void setActiveSpan(@Nullable ISpan iSpan);

    void setAttribute(@Nullable SentryAttribute sentryAttribute);

    void setAttribute(@Nullable String str, @Nullable Object obj);

    void setAttributes(@Nullable SentryAttributes sentryAttributes);

    void setContexts(@Nullable String str, @Nullable Boolean bool);

    void setContexts(@Nullable String str, @Nullable Character ch2);

    void setContexts(@Nullable String str, @Nullable Number number);

    void setContexts(@Nullable String str, @Nullable Object obj);

    void setContexts(@Nullable String str, @Nullable String str2);

    void setContexts(@Nullable String str, @Nullable Collection<?> collection);

    void setContexts(@Nullable String str, @Nullable Object[] objArr);

    void setExtra(@Nullable String str, @Nullable String str2);

    void setFingerprint(@NotNull List<String> list);

    void setLastEventId(@NotNull SentryId sentryId);

    void setLevel(@Nullable SentryLevel sentryLevel);

    void setPropagationContext(@NotNull PropagationContext propagationContext);

    void setReplayId(@NotNull SentryId sentryId);

    void setRequest(@Nullable Request request);

    void setScreen(@Nullable String str);

    void setSpanContext(@NotNull Throwable th2, @NotNull ISpan iSpan, @NotNull String str);

    void setTag(@Nullable String str, @Nullable String str2);

    void setTransaction(@Nullable ITransaction iTransaction);

    void setTransaction(@NotNull String str);

    void setUser(@Nullable User user);

    @Nullable
    Scope.SessionPair startSession();

    @NotNull
    PropagationContext withPropagationContext(@NotNull Scope.IWithPropagationContext iWithPropagationContext);

    @Nullable
    Session withSession(@NotNull Scope.IWithSession iWithSession);

    void withTransaction(@NotNull Scope.IWithTransaction iWithTransaction);
}

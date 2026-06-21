package io.sentry;

import io.sentry.Scope;
import io.sentry.featureflags.IFeatureFlagBuffer;
import io.sentry.featureflags.NoOpFeatureFlagBuffer;
import io.sentry.internal.eventprocessor.EventProcessorAndOrder;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.FeatureFlags;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.LazyEvaluator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpScope implements IScope {
    private static final NoOpScope instance = new NoOpScope();

    @NotNull
    private final LazyEvaluator<SentryOptions> emptyOptions = new LazyEvaluator<>(new g(0));

    private NoOpScope() {
    }

    public static NoOpScope getInstance() {
        return instance;
    }

    @Override // io.sentry.IScope
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb) {
    }

    @Override // io.sentry.IScope
    @Nullable
    public Session endSession() {
        return null;
    }

    @Override // io.sentry.IScope
    @NotNull
    public List<Attachment> getAttachments() {
        return new ArrayList();
    }

    @Override // io.sentry.IScope
    @NotNull
    public Map<String, SentryAttribute> getAttributes() {
        return new HashMap();
    }

    @Override // io.sentry.IScope
    @NotNull
    public Queue<Breadcrumb> getBreadcrumbs() {
        return new ArrayDeque();
    }

    @Override // io.sentry.IScope
    @NotNull
    public ISentryClient getClient() {
        return NoOpSentryClient.getInstance();
    }

    @Override // io.sentry.IScope
    @NotNull
    public Contexts getContexts() {
        return new Contexts();
    }

    @Override // io.sentry.IScope
    @NotNull
    public List<EventProcessor> getEventProcessors() {
        return new ArrayList();
    }

    @Override // io.sentry.IScope
    @NotNull
    public List<EventProcessorAndOrder> getEventProcessorsWithOrder() {
        return new ArrayList();
    }

    @Override // io.sentry.IScope
    @NotNull
    public Map<String, Object> getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.IScope
    @NotNull
    public IFeatureFlagBuffer getFeatureFlagBuffer() {
        return NoOpFeatureFlagBuffer.getInstance();
    }

    @Override // io.sentry.IScope
    @Nullable
    public FeatureFlags getFeatureFlags() {
        return null;
    }

    @Override // io.sentry.IScope
    @NotNull
    public List<String> getFingerprint() {
        return new ArrayList();
    }

    @Override // io.sentry.IScope
    @NotNull
    public SentryId getLastEventId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScope
    @Nullable
    public SentryLevel getLevel() {
        return null;
    }

    @Override // io.sentry.IScope
    @NotNull
    public SentryOptions getOptions() {
        return this.emptyOptions.getValue();
    }

    @Override // io.sentry.IScope
    @NotNull
    public PropagationContext getPropagationContext() {
        return new PropagationContext();
    }

    @Override // io.sentry.IScope
    @NotNull
    public SentryId getReplayId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScope
    @Nullable
    public Request getRequest() {
        return null;
    }

    @Override // io.sentry.IScope
    @Nullable
    public String getScreen() {
        return null;
    }

    @Override // io.sentry.IScope
    @Nullable
    public Session getSession() {
        return null;
    }

    @Override // io.sentry.IScope
    @Nullable
    public ISpan getSpan() {
        return null;
    }

    @Override // io.sentry.IScope
    @NotNull
    public Map<String, String> getTags() {
        return new HashMap();
    }

    @Override // io.sentry.IScope
    @Nullable
    public ITransaction getTransaction() {
        return null;
    }

    @Override // io.sentry.IScope
    @Nullable
    public String getTransactionName() {
        return null;
    }

    @Override // io.sentry.IScope
    @Nullable
    public User getUser() {
        return null;
    }

    @Override // io.sentry.IScope
    public void setAttribute(@Nullable SentryAttribute sentryAttribute) {
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable Boolean bool) {
    }

    @Override // io.sentry.IScope
    public void setTransaction(@Nullable ITransaction iTransaction) {
    }

    @Override // io.sentry.IScope
    @Nullable
    public Scope.SessionPair startSession() {
        return null;
    }

    @Override // io.sentry.IScope
    @NotNull
    public PropagationContext withPropagationContext(Scope.IWithPropagationContext iWithPropagationContext) {
        return new PropagationContext();
    }

    @Override // io.sentry.IScope
    @Nullable
    public Session withSession(Scope.IWithSession iWithSession) {
        return null;
    }

    @Override // io.sentry.IScope
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb, @Nullable Hint hint) {
    }

    @Override // io.sentry.IScope
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IScope m605clone() {
        return getInstance();
    }

    @Override // io.sentry.IScope
    public void setAttribute(@Nullable String str, @Nullable Object obj) {
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable Character ch2) {
    }

    @Override // io.sentry.IScope
    public void setTransaction(@NotNull String str) {
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable Number number) {
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable Object obj) {
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable String str2) {
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable Collection<?> collection) {
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable Object[] objArr) {
    }

    @Override // io.sentry.IScope
    public void clear() {
    }

    @Override // io.sentry.IScope
    public void clearAttachments() {
    }

    @Override // io.sentry.IScope
    public void clearBreadcrumbs() {
    }

    @Override // io.sentry.IScope
    public void clearSession() {
    }

    @Override // io.sentry.IScope
    public void clearTransaction() {
    }

    @Override // io.sentry.IScope
    public void addAttachment(@NotNull Attachment attachment) {
    }

    @Override // io.sentry.IScope
    public void addEventProcessor(@NotNull EventProcessor eventProcessor) {
    }

    @Override // io.sentry.IScope
    public void assignTraceContext(@NotNull SentryEvent sentryEvent) {
    }

    @Override // io.sentry.IScope
    public void bindClient(@NotNull ISentryClient iSentryClient) {
    }

    @Override // io.sentry.IScope
    public void removeAttribute(@Nullable String str) {
    }

    @Override // io.sentry.IScope
    public void removeContexts(@Nullable String str) {
    }

    @Override // io.sentry.IScope
    public void removeExtra(@Nullable String str) {
    }

    @Override // io.sentry.IScope
    public void removeTag(@Nullable String str) {
    }

    @Override // io.sentry.IScope
    public void replaceOptions(@NotNull SentryOptions sentryOptions) {
    }

    @Override // io.sentry.IScope
    public void setActiveSpan(@Nullable ISpan iSpan) {
    }

    @Override // io.sentry.IScope
    public void setAttributes(@Nullable SentryAttributes sentryAttributes) {
    }

    @Override // io.sentry.IScope
    public void setFingerprint(@NotNull List<String> list) {
    }

    @Override // io.sentry.IScope
    public void setLastEventId(@NotNull SentryId sentryId) {
    }

    @Override // io.sentry.IScope
    public void setLevel(@Nullable SentryLevel sentryLevel) {
    }

    @Override // io.sentry.IScope
    public void setPropagationContext(@NotNull PropagationContext propagationContext) {
    }

    @Override // io.sentry.IScope
    public void setReplayId(@Nullable SentryId sentryId) {
    }

    @Override // io.sentry.IScope
    public void setRequest(@Nullable Request request) {
    }

    @Override // io.sentry.IScope
    public void setScreen(@Nullable String str) {
    }

    @Override // io.sentry.IScope
    public void setUser(@Nullable User user) {
    }

    @Override // io.sentry.IScope
    public void withTransaction(Scope.IWithTransaction iWithTransaction) {
    }

    @Override // io.sentry.IScope
    public void addFeatureFlag(@Nullable String str, @Nullable Boolean bool) {
    }

    @Override // io.sentry.IScope
    public void setExtra(@Nullable String str, @Nullable String str2) {
    }

    @Override // io.sentry.IScope
    public void setTag(@Nullable String str, @Nullable String str2) {
    }

    @Override // io.sentry.IScope
    public void setSpanContext(@NotNull Throwable th2, @NotNull ISpan iSpan, @NotNull String str) {
    }
}

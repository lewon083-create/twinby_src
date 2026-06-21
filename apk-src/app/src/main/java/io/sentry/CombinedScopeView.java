package io.sentry;

import io.sentry.Scope;
import io.sentry.featureflags.FeatureFlagBuffer;
import io.sentry.featureflags.IFeatureFlagBuffer;
import io.sentry.internal.eventprocessor.EventProcessorAndOrder;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.FeatureFlags;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.EventProcessorUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class CombinedScopeView implements IScope {
    private final IScope globalScope;
    private final IScope isolationScope;
    private final IScope scope;

    /* JADX INFO: renamed from: io.sentry.CombinedScopeView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$ScopeType;

        static {
            int[] iArr = new int[ScopeType.values().length];
            $SwitchMap$io$sentry$ScopeType = iArr;
            try {
                iArr[ScopeType.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$ScopeType[ScopeType.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$ScopeType[ScopeType.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$ScopeType[ScopeType.COMBINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public CombinedScopeView(@NotNull IScope iScope, @NotNull IScope iScope2, @NotNull IScope iScope3) {
        this.globalScope = iScope;
        this.isolationScope = iScope2;
        this.scope = iScope3;
    }

    @NotNull
    private IScope getDefaultWriteScope() {
        return getSpecificScope(null);
    }

    @Override // io.sentry.IScope
    public void addAttachment(@NotNull Attachment attachment) {
        getDefaultWriteScope().addAttachment(attachment);
    }

    @Override // io.sentry.IScope
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb, @Nullable Hint hint) {
        getDefaultWriteScope().addBreadcrumb(breadcrumb, hint);
    }

    @Override // io.sentry.IScope
    public void addEventProcessor(@NotNull EventProcessor eventProcessor) {
        getDefaultWriteScope().addEventProcessor(eventProcessor);
    }

    @Override // io.sentry.IScope
    public void addFeatureFlag(@Nullable String str, @Nullable Boolean bool) {
        getDefaultWriteScope().addFeatureFlag(str, bool);
        ISpan span = getSpan();
        if (span != null) {
            span.addFeatureFlag(str, bool);
        }
    }

    @Override // io.sentry.IScope
    public void assignTraceContext(@NotNull SentryEvent sentryEvent) {
        this.globalScope.assignTraceContext(sentryEvent);
    }

    @Override // io.sentry.IScope
    public void bindClient(@NotNull ISentryClient iSentryClient) {
        getDefaultWriteScope().bindClient(iSentryClient);
    }

    @Override // io.sentry.IScope
    public void clear() {
        getDefaultWriteScope().clear();
    }

    @Override // io.sentry.IScope
    public void clearAttachments() {
        getDefaultWriteScope().clearAttachments();
    }

    @Override // io.sentry.IScope
    public void clearBreadcrumbs() {
        getDefaultWriteScope().clearBreadcrumbs();
    }

    @Override // io.sentry.IScope
    public void clearSession() {
        getDefaultWriteScope().clearSession();
    }

    @Override // io.sentry.IScope
    public void clearTransaction() {
        getDefaultWriteScope().clearTransaction();
    }

    @Override // io.sentry.IScope
    @Nullable
    public Session endSession() {
        return getDefaultWriteScope().endSession();
    }

    @Override // io.sentry.IScope
    @NotNull
    public List<Attachment> getAttachments() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.globalScope.getAttachments());
        copyOnWriteArrayList.addAll(this.isolationScope.getAttachments());
        copyOnWriteArrayList.addAll(this.scope.getAttachments());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.IScope
    @NotNull
    public Map<String, SentryAttribute> getAttributes() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.globalScope.getAttributes());
        concurrentHashMap.putAll(this.isolationScope.getAttributes());
        concurrentHashMap.putAll(this.scope.getAttributes());
        return concurrentHashMap;
    }

    @Override // io.sentry.IScope
    @NotNull
    public Queue<Breadcrumb> getBreadcrumbs() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.globalScope.getBreadcrumbs());
        arrayList.addAll(this.isolationScope.getBreadcrumbs());
        arrayList.addAll(this.scope.getBreadcrumbs());
        Collections.sort(arrayList);
        Queue<Breadcrumb> queueCreateBreadcrumbsList = Scope.createBreadcrumbsList(this.scope.getOptions().getMaxBreadcrumbs());
        queueCreateBreadcrumbsList.addAll(arrayList);
        return queueCreateBreadcrumbsList;
    }

    @Override // io.sentry.IScope
    @NotNull
    public ISentryClient getClient() {
        ISentryClient client = this.scope.getClient();
        if (!(client instanceof NoOpSentryClient)) {
            return client;
        }
        ISentryClient client2 = this.isolationScope.getClient();
        return !(client2 instanceof NoOpSentryClient) ? client2 : this.globalScope.getClient();
    }

    @Override // io.sentry.IScope
    @NotNull
    public Contexts getContexts() {
        return new CombinedContextsView(this.globalScope.getContexts(), this.isolationScope.getContexts(), this.scope.getContexts(), getOptions().getDefaultScopeType());
    }

    @Override // io.sentry.IScope
    @NotNull
    public List<EventProcessor> getEventProcessors() {
        return EventProcessorUtils.unwrap(getEventProcessorsWithOrder());
    }

    @Override // io.sentry.IScope
    @NotNull
    public List<EventProcessorAndOrder> getEventProcessorsWithOrder() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.globalScope.getEventProcessorsWithOrder());
        copyOnWriteArrayList.addAll(this.isolationScope.getEventProcessorsWithOrder());
        copyOnWriteArrayList.addAll(this.scope.getEventProcessorsWithOrder());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.IScope
    @NotNull
    public Map<String, Object> getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.globalScope.getExtras());
        concurrentHashMap.putAll(this.isolationScope.getExtras());
        concurrentHashMap.putAll(this.scope.getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.IScope
    @NotNull
    public IFeatureFlagBuffer getFeatureFlagBuffer() {
        return FeatureFlagBuffer.merged(getOptions(), this.globalScope.getFeatureFlagBuffer(), this.isolationScope.getFeatureFlagBuffer(), this.scope.getFeatureFlagBuffer());
    }

    @Override // io.sentry.IScope
    @Nullable
    public FeatureFlags getFeatureFlags() {
        return getFeatureFlagBuffer().getFeatureFlags();
    }

    @Override // io.sentry.IScope
    @NotNull
    public List<String> getFingerprint() {
        List<String> fingerprint = this.scope.getFingerprint();
        if (!fingerprint.isEmpty()) {
            return fingerprint;
        }
        List<String> fingerprint2 = this.isolationScope.getFingerprint();
        return !fingerprint2.isEmpty() ? fingerprint2 : this.globalScope.getFingerprint();
    }

    @Override // io.sentry.IScope
    @NotNull
    public SentryId getLastEventId() {
        return this.globalScope.getLastEventId();
    }

    @Override // io.sentry.IScope
    @Nullable
    public SentryLevel getLevel() {
        SentryLevel level = this.scope.getLevel();
        if (level != null) {
            return level;
        }
        SentryLevel level2 = this.isolationScope.getLevel();
        return level2 != null ? level2 : this.globalScope.getLevel();
    }

    @Override // io.sentry.IScope
    @NotNull
    public SentryOptions getOptions() {
        return this.globalScope.getOptions();
    }

    @Override // io.sentry.IScope
    @NotNull
    public PropagationContext getPropagationContext() {
        return getDefaultWriteScope().getPropagationContext();
    }

    @Override // io.sentry.IScope
    @NotNull
    public SentryId getReplayId() {
        SentryId replayId = this.scope.getReplayId();
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!sentryId.equals(replayId)) {
            return replayId;
        }
        SentryId replayId2 = this.isolationScope.getReplayId();
        return !sentryId.equals(replayId2) ? replayId2 : this.globalScope.getReplayId();
    }

    @Override // io.sentry.IScope
    @Nullable
    public Request getRequest() {
        Request request = this.scope.getRequest();
        if (request != null) {
            return request;
        }
        Request request2 = this.isolationScope.getRequest();
        return request2 != null ? request2 : this.globalScope.getRequest();
    }

    @Override // io.sentry.IScope
    @Nullable
    public String getScreen() {
        String screen = this.scope.getScreen();
        if (screen != null) {
            return screen;
        }
        String screen2 = this.isolationScope.getScreen();
        return screen2 != null ? screen2 : this.globalScope.getScreen();
    }

    @Override // io.sentry.IScope
    @Nullable
    public Session getSession() {
        Session session = this.scope.getSession();
        if (session != null) {
            return session;
        }
        Session session2 = this.isolationScope.getSession();
        return session2 != null ? session2 : this.globalScope.getSession();
    }

    @Override // io.sentry.IScope
    @Nullable
    public ISpan getSpan() {
        ISpan span = this.scope.getSpan();
        if (span != null) {
            return span;
        }
        ISpan span2 = this.isolationScope.getSpan();
        return span2 != null ? span2 : this.globalScope.getSpan();
    }

    public IScope getSpecificScope(@Nullable ScopeType scopeType) {
        if (scopeType != null) {
            int i = AnonymousClass1.$SwitchMap$io$sentry$ScopeType[scopeType.ordinal()];
            if (i == 1) {
                return this.scope;
            }
            if (i == 2) {
                return this.isolationScope;
            }
            if (i == 3) {
                return this.globalScope;
            }
            if (i == 4) {
                return this;
            }
        }
        int i10 = AnonymousClass1.$SwitchMap$io$sentry$ScopeType[getOptions().getDefaultScopeType().ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.scope : this.globalScope : this.isolationScope : this.scope;
    }

    @Override // io.sentry.IScope
    @NotNull
    public Map<String, String> getTags() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.globalScope.getTags());
        concurrentHashMap.putAll(this.isolationScope.getTags());
        concurrentHashMap.putAll(this.scope.getTags());
        return concurrentHashMap;
    }

    @Override // io.sentry.IScope
    @Nullable
    public ITransaction getTransaction() {
        ITransaction transaction = this.scope.getTransaction();
        if (transaction != null) {
            return transaction;
        }
        ITransaction transaction2 = this.isolationScope.getTransaction();
        return transaction2 != null ? transaction2 : this.globalScope.getTransaction();
    }

    @Override // io.sentry.IScope
    @Nullable
    public String getTransactionName() {
        String transactionName = this.scope.getTransactionName();
        if (transactionName != null) {
            return transactionName;
        }
        String transactionName2 = this.isolationScope.getTransactionName();
        return transactionName2 != null ? transactionName2 : this.globalScope.getTransactionName();
    }

    @Override // io.sentry.IScope
    @Nullable
    public User getUser() {
        User user = this.scope.getUser();
        if (user != null) {
            return user;
        }
        User user2 = this.isolationScope.getUser();
        return user2 != null ? user2 : this.globalScope.getUser();
    }

    @Override // io.sentry.IScope
    public void removeAttribute(@Nullable String str) {
        getDefaultWriteScope().removeAttribute(str);
    }

    @Override // io.sentry.IScope
    public void removeContexts(@Nullable String str) {
        getDefaultWriteScope().removeContexts(str);
    }

    @Override // io.sentry.IScope
    public void removeExtra(@Nullable String str) {
        getDefaultWriteScope().removeExtra(str);
    }

    @Override // io.sentry.IScope
    public void removeTag(@Nullable String str) {
        getDefaultWriteScope().removeTag(str);
    }

    @Override // io.sentry.IScope
    public void replaceOptions(@NotNull SentryOptions sentryOptions) {
        this.globalScope.replaceOptions(sentryOptions);
    }

    @Override // io.sentry.IScope
    public void setActiveSpan(@Nullable ISpan iSpan) {
        this.scope.setActiveSpan(iSpan);
    }

    @Override // io.sentry.IScope
    public void setAttribute(@Nullable String str, @Nullable Object obj) {
        getDefaultWriteScope().setAttribute(str, obj);
    }

    @Override // io.sentry.IScope
    public void setAttributes(@Nullable SentryAttributes sentryAttributes) {
        getDefaultWriteScope().setAttributes(sentryAttributes);
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable Object obj) {
        getDefaultWriteScope().setContexts(str, obj);
    }

    @Override // io.sentry.IScope
    public void setExtra(@Nullable String str, @Nullable String str2) {
        getDefaultWriteScope().setExtra(str, str2);
    }

    @Override // io.sentry.IScope
    public void setFingerprint(@NotNull List<String> list) {
        getDefaultWriteScope().setFingerprint(list);
    }

    @Override // io.sentry.IScope
    public void setLastEventId(@NotNull SentryId sentryId) {
        this.globalScope.setLastEventId(sentryId);
        this.isolationScope.setLastEventId(sentryId);
        this.scope.setLastEventId(sentryId);
    }

    @Override // io.sentry.IScope
    public void setLevel(@Nullable SentryLevel sentryLevel) {
        getDefaultWriteScope().setLevel(sentryLevel);
    }

    @Override // io.sentry.IScope
    public void setPropagationContext(@NotNull PropagationContext propagationContext) {
        getDefaultWriteScope().setPropagationContext(propagationContext);
    }

    @Override // io.sentry.IScope
    public void setReplayId(@NotNull SentryId sentryId) {
        getDefaultWriteScope().setReplayId(sentryId);
    }

    @Override // io.sentry.IScope
    public void setRequest(@Nullable Request request) {
        getDefaultWriteScope().setRequest(request);
    }

    @Override // io.sentry.IScope
    public void setScreen(@Nullable String str) {
        getDefaultWriteScope().setScreen(str);
    }

    @Override // io.sentry.IScope
    public void setSpanContext(@NotNull Throwable th2, @NotNull ISpan iSpan, @NotNull String str) {
        this.globalScope.setSpanContext(th2, iSpan, str);
    }

    @Override // io.sentry.IScope
    public void setTag(@Nullable String str, @Nullable String str2) {
        getDefaultWriteScope().setTag(str, str2);
    }

    @Override // io.sentry.IScope
    public void setTransaction(@NotNull String str) {
        getDefaultWriteScope().setTransaction(str);
    }

    @Override // io.sentry.IScope
    public void setUser(@Nullable User user) {
        getDefaultWriteScope().setUser(user);
    }

    @Override // io.sentry.IScope
    @Nullable
    public Scope.SessionPair startSession() {
        return getDefaultWriteScope().startSession();
    }

    @Override // io.sentry.IScope
    @NotNull
    public PropagationContext withPropagationContext(Scope.IWithPropagationContext iWithPropagationContext) {
        return getDefaultWriteScope().withPropagationContext(iWithPropagationContext);
    }

    @Override // io.sentry.IScope
    @Nullable
    public Session withSession(Scope.IWithSession iWithSession) {
        return getDefaultWriteScope().withSession(iWithSession);
    }

    @Override // io.sentry.IScope
    public void withTransaction(Scope.IWithTransaction iWithTransaction) {
        getDefaultWriteScope().withTransaction(iWithTransaction);
    }

    @Override // io.sentry.IScope
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb) {
        getDefaultWriteScope().addBreadcrumb(breadcrumb);
    }

    @Override // io.sentry.IScope
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IScope m601clone() {
        return new CombinedScopeView(this.globalScope, this.isolationScope.m601clone(), this.scope.m601clone());
    }

    @Override // io.sentry.IScope
    public void setAttribute(@Nullable SentryAttribute sentryAttribute) {
        getDefaultWriteScope().setAttribute(sentryAttribute);
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable Boolean bool) {
        getDefaultWriteScope().setContexts(str, bool);
    }

    @Override // io.sentry.IScope
    public void setTransaction(@Nullable ITransaction iTransaction) {
        getDefaultWriteScope().setTransaction(iTransaction);
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable String str2) {
        getDefaultWriteScope().setContexts(str, str2);
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable Number number) {
        getDefaultWriteScope().setContexts(str, number);
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable Collection<?> collection) {
        getDefaultWriteScope().setContexts(str, collection);
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable Object[] objArr) {
        getDefaultWriteScope().setContexts(str, objArr);
    }

    @Override // io.sentry.IScope
    public void setContexts(@Nullable String str, @Nullable Character ch2) {
        getDefaultWriteScope().setContexts(str, ch2);
    }
}

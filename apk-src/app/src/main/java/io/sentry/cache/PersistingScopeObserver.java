package io.sentry.cache;

import io.appmetrica.analytics.impl.cp;
import io.sentry.Breadcrumb;
import io.sentry.IScope;
import io.sentry.ScopeObserverAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.cache.tape.ObjectQueue;
import io.sentry.cache.tape.QueueFile;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.LazyEvaluator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class PersistingScopeObserver extends ScopeObserverAdapter {
    public static final String BREADCRUMBS_FILENAME = "breadcrumbs.json";
    public static final String CONTEXTS_FILENAME = "contexts.json";
    public static final String EXTRAS_FILENAME = "extras.json";
    public static final String FINGERPRINT_FILENAME = "fingerprint.json";
    public static final String LEVEL_FILENAME = "level.json";
    public static final String REPLAY_FILENAME = "replay.json";
    public static final String REQUEST_FILENAME = "request.json";
    public static final String SCOPE_CACHE = ".scope-cache";
    public static final String TAGS_FILENAME = "tags.json";
    public static final String TRACE_FILENAME = "trace.json";
    public static final String TRANSACTION_FILENAME = "transaction.json";
    public static final String USER_FILENAME = "user.json";
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    @NotNull
    private final LazyEvaluator<ObjectQueue<Breadcrumb>> breadcrumbsQueue = new LazyEvaluator<>(new a(1, this));

    @NotNull
    private SentryOptions options;

    public PersistingScopeObserver(@NotNull SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    private void delete(@NotNull String str) {
        CacheUtils.delete(this.options, SCOPE_CACHE, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addBreadcrumb$2(Breadcrumb breadcrumb) {
        try {
            this.breadcrumbsQueue.getValue().add(breadcrumb);
        } catch (IOException e3) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to add breadcrumb to file queue", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObjectQueue lambda$new$0() {
        QueueFile queueFileBuild;
        File fileEnsureCacheDir = CacheUtils.ensureCacheDir(this.options, SCOPE_CACHE);
        if (fileEnsureCacheDir == null) {
            this.options.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return ObjectQueue.createEmpty();
        }
        File file = new File(fileEnsureCacheDir, BREADCRUMBS_FILENAME);
        try {
            try {
                queueFileBuild = new QueueFile.Builder(file).size(this.options.getMaxBreadcrumbs()).build();
            } catch (IOException unused) {
                file.delete();
                queueFileBuild = new QueueFile.Builder(file).size(this.options.getMaxBreadcrumbs()).build();
            }
            return ObjectQueue.create(queueFileBuild, new ObjectQueue.Converter<Breadcrumb>() { // from class: io.sentry.cache.PersistingScopeObserver.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // io.sentry.cache.tape.ObjectQueue.Converter
                @Nullable
                public Breadcrumb from(byte[] bArr) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), PersistingScopeObserver.UTF_8));
                        try {
                            Breadcrumb breadcrumb = (Breadcrumb) PersistingScopeObserver.this.options.getSerializer().deserialize(bufferedReader, Breadcrumb.class);
                            bufferedReader.close();
                            return breadcrumb;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        PersistingScopeObserver.this.options.getLogger().log(SentryLevel.ERROR, th2, "Error reading entity from scope cache", new Object[0]);
                        return null;
                    }
                }

                @Override // io.sentry.cache.tape.ObjectQueue.Converter
                public void toStream(Breadcrumb breadcrumb, OutputStream outputStream) throws IOException {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, PersistingScopeObserver.UTF_8));
                    try {
                        PersistingScopeObserver.this.options.getSerializer().serialize(breadcrumb, bufferedWriter);
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            });
        } catch (IOException e3) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to create breadcrumbs queue", e3);
            return ObjectQueue.createEmpty();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$serializeToDisk$13(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Serialization task failed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBreadcrumbs$3() {
        try {
            this.breadcrumbsQueue.getValue().clear();
        } catch (IOException e3) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to clear breadcrumbs from file queue", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setContexts$11(Contexts contexts) {
        store(contexts, CONTEXTS_FILENAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setExtras$5(Map map) {
        store(map, EXTRAS_FILENAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFingerprint$7(Collection collection) {
        store(collection, FINGERPRINT_FILENAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLevel$8(SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            delete(LEVEL_FILENAME);
        } else {
            store(sentryLevel, LEVEL_FILENAME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setReplayId$12(SentryId sentryId) {
        store(sentryId, REPLAY_FILENAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRequest$6(Request request) {
        if (request == null) {
            delete(REQUEST_FILENAME);
        } else {
            store(request, REQUEST_FILENAME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTags$4(Map map) {
        store(map, "tags.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrace$10(SpanContext spanContext, IScope iScope) {
        if (spanContext == null) {
            store(iScope.getPropagationContext().toSpanContext(), TRACE_FILENAME);
        } else {
            store(spanContext, TRACE_FILENAME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTransaction$9(String str) {
        if (str == null) {
            delete(TRANSACTION_FILENAME);
        } else {
            store(str, TRANSACTION_FILENAME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUser$1(User user) {
        if (user == null) {
            delete(USER_FILENAME);
        } else {
            store(user, USER_FILENAME);
        }
    }

    private void serializeToDisk(@NotNull Runnable runnable) {
        if (this.options.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Serialization task failed", th2);
                    return;
                }
            }
            try {
                this.options.getExecutorService().submit(new cp(16, this, runnable));
            } catch (Throwable th3) {
                this.options.getLogger().log(SentryLevel.ERROR, "Serialization task could not be scheduled", th3);
            }
        }
    }

    private <T> void store(@NotNull T t10, @NotNull String str) {
        store(this.options, t10, str);
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb) {
        serializeToDisk(new cp(19, this, breadcrumb));
    }

    @Nullable
    public <T> T read(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull Class<T> cls) {
        if (!str.equals(BREADCRUMBS_FILENAME)) {
            return (T) CacheUtils.read(sentryOptions, SCOPE_CACHE, str, cls, null);
        }
        try {
            return cls.cast(this.breadcrumbsQueue.getValue().asList());
        } catch (IOException unused) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public void resetCache() {
        try {
            this.breadcrumbsQueue.getValue().clear();
        } catch (IOException e3) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to clear breadcrumbs from file queue", e3);
        }
        delete(USER_FILENAME);
        delete(LEVEL_FILENAME);
        delete(REQUEST_FILENAME);
        delete(FINGERPRINT_FILENAME);
        delete(CONTEXTS_FILENAME);
        delete(EXTRAS_FILENAME);
        delete("tags.json");
        delete(TRACE_FILENAME);
        delete(TRANSACTION_FILENAME);
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setBreadcrumbs(@NotNull Collection<Breadcrumb> collection) {
        if (collection.isEmpty()) {
            serializeToDisk(new Runnable() { // from class: io.sentry.cache.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26015b.lambda$setBreadcrumbs$3();
                }
            });
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setContexts(@NotNull Contexts contexts) {
        serializeToDisk(new cp(12, this, contexts));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setExtras(@NotNull Map<String, Object> map) {
        serializeToDisk(new d(this, map, 0));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setFingerprint(@NotNull Collection<String> collection) {
        serializeToDisk(new cp(18, this, collection));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setLevel(@Nullable SentryLevel sentryLevel) {
        serializeToDisk(new cp(15, this, sentryLevel));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setReplayId(@NotNull SentryId sentryId) {
        serializeToDisk(new cp(11, this, sentryId));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setRequest(@Nullable Request request) {
        serializeToDisk(new cp(17, this, request));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTags(@NotNull Map<String, String> map) {
        serializeToDisk(new d(this, map, 1));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTrace(@Nullable SpanContext spanContext, @NotNull IScope iScope) {
        serializeToDisk(new a1.c(this, spanContext, iScope, 26));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTransaction(@Nullable String str) {
        serializeToDisk(new cp(13, this, str));
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setUser(@Nullable User user) {
        serializeToDisk(new cp(14, this, user));
    }

    public static <T> void store(@NotNull SentryOptions sentryOptions, @NotNull T t10, @NotNull String str) {
        CacheUtils.store(sentryOptions, t10, SCOPE_CACHE, str);
    }
}

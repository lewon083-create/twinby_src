package io.sentry;

import io.sentry.IConnectionStatusProvider;
import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.transport.RateLimiter;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SendCachedEnvelopeFireAndForgetIntegration implements Integration, IConnectionStatusProvider.IConnectionStatusObserver, Closeable {

    @Nullable
    private IConnectionStatusProvider connectionStatusProvider;

    @NotNull
    private final SendFireAndForgetFactory factory;

    @Nullable
    private SentryOptions options;

    @Nullable
    private IScopes scopes;

    @Nullable
    private SendFireAndForget sender;
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final AtomicBoolean isClosed = new AtomicBoolean(false);

    @NotNull
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface SendFireAndForget {
        void send();
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface SendFireAndForgetDirPath {
        @Nullable
        String getDirPath();
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface SendFireAndForgetFactory {
        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$processDir$0(ILogger iLogger, String str, DirectoryProcessor directoryProcessor, File file) {
            SentryLevel sentryLevel = SentryLevel.DEBUG;
            iLogger.log(sentryLevel, "Started processing cached files from %s", str);
            directoryProcessor.processDirectory(file);
            iLogger.log(sentryLevel, "Finished processing cached files from %s", str);
        }

        @Nullable
        SendFireAndForget create(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions);

        default boolean hasValidPath(@Nullable String str, @NotNull ILogger iLogger) {
            if (str != null && !str.isEmpty()) {
                return true;
            }
            iLogger.log(SentryLevel.INFO, "No cached dir path is defined in options.", new Object[0]);
            return false;
        }

        @NotNull
        default SendFireAndForget processDir(@NotNull final DirectoryProcessor directoryProcessor, @NotNull final String str, @NotNull final ILogger iLogger) {
            final File file = new File(str);
            return new SendFireAndForget() { // from class: io.sentry.k
                @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget
                public final void send() {
                    SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory.lambda$processDir$0(iLogger, str, directoryProcessor, file);
                }
            };
        }
    }

    public SendCachedEnvelopeFireAndForgetIntegration(@NotNull SendFireAndForgetFactory sendFireAndForgetFactory) {
        this.factory = (SendFireAndForgetFactory) Objects.requireNonNull(sendFireAndForgetFactory, "SendFireAndForgetFactory is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCachedEnvelopes$0(SentryOptions sentryOptions, IScopes iScopes) {
        try {
            if (this.isClosed.get()) {
                sentryOptions.getLogger().log(SentryLevel.INFO, "SendCachedEnvelopeFireAndForgetIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!this.isInitialized.getAndSet(true)) {
                IConnectionStatusProvider connectionStatusProvider = sentryOptions.getConnectionStatusProvider();
                this.connectionStatusProvider = connectionStatusProvider;
                connectionStatusProvider.addConnectionStatusObserver(this);
                this.sender = this.factory.create(iScopes, sentryOptions);
            }
            IConnectionStatusProvider iConnectionStatusProvider = this.connectionStatusProvider;
            if (iConnectionStatusProvider != null && iConnectionStatusProvider.getConnectionStatus() == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                sentryOptions.getLogger().log(SentryLevel.INFO, "SendCachedEnvelopeFireAndForgetIntegration, no connection.", new Object[0]);
                return;
            }
            RateLimiter rateLimiter = iScopes.getRateLimiter();
            if (rateLimiter != null && rateLimiter.isActiveForCategory(DataCategory.All)) {
                sentryOptions.getLogger().log(SentryLevel.INFO, "SendCachedEnvelopeFireAndForgetIntegration, rate limiting active.", new Object[0]);
                return;
            }
            SendFireAndForget sendFireAndForget = this.sender;
            if (sendFireAndForget == null) {
                sentryOptions.getLogger().log(SentryLevel.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            } else {
                sendFireAndForget.send();
            }
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed trying to send cached events.", th2);
        }
    }

    private void sendCachedEnvelopes(@NotNull final IScopes iScopes, @NotNull final SentryOptions sentryOptions) {
        try {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                sentryOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26042b.lambda$sendCachedEnvelopes$0(sentryOptions, iScopes);
                    }
                });
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th2) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (RejectedExecutionException e3) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e3);
        } catch (Throwable th4) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent", th4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed.set(true);
        IConnectionStatusProvider iConnectionStatusProvider = this.connectionStatusProvider;
        if (iConnectionStatusProvider != null) {
            iConnectionStatusProvider.removeConnectionStatusObserver(this);
        }
    }

    @Override // io.sentry.IConnectionStatusProvider.IConnectionStatusObserver
    public void onConnectionStatusChanged(@NotNull IConnectionStatusProvider.ConnectionStatus connectionStatus) {
        SentryOptions sentryOptions;
        IScopes iScopes = this.scopes;
        if (iScopes == null || (sentryOptions = this.options) == null || connectionStatus == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
            return;
        }
        sendCachedEnvelopes(iScopes, sentryOptions);
    }

    @Override // io.sentry.Integration
    public void register(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions) {
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        if (!this.factory.hasValidPath(sentryOptions.getCacheDirPath(), sentryOptions.getLogger())) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        sentryOptions.getLogger().log(SentryLevel.DEBUG, "SendCachedEventFireAndForgetIntegration installed.", new Object[0]);
        IntegrationUtils.addIntegrationToSdkVersion("SendCachedEnvelopeFireAndForget");
        sendCachedEnvelopes(iScopes, sentryOptions);
    }
}

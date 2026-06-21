package io.sentry;

import java.util.concurrent.Callable;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryWrapper {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$wrapCallable$0(IScopes iScopes, Callable callable) {
        ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopes.makeCurrent();
        try {
            Object objCall = callable.call();
            if (iSentryLifecycleTokenMakeCurrent != null) {
                iSentryLifecycleTokenMakeCurrent.close();
            }
            return objCall;
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$wrapRunnable$2(IScopes iScopes, Runnable runnable) {
        ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopes.makeCurrent();
        try {
            runnable.run();
            if (iSentryLifecycleTokenMakeCurrent != null) {
                iSentryLifecycleTokenMakeCurrent.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$wrapSupplier$1(IScopes iScopes, Supplier supplier) {
        ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopes.makeCurrent();
        try {
            Object obj = supplier.get();
            if (iSentryLifecycleTokenMakeCurrent != null) {
                iSentryLifecycleTokenMakeCurrent.close();
            }
            return obj;
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static <U> Callable<U> wrapCallable(@NotNull Callable<U> callable) {
        return new r(7, Sentry.getCurrentScopes().forkedScopes("SentryWrapper.wrapCallable"), callable);
    }

    public static Runnable wrapRunnable(@NotNull Runnable runnable) {
        return new h(1, Sentry.forkedScopes("SentryWrapper.wrapRunnable"), runnable);
    }

    public static <U> Supplier<U> wrapSupplier(@NotNull final Supplier<U> supplier) {
        final IScopes iScopesForkedScopes = Sentry.forkedScopes("SentryWrapper.wrapSupplier");
        return new Supplier() { // from class: io.sentry.w
            @Override // java.util.function.Supplier
            public final Object get() {
                return SentryWrapper.lambda$wrapSupplier$1(iScopesForkedScopes, supplier);
            }
        };
    }
}

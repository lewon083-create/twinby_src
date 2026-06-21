package io.sentry.util;

import he.e;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.TypeCheckHint;
import io.sentry.hints.ApplyScopeData;
import io.sentry.hints.Backfillable;
import io.sentry.hints.Cached;
import io.sentry.hints.EventDropReason;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class HintUtils {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @FunctionalInterface
    public interface SentryConsumer<T> {
        void accept(@NotNull T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @FunctionalInterface
    public interface SentryHintFallback {
        void accept(@Nullable Object obj, @NotNull Class<?> cls);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @FunctionalInterface
    public interface SentryNullableConsumer<T> {
        void accept(@Nullable T t10);
    }

    private HintUtils() {
    }

    public static Hint createWithTypeCheckHint(Object obj) {
        Hint hint = new Hint();
        setTypeCheckHint(hint, obj);
        return hint;
    }

    @Nullable
    public static EventDropReason getEventDropReason(@NotNull Hint hint) {
        return (EventDropReason) hint.getAs(TypeCheckHint.SENTRY_EVENT_DROP_REASON, EventDropReason.class);
    }

    @Nullable
    public static Object getSentrySdkHint(@NotNull Hint hint) {
        return hint.get(TypeCheckHint.SENTRY_TYPE_CHECK_HINT);
    }

    public static boolean hasType(@NotNull Hint hint, @NotNull Class<?> cls) {
        return cls.isInstance(getSentrySdkHint(hint));
    }

    public static boolean isFromHybridSdk(@NotNull Hint hint) {
        return Boolean.TRUE.equals(hint.getAs(TypeCheckHint.SENTRY_IS_FROM_HYBRID_SDK, Boolean.class));
    }

    public static <T> void runIfDoesNotHaveType(@NotNull Hint hint, @NotNull Class<T> cls, SentryNullableConsumer<Object> sentryNullableConsumer) {
        runIfHasType(hint, cls, new ig.a(22), new e(14, sentryNullableConsumer));
    }

    public static <T> void runIfHasType(@NotNull Hint hint, @NotNull Class<T> cls, SentryConsumer<T> sentryConsumer) {
        runIfHasType(hint, cls, sentryConsumer, new ig.a(21));
    }

    public static <T> void runIfHasTypeLogIfNot(@NotNull Hint hint, @NotNull Class<T> cls, ILogger iLogger, SentryConsumer<T> sentryConsumer) {
        runIfHasType(hint, cls, sentryConsumer, new e(13, iLogger));
    }

    public static void setEventDropReason(@NotNull Hint hint, @NotNull EventDropReason eventDropReason) {
        hint.set(TypeCheckHint.SENTRY_EVENT_DROP_REASON, eventDropReason);
    }

    public static void setIsFromHybridSdk(@NotNull Hint hint, @NotNull String str) {
        if (str.startsWith(TypeCheckHint.SENTRY_JAVASCRIPT_SDK_NAME) || str.startsWith(TypeCheckHint.SENTRY_DART_SDK_NAME) || str.startsWith(TypeCheckHint.SENTRY_DOTNET_SDK_NAME)) {
            hint.set(TypeCheckHint.SENTRY_IS_FROM_HYBRID_SDK, Boolean.TRUE);
        }
    }

    public static void setTypeCheckHint(@NotNull Hint hint, Object obj) {
        hint.set(TypeCheckHint.SENTRY_TYPE_CHECK_HINT, obj);
    }

    public static boolean shouldApplyScopeData(@NotNull Hint hint) {
        return !(hasType(hint, Cached.class) || hasType(hint, Backfillable.class)) || hasType(hint, ApplyScopeData.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void runIfHasType(@NotNull Hint hint, @NotNull Class<T> cls, SentryConsumer<T> sentryConsumer, SentryHintFallback sentryHintFallback) {
        Object sentrySdkHint = getSentrySdkHint(hint);
        if (!hasType(hint, cls) || sentrySdkHint == null) {
            sentryHintFallback.accept(sentrySdkHint, cls);
        } else {
            sentryConsumer.accept(sentrySdkHint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runIfDoesNotHaveType$0(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runIfHasType$2(Object obj, Class cls) {
    }
}

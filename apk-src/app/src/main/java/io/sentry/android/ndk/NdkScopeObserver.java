package io.sentry.android.ndk;

import a1.c;
import io.appmetrica.analytics.impl.cp;
import io.appmetrica.analytics.impl.lp;
import io.sentry.Attachment;
import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.IScope;
import io.sentry.ScopeObserverAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.ndk.INativeScope;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.User;
import io.sentry.util.Objects;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NdkScopeObserver extends ScopeObserverAdapter {

    @NotNull
    private final INativeScope nativeScope;

    @NotNull
    private final SentryOptions options;

    public NdkScopeObserver(@NotNull SentryOptions sentryOptions) {
        this(sentryOptions, new NativeScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addAttachment$7(String str) {
        this.nativeScope.addAttachment(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addAttachment$8(byte[] bArr, String str) {
        this.nativeScope.addAttachmentBytes(bArr, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addBreadcrumb$1(Breadcrumb breadcrumb) {
        String strSerialize = null;
        String lowerCase = breadcrumb.getLevel() != null ? breadcrumb.getLevel().name().toLowerCase(Locale.ROOT) : null;
        String timestamp = DateUtils.getTimestamp(breadcrumb.getTimestamp());
        try {
            Map<String, Object> data = breadcrumb.getData();
            if (!data.isEmpty()) {
                strSerialize = this.options.getSerializer().serialize(data);
            }
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Breadcrumb data is not serializable.", new Object[0]);
        }
        this.nativeScope.addBreadcrumb(lowerCase, breadcrumb.getMessage(), breadcrumb.getCategory(), breadcrumb.getType(), timestamp, strSerialize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearAttachments$9() {
        this.nativeScope.clearAttachments();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeExtra$5(String str) {
        this.nativeScope.removeExtra(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeTag$3(String str) {
        this.nativeScope.removeTag(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setExtra$4(String str, String str2) {
        this.nativeScope.setExtra(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTag$2(String str, String str2) {
        this.nativeScope.setTag(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrace$6(SpanContext spanContext) {
        this.nativeScope.setTrace(spanContext.getTraceId().toString(), spanContext.getSpanId().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUser$0(User user) {
        if (user == null) {
            this.nativeScope.removeUser();
        } else {
            this.nativeScope.setUser(user.getId(), user.getEmail(), user.getIpAddress(), user.getUsername());
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void addAttachment(@NotNull Attachment attachment) {
        String pathname = attachment.getPathname();
        if (pathname != null) {
            try {
                this.options.getExecutorService().submit(new b(this, pathname, 2));
                return;
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, th2, "Scope sync addAttachment has an error.", new Object[0]);
                return;
            }
        }
        byte[] bytes = attachment.getBytes();
        if (bytes == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Scope sync addAttachment skips attachment without path or bytes.", new Object[0]);
            return;
        }
        try {
            this.options.getExecutorService().submit(new c(this, bytes, attachment.getFilename(), 21));
        } catch (Throwable th3) {
            this.options.getLogger().log(SentryLevel.ERROR, th3, "Scope sync addAttachment has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb) {
        try {
            this.options.getExecutorService().submit(new cp(7, this, breadcrumb));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void clearAttachments() {
        try {
            this.options.getExecutorService().submit(new lp(4, this));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Scope sync clearAttachments has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void removeExtra(@NotNull String str) {
        try {
            this.options.getExecutorService().submit(new b(this, str, 1));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void removeTag(@NotNull String str) {
        try {
            this.options.getExecutorService().submit(new b(this, str, 0));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setExtra(@NotNull String str, @NotNull String str2) {
        try {
            this.options.getExecutorService().submit(new a(this, str, str2, 0));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTag(@NotNull String str, @NotNull String str2) {
        try {
            this.options.getExecutorService().submit(new a(this, str, str2, 1));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTrace(@Nullable SpanContext spanContext, @NotNull IScope iScope) {
        if (spanContext == null) {
            return;
        }
        try {
            this.options.getExecutorService().submit(new cp(6, this, spanContext));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setUser(@Nullable User user) {
        try {
            this.options.getExecutorService().submit(new cp(8, this, user));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    public NdkScopeObserver(@NotNull SentryOptions sentryOptions, @NotNull INativeScope iNativeScope) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions object is required.");
        this.nativeScope = (INativeScope) Objects.requireNonNull(iNativeScope, "The NativeScope object is required.");
    }
}

package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISerializer;
import io.sentry.PropagationContext;
import io.sentry.ScopeType;
import io.sentry.ScopesAdapter;
import io.sentry.Sentry;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.android.core.performance.ActivityLifecycleTimeSpan;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.App;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.MapObjectWriter;
import io.sentry.util.TracingUtils;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class InternalSentrySdk {
    private static void addTimeSpanToSerializedSpans(TimeSpan timeSpan, List<Map<String, Object>> list) {
        if (timeSpan.hasNotStarted()) {
            ScopesAdapter.getInstance().getOptions().getLogger().log(SentryLevel.WARNING, "Can not convert not-started TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        if (timeSpan.hasNotStopped()) {
            ScopesAdapter.getInstance().getOptions().getLogger().log(SentryLevel.WARNING, "Can not convert not-stopped TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        HashMap map = new HashMap();
        map.put("description", timeSpan.getDescription());
        map.put("start_timestamp_ms", Long.valueOf(timeSpan.getStartTimestampMs()));
        map.put("end_timestamp_ms", Long.valueOf(timeSpan.getProjectedStopTimestampMs()));
        list.add(map);
    }

    @Nullable
    public static SentryId captureEnvelope(@NotNull byte[] bArr, boolean z5) {
        ScopesAdapter scopesAdapter = ScopesAdapter.getInstance();
        SentryOptions options = scopesAdapter.getOptions();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ISerializer serializer = options.getSerializer();
                SentryEnvelope sentryEnvelope = options.getEnvelopeReader().read(byteArrayInputStream);
                if (sentryEnvelope == null) {
                    byteArrayInputStream.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Session.State state = null;
                boolean z10 = false;
                for (SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
                    arrayList.add(sentryEnvelopeItem);
                    SentryEvent event = sentryEnvelopeItem.getEvent(serializer);
                    if (event != null) {
                        if (event.isCrashed()) {
                            state = Session.State.Crashed;
                        }
                        if (event.isCrashed() || event.isErrored()) {
                            z10 = true;
                        }
                    }
                }
                Session sessionUpdateSession = updateSession(scopesAdapter, options, state, z10);
                if (sessionUpdateSession != null) {
                    arrayList.add(SentryEnvelopeItem.fromSession(serializer, sessionUpdateSession));
                    deleteCurrentSessionFile(options, (z5 && scopesAdapter.getOptions().getThreadChecker().isMainThread()) ? false : true);
                    if (z5) {
                        scopesAdapter.startSession();
                    }
                }
                SentryId sentryIdCaptureEnvelope = scopesAdapter.captureEnvelope(new SentryEnvelope(sentryEnvelope.getHeader(), arrayList));
                byteArrayInputStream.close();
                return sentryIdCaptureEnvelope;
            } finally {
            }
        } catch (Throwable th2) {
            options.getLogger().log(SentryLevel.ERROR, "Failed to capture envelope", th2);
            return null;
        }
        options.getLogger().log(SentryLevel.ERROR, "Failed to capture envelope", th2);
        return null;
    }

    private static void deleteCurrentSessionFile(@NotNull SentryOptions sentryOptions, boolean z5) {
        if (z5) {
            deleteCurrentSessionFile(sentryOptions);
            return;
        }
        try {
            sentryOptions.getExecutorService().submit(new d(3, sentryOptions));
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.WARNING, "Submission of deletion of the current session file rejected.", th2);
        }
    }

    public static Map<String, Object> getAppStartMeasurement() {
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        ArrayList arrayList = new ArrayList();
        addTimeSpanToSerializedSpans(appStartMetrics.createProcessInitSpan(), arrayList);
        addTimeSpanToSerializedSpans(appStartMetrics.getApplicationOnCreateTimeSpan(), arrayList);
        Iterator<TimeSpan> it = appStartMetrics.getContentProviderOnCreateTimeSpans().iterator();
        while (it.hasNext()) {
            addTimeSpanToSerializedSpans(it.next(), arrayList);
        }
        for (ActivityLifecycleTimeSpan activityLifecycleTimeSpan : appStartMetrics.getActivityLifecycleTimeSpans()) {
            addTimeSpanToSerializedSpans(activityLifecycleTimeSpan.getOnCreate(), arrayList);
            addTimeSpanToSerializedSpans(activityLifecycleTimeSpan.getOnStart(), arrayList);
        }
        HashMap map = new HashMap();
        map.put(SentryTransaction.JsonKeys.SPANS, arrayList);
        map.put("type", appStartMetrics.getAppStartType().toString().toLowerCase(Locale.ROOT));
        if (appStartMetrics.getAppStartTimeSpan().hasStarted()) {
            map.put("app_start_timestamp_ms", Long.valueOf(appStartMetrics.getAppStartTimeSpan().getStartTimestampMs()));
        }
        return map;
    }

    @Nullable
    public static IScope getCurrentScope() {
        AtomicReference atomicReference = new AtomicReference();
        ScopesAdapter.getInstance().configureScope(ScopeType.COMBINED, new t(3, atomicReference));
        return (IScope) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCurrentScope$0(AtomicReference atomicReference, IScope iScope) {
        atomicReference.set(iScope.m605clone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateSession$2(Session.State state, boolean z5, AtomicReference atomicReference, SentryOptions sentryOptions, IScope iScope) {
        Session session = iScope.getSession();
        if (session == null) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Session is null on updateSession", new Object[0]);
        } else if (session.update(state, null, z5, null)) {
            if (session.getStatus() == Session.State.Crashed) {
                session.end();
                iScope.clearSession();
            }
            atomicReference.set(session);
        }
    }

    @NotNull
    public static Map<String, Object> serializeScope(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @Nullable IScope iScope) {
        HashMap map = new HashMap();
        if (iScope != null) {
            try {
                ILogger logger = sentryAndroidOptions.getLogger();
                MapObjectWriter mapObjectWriter = new MapObjectWriter(map);
                DeviceInfoUtil deviceInfoUtil = DeviceInfoUtil.getInstance(context, sentryAndroidOptions);
                iScope.getContexts().setDevice(deviceInfoUtil.collectDeviceInformation(true, true));
                iScope.getContexts().setOperatingSystem(deviceInfoUtil.getOperatingSystem());
                User user = iScope.getUser();
                if (user == null) {
                    user = new User();
                    iScope.setUser(user);
                }
                if (user.getId() == null) {
                    try {
                        user.setId(Installation.id(context));
                    } catch (RuntimeException e3) {
                        logger.log(SentryLevel.ERROR, "Could not retrieve installation ID", e3);
                    }
                }
                App app = iScope.getContexts().getApp();
                if (app == null) {
                    app = new App();
                }
                app.setAppName(ContextUtils.getApplicationName(context));
                TimeSpan appStartTimeSpanWithFallback = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(sentryAndroidOptions);
                if (appStartTimeSpanWithFallback.hasStarted()) {
                    app.setAppStartTime(DateUtils.toUtilDate(appStartTimeSpanWithFallback.getStartTimestamp()));
                }
                BuildInfoProvider buildInfoProvider = new BuildInfoProvider(sentryAndroidOptions.getLogger());
                PackageInfo packageInfo = ContextUtils.getPackageInfo(context, 4096, sentryAndroidOptions.getLogger(), buildInfoProvider);
                if (packageInfo != null) {
                    ContextUtils.setAppPackageInfo(packageInfo, buildInfoProvider, deviceInfoUtil, app);
                }
                iScope.getContexts().setApp(app);
                mapObjectWriter.name(SentryBaseEvent.JsonKeys.USER).value(logger, iScope.getUser());
                mapObjectWriter.name("contexts").value(logger, iScope.getContexts());
                mapObjectWriter.name("tags").value(logger, iScope.getTags());
                mapObjectWriter.name("extras").value(logger, iScope.getExtras());
                mapObjectWriter.name(SentryEvent.JsonKeys.FINGERPRINT).value(logger, iScope.getFingerprint());
                mapObjectWriter.name("level").value(logger, iScope.getLevel());
                mapObjectWriter.name(SentryBaseEvent.JsonKeys.BREADCRUMBS).value(logger, iScope.getBreadcrumbs());
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Could not serialize scope.", th2);
                return new HashMap();
            }
        }
        return map;
    }

    public static void setTrace(@NotNull String str, @NotNull String str2, @Nullable Double d10, @Nullable Double d11) {
        TracingUtils.setTrace(Sentry.getCurrentScopes(), PropagationContext.fromExistingTrace(str, str2, d10, d11));
    }

    @Nullable
    private static Session updateSession(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions, @Nullable Session.State state, boolean z5) {
        AtomicReference atomicReference = new AtomicReference();
        iScopes.configureScope(new s(state, z5, atomicReference, sentryOptions));
        return (Session) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteCurrentSessionFile(@NotNull SentryOptions sentryOptions) {
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Cache dir is not set, not deleting the current session.", new Object[0]);
        } else {
            if (EnvelopeCache.getCurrentSessionFile(cacheDirPath).delete()) {
                return;
            }
            sentryOptions.getLogger().log(SentryLevel.WARNING, "Failed to delete the current session file.", new Object[0]);
        }
    }
}

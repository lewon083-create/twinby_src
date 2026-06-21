package io.sentry.flutter;

import a0.y;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.q0;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.messaging.n;
import ei.b;
import ii.o;
import ii.p;
import ii.q;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.IScope;
import io.sentry.Integration;
import io.sentry.ScopesAdapter;
import io.sentry.Sentry;
import io.sentry.SentryDate;
import io.sentry.SentryEvent;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.core.InternalSentrySdk;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.performance.ActivityLifecycleTimeSpan;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.android.replay.Recorder;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.SdkVersion;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.ICurrentDateProvider;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.collections.t;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import m.h3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import z2.w;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class SentryFlutterPlugin implements b, o, fi.a {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long NATIVE_CRASH_WAIT_TIME = 500;

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static WeakReference<Activity> activity;

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static Context applicationContext;

    @Nullable
    private static Long pluginRegistrationTime;

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static ReplayIntegration replay;
    private q channel;
    private Context context;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void addTimeSpanToMap(TimeSpan timeSpan, Map<String, Object> map) {
            String description;
            if (timeSpan.getStartTimestamp() == null || (description = timeSpan.getDescription()) == null) {
                return;
            }
            map.put(description, j0.g(new Pair("startTimestampMsSinceEpoch", Long.valueOf(timeSpan.getStartTimestampMs())), new Pair("stopTimestampMsSinceEpoch", Long.valueOf(timeSpan.getProjectedStopTimestampMs()))));
        }

        private final double adjustReplaySizeToBlockSize(double d10) {
            double d11 = 16;
            double d12 = d10 % d11;
            return d12 <= 8.0d ? d10 - d12 : (d11 - d12) + d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void removeContext$lambda$2(String str, IScope scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.removeContexts(str);
        }

        private final List<Map<String, Object>> serialize(List<DebugImage> list) {
            if (list == null) {
                return null;
            }
            List<DebugImage> list2 = list;
            ArrayList arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(SentryFlutterPlugin.Companion.serialize((DebugImage) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setContext$lambda$1(String str, Object obj, IScope scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.setContexts(str, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SentryEvent setupBeforeSend$lambda$0(SentryEvent event, Hint hint) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(hint, "<unused var>");
            SdkVersion sdk = event.getSdk();
            String name = sdk != null ? sdk.getName() : null;
            if (name != null) {
                int iHashCode = name.hashCode();
                if (iHashCode != -1079289216) {
                    if (iHashCode != 214992565) {
                        if (iHashCode == 1378491996 && name.equals("sentry.dart.flutter")) {
                            event.setTag("event.origin", PluginErrorDetails.Platform.FLUTTER);
                            event.setTag("event.environment", "dart");
                            return event;
                        }
                    } else if (name.equals("sentry.native.android.flutter")) {
                        event.setTag("event.origin", "android");
                        event.setTag("event.environment", "native");
                        return event;
                    }
                } else if (name.equals("sentry.java.android.flutter")) {
                    event.setTag("event.origin", "android");
                    event.setTag("event.environment", "java");
                }
            }
            return event;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean setupReplay$lambda$3(Integration integration) {
            return integration instanceof ReplayIntegration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Recorder setupReplay$lambda$4(SafeReplayRecorderCallbacks safeReplayRecorderCallbacks) {
            ReplayIntegration replayIntegration = SentryFlutterPlugin.replay;
            Intrinsics.b(replayIntegration);
            return new SentryFlutterReplayRecorder(safeReplayRecorderCallbacks, replayIntegration);
        }

        public final void crash() throws InterruptedException {
            RuntimeException runtimeException = new RuntimeException("FlutterSentry Native Integration: Sample RuntimeException");
            Thread thread = Looper.getMainLooper().getThread();
            Intrinsics.checkNotNullExpressionValue(thread, "getThread(...)");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, runtimeException);
            }
            thread.join(500L);
        }

        @Nullable
        public final byte[] fetchNativeAppStartAsBytes() {
            AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
            Intrinsics.checkNotNullExpressionValue(appStartMetrics, "getInstance(...)");
            if (!appStartMetrics.isAppLaunchedInForeground() || appStartMetrics.getAppStartTimeSpan().getDurationMs() > 60000) {
                Log.w("Sentry", "Invalid app start data: app not launched in foreground or app start took too long (>60s)");
                return null;
            }
            TimeSpan appStartTimeSpan = appStartMetrics.getAppStartTimeSpan();
            Intrinsics.checkNotNullExpressionValue(appStartTimeSpan, "getAppStartTimeSpan(...)");
            SentryDate startTimestamp = appStartTimeSpan.getStartTimestamp();
            boolean z5 = appStartMetrics.getAppStartType() == AppStartMetrics.AppStartType.COLD;
            if (startTimestamp == null) {
                Log.w("Sentry", "App start won't be sent due to missing appStartTime");
                return null;
            }
            LinkedHashMap linkedHashMapH = j0.h(new Pair("pluginRegistrationTime", SentryFlutterPlugin.pluginRegistrationTime), new Pair("appStartTime", Double.valueOf(DateUtils.nanosToMillis(startTimestamp.nanoTimestamp()))), new Pair("isColdStart", Boolean.valueOf(z5)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            TimeSpan timeSpan = new TimeSpan();
            timeSpan.setDescription("Process Initialization");
            timeSpan.setStartUnixTimeMs(appStartTimeSpan.getStartTimestampMs());
            timeSpan.setStartedAt(appStartTimeSpan.getStartUptimeMs());
            timeSpan.setStoppedAt(appStartMetrics.getClassLoadedUptimeMs());
            addTimeSpanToMap(timeSpan, linkedHashMap);
            TimeSpan applicationOnCreateTimeSpan = appStartMetrics.getApplicationOnCreateTimeSpan();
            Intrinsics.checkNotNullExpressionValue(applicationOnCreateTimeSpan, "getApplicationOnCreateTimeSpan(...)");
            addTimeSpanToMap(applicationOnCreateTimeSpan, linkedHashMap);
            List<TimeSpan> contentProviderOnCreateTimeSpans = appStartMetrics.getContentProviderOnCreateTimeSpans();
            Intrinsics.checkNotNullExpressionValue(contentProviderOnCreateTimeSpans, "getContentProviderOnCreateTimeSpans(...)");
            for (TimeSpan timeSpan2 : contentProviderOnCreateTimeSpans) {
                Companion companion = SentryFlutterPlugin.Companion;
                Intrinsics.b(timeSpan2);
                companion.addTimeSpanToMap(timeSpan2, linkedHashMap);
            }
            List<ActivityLifecycleTimeSpan> activityLifecycleTimeSpans = appStartMetrics.getActivityLifecycleTimeSpans();
            Intrinsics.checkNotNullExpressionValue(activityLifecycleTimeSpans, "getActivityLifecycleTimeSpans(...)");
            for (ActivityLifecycleTimeSpan activityLifecycleTimeSpan : activityLifecycleTimeSpans) {
                Companion companion2 = SentryFlutterPlugin.Companion;
                TimeSpan onCreate = activityLifecycleTimeSpan.getOnCreate();
                Intrinsics.checkNotNullExpressionValue(onCreate, "getOnCreate(...)");
                companion2.addTimeSpanToMap(onCreate, linkedHashMap);
                TimeSpan onStart = activityLifecycleTimeSpan.getOnStart();
                Intrinsics.checkNotNullExpressionValue(onStart, "getOnStart(...)");
                companion2.addTimeSpanToMap(onStart, linkedHashMap);
            }
            linkedHashMapH.put("nativeSpanTimes", linkedHashMap);
            String string = new JSONObject(linkedHashMapH).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        }

        @Nullable
        public final Context getApplicationContext() {
            return SentryFlutterPlugin.applicationContext;
        }

        @Nullable
        public final Integer getDisplayRefreshRate() {
            Activity activity;
            Window window;
            WindowManager windowManager;
            Activity activity2;
            if (Build.VERSION.SDK_INT >= 30) {
                WeakReference weakReference = SentryFlutterPlugin.activity;
                Display display = (weakReference == null || (activity2 = (Activity) weakReference.get()) == null) ? null : activity2.getDisplay();
                if (display != null) {
                    return Integer.valueOf((int) display.getRefreshRate());
                }
            } else {
                WeakReference weakReference2 = SentryFlutterPlugin.activity;
                Display defaultDisplay = (weakReference2 == null || (activity = (Activity) weakReference2.get()) == null || (window = activity.getWindow()) == null || (windowManager = window.getWindowManager()) == null) ? null : windowManager.getDefaultDisplay();
                if (defaultDisplay != null) {
                    return Integer.valueOf((int) defaultDisplay.getRefreshRate());
                }
            }
            return null;
        }

        @Nullable
        public final byte[] loadContextsAsBytes() {
            SentryOptions options = ScopesAdapter.getInstance().getOptions();
            Intrinsics.checkNotNullExpressionValue(options, "getOptions(...)");
            Context applicationContext = getApplicationContext();
            if ((options instanceof SentryAndroidOptions) && applicationContext != null) {
                Map<String, Object> mapSerializeScope = InternalSentrySdk.serializeScope(applicationContext, (SentryAndroidOptions) options, InternalSentrySdk.getCurrentScope());
                Intrinsics.checkNotNullExpressionValue(mapSerializeScope, "serializeScope(...)");
                try {
                    String string = new JSONObject(mapSerializeScope).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    byte[] bytes = string.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    return bytes;
                } catch (Exception e3) {
                    Log.e("Sentry", "Failed to serialize scope", e3);
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final byte[] loadDebugImagesAsBytes(@org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "addresses"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                io.sentry.ScopesAdapter r0 = io.sentry.ScopesAdapter.getInstance()
                io.sentry.SentryOptions r0 = r0.getOptions()
                java.lang.String r1 = "null cannot be cast to non-null type io.sentry.android.core.SentryAndroidOptions"
                kotlin.jvm.internal.Intrinsics.c(r0, r1)
                io.sentry.android.core.SentryAndroidOptions r0 = (io.sentry.android.core.SentryAndroidOptions) r0
                boolean r1 = r4.isEmpty()
                r2 = 0
                if (r1 == 0) goto L32
                io.sentry.android.core.IDebugImagesLoader r4 = r0.getDebugImagesLoader()
                java.util.List r4 = r4.loadDebugImages()
                if (r4 == 0) goto L2c
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.List r4 = kotlin.collections.CollectionsKt.R(r4)
                goto L2d
            L2c:
                r4 = r2
            L2d:
                java.util.List r4 = r3.serialize(r4)
                goto L5c
            L32:
                io.sentry.android.core.IDebugImagesLoader r1 = r0.getDebugImagesLoader()
                java.util.Set r4 = r1.loadDebugImagesForAddresses(r4)
                if (r4 == 0) goto L57
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r1 = r4.isEmpty()
                if (r1 == 0) goto L4e
                io.sentry.android.core.IDebugImagesLoader r4 = r0.getDebugImagesLoader()
                java.util.List r4 = r4.loadDebugImages()
                java.util.Collection r4 = (java.util.Collection) r4
            L4e:
                if (r4 == 0) goto L57
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.List r4 = kotlin.collections.CollectionsKt.R(r4)
                goto L58
            L57:
                r4 = r2
            L58:
                java.util.List r4 = r3.serialize(r4)
            L5c:
                org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L78
                java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Exception -> L78
                r0.<init>(r4)     // Catch: java.lang.Exception -> L78
                java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> L78
                java.lang.String r0 = "toString(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)     // Catch: java.lang.Exception -> L78
                java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L78
                byte[] r4 = r4.getBytes(r0)     // Catch: java.lang.Exception -> L78
                java.lang.String r0 = "getBytes(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)     // Catch: java.lang.Exception -> L78
                return r4
            L78:
                r4 = move-exception
                java.lang.String r0 = "Sentry"
                java.lang.String r1 = "Failed to serialize debug images"
                android.util.Log.e(r0, r1, r4)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.flutter.SentryFlutterPlugin.Companion.loadDebugImagesAsBytes(java.util.Set):byte[]");
        }

        @Nullable
        public final ReplayIntegration privateSentryGetReplayIntegration() {
            return SentryFlutterPlugin.replay;
        }

        public final void removeContext(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            Sentry.configureScope(new n(key, 2));
        }

        public final void setContext(@NotNull String key, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(key, "key");
            Sentry.configureScope(new y(19, key, obj));
        }

        public final void setupBeforeSend(@NotNull SentryAndroidOptions options) {
            Intrinsics.checkNotNullParameter(options, "options");
            options.setBeforeSend(new ig.a(20));
        }

        public final void setupReplay(@NotNull SentryAndroidOptions options, @Nullable ReplayRecorderCallbacks replayRecorderCallbacks) {
            Intrinsics.checkNotNullParameter(options, "options");
            tearDownReplayIntegration();
            List<Integration> integrations = options.getIntegrations();
            Intrinsics.checkNotNullExpressionValue(integrations, "getIntegrations(...)");
            x.p(integrations, new ch.a(10));
            SentryReplayOptions sessionReplay = options.getSessionReplay();
            Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
            if ((!sessionReplay.isSessionReplayEnabled() && !sessionReplay.isSessionReplayForErrorsEnabled()) || replayRecorderCallbacks == null) {
                options.setReplayController(null);
                return;
            }
            Context context = SentryFlutterPlugin.applicationContext;
            if (context == null) {
                Log.w("Sentry", "setupReplay called before applicationContext initialized");
                return;
            }
            SafeReplayRecorderCallbacks safeReplayRecorderCallbacks = new SafeReplayRecorderCallbacks(replayRecorderCallbacks);
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ICurrentDateProvider currentDateProvider = CurrentDateProvider.getInstance();
            Intrinsics.checkNotNullExpressionValue(currentDateProvider, "getInstance(...)");
            SentryFlutterPlugin.replay = new ReplayIntegration(applicationContext, currentDateProvider, new q0(4, safeReplayRecorderCallbacks), null);
            ReplayIntegration replayIntegration = SentryFlutterPlugin.replay;
            Intrinsics.b(replayIntegration);
            replayIntegration.setBreadcrumbConverter(new SentryFlutterReplayBreadcrumbConverter());
            ReplayIntegration replayIntegration2 = SentryFlutterPlugin.replay;
            Intrinsics.b(replayIntegration2);
            options.addIntegration(replayIntegration2);
            options.setReplayController(SentryFlutterPlugin.replay);
        }

        public final void tearDownReplayIntegration() {
            SafeReplayRecorderCallbacks.Companion.bumpGeneration();
            try {
                ReplayIntegration replayIntegration = SentryFlutterPlugin.replay;
                if (replayIntegration != null) {
                    replayIntegration.close();
                }
            } catch (Exception e3) {
                Log.w("Sentry", "Failed to close existing ReplayIntegration", e3);
            } finally {
                SentryFlutterPlugin.replay = null;
            }
        }

        private Companion() {
        }

        private final Map<String, Object> serialize(DebugImage debugImage) {
            return j0.g(new Pair("image_addr", debugImage.getImageAddr()), new Pair(DebugImage.JsonKeys.IMAGE_SIZE, debugImage.getImageSize()), new Pair(DebugImage.JsonKeys.CODE_FILE, debugImage.getCodeFile()), new Pair("type", debugImage.getType()), new Pair(DebugImage.JsonKeys.DEBUG_ID, debugImage.getDebugId()), new Pair(DebugImage.JsonKeys.CODE_ID, debugImage.getCodeId()), new Pair(DebugImage.JsonKeys.DEBUG_FILE, debugImage.getDebugFile()));
        }
    }

    private final void closeNativeSdk(p pVar) {
        ScopesAdapter.getInstance().close();
        pVar.success("");
    }

    public static final void crash() throws InterruptedException {
        Companion.crash();
    }

    @Nullable
    public static final byte[] fetchNativeAppStartAsBytes() {
        return Companion.fetchNativeAppStartAsBytes();
    }

    @Nullable
    public static final Context getApplicationContext() {
        return Companion.getApplicationContext();
    }

    @Nullable
    public static final Integer getDisplayRefreshRate() {
        return Companion.getDisplayRefreshRate();
    }

    @Nullable
    public static final byte[] loadContextsAsBytes() {
        return Companion.loadContextsAsBytes();
    }

    @Nullable
    public static final byte[] loadDebugImagesAsBytes(@NotNull Set<String> set) {
        return Companion.loadDebugImagesAsBytes(set);
    }

    @Nullable
    public static final ReplayIntegration privateSentryGetReplayIntegration() {
        return Companion.privateSentryGetReplayIntegration();
    }

    public static final void removeContext(@NotNull String str) {
        Companion.removeContext(str);
    }

    public static final void setContext(@NotNull String str, @Nullable Object obj) {
        Companion.setContext(str, obj);
    }

    public static final void setupBeforeSend(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        Companion.setupBeforeSend(sentryAndroidOptions);
    }

    public static final void setupReplay(@NotNull SentryAndroidOptions sentryAndroidOptions, @Nullable ReplayRecorderCallbacks replayRecorderCallbacks) {
        Companion.setupReplay(sentryAndroidOptions, replayRecorderCallbacks);
    }

    @Override // fi.a
    public void onAttachedToActivity(@NotNull fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        activity = new WeakReference<>((w) ((h3) binding).f28250b);
    }

    @Override // ei.b
    public void onAttachedToEngine(@NotNull ei.a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        pluginRegistrationTime = Long.valueOf(System.currentTimeMillis());
        Context context = flutterPluginBinding.f16381a;
        this.context = context;
        if (context == null) {
            Intrinsics.g("context");
            throw null;
        }
        applicationContext = context;
        q qVar = new q(flutterPluginBinding.f16383c, "sentry_flutter");
        this.channel = qVar;
        qVar.b(this);
    }

    @Override // fi.a
    public void onDetachedFromActivity() {
        activity = null;
    }

    @Override // ei.b
    public void onDetachedFromEngine(@NotNull ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        if (this.channel == null) {
            return;
        }
        Companion.tearDownReplayIntegration();
        q qVar = this.channel;
        if (qVar == null) {
            Intrinsics.g(AppsFlyerProperties.CHANNEL);
            throw null;
        }
        qVar.b(null);
        applicationContext = null;
    }

    @Override // ii.o
    public void onMethodCall(@NotNull ii.n call, @NotNull p result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.a(call.f21315a, "closeNativeSdk")) {
            closeNativeSdk(result);
        } else {
            result.a();
        }
    }

    @Override // fi.a
    public void onReattachedToActivityForConfigChanges(@NotNull fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    @Override // fi.a
    public void onDetachedFromActivityForConfigChanges() {
    }
}

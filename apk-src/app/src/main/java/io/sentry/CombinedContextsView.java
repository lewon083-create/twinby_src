package io.sentry;

import io.sentry.protocol.App;
import io.sentry.protocol.Browser;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Device;
import io.sentry.protocol.FeatureFlags;
import io.sentry.protocol.Gpu;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.Response;
import io.sentry.protocol.SentryRuntime;
import io.sentry.protocol.Spring;
import io.sentry.util.HintUtils;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class CombinedContextsView extends Contexts {
    private static final long serialVersionUID = 3585992094653318439L;

    @NotNull
    private final Contexts currentContexts;

    @NotNull
    private final ScopeType defaultScopeType;

    @NotNull
    private final Contexts globalContexts;

    @NotNull
    private final Contexts isolationContexts;

    /* JADX INFO: renamed from: io.sentry.CombinedContextsView$1, reason: invalid class name */
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
        }
    }

    public CombinedContextsView(@NotNull Contexts contexts, @NotNull Contexts contexts2, @NotNull Contexts contexts3, @NotNull ScopeType scopeType) {
        this.globalContexts = contexts;
        this.isolationContexts = contexts2;
        this.currentContexts = contexts3;
        this.defaultScopeType = scopeType;
    }

    @NotNull
    private Contexts getDefaultContexts() {
        int i = AnonymousClass1.$SwitchMap$io$sentry$ScopeType[this.defaultScopeType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.currentContexts : this.globalContexts : this.isolationContexts : this.currentContexts;
    }

    @NotNull
    private Contexts mergeContexts() {
        Contexts contexts = new Contexts();
        contexts.putAll(this.globalContexts);
        contexts.putAll(this.isolationContexts);
        contexts.putAll(this.currentContexts);
        return contexts;
    }

    @Override // io.sentry.protocol.Contexts
    public boolean containsKey(@Nullable Object obj) {
        return this.globalContexts.containsKey(obj) || this.isolationContexts.containsKey(obj) || this.currentContexts.containsKey(obj);
    }

    @Override // io.sentry.protocol.Contexts
    @NotNull
    public Set<Map.Entry<String, Object>> entrySet() {
        return mergeContexts().entrySet();
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public Object get(@Nullable Object obj) {
        Object obj2 = this.currentContexts.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        Object obj3 = this.isolationContexts.get(obj);
        return obj3 != null ? obj3 : this.globalContexts.get(obj);
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public App getApp() {
        App app = this.currentContexts.getApp();
        if (app != null) {
            return app;
        }
        App app2 = this.isolationContexts.getApp();
        return app2 != null ? app2 : this.globalContexts.getApp();
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public Browser getBrowser() {
        Browser browser = this.currentContexts.getBrowser();
        if (browser != null) {
            return browser;
        }
        Browser browser2 = this.isolationContexts.getBrowser();
        return browser2 != null ? browser2 : this.globalContexts.getBrowser();
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public Device getDevice() {
        Device device = this.currentContexts.getDevice();
        if (device != null) {
            return device;
        }
        Device device2 = this.isolationContexts.getDevice();
        return device2 != null ? device2 : this.globalContexts.getDevice();
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public FeatureFlags getFeatureFlags() {
        FeatureFlags featureFlags = this.currentContexts.getFeatureFlags();
        if (featureFlags != null) {
            return featureFlags;
        }
        FeatureFlags featureFlags2 = this.isolationContexts.getFeatureFlags();
        return featureFlags2 != null ? featureFlags2 : this.globalContexts.getFeatureFlags();
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public Gpu getGpu() {
        Gpu gpu = this.currentContexts.getGpu();
        if (gpu != null) {
            return gpu;
        }
        Gpu gpu2 = this.isolationContexts.getGpu();
        return gpu2 != null ? gpu2 : this.globalContexts.getGpu();
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public OperatingSystem getOperatingSystem() {
        OperatingSystem operatingSystem = this.currentContexts.getOperatingSystem();
        if (operatingSystem != null) {
            return operatingSystem;
        }
        OperatingSystem operatingSystem2 = this.isolationContexts.getOperatingSystem();
        return operatingSystem2 != null ? operatingSystem2 : this.globalContexts.getOperatingSystem();
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public Response getResponse() {
        Response response = this.currentContexts.getResponse();
        if (response != null) {
            return response;
        }
        Response response2 = this.isolationContexts.getResponse();
        return response2 != null ? response2 : this.globalContexts.getResponse();
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public SentryRuntime getRuntime() {
        SentryRuntime runtime = this.currentContexts.getRuntime();
        if (runtime != null) {
            return runtime;
        }
        SentryRuntime runtime2 = this.isolationContexts.getRuntime();
        return runtime2 != null ? runtime2 : this.globalContexts.getRuntime();
    }

    @Override // io.sentry.protocol.Contexts
    public int getSize() {
        return size();
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public Spring getSpring() {
        Spring spring = this.currentContexts.getSpring();
        if (spring != null) {
            return spring;
        }
        Spring spring2 = this.isolationContexts.getSpring();
        return spring2 != null ? spring2 : this.globalContexts.getSpring();
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public SpanContext getTrace() {
        SpanContext trace = this.currentContexts.getTrace();
        if (trace != null) {
            return trace;
        }
        SpanContext trace2 = this.isolationContexts.getTrace();
        return trace2 != null ? trace2 : this.globalContexts.getTrace();
    }

    @Override // io.sentry.protocol.Contexts
    public boolean isEmpty() {
        return this.globalContexts.isEmpty() && this.isolationContexts.isEmpty() && this.currentContexts.isEmpty();
    }

    @Override // io.sentry.protocol.Contexts
    @NotNull
    public Enumeration<String> keys() {
        return mergeContexts().keys();
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public Object put(@Nullable String str, @Nullable Object obj) {
        return getDefaultContexts().put(str, obj);
    }

    @Override // io.sentry.protocol.Contexts
    public void putAll(@Nullable Map<? extends String, ?> map) {
        getDefaultContexts().putAll((Map<? extends String, ? extends Object>) map);
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public Object remove(@Nullable Object obj) {
        return getDefaultContexts().remove(obj);
    }

    @Override // io.sentry.protocol.Contexts, io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        mergeContexts().serialize(objectWriter, iLogger);
    }

    @Override // io.sentry.protocol.Contexts
    @Nullable
    public Object set(@Nullable String str, @Nullable Object obj) {
        return put(str, obj);
    }

    @Override // io.sentry.protocol.Contexts
    public void setApp(@NotNull App app) {
        getDefaultContexts().setApp(app);
    }

    @Override // io.sentry.protocol.Contexts
    public void setBrowser(@NotNull Browser browser) {
        getDefaultContexts().setBrowser(browser);
    }

    @Override // io.sentry.protocol.Contexts
    public void setDevice(@NotNull Device device) {
        getDefaultContexts().setDevice(device);
    }

    @Override // io.sentry.protocol.Contexts
    public void setFeatureFlags(@NotNull FeatureFlags featureFlags) {
        getDefaultContexts().setFeatureFlags(featureFlags);
    }

    @Override // io.sentry.protocol.Contexts
    public void setGpu(@NotNull Gpu gpu) {
        getDefaultContexts().setGpu(gpu);
    }

    @Override // io.sentry.protocol.Contexts
    public void setOperatingSystem(@NotNull OperatingSystem operatingSystem) {
        getDefaultContexts().setOperatingSystem(operatingSystem);
    }

    @Override // io.sentry.protocol.Contexts
    public void setResponse(@NotNull Response response) {
        getDefaultContexts().setResponse(response);
    }

    @Override // io.sentry.protocol.Contexts
    public void setRuntime(@NotNull SentryRuntime sentryRuntime) {
        getDefaultContexts().setRuntime(sentryRuntime);
    }

    @Override // io.sentry.protocol.Contexts
    public void setSpring(@NotNull Spring spring) {
        getDefaultContexts().setSpring(spring);
    }

    @Override // io.sentry.protocol.Contexts
    public void setTrace(@NotNull SpanContext spanContext) {
        getDefaultContexts().setTrace(spanContext);
    }

    @Override // io.sentry.protocol.Contexts
    public int size() {
        return mergeContexts().size();
    }

    @Override // io.sentry.protocol.Contexts
    public void withResponse(HintUtils.SentryConsumer<Response> sentryConsumer) {
        if (this.currentContexts.getResponse() != null) {
            this.currentContexts.withResponse(sentryConsumer);
            return;
        }
        if (this.isolationContexts.getResponse() != null) {
            this.isolationContexts.withResponse(sentryConsumer);
        } else if (this.globalContexts.getResponse() != null) {
            this.globalContexts.withResponse(sentryConsumer);
        } else {
            getDefaultContexts().withResponse(sentryConsumer);
        }
    }

    @Override // io.sentry.protocol.Contexts
    public void putAll(@Nullable Contexts contexts) {
        getDefaultContexts().putAll(contexts);
    }
}

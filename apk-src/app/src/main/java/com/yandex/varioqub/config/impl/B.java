package com.yandex.varioqub.config.impl;

import a0.d1;
import android.content.Context;
import android.content.res.XmlResourceParser;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.VarioqubApi;
import com.yandex.varioqub.config.VarioqubSettings;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class B implements VarioqubApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0001a f15347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0003c f15348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f15349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Executor f15350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f15351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VarioqubSettings f15352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f15353g = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0257  */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [int] */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.yandex.varioqub.config.impl.B r16, com.yandex.varioqub.config.OnFetchCompleteListener r17) {
        /*
            Method dump skipped, instruction units count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.varioqub.config.impl.B.a(com.yandex.varioqub.config.impl.B, com.yandex.varioqub.config.OnFetchCompleteListener):void");
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void activateConfig(Function0 function0) throws JSONException {
        a();
        C0003c c0003c = this.f15348b;
        if (c0003c == null) {
            Intrinsics.g("configFetcher");
            throw null;
        }
        c0003c.a();
        C0001a c0001a = c0003c.f15365d;
        String str = c0003c.f15371k;
        long j10 = c0003c.f15368g;
        if (!Intrinsics.a(c0001a.f15360e, str) && c0001a.f15357b.getActivateEvent$config_release()) {
            c0001a.f15356a.reportConfigChanged(new ConfigData(c0001a.f15360e, str, j10));
            m.a(str);
        }
        c0001a.f15360e = str;
        if (c0003c.f15373m) {
            C0001a c0001a2 = c0003c.f15365d;
            Collection collectionValues = c0003c.f15369h.values();
            c0001a2.getClass();
            ArrayList arrayList = new ArrayList(kotlin.collections.t.j(collectionValues, 10));
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((ConfigValue) it.next()).getTestId()));
            }
            LinkedHashSet linkedHashSetU = CollectionsKt.U(CollectionsKt.G(CollectionsKt.V(arrayList), c0001a2.f15358c));
            c0001a2.f15358c = linkedHashSetU;
            c0001a2.f15356a.setTriggeredTestIds(linkedHashSetU);
            m.a(c0001a2.f15358c);
            C0001a c0001a3 = c0003c.f15365d;
            String str2 = c0003c.f15370j;
            c0001a3.f15359d = str2;
            c0001a3.f15356a.setExperiments(str2);
            c0003c.f15373m = false;
        }
        t tVar = c0003c.f15364c;
        HashMap map = new HashMap(c0003c.f15369h);
        tVar.a();
        tVar.f15421b = map;
        m.a(map);
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void clearClientFeatures() {
        Executor executor = this.f15350d;
        if (executor != null) {
            executor.execute(new d1(25, this));
        } else {
            Intrinsics.g("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void fetchConfig(OnFetchCompleteListener onFetchCompleteListener) {
        a();
        Executor executor = this.f15350d;
        if (executor != null) {
            executor.execute(new e1.y(24, this, onFetchCompleteListener));
        } else {
            Intrinsics.g("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final Set getAllKeys() throws JSONException {
        a();
        t tVar = this.f15349c;
        if (tVar == null) {
            Intrinsics.g("storage");
            throw null;
        }
        tVar.a();
        Set setKeySet = tVar.f15421b.keySet();
        Set other = tVar.f15420a.keySet();
        Intrinsics.checkNotNullParameter(setKeySet, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        LinkedHashSet linkedHashSetU = CollectionsKt.U(setKeySet);
        kotlin.collections.x.m(linkedHashSetU, other);
        return CollectionsKt.V(linkedHashSetU);
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final boolean getBoolean(String str, boolean z5) throws JSONException {
        ConfigValue value = getValue(str);
        return value != null ? value.asBoolean() : z5;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final double getDouble(String str, double d10) throws JSONException {
        ConfigValue value = getValue(str);
        return value != null ? value.asDouble() : d10;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final String getId() throws JSONException {
        a();
        C0003c c0003c = this.f15348b;
        if (c0003c != null) {
            c0003c.a();
            return c0003c.i;
        }
        Intrinsics.g("configFetcher");
        throw null;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final long getLong(String str, long j10) throws JSONException {
        ConfigValue value = getValue(str);
        return value != null ? value.asLong() : j10;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final String getString(String str, String str2) throws JSONException {
        String strAsString;
        ConfigValue value = getValue(str);
        return (value == null || (strAsString = value.asString()) == null) ? str2 : strAsString;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final ConfigValue getValue(String str) throws JSONException {
        a();
        t tVar = this.f15349c;
        if (tVar == null) {
            Intrinsics.g("storage");
            throw null;
        }
        tVar.a();
        ConfigValue configValue = (ConfigValue) tVar.f15421b.get(str);
        if (configValue == null) {
            tVar.a();
            configValue = (ConfigValue) tVar.f15420a.get(str);
        }
        if (configValue != null && configValue.getTestId() > 0) {
            C0001a c0001a = this.f15347a;
            if (c0001a == null) {
                Intrinsics.g("analyticAdapter");
                throw null;
            }
            long testId = configValue.getTestId();
            synchronized (c0001a.f15361f) {
                c0001a.f15358c.add(Long.valueOf(testId));
            }
            c0001a.f15356a.setTriggeredTestIds(c0001a.f15358c);
            m.a(c0001a.f15358c);
            if (configValue.getValue() == null) {
                t tVar2 = this.f15349c;
                if (tVar2 != null) {
                    tVar2.a();
                    return (ConfigValue) tVar2.f15420a.get(str);
                }
                Intrinsics.g("storage");
                throw null;
            }
        }
        return configValue;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void init(VarioqubSettings varioqubSettings, VarioqubConfigAdapter varioqubConfigAdapter, Context context) throws Throwable {
        if (this.f15353g.get()) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f15353g.get()) {
                    l.b(2);
                    C0001a c0001a = new C0001a(varioqubConfigAdapter, varioqubSettings);
                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    t tVar = new t();
                    try {
                        a(varioqubSettings, c0001a, executorServiceNewSingleThreadExecutor, context, tVar, new C0003c(new i(), TimeUnit.SECONDS.toMillis(varioqubSettings.getFetchThrottleIntervalSec$config_release()), tVar, c0001a, new u()), new g(c0001a));
                        l.a(2);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void putClientFeature(String str, String str2) {
        Executor executor = this.f15350d;
        if (executor != null) {
            executor.execute(new a1.c(this, str, str2, 17));
        } else {
            Intrinsics.g("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void setDefaults(Map map) {
        a();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(entry.getKey(), ConfigValue.Companion.createInappDefault$config_release(entry.getValue().toString()));
        }
        t tVar = this.f15349c;
        if (tVar == null) {
            Intrinsics.g("storage");
            throw null;
        }
        tVar.f15420a = map2;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void setDefaults(int i, Function0 function0) {
        a();
        Executor executor = this.f15350d;
        if (executor != null) {
            executor.execute(new d.l(this, i, function0, 2));
        } else {
            Intrinsics.g("executor");
            throw null;
        }
    }

    public static final void a(B b2, int i, Function0 function0) {
        t tVar = b2.f15349c;
        if (tVar == null) {
            Intrinsics.g("storage");
            throw null;
        }
        if (i != -1) {
            Context context = AbstractC0004d.f15374a;
            if (context != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (context.getResources() != null) {
                    XmlResourceParser xml = context.getResources().getXml(i);
                    String text = "";
                    String name = text;
                    String text2 = name;
                    while (xml.next() != 1) {
                        int eventType = xml.getEventType();
                        if (eventType == 2) {
                            name = xml.getName();
                        } else if (eventType == 3) {
                            if (Intrinsics.a(xml.getName(), "entry") && text.length() > 0 && text2.length() > 0) {
                                linkedHashMap.put(text, ConfigValue.Companion.createInappDefault$config_release(text2));
                            }
                            name = "";
                        } else if (eventType == 4) {
                            if (Intrinsics.a(name, "key")) {
                                text = xml.getText();
                            } else if (Intrinsics.a(name, "value")) {
                                text2 = xml.getText();
                            }
                        }
                    }
                }
                tVar.f15420a = linkedHashMap;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            Intrinsics.g("appContext");
            throw null;
        }
        throw new IllegalArgumentException(l7.o.i(i, "Invalid resId: "));
    }

    public static final void a(B b2, String str, String str2) {
        VarioqubSettings varioqubSettings = b2.f15352f;
        if (varioqubSettings != null) {
            varioqubSettings.putClientFeature$config_release(str, str2);
        } else {
            Intrinsics.g("settings");
            throw null;
        }
    }

    public static final void a(B b2) {
        VarioqubSettings varioqubSettings = b2.f15352f;
        if (varioqubSettings != null) {
            varioqubSettings.clearClientFeatures$config_release();
        } else {
            Intrinsics.g("settings");
            throw null;
        }
    }

    public final void a() {
        if (!this.f15353g.get()) {
            throw new IllegalStateException("VarioqubConfig is not inited. Please call init() method first");
        }
    }

    public final void a(VarioqubSettings varioqubSettings, C0001a c0001a, ExecutorService executorService, Context context, t tVar, C0003c c0003c, g gVar) {
        this.f15352f = varioqubSettings;
        this.f15347a = c0001a;
        this.f15349c = tVar;
        this.f15348b = c0003c;
        this.f15350d = executorService;
        this.f15351e = gVar;
        AbstractC0004d.f15374a = context.getApplicationContext();
        D.f15355a = varioqubSettings.getUrl$config_release();
        C.f15354a = varioqubSettings.getLogs$config_release();
        String string = m.a().getString("experiments", "");
        if (string == null) {
            string = "";
        }
        c0001a.f15359d = string;
        c0001a.f15358c = m.b();
        String string2 = m.a().getString("config_version", "");
        c0001a.f15360e = string2 != null ? string2 : "";
        c0001a.f15356a.setExperiments(c0001a.f15359d);
        c0001a.f15356a.setTriggeredTestIds(c0001a.f15358c);
        this.f15353g.set(true);
        executorService.execute(new d1(24, gVar));
    }

    public static final void a(g gVar) {
        gVar.getClass();
        l.b(3);
        C0001a c0001a = gVar.f15377a;
        c0001a.f15356a.requestDeviceId(new e(gVar));
        C0001a c0001a2 = gVar.f15377a;
        c0001a2.f15356a.requestUserId(new f(gVar));
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J2 implements Ea {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashSet f22477n = new HashSet(Arrays.asList(1, 13));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final H2 f22478o = new H2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f22479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Eh f22480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected final PublicLogger f22481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    protected final Qn f22482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    protected final Dg f22483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    protected final C0577w6 f22484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0093d0 f22485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final C0564vi f22486h;
    public C0408pb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bf f22487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N9 f22488k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Je f22489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0141en f22490m;

    public J2(Context context, C0564vi c0564vi, Eh eh2, N9 n92, C0477s6 c0477s6, Qn qn, Dg dg, C0577w6 c0577w6, C0093d0 c0093d0, Je je2) {
        Context applicationContext = context.getApplicationContext();
        this.f22479a = applicationContext;
        this.f22486h = c0564vi;
        this.f22480b = eh2;
        this.f22488k = n92;
        this.f22482d = qn;
        this.f22483e = dg;
        this.f22484f = c0577w6;
        this.f22485g = c0093d0;
        this.f22489l = je2;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(eh2.b().getApiKey());
        this.f22481c = orCreatePublicLogger;
        if (Z2.a(eh2.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f22487j = c0477s6;
        this.f22490m = new C0141en(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f22481c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f22481c.info("Put error environment pair <%s, %s>", str, str2);
        Eh eh2 = this.f22480b;
        synchronized (eh2) {
            E8 e82 = eh2.f22293c;
            e82.f22285b.b(e82.f22284a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (ko.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f22481c.info("Clear app environment", new Object[0]);
        C0564vi c0564vi = this.f22486h;
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        Q5 q5N = N3.n();
        Af af2 = new Af(eh2.f22438a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(eh2.f22439b);
        E8 e82 = eh2.f22293c;
        synchronized (eh2) {
            str = eh2.f22296f;
        }
        c0564vi.a(new C0538uh(q5N, false, 1, null, new Eh(af2, counterConfiguration, e82, str)));
    }

    public final void d(String str) {
        if (this.f22480b.f()) {
            return;
        }
        this.f22486h.f24914d.c();
        C0408pb c0408pb = this.i;
        c0408pb.f24572a.removeCallbacks(c0408pb.f24574c, c0408pb.f24573b.f22480b.f22439b.getApiKey());
        this.f22480b.f22295e = true;
        C0564vi c0564vi = this.f22486h;
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3("", str, 3, 0, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
    }

    public final void e(String str) {
        this.f22486h.f24914d.b();
        C0408pb c0408pb = this.i;
        C0408pb.a(c0408pb.f24572a, c0408pb.f24573b, c0408pb.f24574c);
        C0564vi c0564vi = this.f22486h;
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3("", str, 6400, 0, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
        this.f22480b.f22295e = false;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        C0412pf c0412pf;
        C0564vi c0564vi = this.f22486h;
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        C0511tf c0511tf = eh2.f22294d;
        synchronized (eh2) {
            str = eh2.f22296f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(eh2.f22439b.getApiKey());
        Set set = AbstractC0605x9.f25010a;
        JSONObject jSONObject = new JSONObject();
        if (c0511tf != null && (c0412pf = c0511tf.f24787a) != null) {
            try {
                jSONObject.put("preloadInfo", c0412pf.c());
            } catch (Throwable unused) {
            }
        }
        String string = jSONObject.toString();
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(string, "", 6144, 0, orCreatePublicLogger);
        n32.c(str);
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f22481c.info("Pause session", new Object[0]);
        d(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f22481c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f22481c.info("Put app environment: <%s, %s>", str, str2);
        C0564vi c0564vi = this.f22486h;
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        Q5 q5B = N3.b(str, str2);
        Af af2 = new Af(eh2.f22438a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(eh2.f22439b);
        E8 e82 = eh2.f22293c;
        synchronized (eh2) {
            str3 = eh2.f22296f;
        }
        c0564vi.a(new C0538uh(q5B, false, 1, null, new Eh(af2, counterConfiguration, e82, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArrB;
        C0118e0 c0118e0 = new C0118e0(new C0144f0(this, map));
        C0332ma c0332ma = new C0332ma();
        C0477s6 c0477s6 = C0071c4.l().f23535a;
        Thread threadA = c0118e0.a();
        Map mapC = null;
        try {
            stackTraceElementArrB = c0118e0.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        C0569vn c0569vn = (C0569vn) c0332ma.apply(threadA, stackTraceElementArrB);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new An());
        try {
            mapC = c0118e0.c();
        } catch (SecurityException unused3) {
        }
        if (mapC != null) {
            treeMap.putAll(mapC);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != threadA && thread != null) {
                arrayList.add((C0569vn) c0332ma.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new V(c0569vn, arrayList, c0477s6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        String str;
        this.f22481c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        C0564vi c0564vi = this.f22486h;
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        for (Ci ci2 : eCommerceEvent.toProto()) {
            N3 n32 = new N3(LoggerStorage.getOrCreatePublicLogger(eh2.f22439b.getApiKey()));
            EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
            n32.f22863d = 41000;
            n32.f22861b = n32.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) ci2.f22216a)));
            n32.f22866g = ci2.f22217b.getBytesTruncated();
            Af af2 = new Af(eh2.f22438a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(eh2.f22439b);
            E8 e82 = eh2.f22293c;
            synchronized (eh2) {
                str = eh2.f22296f;
            }
            c0564vi.a(new C0538uh(n32, false, 1, null, new Eh(af2, counterConfiguration, e82, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, Throwable th2) {
        Cg cg = new Cg(str, a(th2));
        C0564vi c0564vi = this.f22486h;
        byte[] byteArray = MessageNano.toByteArray(this.f22483e.fromModel(cg));
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(byteArray, str, 5892, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
        this.f22481c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f22481c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        C0564vi c0564vi = this.f22486h;
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3("", str, 1, 0, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        String str;
        Mi mi = I2.f22437a;
        mi.getClass();
        po poVarA = mi.a(revenue);
        if (!poVarA.f24595a) {
            this.f22481c.warning("Passed revenue is not valid. Reason: " + poVarA.f24596b, new Object[0]);
            return;
        }
        C0564vi c0564vi = this.f22486h;
        Ni ni2 = new Ni(revenue, this.f22481c);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        N3 n3A = N3.a(LoggerStorage.getOrCreatePublicLogger(eh2.f22439b.getApiKey()), ni2);
        Af af2 = new Af(eh2.f22438a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(eh2.f22439b);
        E8 e82 = eh2.f22293c;
        synchronized (eh2) {
            str = eh2.f22296f;
        }
        c0564vi.a(new C0538uh(n3A, false, 1, null, new Eh(af2, counterConfiguration, e82, str)));
        this.f22481c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th2) {
        Pn pnA = Sn.a(th2, new V(null, null, this.f22487j.a()), null, (String) this.f22488k.f22728b.a(), (Boolean) this.f22488k.f22729c.a());
        C0564vi c0564vi = this.f22486h;
        c0564vi.a(c0564vi.a(pnA, this.f22480b));
        this.f22481c.info("Unhandled exception received: " + pnA, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        String str;
        C0091co c0091co = new C0091co(C0091co.f23642c);
        Iterator<UserProfileUpdate<? extends Cdo>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            Cdo userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            userProfileUpdatePatcher.a(this.f22481c);
            userProfileUpdatePatcher.a(c0091co);
        }
        C0220ho c0220ho = new C0220ho();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c0091co.f23643a.size(); i++) {
            SparseArray sparseArray = c0091co.f23643a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C0142eo) it2.next());
            }
        }
        c0220ho.f24029a = (C0142eo[]) arrayList.toArray(new C0142eo[arrayList.size()]);
        po poVarA = f22478o.a(c0220ho);
        if (!poVarA.f24595a) {
            this.f22481c.warning("UserInfo wasn't sent because " + poVarA.f24596b, new Object[0]);
            return;
        }
        C0564vi c0564vi = this.f22486h;
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        Q5 q5A = N3.a(c0220ho);
        Af af2 = new Af(eh2.f22438a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(eh2.f22439b);
        E8 e82 = eh2.f22293c;
        synchronized (eh2) {
            str = eh2.f22296f;
        }
        c0564vi.a(new C0538uh(q5A, false, 1, null, new Eh(af2, counterConfiguration, e82, str)));
        this.f22481c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        e(null);
        this.f22481c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f22481c.info("Send event buffer", new Object[0]);
        C0564vi c0564vi = this.f22486h;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        N3 n32 = new N3("", "", 256, 0, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z5) {
        this.f22480b.f22439b.setDataSendingEnabled(z5);
        this.f22481c.info("Updated data sending enabled: %s", Boolean.valueOf(z5));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, byte[] bArr) {
        C0564vi c0564vi = this.f22486h;
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        n32.f22874p = Collections.singletonMap(str, bArr);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        C0564vi c0564vi = this.f22486h;
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        N3 n32 = new N3(LoggerStorage.getOrCreatePublicLogger(eh2.f22439b.getApiKey()));
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        n32.f22863d = 40962;
        n32.c(str);
        n32.f22861b = n32.e(str);
        Af af2 = new Af(eh2.f22438a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(eh2.f22439b);
        E8 e82 = eh2.f22293c;
        synchronized (eh2) {
            str2 = eh2.f22296f;
        }
        c0564vi.a(new C0538uh(n32, false, 1, null, new Eh(af2, counterConfiguration, e82, str2)));
        this.f22481c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z5) {
        String str;
        C0564vi c0564vi = this.f22486h;
        E e3 = new E(adRevenue, z5, this.f22490m, this.f22481c);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        N3 n3A = N3.a(LoggerStorage.getOrCreatePublicLogger(eh2.f22439b.getApiKey()), e3);
        Af af2 = new Af(eh2.f22438a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(eh2.f22439b);
        E8 e82 = eh2.f22293c;
        synchronized (eh2) {
            str = eh2.f22296f;
        }
        c0564vi.a(new C0538uh(n3A, false, 1, null, new Eh(af2, counterConfiguration, e82, str)));
        this.f22481c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC0207hb.b(adRevenue.payload) + ", autoCollected=" + z5 + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final void b(@NonNull String str, String str2) {
        this.f22481c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C0564vi c0564vi = this.f22486h;
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(str2, str, 1, 0, publicLogger);
        n32.f22870l = EnumC0356n9.JS;
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (ko.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.f22481c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C0564vi c0564vi = this.f22486h;
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(str2, str, 1, 0, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
    }

    public final Pn a(Throwable th2) {
        Throwable th3;
        StackTraceElement[] stackTrace;
        if (th2 == null) {
            stackTrace = null;
            th3 = null;
        } else if (th2 instanceof O1) {
            stackTrace = th2.getStackTrace();
            th3 = null;
        } else {
            th3 = th2;
            stackTrace = null;
        }
        return Sn.a(th3, new V(null, null, this.f22487j.a()), stackTrace != null ? Arrays.asList(stackTrace) : null, (String) this.f22488k.f22728b.a(), (Boolean) this.f22488k.f22729c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2, Throwable th2) {
        C0552v6 c0552v6 = new C0552v6(new Cg(str2, a(th2)), str);
        C0564vi c0564vi = this.f22486h;
        byte[] byteArray = MessageNano.toByteArray(this.f22484f.fromModel(c0552v6));
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(byteArray, str2, 5896, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
        this.f22481c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        Pn pnA = this.f22489l.a(pluginErrorDetails);
        C0564vi c0564vi = this.f22486h;
        Fn fn = pnA.f22840a;
        String str = fn != null ? (String) WrapUtils.getOrDefault(fn.f22353a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f22482d.fromModel(pnA));
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(byteArray, str, 5891, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
        this.f22481c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final void b(@NonNull String str) {
        C0564vi c0564vi = this.f22486h;
        Q5 q5A = Q5.a(str);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(q5A, eh2), eh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final boolean b() {
        return this.f22480b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, Map<String, Object> map) {
        C0564vi c0564vi = this.f22486h;
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        c0564vi.a(new N3("", str, 1, 0, publicLogger), this.f22480b, 1, map);
        PublicLogger publicLogger2 = this.f22481c;
        StringBuilder sb2 = new StringBuilder("Event received: ");
        sb2.append(WrapUtils.wrapToTag(str));
        sb2.append(". With value: ");
        sb2.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb2.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.Va
    public final void a(@NonNull Pn pn) {
        C0564vi c0564vi = this.f22486h;
        C0538uh c0538uhA = c0564vi.a(pn, this.f22480b);
        Eh eh2 = c0538uhA.f24851e;
        Ol ol2 = c0564vi.f24915e;
        if (ol2 != null) {
            eh2.f22439b.setUuid(((Nl) ol2).g());
        } else {
            eh2.getClass();
        }
        c0564vi.f24913c.b(c0538uhA);
        this.f22481c.info("Unhandled exception received: " + pn, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, String str) {
        Pn pnA;
        Je je2 = this.f22489l;
        if (pluginErrorDetails != null) {
            pnA = je2.a(pluginErrorDetails);
        } else {
            je2.getClass();
            pnA = null;
        }
        Cg cg = new Cg(str, pnA);
        C0564vi c0564vi = this.f22486h;
        byte[] byteArray = MessageNano.toByteArray(this.f22483e.fromModel(cg));
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(byteArray, str, 5896, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
        this.f22481c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.InterfaceC0170g0
    public final void a(@NonNull V v5) {
        C0067c0 c0067c0 = new C0067c0(v5, (String) this.f22488k.f22728b.a(), (Boolean) this.f22488k.f22729c.a());
        C0564vi c0564vi = this.f22486h;
        byte[] byteArray = MessageNano.toByteArray(this.f22485g.fromModel(c0067c0));
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(byteArray, "", 5968, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        String str = null;
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
        PublicLogger publicLogger2 = this.f22481c;
        StringBuilder sb2 = new StringBuilder("ANR was reported ");
        C0569vn c0569vn = v5.f23109a;
        if (c0569vn != null) {
            str = "Thread[name=" + c0569vn.f24944a + ",tid={" + c0569vn.f24946c + ", priority=" + c0569vn.f24945b + ", group=" + c0569vn.f24947d + "}] at " + CollectionsKt.I(c0569vn.f24949f, "\n", null, null, null, 62);
        }
        sb2.append(str);
        publicLogger2.info(sb2.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        EnumC0356n9 enumC0356n9;
        if (f22477n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i = F8.f22326a[moduleEvent.getCategory().ordinal()];
        if (i == 1) {
            enumC0356n9 = EnumC0356n9.NATIVE;
        } else if (i == 2) {
            enumC0356n9 = EnumC0356n9.SYSTEM;
        } else {
            throw new ij.j();
        }
        n32.f22870l = enumC0356n9;
        n32.f22862c = AbstractC0207hb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            n32.f22874p = moduleEvent.getExtras();
        }
        this.f22486h.a(n32, this.f22480b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Pn pnA;
        Je je2 = this.f22489l;
        if (pluginErrorDetails != null) {
            pnA = je2.a(pluginErrorDetails);
        } else {
            je2.getClass();
            pnA = null;
        }
        C0552v6 c0552v6 = new C0552v6(new Cg(str2, pnA), str);
        C0564vi c0564vi = this.f22486h;
        byte[] byteArray = MessageNano.toByteArray(this.f22484f.fromModel(c0552v6));
        PublicLogger publicLogger = this.f22481c;
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(byteArray, str2, 5896, publicLogger);
        Eh eh2 = this.f22480b;
        c0564vi.getClass();
        c0564vi.a(C0564vi.a(n32, eh2), eh2, 1, (Map) null);
        this.f22481c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }
}

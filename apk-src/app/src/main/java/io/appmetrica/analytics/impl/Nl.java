package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Nl implements Ol {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map f22750k = Collections.unmodifiableMap(new Kl());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0564vi f22752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Vl f22753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f22754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PublicLogger f22755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ll f22756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f22757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakHashMap f22758h;
    public HashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22759j;

    public Nl(@NonNull Context context, C0564vi c0564vi, Ue ue, @NonNull Handler handler) {
        this(c0564vi, new Vl(context, ue), handler);
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list, Map<String, String> map) {
        synchronized (this.f22757g) {
            try {
                Vl vl2 = this.f22753c;
                vl2.getClass();
                if (!ko.a((Map) map) && !ko.a(map, vl2.f23167e)) {
                    vl2.f23167e = new HashMap(map);
                    vl2.f23169g = true;
                    vl2.c();
                }
                a(startupParamsCallback, list);
                if (this.f22753c.a((List) list)) {
                    a(list, new Ml(this, startupParamsCallback), map, true);
                } else {
                    a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:12:0x0085, B:14:0x00b4, B:15:0x00bb, B:17:0x00c1, B:18:0x00c8, B:20:0x00dd, B:23:0x00e8, B:24:0x00f4, B:21:0x00e2, B:11:0x0082), top: B:30:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Nl.b(android.os.Bundle):void");
    }

    @NonNull
    public final B6 c() {
        return this.f22756f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f22753c.f23164b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f25138id;
    }

    @NonNull
    public final Y9 e() {
        W9 w92;
        Vl vl2 = this.f22753c;
        T9 t92 = vl2.f23175n;
        U9 u92 = vl2.f23174m;
        synchronized (u92) {
            w92 = u92.f23072b;
        }
        t92.getClass();
        Boolean bool = w92.f23212a;
        return new Y9();
    }

    public final long f() {
        return this.f22753c.f23168f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f22753c.f23164b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f25138id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f22758h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f22753c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.f22757g) {
            try {
                if (!this.f22759j || this.f22753c.b()) {
                    this.f22759j = true;
                    a(this.f22751a, this.f22756f, this.i, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Nl(C0564vi c0564vi, Vl vl2, Handler handler) {
        this.f22751a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f22757g = new Object();
        this.f22758h = new WeakHashMap();
        this.f22759j = false;
        this.f22752b = c0564vi;
        this.f22753c = vl2;
        this.f22754d = handler;
        this.f22756f = new Ll(this);
    }

    public final void a(@NonNull Bundle bundle) {
        b(bundle, null);
    }

    public final void a(@NonNull PublicLogger publicLogger) {
        this.f22755e = publicLogger;
    }

    public final void a(List list, B6 b62, Map map, boolean z5) {
        C6 c62 = new C6(this.f22754d, b62);
        C0564vi c0564vi = this.f22752b;
        c0564vi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new Ya(c62, list, map, z5));
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC0605x9.f25010a;
        N3 n32 = new N3("", "", 1536, 0, anonymousInstance);
        n32.f22871m = bundle;
        G4 g42 = c0564vi.f24911a;
        c0564vi.a(C0564vi.a(n32, g42), g42, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (ko.a((Map) map)) {
            return;
        }
        synchronized (this.f22757g) {
            try {
                HashMap mapB = Em.b(map);
                this.i = mapB;
                this.f22752b.a(mapB);
                Vl vl2 = this.f22753c;
                vl2.getClass();
                if (!ko.a((Map) mapB) && !ko.a(mapB, vl2.f23167e)) {
                    vl2.f23167e = new HashMap(mapB);
                    vl2.f23169g = true;
                    vl2.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(String str) {
        synchronized (this.f22757g) {
            this.f22752b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Il il2;
        if (this.f22758h.containsKey(startupParamsCallback)) {
            List list = (List) this.f22758h.get(startupParamsCallback);
            if (this.f22753c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i = bundle.getInt("startup_error_key_code");
                    il2 = Il.UNKNOWN;
                    if (i == 1) {
                        il2 = Il.NETWORK;
                    } else if (i == 2) {
                        il2 = Il.PARSE;
                    }
                } else {
                    il2 = null;
                }
                if (il2 == null) {
                    if (!this.f22753c.a()) {
                        PublicLogger publicLogger = this.f22755e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        il2 = Il.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f22750k, il2, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f22758h.remove(startupParamsCallback);
            if (this.f22758h.isEmpty()) {
                C0397p0 c0397p0 = this.f22752b.f24914d;
                synchronized (c0397p0.f24540f) {
                    c0397p0.f24537c = false;
                    c0397p0.c();
                }
            }
        }
    }

    public final void b(@NonNull Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.f22757g) {
            try {
                b(bundle);
                h();
                if (startupParamsCallback != null) {
                    a(bundle, startupParamsCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(List<String> list) {
        synchronized (this.f22757g) {
            try {
                List list2 = this.f22753c.f23166d;
                if (ko.a((Collection) list)) {
                    if (!ko.a((Collection) list2)) {
                        Vl vl2 = this.f22753c;
                        vl2.f23166d = null;
                        vl2.i.a((List<String>) null);
                        this.f22752b.a((List) null);
                    }
                } else if (!ko.a(list, list2)) {
                    Vl vl3 = this.f22753c;
                    vl3.f23166d = list;
                    vl3.i.a(list);
                    this.f22752b.a(list);
                } else {
                    this.f22752b.a(list2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap map = new HashMap();
        Vl vl2 = this.f22753c;
        synchronized (vl2) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) vl2.f23164b.get(str);
                    if (identifiersResult != null) {
                        map.put(str, vl2.f23165c.a(identifiersResult));
                    }
                }
                vl2.f23173l.a(list, map);
                vl2.f23174m.a(list, map);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new StartupParamsCallback.Result(map);
    }

    public final void b(String str) {
        synchronized (this.f22757g) {
            this.f22752b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f22753c.f23164b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.f25138id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC0207hb.a(str);
        }
        return this.i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f22758h.isEmpty()) {
            C0397p0 c0397p0 = this.f22752b.f24914d;
            synchronized (c0397p0.f24540f) {
                c0397p0.f24537c = true;
                c0397p0.b();
            }
        }
        this.f22758h.put(startupParamsCallback, list);
    }

    @NonNull
    public final AdvIdentifiersResult a() {
        Vl vl2 = this.f22753c;
        P p6 = vl2.f23171j;
        IdentifiersResult identifiersResult = (IdentifiersResult) vl2.f23164b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) vl2.f23164b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) vl2.f23164b.get("appmetrica_yandex_adv_id");
        p6.getClass();
        return new AdvIdentifiersResult(P.a(identifiersResult), P.a(identifiersResult2), P.a(identifiersResult3));
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Vl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f23163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f23164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sl f23165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f23167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23170h;
    public final Ue i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final P f23171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D3 f23172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0627y6 f23173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final U9 f23174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final T9 f23175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final oo f23176o;

    public Vl(Context context, Ue ue) {
        this(ue, new P(), new D3(), C0071c4.l().a(context), new C0627y6(), new U9(), new T9(), new oo());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set r0 = io.appmetrica.analytics.impl.AbstractC0063bm.f23522a     // Catch: java.lang.Throwable -> L27
            java.util.LinkedHashSet r0 = kotlin.collections.CollectionsKt.G(r9, r0)     // Catch: java.lang.Throwable -> L27
            boolean r0 = r8.a(r0)     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L27
        Lf:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L29
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L27
            java.util.HashSet r4 = r8.f23163a     // Catch: java.lang.Throwable -> L27
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto Lf
            r9 = r3
            goto L2a
        L27:
            r9 = move-exception
            goto L46
        L29:
            r9 = r2
        L2a:
            long r4 = r8.f23170h     // Catch: java.lang.Throwable -> L27
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r1 = io.appmetrica.analytics.impl.AbstractC0063bm.f23523b     // Catch: java.lang.Throwable -> L27
            long r6 = r1.currentTimeSeconds()     // Catch: java.lang.Throwable -> L27
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L38
            r1 = r3
            goto L39
        L38:
            r1 = r2
        L39:
            if (r0 == 0) goto L43
            if (r9 != 0) goto L43
            if (r1 != 0) goto L43
            boolean r9 = r8.f23169g     // Catch: java.lang.Throwable -> L27
            if (r9 == 0) goto L44
        L43:
            r2 = r3
        L44:
            monitor-exit(r8)
            return r2
        L46:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L27
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Vl.a(java.util.List):boolean");
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.f23164b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            oo ooVar = this.f23176o;
            String str = identifiersResult.f25138id;
            ooVar.getClass();
            if (oo.a(str)) {
                this.f23164b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        W9 w92;
        Ue ueD = this.i.i((IdentifiersResult) this.f23164b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f23164b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f23164b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f23164b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f23164b.get("appmetrica_report_ad_url")).e(this.f23168f).h((IdentifiersResult) this.f23164b.get("appmetrica_clids")).j(Em.a((Map) this.f23167e)).f((IdentifiersResult) this.f23164b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f23164b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f23164b.get("appmetrica_yandex_adv_id")).b(this.f23169g).c(this.f23173l.f25088d).d(this.f23170h);
        U9 u92 = this.f23174m;
        synchronized (u92) {
            w92 = u92.f23072b;
        }
        ueD.a(w92).b();
    }

    public Vl(Ue ue, P p6, D3 d32, C0559vd c0559vd, C0627y6 c0627y6, U9 u92, T9 t92, oo ooVar) {
        HashSet hashSet = new HashSet();
        this.f23163a = hashSet;
        this.f23164b = new HashMap();
        this.f23165c = new Sl();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.i = ue;
        this.f23171j = p6;
        this.f23172k = d32;
        this.f23173l = c0627y6;
        this.f23174m = u92;
        this.f23175n = t92;
        this.f23176o = ooVar;
        c(c0559vd.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, ue.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, ue.i());
        a("appmetrica_get_ad_url", ue.d());
        a("appmetrica_report_ad_url", ue.e());
        b(ue.o());
        a("appmetrica_google_adv_id", ue.l());
        a("appmetrica_huawei_oaid", ue.m());
        a("appmetrica_yandex_adv_id", ue.r());
        c0627y6.a(ue.h());
        u92.a(ue.k());
        this.f23166d = ue.g();
        String strI = ue.i((String) null);
        this.f23167e = strI != null ? Em.a(strI) : null;
        this.f23169g = ue.a(true);
        this.f23168f = ue.b(0L);
        this.f23170h = ue.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f23164b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.f25138id.isEmpty()) {
            return ko.a((Map) this.f23167e);
        }
        return true;
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.f25138id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f25138id)) {
            return;
        }
        this.f23164b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f23164b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f23173l.f25087c.get(str2);
                }
                if (identifiersResult == null) {
                    W9 w92 = this.f23174m.f23072b;
                    if (!Intrinsics.a(str2, "appmetrica_lib_ssl_enabled") || (bool = w92.f23212a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean zBooleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = w92.f23213b;
                        String str3 = w92.f23214c;
                        if (zBooleanValue) {
                            str = "true";
                        } else if (!zBooleanValue) {
                            str = "false";
                        } else {
                            throw new ij.j();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f23169g || a(identifiersResult) || (identifiersResult.f25138id.isEmpty() && !ko.a((Map) this.f23167e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f25138id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

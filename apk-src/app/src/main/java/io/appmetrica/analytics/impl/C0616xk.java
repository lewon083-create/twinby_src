package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.sentry.protocol.SentryThread;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0616xk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0048b7 f25031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z6 f25032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T2 f25033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U2 f25034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0507tb f25035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0532ub f25036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0469rn f25037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0494sn f25038h;
    public final LinkedHashMap i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f25039j = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f25040k = new LinkedHashMap();

    public C0616xk(File file) {
        this.f25031a = new C0048b7(file);
    }

    public final IBinaryDataHelper a(Context context) {
        T2 t22 = this.f25033c;
        if (t22 != null) {
            return t22;
        }
        T2 t23 = new T2(new C0418pl(f(context)), "binary_data");
        this.f25033c = t23;
        return t23;
    }

    public final synchronized IBinaryDataHelper b(Context context) {
        U2 u22;
        u22 = this.f25034d;
        if (u22 == null) {
            u22 = new U2(a(context));
            this.f25034d = u22;
        }
        return u22;
    }

    public final synchronized IBinaryDataHelper c(Context context) {
        return a(context);
    }

    public final synchronized Ia d(Context context) {
        C0532ub c0532ub;
        try {
            c0532ub = this.f25036f;
            if (c0532ub == null) {
                C0507tb c0507tb = this.f25035e;
                if (c0507tb == null) {
                    c0507tb = new C0507tb(new C0418pl(f(context)));
                    this.f25035e = c0507tb;
                }
                c0532ub = new C0532ub(c0507tb);
                this.f25036f = c0532ub;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c0532ub;
    }

    public final synchronized Ia e(Context context) {
        C0507tb c0507tb;
        c0507tb = this.f25035e;
        if (c0507tb == null) {
            c0507tb = new C0507tb(new C0418pl(f(context)));
            this.f25035e = c0507tb;
        }
        return c0507tb;
    }

    public final synchronized Z6 f(Context context) {
        Z6 z62;
        try {
            z62 = this.f25032b;
            if (z62 == null) {
                C0048b7 c0048b7 = this.f25031a;
                String strA = new C0022a7(c0048b7.f23493a, c0048b7.f23494b, true).a(context, new C0138ek());
                N6 n62 = AbstractC0601x5.f25007c;
                n62.getClass();
                HashMap map = new HashMap();
                map.put("preferences", InterfaceC0526u5.f24834a);
                map.put("binary_data", AbstractC0476s5.f24727a);
                map.put("temp_cache", AbstractC0544un.f24859a);
                Iterator<ModuleServicesDatabase> it = C0382oa.I.p().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        map.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C0193gn c0193gn = n62.f22721c;
                X6 x62 = n62.f22719a;
                V6 v62 = x62.f23246e;
                W6 w62 = x62.f23247f;
                C0432qa c0432qa = new C0432qa(false);
                c0432qa.a(114, new C0164fk());
                Iterator<ModuleServicesDatabase> it2 = C0382oa.I.p().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c0432qa.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C0270jn c0270jn = new C0270jn("service database", map);
                c0193gn.getClass();
                z62 = new Z6(context, strA, new C0219hn(v62, w62, c0432qa, c0270jn), PublicLogger.getAnonymousInstance());
                this.f25032b = z62;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z62;
    }

    public final synchronized Z6 c(Context context, R4 r42) {
        Object z62;
        try {
            String str = new I4(r42).f22440a;
            LinkedHashMap linkedHashMap = this.i;
            z62 = linkedHashMap.get(str);
            if (z62 == null) {
                C0048b7 c0048b7 = this.f25031a;
                String strA = new C0022a7(c0048b7.f23493a, c0048b7.f23494b, false).a(context, new I4(r42));
                N6 n62 = AbstractC0601x5.f25007c;
                n62.getClass();
                String str2 = r42.f22910b;
                if (str2 == null) {
                    str2 = SentryThread.JsonKeys.MAIN;
                }
                String strConcat = "component-".concat(str2);
                C0193gn c0193gn = n62.f22721c;
                X6 x62 = n62.f22719a;
                P6 p6 = x62.f23242a;
                Q6 q62 = x62.f23243b;
                C0432qa c0432qa = new C0432qa(false);
                c0432qa.a(112, new L4());
                C0270jn c0270jn = new C0270jn(strConcat, n62.f22720b.f24877a);
                c0193gn.getClass();
                z62 = new Z6(context, strA, new C0219hn(p6, q62, c0432qa, c0270jn), PublicLogger.getAnonymousInstance());
                linkedHashMap.put(str, z62);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Z6) z62;
    }

    public final synchronized IBinaryDataHelper a(Context context, R4 r42) {
        Object t22;
        try {
            String str = new I4(r42).f22440a;
            LinkedHashMap linkedHashMap = this.f25040k;
            t22 = linkedHashMap.get(str);
            if (t22 == null) {
                t22 = new T2(new C0418pl(c(context, r42)), "binary_data");
                linkedHashMap.put(str, t22);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (IBinaryDataHelper) t22;
    }

    public final synchronized Ia b(Context context, R4 r42) {
        Object c0507tb;
        try {
            String str = new I4(r42).f22440a;
            LinkedHashMap linkedHashMap = this.f25039j;
            c0507tb = linkedHashMap.get(str);
            if (c0507tb == null) {
                c0507tb = new C0507tb(new C0418pl(c(context, r42)));
                linkedHashMap.put(str, c0507tb);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Ia) c0507tb;
    }
}

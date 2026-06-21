package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0564vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G4 f24911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rn f24912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0614xi f24913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0397p0 f24914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ol f24915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Xj f24916f;

    public C0564vi(C0397p0 c0397p0, Rn rn, G4 g42, Xj xj2) {
        this(c0397p0, rn, g42, xj2, new C0614xi(c0397p0, xj2));
    }

    public final void a(C0538uh c0538uh) {
        Eh eh2 = c0538uh.f24851e;
        Ol ol2 = this.f24915e;
        if (ol2 != null) {
            eh2.f22439b.setUuid(((Nl) ol2).g());
        } else {
            eh2.getClass();
        }
        this.f24913c.a(c0538uh);
    }

    public final void b(String str) {
        Af af2 = this.f24911a.f22438a;
        synchronized (af2) {
            af2.f22072a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public C0564vi(C0397p0 c0397p0, Rn rn, G4 g42, Xj xj2, C0614xi c0614xi) {
        this.f24914d = c0397p0;
        this.f24911a = g42;
        this.f24912b = rn;
        this.f24916f = xj2;
        this.f24913c = c0614xi;
    }

    public final void a(Nl nl2) {
        this.f24915e = nl2;
        this.f24911a.f22439b.setUuid(nl2.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (ko.a(bool)) {
            this.f24911a.f22439b.setLocationTracking(bool.booleanValue());
        }
        if (ko.a(bool2)) {
            this.f24911a.f22439b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (ko.a(bool3)) {
            this.f24911a.f22439b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        Q5 q5A = Q5.a();
        G4 g42 = this.f24911a;
        a(a(q5A, g42), g42, 1, (Map) null);
    }

    public final void a(Q5 q5, Eh eh2, int i, Map map) {
        String str;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        this.f24914d.b();
        if (!ko.a(map)) {
            q5.setValue(AbstractC0207hb.b(map));
            a(q5, eh2);
        }
        Af af2 = new Af(eh2.f22438a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(eh2.f22439b);
        E8 e82 = eh2.f22293c;
        synchronized (eh2) {
            str = eh2.f22296f;
        }
        a(new C0538uh(q5, false, i, null, new Eh(af2, counterConfiguration, e82, str)));
    }

    public static Q5 a(Q5 q5, Eh eh2) {
        if (AbstractC0605x9.f25010a.contains(Integer.valueOf(q5.f22863d))) {
            q5.f22862c = eh2.d();
        }
        return q5;
    }

    public final void a(List list) {
        Af af2 = this.f24911a.f22438a;
        synchronized (af2) {
            af2.f22072a.put("PROCESS_CFG_CUSTOM_HOSTS", ko.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap map) {
        Af af2 = this.f24911a.f22438a;
        synchronized (af2) {
            af2.f22072a.put("PROCESS_CFG_CLIDS", AbstractC0207hb.b(map));
        }
    }

    public final void a(String str) {
        Af af2 = this.f24911a.f22438a;
        synchronized (af2) {
            af2.f22072a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final C0538uh a(Pn pn, Eh eh2) {
        String str;
        String str2;
        this.f24914d.b();
        Rn rn = this.f24912b;
        rn.getClass();
        Fn fn = pn.f22840a;
        if (fn == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(fn.f22353a, "");
        }
        byte[] bArrFromModel = rn.f22931a.fromModel(pn);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(eh2.f22439b.getApiKey());
        Set set = AbstractC0605x9.f25010a;
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(bArrFromModel, str, 5891, orCreatePublicLogger);
        n32.f22862c = eh2.d();
        HashMap map = n32.f22711q;
        Af af2 = new Af(eh2.f22438a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(eh2.f22439b);
        E8 e82 = eh2.f22293c;
        synchronized (eh2) {
            str2 = eh2.f22296f;
        }
        return new C0538uh(n32, true, 1, map, new Eh(af2, counterConfiguration, e82, str2));
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cb f22310a = new Cb(C0071c4.l().d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Db f22311b = new Db();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fb f22312c = new Fb();

    public final void a(String str, String str2, String str3) {
        Cb cb2 = this.f22310a;
        if (cb2.f22201c.a((Void) null).f24595a && cb2.f22202d.a(str).f24595a && cb2.f22203e.a(str2).f24595a && cb2.f22204f.a(str3).f24595a) {
            this.f22311b.getClass();
            IHandlerExecutor iHandlerExecutorA = C0071c4.l().f23537c.a();
            ((A9) iHandlerExecutorA).f22059b.post(new a0.i1(this, str, str2, str3, 6));
            return;
        }
        StringBuilder sbJ = t.z.j("Failed report event from sender: ", str, " with name = ", str2, " and payload = ");
        sbJ.append(str3);
        PublicLogger.Companion.getAnonymousInstance().warning(om1.k("[AppMetricaLibraryAdapterProxy]", sbJ.toString()), new Object[0]);
    }

    public static final void a(F0 f02, String str, String str2, String str3) {
        List list;
        Context contextA;
        Fb fb2 = f02.f22312c;
        fb2.getClass();
        if (str == null) {
            str = "null";
        }
        Pair pair = new Pair("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        Pair pair2 = new Pair("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        LinkedHashMap linkedHashMapH = kotlin.collections.j0.h(pair, pair2, new Pair("payload", str3));
        ModuleEvent.Builder builderWithName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (fb2) {
            try {
                if (fb2.f22327a == null && (contextA = C0071c4.l().f23541g.a()) != null) {
                    fb2.f22327a = kotlin.collections.s.f(new Pd(), new C0141en(contextA), new Io());
                }
                list = fb2.f22327a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0495t) it.next()).a(linkedHashMapH);
            }
        }
        ModulesFacade.reportEvent(builderWithName.withAttributes(linkedHashMapH).build());
    }
}

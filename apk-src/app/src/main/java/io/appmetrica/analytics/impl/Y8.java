package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Y8 extends Ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0440qi f23318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f23319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0450r4 f23320c;

    public Y8(Y4 y42) {
        C0440qi c0440qi = new C0440qi(y42);
        this.f23318a = c0440qi;
        this.f23320c = new C0450r4(c0440qi);
        this.f23319b = a();
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        map.put(EnumC0078cb.EVENT_TYPE_ACTIVATION, new C0195h(this.f23318a));
        map.put(EnumC0078cb.EVENT_TYPE_START, new Dl(this.f23318a));
        map.put(EnumC0078cb.EVENT_TYPE_REGULAR, new Fg(this.f23318a));
        C0258jb c0258jb = new C0258jb(this.f23318a);
        map.put(EnumC0078cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c0258jb);
        map.put(EnumC0078cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c0258jb);
        map.put(EnumC0078cb.EVENT_TYPE_SEND_REFERRER, c0258jb);
        map.put(EnumC0078cb.EVENT_TYPE_CUSTOM_EVENT, c0258jb);
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_SET_SESSION_EXTRA;
        C0440qi c0440qi = this.f23318a;
        map.put(enumC0078cb, new C0642yl(c0440qi, c0440qi.f24656t));
        map.put(EnumC0078cb.EVENT_TYPE_APP_OPEN, new Mg(this.f23318a));
        map.put(EnumC0078cb.EVENT_TYPE_PURGE_BUFFER, new Qf(this.f23318a));
        map.put(EnumC0078cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C0502t6(this.f23318a));
        map.put(EnumC0078cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new C0536uf(this.f23318a));
        map.put(EnumC0078cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Un(this.f23318a));
        map.put(EnumC0078cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new C0561vf(this.f23318a));
        map.put(EnumC0078cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Tn(this.f23318a));
        map.put(EnumC0078cb.EVENT_TYPE_ANR, c0258jb);
        EnumC0078cb enumC0078cb2 = EnumC0078cb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C0440qi c0440qi2 = this.f23318a;
        map.put(enumC0078cb2, new C0642yl(c0440qi2, c0440qi2.f24642e));
        EnumC0078cb enumC0078cb3 = EnumC0078cb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C0440qi c0440qi3 = this.f23318a;
        map.put(enumC0078cb3, new C0642yl(c0440qi3, c0440qi3.f24643f));
        map.put(EnumC0078cb.EVENT_TYPE_SEND_USER_PROFILE, c0258jb);
        EnumC0078cb enumC0078cb4 = EnumC0078cb.EVENT_TYPE_SET_USER_PROFILE_ID;
        C0440qi c0440qi4 = this.f23318a;
        map.put(enumC0078cb4, new C0642yl(c0440qi4, c0440qi4.f24647k));
        map.put(EnumC0078cb.EVENT_TYPE_SEND_REVENUE_EVENT, c0258jb);
        map.put(EnumC0078cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c0258jb);
        map.put(EnumC0078cb.EVENT_TYPE_CLEANUP, c0258jb);
        map.put(EnumC0078cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c0258jb);
        map.put(EnumC0078cb.EVENT_TYPE_WEBVIEW_SYNC, c0258jb);
        map.put(EnumC0078cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new F9(this.f23318a));
        return map;
    }

    public final C0440qi b() {
        return this.f23318a;
    }

    public final void a(EnumC0078cb enumC0078cb, AbstractC0407pa abstractC0407pa) {
        this.f23319b.put(enumC0078cb, abstractC0407pa);
    }

    @Override // io.appmetrica.analytics.impl.Ef
    public final X8 a(int i) {
        LinkedList linkedList = new LinkedList();
        EnumC0078cb enumC0078cbA = EnumC0078cb.a(i);
        C0450r4 c0450r4 = this.f23320c;
        if (c0450r4 != null) {
            c0450r4.a(enumC0078cbA, linkedList);
        }
        AbstractC0407pa abstractC0407pa = (AbstractC0407pa) this.f23319b.get(enumC0078cbA);
        if (abstractC0407pa != null) {
            abstractC0407pa.a(linkedList);
        }
        return new W8(linkedList);
    }

    public final AbstractC0407pa a(EnumC0078cb enumC0078cb) {
        return (AbstractC0407pa) this.f23319b.get(enumC0078cb);
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0288kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f24240a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0338mg f24241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vo f24243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f24244e;

    public C0288kg(Context context, vo voVar) {
        this.f24244e = context;
        this.f24243d = voVar;
        this.f24241b = voVar.b();
        this.f24242c = voVar.c();
    }

    public final void a() {
        if (this.f24242c) {
            return;
        }
        Context context = this.f24244e;
        Pa paA = C0537ug.a(context, C0382oa.I.f24493d.a());
        InterfaceC0462rg interfaceC0462rg = (InterfaceC0462rg) new C0109dg(this, new C0537ug(paA), new Aa(context), new C0562vg(context)).f23695f.getValue();
        try {
            paA.a(interfaceC0462rg);
        } catch (Throwable th2) {
            interfaceC0462rg.a(th2);
        }
    }

    public final synchronized void a(C0388og c0388og) {
        this.f24240a.add(c0388og);
        if (this.f24242c) {
            c0388og.a(this.f24241b);
        }
    }

    public final synchronized void a(C0338mg c0338mg) {
        Iterator it = this.f24240a.iterator();
        while (it.hasNext()) {
            ((C0388og) it.next()).a(c0338mg);
        }
    }
}

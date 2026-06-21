package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0045b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0123e5 f23480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f23481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0432qa f23482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f23483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0251j4 f23484f;

    public C0045b4(Context context, C0123e5 c0123e5) {
        this(context, c0123e5, new C0251j4());
    }

    public final InterfaceC0174g4 a(Q3 q32, C0426q4 c0426q4) {
        InterfaceC0174g4 interfaceC0174g4A;
        synchronized (this.f23479a) {
            try {
                interfaceC0174g4A = (InterfaceC0174g4) this.f23481c.get(q32);
                if (interfaceC0174g4A == null) {
                    this.f23484f.getClass();
                    interfaceC0174g4A = C0251j4.a(q32).a(this.f23483e, this.f23480b, q32, c0426q4);
                    this.f23481c.put(q32, interfaceC0174g4A);
                    this.f23482d.a(new C0019a4(q32.f22856b, q32.f22857c, q32.f22858d), q32);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC0174g4A;
    }

    public C0045b4(Context context, C0123e5 c0123e5, C0251j4 c0251j4) {
        this.f23479a = new Object();
        this.f23481c = new HashMap();
        this.f23482d = new C0432qa();
        this.f23483e = context.getApplicationContext();
        this.f23480b = c0123e5;
        this.f23484f = c0251j4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f23479a) {
            try {
                C0432qa c0432qa = this.f23482d;
                Collection collection = (Collection) c0432qa.f24625a.remove(new C0019a4(str, num, str2));
                if (!ko.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC0174g4) this.f23481c.remove((Q3) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC0174g4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}

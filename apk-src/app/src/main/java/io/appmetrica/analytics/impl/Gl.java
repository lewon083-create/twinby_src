package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0432qa f22399a = new C0432qa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f22400b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0140em f22401c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final El f22402d = new El(this);

    public static final Gl a() {
        return Fl.f22351a;
    }

    public final C0668zm a(Context context, R4 r42, Yl yl2) {
        C0668zm c0668zm = (C0668zm) this.f22400b.get(r42.f22909a);
        boolean z5 = true;
        if (c0668zm == null) {
            synchronized (this.f22400b) {
                try {
                    c0668zm = (C0668zm) this.f22400b.get(r42.f22909a);
                    if (c0668zm == null) {
                        c0668zm = new C0668zm(new Am(context, r42.f22909a, yl2, this.f22402d));
                        c0668zm.f();
                        this.f22400b.put(r42.f22909a, c0668zm);
                        z5 = false;
                    }
                } finally {
                }
            }
        }
        if (z5) {
            c0668zm.a(yl2);
        }
        return c0668zm;
    }

    public final void a(R4 r42, Pl pl2) {
        synchronized (this.f22400b) {
            try {
                this.f22399a.a(r42.f22909a, pl2);
                C0140em c0140em = this.f22401c;
                if (c0140em != null) {
                    pl2.a(c0140em);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

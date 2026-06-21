package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0625y4 implements Fa, Pl, Ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4 f25072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0668zm f25073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0638yh f25074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F4 f25075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0295kn f25076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f25077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S4 f25078h;
    public final C0288kg i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final U3 f25079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0413pg f25080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f25081l;

    public C0625y4(@NonNull Context context, @NonNull Gl gl2, @NonNull R4 r42, @NonNull C0426q4 c0426q4, @NonNull C0288kg c0288kg) {
        this(context, gl2, r42, c0426q4, new C0638yh(c0426q4.f24613b), c0288kg, new S4(), new A4(), new C0413pg());
    }

    public static void b(C0426q4 c0426q4) {
        C0382oa.I.c().b(!Boolean.FALSE.equals(c0426q4.f24613b.f24559n));
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(@NonNull C0401p4 c0401p4) {
        C0638yh c0638yh = this.f25074d;
        c0638yh.f25099a = c0638yh.f25099a.mergeFrom(c0401p4);
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    @NonNull
    public final C0401p4 d() {
        return this.f25074d.f25099a;
    }

    @NonNull
    public final C0288kg e() {
        return this.i;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final Context getContext() {
        return this.f25071a;
    }

    public C0625y4(Context context, Gl gl2, R4 r42, C0426q4 c0426q4, C0638yh c0638yh, C0288kg c0288kg, S4 s42, A4 a42, C0413pg c0413pg) {
        this.f25077g = new ArrayList();
        this.f25081l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f25071a = applicationContext;
        this.f25072b = r42;
        this.f25074d = c0638yh;
        this.f25078h = s42;
        this.f25075e = A4.a(this);
        b(c0426q4);
        C0668zm c0668zmA = gl2.a(applicationContext, r42, c0426q4.f24612a);
        this.f25073c = c0668zmA;
        this.f25079j = V3.a(c0668zmA, C0382oa.k().c());
        this.f25076f = a42.a(this, c0668zmA);
        this.i = c0288kg;
        this.f25080k = c0413pg;
        gl2.a(r42, this);
    }

    public final synchronized void a(@NonNull C0550v4 c0550v4) {
        this.f25078h.f22943a.add(c0550v4);
        C6.a(c0550v4.f24871c, this.f25079j.a(Em.a(this.f25073c.e().f23795l)));
    }

    public final synchronized void b(@NonNull C0550v4 c0550v4) {
        this.f25078h.f22943a.remove(c0550v4);
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final R4 b() {
        return this.f25072b;
    }

    public final void a(@NonNull Q5 q5, @NonNull C0550v4 c0550v4) {
        F4 f42 = this.f25075e;
        f42.getClass();
        f42.a(q5, new E4(c0550v4));
    }

    @Override // io.appmetrica.analytics.impl.Pl
    public final void a(@NonNull Il il2, C0140em c0140em) {
        synchronized (this.f25081l) {
            try {
                for (Ya ya2 : this.f25077g) {
                    C6.a(ya2.f23321a, il2, this.f25079j.a(ya2.f23323c));
                }
                this.f25077g.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pl
    public final void a(@NonNull C0140em c0140em) {
        synchronized (this.f25081l) {
            try {
                for (C0550v4 c0550v4 : this.f25078h.f22943a) {
                    C6.a(c0550v4.f24871c, this.f25079j.a(Em.a(c0140em.f23795l)));
                }
                ArrayList arrayList = new ArrayList();
                for (Ya ya2 : this.f25077g) {
                    if (AbstractC0063bm.a(c0140em, ya2.f23322b, ya2.f23323c, new Wa())) {
                        C6.a(ya2.f23321a, this.f25079j.a(ya2.f23323c));
                    } else {
                        arrayList.add(ya2);
                    }
                }
                this.f25077g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f25076f.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Ya ya2) {
        ResultReceiver resultReceiver;
        HashMap map;
        List<String> list;
        HashMap map2 = new HashMap();
        if (ya2 != null) {
            list = ya2.f23322b;
            resultReceiver = ya2.f23321a;
            map = ya2.f23323c;
        } else {
            resultReceiver = null;
            map = map2;
            list = null;
        }
        boolean zA = this.f25073c.a(list, map);
        if (!zA) {
            C6.a(resultReceiver, this.f25079j.a(map));
        }
        if (!this.f25073c.g()) {
            if (zA) {
                C6.a(resultReceiver, this.f25079j.a(map));
                return;
            }
            return;
        }
        synchronized (this.f25081l) {
            if (zA && ya2 != null) {
                try {
                    this.f25077g.add(ya2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f25076f.c();
    }

    public final void a(ResultReceiver resultReceiver) {
        this.f25080k.a(new C0600x4(resultReceiver));
    }

    @NonNull
    public final U3 a() {
        return this.f25079j;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void a(@NonNull C0426q4 c0426q4) {
        this.f25073c.a(c0426q4.f24612a);
        a(c0426q4.f24613b);
    }
}

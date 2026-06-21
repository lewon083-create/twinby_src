package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class C0098d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0046b5 f23658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0072c5 f23659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected final Context f23660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R4 f23661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0401p4 f23662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final W4 f23663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    protected final C0140em f23664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0187gh f23665h;
    public final I8 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ICommonExecutor f23666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Gb f23667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0505t9 f23668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f23669m;

    public C0098d5(Context context, R4 r42, C0401p4 c0401p4, W4 w42, C0140em c0140em, InterfaceC0187gh interfaceC0187gh, ICommonExecutor iCommonExecutor, int i, Gb gb2, InterfaceC0505t9 interfaceC0505t9) {
        this(context, r42, c0401p4, w42, c0140em, interfaceC0187gh, iCommonExecutor, new I8(), i, new C0046b5(c0401p4.f24547a), new C0072c5(context, r42), gb2, interfaceC0505t9);
    }

    public static Y8 c(Y4 y42) {
        return new Y8(y42);
    }

    public final N8 a() {
        Context context = this.f23660c;
        R4 r42 = this.f23661d;
        return new N8(new S8(context, r42), this.f23669m);
    }

    public final M6 b(Y4 y42) {
        return new M6(y42, C0382oa.I.B().c(this.f23660c, this.f23661d), new I6(y42.c()), new C0177g7());
    }

    public final C0046b5 d() {
        return this.f23658a;
    }

    public final C0072c5 e() {
        return this.f23659b;
    }

    public final wo f() {
        wo woVar;
        Ao c0077ca;
        zo zoVarD = C0382oa.I.D();
        R4 r42 = this.f23661d;
        synchronized (zoVarD) {
            try {
                String strValueOf = String.valueOf(r42);
                LinkedHashMap linkedHashMap = zoVarD.f25132b;
                Object woVar2 = linkedHashMap.get(strValueOf);
                if (woVar2 == null) {
                    Ve ve2 = new Ve(C0382oa.I.B().b(zoVarD.f25131a, r42));
                    if (r42.d()) {
                        String str = "appmetrica_vital_" + r42.f22910b + ".dat";
                        c0077ca = new C0201h5(kotlin.collections.s.f(new Pair(str, new C0077ca(zoVarD.f25131a, str)), new Pair("appmetrica_vital_main.dat", new C0077ca(zoVarD.f25131a, "appmetrica_vital_main.dat"))));
                    } else {
                        c0077ca = new C0077ca(zoVarD.f25131a, "appmetrica_vital_" + r42.f22910b + ".dat");
                    }
                    woVar2 = new wo(ve2, c0077ca, strValueOf);
                    linkedHashMap.put(strValueOf, woVar2);
                }
                woVar = (wo) woVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return woVar;
    }

    public C0098d5(Context context, R4 r42, C0401p4 c0401p4, W4 w42, C0140em c0140em, InterfaceC0187gh interfaceC0187gh, ICommonExecutor iCommonExecutor, I8 i82, int i, C0046b5 c0046b5, C0072c5 c0072c5, Gb gb2, InterfaceC0505t9 interfaceC0505t9) {
        this.f23660c = context;
        this.f23661d = r42;
        this.f23662e = c0401p4;
        this.f23663f = w42;
        this.f23664g = c0140em;
        this.f23665h = interfaceC0187gh;
        this.f23666j = iCommonExecutor;
        this.i = i82;
        this.f23669m = i;
        this.f23658a = c0046b5;
        this.f23659b = c0072c5;
        this.f23667k = gb2;
        this.f23668l = interfaceC0505t9;
    }

    public final Ik c() {
        return new Ik(this.f23660c, this.f23661d);
    }

    public final C0539ui d(Y4 y42) {
        C0539ui c0539ui = new C0539ui(y42, this.f23663f.a(), this.f23666j);
        Gb gb2 = this.f23667k;
        synchronized (gb2) {
            gb2.f22377c.add(c0539ui);
        }
        return c0539ui;
    }

    public final Pg a(Y4 y42) {
        return new Pg(new C0213hh(y42, this.f23665h, new D3()), this.f23664g, new C0135eh(this.f23662e));
    }

    public static Qk a(Y4 y42, wo woVar, X4 x42) {
        Pk pk2 = new Pk(woVar);
        return new Qk(y42, pk2, x42, new C0232ia(y42, pk2, new Tk(y42.h(), C0232ia.f24064g), AbstractC0622y1.a(), new SystemTimeProvider()), new A2(y42, pk2, new Tk(y42.h(), A2.f22054g), AbstractC0622y1.a(), new SystemTimeProvider()));
    }

    public static T4 b() {
        return new T4();
    }

    public final C0350n3 b(Ve ve2) {
        Context context = this.f23660c;
        return new C0350n3(context, ve2, context.getPackageName(), new SafePackageManager());
    }

    public final C0306l9 a(Ve ve2, wo woVar, Qk qk2, M6 m62, C0247j0 c0247j0, Ik ik2, C0539ui c0539ui) {
        return new C0306l9(ve2, woVar, qk2, m62, c0247j0, this.i, ik2, this.f23669m, new C0020a5(c0539ui), new SystemTimeProvider());
    }

    public static C0489si a(Y4 y42, Y8 y82) {
        return new C0489si(y82, y42);
    }

    public InterfaceC0455r9 a(InterfaceC0580w9 interfaceC0580w9, M6 m62, Pg pg, C0401p4 c0401p4, R4 r42, Ve ve2) {
        return this.f23668l.a(interfaceC0580w9, m62, pg, c0401p4, r42, ve2).a();
    }

    public final C0424q2 a(Ve ve2) {
        return new C0424q2(this.f23661d, ve2);
    }
}

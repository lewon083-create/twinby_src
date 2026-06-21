package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ag extends ig {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile Long f2887j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile String f2889l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile Long f2891n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile String f2893p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile Long f2895r;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f2888k = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f2890m = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f2892o = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f2894q = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f2896s = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag(qf qfVar, String str, String str2, jd jdVar, int i, int i10, int i11) {
        super(qfVar, str, str2, jdVar, i, i10);
        this.i = i11;
    }

    private final void b() {
        jd jdVar = this.f6484e;
        jdVar.b();
        ((wd) jdVar.f9560c).G0(-1L);
        jdVar.b();
        ((wd) jdVar.f9560c).H0(-1L);
        int[] iArr = (int[]) this.f6485f.invoke(null, this.f6481b.f9475a);
        synchronized (jdVar) {
            long j10 = iArr[0];
            jdVar.b();
            ((wd) jdVar.f9560c).G0(j10);
            long j11 = iArr[1];
            jdVar.b();
            ((wd) jdVar.f9560c).H0(j11);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                jdVar.b();
                ((wd) jdVar.f9560c).X(i);
            }
        }
    }

    private final void c() {
        if (f2889l == null) {
            synchronized (f2890m) {
                try {
                    if (f2889l == null) {
                        f2889l = (String) this.f6485f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        jd jdVar = this.f6484e;
        synchronized (jdVar) {
            String str = f2889l;
            jdVar.b();
            ((wd) jdVar.f9560c).f0(str);
        }
    }

    private final void d() {
        if (f2891n == null) {
            synchronized (f2892o) {
                try {
                    if (f2891n == null) {
                        f2891n = (Long) this.f6485f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        jd jdVar = this.f6484e;
        synchronized (jdVar) {
            long jLongValue = f2891n.longValue();
            jdVar.b();
            ((wd) jdVar.f9560c).P0(jLongValue);
        }
    }

    private final void e() {
        jd jdVar = this.f6484e;
        jdVar.b();
        ((wd) jdVar.f9560c).D0("E");
        if (f2893p == null) {
            synchronized (f2894q) {
                try {
                    if (f2893p == null) {
                        f2893p = (String) this.f6485f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        jd jdVar2 = this.f6484e;
        synchronized (jdVar2) {
            String str = f2893p;
            jdVar2.b();
            ((wd) jdVar2.f9560c).D0(str);
        }
    }

    private final void f() {
        Boolean bool = (Boolean) q9.s.f31967e.f31970c.a(al.f3297z3);
        bool.getClass();
        String str = (String) this.f6485f.invoke(null, this.f6481b.f9475a, bool);
        ef efVar = new ef();
        efVar.H = -1L;
        efVar.I = -1L;
        HashMap mapN = pn1.n(str);
        if (mapN != null) {
            efVar.H = ((Long) mapN.get(0)).longValue();
            efVar.I = ((Long) mapN.get(1)).longValue();
        }
        jd jdVar = this.f6484e;
        synchronized (jdVar) {
            long j10 = efVar.H;
            jdVar.b();
            ((wd) jdVar.f9560c).F0(j10);
            long j11 = efVar.I;
            jdVar.b();
            ((wd) jdVar.f9560c).Y(j11);
        }
    }

    private final void g() {
        jd jdVar = this.f6484e;
        synchronized (jdVar) {
            String str = (String) this.f6485f.invoke(null, null);
            mf mfVar = new mf();
            HashMap mapN = pn1.n(str);
            if (mapN != null) {
                mfVar.H = (Long) mapN.get(0);
                mfVar.I = (Long) mapN.get(1);
            }
            long jLongValue = mfVar.H.longValue();
            jdVar.b();
            ((wd) jdVar.f9560c).P(jLongValue);
            long jLongValue2 = mfVar.I.longValue();
            jdVar.b();
            ((wd) jdVar.f9560c).Q(jLongValue2);
        }
    }

    private final void h() {
        if (f2895r == null) {
            synchronized (f2896s) {
                try {
                    if (f2895r == null) {
                        f2895r = (Long) this.f6485f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        jd jdVar = this.f6484e;
        synchronized (jdVar) {
            long jLongValue = f2895r.longValue();
            jdVar.b();
            ((wd) jdVar.f9560c).C(jLongValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void a() throws InvocationTargetException {
        switch (this.i) {
            case 0:
                if (f2887j == null) {
                    synchronized (f2888k) {
                        try {
                            if (f2887j == null) {
                                f2887j = (Long) this.f6485f.invoke(null, null);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                jd jdVar = this.f6484e;
                synchronized (jdVar) {
                    long jLongValue = f2887j.longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).L(jLongValue);
                    break;
                }
                return;
            case 1:
                c();
                return;
            case 2:
                d();
                return;
            case 3:
                e();
                return;
            case 4:
                h();
                return;
            case 5:
                String str = (String) this.f6485f.invoke(null, null);
                jd jdVar2 = this.f6484e;
                synchronized (jdVar2) {
                    jdVar2.b();
                    ((wd) jdVar2.f9560c).k0(str);
                    break;
                }
                return;
            case 6:
                jd jdVar3 = this.f6484e;
                jdVar3.b();
                ((wd) jdVar3.f9560c).p0(3);
                try {
                    int i = 1;
                    if (true == ((Boolean) this.f6485f.invoke(null, this.f6481b.f9475a)).booleanValue()) {
                        i = 2;
                    }
                    jdVar3.b();
                    ((wd) jdVar3.f9560c).p0(i);
                    return;
                } catch (InvocationTargetException e3) {
                    if (!(e3.getTargetException() instanceof Settings.SettingNotFoundException)) {
                        throw e3;
                    }
                    return;
                }
            case 7:
                b();
                return;
            case 8:
                int i10 = true == ((Boolean) this.f6485f.invoke(null, this.f6481b.f9475a)).booleanValue() ? 2 : 1;
                jd jdVar4 = this.f6484e;
                jdVar4.b();
                ((wd) jdVar4.f9560c).s0(i10);
                return;
            case 9:
                jd jdVar5 = this.f6484e;
                jdVar5.b();
                ((wd) jdVar5.f9560c).J0(-1L);
                long jLongValue2 = ((Long) this.f6485f.invoke(null, this.f6481b.f9475a)).longValue();
                jdVar5.b();
                ((wd) jdVar5.f9560c).J0(jLongValue2);
                return;
            case 10:
                f();
                return;
            case 11:
                jd jdVar6 = this.f6484e;
                try {
                    int i11 = 1;
                    if (true == ((Boolean) this.f6485f.invoke(null, this.f6481b.f9475a)).booleanValue()) {
                        i11 = 2;
                    }
                    jdVar6.b();
                    ((wd) jdVar6.f9560c).r0(i11);
                    return;
                } catch (InvocationTargetException unused) {
                    jdVar6.b();
                    ((wd) jdVar6.f9560c).r0(3);
                    return;
                }
            case 12:
                g();
                return;
            default:
                jd jdVar7 = this.f6484e;
                jdVar7.g(3);
                boolean zBooleanValue = ((Boolean) this.f6485f.invoke(null, this.f6481b.f9475a)).booleanValue();
                synchronized (jdVar7) {
                    try {
                        if (zBooleanValue) {
                            jdVar7.g(2);
                        } else {
                            jdVar7.g(1);
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(qf qfVar, jd jdVar, int i, int i10) {
        super(qfVar, "FynI9c5fEiMzQz2B7twhubBCGA6OmnD4m4mZd8FrJbuEtgSrrhq+E+F7XsfWYfqR", "1Y9Pw3JU+olt+lWU2l7rblcsXGsm1mQtokTJIYT27m0=", jdVar, i, 44);
        this.i = i10;
        switch (i10) {
            case 2:
                super(qfVar, "iVzH00FGTIijHIZ0HS5SItMsN9AyuHOn1xXwzbhHf6Eq/l9FiFSlfrw2j7G806j4", "RyZVSwEZZgeTR1V/DRrjgM5Yqk49vWkiFPpVljbz9Uo=", jdVar, i, 22);
                break;
            case 3:
                super(qfVar, "yZXKjkpxohkfNrA4/dntjy5UGv8pEqMsOsdSv+5n+sZgEYNlImB4QjlGv7rNs0BZ", "qPvuYJ0m6OwVM7zFkNMQ820WzknyvHgBl013Si7b8nM=", jdVar, i, 1);
                break;
            case 4:
                super(qfVar, "R0KTYl+9Bi7RshEQmYhK/YeVyfjIkHliDPJVeC+XBbAz0q1EMlAcoZ8JeP0fdmTX", "AARE3CI7+7Fq5atzy8wcVAJTjdNJGGNM3rGztRoG23E=", jdVar, i, 33);
                break;
            case 5:
                super(qfVar, "x/S3A4n6lbyzTdn/kz8tPqUf3a1YB5vAd5r7wQYCBb3DYPiGQZB67fbWL/+XFcZ5", "kB0lJ6HHV2i/5ncg76cGz3oLPH/Yq3P6CviApgv8Ipc=", jdVar, i, 89);
                break;
            case 6:
                super(qfVar, "YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", jdVar, i, 49);
                break;
            case 7:
                super(qfVar, "1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", jdVar, i, 5);
                break;
            case 8:
            default:
                break;
            case 9:
                super(qfVar, "KMUeaeNiUI6XsUYhfNNPM5hdqwDfiAVXu+jtj2XrbalwiO+unml0DNmATqQtDmlU", "B4oRQazYGo5C2idQuGW+PTqNOD34GvbDXi8fMMTvLXo=", jdVar, i, 12);
                break;
            case 10:
                super(qfVar, "Vt16THtmezzLb1zgD4XzuhSMrHLGIQcDJNqtzF8G+1UgPRnrYaZemyLPsebqTPQi", "+oRdA7B1eJk1uXzj6xFlex4QQoiHLhoEiFmCoqVQP54=", jdVar, i, 3);
                break;
            case 11:
                super(qfVar, "EHHl2bnow3CY535hCiXXbLjuydxFlVXitu9AIkBq9ZFdEOrgtrbiSayxFpjmKRmo", "ioEU79oGVeaIBBGOjKcBP85gZ/aumGq7/t+0LJZeQ5M=", jdVar, i, 73);
                break;
            case 12:
                super(qfVar, "WpK2JUF8iJ/BvX1YbpvZEg/OwGEi7DqWo1w6qvQxAhqdLxv0KDJfeHynFcOHsF/r", "eAfiSXYP9RekAEzlsFTPbe7e0Y1hgLoRWRhxsNjDqkg=", jdVar, i, 51);
                break;
            case 13:
                super(qfVar, "WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", jdVar, i, 48);
                break;
        }
    }
}

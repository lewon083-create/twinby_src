package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class V8 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f23118h;
    public static final V8 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0609xd f23119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final so f23120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0654z8 f23121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0530u9 f23122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Wb f23123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ud f23124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final O9 f23125g;

    static {
        HashMap map = new HashMap();
        map.put(EnumC0128ea.FIRST_OCCURRENCE, 1);
        map.put(EnumC0128ea.NON_FIRST_OCCURENCE, 0);
        map.put(EnumC0128ea.UNKNOWN, -1);
        f23118h = Collections.unmodifiableMap(map);
        i = new V8(new Qi(), new Ym(), new C0081ce(), new Pi(), new C0282ka(), new C0307la(), new C0257ja());
    }

    public V8(U8 u82) {
        this(u82.f23064a, u82.f23065b, u82.f23066c, u82.f23067d, u82.f23068e, u82.f23069f, u82.f23070g);
    }

    public final C0153f9 a(O8 o82, C0264jh c0264jh) {
        C0153f9 c0153f9 = new C0153f9();
        C0127e9 c0127e9A = this.f23124f.a(o82.f22785l, o82.f22786m);
        C0024a9 c0024a9A = this.f23123e.a(o82.f22781g);
        if (c0127e9A != null) {
            c0153f9.f23859g = c0127e9A;
        }
        if (c0024a9A != null) {
            c0153f9.f23858f = c0024a9A;
        }
        String strA = this.f23119a.a(o82.f22775a);
        if (strA != null) {
            c0153f9.f23856d = strA;
        }
        c0153f9.f23857e = this.f23120b.a(o82, c0264jh);
        String str = o82.f22783j;
        if (str != null) {
            c0153f9.f23860h = str;
        }
        Integer numA = this.f23122d.a(o82);
        if (numA != null) {
            c0153f9.f23855c = numA.intValue();
        }
        Long l10 = o82.f22777c;
        if (l10 != null) {
            c0153f9.f23853a = l10.longValue();
        }
        Long l11 = o82.f22778d;
        if (l11 != null) {
            c0153f9.f23865n = l11.longValue();
        }
        Long l12 = o82.f22779e;
        if (l12 != null) {
            c0153f9.f23866o = l12.longValue();
        }
        Long l13 = o82.f22780f;
        if (l13 != null) {
            c0153f9.f23854b = l13.longValue();
        }
        Integer num = o82.f22784k;
        if (num != null) {
            c0153f9.i = num.intValue();
        }
        c0153f9.f23861j = this.f23121c.a(o82.f22788o);
        C0254j7 c0254j7 = o82.f22781g;
        c0153f9.f23862k = c0254j7 != null ? new C0228i6().a(c0254j7.f24131a) : -1;
        String str2 = o82.f22787n;
        if (str2 != null) {
            c0153f9.f23863l = str2.getBytes();
        }
        EnumC0128ea enumC0128ea = o82.f22789p;
        Integer num2 = enumC0128ea != null ? (Integer) f23118h.get(enumC0128ea) : null;
        if (num2 != null) {
            c0153f9.f23864m = num2.intValue();
        }
        EnumC0356n9 enumC0356n9 = o82.f22790q;
        if (enumC0356n9 != null) {
            int iOrdinal = enumC0356n9.ordinal();
            if (iOrdinal == 0) {
                c0153f9.f23867p = 0;
            } else if (iOrdinal == 1) {
                c0153f9.f23867p = 1;
            } else if (iOrdinal == 2) {
                c0153f9.f23867p = 2;
            }
        }
        Boolean bool = o82.f22791r;
        if (bool != null) {
            c0153f9.f23868q = bool.booleanValue();
        }
        if (o82.f22792s != null) {
            c0153f9.f23869r = r6.intValue();
        }
        c0153f9.f23870s = ((C0257ja) this.f23125g).a(o82.f22793t);
        return c0153f9;
    }

    public V8(InterfaceC0609xd interfaceC0609xd, so soVar, InterfaceC0654z8 interfaceC0654z8, InterfaceC0530u9 interfaceC0530u9, Wb wb2, Ud ud2, O9 o92) {
        this.f23119a = interfaceC0609xd;
        this.f23120b = soVar;
        this.f23121c = interfaceC0654z8;
        this.f23122d = interfaceC0530u9;
        this.f23123e = wb2;
        this.f23124f = ud2;
        this.f23125g = o92;
    }

    public static U8 a() {
        return new U8(i);
    }
}

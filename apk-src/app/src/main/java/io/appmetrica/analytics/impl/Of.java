package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f22801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray f22802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f22803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f22804d;

    static {
        HashMap map = new HashMap();
        Uk uk2 = Uk.FOREGROUND;
        map.put(uk2, 0);
        Uk uk3 = Uk.BACKGROUND;
        map.put(uk3, 1);
        f22801a = Collections.unmodifiableMap(map);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, uk2);
        sparseArray.put(1, uk3);
        f22802b = sparseArray;
        HashMap map2 = new HashMap();
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_INIT;
        map2.put(enumC0078cb, 1);
        EnumC0078cb enumC0078cb2 = EnumC0078cb.EVENT_TYPE_REGULAR;
        map2.put(enumC0078cb2, 4);
        EnumC0078cb enumC0078cb3 = EnumC0078cb.EVENT_TYPE_SEND_REFERRER;
        map2.put(enumC0078cb3, 5);
        EnumC0078cb enumC0078cb4 = EnumC0078cb.EVENT_TYPE_ALIVE;
        map2.put(enumC0078cb4, 7);
        EnumC0078cb enumC0078cb5 = EnumC0078cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(enumC0078cb5, 26);
        EnumC0078cb enumC0078cb6 = EnumC0078cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC0078cb6, 26);
        EnumC0078cb enumC0078cb7 = EnumC0078cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC0078cb7, 26);
        EnumC0078cb enumC0078cb8 = EnumC0078cb.EVENT_TYPE_ANR;
        map2.put(enumC0078cb8, 25);
        EnumC0078cb enumC0078cb9 = EnumC0078cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC0078cb9, 26);
        EnumC0078cb enumC0078cb10 = EnumC0078cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC0078cb10, 26);
        EnumC0078cb enumC0078cb11 = EnumC0078cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(enumC0078cb11, 27);
        EnumC0078cb enumC0078cb12 = EnumC0078cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(enumC0078cb12, 27);
        EnumC0078cb enumC0078cb13 = EnumC0078cb.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(enumC0078cb13, 13);
        EnumC0078cb enumC0078cb14 = EnumC0078cb.EVENT_TYPE_START;
        map2.put(enumC0078cb14, 2);
        EnumC0078cb enumC0078cb15 = EnumC0078cb.EVENT_TYPE_APP_OPEN;
        map2.put(enumC0078cb15, 16);
        EnumC0078cb enumC0078cb16 = EnumC0078cb.EVENT_TYPE_APP_UPDATE;
        map2.put(enumC0078cb16, 17);
        EnumC0078cb enumC0078cb17 = EnumC0078cb.EVENT_TYPE_PERMISSIONS;
        map2.put(enumC0078cb17, 18);
        EnumC0078cb enumC0078cb18 = EnumC0078cb.EVENT_TYPE_APP_FEATURES;
        map2.put(enumC0078cb18, 19);
        EnumC0078cb enumC0078cb19 = EnumC0078cb.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(enumC0078cb19, 20);
        EnumC0078cb enumC0078cb20 = EnumC0078cb.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(enumC0078cb20, 21);
        EnumC0078cb enumC0078cb21 = EnumC0078cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(enumC0078cb21, 40);
        EnumC0078cb enumC0078cb22 = EnumC0078cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(enumC0078cb22, 35);
        map2.put(EnumC0078cb.EVENT_TYPE_CLEANUP, 29);
        EnumC0078cb enumC0078cb23 = EnumC0078cb.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(enumC0078cb23, 38);
        EnumC0078cb enumC0078cb24 = EnumC0078cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        map2.put(enumC0078cb24, 42);
        f22803c = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        C0604x8 c0604x8 = new C0604x8();
        D8 d82 = new D8(new I8());
        C0629y8 c0629y8 = new C0629y8();
        C0096d3 c0096d3 = new C0096d3(new I8());
        On on = new On(new I8());
        Kf kf2 = new Kf();
        U8 u8A = V8.a();
        u8A.f23065b = kf2;
        u8A.f23066c = kf2;
        V8 v82 = new V8(u8A);
        U8 u8A2 = V8.a();
        u8A2.f23065b = d82;
        V8 v83 = new V8(u8A2);
        U8 u8A3 = V8.a();
        u8A3.f23065b = c0096d3;
        V8 v84 = new V8(u8A3);
        U8 u8A4 = V8.a();
        u8A4.f23065b = on;
        V8 v85 = new V8(u8A4);
        U8 u8A5 = V8.a();
        u8A5.f23064a = c0604x8;
        V8 v86 = new V8(u8A5);
        U8 u8A6 = V8.a();
        u8A6.f23065b = new to(new D8());
        V8 v87 = new V8(u8A6);
        map3.put(enumC0078cb2, v83);
        U8 u8A7 = V8.a();
        u8A7.f23065b = new Mf();
        map3.put(enumC0078cb3, new V8(u8A7));
        U8 u8A8 = V8.a();
        u8A8.f23064a = c0604x8;
        u8A8.f23065b = c0629y8;
        u8A8.f23068e = new X7();
        u8A8.f23069f = new Y7();
        map3.put(enumC0078cb4, new V8(u8A8));
        map3.put(enumC0078cb9, v82);
        map3.put(enumC0078cb10, v82);
        map3.put(enumC0078cb11, v84);
        map3.put(enumC0078cb12, v84);
        map3.put(enumC0078cb5, v84);
        map3.put(enumC0078cb6, v84);
        map3.put(enumC0078cb7, v84);
        map3.put(enumC0078cb8, v84);
        U8 u8A9 = V8.a();
        u8A9.f23064a = new C0604x8();
        u8A9.f23065b = c0096d3;
        map3.put(enumC0078cb14, new V8(u8A9));
        EnumC0078cb enumC0078cb25 = EnumC0078cb.EVENT_TYPE_CUSTOM_EVENT;
        U8 u8A10 = V8.a();
        u8A10.f23067d = new Nf();
        map3.put(enumC0078cb25, new V8(u8A10));
        map3.put(enumC0078cb15, v83);
        map3.put(enumC0078cb17, v86);
        map3.put(enumC0078cb18, v86);
        map3.put(enumC0078cb19, v84);
        map3.put(enumC0078cb20, v84);
        map3.put(enumC0078cb21, v84);
        map3.put(enumC0078cb22, v85);
        map3.put(enumC0078cb, v87);
        map3.put(enumC0078cb16, v87);
        map3.put(enumC0078cb13, v83);
        map3.put(enumC0078cb23, v83);
        map3.put(enumC0078cb24, v84);
        f22804d = Collections.unmodifiableMap(map3);
    }

    public static C0256j9 a(Long l10, Long l11, Boolean bool) {
        C0256j9 c0256j9 = new C0256j9();
        if (l10 != null) {
            c0256j9.f24144a = l10.longValue();
            c0256j9.f24145b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l10.longValue() * 1000) / 1000;
        }
        if (l11 != null) {
            c0256j9.f24146c = l11.longValue();
        }
        if (bool != null) {
            c0256j9.f24147d = bool.booleanValue();
        }
        return c0256j9;
    }

    public static void a(C0205h9 c0205h9) {
        C0153f9[] c0153f9Arr = c0205h9.f23983c;
        if (c0153f9Arr != null) {
            for (C0153f9 c0153f9 : c0153f9Arr) {
            }
        }
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0605x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f25010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumSet f25011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumSet f25012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumSet f25013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumSet f25014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumSet f25015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumSet f25016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumSet f25017h;
    public static final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f25018j;

    static {
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC0078cb enumC0078cb2 = EnumC0078cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC0078cb enumC0078cb3 = EnumC0078cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC0078cb enumC0078cb4 = EnumC0078cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0078cb enumC0078cb5 = EnumC0078cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0078cb enumC0078cb6 = EnumC0078cb.EVENT_TYPE_ANR;
        f25010a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC0078cb enumC0078cb7 = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        EnumC0078cb enumC0078cb8 = EnumC0078cb.EVENT_TYPE_PURGE_BUFFER;
        EnumC0078cb enumC0078cb9 = EnumC0078cb.EVENT_TYPE_SEND_REFERRER;
        EnumC0078cb enumC0078cb10 = EnumC0078cb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC0078cb enumC0078cb11 = EnumC0078cb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC0078cb enumC0078cb12 = EnumC0078cb.EVENT_TYPE_ACTIVATION;
        EnumC0078cb enumC0078cb13 = EnumC0078cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC0078cb enumC0078cb14 = EnumC0078cb.EVENT_TYPE_SET_SESSION_EXTRA;
        f25011b = EnumSet.of(enumC0078cb7, enumC0078cb8, enumC0078cb9, enumC0078cb10, enumC0078cb11, enumC0078cb12, enumC0078cb13, enumC0078cb5, enumC0078cb14);
        EnumC0078cb enumC0078cb15 = EnumC0078cb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC0078cb enumC0078cb16 = EnumC0078cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f25012c = EnumSet.of(enumC0078cb15, enumC0078cb4, enumC0078cb5, enumC0078cb13, enumC0078cb16);
        EnumC0078cb enumC0078cb17 = EnumC0078cb.EVENT_TYPE_REGULAR;
        f25013d = EnumSet.of(enumC0078cb4, enumC0078cb5, enumC0078cb3, enumC0078cb, enumC0078cb2, enumC0078cb16, enumC0078cb13, enumC0078cb17, EnumC0078cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC0078cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC0078cb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC0078cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC0078cb8, EnumC0078cb.EVENT_TYPE_INIT, EnumC0078cb.EVENT_TYPE_SEND_USER_PROFILE, EnumC0078cb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC0078cb9, enumC0078cb10, enumC0078cb11, EnumC0078cb.EVENT_TYPE_FIRST_ACTIVATION, EnumC0078cb.EVENT_TYPE_START, EnumC0078cb.EVENT_TYPE_APP_OPEN, EnumC0078cb.EVENT_TYPE_APP_UPDATE, enumC0078cb6);
        f25014e = EnumSet.of(enumC0078cb17);
        f25015f = EnumSet.of(enumC0078cb17);
        f25016g = EnumSet.of(enumC0078cb13);
        f25017h = EnumSet.of(EnumC0078cb.EVENT_TYPE_ALIVE, enumC0078cb8, enumC0078cb14, enumC0078cb5, enumC0078cb13);
        i = Arrays.asList(0, 6145, 4097, 8224);
        f25018j = Arrays.asList(12290);
    }
}

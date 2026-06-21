package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0226i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24043a;

    static {
        int[] iArr = new int[CounterConfigurationReporterType.values().length];
        iArr[CounterConfigurationReporterType.COMMUTATION.ordinal()] = 1;
        iArr[CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN.ordinal()] = 2;
        iArr[CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL.ordinal()] = 3;
        iArr[CounterConfigurationReporterType.MANUAL.ordinal()] = 4;
        iArr[CounterConfigurationReporterType.SELF_SDK.ordinal()] = 5;
        iArr[CounterConfigurationReporterType.MAIN.ordinal()] = 6;
        iArr[CounterConfigurationReporterType.CRASH.ordinal()] = 7;
        f24043a = iArr;
    }
}

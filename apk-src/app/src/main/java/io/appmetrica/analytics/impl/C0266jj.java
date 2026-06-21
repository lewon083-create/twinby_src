package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0266jj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f24175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f24176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0341mj f24177d;

    public C0266jj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C0341mj c0341mj) {
        this.f24174a = str;
        this.f24175b = context;
        int i = AbstractC0240ij.f24092a[counterConfigurationReporterType.ordinal()];
        if (i == 1) {
            this.f24176c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i != 2) {
            this.f24176c = null;
        } else {
            this.f24176c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f24177d = c0341mj;
    }
}

package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductType;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21529b;

    static {
        int[] iArr = new int[ProductType.values().length];
        iArr[ProductType.INAPP.ordinal()] = 1;
        iArr[ProductType.SUBS.ordinal()] = 2;
        f21528a = iArr;
        int[] iArr2 = new int[Period.TimeUnit.values().length];
        iArr2[Period.TimeUnit.DAY.ordinal()] = 1;
        iArr2[Period.TimeUnit.WEEK.ordinal()] = 2;
        iArr2[Period.TimeUnit.MONTH.ordinal()] = 3;
        iArr2[Period.TimeUnit.YEAR.ordinal()] = 4;
        f21529b = iArr2;
    }
}

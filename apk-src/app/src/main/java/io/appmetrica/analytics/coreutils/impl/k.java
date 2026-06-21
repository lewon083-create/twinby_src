package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f21777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f21778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i, int i10) {
        super(0);
        this.f21777a = context;
        this.f21778b = componentName;
        this.f21779c = i;
        this.f21780d = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f21777a.getPackageManager().setComponentEnabledSetting(this.f21778b, this.f21779c, this.f21780d);
        return Unit.f27471a;
    }
}

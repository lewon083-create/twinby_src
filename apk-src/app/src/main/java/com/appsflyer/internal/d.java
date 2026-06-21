package com.appsflyer.internal;

import com.appsflyer.internal.AFa1ySDK;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2462c;

    public /* synthetic */ d(int i, Object obj) {
        this.f2461b = i;
        this.f2462c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2461b) {
            case 0:
                return ((AFa1ySDK.AFa1zSDK) this.f2462c).getMediationNetwork();
            default:
                return ((AFc1bSDK) this.f2462c).o_();
        }
    }
}

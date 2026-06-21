package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jp implements J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24188b;

    public /* synthetic */ jp(int i, Object obj) {
        this.f24187a = i;
        this.f24188b = obj;
    }

    @Override // io.appmetrica.analytics.impl.J1
    public final void a(Intent intent) {
        switch (this.f24187a) {
            case 0:
                C0028ad.a((ModuleServiceLifecycleObserver) this.f24188b, intent);
                break;
            case 1:
                C0028ad.b((ModuleServiceLifecycleObserver) this.f24188b, intent);
                break;
            default:
                ((C1) this.f24188b).d(intent);
                break;
        }
    }
}

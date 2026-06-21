package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hp implements InterfaceC0029ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Vk f24031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f24032c;

    public /* synthetic */ hp(Vk vk2, Activity activity, int i) {
        this.f24030a = i;
        this.f24031b = vk2;
        this.f24032c = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0029ae
    public final void consume(Object obj) {
        switch (this.f24030a) {
            case 0:
                this.f24031b.b(this.f24032c, (C0234ic) obj);
                break;
            default:
                this.f24031b.a(this.f24032c, (C0234ic) obj);
                break;
        }
    }
}

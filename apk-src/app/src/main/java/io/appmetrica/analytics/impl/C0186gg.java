package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0186gg implements InstallReferrerStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0212hg f23937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0462rg f23938b;

    public C0186gg(C0212hg c0212hg, InterfaceC0462rg interfaceC0462rg) {
        this.f23937a = c0212hg;
        this.f23938b = interfaceC0462rg;
    }

    public static final void a(C0212hg c0212hg, InterfaceC0462rg interfaceC0462rg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c0212hg.f23989b.getInstallReferrer();
                interfaceC0462rg.a(new C0338mg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC0313lg.f24302c));
                installReferrerClient = c0212hg.f23989b;
            } catch (Throwable th2) {
                try {
                    interfaceC0462rg.a(th2);
                    installReferrerClient = c0212hg.f23989b;
                } finally {
                }
            }
            installReferrerClient.endConnection();
        } catch (Throwable unused) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        if (i != 0) {
            this.f23937a.a(this.f23938b, new IllegalStateException(l7.o.i(i, "Referrer check failed with error ")));
            return;
        }
        C0212hg c0212hg = this.f23937a;
        c0212hg.f23988a.execute(new cp(2, c0212hg, this.f23938b));
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }
}

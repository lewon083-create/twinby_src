package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbwl implements MediationInterstitialAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f13164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w9.j f13165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f13166c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        u9.i.c("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        u9.i.c("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        u9.i.c("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, w9.j jVar, Bundle bundle, w9.d dVar, Bundle bundle2) {
        this.f13165b = jVar;
        if (jVar == null) {
            u9.i.h("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            u9.i.h("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((oq0) this.f13165b).e();
            return;
        }
        if (!jl.a(context)) {
            u9.i.h("Default browser does not support custom tabs. Bailing out.");
            ((oq0) this.f13165b).e();
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            u9.i.h("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            ((oq0) this.f13165b).e();
            return;
        }
        this.f13164a = (Activity) context;
        this.f13166c = Uri.parse(string);
        oq0 oq0Var = (oq0) this.f13165b;
        oq0Var.getClass();
        pa.c0.e("#008 Must be called on the main UI thread.");
        u9.i.c("Adapter called onAdLoaded.");
        try {
            ((nr) oq0Var.f8762c).d();
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        l6.i iVarA = new b7().a();
        ((Intent) iVarA.f27978c).setData(this.f13166c);
        t9.g0.f33596l.post(new l81(8, this, new AdOverlayInfoParcel(new s9.e((Intent) iVarA.f27978c, null), null, new us(this), null, new u9.a(0, 0, false), null, null, ""), false));
        p9.k kVar = p9.k.C;
        ax axVar = kVar.f31302h.f3951m;
        axVar.getClass();
        kVar.f31304k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (axVar.f3446a) {
            try {
                if (axVar.f3448c == 3) {
                    if (axVar.f3447b + ((Long) q9.s.f31967e.f31970c.a(al.K6)).longValue() <= jCurrentTimeMillis) {
                        axVar.f3448c = 1;
                    }
                }
            } finally {
            }
        }
        kVar.f31304k.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (axVar.f3446a) {
            try {
                if (axVar.f3448c != 2) {
                    return;
                }
                axVar.f3448c = 3;
                if (axVar.f3448c == 3) {
                    axVar.f3447b = jCurrentTimeMillis2;
                }
            } finally {
            }
        }
    }
}

package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.zl;
import java.util.Iterator;
import java.util.Set;
import k9.f;
import k9.g;
import k9.j;
import k9.t;
import k9.w;
import q9.b2;
import q9.e2;
import q9.g2;
import q9.l0;
import q9.r;
import q9.s;
import u9.i;
import w9.h;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private k9.e adLoader;
    protected j mAdView;
    protected v9.a mInterstitialAd;

    public g buildAdRequest(Context context, w9.d dVar, Bundle bundle, Bundle bundle2) {
        f fVar = new f(2);
        e2 e2Var = (e2) fVar.f15951b;
        Set setD = dVar.d();
        if (setD != null) {
            Iterator it = setD.iterator();
            while (it.hasNext()) {
                e2Var.f31827a.add((String) it.next());
            }
        }
        if (dVar.c()) {
            u9.d dVar2 = r.f31959g.f31960a;
            e2Var.f31830d.add(u9.d.c(context));
        }
        if (dVar.a() != -1) {
            e2Var.f31836k = dVar.a() != 1 ? 0 : 1;
        }
        e2Var.f31837l = dVar.b();
        fVar.r(buildExtrasBundle(bundle, bundle2), AdMobAdapter.class);
        return new g(fVar);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public v9.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public b2 getVideoController() {
        b2 b2Var;
        j jVar = this.mAdView;
        if (jVar == null) {
            return null;
        }
        t tVar = jVar.f27273b.f31863c;
        synchronized (tVar.f27287a) {
            b2Var = tVar.f27288b;
        }
        return b2Var;
    }

    public k9.d newAdLoader(Context context, String str) {
        return new k9.d(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, w9.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        j jVar = this.mAdView;
        if (jVar != null) {
            jVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z5) {
        v9.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.d(z5);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, w9.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        j jVar = this.mAdView;
        if (jVar != null) {
            al.a(jVar.getContext());
            if (((Boolean) zl.f13031g.r()).booleanValue()) {
                if (((Boolean) s.f31967e.f31970c.a(al.f3185rc)).booleanValue()) {
                    u9.b.f34371b.execute(new w(jVar, 0));
                    return;
                }
            }
            g2 g2Var = jVar.f27273b;
            g2Var.getClass();
            try {
                l0 l0Var = g2Var.i;
                if (l0Var != null) {
                    l0Var.c();
                }
            } catch (RemoteException e3) {
                i.k("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, w9.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        j jVar = this.mAdView;
        if (jVar != null) {
            al.a(jVar.getContext());
            if (((Boolean) zl.f13032h.r()).booleanValue()) {
                if (((Boolean) s.f31967e.f31970c.a(al.f3156pc)).booleanValue()) {
                    u9.b.f34371b.execute(new w(jVar, 1));
                    return;
                }
            }
            g2 g2Var = jVar.f27273b;
            g2Var.getClass();
            try {
                l0 l0Var = g2Var.i;
                if (l0Var != null) {
                    l0Var.k();
                }
            } catch (RemoteException e3) {
                i.k("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, h hVar, Bundle bundle, k9.h hVar2, w9.d dVar, Bundle bundle2) {
        j jVar = new j(context);
        this.mAdView = jVar;
        jVar.setAdSize(new k9.h(hVar2.f27263a, hVar2.f27264b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, hVar));
        this.mAdView.b(buildAdRequest(context, dVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, w9.j jVar, Bundle bundle, w9.d dVar, Bundle bundle2) {
        v9.a.b(context, getAdUnitId(bundle), buildAdRequest(context, dVar, bundle2, bundle), new c(this, jVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void requestNativeAd(android.content.Context r17, w9.l r18, android.os.Bundle r19, w9.n r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.AbstractAdViewAdapter.requestNativeAd(android.content.Context, w9.l, android.os.Bundle, w9.n, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        v9.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.e(null);
        }
    }
}

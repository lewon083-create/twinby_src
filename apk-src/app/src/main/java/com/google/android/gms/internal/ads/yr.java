package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yr extends ug implements kr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public oq0 f12692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yu f12693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xa.a f12694e;

    public yr() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static final boolean n4(q9.d3 d3Var) {
        if (d3Var.f31806g) {
            return true;
        }
        u9.d dVar = q9.r.f31959g.f31960a;
        return u9.d.q();
    }

    public static final String o4(String str, q9.d3 d3Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return d3Var.f31820v;
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void C2(xa.a aVar) throws RemoteException {
        Object obj = this.f12691b;
        if (obj instanceof w9.a) {
            u9.i.c("Show rewarded ad from adapter.");
            u9.i.e("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = w9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        u9.i.h(sb2.toString());
        throw new RemoteException();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    @Override // com.google.android.gms.internal.ads.kr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D2(xa.a r7, com.google.android.gms.internal.ads.rp r8, java.util.ArrayList r9) throws android.os.RemoteException {
        /*
            r6 = this;
            java.lang.Object r8 = r6.f12691b
            boolean r0 = r8 instanceof w9.a
            if (r0 == 0) goto La2
            com.google.android.gms.internal.ads.fp r0 = new com.google.android.gms.internal.ads.fp
            r1 = 9
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L16:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r9.next()
            com.google.android.gms.internal.ads.vp r2 = (com.google.android.gms.internal.ads.vp) r2
            java.lang.String r2 = r2.f11435b
            int r3 = r2.hashCode()
            r4 = 0
            k9.a r5 = k9.a.APP_OPEN_AD
            switch(r3) {
                case -1396342996: goto L80;
                case -1052618729: goto L75;
                case -239580146: goto L6a;
                case 604727084: goto L5f;
                case 1167692200: goto L56;
                case 1778294298: goto L3a;
                case 1911491517: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L8a
        L2f:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8a
            k9.a r4 = k9.a.REWARDED_INTERSTITIAL
            goto L8a
        L3a:
            java.lang.String r3 = "app_open_ad"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8a
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.internal.ads.al.f2945bd
            q9.s r3 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r3 = r3.f31970c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L8a
        L54:
            r4 = r5
            goto L8a
        L56:
            java.lang.String r3 = "app_open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8a
            goto L54
        L5f:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8a
            k9.a r4 = k9.a.INTERSTITIAL
            goto L8a
        L6a:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8a
            k9.a r4 = k9.a.REWARDED
            goto L8a
        L75:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8a
            k9.a r4 = k9.a.NATIVE
            goto L8a
        L80:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8a
            k9.a r4 = k9.a.BANNER
        L8a:
            if (r4 == 0) goto L16
            t.t0 r2 = new t.t0
            r3 = 4
            r2.<init>(r3)
            r1.add(r2)
            goto L16
        L96:
            w9.a r8 = (w9.a) r8
            java.lang.Object r7 = xa.b.X1(r7)
            android.content.Context r7 = (android.content.Context) r7
            r8.initialize(r7, r0, r1)
            return
        La2:
            android.os.RemoteException r7 = new android.os.RemoteException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yr.D2(xa.a, com.google.android.gms.internal.ads.rp, java.util.ArrayList):void");
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final boolean G() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final q9.b2 J() {
        Object obj = this.f12691b;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th2) {
                u9.i.f("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void K() throws RemoteException {
        Object obj = this.f12691b;
        if (obj instanceof w9.a) {
            u9.i.e("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = w9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        u9.i.h(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final sr M() {
        oq0 oq0Var;
        com.google.ads.mediation.a aVar;
        if (!(this.f12691b instanceof MediationNativeAdapter) || (oq0Var = this.f12692c) == null || (aVar = (com.google.ads.mediation.a) oq0Var.f8763d) == null) {
            return null;
        }
        return new cs(aVar);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void M1(xa.a aVar, q9.d3 d3Var, String str, String str2, nr nrVar) throws RemoteException {
        Object obj = this.f12691b;
        boolean z5 = obj instanceof MediationInterstitialAdapter;
        if (!z5 && !(obj instanceof w9.a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = w9.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            l7.o.t(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            u9.i.h(sb2.toString());
            throw new RemoteException();
        }
        u9.i.c("Requesting interstitial ad from adapter.");
        if (!z5) {
            if (obj instanceof w9.a) {
                try {
                    wr wrVar = new wr(this, nrVar, 0);
                    l4(str, d3Var, str2);
                    m4(d3Var);
                    n4(d3Var);
                    o4(str, d3Var);
                    ((w9.a) obj).loadInterstitialAd(new w9.i(), wrVar);
                    return;
                } catch (Throwable th2) {
                    u9.i.f("", th2);
                    gr.w(aVar, th2, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = d3Var.f31805f;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = d3Var.f31802c;
            if (j10 != -1) {
                new Date(j10);
            }
            boolean zN4 = n4(d3Var);
            int i = d3Var.f31807h;
            boolean z10 = d3Var.f31817s;
            o4(str, d3Var);
            ur urVar = new ur(hashSet, zN4, i, z10);
            Bundle bundle = d3Var.f31812n;
            mediationInterstitialAdapter.requestInterstitialAd((Context) xa.b.X1(aVar), new oq0(nrVar), l4(str, d3Var, str2), urVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            u9.i.f("", th3);
            gr.w(aVar, th3, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final ts N() {
        Object obj = this.f12691b;
        if (!(obj instanceof w9.a)) {
            return null;
        }
        k9.s versionInfo = ((w9.a) obj).getVersionInfo();
        return new ts(versionInfo.f27284a, versionInfo.f27285b, versionInfo.f27286c);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void P1(xa.a aVar, q9.d3 d3Var, String str, nr nrVar) throws RemoteException {
        Object obj = this.f12691b;
        if (!(obj instanceof w9.a)) {
            String canonicalName = w9.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            u9.i.h(sb2.toString());
            throw new RemoteException();
        }
        u9.i.c("Requesting app open ad from adapter.");
        try {
            xr xrVar = new xr(this, nrVar, 1);
            l4(str, d3Var, null);
            m4(d3Var);
            n4(d3Var);
            o4(str, d3Var);
            ((w9.a) obj).loadAppOpenAd(new w9.f(), xrVar);
        } catch (Exception e3) {
            u9.i.f("", e3);
            gr.w(aVar, e3, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final pr S() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void S0(xa.a aVar, q9.d3 d3Var, String str, String str2, nr nrVar, wm wmVar, ArrayList arrayList) throws RemoteException {
        Object obj = this.f12691b;
        boolean z5 = obj instanceof MediationNativeAdapter;
        if (!z5 && !(obj instanceof w9.a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = w9.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            l7.o.t(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            u9.i.h(sb2.toString());
            throw new RemoteException();
        }
        u9.i.c("Requesting native ad from adapter.");
        if (z5) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list = d3Var.f31805f;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j10 = d3Var.f31802c;
                if (j10 != -1) {
                    new Date(j10);
                }
                boolean zN4 = n4(d3Var);
                int i = d3Var.f31807h;
                boolean z10 = d3Var.f31817s;
                o4(str, d3Var);
                as asVar = new as(hashSet, zN4, i, wmVar, arrayList, z10);
                Bundle bundle = d3Var.f31812n;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f12692c = new oq0(nrVar);
                mediationNativeAdapter.requestNativeAd((Context) xa.b.X1(aVar), this.f12692c, l4(str, d3Var, str2), asVar, bundle2);
                return;
            } catch (Throwable th2) {
                u9.i.f("", th2);
                gr.w(aVar, th2, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj instanceof w9.a) {
            try {
                vr vrVar = new vr(this, nrVar, 1);
                l4(str, d3Var, str2);
                m4(d3Var);
                n4(d3Var);
                o4(str, d3Var);
                ((w9.a) obj).loadNativeAdMapper(new w9.k(), vrVar);
            } catch (Throwable th3) {
                u9.i.f("", th3);
                gr.w(aVar, th3, "adapter.loadNativeAdMapper");
                String message = th3.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    xr xrVar = new xr(this, nrVar, 0);
                    l4(str, d3Var, str2);
                    m4(d3Var);
                    n4(d3Var);
                    o4(str, d3Var);
                    ((w9.a) obj).loadNativeAd(new w9.k(), xrVar);
                } catch (Throwable th4) {
                    u9.i.f("", th4);
                    gr.w(aVar, th4, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void S1(xa.a aVar, q9.d3 d3Var, yu yuVar, String str) throws RemoteException {
        Object obj = this.f12691b;
        if ((obj instanceof w9.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f12694e = aVar;
            this.f12693d = yuVar;
            yuVar.H1(new xa.b(obj));
            return;
        }
        String canonicalName = w9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        u9.i.h(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void Y1(xa.a aVar, yu yuVar, List list) throws RemoteException {
        u9.i.h("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final xa.a c() throws RemoteException {
        Object obj = this.f12691b;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new xa.b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th2) {
                u9.i.f("", th2);
                throw new RemoteException();
            }
        }
        if (obj instanceof w9.a) {
            return new xa.b(null);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = w9.a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        l7.o.t(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb2.append(canonicalName3);
        u9.i.h(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void d1(xa.a aVar, q9.d3 d3Var, String str, nr nrVar) throws RemoteException {
        Object obj = this.f12691b;
        if (!(obj instanceof w9.a)) {
            String canonicalName = w9.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            u9.i.h(sb2.toString());
            throw new RemoteException();
        }
        u9.i.c("Requesting rewarded ad from adapter.");
        try {
            wr wrVar = new wr(this, nrVar, 1);
            l4(str, d3Var, null);
            m4(d3Var);
            n4(d3Var);
            o4(str, d3Var);
            ((w9.a) obj).loadRewardedAd(new w9.m(), wrVar);
        } catch (Exception e3) {
            u9.i.f("", e3);
            gr.w(aVar, e3, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void e() throws RemoteException {
        Object obj = this.f12691b;
        if (obj instanceof w9.e) {
            try {
                ((w9.e) obj).onPause();
            } catch (Throwable th2) {
                u9.i.f("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void f() throws RemoteException {
        Object obj = this.f12691b;
        if (obj instanceof w9.e) {
            try {
                ((w9.e) obj).onDestroy();
            } catch (Throwable th2) {
                u9.i.f("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void h2(boolean z5) {
        Object obj = this.f12691b;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z5);
                return;
            } catch (Throwable th2) {
                u9.i.f("", th2);
                return;
            }
        }
        String canonicalName = AbstractAdViewAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        u9.i.c(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void h4(xa.a aVar) throws RemoteException {
        Object obj = this.f12691b;
        if (obj instanceof w9.a) {
            u9.i.c("Show app open ad from adapter.");
            u9.i.e("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = w9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        u9.i.h(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        nr lrVar;
        nr lrVar2;
        nr lrVar3;
        nr lrVar4;
        yu wuVar;
        nr lrVar5;
        yu wuVar2;
        kx0 kx0Var;
        nr lrVar6;
        rp qpVar;
        nr lrVar7;
        nr lrVar8;
        nr lrVar9 = null;
        switch (i) {
            case 1:
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                q9.g3 g3Var = (q9.g3) vg.b(parcel, q9.g3.CREATOR);
                q9.d3 d3Var = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    lrVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    lrVar = iInterfaceQueryLocalInterface instanceof nr ? (nr) iInterfaceQueryLocalInterface : new lr(strongBinder);
                }
                vg.f(parcel);
                z0(aVarL1, g3Var, d3Var, string, null, lrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                xa.a aVarC = c();
                parcel2.writeNoException();
                vg.e(parcel2, aVarC);
                return true;
            case 3:
                xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
                q9.d3 d3Var2 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    lrVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    lrVar2 = iInterfaceQueryLocalInterface2 instanceof nr ? (nr) iInterfaceQueryLocalInterface2 : new lr(strongBinder2);
                }
                vg.f(parcel);
                M1(aVarL12, d3Var2, string2, null, lrVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                m();
                parcel2.writeNoException();
                return true;
            case 5:
                f();
                parcel2.writeNoException();
                return true;
            case 6:
                xa.a aVarL13 = xa.b.L1(parcel.readStrongBinder());
                q9.g3 g3Var2 = (q9.g3) vg.b(parcel, q9.g3.CREATOR);
                q9.d3 d3Var3 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    lrVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    lrVar3 = iInterfaceQueryLocalInterface3 instanceof nr ? (nr) iInterfaceQueryLocalInterface3 : new lr(strongBinder3);
                }
                vg.f(parcel);
                z0(aVarL13, g3Var2, d3Var3, string3, string4, lrVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                xa.a aVarL14 = xa.b.L1(parcel.readStrongBinder());
                q9.d3 d3Var4 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    lrVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    lrVar4 = iInterfaceQueryLocalInterface4 instanceof nr ? (nr) iInterfaceQueryLocalInterface4 : new lr(strongBinder4);
                }
                vg.f(parcel);
                M1(aVarL14, d3Var4, string5, string6, lrVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                e();
                parcel2.writeNoException();
                return true;
            case 9:
                p();
                parcel2.writeNoException();
                return true;
            case 10:
                xa.a aVarL15 = xa.b.L1(parcel.readStrongBinder());
                q9.d3 d3Var5 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    wuVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    wuVar = iInterfaceQueryLocalInterface5 instanceof yu ? (yu) iInterfaceQueryLocalInterface5 : new wu(strongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 1);
                }
                String string7 = parcel.readString();
                vg.f(parcel);
                S1(aVarL15, d3Var5, wuVar, string7);
                parcel2.writeNoException();
                return true;
            case 11:
                q9.d3 d3Var6 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                String string8 = parcel.readString();
                vg.f(parcel);
                p4(string8, d3Var6);
                parcel2.writeNoException();
                return true;
            case 12:
                K();
                throw null;
            case 13:
                boolean zO = o();
                parcel2.writeNoException();
                ClassLoader classLoader = vg.f11374a;
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 14:
                xa.a aVarL16 = xa.b.L1(parcel.readStrongBinder());
                q9.d3 d3Var7 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    lrVar5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    lrVar5 = iInterfaceQueryLocalInterface6 instanceof nr ? (nr) iInterfaceQueryLocalInterface6 : new lr(strongBinder6);
                }
                wm wmVar = (wm) vg.b(parcel, wm.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                vg.f(parcel);
                S0(aVarL16, d3Var7, string9, string10, lrVar5, wmVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = vg.f11374a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = vg.f11374a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                vg.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                vg.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                vg.d(parcel2, bundle3);
                return true;
            case 20:
                q9.d3 d3Var8 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                String string11 = parcel.readString();
                parcel.readString();
                vg.f(parcel);
                p4(string11, d3Var8);
                parcel2.writeNoException();
                return true;
            case 21:
                xa.a aVarL17 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                m0(aVarL17);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = vg.f11374a;
                parcel2.writeInt(0);
                return true;
            case 23:
                xa.a aVarL18 = xa.b.L1(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    wuVar2 = iInterfaceQueryLocalInterface7 instanceof yu ? (yu) iInterfaceQueryLocalInterface7 : new wu(strongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 1);
                } else {
                    wuVar2 = null;
                }
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                vg.f(parcel);
                Y1(aVarL18, wuVar2, arrayListCreateStringArrayList2);
                throw null;
            case 24:
                oq0 oq0Var = this.f12692c;
                qn qnVar = (oq0Var == null || (kx0Var = (kx0) oq0Var.f8764e) == null) ? null : (qn) kx0Var.f7326c;
                parcel2.writeNoException();
                vg.e(parcel2, qnVar);
                return true;
            case 25:
                boolean zA = vg.a(parcel);
                vg.f(parcel);
                h2(zA);
                parcel2.writeNoException();
                return true;
            case 26:
                q9.b2 b2VarJ = J();
                parcel2.writeNoException();
                vg.e(parcel2, b2VarJ);
                return true;
            case 27:
                sr srVarM = M();
                parcel2.writeNoException();
                vg.e(parcel2, srVarM);
                return true;
            case 28:
                xa.a aVarL19 = xa.b.L1(parcel.readStrongBinder());
                q9.d3 d3Var9 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                String string12 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    lrVar6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    lrVar6 = iInterfaceQueryLocalInterface8 instanceof nr ? (nr) iInterfaceQueryLocalInterface8 : new lr(strongBinder8);
                }
                vg.f(parcel);
                d1(aVarL19, d3Var9, string12, lrVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                xa.a aVarL110 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                C2(aVarL110);
                throw null;
            case 31:
                xa.a aVarL111 = xa.b.L1(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 == null) {
                    qpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    qpVar = iInterfaceQueryLocalInterface9 instanceof rp ? (rp) iInterfaceQueryLocalInterface9 : new qp(strongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback", 1);
                }
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(vp.CREATOR);
                vg.f(parcel);
                D2(aVarL111, qpVar, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                xa.a aVarL112 = xa.b.L1(parcel.readStrongBinder());
                q9.d3 d3Var10 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                String string13 = parcel.readString();
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 == null) {
                    lrVar7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    lrVar7 = iInterfaceQueryLocalInterface10 instanceof nr ? (nr) iInterfaceQueryLocalInterface10 : new lr(strongBinder10);
                }
                vg.f(parcel);
                v2(aVarL112, d3Var10, string13, lrVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                ts tsVarN = N();
                parcel2.writeNoException();
                vg.d(parcel2, tsVarN);
                return true;
            case 34:
                ts tsVarT0 = t0();
                parcel2.writeNoException();
                vg.d(parcel2, tsVarT0);
                return true;
            case 35:
                xa.a aVarL113 = xa.b.L1(parcel.readStrongBinder());
                q9.g3 g3Var3 = (q9.g3) vg.b(parcel, q9.g3.CREATOR);
                q9.d3 d3Var11 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 == null) {
                    lrVar8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    lrVar8 = iInterfaceQueryLocalInterface11 instanceof nr ? (nr) iInterfaceQueryLocalInterface11 : new lr(strongBinder11);
                }
                vg.f(parcel);
                s3(aVarL113, g3Var3, d3Var11, string14, string15, lrVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel2.writeNoException();
                ClassLoader classLoader5 = vg.f11374a;
                parcel2.writeStrongBinder(null);
                return true;
            case 37:
                xa.a aVarL114 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                p3(aVarL114);
                parcel2.writeNoException();
                return true;
            case 38:
                xa.a aVarL115 = xa.b.L1(parcel.readStrongBinder());
                q9.d3 d3Var12 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                String string16 = parcel.readString();
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    lrVar9 = iInterfaceQueryLocalInterface12 instanceof nr ? (nr) iInterfaceQueryLocalInterface12 : new lr(strongBinder12);
                }
                vg.f(parcel);
                P1(aVarL115, d3Var12, string16, lrVar9);
                parcel2.writeNoException();
                return true;
            case 39:
                xa.a aVarL116 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                h4(aVarL116);
                throw null;
        }
    }

    public final Bundle l4(String str, q9.d3 d3Var, String str2) throws RemoteException {
        u9.i.c("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f12691b instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (d3Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", d3Var.f31807h);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th2) {
            u9.i.f("", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void m() throws RemoteException {
        Object obj = this.f12691b;
        if (obj instanceof MediationInterstitialAdapter) {
            u9.i.c("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th2) {
                u9.i.f("", th2);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        u9.i.h(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void m0(xa.a aVar) {
    }

    public final void m4(q9.d3 d3Var) {
        Bundle bundle = d3Var.f31812n;
        if (bundle == null || bundle.getBundle(this.f12691b.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final boolean o() throws RemoteException {
        Object obj = this.f12691b;
        if ((obj instanceof w9.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f12693d != null;
        }
        String canonicalName = w9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        u9.i.h(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final or o0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void p() throws RemoteException {
        Object obj = this.f12691b;
        if (obj instanceof w9.e) {
            try {
                ((w9.e) obj).onResume();
            } catch (Throwable th2) {
                u9.i.f("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void p3(xa.a aVar) throws RemoteException {
        Object obj = this.f12691b;
        if ((obj instanceof w9.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                m();
                return;
            } else {
                u9.i.c("Show interstitial ad from adapter.");
                u9.i.e("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = w9.a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        l7.o.t(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb2.append(canonicalName3);
        u9.i.h(sb2.toString());
        throw new RemoteException();
    }

    public final void p4(String str, q9.d3 d3Var) throws RemoteException {
        Object obj = this.f12691b;
        if (obj instanceof w9.a) {
            d1(this.f12694e, d3Var, str, new zr((w9.a) obj, this.f12693d));
            return;
        }
        String canonicalName = w9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        u9.i.h(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final qr q0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void s3(xa.a aVar, q9.g3 g3Var, q9.d3 d3Var, String str, String str2, nr nrVar) throws RemoteException {
        Object obj = this.f12691b;
        if (!(obj instanceof w9.a)) {
            String canonicalName = w9.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            u9.i.h(sb2.toString());
            throw new RemoteException();
        }
        u9.i.c("Requesting interscroller ad from adapter.");
        try {
            w9.a aVar2 = (w9.a) obj;
            n90 n90Var = new n90(this, nrVar, aVar2);
            l4(str, d3Var, str2);
            m4(d3Var);
            n4(d3Var);
            o4(str, d3Var);
            int i = g3Var.f31879f;
            int i10 = g3Var.f31876c;
            k9.h hVar = new k9.h(i, i10);
            hVar.f27269g = true;
            hVar.f27270h = i10;
            n90Var.w(new la.m(7, aVar2.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", (Object) null, 4));
        } catch (Exception e3) {
            u9.i.f("", e3);
            gr.w(aVar, e3, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final ts t0() {
        Object obj = this.f12691b;
        if (!(obj instanceof w9.a)) {
            return null;
        }
        k9.s sDKVersionInfo = ((w9.a) obj).getSDKVersionInfo();
        return new ts(sDKVersionInfo.f27284a, sDKVersionInfo.f27285b, sDKVersionInfo.f27286c);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void v2(xa.a aVar, q9.d3 d3Var, String str, nr nrVar) throws RemoteException {
        Object obj = this.f12691b;
        if (!(obj instanceof w9.a)) {
            String canonicalName = w9.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            u9.i.h(sb2.toString());
            throw new RemoteException();
        }
        u9.i.c("Requesting rewarded interstitial ad from adapter.");
        try {
            wr wrVar = new wr(this, nrVar, 1);
            l4(str, d3Var, null);
            m4(d3Var);
            n4(d3Var);
            o4(str, d3Var);
            ((w9.a) obj).loadRewardedInterstitialAd(new w9.m(), wrVar);
        } catch (Exception e3) {
            gr.w(aVar, e3, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void z0(xa.a aVar, q9.g3 g3Var, q9.d3 d3Var, String str, String str2, nr nrVar) throws RemoteException {
        k9.h hVar;
        Object obj = this.f12691b;
        boolean z5 = obj instanceof MediationBannerAdapter;
        if (!z5 && !(obj instanceof w9.a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = w9.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            l7.o.t(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            u9.i.h(sb2.toString());
            throw new RemoteException();
        }
        u9.i.c("Requesting banner ad from adapter.");
        boolean z10 = g3Var.f31887o;
        int i = g3Var.f31876c;
        int i10 = g3Var.f31879f;
        if (z10) {
            k9.h hVar2 = new k9.h(i10, i);
            hVar2.f27267e = true;
            hVar2.f27268f = i;
            hVar = hVar2;
        } else {
            hVar = new k9.h(i10, i, g3Var.f31875b);
        }
        if (!z5) {
            if (obj instanceof w9.a) {
                try {
                    vr vrVar = new vr(this, nrVar, 0);
                    l4(str, d3Var, str2);
                    m4(d3Var);
                    n4(d3Var);
                    o4(str, d3Var);
                    ((w9.a) obj).loadBannerAd(new w9.g(), vrVar);
                    return;
                } catch (Throwable th2) {
                    u9.i.f("", th2);
                    gr.w(aVar, th2, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = d3Var.f31805f;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = d3Var.f31802c;
            if (j10 != -1) {
                new Date(j10);
            }
            boolean zN4 = n4(d3Var);
            int i11 = d3Var.f31807h;
            boolean z11 = d3Var.f31817s;
            o4(str, d3Var);
            ur urVar = new ur(hashSet, zN4, i11, z11);
            Bundle bundle = d3Var.f31812n;
            mediationBannerAdapter.requestBannerAd((Context) xa.b.X1(aVar), new oq0(nrVar), l4(str, d3Var, str2), hVar, urVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            u9.i.f("", th3);
            gr.w(aVar, th3, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void z1(String str, q9.d3 d3Var) throws RemoteException {
        p4(str, d3Var);
    }

    public yr(w9.a aVar) {
        this();
        this.f12691b = aVar;
    }

    public yr(w9.e eVar) {
        this();
        this.f12691b = eVar;
    }
}

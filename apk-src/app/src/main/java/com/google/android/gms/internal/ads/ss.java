package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ss extends ug implements os {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10377c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RtbAdapter f10378b;

    public ss(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f10378b = rtbAdapter;
    }

    public static final void m4(String str) throws RemoteException {
        u9.i.h("Server parameters: ".concat(String.valueOf(str)));
        try {
            new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            }
        } catch (JSONException e3) {
            u9.i.f("", e3);
            throw new RemoteException();
        }
    }

    public static final void n4(q9.d3 d3Var) {
        if (d3Var.f31806g) {
            return;
        }
        u9.d dVar = q9.r.f31959g.f31960a;
        u9.d.q();
    }

    public static final void o4(String str, q9.d3 d3Var) {
        String str2 = d3Var.f31820v;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void F0(String str, String str2, q9.d3 d3Var, xa.a aVar, ks ksVar, nr nrVar, wm wmVar) throws RemoteException {
        RtbAdapter rtbAdapter = this.f10378b;
        try {
            gk0 gk0Var = new gk0(10, this, ksVar);
            m4(str2);
            l4(d3Var);
            n4(d3Var);
            o4(str2, d3Var);
            rtbAdapter.loadRtbNativeAdMapper(new w9.k(), gk0Var);
        } catch (Throwable th2) {
            u9.i.f("Adapter failed to render native ad.", th2);
            gr.w(aVar, th2, "adapter.loadRtbNativeAdMapper");
            String message = th2.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                kx0 kx0Var = new kx0(10, this, ksVar);
                m4(str2);
                l4(d3Var);
                n4(d3Var);
                o4(str2, d3Var);
                rtbAdapter.loadRtbNativeAd(new w9.k(), kx0Var);
            } catch (Throwable th3) {
                u9.i.f("Adapter failed to render native ad.", th3);
                gr.w(aVar, th3, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void N0(String str, String str2, q9.d3 d3Var, xa.a aVar, gs gsVar, nr nrVar, q9.g3 g3Var) throws RemoteException {
        try {
            ox0 ox0Var = new ox0(this, gsVar, 10);
            RtbAdapter rtbAdapter = this.f10378b;
            m4(str2);
            l4(d3Var);
            n4(d3Var);
            o4(str2, d3Var);
            new k9.h(g3Var.f31879f, g3Var.f31876c, g3Var.f31875b);
            rtbAdapter.loadRtbBannerAd(new w9.g(), ox0Var);
        } catch (Throwable th2) {
            u9.i.f("Adapter failed to render banner ad.", th2);
            gr.w(aVar, th2, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void Z0(String str, String str2, q9.d3 d3Var, xa.a aVar, gs gsVar, nr nrVar, q9.g3 g3Var) throws RemoteException {
        try {
            RtbAdapter rtbAdapter = this.f10378b;
            m4(str2);
            l4(d3Var);
            n4(d3Var);
            o4(str2, d3Var);
            new k9.h(g3Var.f31879f, g3Var.f31876c, g3Var.f31875b);
            try {
                gsVar.a(new q9.x1(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null, null));
            } catch (RemoteException e3) {
                u9.i.f("", e3);
            }
        } catch (Throwable th2) {
            u9.i.f("Adapter failed to render interscroller ad.", th2);
            gr.w(aVar, th2, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.os
    public final ts c() {
        k9.s versionInfo = this.f10378b.getVersionInfo();
        return new ts(versionInfo.f27284a, versionInfo.f27285b, versionInfo.f27286c);
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void e3(String str, String str2, q9.d3 d3Var, xa.a aVar, es esVar, nr nrVar) throws RemoteException {
        try {
            ox0 ox0Var = new ox0(this, esVar, 11);
            RtbAdapter rtbAdapter = this.f10378b;
            m4(str2);
            l4(d3Var);
            n4(d3Var);
            o4(str2, d3Var);
            rtbAdapter.loadRtbAppOpenAd(new w9.f(), ox0Var);
        } catch (Throwable th2) {
            u9.i.f("Adapter failed to render app open ad.", th2);
            gr.w(aVar, th2, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (((java.lang.Boolean) q9.s.f31967e.f31970c.a(com.google.android.gms.internal.ads.al.f2945bd)).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r4.equals("app_open") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r4.equals("interstitial") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r4.equals("rewarded") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r4.equals("native") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r4.equals("banner") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        new java.util.ArrayList().add(new t.t0(4));
        r8 = (android.content.Context) xa.b.X1(r3);
        new k9.h(r7.f31879f, r7.f31876c, r7.f31875b);
        r6.collectSignals(new y9.a(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r4.equals("rewarded_interstitial") != false) goto L29;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.os
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e4(xa.a r3, java.lang.String r4, android.os.Bundle r5, android.os.Bundle r6, q9.g3 r7, com.google.android.gms.internal.ads.qs r8) throws android.os.RemoteException {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.fp r5 = new com.google.android.gms.internal.ads.fp     // Catch: java.lang.Throwable -> L38
            r6 = 10
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r6 = r2.f10378b     // Catch: java.lang.Throwable -> L38
            t.t0 r8 = new t.t0     // Catch: java.lang.Throwable -> L38
            int r0 = r4.hashCode()     // Catch: java.lang.Throwable -> L38
            switch(r0) {
                case -1396342996: goto L5e;
                case -1052618729: goto L55;
                case -239580146: goto L4c;
                case 604727084: goto L43;
                case 1167692200: goto L3a;
                case 1778294298: goto L1d;
                case 1911491517: goto L14;
                default: goto L12;
            }
        L12:
            goto L8c
        L14:
            java.lang.String r0 = "rewarded_interstitial"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8c
            goto L66
        L1d:
            java.lang.String r0 = "app_open_ad"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8c
            com.google.android.gms.internal.ads.wk r4 = com.google.android.gms.internal.ads.al.f2945bd     // Catch: java.lang.Throwable -> L38
            q9.s r0 = q9.s.f31967e     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.yk r0 = r0.f31970c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r0.a(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L38
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L8c
            goto L66
        L38:
            r4 = move-exception
            goto L94
        L3a:
            java.lang.String r0 = "app_open"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8c
            goto L66
        L43:
            java.lang.String r0 = "interstitial"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8c
            goto L66
        L4c:
            java.lang.String r0 = "rewarded"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8c
            goto L66
        L55:
            java.lang.String r0 = "native"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8c
            goto L66
        L5e:
            java.lang.String r0 = "banner"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8c
        L66:
            r4 = 4
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            r4.add(r8)     // Catch: java.lang.Throwable -> L38
            y9.a r4 = new y9.a     // Catch: java.lang.Throwable -> L38
            java.lang.Object r8 = xa.b.X1(r3)     // Catch: java.lang.Throwable -> L38
            android.content.Context r8 = (android.content.Context) r8     // Catch: java.lang.Throwable -> L38
            int r8 = r7.f31879f     // Catch: java.lang.Throwable -> L38
            int r0 = r7.f31876c     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r7.f31875b     // Catch: java.lang.Throwable -> L38
            k9.h r1 = new k9.h     // Catch: java.lang.Throwable -> L38
            r1.<init>(r8, r0, r7)     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            r6.collectSignals(r4, r5)     // Catch: java.lang.Throwable -> L38
            return
        L8c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "Internal Error"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L38
            throw r4     // Catch: java.lang.Throwable -> L38
        L94:
            java.lang.String r5 = "Error generating signals for RTB"
            u9.i.f(r5, r4)
            java.lang.String r5 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.gr.w(r3, r4, r5)
            android.os.RemoteException r3 = new android.os.RemoteException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ss.e4(xa.a, java.lang.String, android.os.Bundle, android.os.Bundle, q9.g3, com.google.android.gms.internal.ads.qs):void");
    }

    @Override // com.google.android.gms.internal.ads.os
    public final boolean f4(xa.b bVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void g4(String str, String str2, q9.d3 d3Var, xa.a aVar, ms msVar, nr nrVar) throws RemoteException {
        try {
            cf cfVar = new cf(11, this, msVar);
            RtbAdapter rtbAdapter = this.f10378b;
            m4(str2);
            l4(d3Var);
            n4(d3Var);
            o4(str2, d3Var);
            rtbAdapter.loadRtbRewardedInterstitialAd(new w9.m(), cfVar);
        } catch (Throwable th2) {
            u9.i.f("Adapter failed to render rewarded interstitial ad.", th2);
            gr.w(aVar, th2, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void j1(String str, String str2, q9.d3 d3Var, xa.b bVar, ej0 ej0Var, nr nrVar) throws RemoteException {
        F0(str, str2, d3Var, bVar, ej0Var, nrVar, null);
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void j2(String str, String str2, q9.d3 d3Var, xa.a aVar, is isVar, nr nrVar) throws RemoteException {
        try {
            cf cfVar = new cf(10, this, isVar);
            RtbAdapter rtbAdapter = this.f10378b;
            m4(str2);
            l4(d3Var);
            n4(d3Var);
            o4(str2, d3Var);
            rtbAdapter.loadRtbInterstitialAd(new w9.i(), cfVar);
        } catch (Throwable th2) {
            u9.i.f("Adapter failed to render interstitial ad.", th2);
            gr.w(aVar, th2, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.os
    public final ts k() {
        k9.s sDKVersionInfo = this.f10378b.getSDKVersionInfo();
        return new ts(sDKVersionInfo.f27284a, sDKVersionInfo.f27285b, sDKVersionInfo.f27286c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.android.gms.internal.ads.es] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r21v10, types: [com.google.android.gms.internal.ads.ks] */
    /* JADX WARN: Type inference failed for: r21v2, types: [com.google.android.gms.internal.ads.gs] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4, types: [com.google.android.gms.internal.ads.is] */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [com.google.android.gms.internal.ads.ms] */
    /* JADX WARN: Type inference failed for: r21v7, types: [com.google.android.gms.internal.ads.ks] */
    /* JADX WARN: Type inference failed for: r21v8, types: [com.google.android.gms.internal.ads.ms] */
    /* JADX WARN: Type inference failed for: r21v9, types: [com.google.android.gms.internal.ads.gs] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [com.google.android.gms.internal.ads.qs] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.ss] */
    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        ?? psVar;
        ?? hsVar;
        ?? dsVar;
        IInterface fsVar = null;
        if (i == 1) {
            xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) vg.b(parcel, creator);
            Bundle bundle2 = (Bundle) vg.b(parcel, creator);
            q9.g3 g3Var = (q9.g3) vg.b(parcel, q9.g3.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                psVar = fsVar;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (iInterfaceQueryLocalInterface instanceof qs) {
                    fsVar = (qs) iInterfaceQueryLocalInterface;
                    psVar = fsVar;
                } else {
                    psVar = new ps(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback", 1);
                }
            }
            vg.f(parcel);
            e4(aVarL1, string, bundle, bundle2, g3Var, psVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            ts tsVarC = c();
            parcel2.writeNoException();
            vg.d(parcel2, tsVarC);
            return true;
        }
        if (i == 3) {
            ts tsVarK = k();
            parcel2.writeNoException();
            vg.d(parcel2, tsVarK);
            return true;
        }
        if (i == 5) {
            q9.b2 b2VarM = m();
            parcel2.writeNoException();
            vg.e(parcel2, b2VarM);
            return true;
        }
        if (i == 10) {
            xa.b.L1(parcel.readStrongBinder());
            vg.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i == 11) {
            parcel.createStringArray();
            vg.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 13:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                q9.d3 d3Var = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    fsVar = iInterfaceQueryLocalInterface2 instanceof gs ? (gs) iInterfaceQueryLocalInterface2 : new fs(strongBinder2);
                }
                ?? r21 = fsVar;
                nr nrVarL4 = mr.l4(parcel.readStrongBinder());
                q9.g3 g3Var2 = (q9.g3) vg.b(parcel, q9.g3.CREATOR);
                vg.f(parcel);
                N0(string2, string3, d3Var, aVarL12, r21, nrVarL4, g3Var2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                q9.d3 d3Var2 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                xa.a aVarL13 = xa.b.L1(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    hsVar = fsVar;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (iInterfaceQueryLocalInterface3 instanceof is) {
                        fsVar = (is) iInterfaceQueryLocalInterface3;
                        hsVar = fsVar;
                    } else {
                        hsVar = new hs(strongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback", 1);
                    }
                }
                nr nrVarL42 = mr.l4(parcel.readStrongBinder());
                vg.f(parcel);
                j2(string4, string5, d3Var2, aVarL13, hsVar, nrVarL42);
                parcel2.writeNoException();
                return true;
            case 15:
                xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 16:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                q9.d3 d3Var3 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                xa.a aVarL14 = xa.b.L1(parcel.readStrongBinder());
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    fsVar = iInterfaceQueryLocalInterface4 instanceof ms ? (ms) iInterfaceQueryLocalInterface4 : new ls(strongBinder4);
                }
                ?? r212 = fsVar;
                nr nrVarL43 = mr.l4(parcel.readStrongBinder());
                vg.f(parcel);
                x1(string6, string7, d3Var3, aVarL14, r212, nrVarL43);
                parcel2.writeNoException();
                return true;
            case 17:
                xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 18:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                q9.d3 d3Var4 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                xa.a aVarL15 = xa.b.L1(parcel.readStrongBinder());
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    fsVar = iInterfaceQueryLocalInterface5 instanceof ks ? (ks) iInterfaceQueryLocalInterface5 : new js(strongBinder5);
                }
                ?? r213 = fsVar;
                nr nrVarL44 = mr.l4(parcel.readStrongBinder());
                vg.f(parcel);
                F0(string8, string9, d3Var4, aVarL15, r213, nrVarL44, null);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.readString();
                vg.f(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                q9.d3 d3Var5 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                xa.a aVarL16 = xa.b.L1(parcel.readStrongBinder());
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    fsVar = iInterfaceQueryLocalInterface6 instanceof ms ? (ms) iInterfaceQueryLocalInterface6 : new ls(strongBinder6);
                }
                ?? r214 = fsVar;
                nr nrVarL45 = mr.l4(parcel.readStrongBinder());
                vg.f(parcel);
                g4(string10, string11, d3Var5, aVarL16, r214, nrVarL45);
                parcel2.writeNoException();
                return true;
            case 21:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                q9.d3 d3Var6 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                xa.a aVarL17 = xa.b.L1(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    fsVar = iInterfaceQueryLocalInterface7 instanceof gs ? (gs) iInterfaceQueryLocalInterface7 : new fs(strongBinder7);
                }
                ?? r215 = fsVar;
                nr nrVarL46 = mr.l4(parcel.readStrongBinder());
                q9.g3 g3Var3 = (q9.g3) vg.b(parcel, q9.g3.CREATOR);
                vg.f(parcel);
                Z0(string12, string13, d3Var6, aVarL17, r215, nrVarL46, g3Var3);
                parcel2.writeNoException();
                return true;
            case 22:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                q9.d3 d3Var7 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                xa.a aVarL18 = xa.b.L1(parcel.readStrongBinder());
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    fsVar = iInterfaceQueryLocalInterface8 instanceof ks ? (ks) iInterfaceQueryLocalInterface8 : new js(strongBinder8);
                }
                ?? r216 = fsVar;
                nr nrVarL47 = mr.l4(parcel.readStrongBinder());
                wm wmVar = (wm) vg.b(parcel, wm.CREATOR);
                vg.f(parcel);
                F0(string14, string15, d3Var7, aVarL18, r216, nrVarL47, wmVar);
                parcel2.writeNoException();
                return true;
            case 23:
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                q9.d3 d3Var8 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                xa.a aVarL19 = xa.b.L1(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 == null) {
                    dsVar = fsVar;
                } else {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    if (iInterfaceQueryLocalInterface9 instanceof es) {
                        fsVar = (es) iInterfaceQueryLocalInterface9;
                        dsVar = fsVar;
                    } else {
                        dsVar = new ds(strongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback", 1);
                    }
                }
                nr nrVarL48 = mr.l4(parcel.readStrongBinder());
                vg.f(parcel);
                e3(string16, string17, d3Var8, aVarL19, dsVar, nrVarL48);
                parcel2.writeNoException();
                return true;
            case 24:
                xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return false;
        }
    }

    public final void l4(q9.d3 d3Var) {
        Bundle bundle = d3Var.f31812n;
        if (bundle == null || bundle.getBundle(this.f10378b.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // com.google.android.gms.internal.ads.os
    public final q9.b2 m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.os
    public final boolean m1(xa.b bVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void x1(String str, String str2, q9.d3 d3Var, xa.a aVar, ms msVar, nr nrVar) throws RemoteException {
        try {
            cf cfVar = new cf(11, this, msVar);
            RtbAdapter rtbAdapter = this.f10378b;
            m4(str2);
            l4(d3Var);
            n4(d3Var);
            o4(str2, d3Var);
            rtbAdapter.loadRtbRewardedAd(new w9.m(), cfVar);
        } catch (Throwable th2) {
            u9.i.f("Adapter failed to render rewarded ad.", th2);
            gr.w(aVar, th2, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.os
    public final boolean y0(xa.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void U2(String str) {
    }
}

package ob;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ur;
import com.google.android.gms.internal.measurement.r4;
import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.t8;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.App;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.firebase.messaging.j f30218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l6.i f30219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f30220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f30222h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f30223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a2 f30225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a2 f30226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PriorityQueue f30227n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30228o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x1 f30229p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicLong f30230q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f30231r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k1 f30232s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f30233t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a2 f30234u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j2 f30235v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a2 f30236w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m7.a f30237x;

    public k2(l1 l1Var) {
        super(l1Var);
        this.f30220f = new CopyOnWriteArraySet();
        this.i = new Object();
        this.f30223j = false;
        this.f30224k = 1;
        this.f30233t = true;
        this.f30237x = new m7.a(9, this);
        this.f30222h = new AtomicReference();
        this.f30229p = x1.f30509c;
        this.f30231r = -1L;
        this.f30230q = new AtomicLong(0L);
        this.f30232s = new k1(l1Var);
    }

    @Override // ob.f0
    public final boolean F() {
        return false;
    }

    public final void G(x1 x1Var) {
        C();
        boolean z5 = (x1Var.i(w1.ANALYTICS_STORAGE) && x1Var.i(w1.AD_STORAGE)) || ((l1) this.f15951b).n().L();
        l1 l1Var = (l1) this.f15951b;
        i1 i1Var = l1Var.f30266h;
        l1.k(i1Var);
        i1Var.C();
        if (z5 != l1Var.A) {
            i1 i1Var2 = l1Var.f30266h;
            l1.k(i1Var2);
            i1Var2.C();
            l1Var.A = z5;
            z0 z0Var = ((l1) this.f15951b).f30264f;
            l1.h(z0Var);
            z0Var.C();
            Boolean boolValueOf = z0Var.G().contains("measurement_enabled_from_api") ? Boolean.valueOf(z0Var.G().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z5 || boolValueOf == null || boolValueOf.booleanValue()) {
                T(Boolean.valueOf(z5), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r4 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r6 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(java.lang.String r13, java.lang.String r14, android.os.Bundle r15, boolean r16, boolean r17, long r18) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.k2.H(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void I() throws Throwable {
        s0 s0Var;
        String str;
        int i;
        int i10;
        int i11;
        int i12;
        l3 l3Var;
        l3 l3Var2;
        k2 k2Var;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        s4 s4Var;
        ad.g1 g1VarD;
        s4 s4Var2;
        C();
        l1 l1Var = (l1) this.f15951b;
        s0 s0Var2 = l1Var.f30265g;
        ua.a aVar = l1Var.f30269l;
        l1.k(s0Var2);
        s0Var2.f30417n.f("Handle tcf update.");
        z0 z0Var = l1Var.f30264f;
        l1.h(z0Var);
        SharedPreferences sharedPreferencesH = z0Var.H();
        HashMap map = new HashMap();
        c0 c0Var = d0.Z0;
        int i18 = 2;
        if (((Boolean) c0Var.a(null)).booleanValue()) {
            ad.b1 b1Var = n3.f30314a;
            r4 r4Var = r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            s0Var = s0Var2;
            m3 m3Var = m3.f30293b;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(r4Var, m3Var);
            r4 r4Var2 = r4.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            m3 m3Var2 = m3.f30294c;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(r4Var2, m3Var2);
            r4 r4Var3 = r4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(r4Var3, m3Var);
            r4 r4Var4 = r4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(r4Var4, m3Var);
            r4 r4Var5 = r4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List listAsList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(r4Var5, m3Var2), new AbstractMap.SimpleImmutableEntry(r4.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, m3Var2), new AbstractMap.SimpleImmutableEntry(r4.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, m3Var2));
            ad.m0 m0Var = new ad.m0(listAsList instanceof Collection ? listAsList.size() : 4, 0);
            m0Var.o(listAsList);
            ad.g1 g1VarD2 = m0Var.d(true);
            int i19 = ad.o0.f846d;
            ad.o1 o1Var = new ad.o1("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesH.contains("IABTCF_TCString");
            try {
                i13 = sharedPreferencesH.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i13 = -1;
            }
            try {
                i14 = sharedPreferencesH.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused2) {
                i14 = -1;
            }
            try {
                i15 = sharedPreferencesH.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused3) {
                i15 = -1;
            }
            int i20 = i14;
            try {
                i16 = sharedPreferencesH.getInt("IABTCF_PurposeOneTreatment", -1);
            } catch (ClassCastException unused4) {
                i16 = -1;
            }
            try {
                i17 = sharedPreferencesH.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused5) {
                i17 = -1;
            }
            String strA = n3.a(sharedPreferencesH, "IABTCF_PublisherCC");
            int i21 = i13;
            ad.m0 m0Var2 = new ad.m0(4, 0);
            ad.q1 it = g1VarD2.keySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                s4Var = s4.PURPOSE_RESTRICTION_UNDEFINED;
                ad.q1 q1Var = it;
                if (!zHasNext) {
                    break;
                }
                r4 r4Var6 = (r4) q1Var.next();
                int iH = r4Var6.h();
                char[] cArr2 = cArr;
                String str2 = strA;
                StringBuilder sb2 = new StringBuilder(String.valueOf(iH).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(iH);
                String strA2 = n3.a(sharedPreferencesH, sb2.toString());
                if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                    s4Var2 = s4Var;
                } else {
                    int iDigit = Character.digit(strA2.charAt(754), 10);
                    s4Var2 = s4.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    if (iDigit >= 0 && iDigit <= s4.values().length && iDigit != 0) {
                        if (iDigit == 1) {
                            s4Var = s4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                        } else if (iDigit == i18) {
                            s4Var = s4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                        }
                        s4Var2 = s4Var;
                    }
                }
                m0Var2.n(r4Var6, s4Var2);
                it = q1Var;
                cArr = cArr2;
                strA = str2;
                i18 = 2;
            }
            char[] cArr3 = cArr;
            String str3 = strA;
            ad.g1 g1VarD3 = m0Var2.d(true);
            String strA3 = n3.a(sharedPreferencesH, "IABTCF_PurposeConsents");
            String strA4 = n3.a(sharedPreferencesH, "IABTCF_VendorConsents");
            boolean z5 = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = n3.a(sharedPreferencesH, "IABTCF_PurposeLegitimateInterests");
            String strA6 = n3.a(sharedPreferencesH, "IABTCF_VendorLegitimateInterests");
            boolean z10 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr3[0] = '2';
            if (zContains) {
                s4 s4Var3 = (s4) g1VarD3.get(r4Var);
                s4 s4Var4 = (s4) g1VarD3.get(r4Var3);
                s4 s4Var5 = (s4) g1VarD3.get(r4Var4);
                s4 s4Var6 = (s4) g1VarD3.get(r4Var5);
                ad.m0 m0Var3 = new ad.m0(4, 0);
                m0Var3.n("Version", "2");
                boolean z11 = z5;
                m0Var3.n("VendorConsent", true != z5 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                m0Var3.n("VendorLegitimateInterest", true != z10 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                m0Var3.n("gdprApplies", i15 != 1 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                m0Var3.n("EnableAdvertiserConsentMode", i17 != 1 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                m0Var3.n("PolicyVersion", String.valueOf(i20));
                m0Var3.n("CmpSdkID", String.valueOf(i21));
                m0Var3.n("PurposeOneTreatment", i16 != 1 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                m0Var3.n("PublisherCC", str3);
                m0Var3.n("PublisherRestrictions1", String.valueOf(s4Var3 != null ? s4Var3.h() : s4Var.h()));
                m0Var3.n("PublisherRestrictions3", String.valueOf(s4Var4 != null ? s4Var4.h() : s4Var.h()));
                m0Var3.n("PublisherRestrictions4", String.valueOf(s4Var5 != null ? s4Var5.h() : s4Var.h()));
                m0Var3.n("PublisherRestrictions7", String.valueOf(s4Var6 != null ? s4Var6.h() : s4Var.h()));
                String strD = n3.d(r4Var, strA3, strA5);
                String strD2 = n3.d(r4Var3, strA3, strA5);
                int i22 = i16;
                String strD3 = n3.d(r4Var4, strA3, strA5);
                String strD4 = n3.d(r4Var5, strA3, strA5);
                ad.q.c("Purpose1", strD);
                ad.q.c("Purpose3", strD2);
                ad.q.c("Purpose4", strD3);
                ad.q.c("Purpose7", strD4);
                m0Var3.o(ad.g1.b(4, new Object[]{"Purpose1", strD, "Purpose3", strD2, "Purpose4", strD3, "Purpose7", strD4}, null).entrySet());
                boolean z12 = z10;
                int i23 = i17;
                int i24 = i15;
                m0Var3.o(ad.g1.b(5, new Object[]{"AuthorizePurpose1", true != n3.b(r4Var, g1VarD2, g1VarD3, o1Var, cArr3, i23, i24, i22, str3, strA3, strA5, z11, z12) ? CommonUrlParts.Values.FALSE_INTEGER : "1", "AuthorizePurpose3", true != n3.b(r4Var3, g1VarD2, g1VarD3, o1Var, cArr3, i23, i24, i22, str3, strA3, strA5, z11, z12) ? CommonUrlParts.Values.FALSE_INTEGER : "1", "AuthorizePurpose4", true != n3.b(r4Var4, g1VarD2, g1VarD3, o1Var, cArr3, i23, i24, i22, str3, strA3, strA5, z11, z12) ? CommonUrlParts.Values.FALSE_INTEGER : "1", "AuthorizePurpose7", true != n3.b(r4Var5, g1VarD2, g1VarD3, o1Var, cArr3, i23, i24, i22, str3, strA3, strA5, z11, z12) ? CommonUrlParts.Values.FALSE_INTEGER : "1", "PurposeDiagnostics", new String(cArr3)}, null).entrySet());
                g1VarD = m0Var3.d(true);
            } else {
                g1VarD = ad.g1.f796h;
            }
            l3Var = new l3(g1VarD);
            str = "";
        } else {
            s0Var = s0Var2;
            String strA7 = n3.a(sharedPreferencesH, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            try {
                i = sharedPreferencesH.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i = -1;
            }
            if (i != -1) {
                map.put("gdprApplies", String.valueOf(i));
            }
            try {
                i10 = sharedPreferencesH.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i10 = -1;
            }
            if (i10 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(i10));
            }
            try {
                i11 = sharedPreferencesH.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i11 = -1;
            }
            if (i11 != -1) {
                map.put("PolicyVersion", String.valueOf(i11));
            }
            String strA8 = n3.a(sharedPreferencesH, "IABTCF_PurposeConsents");
            if (!str.equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            try {
                i12 = sharedPreferencesH.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i12 = -1;
            }
            if (i12 != -1) {
                map.put("CmpSdkID", String.valueOf(i12));
            }
            l3Var = new l3(map);
        }
        l1.k(s0Var);
        s0 s0Var3 = s0Var;
        ur urVar = s0Var3.f30418o;
        urVar.g(l3Var, "Tcf preferences read");
        if (!l1Var.f30263e.M(null, c0Var)) {
            if (z0Var.K(l3Var)) {
                Bundle bundleB = l3Var.b();
                l1.k(s0Var3);
                urVar.g(bundleB, "Consent generated from Tcf");
                if (bundleB != Bundle.EMPTY) {
                    aVar.getClass();
                    W(bundleB, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", l3Var.c());
                J("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        z0Var.C();
        String string = z0Var.G().getString("stored_tcf_param", str);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            l3Var2 = new l3(map2);
        } else {
            for (String str4 : string.split(";")) {
                String[] strArrSplit = str4.split("=");
                if (strArrSplit.length >= 2 && n3.f30314a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            l3Var2 = new l3(map2);
        }
        if (z0Var.K(l3Var)) {
            Bundle bundleB2 = l3Var.b();
            l1.k(s0Var3);
            urVar.g(bundleB2, "Consent generated from Tcf");
            if (bundleB2 != Bundle.EMPTY) {
                aVar.getClass();
                k2Var = this;
                k2Var.W(bundleB2, -30, System.currentTimeMillis());
            } else {
                k2Var = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap map3 = l3Var2.f30284a;
            String str5 = (map3.isEmpty() || ((String) map3.get("Version")) != null) ? CommonUrlParts.Values.FALSE_INTEGER : "1";
            Bundle bundleB3 = l3Var.b();
            Bundle bundleB4 = l3Var2.b();
            bundle2.putString("_tcfm", str5.concat((bundleB3.size() == bundleB4.size() && Objects.equals(bundleB3.getString("ad_storage"), bundleB4.getString("ad_storage")) && Objects.equals(bundleB3.getString("ad_personalization"), bundleB4.getString("ad_personalization")) && Objects.equals(bundleB3.getString("ad_user_data"), bundleB4.getString("ad_user_data"))) ? CommonUrlParts.Values.FALSE_INTEGER : "1"));
            String str6 = (String) l3Var.f30284a.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str6)) {
                str6 = "200000";
            }
            bundle2.putString("_tcfd2", str6);
            bundle2.putString("_tcfd", l3Var.c());
            k2Var.J("auto", "_tcf", bundle2);
        }
    }

    public final void J(String str, String str2, Bundle bundle) {
        C();
        ((l1) this.f15951b).f30269l.getClass();
        K(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void K(long j10, Bundle bundle, String str, String str2) {
        C();
        boolean z5 = true;
        if (this.f30219e != null && !e4.Z(str2)) {
            z5 = false;
        }
        L(str, str2, j10, bundle, true, z5, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0514 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(java.lang.String r31, java.lang.String r32, long r33, android.os.Bundle r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 1365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.k2.L(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.k2.M(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(long r20, java.lang.Object r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.k2.N(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void O() {
        C();
        D();
        l1 l1Var = (l1) this.f15951b;
        if (l1Var.d()) {
            g gVar = l1Var.f30263e;
            ((l1) gVar.f15951b).getClass();
            Boolean boolO = gVar.O("google_analytics_deferred_deep_link_enabled");
            if (boolO != null && boolO.booleanValue()) {
                s0 s0Var = l1Var.f30265g;
                l1.k(s0Var);
                s0Var.f30417n.f("Deferred Deep Link feature enabled.");
                i1 i1Var = l1Var.f30266h;
                l1.k(i1Var);
                i1Var.L(new z1(this, 2));
            }
            d3 d3VarN = l1Var.n();
            d3VarN.C();
            d3VarN.D();
            g4 g4VarS = d3VarN.S(true);
            d3VarN.O();
            l1 l1Var2 = (l1) d3VarN.f15951b;
            l1Var2.f30263e.M(null, d0.f30001b1);
            l1Var2.m().J(3, new byte[0]);
            d3VarN.Q(new y2(d3VarN, g4VarS, 0));
            this.f30233t = false;
            z0 z0Var = l1Var.f30264f;
            l1.h(z0Var);
            z0Var.C();
            String string = z0Var.G().getString("previous_os_version", null);
            ((l1) z0Var.f15951b).p().E();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = z0Var.G().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            l1Var.p().E();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            J("auto", "_ou", bundle);
        }
    }

    public final void P(Bundle bundle, long j10) {
        l1 l1Var = (l1) this.f15951b;
        pa.c0.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(CommonUrlParts.APP_ID))) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30413j.f("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(CommonUrlParts.APP_ID);
        y1.e(bundle2, CommonUrlParts.APP_ID, String.class, null);
        y1.e(bundle2, "origin", String.class, null);
        y1.e(bundle2, "name", String.class, null);
        y1.e(bundle2, "value", Object.class, null);
        y1.e(bundle2, "trigger_event_name", String.class, null);
        y1.e(bundle2, "trigger_timeout", Long.class, 0L);
        y1.e(bundle2, "timed_out_event_name", String.class, null);
        y1.e(bundle2, "timed_out_event_params", Bundle.class, null);
        y1.e(bundle2, "triggered_event_name", String.class, null);
        y1.e(bundle2, "triggered_event_params", Bundle.class, null);
        y1.e(bundle2, "time_to_live", Long.class, 0L);
        y1.e(bundle2, "expired_event_name", String.class, null);
        y1.e(bundle2, "expired_event_params", Bundle.class, null);
        pa.c0.f(bundle2.getString("name"));
        pa.c0.f(bundle2.getString("origin"));
        pa.c0.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        e4 e4Var = l1Var.f30267j;
        o0 o0Var = l1Var.f30268k;
        s0 s0Var2 = l1Var.f30265g;
        l1.h(e4Var);
        if (e4Var.G0(string) != 0) {
            l1.k(s0Var2);
            s0Var2.f30411g.g(o0Var.c(string), "Invalid conditional user property name");
            return;
        }
        l1.h(e4Var);
        if (e4Var.P(obj, string) != 0) {
            l1.k(s0Var2);
            s0Var2.f30411g.h(o0Var.c(string), "Invalid conditional user property value", obj);
            return;
        }
        Object objQ = e4Var.Q(obj, string);
        if (objQ == null) {
            l1.k(s0Var2);
            s0Var2.f30411g.h(o0Var.c(string), "Unable to normalize conditional user property value", obj);
            return;
        }
        y1.c(bundle2, objQ);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j11 > 15552000000L || j11 < 1)) {
            l1.k(s0Var2);
            s0Var2.f30411g.h(o0Var.c(string), "Invalid conditional user property timeout", Long.valueOf(j11));
            return;
        }
        long j12 = bundle2.getLong("time_to_live");
        if (j12 > 15552000000L || j12 < 1) {
            l1.k(s0Var2);
            s0Var2.f30411g.h(o0Var.c(string), "Invalid conditional user property time to live", Long.valueOf(j12));
        } else {
            i1 i1Var = l1Var.f30266h;
            l1.k(i1Var);
            i1Var.L(new f2(this, bundle2, 0));
        }
    }

    public final void Q(String str, String str2, Bundle bundle) {
        l1 l1Var = (l1) this.f15951b;
        l1Var.f30269l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        pa.c0.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        i1 i1Var = l1Var.f30266h;
        l1.k(i1Var);
        i1Var.L(new ed.c(24, this, bundle2, false));
    }

    public final String R() {
        l1 l1Var = (l1) this.f15951b;
        try {
            return y1.b(l1Var.f30260b, l1Var.f30274q);
        } catch (IllegalStateException e3) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.g(e3, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void S(x1 x1Var, long j10, boolean z5) {
        int i = x1Var.f30511b;
        C();
        D();
        l1 l1Var = (l1) this.f15951b;
        z0 z0Var = l1Var.f30264f;
        s0 s0Var = l1Var.f30265g;
        l1.h(z0Var);
        x1 x1VarJ = z0Var.J();
        if (j10 <= this.f30231r && x1.l(x1VarJ.f30511b, i)) {
            l1.k(s0Var);
            s0Var.f30416m.g(x1Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        z0 z0Var2 = l1Var.f30264f;
        l1.h(z0Var2);
        z0Var2.C();
        if (!x1.l(i, z0Var2.G().getInt("consent_source", 100))) {
            l1.k(s0Var);
            s0Var.f30416m.g(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = z0Var2.G().edit();
        editorEdit.putString("consent_settings", x1Var.g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        l1.k(s0Var);
        s0Var.f30418o.g(x1Var, "Setting storage consent(FE)");
        this.f30231r = j10;
        if (l1Var.n().M()) {
            d3 d3VarN = l1Var.n();
            d3VarN.C();
            d3VarN.D();
            d3VarN.Q(new a3(d3VarN, 2));
        } else {
            d3 d3VarN2 = l1Var.n();
            d3VarN2.C();
            d3VarN2.D();
            if (d3VarN2.L()) {
                d3VarN2.Q(new y2(d3VarN2, d3VarN2.S(false), 1));
            }
        }
        if (z5) {
            l1Var.n().G(new AtomicReference());
        }
    }

    public final void T(Boolean bool, boolean z5) {
        C();
        D();
        l1 l1Var = (l1) this.f15951b;
        s0 s0Var = l1Var.f30265g;
        l1.k(s0Var);
        s0Var.f30417n.g(bool, "Setting app measurement enabled (FE)");
        z0 z0Var = l1Var.f30264f;
        l1.h(z0Var);
        z0Var.C();
        SharedPreferences.Editor editorEdit = z0Var.G().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z5) {
            z0Var.C();
            SharedPreferences.Editor editorEdit2 = z0Var.G().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        i1 i1Var = l1Var.f30266h;
        l1.k(i1Var);
        i1Var.C();
        if (l1Var.A || !(bool == null || bool.booleanValue())) {
            U();
        }
    }

    public final void U() {
        C();
        l1 l1Var = (l1) this.f15951b;
        z0 z0Var = l1Var.f30264f;
        s0 s0Var = l1Var.f30265g;
        ua.a aVar = l1Var.f30269l;
        l1.h(z0Var);
        String strD = z0Var.f30588n.d();
        if (strD != null) {
            if ("unset".equals(strD)) {
                aVar.getClass();
                N(System.currentTimeMillis(), null, App.TYPE, "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strD) ? 0L : 1L);
                aVar.getClass();
                N(System.currentTimeMillis(), lValueOf, App.TYPE, "_npa");
            }
        }
        if (!l1Var.a() || !this.f30233t) {
            l1.k(s0Var);
            s0Var.f30417n.f("Updating Scion state (FE)");
            d3 d3VarN = l1Var.n();
            d3VarN.C();
            d3VarN.D();
            d3VarN.Q(new x2(d3VarN, d3VarN.S(true), 2));
            return;
        }
        l1.k(s0Var);
        s0Var.f30417n.f("Recording app launch after enabling measurement for the first time (FE)");
        O();
        k3 k3Var = l1Var.i;
        l1.i(k3Var);
        k3Var.f30240f.q();
        i1 i1Var = l1Var.f30266h;
        l1.k(i1Var);
        i1Var.L(new z1(this, 1));
    }

    public final void V() {
        l1 l1Var = (l1) this.f15951b;
        if (!(l1Var.f30260b.getApplicationContext() instanceof Application) || this.f30218d == null) {
            return;
        }
        ((Application) l1Var.f30260b.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f30218d);
    }

    public final void W(Bundle bundle, int i, long j10) throws Throwable {
        Boolean bool;
        String string;
        u1 u1Var;
        l1 l1Var = (l1) this.f15951b;
        D();
        x1 x1Var = x1.f30509c;
        w1[] w1VarArr = v1.STORAGE.f30462b;
        int length = w1VarArr.length;
        int i10 = 0;
        while (true) {
            bool = null;
            if (i10 >= length) {
                string = null;
                break;
            }
            String str = w1VarArr[i10].f30498b;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if ((string.equals("granted") ? Boolean.TRUE : string.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i10++;
        }
        if (string != null) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30415l.g(string, "Ignoring invalid consent setting");
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30415l.f("Valid consent values are 'granted', 'denied'");
        }
        i1 i1Var = l1Var.f30266h;
        l1.k(i1Var);
        boolean zI = i1Var.I();
        x1 x1VarB = x1.b(i, bundle);
        Iterator it = x1VarB.f30510a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            u1Var = u1.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((u1) it.next()) != u1Var) {
                Y(x1VarB, zI);
                break;
            }
        }
        p pVarC = p.c(i, bundle);
        Iterator it2 = pVarC.f30338e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((u1) it2.next()) != u1Var) {
                X(pVarC, zI);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = x1.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : App.TYPE;
            if (zI) {
                N(j10, bool.toString(), str2, "allow_personalized_ads");
            } else {
                M(str2, "allow_personalized_ads", bool.toString(), false, j10);
            }
        }
    }

    public final void X(p pVar, boolean z5) {
        k0.i iVar = new k0.i(23, this, pVar, false);
        if (z5) {
            C();
            iVar.run();
        } else {
            i1 i1Var = ((l1) this.f15951b).f30266h;
            l1.k(i1Var);
            i1Var.L(iVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void Y(ob.x1 r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.k2.Y(ob.x1, boolean):void");
    }

    public final void Z() {
        t8.a();
        l1 l1Var = (l1) this.f15951b;
        g gVar = l1Var.f30263e;
        i1 i1Var = l1Var.f30266h;
        s0 s0Var = l1Var.f30265g;
        if (gVar.M(null, d0.Q0)) {
            l1.k(i1Var);
            if (i1Var.I()) {
                l1.k(s0Var);
                s0Var.f30411g.f("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (l7.b.e()) {
                l1.k(s0Var);
                s0Var.f30411g.f("Cannot get trigger URIs from main thread");
                return;
            }
            D();
            l1.k(s0Var);
            s0Var.f30418o.f("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            l1.k(i1Var);
            i1Var.M(atomicReference, 10000L, "get trigger URIs", new g2(this, atomicReference, 2, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                l1.k(s0Var);
                s0Var.i.f("Timed out waiting for get trigger URIs");
            } else {
                l1.k(i1Var);
                i1Var.L(new ed.c(27, this, list));
            }
        }
    }

    public final PriorityQueue a0() {
        if (this.f30227n == null) {
            this.f30227n = new PriorityQueue(Comparator.comparing(i2.f30188a, ic.l.f21288d));
        }
        return this.f30227n;
    }

    public final void b0() {
        o3 o3Var;
        C();
        this.f30228o = false;
        if (a0().isEmpty() || this.f30223j || (o3Var = (o3) a0().poll()) == null) {
            return;
        }
        l1 l1Var = (l1) this.f15951b;
        e4 e4Var = l1Var.f30267j;
        l1.h(e4Var);
        if (e4Var.f30104g == null) {
            e4Var.f30104g = e6.c.b(((l1) e4Var.f15951b).f30260b);
        }
        e6.c cVar = e4Var.f30104g;
        if (cVar != null) {
            this.f30223j = true;
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            ur urVar = s0Var.f30418o;
            String str = o3Var.f30330b;
            urVar.g(str, "Registering trigger URI");
            ed.d dVarF = cVar.f(Uri.parse(str));
            if (dVarF != null) {
                dVarF.a(new ed.c(0, dVarF, new l6.i(14, this, o3Var, false)), new j0.e(2, this));
            } else {
                this.f30223j = false;
                a0().add(o3Var);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class il0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq0 f6531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6533c;

    public il0(iq0 iq0Var, long j10, long j11) {
        this.f6531a = iq0Var;
        this.f6532b = j10;
        this.f6533c = j11;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        Bundle bundle = ((w50) obj).f11646a;
        iq0 iq0Var = this.f6531a;
        q9.d3 d3Var = iq0Var.f6572d;
        int i = d3Var.f31822x;
        Bundle bundle2 = d3Var.f31803d;
        bundle.putInt("http_timeout_millis", i);
        bundle.putString("slotname", iq0Var.f6575g);
        int i10 = iq0Var.f6583p.f28052c;
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i11 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j10 = this.f6532b;
        bundle.putLong("start_signals_timestamp", j10);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Ke)).booleanValue()) {
            bundle.putLong("tsi", j10 - this.f6533c);
        }
        ix.R(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        ix.x(bundle, "prefetch_type", "zenith_v2", bundle2.getBoolean("zenith_v2", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j11 = d3Var.f31802c;
        ix.x(bundle, "cust_age", simpleDateFormat.format(new Date(j11)), j11 != -1);
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i12 = d3Var.f31804e;
        ix.M(bundle, "cust_gender", i12, i12 != -1);
        ix.g0(bundle, "kw", d3Var.f31805f);
        int i13 = d3Var.f31807h;
        ix.M(bundle, "tag_for_child_directed_treatment", i13, i13 != -1);
        if (d3Var.f31806g) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", d3Var.f31824z);
        int i14 = d3Var.f31801b;
        ix.M(bundle, "d_imp_hdr", 1, i14 >= 2 && d3Var.i);
        String str = d3Var.f31808j;
        ix.x(bundle, "ppid", str, i14 >= 2 && !TextUtils.isEmpty(str));
        Location location = d3Var.f31810l;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        ix.a0("url", d3Var.f31811m, bundle);
        ix.g0(bundle, "neighboring_content_urls", d3Var.f31821w);
        Bundle bundle4 = d3Var.f31813o;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        ix.g0(bundle, "category_exclusions", d3Var.f31814p);
        ix.a0("request_agent", d3Var.f31815q, bundle);
        ix.a0("request_pkg", d3Var.f31816r, bundle);
        ix.R(bundle, "is_designed_for_families", d3Var.f31817s, i14 >= 7);
        if (i14 >= 8) {
            int i15 = d3Var.f31819u;
            ix.M(bundle, "tag_for_under_age_of_consent", i15, i15 != -1);
            ix.a0("max_ad_content_rating", d3Var.f31820v, bundle);
        }
        Bundle bundle5 = iq0Var.f6573e;
        bundle.putInt("plcs", bundle5.getInt("plcs"));
        bundle.putInt("plbs", bundle5.getInt("plbs"));
        ix.a0("plid", bundle5.getString("plid"), bundle);
        ix.M(bundle, "s2s_rr", 1, iq0Var.f6589v && !(d3Var.f31818t == null && d3Var.f31823y == null));
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void i(Object obj) {
        Bundle bundle = ((w50) obj).f11647b;
        iq0 iq0Var = this.f6531a;
        bundle.putString("slotname", iq0Var.f6575g);
        q9.d3 d3Var = iq0Var.f6572d;
        if (d3Var.f31806g) {
            bundle.putBoolean("test_request", true);
        }
        int i = d3Var.f31807h;
        ix.M(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (d3Var.f31801b >= 8) {
            int i10 = d3Var.f31819u;
            ix.M(bundle, "tag_for_under_age_of_consent", i10, i10 != -1);
        }
        ix.a0("url", d3Var.f31811m, bundle);
        ix.g0(bundle, "neighboring_content_urls", d3Var.f31821w);
        Bundle bundle2 = d3Var.f31803d;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) q9.s.f31967e.f31970c.a(al.r8)).split(StringUtils.COMMA, -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        if (bundle3 != null) {
            bundle.putBundle("extras", bundle3);
        }
    }
}

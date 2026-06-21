package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import io.sentry.ProfilingTraceData;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jj0 implements zh0 {
    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(eq0 eq0Var, xp0 xp0Var) {
        return !TextUtils.isEmpty(xp0Var.f12266v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final ed.d b(eq0 eq0Var, xp0 xp0Var) {
        JSONObject jSONObject = xp0Var.f12266v;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        iq0 iq0Var = (iq0) eq0Var.f5032a.f9149c;
        hq0 hq0Var = new hq0();
        hq0Var.f6225o.f28052c = iq0Var.f6583p.f28052c;
        q9.d3 d3Var = iq0Var.f6572d;
        hq0Var.f6212a = d3Var;
        hq0Var.f6213b = iq0Var.f6574f;
        hq0Var.f6233w = iq0Var.f6590w;
        String str = iq0Var.f6575g;
        hq0Var.f6214c = str;
        hq0Var.f6215d = iq0Var.f6569a;
        hq0Var.f6217f = iq0Var.f6576h;
        hq0Var.f6218g = iq0Var.i;
        hq0Var.f6219h = iq0Var.f6577j;
        hq0Var.i = iq0Var.f6578k;
        n9.a aVar = iq0Var.f6580m;
        hq0Var.f6220j = aVar;
        if (aVar != null) {
            hq0Var.f6216e = aVar.f29174b;
        }
        n9.d dVar = iq0Var.f6581n;
        hq0Var.f6221k = dVar;
        if (dVar != null) {
            hq0Var.f6216e = dVar.f29182b;
            hq0Var.f6222l = dVar.f29183c;
        }
        hq0Var.f6226p = iq0Var.f6584q;
        hq0Var.f6227q = iq0Var.f6585r;
        hq0Var.f6228r = iq0Var.f6571c;
        hq0Var.f6229s = iq0Var.f6586s;
        hq0Var.f6230t = iq0Var.f6587t;
        hq0Var.f6231u.set(iq0Var.f6588u.get());
        hq0Var.f6214c = strOptString;
        hq0Var.f6232v = true;
        Bundle bundle = d3Var.f31812n;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundle4.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundle4.putString("_ad", strOptString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = xp0Var.D;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, strOptString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        hq0Var.f6212a = new q9.d3(d3Var.f31801b, d3Var.f31802c, bundle4, d3Var.f31804e, d3Var.f31805f, d3Var.f31806g, d3Var.f31807h, d3Var.i, d3Var.f31808j, d3Var.f31809k, d3Var.f31810l, d3Var.f31811m, bundle2, d3Var.f31813o, d3Var.f31814p, d3Var.f31815q, d3Var.f31816r, d3Var.f31817s, d3Var.f31818t, d3Var.f31819u, d3Var.f31820v, d3Var.f31821w, d3Var.f31822x, d3Var.f31823y, d3Var.f31824z, d3Var.A, d3Var.B);
        iq0 iq0VarA = hq0Var.a();
        Bundle bundle5 = new Bundle();
        zp0 zp0Var = (zp0) eq0Var.f5033b.f4348d;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(zp0Var.f13055a));
        bundle6.putInt("refresh_interval", zp0Var.f13057c);
        bundle6.putString("gws_query_id", zp0Var.f13056b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", xp0Var.f12268w);
        bundle7.putString("ad_source_name", xp0Var.F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(xp0Var.f12231c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(xp0Var.f12233d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(xp0Var.f12254p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(xp0Var.f12249m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(xp0Var.f12239g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(xp0Var.f12241h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(xp0Var.i));
        bundle7.putString(ProfilingTraceData.JsonKeys.TRANSACTION_ID, xp0Var.f12243j);
        bundle7.putString("valid_from_timestamp", xp0Var.f12245k);
        bundle7.putBoolean("is_closable_area_disabled", xp0Var.P);
        bundle7.putString("recursive_server_response_data", xp0Var.o0);
        bundle7.putBoolean("is_analytics_logging_enabled", xp0Var.W);
        zu zuVar = xp0Var.f12247l;
        if (zuVar != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", zuVar.f13123c);
            bundle8.putString("rb_type", zuVar.f13122b);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(iq0VarA, bundle5, xp0Var, eq0Var);
    }

    public abstract or0 c(iq0 iq0Var, Bundle bundle, xp0 xp0Var, eq0 eq0Var);
}

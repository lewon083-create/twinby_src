package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0229i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wo f24047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A8 f24048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0222i0 f24049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K8 f24050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0304l7 f24051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q5 f24052h;

    public C0229i7(Context context, Sk sk2, int i, wo woVar, A8 a82, C0222i0 c0222i0, K8 k82, C0304l7 c0304l7) {
        this.f24045a = context;
        this.f24046b = i;
        this.f24047c = woVar;
        this.f24048d = a82;
        this.f24049e = c0222i0;
        this.f24050f = k82;
        this.f24051g = c0304l7;
        this.f24052h = a82.f22056a;
    }

    public static String b() {
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        C0370nn c0370nnC = C0382oa.I.C();
        C0203h7 c0203h7 = new C0203h7(f0Var);
        synchronized (c0370nnC) {
            c0370nnC.f24457b.a(c0203h7);
        }
        return (String) f0Var.f27510b;
    }

    public final C0125e7 a() {
        long jOptLong;
        Ho ho;
        Integer numValueOf = Integer.valueOf(this.f24052h.f22864e);
        String name = this.f24052h.getName();
        String value = this.f24052h.getValue();
        wo woVar = this.f24047c;
        int i = this.f24046b;
        synchronized (woVar) {
            try {
                JSONObject jSONObjectA = woVar.f24991a.a();
                JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("numbers_of_type");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                jOptLong = jSONObjectOptJSONObject.optLong(String.valueOf(i));
                jSONObjectOptJSONObject.put(String.valueOf(i), 1 + jOptLong);
                woVar.f24991a.a(jSONObjectA.put("numbers_of_type", jSONObjectOptJSONObject));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Long lValueOf = Long.valueOf(jOptLong);
        C0304l7 c0304l7 = this.f24051g;
        c0304l7.getClass();
        Lb lbM = C0382oa.I.m();
        Location userLocation = lbM.getUserLocation();
        if (userLocation != null) {
            int i10 = Ho.f22434b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            ho = new Ho(location, provider);
        } else {
            Location systemLocation = lbM.getSystemLocation();
            ho = systemLocation != null ? new Ho(new Location(systemLocation), "") : null;
        }
        boolean z5 = c0304l7.f24274a.f24154d;
        Double dValueOf = ho != null ? Double.valueOf(ho.getLatitude()) : null;
        Double dValueOf2 = ho != null ? Double.valueOf(ho.getLongitude()) : null;
        Long lValueOf2 = ho != null ? Long.valueOf(ho.getTime()) : null;
        Integer numValueOf2 = ho != null ? Integer.valueOf((int) ho.getAccuracy()) : null;
        Integer numValueOf3 = ho != null ? Integer.valueOf((int) ho.getBearing()) : null;
        Integer numValueOf4 = ho != null ? Integer.valueOf((int) ho.getSpeed()) : null;
        C0254j7 c0254j7 = new C0254j7(Boolean.valueOf(z5), dValueOf2, dValueOf, ho != null ? Integer.valueOf((int) ho.getAltitude()) : null, numValueOf3, numValueOf2, numValueOf4, lValueOf2, ho != null ? ho.getProvider() : null, ho != null ? ho.f22435a : null);
        String str = this.f24052h.f22862c;
        C0222i0 c0222i0 = this.f24049e;
        String str2 = c0222i0.f24033a;
        Long lValueOf3 = Long.valueOf(c0222i0.f24034b);
        Integer numValueOf5 = Integer.valueOf(this.f24052h.f22866g);
        Context context = this.f24045a;
        Ce ce = Ge.f22380a;
        Integer num = (Integer) Ge.f22382c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Fe()));
        num.intValue();
        String strB = b();
        J8 j82 = this.f24048d.f22057b;
        Q5 q5 = this.f24052h;
        return new C0125e7(numValueOf, name, value, lValueOf, c0254j7, str, str2, lValueOf3, numValueOf5, num, strB, j82, q5.f22867h, q5.f22869k, q5.f22870l, q5.f22872n, q5.f22873o, this.f24050f.fromModel(q5.f22874p));
    }

    public /* synthetic */ C0229i7(Context context, Sk sk2, int i, wo woVar, A8 a82, C0264jh c0264jh, C0222i0 c0222i0) {
        this(context, sk2, i, woVar, a82, c0222i0, new K8(), new C0304l7(c0264jh));
    }
}

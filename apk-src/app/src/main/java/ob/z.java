package ob;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.sd0;
import com.google.android.gms.internal.ads.v80;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.w9;
import com.google.android.gms.internal.measurement.x7;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements w, oe.k, q4.m, ii.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ z f30559c = new z(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z f30560d = new z(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ z f30561e = new z(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ z f30562f = new z(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z f30563g = new z(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ z f30564h = new z(5);
    public static final /* synthetic */ z i = new z(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ z f30565j = new z(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ z f30566k = new z(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ z f30567l = new z(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ z f30568m = new z(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ z f30569n = new z(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ z f30570o = new z(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ z f30571p = new z(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ z f30572q = new z(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ z f30573r = new z(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ z f30574s = new z(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ z f30575t = new z(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ z f30576u = new z(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ z f30577v = new z(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30578b;

    public /* synthetic */ z(int i10) {
        this.f30578b = i10;
    }

    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z5, sd0 sd0Var) {
        if (adOverlayInfoParcel.f2553l == 4 && adOverlayInfoParcel.f2546d == null) {
            q9.a aVar = adOverlayInfoParcel.f2545c;
            if (aVar != null) {
                aVar.onAdClicked();
            }
            v80 v80Var = adOverlayInfoParcel.f2563v;
            if (v80Var != null) {
                v80Var.J();
            }
            Activity activityD = adOverlayInfoParcel.f2547e.d();
            s9.e eVar = adOverlayInfoParcel.f2544b;
            Context context2 = (eVar == null || !eVar.f32838k || activityD == null) ? context : activityD;
            z zVar = p9.k.C.f31295a;
            c(context2, eVar, adOverlayInfoParcel.f2551j, eVar != null ? eVar.f32837j : null, sd0Var, adOverlayInfoParcel.f2559r);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f2555n.f34368e);
        intent.putExtra("shouldCallOnOverlayOpened", z5);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3172qe)).booleanValue()) {
            t9.g0 g0Var = p9.k.C.f31297c;
            t9.g0.w(context, intent, sd0Var, adOverlayInfoParcel.f2559r);
        } else {
            t9.g0 g0Var2 = p9.k.C.f31297c;
            t9.g0.u(context, intent);
        }
    }

    public static final boolean b(Context context, Intent intent, s9.c cVar, s9.a aVar, boolean z5, sd0 sd0Var, String str, Bundle bundle) {
        int iL;
        if (z5) {
            try {
                iL = p9.k.C.f31297c.L(context, intent.getData(), bundle);
                if (cVar != null) {
                    cVar.e();
                }
            } catch (ActivityNotFoundException e3) {
                u9.i.h(e3.getMessage());
                iL = 6;
            }
            if (aVar != null) {
                aVar.u(iL);
            }
            return iL == 5;
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 21);
            sb2.append("Launching an intent: ");
            sb2.append(uri);
            t9.c0.m(sb2.toString());
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3172qe)).booleanValue()) {
                t9.g0 g0Var = p9.k.C.f31297c;
                t9.g0.w(context, intent, sd0Var, str);
            } else {
                t9.g0 g0Var2 = p9.k.C.f31297c;
                t9.g0.u(context, intent);
            }
            if (cVar != null) {
                cVar.e();
            }
            if (aVar != null) {
                aVar.l0(true);
            }
            return true;
        } catch (ActivityNotFoundException e7) {
            u9.i.h(e7.getMessage());
            if (aVar != null) {
                aVar.l0(false);
            }
            return false;
        }
    }

    public static final boolean c(Context context, s9.e eVar, s9.c cVar, s9.a aVar, sd0 sd0Var, String str) {
        int i10 = 0;
        if (eVar == null) {
            u9.i.h("No intent data for launcher overlay.");
            return false;
        }
        al.a(context);
        Intent intent = eVar.i;
        if (intent != null) {
            return b(context, intent, cVar, aVar, eVar.f32838k, sd0Var, str, eVar.f32839l);
        }
        Intent intent2 = new Intent();
        String str2 = eVar.f32831c;
        if (TextUtils.isEmpty(str2)) {
            u9.i.h("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = eVar.f32832d;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = eVar.f32833e;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = eVar.f32834f;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                u9.i.h("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = eVar.f32835g;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i10 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                u9.i.h("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        wk wkVar = al.f3121n5;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) sVar.f31970c.a(al.f3107m5)).booleanValue()) {
                t9.g0 g0Var = p9.k.C.f31297c;
                t9.g0.N(context, intent2);
            }
        }
        return b(context, intent2, cVar, aVar, eVar.f32838k, sd0Var, str, eVar.f32839l);
    }

    @Override // q4.m
    public void G() {
        throw new UnsupportedOperationException();
    }

    @Override // q4.m
    public q4.a0 P(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // ob.w
    public Object h() {
        switch (this.f30578b) {
            case 0:
                List list = d0.f29996a;
                q8.f13932c.get();
                Long l10 = (Long) s8.f13965e.b();
                l10.getClass();
                return l10;
            case 1:
                List list2 = d0.f29996a;
                q8.f13932c.get();
                Double d10 = (Double) s8.f13963c.b();
                d10.getClass();
                return d10;
            case 2:
                List list3 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13815q.b()).longValue());
            case 3:
                List list4 = d0.f29996a;
                g7.f13765c.get();
                Long l11 = (Long) i7.f13795e0.b();
                l11.getClass();
                return l11;
            case 4:
                List list5 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13813p.b()).longValue());
            case 5:
                List list6 = d0.f29996a;
                g7.f13765c.get();
                return (String) i7.f13787a0.b();
            case 6:
                List list7 = d0.f29996a;
                g7.f13765c.get();
                return (String) i7.f13828w0.b();
            case 7:
                List list8 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13818r0.b()).longValue());
            case 8:
                List list9 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.X.b()).longValue());
            case 9:
                List list10 = d0.f29996a;
                g7.f13765c.get();
                Boolean bool = (Boolean) i7.f13790c.b();
                bool.getClass();
                return bool;
            case 10:
                List list11 = d0.f29996a;
                Boolean bool2 = (Boolean) a8.f13662b.b();
                bool2.getClass();
                return bool2;
            case 11:
                List list12 = d0.f29996a;
                Boolean bool3 = (Boolean) a8.f13663c.b();
                bool3.getClass();
                return bool3;
            case 12:
                List list13 = d0.f29996a;
                Boolean bool4 = (Boolean) w9.f14078a.b();
                bool4.getClass();
                return bool4;
            case 13:
                List list14 = d0.f29996a;
                Boolean bool5 = (Boolean) x7.f14086b.b();
                bool5.getClass();
                return bool5;
            case 14:
                List list15 = d0.f29996a;
                t8.f13974c.get();
                Boolean bool6 = (Boolean) v8.f14030f.b();
                bool6.getClass();
                return bool6;
            case 15:
                List list16 = d0.f29996a;
                t8.f13974c.get();
                Boolean bool7 = (Boolean) v8.f14032h.b();
                bool7.getClass();
                return bool7;
            case 16:
                List list17 = d0.f29996a;
                t8.f13974c.get();
                Boolean bool8 = (Boolean) v8.f14029e.b();
                bool8.getClass();
                return bool8;
            case 17:
                List list18 = d0.f29996a;
                Boolean bool9 = (Boolean) c7.f13687a.b();
                bool9.getClass();
                return bool9;
            case 18:
                List list19 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13811n0.b()).longValue());
            default:
                return new Boolean(((Boolean) m8.f13886a.b()).booleanValue());
        }
    }

    @Override // q4.m
    public void j(q4.t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override // oe.k
    public Object l() {
        switch (this.f30578b) {
            case 20:
                return new ConcurrentHashMap();
            case 21:
                return new oe.j();
            default:
                return new ArrayDeque();
        }
    }

    @Override // ii.o
    public void onMethodCall(ii.n nVar, ii.p pVar) {
        try {
            System.loadLibrary("sqlite3");
            ((hi.g) pVar).success(null);
        } catch (Throwable th2) {
            ((hi.g) pVar).b(th2.toString(), null, null);
        }
    }

    public z() {
        this.f30578b = 27;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }
}

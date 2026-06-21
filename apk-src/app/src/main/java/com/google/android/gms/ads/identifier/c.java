package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import bb.e;
import com.google.android.gms.internal.ads.a2;
import com.google.android.gms.internal.ads.aj;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.b2;
import com.google.android.gms.internal.ads.bs0;
import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.fh0;
import com.google.android.gms.internal.ads.fp;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.jr0;
import com.google.android.gms.internal.ads.jx;
import com.google.android.gms.internal.ads.l81;
import com.google.android.gms.internal.ads.n81;
import com.google.android.gms.internal.ads.nz;
import com.google.android.gms.internal.ads.o2;
import com.google.android.gms.internal.ads.r71;
import com.google.android.gms.internal.ads.sd0;
import com.google.android.gms.internal.ads.u2;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.w2;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.wq;
import com.google.android.gms.internal.ads.xr0;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.yw;
import com.google.android.gms.internal.ads.z71;
import com.google.android.gms.internal.ads.zd1;
import com.google.android.gms.internal.ads.zi;
import com.google.android.gms.internal.measurement.h5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m3.z;
import nl.i;
import org.json.JSONException;
import org.json.JSONObject;
import q4.a0;
import q4.l;
import q4.m;
import q4.t;
import q4.y;
import q9.s;
import t9.c0;
import t9.e0;
import v3.g;
import w3.j;
import zk.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements sb.c, a2, b2, jr0, l, m, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2535d;

    public /* synthetic */ c(long j10, Object obj, int i) {
        this.f2533b = i;
        this.f2534c = j10;
        this.f2535d = obj;
    }

    public static final void g0(sd0 sd0Var, String str, long j10) {
        if (sd0Var != null) {
            if (((Boolean) s.f31967e.f31970c.a(al.Sd)).booleanValue()) {
                zd1 zd1VarA = sd0Var.a();
                zd1VarA.v("action", "lat_init");
                zd1VarA.v(str, Long.toString(j10));
                zd1VarA.w();
            }
        }
    }

    @Override // q4.l
    public void B(int i) {
        ((l) this.f2535d).B(i);
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public int C(byte[] bArr, int i, int i10) {
        return ((a2) this.f2535d).C(bArr, i, i10);
    }

    @Override // v3.g
    public long D(long j10, long j11) {
        q4.g gVar = (q4.g) this.f2535d;
        return z.f(gVar.f31734e, j10 + this.f2534c, true);
    }

    @Override // com.google.android.gms.internal.ads.a2
    public void E(byte[] bArr, int i, int i10) {
        ((a2) this.f2535d).E(bArr, i, i10);
    }

    @Override // q4.l
    public int F(int i) {
        return ((l) this.f2535d).F(i);
    }

    @Override // q4.m
    public void G() {
        ((m) this.f2535d).G();
    }

    @Override // q4.l
    public int I(byte[] bArr, int i, int i10) {
        return ((l) this.f2535d).I(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.a2
    public boolean J(byte[] bArr, int i, int i10, boolean z5) {
        return ((a2) this.f2535d).J(bArr, 0, i10, z5);
    }

    @Override // com.google.android.gms.internal.ads.a2
    public int K(byte[] bArr, int i, int i10) {
        return ((a2) this.f2535d).K(bArr, i, i10);
    }

    @Override // q4.l
    public void L() {
        ((l) this.f2535d).L();
    }

    @Override // q4.l
    public void M(int i) {
        ((l) this.f2535d).M(i);
    }

    @Override // v3.g
    public boolean N() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.b2
    public w2 O(int i, int i10) {
        return ((b2) this.f2535d).O(i, i10);
    }

    @Override // q4.m
    public a0 P(int i, int i10) {
        return ((m) this.f2535d).P(i, i10);
    }

    @Override // v3.g
    public long Q() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.a2
    public boolean R(byte[] bArr, int i, int i10, boolean z5) {
        return ((a2) this.f2535d).R(bArr, 0, i10, z5);
    }

    @Override // v3.g
    public long S(long j10) {
        return ((q4.g) this.f2535d).f31730a;
    }

    @Override // v3.g
    public long T(long j10, long j11) {
        return ((q4.g) this.f2535d).f31730a;
    }

    @Override // com.google.android.gms.internal.ads.b2
    public void U(o2 o2Var) {
        ((b2) this.f2535d).U(new u2(this, o2Var, o2Var));
    }

    @Override // q4.l
    public void V(byte[] bArr, int i, int i10) {
        ((l) this.f2535d).V(bArr, i, i10);
    }

    public void W(int i) {
        if (i < 64) {
            this.f2534c &= ~(1 << i);
            return;
        }
        c cVar = (c) this.f2535d;
        if (cVar != null) {
            cVar.W(i - 64);
        }
    }

    public int X(int i) {
        c cVar = (c) this.f2535d;
        if (cVar == null) {
            return i >= 64 ? Long.bitCount(this.f2534c) : Long.bitCount(this.f2534c & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2534c & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2534c) + cVar.X(i - 64);
    }

    public void Y() {
        if (((c) this.f2535d) == null) {
            this.f2535d = new c(7);
        }
    }

    public boolean Z(int i) {
        if (i < 64) {
            return (this.f2534c & (1 << i)) != 0;
        }
        Y();
        return ((c) this.f2535d).Z(i - 64);
    }

    @Override // com.google.android.gms.internal.ads.jr0
    public Object a(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((e0) ((fh0) this.f2535d).f2253b).t()) {
            return null;
        }
        long j10 = this.f2534c;
        zi ziVarP = aj.P();
        ziVarP.b();
        ((aj) ziVarP.f9560c).L(j10);
        byte[] bArrB = ((aj) ziVarP.d()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        ix.Y(sQLiteDatabase, j10, bArrB);
        return null;
    }

    public void a0(int i, boolean z5) {
        if (i >= 64) {
            Y();
            ((c) this.f2535d).a0(i - 64, z5);
            return;
        }
        long j10 = this.f2534c;
        boolean z10 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i) - 1;
        this.f2534c = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z5) {
            e0(i);
        } else {
            W(i);
        }
        if (z10 || ((c) this.f2535d) != null) {
            Y();
            ((c) this.f2535d).a0(0, z10);
        }
    }

    @Override // v3.g
    public long b(long j10) {
        return ((q4.g) this.f2535d).f31734e[(int) j10] - this.f2534c;
    }

    public k b0() {
        g0.a2 a2Var = new g0.a2(2);
        while (true) {
            String line = ((i) this.f2535d).q(this.f2534c);
            this.f2534c -= (long) line.length();
            if (line.length() == 0) {
                return a2Var.g();
            }
            Intrinsics.checkNotNullParameter(line, "line");
            int iB = StringsKt.B(line, ':', 1, 4);
            if (iB != -1) {
                String strSubstring = line.substring(0, iB);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iB + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                a2Var.f(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
                a2Var.f("", strSubstring3);
            } else {
                a2Var.f("", line);
            }
        }
    }

    public boolean c0(int i) {
        if (i >= 64) {
            Y();
            return ((c) this.f2535d).c0(i - 64);
        }
        long j10 = 1 << i;
        long j11 = this.f2534c;
        boolean z5 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.f2534c = j12;
        long j13 = j10 - 1;
        this.f2534c = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        c cVar = (c) this.f2535d;
        if (cVar != null) {
            if (cVar.Z(0)) {
                e0(63);
            }
            ((c) this.f2535d).c0(0);
        }
        return z5;
    }

    public void d0() {
        this.f2534c = 0L;
        c cVar = (c) this.f2535d;
        if (cVar != null) {
            cVar.d0();
        }
    }

    @Override // com.google.android.gms.internal.ads.a2
    public void e() {
        ((a2) this.f2535d).e();
    }

    public void e0(int i) {
        if (i < 64) {
            this.f2534c |= 1 << i;
        } else {
            Y();
            ((c) this.f2535d).e0(i - 64);
        }
    }

    @Override // v3.g
    public long f(long j10, long j11) {
        return ((q4.g) this.f2535d).f31733d[(int) j10];
    }

    public void f0(Context context, u9.a aVar, boolean z5, yw ywVar, String str, String str2, Runnable runnable, final bs0 bs0Var, final sd0 sd0Var, final Long l10, boolean z10) {
        PackageInfo packageInfoD;
        p9.k kVar = p9.k.C;
        ua.a aVar2 = kVar.f31304k;
        ua.a aVar3 = kVar.f31304k;
        aVar2.getClass();
        if (SystemClock.elapsedRealtime() - this.f2534c < 5000) {
            u9.i.h("Not retrying to fetch app settings");
            return;
        }
        aVar3.getClass();
        this.f2534c = SystemClock.elapsedRealtime();
        if (ywVar != null && !TextUtils.isEmpty(ywVar.f12770e)) {
            long j10 = ywVar.f12771f;
            aVar3.getClass();
            if (System.currentTimeMillis() - j10 <= ((Long) s.f31967e.f31970c.a(al.R4)).longValue() && ywVar.f12773h) {
                return;
            }
        }
        if (context == null) {
            u9.i.h("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            u9.i.h("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f2535d = applicationContext;
        final xr0 xr0VarK = xr0.k(context, 4);
        xr0VarK.h();
        wq wqVarN = kVar.f31311r.n((Context) this.f2535d, aVar, bs0Var);
        fp fpVar = nz.f8507m;
        yq yqVarA = wqVarN.a("google.afma.config.fetchAppSettings", fpVar, fpVar);
        int i = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(CommonUrlParts.APP_ID, str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z5);
            jSONObject.put("pn", context.getPackageName());
            wk wkVar = al.f2915a;
            s sVar = s.f31967e;
            jSONObject.put("experiment_ids", TextUtils.join(StringUtils.COMMA, sVar.f31968a.w()));
            jSONObject.put("js", aVar.f34365b);
            if (((Boolean) sVar.f31970c.a(al.La)).booleanValue()) {
                jSONObject.put("inspector_enabled", z10);
            }
            try {
                ApplicationInfo applicationInfo = ((Context) this.f2535d).getApplicationInfo();
                if (applicationInfo != null && (packageInfoD = wa.b.a(context).d(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoD.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                c0.m("Error fetching PackageInfo.");
            }
            ed.d dVarB = yqVarA.b(jSONObject);
            z71 z71Var = new z71() { // from class: p9.c
                @Override // com.google.android.gms.internal.ads.z71
                public final ed.d a(Object obj) throws JSONException {
                    Long l11 = l10;
                    sd0 sd0Var2 = sd0Var;
                    xr0 xr0Var = xr0VarK;
                    bs0 bs0Var2 = bs0Var;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        String string = jSONObject2.getString("appSettingsJson");
                        k kVar2 = k.C;
                        e0 e0VarG = kVar2.f31302h.g();
                        e0VarG.i();
                        synchronized (e0VarG.f33564a) {
                            try {
                                kVar2.f31304k.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (string == null || string.equals(e0VarG.f33576n.f12770e)) {
                                    e0VarG.f33576n.f12771f = jCurrentTimeMillis;
                                } else {
                                    e0VarG.f33576n = new yw(string, jCurrentTimeMillis);
                                    SharedPreferences.Editor editor = e0VarG.f33570g;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        e0VarG.f33570g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                                        e0VarG.f33570g.apply();
                                    }
                                    e0VarG.j();
                                    Iterator it = e0VarG.f33566c.iterator();
                                    while (it.hasNext()) {
                                        ((Runnable) it.next()).run();
                                    }
                                }
                            } finally {
                            }
                        }
                        if (l11 != null) {
                            k.C.f31304k.getClass();
                            com.google.android.gms.ads.identifier.c.g0(sd0Var2, "cld_s", SystemClock.elapsedRealtime() - l11.longValue());
                        }
                    }
                    String strOptString = jSONObject2.optString("errorReason", "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        xr0Var.f(strOptString);
                    }
                    xr0Var.a(zOptBoolean);
                    bs0Var2.b(xr0Var.p());
                    return n81.f8237c;
                }
            };
            gx gxVar = hx.f6285g;
            r71 r71VarJ = vv.J(dVarB, z71Var, gxVar);
            if (runnable != null) {
                ((jx) dVarB).f6961b.a(runnable, gxVar);
            }
            if (l10 != null) {
                ((jx) dVarB).f6961b.a(new k0.i(28, sd0Var, l10), gxVar);
            }
            if (((Boolean) s.f31967e.f31970c.a(al.C8)).booleanValue()) {
                r71VarJ.a(new l81(i, r71VarJ, new ea1("ConfigLoader.maybeFetchNewAppSettings", 4)), gxVar);
            } else {
                ix.m(r71VarJ, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e3) {
            u9.i.f("Error requesting application settings", e3);
            xr0VarK.g(e3);
            xr0VarK.a(false);
            bs0Var.b(xr0VarK.p());
        }
    }

    @Override // com.google.android.gms.internal.ads.a2
    public int g() {
        return ((a2) this.f2535d).g();
    }

    @Override // q4.l
    public long getLength() {
        return ((l) this.f2535d).getLength() - this.f2534c;
    }

    @Override // q4.l
    public long getPosition() {
        return ((l) this.f2535d).getPosition() - this.f2534c;
    }

    @Override // q4.l
    public boolean h(byte[] bArr, int i, int i10, boolean z5) {
        return ((l) this.f2535d).h(bArr, 0, i10, z5);
    }

    @Override // q4.m
    public void j(t tVar) {
        ((m) this.f2535d).j(new y(this, tVar, tVar));
    }

    @Override // v3.g
    public long m(long j10, long j11) {
        return 0L;
    }

    @Override // v3.g
    public long n(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // v3.g
    public j o(long j10) {
        return new j(null, ((q4.g) this.f2535d).f31732c[(int) j10], r1.f31731b[r7]);
    }

    @Override // sb.c
    public void onFailure(Exception exc) {
        ma.b bVar;
        switch (this.f2533b) {
            case 0:
                d dVar = (d) this.f2535d;
                long j10 = this.f2534c;
                Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
                if ((exc instanceof na.d) && (bVar = ((na.d) exc).f29186b.f2636e) != null && bVar.f28761c == 24) {
                    dVar.f2540b.set(j10);
                    break;
                }
                break;
            default:
                ((AtomicLong) ((e) this.f2535d).f2021e).set(this.f2534c);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.a2
    public long p() {
        return ((a2) this.f2535d).p() - this.f2534c;
    }

    @Override // com.google.android.gms.internal.ads.a2
    public long q() {
        return ((a2) this.f2535d).q() - this.f2534c;
    }

    @Override // com.google.android.gms.internal.ads.a2
    public long r() {
        return ((a2) this.f2535d).r() - this.f2534c;
    }

    @Override // j3.h
    public int read(byte[] bArr, int i, int i10) {
        return ((l) this.f2535d).read(bArr, i, i10);
    }

    @Override // q4.l
    public void readFully(byte[] bArr, int i, int i10) {
        ((l) this.f2535d).readFully(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.a2
    public void t(int i) {
        ((a2) this.f2535d).t(i);
    }

    public String toString() {
        switch (this.f2533b) {
            case 7:
                if (((c) this.f2535d) == null) {
                    return Long.toBinaryString(this.f2534c);
                }
                return ((c) this.f2535d).toString() + "xx" + Long.toBinaryString(this.f2534c);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.b2
    public void u() {
        ((b2) this.f2535d).u();
    }

    @Override // com.google.android.gms.internal.ads.a2
    public void v(int i) {
        ((a2) this.f2535d).v(i);
    }

    @Override // com.google.android.gms.internal.ads.a2
    public void w(byte[] bArr, int i, int i10) {
        ((a2) this.f2535d).w(bArr, i, i10);
    }

    @Override // q4.l
    public boolean x(int i, boolean z5) {
        return ((l) this.f2535d).x(i, true);
    }

    @Override // q4.l
    public boolean y(byte[] bArr, int i, int i10, boolean z5) {
        return ((l) this.f2535d).y(bArr, i, i10, z5);
    }

    @Override // q4.l
    public long z() {
        return ((l) this.f2535d).z() - this.f2534c;
    }

    public c(a2 a2Var, long j10) {
        this.f2533b = 1;
        this.f2535d = a2Var;
        ix.o(a2Var.q() >= j10);
        this.f2534c = j10;
    }

    public /* synthetic */ c(Object obj, long j10, int i) {
        this.f2533b = i;
        this.f2535d = obj;
        this.f2534c = j10;
    }

    public c(int i) {
        this.f2533b = i;
        switch (i) {
            case 7:
                this.f2534c = 0L;
                break;
            case 10:
                break;
            default:
                this.f2535d = new ArrayList();
                break;
        }
    }

    public c(ua.a aVar) {
        this.f2533b = 9;
        pa.c0.i(aVar);
        this.f2535d = aVar;
    }

    public c(i source) {
        this.f2533b = 6;
        Intrinsics.checkNotNullParameter(source, "source");
        this.f2535d = source;
        this.f2534c = 262144L;
    }

    public c(l lVar, long j10) {
        this.f2533b = 11;
        this.f2535d = lVar;
        h5.h(lVar.getPosition() >= j10);
        this.f2534c = j10;
    }
}

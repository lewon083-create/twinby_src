package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import io.sentry.Session;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yv0 implements jr0, j1.i, mb0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f12752g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12757f;

    public /* synthetic */ yv0(ac.c cVar, boolean z5, ArrayList arrayList, xi xiVar, cj cjVar) {
        this.f12754c = cVar;
        this.f12753b = z5;
        this.f12755d = arrayList;
        this.f12756e = xiVar;
        this.f12757f = cjVar;
    }

    public static yv0 b(vt0 vt0Var, xt0 xt0Var, zt0 zt0Var, zt0 zt0Var2, boolean z5) {
        if (zt0Var == zt0.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        vt0 vt0Var2 = vt0.DEFINED_BY_JAVASCRIPT;
        zt0 zt0Var3 = zt0.NATIVE;
        if (vt0Var == vt0Var2 && zt0Var == zt0Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (xt0Var == xt0.DEFINED_BY_JAVASCRIPT && zt0Var == zt0Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new yv0(vt0Var, xt0Var, zt0Var, zt0Var2, z5);
    }

    public static String n(og ogVar) {
        rg rgVarG = sg.G();
        String strZ = ogVar.z().z();
        rgVarG.b();
        ((sg) rgVarG.f9560c).I(strZ);
        String strA = ogVar.z().A();
        rgVarG.b();
        ((sg) rgVarG.f9560c).J(strA);
        long jC = ogVar.z().C();
        rgVarG.b();
        ((sg) rgVarG.f9560c).L(jC);
        long jD = ogVar.z().D();
        rgVarG.b();
        ((sg) rgVarG.f9560c).M(jD);
        long jB = ogVar.z().B();
        rgVarG.b();
        ((sg) rgVarG.f9560c).K(jB);
        return ua.b.b(((sg) rgVarG.d()).b());
    }

    public static String o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        fe feVarZ = ge.z();
        feVarZ.b();
        ((ge) feVarZ.f9560c).D(5);
        zm1 zm1VarA = bn1.A(bArr, 0, bArr.length);
        feVarZ.b();
        ((ge) feVarZ.f9560c).A(zm1VarA);
        return Base64.encodeToString(((ge) feVarZ.d()).b(), 11);
    }

    @Override // com.google.android.gms.internal.ads.jr0
    public Object a(Object obj) {
        long j10;
        long j11;
        int i;
        gh0 gh0Var = (gh0) ((ac.c) this.f12754c).f739c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((t9.e0) gh0Var.f2253b).t()) {
            return null;
        }
        cj cjVar = (cj) this.f12757f;
        xi xiVar = (xi) this.f12756e;
        ArrayList arrayList = (ArrayList) this.f12755d;
        boolean z5 = this.f12753b;
        zi ziVarP = aj.P();
        ziVarP.b();
        ((aj) ziVarP.f9560c).D(arrayList);
        Context context = gh0Var.f5809d;
        int i10 = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 2 : 1;
        ziVarP.b();
        ((aj) ziVarP.f9560c).G(i10);
        TelephonyManager telephonyManager = gh0Var.f5811f;
        p9.k kVar = p9.k.C;
        int iK = kVar.f31300f.k(context, telephonyManager);
        ziVarP.b();
        ((aj) ziVarP.f9560c).H(iK);
        eh0 eh0Var = gh0Var.f5812g;
        synchronized (eh0Var.f4960h) {
            j10 = eh0Var.f4955c;
        }
        ziVarP.b();
        ((aj) ziVarP.f9560c).B(j10);
        synchronized (eh0Var) {
            synchronized (eh0Var.f4961j) {
                j11 = eh0Var.f4957e;
            }
        }
        ziVarP.b();
        ((aj) ziVarP.f9560c).C(j11);
        synchronized (eh0Var.f4959g) {
            i = eh0Var.f4954b;
        }
        ziVarP.b();
        ((aj) ziVarP.f9560c).I(i);
        ziVarP.b();
        ((aj) ziVarP.f9560c).K(cjVar);
        ziVarP.b();
        ((aj) ziVarP.f9560c).E(xiVar);
        int i11 = gh0Var.f5813h;
        ziVarP.b();
        ((aj) ziVarP.f9560c).J(i11);
        int i12 = z5 ? 2 : 1;
        ziVarP.b();
        ((aj) ziVarP.f9560c).A(i12);
        long jA = eh0Var.a();
        ziVarP.b();
        ((aj) ziVarP.f9560c).L(jA);
        kVar.f31304k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ziVarP.b();
        ((aj) ziVarP.f9560c).z(jCurrentTimeMillis);
        int i13 = Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0 ? 2 : 1;
        ziVarP.b();
        ((aj) ziVarP.f9560c).F(i13);
        byte[] bArrB = ((aj) ziVarP.d()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z5) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        ix.Y(sQLiteDatabase, gh0Var.f5812g.a(), bArrB);
        return null;
    }

    public synchronized String c(Context context) {
        byte[] bArrQ;
        try {
            HashMap mapJ = ((cw0) this.f12756e).j();
            mapJ.put("f", "q");
            mapJ.put("ctx", context);
            mapJ.put("aid", null);
            bArrQ = q(mapJ);
            if (this.f12753b) {
                mapJ.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return o(bArrQ);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x009f, B:33:0x00bf, B:34:0x00c4, B:36:0x00c6, B:38:0x00d4, B:39:0x00d9, B:42:0x00dd, B:47:0x00e7, B:48:0x00ed, B:50:0x00ef, B:52:0x0125, B:53:0x0136, B:55:0x013c, B:56:0x0141, B:58:0x0143, B:60:0x014e, B:61:0x0155, B:63:0x015c, B:64:0x0163, B:66:0x017d, B:68:0x0189, B:69:0x018c, B:70:0x018f, B:71:0x0194, B:23:0x007c, B:25:0x0082, B:28:0x008d, B:29:0x009d), top: B:77:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(com.google.android.gms.internal.ads.og r17, com.google.android.gms.internal.ads.c6 r18) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yv0.d(com.google.android.gms.internal.ads.og, com.google.android.gms.internal.ads.c6):boolean");
    }

    public synchronized String e(Context context, View view, Activity activity) {
        byte[] bArrQ;
        try {
            HashMap mapL = ((cw0) this.f12756e).l();
            mapL.put("f", "v");
            mapL.put("ctx", context);
            mapL.put("aid", null);
            mapL.put("view", view);
            mapL.put("act", activity);
            bArrQ = q(mapL);
            if (this.f12753b) {
                mapL.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return o(bArrQ);
    }

    public boolean f(og ogVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f12752g) {
            try {
                if (!ix.C(new File(i(ogVar.z().z()), "pcbc"), ogVar.B().D())) {
                    p(4020, jCurrentTimeMillis);
                    return false;
                }
                String strN = n(ogVar);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f12755d).edit();
                editorEdit.putString("LATMTD".concat(String.valueOf((String) this.f12756e)), strN);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    p(5015, jCurrentTimeMillis);
                } else {
                    p(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized String g(Context context, String str, View view, Activity activity) {
        byte[] bArrQ;
        try {
            HashMap mapG = ((cw0) this.f12756e).g();
            mapG.put("f", "c");
            mapG.put("ctx", context);
            mapG.put("cs", str);
            mapG.put("aid", null);
            mapG.put("view", view);
            mapG.put("act", activity);
            bArrQ = q(mapG);
            if (this.f12753b) {
                mapG.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return o(bArrQ);
    }

    public synchronized void h(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap mapI = ((cw0) this.f12756e).i();
            mapI.put("aid", null);
            mapI.put("evt", motionEvent);
            Object obj = this.f12754c;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapI);
            ((dv0) this.f12757f).b(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e3) {
            throw new zv0(2005, e3);
        }
    }

    public File i(String str) {
        return new File(new File(((Context) this.f12754c).getDir("pccache", 0), (String) this.f12756e), str);
    }

    public synchronized boolean j() {
        Object obj;
        try {
            obj = this.f12754c;
        } catch (Exception e3) {
            throw new zv0(2001, e3);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod(Session.JsonKeys.INIT, null).invoke(obj, null)).booleanValue();
    }

    public synchronized void k() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.f12754c;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            ((dv0) this.f12757f).b(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e3) {
            throw new zv0(2003, e3);
        }
    }

    public synchronized int l() {
        Object obj;
        try {
            obj = this.f12754c;
        } catch (Exception e3) {
            throw new zv0(2006, e3);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }

    @Override // j1.i
    public /* synthetic */ Object m(j1.h hVar) {
        ey0 ey0Var = (ey0) this.f12754c;
        ey0Var.f5137a.execute(new cy0(ey0Var, (String) this.f12756e, hVar, this.f12753b, (String) this.f12755d, (byte[]) this.f12757f));
        return "";
    }

    public void p(int i, long j10) {
        ((ov0) this.f12757f).b(i, j10);
    }

    public synchronized byte[] q(Map map) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.f12754c;
        } catch (Exception e3) {
            ((dv0) this.f12757f).c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    public sg r(int i) {
        kn1 kn1VarA;
        String str = (String) this.f12756e;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f12755d;
        String string = i == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                byte[] bArrM = ua.b.m(string);
                zm1 zm1VarA = bn1.A(bArrM, 0, bArrM.length);
                if (this.f12753b) {
                    kn1 kn1Var = kn1.f7271a;
                    int i10 = tm1.f10663a;
                    kn1VarA = kn1.f7272b;
                } else {
                    kn1VarA = kn1.a();
                }
                return sg.F(zm1VarA, kn1VarA);
            } catch (co1 unused) {
            } catch (NullPointerException unused2) {
                p(2029, jCurrentTimeMillis);
            } catch (RuntimeException unused3) {
                p(2032, jCurrentTimeMillis);
            }
        }
        return null;
    }

    public /* synthetic */ yv0(ey0 ey0Var, String str, boolean z5, String str2, byte[] bArr) {
        this.f12754c = ey0Var;
        this.f12756e = str;
        this.f12753b = z5;
        this.f12755d = str2;
        this.f12757f = bArr;
    }

    public /* synthetic */ yv0(Object obj, Object obj2, Object obj3, Object obj4, boolean z5) {
        this.f12754c = obj;
        this.f12755d = obj2;
        this.f12756e = obj3;
        this.f12757f = obj4;
        this.f12753b = z5;
    }

    public yv0(Context context, ng ngVar, ov0 ov0Var, boolean z5) {
        this.f12753b = false;
        this.f12754c = context;
        this.f12756e = Integer.toString(ngVar.f8295b);
        this.f12755d = context.getSharedPreferences("pcvmspf", 0);
        this.f12757f = ov0Var;
        this.f12753b = z5;
    }

    public yv0(vt0 vt0Var, xt0 xt0Var, zt0 zt0Var, zt0 zt0Var2, boolean z5) {
        this.f12756e = vt0Var;
        this.f12757f = xt0Var;
        this.f12754c = zt0Var;
        this.f12755d = zt0Var2;
        this.f12753b = z5;
    }

    @Override // com.google.android.gms.internal.ads.mb0, com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo0a(Object obj) {
        ((ny1) obj).b(0, (hy1) ((n90) this.f12754c).f8248c, (zx1) this.f12755d, (ey1) this.f12756e, (IOException) this.f12757f, this.f12753b);
    }
}

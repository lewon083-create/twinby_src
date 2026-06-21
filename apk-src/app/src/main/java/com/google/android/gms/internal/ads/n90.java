package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n90 implements s1, bb, w9.c, t81, k81, o00, jr0, nr0, td0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static n90 f8246e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8249d;

    public /* synthetic */ n90(int i, Object obj, Object obj2) {
        this.f8247b = i;
        this.f8248c = obj;
        this.f8249d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.jr0
    public Object a(Object obj) {
        kh0 kh0Var = (kh0) this.f8248c;
        cb cbVar = (cb) this.f8249d;
        kh0Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(cbVar.f4129a));
        contentValues.put("gws_query_id", (String) cbVar.f4131c);
        contentValues.put("url", (String) cbVar.f4132d);
        contentValues.put("event_state", Integer.valueOf(cbVar.f4130b - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        t9.g0 g0Var = p9.k.C.f31297c;
        Context context = kh0Var.f7231b;
        t9.w wVarC = t9.g0.c(context);
        if (wVarC != null) {
            try {
                wVarC.zzf(new xa.b(context));
            } catch (RemoteException e3) {
                t9.c0.n("Failed to schedule offline ping sender.", e3);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.o00
    public void b(int i, String str, String str2, boolean z5) {
        switch (this.f8247b) {
            case 10:
                db0 db0Var = (db0) this.f8248c;
                Map map = (Map) this.f8249d;
                HashMap map2 = new HashMap();
                map2.put("messageType", "validatorHtmlLoaded");
                map2.put("id", (String) map.get("id"));
                db0Var.f4541b.d(map2);
                break;
            default:
                jx jxVar = (jx) this.f8249d;
                if (!z5) {
                    int length = String.valueOf(i).length();
                    StringBuilder sb2 = new StringBuilder(length + 55 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb2.append("Ad Web View failed to load. Error code: ");
                    sb2.append(i);
                    sb2.append(", Description: ");
                    sb2.append(str);
                    jxVar.d(new Exception(a0.u.o(sb2, ", Failing URL: ", str2)));
                } else {
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.E2)).booleanValue()) {
                        a0.u.u(p9.k.C.f31304k, (Bundle) this.f8248c, "rendering-webview-load-html-end");
                    }
                    jxVar.b(null);
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b A[EDGE_INSN: B:67:0x011b->B:51:0x011b BREAK  A[LOOP:1: B:39:0x00e4->B:50:0x010a], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.r1 c(com.google.android.gms.internal.ads.a2 r17, long r18) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n90.c(com.google.android.gms.internal.ads.a2, long):com.google.android.gms.internal.ads.r1");
    }

    public Object d(k91 k91Var) {
        return ((vd1) this.f8248c).a(k91Var.a(), ((xd1) this.f8249d).j());
    }

    public synchronized Map e() {
        try {
            if (((Map) this.f8249d) == null) {
                this.f8249d = Collections.unmodifiableMap(new HashMap((HashMap) this.f8248c));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f8249d;
    }

    public void f(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f8249d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f8249d = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, f81.f5272b, new ax1());
        this.f8249d = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.f8248c).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void g(qs1 qs1Var) {
        ((List) this.f8248c).add(qs1Var);
    }

    @Override // com.google.android.gms.internal.ads.t81
    /* JADX INFO: renamed from: h */
    public g91 mo1h() {
        switch (this.f8247b) {
            case 6:
                jz jzVar = (jz) this.f8248c;
                g91 g91VarMo1h = ((t81) this.f8249d).mo1h();
                cf cfVar = new cf(14, jzVar);
                return new fz(jzVar.f7010b, g91VarMo1h, jzVar.f7022o, jzVar.f7023p, jzVar, cfVar);
            default:
                c5 c5Var = (c5) this.f8249d;
                return new tb1((Context) this.f8248c, new me1(null, c5Var.f4027b, c5Var.f4028c, false, (n90) c5Var.f4029d));
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        switch (this.f8247b) {
            case 9:
                ((fa0) this.f8249d).m((View) this.f8248c, (wh0) obj);
                return;
            case 12:
                String str = (String) obj;
                try {
                    iu iuVar = (iu) this.f8249d;
                    cu cuVar = (cu) this.f8248c;
                    Parcel parcelD0 = iuVar.D0();
                    parcelD0.writeString(str);
                    vg.c(parcelD0, cuVar);
                    iuVar.L1(parcelD0, 1);
                    return;
                } catch (RemoteException e3) {
                    t9.c0.n("Service can't call client", e3);
                    return;
                }
            case 14:
                com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f8249d;
                pj0 pj0Var = (pj0) obj;
                synchronized (cVar) {
                    try {
                        ((gj0) cVar.f13344h).b(pj0Var, (xp0) this.f8248c);
                        xp0 xp0VarA = ((gj0) cVar.f13344h).a();
                        if (xp0VarA != null) {
                            cVar.v(xp0VarA);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                ((rr0) ((hi) this.f8249d).f6146g).f10032c.A1(new pp0(2, (or0) this.f8248c));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s1
    public void j() {
        byte[] bArr = cq0.f4294b;
        int length = bArr.length;
        ((tk0) this.f8249d).z(0, bArr);
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        switch (this.f8247b) {
            case 9:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3047i6)).booleanValue()) {
                    p9.k.C.f31302h.e("omid native display exp", th2);
                    return;
                }
                return;
            case 12:
                try {
                    iu iuVar = (iu) this.f8249d;
                    q9.x1 x1VarI = vv.i(th2);
                    t9.o oVar = new t9.o(fs1.n(th2.getMessage()) ? x1VarI.f31977c : th2.getMessage(), x1VarI.f31976b);
                    Parcel parcelD0 = iuVar.D0();
                    vg.c(parcelD0, oVar);
                    iuVar.L1(parcelD0, 2);
                    return;
                } catch (RemoteException e3) {
                    t9.c0.n("Service can't call client", e3);
                    return;
                }
            case 14:
                com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f8249d;
                synchronized (cVar) {
                    try {
                        gj0 gj0Var = (gj0) cVar.f13344h;
                        xp0 xp0Var = (xp0) this.f8248c;
                        gj0Var.c(xp0Var);
                        xp0 xp0VarA = ((gj0) cVar.f13344h).a();
                        if (xp0Var.f12267v0) {
                            while (xp0VarA != null) {
                                cVar.v(xp0VarA);
                                xp0VarA = ((gj0) cVar.f13344h).a();
                            }
                        } else if (xp0VarA != null) {
                            cVar.v(xp0VarA);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                ((rr0) ((hi) this.f8249d).f6146g).f10032c.A1(new zd1(20, this.f8248c, (Object) th2, false));
                return;
        }
    }

    public void l(qs1 qs1Var) {
        ((List) this.f8249d).add(qs1Var);
    }

    public void m(Object obj, String str) throws IOException {
        boolean zCommit;
        String str2 = (String) this.f8248c;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f8249d;
        if (obj instanceof String) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                String strValueOf = String.valueOf(obj.getClass());
                Log.e("GpidLifecycleSPHandler", om1.n(new StringBuilder(strValueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", strValueOf, " for app ", str2));
                throw new IOException(om1.n(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException(om1.n(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    public rs1 n() {
        return new rs1((List) this.f8248c, (List) this.f8249d);
    }

    public void o(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f8248c).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f8249d) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void p(String str) throws IOException {
        if (((SharedPreferences) this.f8249d).edit().remove(str).commit()) {
            return;
        }
        String str2 = (String) this.f8248c;
        throw new IOException(om1.n(new StringBuilder(str.length() + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    public void q(mb0 mb0Var) {
        for (jy1 jy1Var : (CopyOnWriteArrayList) this.f8249d) {
            Object obj = jy1Var.f7007b;
            Handler handler = jy1Var.f7006a;
            my1 my1Var = new my1(0, mb0Var, obj);
            String str = cq0.f4293a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    my1Var.run();
                } else {
                    handler.post(my1Var);
                }
            }
        }
    }

    @Override // w9.c
    public void w(la.m mVar) {
        int i = mVar.f28098c;
        try {
            String canonicalName = ((w9.a) this.f8249d).getClass().getCanonicalName();
            String str = (String) mVar.f28099d;
            String str2 = (String) mVar.f28100e;
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb2.append(canonicalName);
            sb2.append("failed to load mediation ad: ErrorCode = ");
            sb2.append(i);
            sb2.append(". ErrorMessage = ");
            sb2.append(str);
            sb2.append(". ErrorDomain = ");
            sb2.append(str2);
            u9.i.c(sb2.toString());
            nr nrVar = (nr) this.f8248c;
            nrVar.i1(mVar.j());
            nrVar.c4(i, str);
            nrVar.O(i);
        } catch (RemoteException e3) {
            u9.i.f("", e3);
        }
    }

    public /* synthetic */ n90(int i, Object obj, Object obj2, boolean z5) {
        this.f8247b = i;
        this.f8248c = obj2;
        this.f8249d = obj;
    }

    public n90(Context context, int i) {
        this.f8247b = i;
        switch (i) {
            case 18:
                this.f8248c = context.getPackageName();
                this.f8249d = context.getSharedPreferences("paid_storage_sp", 0);
                break;
            case 19:
            default:
                this.f8249d = context;
                this.f8248c = null;
                break;
            case 20:
                c5 c5Var = new c5(5);
                this.f8248c = context.getApplicationContext();
                this.f8249d = c5Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.bb
    public File h() {
        if (((File) this.f8248c) == null) {
            this.f8248c = new File(((Context) this.f8249d).getCacheDir(), "volley");
        }
        return (File) this.f8248c;
    }

    @Override // com.google.android.gms.internal.ads.nr0
    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public void mo9h() {
        vi0 vi0Var = (vi0) this.f8248c;
        fl flVar = (fl) this.f8249d;
        gl glVar = (gl) vi0Var.f11390d;
        Parcel parcelD0 = glVar.D0();
        vg.e(parcelD0, flVar);
        glVar.L1(parcelD0, 1);
    }

    public n90(int i) {
        this.f8247b = i;
        switch (i) {
            case 21:
                break;
            case 23:
                this.f8248c = new HashMap();
                break;
            case 26:
                this.f8248c = new HashSet();
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f8248c = byteArrayOutputStream;
                this.f8249d = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo0a(Object obj) {
        ((yu1) obj).h((xu1) this.f8248c, (ey1) this.f8249d);
    }

    public n90(int i, int i10) {
        List arrayList;
        Object arrayList2;
        this.f8247b = 24;
        if (i == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i);
        }
        this.f8248c = arrayList;
        if (i10 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i10);
        }
        this.f8249d = arrayList2;
    }

    public n90(yr yrVar, nr nrVar, w9.a aVar) {
        this.f8247b = 4;
        this.f8248c = nrVar;
        this.f8249d = aVar;
    }

    public n90(xg0 xg0Var, iu iuVar, cu cuVar) {
        this.f8247b = 12;
        this.f8249d = iuVar;
        this.f8248c = cuVar;
    }

    public /* synthetic */ n90(yo0 yo0Var) {
        this.f8247b = 2;
        this.f8248c = yo0Var;
        this.f8249d = new tk0();
    }

    public n90(r51 r51Var, int[] iArr) {
        this.f8247b = 19;
        this.f8248c = x41.v(r51Var);
        this.f8249d = iArr;
    }
}

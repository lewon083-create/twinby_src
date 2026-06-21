package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oq0 implements x6, m9, pa.b, w9.h, w9.j, w9.l, e80, jr0, h90, ep0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static oq0 f8758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f8759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f8760h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8764e;

    static {
        long j10 = -9223372036854775807L;
        f8759g = new o(2, j10, false);
        f8760h = new o(3, j10, false);
    }

    public /* synthetic */ oq0(int i, Object obj, Object obj2) {
        this.f8761b = i;
        this.f8762c = obj;
        this.f8763d = obj2;
    }

    public static oq0 l(Context context) {
        synchronized (oq0.class) {
            try {
                oq0 oq0Var = f8758f;
                if (oq0Var != null) {
                    return oq0Var;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) cm.f4254b.r()).longValue();
                q9.d1 d1VarAsInterface = null;
                if (jLongValue > 0 && jLongValue <= 254715000) {
                    try {
                        d1VarAsInterface = q9.c1.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
                        u9.i.f("Failed to retrieve lite SDK info.", e3);
                    }
                }
                oq0 oq0Var2 = new oq0(applicationContext, d1VarAsInterface);
                f8758f = oq0Var2;
                return oq0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String v(Context context) {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i);
                }
                i61 i61VarF = i61.f6401f.f();
                byte[] bArrDigest = messageDigest.digest();
                String strG = i61VarF.g(bArrDigest.length, bArrDigest);
                fileInputStream.close();
                return strG;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public void A() {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f2956c7)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            xq0 xq0Var = (xq0) this.f8763d;
            sb2.append(xq0Var.f12281d);
            sb2.append(" PoolCollection");
            vq0 vq0Var = (vq0) this.f8764e;
            sb2.append("\n\tPool does not exist: " + vq0Var.f11443c + "\n\tNew pools created: " + vq0Var.f11441a + "\n\tPools removed: " + vq0Var.f11442b + "\n\tEntries added: " + vq0Var.f11445e + "\n\tNo entries retrieved: " + vq0Var.f11444d + "\n");
            int i = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.f8762c).entrySet()) {
                i++;
                sb2.append(i);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zq0) entry.getKey()).hashCode());
                sb2.append("    ");
                int i10 = 0;
                while (true) {
                    tq0 tq0Var = (tq0) entry.getValue();
                    tq0Var.a();
                    if (i10 >= tq0Var.f10695a.size()) {
                        break;
                    }
                    sb2.append("[O]");
                    i10++;
                }
                tq0 tq0Var2 = (tq0) entry.getValue();
                tq0Var2.a();
                for (int size = tq0Var2.f10695a.size(); size < xq0Var.f12283f; size++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                gr0 gr0Var = ((tq0) entry.getValue()).f10698d;
                sb2.append("Created: " + gr0Var.f5892a + " Last accessed: " + gr0Var.f5894c + " Accesses: " + gr0Var.f5895d + "\nEntries retrieved: Valid: " + gr0Var.f5896e + " Stale: " + gr0Var.f5897f);
                sb2.append("\n");
            }
            while (i < xq0Var.f12282e) {
                i++;
                sb2.append(i);
                sb2.append(".\n");
            }
            u9.i.c(sb2.toString());
        }
    }

    public i81 B(ku kuVar, qg0 qg0Var, qg0 qg0Var2, z71 z71Var) {
        r81 r81Var = (r81) this.f8762c;
        String str = kuVar.f7300e;
        t9.g0 g0Var = p9.k.C.f31297c;
        return vv.H(vv.J(vv.J(i81.s(t9.g0.f(str) ? vv.y(new og0(1)) : vv.H(qg0Var.c(kuVar), ExecutionException.class, n20.f8158g, r81Var)), n20.f8156e, r81Var), z71Var, r81Var), og0.class, new yq(this, qg0Var2, kuVar, z71Var, 3), r81Var);
    }

    @Override // com.google.android.gms.internal.ads.jr0
    public Object a(Object obj) {
        switch (this.f8761b) {
            case 17:
                return p((yg0) obj);
            default:
                kh0 kh0Var = (kh0) this.f8762c;
                u9.l lVar = (u9.l) this.f8763d;
                String str = (String) this.f8764e;
                kh0Var.getClass();
                kh0Var.f7232c.execute(new d1((SQLiteDatabase) obj, str, lVar, 7));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.x6
    public ArrayList b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.f8762c;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = (long[]) this.f8763d;
            int i10 = i + i;
            if (jArr[i10] <= j10 && j10 < jArr[i10 + 1]) {
                e8 e8Var = (e8) list.get(i);
                z40 z40Var = e8Var.f4871a;
                if (z40Var.f12878e == -3.4028235E38f) {
                    arrayList2.add(e8Var);
                } else {
                    arrayList.add(z40Var);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, v.f11146f);
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            z40 z40Var2 = ((e8) arrayList2.get(i11)).f4871a;
            arrayList.add(new z40(z40Var2.f12874a, z40Var2.f12875b, z40Var2.f12876c, z40Var2.f12877d, (-1) - i11, 1, z40Var2.f12880g, z40Var2.f12881h, z40Var2.i, z40Var2.f12884l, z40Var2.f12885m, z40Var2.f12882j, z40Var2.f12883k, z40Var2.f12886n, z40Var2.f12887o, z40Var2.f12888p));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.m9
    public void c(yo0 yo0Var, b2 b2Var, r9 r9Var) {
        this.f8763d = yo0Var;
        r9Var.f();
        r9Var.g();
        w2 w2VarO = b2Var.O(r9Var.f9763d, 5);
        this.f8764e = w2VarO;
        w2VarO.e((jx1) this.f8762c);
    }

    @Override // com.google.android.gms.internal.ads.h90
    public void d(boolean z5, Context context, o60 o60Var) throws g90 {
        kq0 kq0Var;
        switch (this.f8761b) {
            case 20:
                try {
                    ob.z zVar = p9.k.C.f31296b;
                    ob.z.a(context, (AdOverlayInfoParcel) ((jx) this.f8762c).f6961b.get(), true, (sd0) ((vi0) this.f8764e).f11392f);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    pq0 pq0Var = (pq0) ((ci0) this.f8762c).f4217b;
                    pq0Var.b(z5);
                    kr krVar = pq0Var.f9154a;
                    if (((u9.a) ((ti0) this.f8764e).f10624d).f34367d < ((Integer) q9.s.f31967e.f31970c.a(al.f2995f1)).intValue()) {
                        try {
                            krVar.m();
                            return;
                        } finally {
                        }
                    } else {
                        try {
                            krVar.p3(new xa.b(context));
                            return;
                        } finally {
                        }
                    }
                } catch (kq0 e3) {
                    u9.i.g("Cannot show interstitial.");
                    throw new g90(e3.getCause());
                }
                u9.i.g("Cannot show interstitial.");
                throw new g90(e3.getCause());
        }
    }

    public void e() {
        pa.c0.e("#008 Must be called on the main UI thread.");
        StringBuilder sb2 = new StringBuilder(String.valueOf(0).length() + 44);
        sb2.append("Adapter called onAdFailedToLoad with error 0.");
        u9.i.c(sb2.toString());
        try {
            ((nr) this.f8762c).O(0);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    public void f(la.m mVar) {
        pa.c0.e("#008 Must be called on the main UI thread.");
        int i = mVar.f28098c;
        String str = (String) mVar.f28099d;
        String str2 = (String) mVar.f28100e;
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(i);
        sb2.append(". ErrorMessage: ");
        sb2.append(str);
        sb2.append(". ErrorDomain: ");
        sb2.append(str2);
        u9.i.c(sb2.toString());
        try {
            ((nr) this.f8762c).i1(mVar.j());
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ep0
    public /* bridge */ /* synthetic */ Object g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.x6
    public int h() {
        return ((long[]) this.f8764e).length;
    }

    public void i(la.m mVar) {
        pa.c0.e("#008 Must be called on the main UI thread.");
        int i = mVar.f28098c;
        String str = (String) mVar.f28099d;
        String str2 = (String) mVar.f28100e;
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(i);
        sb2.append(". ErrorMessage: ");
        sb2.append(str);
        sb2.append(". ErrorDomain: ");
        sb2.append(str2);
        u9.i.c(sb2.toString());
        try {
            ((nr) this.f8762c).i1(mVar.j());
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.h90
    public xp0 j() {
        switch (this.f8761b) {
        }
        return (xp0) this.f8763d;
    }

    public void k(la.m mVar) {
        pa.c0.e("#008 Must be called on the main UI thread.");
        int i = mVar.f28098c;
        String str = (String) mVar.f28099d;
        String str2 = (String) mVar.f28100e;
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(i);
        sb2.append(". ErrorMessage: ");
        sb2.append(str);
        sb2.append(". ErrorDomain: ");
        sb2.append(str2);
        u9.i.c(sb2.toString());
        try {
            ((nr) this.f8762c).i1(mVar.j());
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    public i81 m(z50 z50Var) {
        ed.d dVarD;
        ed.d dVarG;
        oq0 oq0Var = (oq0) this.f8762c;
        Executor executor = (Executor) this.f8763d;
        cw cwVar = new cw(oq0Var, z50Var, executor);
        ap0 ap0Var = (ap0) cwVar.f4350f;
        if (ap0Var == null) {
            if (((Boolean) im.f6541a.r()).booleanValue()) {
                b50 b50VarH = z50Var.h();
                xq0 xq0Var = (xq0) oq0Var.f8763d;
                y50 y50Var = b50VarH.i;
                or0 or0VarR = b50VarH.f3620c.a(y50Var.o(), pr0.GET_CACHE_KEY).h(new zq(3, b50VarH, xq0Var)).r();
                gk0 gk0Var = new gk0(13, b50VarH);
                or0VarR.a(new l81(0, or0VarR, gk0Var), b50VarH.f3626j);
                dVarG = vv.G(vv.K(i81.s(or0VarR), new zo0(cwVar, 1), executor), og0.class, new zo0(cwVar, 0), executor);
            } else {
                ap0 ap0Var2 = new ap0(null, cwVar.w());
                cwVar.f4350f = ap0Var2;
                dVarG = vv.d(ap0Var2);
            }
            dVarD = vv.K(dVarG, u5.f10830q, executor);
        } else {
            dVarD = vv.d(ap0Var);
        }
        return vv.G(vv.J(i81.s(dVarD), new zq(13, this, z50Var), executor), Exception.class, new u5(16), executor);
    }

    @Override // com.google.android.gms.internal.ads.m9
    public void n(tk0 tk0Var) {
        long jA;
        long j10;
        ((yo0) this.f8763d).getClass();
        String str = cq0.f4293a;
        yo0 yo0Var = (yo0) this.f8763d;
        synchronized (yo0Var) {
            try {
                long j11 = yo0Var.f12677c;
                jA = j11 != -9223372036854775807L ? j11 + yo0Var.f12676b : yo0Var.a();
            } finally {
            }
        }
        yo0 yo0Var2 = (yo0) this.f8763d;
        synchronized (yo0Var2) {
            j10 = yo0Var2.f12676b;
        }
        if (jA == -9223372036854775807L || j10 == -9223372036854775807L) {
            return;
        }
        jx1 jx1Var = (jx1) this.f8762c;
        if (j10 != jx1Var.f6980r) {
            ow1 ow1Var = new ow1(jx1Var);
            ow1Var.f8837q = j10;
            jx1 jx1Var2 = new jx1(ow1Var);
            this.f8762c = jx1Var2;
            ((w2) this.f8764e).e(jx1Var2);
        }
        int iB = tk0Var.B();
        ((w2) this.f8764e).a(iB, tk0Var);
        ((w2) this.f8764e).c(jA, 1, iB, 0, null);
    }

    @Override // pa.b
    public void n0() {
        com.google.android.gms.internal.measurement.i4 i4Var = (com.google.android.gms.internal.measurement.i4) this.f8764e;
        synchronized (i4Var.f13783d) {
            try {
                if (i4Var.f13781b) {
                    return;
                }
                i4Var.f13781b = true;
                ki kiVar = (ki) i4Var.f13782c;
                if (kiVar == null) {
                    return;
                }
                gx gxVar = hx.f6279a;
                li liVar = (li) this.f8762c;
                ni niVar = (ni) this.f8763d;
                niVar.f6961b.a(new l81(5, niVar, gxVar.a(new eu1(this, kiVar, liVar, niVar, 2)), false), hx.f6285g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(com.google.android.gms.internal.ads.zp0 r3, com.google.android.gms.internal.ads.xp0 r4, int r5, com.google.android.gms.internal.ads.di0 r6, long r7) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f8764e
            com.google.android.gms.internal.ads.sd0 r0 = (com.google.android.gms.internal.ads.sd0) r0
            com.google.android.gms.internal.ads.zd1 r0 = r0.a()
            java.lang.String r1 = "gqi"
            java.lang.String r3 = r3.f13056b
            r0.v(r1, r3)
            r0.t(r4)
            java.lang.String r3 = "action"
            java.lang.String r1 = "adapter_status"
            r0.v(r3, r1)
            java.lang.String r3 = "adapter_l"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.v(r3, r7)
            java.lang.String r3 = "sc"
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r0.v(r3, r5)
            r3 = 0
            if (r6 == 0) goto L61
            q9.x1 r5 = r6.f4575c
            int r5 = r5.f31976b
            java.lang.String r5 = java.lang.Integer.toString(r5)
            java.lang.String r7 = "arec"
            r0.v(r7, r5)
            java.lang.Object r5 = r2.f8762c
            com.google.android.gms.internal.ads.nq0 r5 = (com.google.android.gms.internal.ads.nq0) r5
            java.lang.String r6 = r6.getMessage()
            java.util.regex.Pattern r5 = r5.f8431a
            if (r5 == 0) goto L59
            if (r6 != 0) goto L4a
            goto L59
        L4a:
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L59
            java.lang.String r5 = r5.group()
            goto L5a
        L59:
            r5 = r3
        L5a:
            if (r5 == 0) goto L61
            java.lang.String r6 = "areec"
            r0.v(r6, r5)
        L61:
            java.lang.Object r5 = r2.f8763d
            com.google.android.gms.internal.ads.fd0 r5 = (com.google.android.gms.internal.ads.fd0) r5
            java.util.List r4 = r4.f12262t
            java.util.Iterator r4 = r4.iterator()
        L6b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.gms.internal.ads.ed0 r6 = r5.b(r6)
            if (r6 == 0) goto L6b
            r3 = r6
        L7e:
            if (r3 == 0) goto La1
            java.lang.String r4 = "ancn"
            java.lang.String r5 = r3.f4920a
            r0.v(r4, r5)
            com.google.android.gms.internal.ads.ts r4 = r3.f4921b
            if (r4 == 0) goto L94
            java.lang.String r5 = "adapter_v"
            java.lang.String r4 = r4.toString()
            r0.v(r5, r4)
        L94:
            com.google.android.gms.internal.ads.ts r3 = r3.f4922c
            if (r3 == 0) goto La1
            java.lang.String r4 = "adapter_sv"
            java.lang.String r3 = r3.toString()
            r0.v(r4, r3)
        La1:
            r0.w()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oq0.o(com.google.android.gms.internal.ads.zp0, com.google.android.gms.internal.ads.xp0, int, com.google.android.gms.internal.ads.di0, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0290, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r2.append("Received error HTTP response code: ");
        r2.append(r0);
        u9.i.h(r2.toString());
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02cb, code lost:
    
        throw new com.google.android.gms.internal.ads.uf0(1, r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ee, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0209, code lost:
    
        r13.disconnect();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zg0 p(com.google.android.gms.internal.ads.yg0 r22) throws com.google.android.gms.internal.ads.uf0 {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oq0.p(com.google.android.gms.internal.ads.yg0):com.google.android.gms.internal.ads.zg0");
    }

    public synchronized void q(zq0 zq0Var, yq0 yq0Var) {
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f8762c;
            tq0 tq0Var = (tq0) concurrentHashMap.get(zq0Var);
            p9.k.C.f31304k.getClass();
            yq0Var.f12690d = System.currentTimeMillis();
            if (tq0Var == null) {
                xq0 xq0Var = (xq0) this.f8763d;
                tq0 tq0Var2 = new tq0(xq0Var.f12283f, xq0Var.f12284g * 1000);
                if (concurrentHashMap.size() == xq0Var.f12282e) {
                    int i = xq0Var.f12287k;
                    int i10 = i - 1;
                    zq0 zq0Var2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j10 = Long.MAX_VALUE;
                    if (i10 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((tq0) entry.getValue()).f10698d.f5892a < j10) {
                                j10 = ((tq0) entry.getValue()).f10698d.f5892a;
                                zq0Var2 = (zq0) entry.getKey();
                            }
                        }
                        if (zq0Var2 != null) {
                            concurrentHashMap.remove(zq0Var2);
                        }
                    } else if (i10 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((tq0) entry2.getValue()).f10698d.f5894c < j10) {
                                j10 = ((tq0) entry2.getValue()).f10698d.f5894c;
                                zq0Var2 = (zq0) entry2.getKey();
                            }
                        }
                        if (zq0Var2 != null) {
                            concurrentHashMap.remove(zq0Var2);
                        }
                    } else if (i10 == 2) {
                        int i11 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((tq0) entry3.getValue()).f10698d.f5895d < i11) {
                                i11 = ((tq0) entry3.getValue()).f10698d.f5895d;
                                zq0Var2 = (zq0) entry3.getKey();
                            }
                        }
                        if (zq0Var2 != null) {
                            concurrentHashMap.remove(zq0Var2);
                        }
                    }
                    vq0 vq0Var = (vq0) this.f8764e;
                    vq0Var.f11442b++;
                    ((uq0) vq0Var.f11446f).f11049c = true;
                }
                concurrentHashMap.put(zq0Var, tq0Var2);
                vq0 vq0Var2 = (vq0) this.f8764e;
                vq0Var2.f11441a++;
                ((uq0) vq0Var2.f11446f).f11048b = true;
                tq0Var = tq0Var2;
            }
            gr0 gr0Var = tq0Var.f10698d;
            gr0Var.getClass();
            p9.k.C.f31304k.getClass();
            gr0Var.f5894c = System.currentTimeMillis();
            gr0Var.f5895d++;
            tq0Var.a();
            LinkedList linkedList = tq0Var.f10695a;
            if (linkedList.size() != tq0Var.f10696b) {
                linkedList.add(yq0Var);
            }
            vq0 vq0Var3 = (vq0) this.f8764e;
            vq0Var3.f11445e++;
            uq0 uq0Var = (uq0) vq0Var3.f11446f;
            uq0 uq0VarClone = uq0Var.clone();
            uq0Var.f11048b = false;
            uq0Var.f11049c = false;
            fr0 fr0Var = tq0Var.f10698d.f5893b;
            fr0 fr0VarClone = fr0Var.clone();
            fr0Var.f5423b = false;
            fr0Var.f5424c = 0;
            rj rjVarZ = wj.z();
            pj pjVarA = qj.A();
            pjVarA.b();
            ((qj) pjVarA.f9560c).B();
            uj ujVarA = vj.A();
            boolean z5 = uq0VarClone.f11048b;
            ujVarA.b();
            ((vj) ujVarA.f9560c).B(z5);
            boolean z10 = uq0VarClone.f11049c;
            ujVarA.b();
            ((vj) ujVarA.f9560c).C(z10);
            int i12 = fr0VarClone.f5424c;
            ujVarA.b();
            ((vj) ujVarA.f9560c).z(i12);
            pjVarA.b();
            ((qj) pjVarA.f9560c).z((vj) ujVarA.d());
            rjVarZ.b();
            ((wj) rjVarZ.f9560c).A((qj) pjVarA.d());
            yq0Var.f12687a.h().f3623f.B((wj) rjVarZ.d());
            A();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void r(q9.d3 d3Var, int i) {
        this.f8764e = null;
        bl0 bl0Var = new bl0(i);
        kx0 kx0Var = new kx0(this);
        ((hi) this.f8762c).d(d3Var, (String) this.f8763d, bl0Var, kx0Var);
    }

    public zp0 s() {
        return (zp0) ((eq0) this.f8762c).f5033b.f4348d;
    }

    public void t(ir irVar) {
        ir adapterCreator;
        AtomicReference atomicReference = (AtomicReference) this.f8764e;
        if (!((Boolean) cm.f4253a.r()).booleanValue()) {
            while (!atomicReference.compareAndSet(null, irVar) && atomicReference.get() == null) {
            }
            return;
        }
        q9.d1 d1Var = (q9.d1) this.f8763d;
        if (d1Var == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = d1Var.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        if (adapterCreator == null) {
            adapterCreator = irVar;
        }
        while (!atomicReference.compareAndSet(null, adapterCreator) && atomicReference.get() == null) {
        }
    }

    public String toString() {
        switch (this.f8761b) {
            case 29:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f8762c);
                sb2.append('{');
                ut utVar = (ut) ((ut) this.f8763d).f11062d;
                String str = "";
                while (utVar != null) {
                    Object obj = utVar.f11061c;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    utVar = (ut) utVar.f11062d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.x6
    public long u(int i) {
        ix.o(i >= 0);
        long[] jArr = (long[]) this.f8764e;
        ix.o(i < jArr.length);
        return jArr[i];
    }

    public ArrayList w() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f8763d).iterator();
        while (it.hasNext()) {
            String str = (String) q9.s.f31967e.f31970c.a((wk) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        rs.s(arrayList2, new ya("gad:dynamite_module:experiment_id", "", 4));
        rs.s(arrayList2, c80.f4075e);
        rs.s(arrayList2, c80.f4076f);
        rs.s(arrayList2, c80.f4077g);
        rs.s(arrayList2, c80.f4078h);
        rs.s(arrayList2, c80.i);
        rs.s(arrayList2, c80.f4094y);
        rs.s(arrayList2, c80.f4079j);
        rs.s(arrayList2, c80.f4086q);
        rs.s(arrayList2, c80.f4087r);
        rs.s(arrayList2, c80.f4088s);
        rs.s(arrayList2, c80.f4089t);
        rs.s(arrayList2, c80.f4090u);
        rs.s(arrayList2, c80.f4091v);
        rs.s(arrayList2, c80.f4092w);
        rs.s(arrayList2, c80.f4093x);
        rs.s(arrayList2, c80.f4080k);
        rs.s(arrayList2, c80.f4081l);
        rs.s(arrayList2, c80.f4082m);
        rs.s(arrayList2, c80.f4083n);
        rs.s(arrayList2, c80.f4084o);
        rs.s(arrayList2, c80.f4085p);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.ep0
    public /* bridge */ /* synthetic */ ed.d x(n90 n90Var, dp0 dp0Var) {
        return m(null);
    }

    public void y() {
        try {
            ((xg0) ((js1) this.f8762c).j()).v0(((u9.a) this.f8763d).f34365b);
            if (((Boolean) q9.s.f31967e.f31970c.a(al.qf)).booleanValue()) {
                zd1 zd1VarA = ((sd0) this.f8764e).a();
                zd1VarA.v("action", "ptard");
                zd1VarA.v("ptard", "l");
                zd1VarA.w();
            }
        } catch (RemoteException | NullPointerException e3) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.rf)).booleanValue()) {
                p9.k.C.f31302h.d("Preconnect Local", e3);
            }
        }
    }

    public ArrayList z() {
        ArrayList arrayListW = w();
        Iterator it = ((ArrayList) this.f8764e).iterator();
        while (it.hasNext()) {
            String str = (String) q9.s.f31967e.f31970c.a((wk) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayListW.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        rs.s(arrayList, rs.f10042l);
        arrayListW.addAll(arrayList);
        return arrayListW;
    }

    public /* synthetic */ oq0(int i, Object obj, Object obj2, Object obj3, boolean z5) {
        this.f8761b = i;
        this.f8762c = obj;
        this.f8763d = obj2;
        this.f8764e = obj3;
    }

    public oq0(Context context, r81 r81Var, r81 r81Var2, js1 js1Var, u9.a aVar, kx0 kx0Var, sd0 sd0Var) {
        this.f8761b = 16;
        this.f8762c = js1Var;
        this.f8763d = aVar;
        this.f8764e = sd0Var;
    }

    public oq0(Context context, u9.a aVar, si siVar, ut utVar) {
        this.f8761b = 18;
        this.f8762c = context;
        this.f8764e = aVar;
        this.f8763d = siVar;
    }

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo7a(Object obj) {
        ((i60) obj).F((ru) this.f8762c, (String) this.f8763d, (String) this.f8764e);
    }

    public oq0(nr nrVar) {
        this.f8761b = 8;
        this.f8762c = nrVar;
    }

    public oq0(qr qrVar, pr prVar, sr srVar) {
        this.f8761b = 12;
        this.f8763d = qrVar;
        this.f8764e = prVar;
        this.f8762c = srVar;
    }

    public oq0(n10 n10Var, Context context, gx gxVar) {
        this.f8761b = 15;
        this.f8763d = n10Var;
        this.f8762c = context;
        this.f8764e = gxVar;
    }

    public oq0(eq0 eq0Var, xp0 xp0Var, String str) {
        this.f8761b = 9;
        this.f8762c = eq0Var;
        this.f8763d = xp0Var;
        this.f8764e = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public /* synthetic */ oq0(Object obj, Object obj2, Object obj3, int i) {
        this.f8761b = i;
        this.f8762c = obj2;
        this.f8763d = obj3;
        this.f8764e = obj;
    }

    public oq0(int i) {
        this.f8761b = i;
        switch (i) {
            case 6:
                this.f8762c = new ArrayList();
                this.f8763d = new ArrayList();
                this.f8764e = new ArrayList();
                break;
            case 28:
                this.f8763d = new ArrayDeque();
                this.f8764e = null;
                this.f8762c = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            default:
                String str = cq0.f4293a;
                this.f8762c = new x(0, Executors.newSingleThreadExecutor(new ew("ExoPlayer:Loader:ProgressiveMediaPeriod")));
                break;
        }
    }

    public oq0(Context context, Executor executor, fd fdVar, gk0 gk0Var) {
        this.f8761b = 4;
        this.f8763d = gk0Var;
        this.f8764e = fdVar;
        this.f8762c = vv.B(new je(0, this, context), executor);
    }

    public oq0(Context context, q9.d1 d1Var) {
        this.f8761b = 0;
        this.f8764e = new AtomicReference();
        this.f8762c = context;
        this.f8763d = d1Var;
    }

    public oq0(na0 na0Var, sd0 sd0Var) {
        this.f8761b = 24;
        this.f8762c = na0Var;
        uk0 uk0Var = new uk0(sd0Var);
        this.f8763d = uk0Var;
        this.f8764e = new zk0(uk0Var, na0Var.f8255e);
    }

    public oq0(oq0 oq0Var, gx gxVar) {
        this.f8761b = 25;
        this.f8764e = new l80(28);
        this.f8762c = oq0Var;
        this.f8763d = gxVar;
    }

    public oq0(xq0 xq0Var) {
        this.f8761b = 26;
        this.f8762c = new ConcurrentHashMap(xq0Var.f12283f);
        this.f8763d = xq0Var;
        this.f8764e = new vq0();
    }

    public oq0(String str, int i) {
        this.f8761b = i;
        switch (i) {
            case 29:
                ut utVar = new ut(22);
                this.f8763d = utVar;
                this.f8764e = utVar;
                this.f8762c = str;
                break;
            default:
                ow1 ow1Var = new ow1();
                ow1Var.d("video/mp2t");
                ow1Var.e(str);
                this.f8762c = new jx1(ow1Var);
                break;
        }
    }

    @Override // pa.b
    public void l0(int i) {
    }

    public oq0(ArrayList arrayList) {
        this.f8761b = 2;
        this.f8762c = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f8763d = new long[size + size];
        for (int i = 0; i < arrayList.size(); i++) {
            e8 e8Var = (e8) arrayList.get(i);
            long[] jArr = (long[]) this.f8763d;
            int i10 = i + i;
            jArr[i10] = e8Var.f4872b;
            jArr[i10 + 1] = e8Var.f4873c;
        }
        long[] jArr2 = (long[]) this.f8763d;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f8764e = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }
}

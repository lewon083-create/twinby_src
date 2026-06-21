package ac;

import a0.u;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import com.google.android.gms.internal.ads.aj;
import com.google.android.gms.internal.ads.bc;
import com.google.android.gms.internal.ads.bj;
import com.google.android.gms.internal.ads.c6;
import com.google.android.gms.internal.ads.co1;
import com.google.android.gms.internal.ads.dc;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.ec;
import com.google.android.gms.internal.ads.fc;
import com.google.android.gms.internal.ads.gc;
import com.google.android.gms.internal.ads.gk0;
import com.google.android.gms.internal.ads.ic;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.jc;
import com.google.android.gms.internal.ads.jj;
import com.google.android.gms.internal.ads.jr0;
import com.google.android.gms.internal.ads.k81;
import com.google.android.gms.internal.ads.kc;
import com.google.android.gms.internal.ads.kj;
import com.google.android.gms.internal.ads.lc;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.mc;
import com.google.android.gms.internal.ads.mk;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.ads.ok;
import com.google.android.gms.internal.ads.oq0;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r51;
import com.google.android.gms.internal.ads.rb;
import com.google.android.gms.internal.ads.rc;
import com.google.android.gms.internal.ads.sb;
import com.google.android.gms.internal.ads.si;
import com.google.android.gms.internal.ads.tb;
import com.google.android.gms.internal.ads.tc;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.vc;
import com.google.android.gms.internal.ads.w51;
import com.google.android.gms.internal.ads.wb;
import com.google.android.gms.internal.ads.ya;
import com.google.android.gms.internal.ads.yb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.play_billing.k5;
import com.google.android.gms.internal.play_billing.o1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import k0.j;
import k0.l;
import kotlin.jvm.internal.Intrinsics;
import p9.k;
import q0.o;
import t.e0;
import t.m;
import wk.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class c implements k81, jr0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f739c;

    public /* synthetic */ c(Object obj) {
        this.f739c = obj;
    }

    public static boolean b(u.i iVar) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) iVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i : iArr) {
                if (i == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jr0
    public Object a(Object obj) {
        long j10;
        oq0 oq0Var = (oq0) this.f739c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f738b) {
            ((Context) oq0Var.f8762c).deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(aj.O(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (co1 e3) {
                u9.i.e("Unable to deserialize proto from offline signals database:");
                u9.i.e(e3.getMessage());
            }
        }
        cursorQuery.close();
        Context context = (Context) oq0Var.f8762c;
        bj bjVarZ = dj.z();
        String packageName = context.getPackageName();
        bjVarZ.b();
        ((dj) bjVarZ.f9560c).E(packageName);
        String str = Build.MODEL;
        bjVarZ.b();
        ((dj) bjVarZ.f9560c).F();
        int iG = ix.G(sQLiteDatabase, 0);
        bjVarZ.b();
        ((dj) bjVarZ.f9560c).B(iG);
        bjVarZ.b();
        ((dj) bjVarZ.f9560c).A(arrayList);
        int iG2 = ix.G(sQLiteDatabase, 1);
        bjVarZ.b();
        ((dj) bjVarZ.f9560c).C(iG2);
        int iG3 = ix.G(sQLiteDatabase, 3);
        bjVarZ.b();
        ((dj) bjVarZ.f9560c).H(iG3);
        k.C.f31304k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        bjVarZ.b();
        ((dj) bjVarZ.f9560c).D(jCurrentTimeMillis);
        Cursor cursorF0 = ix.f0(sQLiteDatabase, 2);
        if (cursorF0.getCount() > 0) {
            cursorF0.moveToNext();
            j10 = cursorF0.getLong(cursorF0.getColumnIndexOrThrow("value"));
        } else {
            j10 = 0;
        }
        cursorF0.close();
        bjVarZ.b();
        ((dj) bjVarZ.f9560c).G(j10);
        dj djVar = (dj) bjVarZ.d();
        int size = arrayList.size();
        long jM = 0;
        for (int i = 0; i < size; i++) {
            aj ajVar = (aj) arrayList.get(i);
            if (ajVar.N() == 2 && ajVar.M() > jM) {
                jM = ajVar.M();
            }
        }
        if (jM != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jM));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        si siVar = (si) oq0Var.f8763d;
        synchronized (siVar) {
            if (siVar.f10298c) {
                try {
                    ok okVar = siVar.f10297b;
                    okVar.b();
                    ((pk) okVar.f9560c).H(djVar);
                } catch (NullPointerException e7) {
                    k.C.f31302h.d("AdMobClearcutLogger.modify", e7);
                }
            }
            u9.a aVar = (u9.a) oq0Var.f8764e;
            jj jjVarA = kj.A();
            int i10 = aVar.f34366c;
            jjVarA.b();
            ((kj) jjVarA.f9560c).B(i10);
            int i11 = aVar.f34367d;
            jjVarA.b();
            ((kj) jjVarA.f9560c).C(i11);
            int i12 = true != aVar.f34368e ? 2 : 0;
            jjVarA.b();
            ((kj) jjVarA.f9560c).z(i12);
            kj kjVar = (kj) jjVarA.d();
            synchronized (siVar) {
                if (siVar.f10298c) {
                    try {
                        ok okVar2 = siVar.f10297b;
                        lk lkVar = (lk) ((pk) okVar2.f9560c).z().r();
                        lkVar.b();
                        ((mk) lkVar.f9560c).B(kjVar);
                        okVar2.b();
                        ((pk) okVar2.f9560c).F((mk) lkVar.d());
                    } catch (NullPointerException e10) {
                        k.C.f31302h.d("AdMobClearcutLogger.modify", e10);
                    }
                }
                siVar.b(10004);
                sQLiteDatabase.delete("offline_signal_contents", null, null);
                ix.i0(sQLiteDatabase, "failed_requests");
                ix.i0(sQLiteDatabase, "total_requests");
                ix.i0(sQLiteDatabase, "completed_requests");
                return null;
            }
        }
        siVar.b(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ix.i0(sQLiteDatabase, "failed_requests");
        ix.i0(sQLiteDatabase, "total_requests");
        ix.i0(sQLiteDatabase, "completed_requests");
        return null;
    }

    public CameraCaptureSession.CaptureCallback c(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.f738b) {
            return captureCallback;
        }
        m mVar = new m(3);
        j1.k kVar = (j1.k) mVar.f33151b;
        ((List) this.f739c).add(kVar);
        Log.d("RequestMonitor", "RequestListener " + mVar + " monitoring " + this);
        kVar.f26173c.a(new o(this, mVar, kVar, 12), hl.d.j());
        return new e0(Arrays.asList(mVar, captureCallback));
    }

    public boolean d() {
        return this.f738b;
    }

    public ed.d e() {
        List list = (List) this.f739c;
        if (list.isEmpty()) {
            return l.f26777d;
        }
        k0.m mVarI = j.i(new ArrayList(list));
        wf.b bVar = new wf.b(12);
        return j.f(j.j(mVarI, new v7.f(25, bVar), hl.d.j()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L48
            if (r8 < 0) goto L48
            int r0 = r7.length()
            int r0 = r0 - r8
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.f739c
            e2.e r0 = (e2.e) r0
            if (r0 != 0) goto L16
            boolean r7 = r6.d()
            return r7
        L16:
            r0.getClass()
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L1d:
            r4 = 1
            if (r2 >= r8) goto L3d
            if (r3 != r1) goto L3d
            char r3 = r7.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            ac.c r5 = e2.f.f16028a
            if (r3 == 0) goto L39
            if (r3 == r4) goto L37
            if (r3 == r1) goto L37
            switch(r3) {
                case 14: goto L39;
                case 15: goto L39;
                case 16: goto L37;
                case 17: goto L37;
                default: goto L35;
            }
        L35:
            r3 = r1
            goto L3a
        L37:
            r3 = r0
            goto L3a
        L39:
            r3 = r4
        L3a:
            int r2 = r2 + 1
            goto L1d
        L3d:
            if (r3 == 0) goto L47
            if (r3 == r4) goto L46
            boolean r7 = r6.d()
            return r7
        L46:
            return r0
        L47:
            return r4
        L48:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.c.f(java.lang.CharSequence, int):boolean");
    }

    public void g() {
        this.f738b = false;
    }

    public void h(boolean z5) {
        if (this.f738b) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f738b = true;
        h hVar = (h) this.f739c;
        int i = hVar.f752c - 1;
        hVar.f752c = i;
        boolean z10 = z5 | hVar.f751b;
        hVar.f751b = z10;
        if (i != 0 || z10) {
            return;
        }
        ((u7.f) hVar.f754e).s((KeyEvent) hVar.f753d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6i(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.c.mo6i(java.lang.Object):void");
    }

    public void j(byte b2) {
        ((d8.e0) this.f739c).o(b2);
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        u9.i.e("Failed to get signals bundle");
    }

    public void l(char c8) {
        d8.e0 e0Var = (d8.e0) this.f739c;
        e0Var.e(e0Var.f15620c, 1);
        char[] cArr = (char[]) e0Var.f15621d;
        int i = e0Var.f15620c;
        e0Var.f15620c = i + 1;
        cArr[i] = c8;
    }

    public void m(int i) {
        ((d8.e0) this.f739c).o(i);
    }

    public void n(long j10) {
        ((d8.e0) this.f739c).o(j10);
    }

    public void o(String v5) {
        Intrinsics.checkNotNullParameter(v5, "v");
        ((d8.e0) this.f739c).n(v5);
    }

    public void p(short s10) {
        ((d8.e0) this.f739c).o(s10);
    }

    public void q(String text) {
        byte b2;
        Intrinsics.checkNotNullParameter(text, "value");
        d8.e0 e0Var = (d8.e0) this.f739c;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        e0Var.e(e0Var.f15620c, text.length() + 2);
        char[] cArr = (char[]) e0Var.f15621d;
        int i = e0Var.f15620c;
        int i10 = i + 1;
        cArr[i] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i10);
        int i11 = length + i10;
        int i12 = i10;
        while (i12 < i11) {
            char c8 = cArr[i12];
            byte[] bArr = q.f35317b;
            if (c8 < bArr.length && bArr[c8] != 0) {
                int length2 = text.length();
                for (int i13 = i12 - i10; i13 < length2; i13++) {
                    e0Var.e(i12, 2);
                    char cCharAt = text.charAt(i13);
                    byte[] bArr2 = q.f35317b;
                    if (cCharAt >= bArr2.length || (b2 = bArr2[cCharAt]) == 0) {
                        int i14 = i12 + 1;
                        ((char[]) e0Var.f15621d)[i12] = cCharAt;
                        i12 = i14;
                    } else {
                        if (b2 == 1) {
                            String str = q.f35316a[cCharAt];
                            Intrinsics.b(str);
                            e0Var.e(i12, str.length());
                            str.getChars(0, str.length(), (char[]) e0Var.f15621d, i12);
                            int length3 = str.length() + i12;
                            e0Var.f15620c = length3;
                            i12 = length3;
                        } else {
                            char[] cArr2 = (char[]) e0Var.f15621d;
                            cArr2[i12] = '\\';
                            cArr2[i12 + 1] = (char) b2;
                            i12 += 2;
                            e0Var.f15620c = i12;
                        }
                    }
                }
                e0Var.e(i12, 1);
                ((char[]) e0Var.f15621d)[i12] = '\"';
                e0Var.f15620c = i12 + 1;
                return;
            }
            i12++;
        }
        cArr[i11] = '\"';
        e0Var.f15620c = i11 + 1;
    }

    public void s() {
        LinkedList linkedList = new LinkedList((List) this.f739c);
        while (!linkedList.isEmpty()) {
            ed.d dVar = (ed.d) linkedList.poll();
            Objects.requireNonNull(dVar);
            dVar.cancel(true);
        }
    }

    public void t(IllegalStateException illegalStateException) {
        if (this.f738b) {
            return;
        }
        this.f738b = true;
        c cVar = ((b3.f) this.f739c).f1846f;
        synchronized (cVar) {
            if (!cVar.f738b) {
                cVar.f738b = true;
                cVar.f739c = illegalStateException;
                cVar.notifyAll();
            }
        }
    }

    public void v() {
        rc rcVar = (rc) this.f739c;
        boolean z5 = this.f738b;
        String strA = zb.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
        if (z5) {
            return;
        }
        try {
            HashMap map = qc.f9441a;
            ya yaVar = new ya(4);
            yaVar.g(bc.f3720b, vc.f(wb.f11733s));
            yaVar.g(bc.f3722c, c6.n(0L));
            yaVar.g(bc.f3724d, c6.n(1L));
            yaVar.g(bc.f3726e, c6.n(2L));
            yaVar.g(bc.f3728f, c6.n(3L));
            yaVar.g(bc.f3730g, c6.n(4L));
            yaVar.g(bc.f3732h, c6.n(7L));
            yaVar.g(bc.i, c6.n(-1L));
            yaVar.g(bc.f3734j, c6.n(-2L));
            yaVar.g(bc.f3736k, vc.f(vb.f11325b));
            yaVar.g(bc.f3738l, vc.f(vb.f11327d));
            yaVar.g(bc.f3740m, vc.f(vb.f11332j));
            yaVar.g(bc.f3742n, vc.f(vb.f11333k));
            yaVar.g(bc.f3744o, vc.f(vb.f11336n));
            yaVar.g(bc.f3745p, vc.f(wb.f11728n));
            yaVar.g(bc.f3746q, vc.f(vb.f11329f));
            yaVar.g(bc.f3747r, vc.f(vb.f11330g));
            yaVar.g(bc.f3748s, vc.f(vb.f11331h));
            yaVar.g(bc.f3749t, vc.f(vb.i));
            yaVar.g(bc.f3750u, vc.f(wb.f11723h));
            yaVar.g(bc.f3751v, vc.f(wb.f11724j));
            yaVar.g(bc.f3753x, vc.f(vb.f11337o));
            yaVar.g(bc.f3754y, vc.f(vb.f11338p));
            yaVar.g(bc.f3755z, vc.f(vb.f11341s));
            yaVar.g(bc.A, vc.f(vb.f11342t));
            yaVar.g(bc.B, vc.f(vb.f11343u));
            yaVar.g(bc.C, vc.f(vb.f11344v));
            yaVar.g(bc.D, vc.f(wb.f11717b));
            yaVar.g(bc.E, vc.f(wb.f11719d));
            yaVar.g(bc.F, vc.f(wb.f11720e));
            yaVar.g(bc.G, vc.f(wb.f11721f));
            yaVar.g(bc.H, vc.f(wb.f11725k));
            yaVar.g(bc.I, vc.f(wb.f11726l));
            yaVar.g(bc.J, vc.f(wb.f11730p));
            yaVar.g(bc.K, vc.f(wb.f11731q));
            yaVar.g(bc.L, vc.f(wb.f11735u));
            yaVar.g(bc.M, vc.f(wb.f11736v));
            yaVar.g(bc.N, vc.f(yb.f12562b));
            yaVar.g(bc.O, vc.f(yb.f12564d));
            yaVar.g(bc.V, vc.f(yb.f12565e));
            yaVar.g(bc.P, vc.f(yb.f12569j));
            yaVar.g(bc.Q, vc.f(yb.f12570k));
            yaVar.g(bc.R, vc.f(yb.f12573n));
            yaVar.g(bc.S, vc.f(yb.f12576q));
            yaVar.g(bc.T, vc.f(vb.f11339q));
            yaVar.g(bc.U, vc.f(yb.f12571l));
            yaVar.g(bc.W, vc.f(vb.f11334l));
            yaVar.g(bc.X, vc.f(yb.f12567g));
            yaVar.g(bc.Y, vc.f(yb.f12568h));
            yaVar.g(bc.f3752w, vc.f(wb.i));
            yaVar.g(bc.Z, vc.f(yb.f12575p));
            yaVar.g(bc.f3719a0, vc.f(wb.f11727m));
            yaVar.g(bc.f3721b0, vc.f(yb.f12574o));
            yaVar.g(bc.f3723c0, vc.f(wb.f11718c));
            yaVar.g(bc.f3725d0, vc.f(yb.f12563c));
            yaVar.g(bc.f3727e0, vc.f(vb.f11340r));
            yaVar.g(bc.f3729f0, vc.f(yb.f12572m));
            yaVar.g(bc.f3731g0, vc.f(vb.f11328e));
            yaVar.g(bc.h0, vc.f(yb.f12566f));
            yaVar.g(bc.f3733i0, vc.f(wb.f11734t));
            yaVar.g(bc.f3735j0, vc.f(vb.f11326c));
            yaVar.g(bc.f3737k0, vc.f(yb.i));
            yaVar.g(bc.f3739l0, vc.f(wb.f11729o));
            yaVar.g(bc.f3741m0, vc.f(vb.f11335m));
            yaVar.g(bc.f3743n0, vc.f(wb.f11732r));
            yaVar.g(bc.o0, vc.f(wb.f11722g));
            w51 w51VarS = yaVar.s(true);
            for (long j10 = -1; j10 >= -82; j10--) {
                bc bcVar = (bc) map.get(Long.valueOf(j10));
                if (bcVar == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 36);
                    sb2.append(strA);
                    sb2.append(j10);
                    throw new oc(sb2.toString());
                }
                rcVar.f9815a.c((vc) w51VarS.get(bcVar));
            }
            for (int i = 82; i < 1159; i++) {
                rcVar.f9815a.c(vc.a(null));
            }
            this.f738b = true;
        } catch (lc e3) {
            throw new sb(rb.f9786c, e3);
        }
    }

    public void w(k5 k5Var) {
        if (this.f738b) {
            o1.g("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((a1.m) this.f739c).r(new v8.a(k5Var, null));
        } catch (Throwable unused) {
            o1.g("BillingLogger", "logging failed.");
        }
    }

    public Object x(Optional optional) throws pb, sb {
        char c8;
        long j10;
        qb qbVar;
        Object objOf;
        long j11;
        rc rcVar = (rc) this.f739c;
        try {
            try {
                long j12 = 2;
                if (this.f738b) {
                    c8 = 0;
                    j10 = 2;
                } else {
                    String strA = zb.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
                    try {
                        HashMap map = qc.f9441a;
                        ya yaVar = new ya(7, false);
                        yaVar.g(bc.f3720b, vc.f(wb.f11733s));
                        yaVar.g(bc.f3722c, c6.n(0L));
                        yaVar.g(bc.f3724d, c6.n(1L));
                        yaVar.g(bc.f3726e, c6.n(2L));
                        yaVar.g(bc.f3728f, c6.n(3L));
                        yaVar.g(bc.f3730g, c6.n(4L));
                        yaVar.g(bc.f3732h, c6.n(7L));
                        c8 = 0;
                        yaVar.g(bc.i, c6.n(-1L));
                        yaVar.g(bc.f3734j, c6.n(-2L));
                        yaVar.g(bc.f3736k, vc.f(vb.f11325b));
                        yaVar.g(bc.f3738l, vc.f(vb.f11327d));
                        yaVar.g(bc.f3740m, vc.f(vb.f11332j));
                        yaVar.g(bc.f3742n, vc.f(vb.f11333k));
                        yaVar.g(bc.f3744o, vc.f(vb.f11336n));
                        yaVar.g(bc.f3745p, vc.f(wb.f11728n));
                        yaVar.g(bc.f3746q, vc.f(vb.f11329f));
                        yaVar.g(bc.f3747r, vc.f(vb.f11330g));
                        yaVar.g(bc.f3748s, vc.f(vb.f11331h));
                        yaVar.g(bc.f3749t, vc.f(vb.i));
                        yaVar.g(bc.f3750u, vc.f(wb.f11723h));
                        yaVar.g(bc.f3751v, vc.f(wb.f11724j));
                        yaVar.g(bc.f3753x, vc.f(vb.f11337o));
                        yaVar.g(bc.f3754y, vc.f(vb.f11338p));
                        yaVar.g(bc.f3755z, vc.f(vb.f11341s));
                        yaVar.g(bc.A, vc.f(vb.f11342t));
                        yaVar.g(bc.B, vc.f(vb.f11343u));
                        yaVar.g(bc.C, vc.f(vb.f11344v));
                        yaVar.g(bc.D, vc.f(wb.f11717b));
                        yaVar.g(bc.E, vc.f(wb.f11719d));
                        yaVar.g(bc.F, vc.f(wb.f11720e));
                        yaVar.g(bc.G, vc.f(wb.f11721f));
                        yaVar.g(bc.H, vc.f(wb.f11725k));
                        yaVar.g(bc.I, vc.f(wb.f11726l));
                        yaVar.g(bc.J, vc.f(wb.f11730p));
                        yaVar.g(bc.K, vc.f(wb.f11731q));
                        yaVar.g(bc.L, vc.f(wb.f11735u));
                        yaVar.g(bc.M, vc.f(wb.f11736v));
                        yaVar.g(bc.N, vc.f(yb.f12562b));
                        yaVar.g(bc.O, vc.f(yb.f12564d));
                        yaVar.g(bc.V, vc.f(yb.f12565e));
                        yaVar.g(bc.P, vc.f(yb.f12569j));
                        yaVar.g(bc.Q, vc.f(yb.f12570k));
                        yaVar.g(bc.R, vc.f(yb.f12573n));
                        yaVar.g(bc.S, vc.f(yb.f12576q));
                        yaVar.g(bc.T, vc.f(vb.f11339q));
                        yaVar.g(bc.U, vc.f(yb.f12571l));
                        yaVar.g(bc.W, vc.f(vb.f11334l));
                        yaVar.g(bc.X, vc.f(yb.f12567g));
                        yaVar.g(bc.Y, vc.f(yb.f12568h));
                        yaVar.g(bc.f3752w, vc.f(wb.i));
                        yaVar.g(bc.Z, vc.f(yb.f12575p));
                        yaVar.g(bc.f3719a0, vc.f(wb.f11727m));
                        yaVar.g(bc.f3721b0, vc.f(yb.f12574o));
                        yaVar.g(bc.f3723c0, vc.f(wb.f11718c));
                        yaVar.g(bc.f3725d0, vc.f(yb.f12563c));
                        yaVar.g(bc.f3727e0, vc.f(vb.f11340r));
                        yaVar.g(bc.f3729f0, vc.f(yb.f12572m));
                        yaVar.g(bc.f3731g0, vc.f(vb.f11328e));
                        yaVar.g(bc.h0, vc.f(yb.f12566f));
                        yaVar.g(bc.f3733i0, vc.f(wb.f11734t));
                        yaVar.g(bc.f3735j0, vc.f(vb.f11326c));
                        yaVar.g(bc.f3737k0, vc.f(yb.i));
                        yaVar.g(bc.f3739l0, vc.f(wb.f11729o));
                        yaVar.g(bc.f3741m0, vc.f(vb.f11335m));
                        yaVar.g(bc.f3743n0, vc.f(wb.f11732r));
                        yaVar.g(bc.o0, vc.f(wb.f11722g));
                        w51 w51VarP = yaVar.p();
                        long j13 = -1;
                        while (j13 >= -82) {
                            long j14 = j12;
                            bc bcVar = (bc) map.get(Long.valueOf(j13));
                            if (bcVar == null) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(j13).length() + 36);
                                sb2.append(strA);
                                sb2.append(j13);
                                throw new oc(sb2.toString());
                            }
                            rcVar.f9815a.c((vc) w51VarP.get(bcVar));
                            j13--;
                            j12 = j14;
                        }
                        j10 = j12;
                        for (int i = 82; i < 1159; i++) {
                            rcVar.f9815a.c(vc.a(null));
                        }
                        this.f738b = true;
                    } catch (lc e3) {
                        throw new sb(rb.f9786c, e3);
                    }
                }
                fc fcVar = rcVar.f9817c;
                try {
                    fc fcVar2 = rcVar.f9817c;
                    fcVar.c(0L);
                    fcVar.f5321d = new c6(21);
                    String strA2 = zb.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo");
                    String strA3 = zb.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=");
                    try {
                        int iG = fcVar2.g();
                        int i10 = ((iG & 65535) << 16) >> 16;
                        int i11 = (((iG >> 16) & 65535) << 16) >> 16;
                        if (i10 != -14426) {
                            throw new pb(strA2.concat(String.format(zb.a("e1Hk+x0="), Short.valueOf((short) i10))));
                        }
                        if (i11 != 5) {
                            throw new pb(strA3.concat(String.format(zb.a("e1Hk+x0="), Short.valueOf((short) i11))));
                        }
                        String strA4 = zb.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1");
                        try {
                            int iG2 = fcVar2.g();
                            if (iG2 != 1182321202) {
                                throw new pb(strA4.concat(String.format(zb.a("e1Hk9x0="), Integer.valueOf(iG2))));
                            }
                            try {
                                int[] iArr = {fcVar2.g()};
                                int[] iArr2 = ob.f8654a;
                                c6 c6Var = (c6) fcVar2.f5322e;
                                int i12 = iArr[c8];
                                c6Var.getClass();
                                fcVar2.f5321d = new ya(new d8.e0(i12, 4, iArr2));
                                try {
                                    fcVar2.c(96L);
                                    r51 r51Var = tb.f10575a;
                                    Optional.empty();
                                    Object objOrElseGet = optional.orElseGet(gc.f5770c);
                                    vc vcVarG = objOrElseGet instanceof vc ? (vc) objOrElseGet : vc.g(objOrElseGet);
                                    mc mcVar = rcVar.f9815a;
                                    mcVar.c(vcVarG);
                                    mcVar.c(vc.a(null));
                                    gk0 gk0Var = rcVar.f9816b;
                                    gk0Var.g(0L, 0L, mcVar.f7847b);
                                    while (!((ArrayDeque) gk0Var.f5837c).isEmpty()) {
                                        fc fcVar3 = rcVar.f9817c;
                                        long jD = fcVar3.d();
                                        try {
                                            try {
                                                try {
                                                } catch (tc unused) {
                                                    qbVar = qb.f9393e;
                                                }
                                            } catch (kc unused2) {
                                                qbVar = qb.f9392d;
                                            }
                                        } catch (ec unused3) {
                                            qbVar = qb.f9410w;
                                        }
                                        try {
                                            objOf = rcVar.f9815a.e(fcVar3.f()).p().apply(rcVar);
                                        } catch (Throwable unused4) {
                                            qbVar = qb.f9411x;
                                            objOf = Optional.of(qbVar);
                                        }
                                        Optional optional2 = (Optional) objOf;
                                        if (optional2.isPresent()) {
                                            if (!tb.f10575a.contains(optional2.get())) {
                                                throw new sb(rb.i, (qb) optional2.get(), jD);
                                            }
                                            Object obj = optional2.get();
                                            long jD2 = rcVar.f9817c.d();
                                            do {
                                                try {
                                                    j11 = rcVar.f9816b.n().f6094c;
                                                    Optional optionalA = rcVar.a();
                                                    if (optionalA.isPresent() && optionalA.get() == qb.f9412y) {
                                                        throw new sb(rb.i, (qb) obj, jD2);
                                                    }
                                                    if (optionalA.isPresent()) {
                                                        throw new sb(rb.i, (qb) optionalA.get(), jD2);
                                                    }
                                                } catch (jc unused5) {
                                                    throw new sb(rb.i, (qb) obj, jD2);
                                                }
                                            } while (j11 != j10);
                                        }
                                    }
                                    try {
                                        mc mcVar2 = rcVar.f9815a;
                                        vc vcVarD = mcVar2.d();
                                        mcVar2.d();
                                        return vcVarD.h();
                                    } catch (kc e7) {
                                        throw new sb(rb.f9790g, e7);
                                    } catch (tc e10) {
                                        throw new sb(rb.f9791h, e10);
                                    }
                                } catch (dc e11) {
                                    e = e11;
                                    throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
                                } catch (ec e12) {
                                    e = e12;
                                    throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
                                }
                            } catch (ec e13) {
                                throw new sb(rb.f9789f, e13);
                            }
                        } catch (ec e14) {
                            throw new pb(zb.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e14);
                        }
                    } catch (ec e15) {
                        throw new pb(zb.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e15);
                    }
                } catch (dc e16) {
                    e = e16;
                    throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
                } catch (ec e17) {
                    e = e17;
                    throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (ic e18) {
                throw new sb(rb.f9788e, e18);
            }
        } catch (lc e19) {
            throw new sb(rb.f9787d, e19);
        }
    }

    public Object y(long j10, Optional optional) {
        qb qbVar;
        Object objOf;
        long j11;
        rc rcVar = (rc) this.f739c;
        try {
            if (!this.f738b) {
                v();
            }
            fc fcVar = rcVar.f9817c;
            try {
                fc fcVar2 = rcVar.f9817c;
                fcVar.c(0L);
                fcVar.f5321d = new c6(false);
                try {
                    int iG = fcVar2.g();
                    int i = ((iG & 65535) << 16) >> 16;
                    int i10 = (((iG >> 16) & 65535) << 16) >> 16;
                    if (i != -14426) {
                        throw new pb(zb.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo").concat(String.format(zb.a("e1Hk+x0="), Short.valueOf((short) i))));
                    }
                    if (i10 != 5) {
                        throw new pb(zb.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=").concat(String.format(zb.a("e1Hk+x0="), Short.valueOf((short) i10))));
                    }
                    int[] iArr = {171029949, 1356422403, 1913211838, 215266853, 506454572, 1309457854, 56236614, 1696779465, 30245415};
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    int i13 = iArr[2];
                    int i14 = iArr[3];
                    int iH = (iArr[7] % 30245415) ^ u.h((i12 & (~i11)) | i13, (i11 & i14) | iArr[4], iArr[5], iArr[6]);
                    try {
                        int iG2 = fcVar2.g();
                        if (iG2 != iH) {
                            throw new pb(zb.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1").concat(String.format(zb.a("e1Hk9x0="), Integer.valueOf(iG2))));
                        }
                        try {
                            int[] iArr2 = {fcVar2.g()};
                            int[] iArr3 = ob.f8654a;
                            c6 c6Var = (c6) fcVar2.f5322e;
                            int i15 = iArr2[0];
                            c6Var.getClass();
                            fcVar2.f5321d = new ya(new d8.e0(i15, 4, iArr3));
                            try {
                                fcVar2.c(j10);
                                r51 r51Var = tb.f10575a;
                                Optional.empty();
                                Object objOrElseGet = optional.orElseGet(gc.f5770c);
                                vc vcVarG = objOrElseGet instanceof vc ? (vc) objOrElseGet : vc.g(objOrElseGet);
                                mc mcVar = rcVar.f9815a;
                                mcVar.c(vcVarG);
                                mcVar.c(vc.a(null));
                                gk0 gk0Var = rcVar.f9816b;
                                gk0Var.g(0L, 0L, mcVar.f7847b);
                                while (!((ArrayDeque) gk0Var.f5837c).isEmpty()) {
                                    fc fcVar3 = rcVar.f9817c;
                                    long jD = fcVar3.d();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    objOf = rcVar.f9815a.e(fcVar3.f()).p().apply(rcVar);
                                                } catch (Throwable unused) {
                                                    qbVar = qb.f9411x;
                                                    objOf = Optional.of(qbVar);
                                                }
                                            } catch (tc unused2) {
                                                qbVar = qb.f9393e;
                                            }
                                        } catch (kc unused3) {
                                            qbVar = qb.f9392d;
                                        }
                                    } catch (ec unused4) {
                                        qbVar = qb.f9410w;
                                    }
                                    Optional optional2 = (Optional) objOf;
                                    if (optional2.isPresent()) {
                                        if (!tb.f10575a.contains(optional2.get())) {
                                            throw new sb(rb.i, (qb) optional2.get(), jD);
                                        }
                                        Object obj = optional2.get();
                                        long[] jArr = {1598171894, 600979209, 180618323, 2704454472L, 3601187955L, 4055661621L, 545343058, 1815320763, 988992210};
                                        long j12 = jArr[0];
                                        long j13 = jArr[1];
                                        long j14 = jArr[2];
                                        long j15 = jArr[3];
                                        long j16 = jArr[4];
                                        long j17 = jArr[5];
                                        long j18 = jArr[6];
                                        long j19 = jArr[7];
                                        long j20 = (((((~j12) & j13) | j14) + ((j12 & j15) | j16)) - j17) + j18;
                                        long j21 = j19 % 988992210;
                                        long jD2 = rcVar.f9817c.d();
                                        do {
                                            try {
                                                j11 = rcVar.f9816b.n().f6094c;
                                                Optional optionalA = rcVar.a();
                                                if (optionalA.isPresent() && optionalA.get() == qb.f9412y) {
                                                    throw new sb(rb.i, (qb) obj, jD2);
                                                }
                                                if (optionalA.isPresent()) {
                                                    throw new sb(rb.i, (qb) optionalA.get(), jD2);
                                                }
                                            } catch (jc unused5) {
                                                throw new sb(rb.i, (qb) obj, jD2);
                                            }
                                        } while (j11 != (j20 ^ j21));
                                    }
                                }
                                try {
                                    mc mcVar2 = rcVar.f9815a;
                                    vc vcVarD = mcVar2.d();
                                    mcVar2.d();
                                    return vcVarD.h();
                                } catch (kc e3) {
                                    throw new sb(rb.f9790g, e3);
                                } catch (tc e7) {
                                    throw new sb(rb.f9791h, e7);
                                }
                            } catch (dc e10) {
                                e = e10;
                                throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
                            } catch (ec e11) {
                                e = e11;
                                throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
                            }
                        } catch (ec e12) {
                            throw new sb(rb.f9789f, e12);
                        }
                    } catch (ec e13) {
                        throw new pb(zb.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), (Throwable) e13);
                    }
                } catch (ec e14) {
                    throw new pb(zb.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), (Throwable) e14);
                }
            } catch (dc e15) {
                e = e15;
                throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
            } catch (ec e16) {
                e = e16;
                throw new AssertionError(zb.a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (ic e17) {
            throw new sb(rb.f9788e, e17);
        } catch (lc e18) {
            throw new sb(rb.f9787d, e18);
        }
    }

    public /* synthetic */ c(Object obj, boolean z5) {
        this.f739c = obj;
        this.f738b = z5;
    }

    public c(d8.e0 writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f739c = writer;
        this.f738b = true;
    }

    public c(boolean z5) {
        this.f739c = Collections.synchronizedList(new ArrayList());
        this.f738b = z5;
    }

    public c(e2.e eVar, boolean z5) {
        this(eVar);
        this.f738b = z5;
    }

    public void r() {
    }

    public void u() {
    }
}

package u7;

import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.ads.r9;
import com.google.android.gms.internal.ads.yd1;
import com.google.android.gms.internal.ads.zz;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.h5;
import e1.j0;
import g0.b1;
import g0.c1;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.TransactionOptions;
import j3.c0;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import k0.l;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m3.p;
import m3.w;
import m3.z;
import q4.a0;
import q4.m;
import s3.q;
import t9.h0;
import v7.o;
import wl.b0;
import x0.v;
import x5.r;
import xh.s;
import xh.x;
import xh.y;
import xl.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k0.c, n5.e, r, n, b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static f f34320f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f34322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f34323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f34324e;

    public /* synthetic */ f() {
        this.f34321b = 3;
    }

    public static f q() {
        if (f34320f == null) {
            h0 h0Var = new h0();
            o oVar = new o(1);
            oVar.f34794b = 0;
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(oVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            ci.e eVar = new ci.e();
            eVar.f2293b = false;
            eVar.f2296e = flutterJNI;
            eVar.f2297f = executorServiceNewCachedThreadPool;
            f fVar = new f();
            fVar.f34322c = eVar;
            fVar.f34323d = h0Var;
            fVar.f34324e = executorServiceNewCachedThreadPool;
            f34320f = fVar;
        }
        return f34320f;
    }

    public void a(long j10, p pVar) {
        if (pVar.a() < 9) {
            return;
        }
        int iM = pVar.m();
        int iM2 = pVar.m();
        int iZ = pVar.z();
        if (iM == 434 && iM2 == 1195456820 && iZ == 3) {
            ((yd1) this.f34324e).a(j10, pVar);
        }
    }

    @Override // x5.r
    public void b(w wVar, m mVar, r9 r9Var) {
        this.f34323d = wVar;
        r9Var.a();
        r9Var.b();
        a0 a0VarP = mVar.P(r9Var.f9763d, 5);
        this.f34324e = a0VarP;
        a0VarP.a((j3.o) this.f34322c);
    }

    @Override // x5.r
    public void c(p pVar) {
        long jD;
        long j10;
        ((w) this.f34323d).getClass();
        String str = z.f28608a;
        w wVar = (w) this.f34323d;
        synchronized (wVar) {
            try {
                long j11 = wVar.f28604c;
                jD = j11 != -9223372036854775807L ? j11 + wVar.f28603b : wVar.d();
            } finally {
            }
        }
        w wVar2 = (w) this.f34323d;
        synchronized (wVar2) {
            j10 = wVar2.f28603b;
        }
        if (jD == -9223372036854775807L || j10 == -9223372036854775807L) {
            return;
        }
        j3.o oVar = (j3.o) this.f34322c;
        if (j10 != oVar.f26340s) {
            j3.n nVarA = oVar.a();
            nVarA.f26297r = j10;
            j3.o oVar2 = new j3.o(nVarA);
            this.f34322c = oVar2;
            ((a0) this.f34324e).a(oVar2);
        }
        int iA = pVar.a();
        ((a0) this.f34324e).d(iA, pVar);
        ((a0) this.f34324e).f(jD, 1, iA, 0, null);
    }

    @Override // n5.e
    public int d(long j10) {
        long[] jArr = (long[]) this.f34324e;
        int iB = z.b(jArr, j10, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public void e(m mVar, r9 r9Var) {
        a0[] a0VarArr = (a0[]) this.f34323d;
        for (int i = 0; i < a0VarArr.length; i++) {
            r9Var.a();
            r9Var.b();
            a0 a0VarP = mVar.P(r9Var.f9763d, 3);
            j3.o oVar = (j3.o) ((List) this.f34322c).get(i);
            String str = oVar.f26335n;
            h5.j("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            j3.n nVar = new j3.n();
            r9Var.b();
            nVar.f26281a = (String) r9Var.f9764e;
            nVar.f26291l = c0.n("video/mp2t");
            nVar.f26292m = c0.n(str);
            nVar.f26285e = oVar.f26327e;
            nVar.f26284d = oVar.f26326d;
            nVar.J = oVar.K;
            nVar.f26295p = oVar.f26338q;
            pe.a.q(nVar, a0VarP);
            a0VarArr[i] = a0VarP;
        }
    }

    @Override // n5.e
    public long f(int i) {
        long[] jArr = (long[]) this.f34324e;
        h5.h(i >= 0);
        h5.h(i < jArr.length);
        return jArr[i];
    }

    @Override // n5.e
    public List h(long j10) {
        List list = (List) this.f34322c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.f34323d;
            int i10 = i * 2;
            if (jArr[i10] <= j10 && j10 < jArr[i10 + 1]) {
                w5.c cVar = (w5.c) list.get(i);
                l3.b bVar = cVar.f35145a;
                if (bVar.f27777e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new d2.a(18));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            l3.b bVar2 = ((w5.c) arrayList2.get(i11)).f35145a;
            arrayList.add(new l3.b(bVar2.f27773a, bVar2.f27774b, bVar2.f27775c, bVar2.f27776d, (-1) - i11, 1, bVar2.f27779g, bVar2.f27780h, bVar2.i, bVar2.f27785n, bVar2.f27786o, bVar2.f27781j, bVar2.f27782k, bVar2.f27783l, bVar2.f27784m, bVar2.f27787p, bVar2.f27788q, bVar2.f27789r));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [g0.c1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g0.c1 i(int r35) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.f.i(int):g0.c1");
    }

    @Override // xl.n
    public void j(vl.p pVar, int i) {
        if (pVar instanceof vl.k) {
            vl.k kVar = (vl.k) pVar;
            if (((xl.m) this.f34324e).a((vl.k) this.f34322c, kVar)) {
                ((b0) this.f34323d).add(kVar);
            }
        }
    }

    @Override // g0.b1
    public boolean k(int i) {
        return ((ka.k) this.f34322c).k(i) && i(i) != null;
    }

    @Override // n5.e
    public int l() {
        return ((long[]) this.f34324e).length;
    }

    public d m(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34322c;
        l6.j jVarD = l6.j.d(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            jVarD.i(1);
        } else {
            jVarD.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            return cursorG.moveToFirst() ? new d(cursorG.getString(k3.f.o(cursorG, "work_spec_id")), cursorG.getInt(k3.f.o(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            jVarD.k();
        }
    }

    public boolean n(KeyEvent keyEvent) {
        y[] yVarArr = (y[]) this.f34322c;
        if (((HashSet) this.f34323d).remove(keyEvent)) {
            return false;
        }
        if (yVarArr.length <= 0) {
            s(keyEvent);
            return true;
        }
        ac.h hVar = new ac.h(this, keyEvent);
        for (y yVar : yVarArr) {
            ac.c cVar = new ac.c();
            cVar.f739c = hVar;
            cVar.f738b = false;
            yVar.d(keyEvent, cVar);
        }
        return true;
    }

    public boolean o() {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f34323d;
        if (((String) this.f34324e) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f34324e = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.f34322c).readLine();
                this.f34324e = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f34324e = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    @Override // k0.c
    public void onFailure(Throwable t10) {
        Object obj;
        Intrinsics.checkNotNullParameter(t10, "t");
        zz zzVar = (zz) this.f34322c;
        t.a0 a0Var = new t.a0(10, zzVar);
        if (b4.E()) {
            a0Var.run();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            f2.g.h("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new e1.y(26, a0Var, countDownLatch)));
            try {
                if (!countDownLatch.await(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e3) {
                throw new oc(e3);
            }
        }
        a0.b0 b0Var = (a0.b0) zzVar.f13156g;
        if (b0Var != null) {
            synchronized (b0Var.f29b) {
                try {
                    b0Var.f32e.removeCallbacksAndMessages("retry_token");
                    int iM = t.z.m(b0Var.f41o);
                    if (iM == 0) {
                        b0Var.f41o = 5;
                        obj = l.f26777d;
                    } else {
                        if (iM == 1) {
                            throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                        }
                        if (iM == 2 || iM == 3) {
                            b0Var.f41o = 5;
                            a0.b0.a(b0Var.f43q);
                            b0Var.f42p = i0.o.w(new a0.a0(0, b0Var));
                        }
                        obj = b0Var.f42p;
                    }
                } finally {
                }
            }
        } else {
            obj = l.f26777d;
        }
        Intrinsics.b(obj);
        synchronized (zzVar.f13152c) {
            zzVar.f13153d = null;
            zzVar.f13154e = obj;
            ((HashMap) zzVar.f13157h).clear();
            ((HashSet) zzVar.i).clear();
            Unit unit = Unit.f27471a;
        }
        zzVar.f13156g = null;
        zzVar.f13151b = null;
    }

    @Override // k0.c
    public void onSuccess(Object obj) {
        zz zzVar = (zz) this.f34322c;
        zzVar.f13156g = (a0.b0) this.f34323d;
        zzVar.f13151b = com.google.android.gms.internal.auth.g.n((Context) this.f34324e);
    }

    public void p(d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34322c;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f34323d).e(dVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public String r() {
        if (!o()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f34324e;
        this.f34324e = null;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(android.view.KeyEvent r10) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.f.s(android.view.KeyEvent):void");
    }

    public void t(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34322c;
        workDatabase_Impl.b();
        e eVar = (e) this.f34324e;
        r6.f fVarA = eVar.a();
        if (str == null) {
            fVarA.d(1);
        } else {
            fVarA.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.k();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public String toString() {
        switch (this.f34321b) {
            case 10:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f34322c);
                sb2.append('{');
                v vVar = (v) ((v) this.f34323d).f35682d;
                String str = "";
                while (vVar != null) {
                    Object obj = vVar.f35681c;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    vVar = (v) vVar.f35682d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // g0.b1
    public c1 u(int i) {
        return i(i);
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i) {
        this.f34321b = i;
        this.f34322c = obj;
        this.f34323d = obj2;
        this.f34324e = obj3;
    }

    public f(WorkDatabase_Impl workDatabase_Impl) {
        this.f34321b = 0;
        this.f34322c = workDatabase_Impl;
        this.f34323d = new b(workDatabase_Impl, 2);
        this.f34324e = new e(workDatabase_Impl, 0);
    }

    public f(ArrayList arrayList) {
        this.f34321b = 2;
        this.f34322c = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f34323d = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            w5.c cVar = (w5.c) arrayList.get(i);
            int i10 = i * 2;
            long[] jArr = (long[]) this.f34323d;
            jArr[i10] = cVar.f35146b;
            jArr[i10 + 1] = cVar.f35147c;
        }
        long[] jArr2 = (long[]) this.f34323d;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f34324e = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public f(List list) {
        this.f34321b = 5;
        this.f34322c = list;
        this.f34323d = new a0[list.size()];
        yd1 yd1Var = new yd1(new q(23, this));
        this.f34324e = yd1Var;
        yd1Var.d(3);
    }

    public f(String str, int i) {
        this.f34321b = i;
        switch (i) {
            case 10:
                v vVar = new v(12);
                this.f34323d = vVar;
                this.f34324e = vVar;
                this.f34322c = str;
                break;
            default:
                j3.n nVar = new j3.n();
                nVar.f26291l = c0.n("video/mp2t");
                nVar.f26292m = c0.n(str);
                this.f34322c = new j3.o(nVar);
                break;
        }
    }

    public f(ka.k kVar) {
        this.f34321b = 8;
        this.f34324e = new HashMap();
        this.f34322c = kVar;
        this.f34323d = j0.f15973d;
    }

    public f(xh.z zVar) {
        this.f34321b = 6;
        this.f34323d = new HashSet();
        this.f34324e = zVar;
        s sVar = (s) zVar;
        this.f34322c = new y[]{new x(sVar.getBinaryMessenger()), new v(new a0.b1(sVar.getBinaryMessenger()))};
        new a7.l(sVar.getBinaryMessenger()).f491c = this;
    }

    public f(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f34321b = 9;
        this.f34323d = arrayDeque;
        this.f34322c = bufferedReader;
    }

    @Override // xl.n
    public void g(vl.p pVar, int i) {
    }
}

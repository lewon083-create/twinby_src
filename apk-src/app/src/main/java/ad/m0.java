package ad;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.internal.ads.f00;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.internal.measurement.h5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements bf.h, q4.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f841e;

    public /* synthetic */ m0(int i, byte b2) {
        this.f838b = i;
    }

    @Override // bf.h
    public void b(bf.f fVar) {
        ((Handler) this.f841e).post(fVar.f2109b);
    }

    @Override // bf.h
    public void c() {
        HandlerThread handlerThread = (HandlerThread) this.f840d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f840d = null;
            this.f841e = null;
        }
    }

    public g1 d(boolean z5) {
        l0 l0Var;
        l0 l0Var2;
        if (z5 && (l0Var2 = (l0) this.f841e) != null) {
            throw l0Var2.a();
        }
        g1 g1VarB = g1.b(this.f839c, (Object[]) this.f840d, this);
        if (!z5 || (l0Var = (l0) this.f841e) == null) {
            return g1VarB;
        }
        throw l0Var.a();
    }

    public f00 e() {
        boolean z5 = true;
        if (!com.google.android.gms.internal.consent_sdk.b0.d() && !((ArrayList) this.f840d).contains(com.google.android.gms.internal.consent_sdk.b0.a((Context) this.f841e))) {
            z5 = false;
        }
        return new f00(z5, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r13 == r16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        return new q4.e(-2, r13, r5 + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        return q4.e.f31726d;
     */
    @Override // q4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q4.e f(q4.l r19, long r20) {
        /*
            r18 = this;
            r0 = r18
            long r5 = r19.getPosition()
            r1 = 112800(0x1b8a0, float:1.58066E-40)
            long r1 = (long) r1
            long r3 = r19.getLength()
            long r3 = r3 - r5
            long r1 = java.lang.Math.min(r1, r3)
            int r1 = (int) r1
            java.lang.Object r2 = r0.f841e
            m3.p r2 = (m3.p) r2
            r2.J(r1)
            byte[] r3 = r2.f28589a
            r4 = 0
            r7 = r19
            r7.V(r3, r4, r1)
            int r1 = r2.f28591c
            r3 = -1
            r9 = r3
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2d:
            int r11 = r2.a()
            r12 = 188(0xbc, float:2.63E-43)
            if (r11 < r12) goto La1
            byte[] r11 = r2.f28589a
            int r12 = r2.f28590b
        L39:
            if (r12 >= r1) goto L49
            r15 = r11[r12]
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 71
            if (r15 == r7) goto L4e
            int r12 = r12 + 1
            goto L39
        L49:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4e:
            int r7 = r12 + 188
            if (r7 <= r1) goto L53
            goto La6
        L53:
            int r3 = r0.f839c
            long r3 = hl.l.p(r2, r12, r3)
            int r8 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r8 == 0) goto L9c
            java.lang.Object r8 = r0.f840d
            m3.w r8 = (m3.w) r8
            long r3 = r8.b(r3)
            int r8 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r8 <= 0) goto L82
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 != 0) goto L74
            q4.e r1 = new q4.e
            r2 = -1
            r1.<init>(r2, r3, r5)
            return r1
        L74:
            long r15 = r5 + r9
            q4.e r11 = new q4.e
            r12 = 0
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.<init>(r12, r13, r15)
            return r11
        L82:
            r8 = 100000(0x186a0, double:4.94066E-319)
            long r8 = r8 + r3
            int r8 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r8 <= 0) goto L99
            long r1 = (long) r12
            long r11 = r5 + r1
            q4.e r7 = new q4.e
            r8 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.<init>(r8, r9, r11)
            return r7
        L99:
            long r8 = (long) r12
            r13 = r3
            r9 = r8
        L9c:
            r2.M(r7)
            long r3 = (long) r7
            goto L2d
        La1:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        La6:
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 == 0) goto Lb3
            long r15 = r5 + r3
            q4.e r11 = new q4.e
            r12 = -2
            r11.<init>(r12, r13, r15)
            return r11
        Lb3:
            q4.e r1 = q4.e.f31726d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.m0.f(q4.l, long):q4.e");
    }

    @Override // q4.f
    public void g() {
        m3.p pVar = (m3.p) this.f841e;
        byte[] bArr = m3.z.f28609b;
        pVar.getClass();
        pVar.K(bArr.length, bArr);
    }

    public void h(String str, Object... objArr) {
        if (this.f839c <= 3) {
            Log.d((String) this.f840d, i(str, objArr));
        }
    }

    public String i(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return ((String) this.f841e).concat(str);
    }

    public Object j(int i) {
        SparseArray sparseArray = (SparseArray) this.f840d;
        if (this.f839c == -1) {
            this.f839c = 0;
        }
        while (true) {
            int i10 = this.f839c;
            if (i10 <= 0 || i >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f839c--;
        }
        while (this.f839c < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f839c + 1)) {
            this.f839c++;
        }
        return sparseArray.valueAt(this.f839c);
    }

    public int k() {
        int i = this.f839c;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        View viewFindViewById = ((z2.w) this.f840d).findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById.getContentSensitivity();
        }
        throw new IllegalArgumentException(a0.u.k(i, "FlutterView with ID ", "not found"));
    }

    public String l() {
        StringBuilder sb2 = new StringBuilder("$");
        int i = this.f839c + 1;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = ((Object[]) this.f840d)[i10];
            if (obj instanceof sk.f) {
                sk.f fVar = (sk.f) obj;
                if (!Intrinsics.a(fVar.e(), sk.i.f32938c)) {
                    int i11 = ((int[]) this.f841e)[i10];
                    if (i11 >= 0) {
                        sb2.append(".");
                        sb2.append(fVar.g(i11));
                    }
                } else if (((int[]) this.f841e)[i10] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.f841e)[i10]);
                    sb2.append("]");
                }
            } else if (obj != wk.k.f35289a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public e4.b0 m(int i, String str, Map map, Uri uri) {
        e4.m mVar = (e4.m) this.f841e;
        String str2 = mVar.f16149d;
        int i10 = this.f839c;
        this.f839c = i10 + 1;
        a0.b1 b1Var = new a0.b1(str2, str, i10);
        if (mVar.f16159o != null) {
            mVar.f16155k.getClass();
            try {
                b1Var.h("Authorization", mVar.f16159o.d(mVar.f16155k, uri, i));
            } catch (j3.d0 e3) {
                e4.m.a(mVar, new androidx.datastore.preferences.protobuf.m(e3));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            b1Var.h((String) entry.getKey(), (String) entry.getValue());
        }
        return new e4.b0(uri, i, new e4.n(b1Var), "");
    }

    public void n(Object obj, Object obj2) {
        int i = (this.f839c + 1) * 2;
        Object[] objArr = (Object[]) this.f840d;
        if (i > objArr.length) {
            this.f840d = Arrays.copyOf(objArr, e0.f(objArr.length, i));
        }
        q.c(obj, obj2);
        Object[] objArr2 = (Object[]) this.f840d;
        int i10 = this.f839c;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f839c = i10 + 1;
    }

    public void o(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f839c) * 2;
            Object[] objArr = (Object[]) this.f840d;
            if (size > objArr.length) {
                this.f840d = Arrays.copyOf(objArr, e0.f(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            n(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p() {
        ((e4.b0) this.f840d).getClass();
        k0 k0Var = ((e4.b0) this.f840d).f16055c.f16165a;
        HashMap map = new HashMap();
        q1 it = ((e1) k0Var.f821e.keySet()).iterator();
        while (true) {
            h0 h0Var = (h0) it;
            if (!h0Var.hasNext()) {
                e4.b0 b0Var = (e4.b0) this.f840d;
                q(m(b0Var.f16054b, ((e4.m) this.f841e).f16156l, map, b0Var.f16053a));
                return;
            }
            String str = (String) h0Var.next();
            if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                map.put(str, (String) q.j(k0Var.g(str)));
            }
        }
    }

    public void q(e4.b0 b0Var) {
        String strB = b0Var.f16055c.b("CSeq");
        strB.getClass();
        int i = Integer.parseInt(strB);
        e4.m mVar = (e4.m) this.f841e;
        SparseArray sparseArray = mVar.f16152g;
        h5.r(sparseArray.get(i) == null);
        sparseArray.append(i, b0Var);
        mVar.f16154j.b(e4.a0.f(b0Var));
        this.f840d = b0Var;
    }

    public void r(int i) {
        int i10 = this.f839c;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        View viewFindViewById = ((z2.w) this.f840d).findViewById(i10);
        if (viewFindViewById == null) {
            throw new IllegalArgumentException(a0.u.k(i10, "FlutterView with ID ", "not found"));
        }
        if (viewFindViewById.getContentSensitivity() == i) {
            return;
        }
        viewFindViewById.setContentSensitivity(i);
        viewFindViewById.invalidate();
    }

    public List s(CharSequence charSequence) {
        charSequence.getClass();
        zc.o oVar = new zc.o(this, charSequence, (zc.c) ((yi.f0) this.f841e).f45657c);
        ArrayList arrayList = new ArrayList();
        while (oVar.hasNext()) {
            arrayList.add((String) oVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // bf.h
    public void start() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f839c);
        this.f840d = handlerThread;
        handlerThread.start();
        this.f841e = new Handler(((HandlerThread) this.f840d).getLooper());
    }

    public void t(String str, Object... objArr) {
        Log.w((String) this.f840d, i(str, objArr));
    }

    public String toString() {
        switch (this.f838b) {
            case 7:
                StringBuilder sb2 = new StringBuilder();
                if (((zk.v) this.f840d) == zk.v.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.f839c);
                sb2.append(' ');
                sb2.append((String) this.f841e);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            case 14:
                return l();
            default:
                return super.toString();
        }
    }

    public void u(oa.n nVar) {
        Map map = (Map) this.f840d;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            StringBuilder sb2 = new StringBuilder("ConnectionlessLifecycleHelper".length() + 59);
            sb2.append("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        map.put("ConnectionlessLifecycleHelper", nVar);
        if (this.f839c > 0) {
            new kw0(Looper.getMainLooper(), 4).post(new k0.i(19, this, nVar, false));
        }
    }

    public void v(Bundle bundle) {
        this.f839c = 1;
        this.f841e = bundle;
        for (Map.Entry entry : ((Map) this.f840d).entrySet()) {
            ((oa.n) entry.getValue()).b(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x000c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f840d
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r0.next()
            oa.n r1 = (oa.n) r1
            java.util.concurrent.atomic.AtomicReference r2 = r1.f29864d
            oa.e r3 = r1.f29868h
            java.util.concurrent.atomic.AtomicReference r4 = r1.f29864d
            java.lang.Object r2 = r2.get()
            oa.d0 r2 = (oa.d0) r2
            r5 = 1
            r6 = 3
            r7 = 0
            if (r10 == r5) goto L55
            r5 = 2
            if (r10 == r5) goto L2d
            goto L87
        L2d:
            ma.f r5 = r1.f29866f
            android.app.Activity r1 = r1.a()
            int r8 = ma.g.f28774a
            int r1 = r5.c(r1, r8)
            if (r1 != 0) goto L48
            r4.set(r7)
            com.google.android.gms.internal.ads.kw0 r1 = r3.f29849o
            android.os.Message r2 = r1.obtainMessage(r6)
            r1.sendMessage(r2)
            goto Lc
        L48:
            if (r2 == 0) goto Lc
            ma.b r5 = r2.f29832b
            int r5 = r5.f28761c
            r6 = 18
            if (r5 != r6) goto L87
            if (r1 != r6) goto L87
            goto Lc
        L55:
            r1 = -1
            if (r11 != r1) goto L65
            r4.set(r7)
            com.google.android.gms.internal.ads.kw0 r1 = r3.f29849o
            android.os.Message r2 = r1.obtainMessage(r6)
            r1.sendMessage(r2)
            goto Lc
        L65:
            if (r11 != 0) goto L87
            if (r2 == 0) goto Lc
            r1 = 13
            if (r12 == 0) goto L73
            java.lang.String r5 = "<<ResolutionFailureErrorDetail>>"
            int r1 = r12.getIntExtra(r5, r1)
        L73:
            ma.b r5 = new ma.b
            ma.b r6 = r2.f29832b
            java.lang.String r6 = r6.toString()
            r5.<init>(r1, r7, r6)
            int r1 = r2.f29831a
            r4.set(r7)
            r3.h(r5, r1)
            goto Lc
        L87:
            if (r2 == 0) goto Lc
            ma.b r1 = r2.f29832b
            int r2 = r2.f29831a
            r4.set(r7)
            r3.h(r1, r2)
            goto Lc
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.m0.w(int, int, android.content.Intent):void");
    }

    public void x(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f840d).entrySet()) {
            Bundle bundle2 = new Bundle();
            oa.d0 d0Var = (oa.d0) ((oa.n) entry.getValue()).f29864d.get();
            if (d0Var != null) {
                ma.b bVar = d0Var.f29832b;
                bundle2.putBoolean("resolving_error", true);
                bundle2.putInt("failed_client_id", d0Var.f29831a);
                bundle2.putInt("failed_status", bVar.f28761c);
                bundle2.putParcelable("failed_resolution", bVar.f28762d);
            }
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public m0(int i, String str, ArrayList arrayList) {
        this.f838b = 4;
        this.f839c = i;
        this.f841e = str;
        this.f840d = arrayList;
    }

    public m0() {
        this.f838b = 10;
        this.f840d = Collections.synchronizedMap(new h1.e(0));
        this.f839c = 0;
    }

    public m0(Context context) {
        this.f838b = 16;
        this.f840d = new ArrayList();
        this.f839c = 0;
        this.f841e = context.getApplicationContext();
    }

    public m0(String str, String[] strArr) {
        String string;
        this.f838b = 11;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f841e = string;
        this.f840d = str;
        pa.c0.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.f840d, i)) {
            i++;
        }
        this.f839c = i;
    }

    public m0(zk.v protocol, int i, String message) {
        this.f838b = 7;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f840d = protocol;
        this.f839c = i;
        this.f841e = message;
    }

    public m0(int i, z2.w wVar, fe.c cVar) {
        this.f838b = 9;
        this.f840d = wVar;
        this.f839c = i;
        this.f841e = cVar;
        cVar.f16785c = this;
    }

    public m0(int i, e4.n nVar, String str) {
        this.f838b = 6;
        this.f839c = i;
        this.f840d = nVar;
        this.f841e = str;
    }

    public m0(hf.a aVar) {
        this.f838b = 8;
        this.f840d = new SparseArray();
        this.f841e = aVar;
        this.f839c = -1;
    }

    public m0(int i, m3.w wVar) {
        this.f838b = 15;
        this.f839c = i;
        this.f840d = wVar;
        this.f841e = new m3.p();
    }

    public m0(p3.g gVar) {
        this.f838b = 13;
        ac.c cVar = new ac.c();
        cVar.f739c = new l7.i(4);
        this.f841e = cVar;
        this.f840d = gVar;
        this.f839c = 1;
    }

    public m0(yi.f0 f0Var) {
        this.f838b = 17;
        this.f841e = f0Var;
        this.f840d = zc.d.f46222c;
        this.f839c = Integer.MAX_VALUE;
    }

    public m0(e4.m mVar) {
        this.f838b = 5;
        this.f841e = mVar;
    }

    public m0(int i, int i10) {
        this.f838b = i10;
        switch (i10) {
            case 1:
                this.f839c = i;
                break;
            default:
                this.f840d = new Object[i * 2];
                this.f839c = 0;
                break;
        }
    }

    public m0(j3.o oVar, int i, String str) {
        this.f838b = 12;
        this.f840d = oVar;
        this.f839c = i;
        this.f841e = str;
    }
}

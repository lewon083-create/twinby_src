package ni;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.ov0;
import com.google.android.gms.internal.ads.r21;
import com.google.android.gms.internal.ads.ur;
import g0.a2;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import ob.w1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q9.i2;
import q9.k2;
import t.h2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements ed.b, oe.k, ov0, o9.b, k0.c, m4.i, xh.e0, i4.c1, h2.q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static i f29405d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f29407c;

    public /* synthetic */ i(int i, Object obj) {
        this.f29406b = i;
        this.f29407c = obj;
    }

    public static i r() {
        if (f29405d == null) {
            f29405d = new i(9);
        }
        return f29405d;
    }

    public static ArrayList v(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objW = jSONArray.get(i);
            if (objW instanceof JSONArray) {
                objW = v((JSONArray) objW);
            } else if (objW instanceof JSONObject) {
                objW = w((JSONObject) objW);
            }
            arrayList.add(objW);
        }
        return arrayList;
    }

    public static HashMap w(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objW = jSONObject.get(next);
            if (objW instanceof JSONArray) {
                objW = v((JSONArray) objW);
            } else if (objW instanceof JSONObject) {
                objW = w((JSONObject) objW);
            }
            map.put(next, objW);
        }
        return map;
    }

    public void B(String str) {
        s().edit().remove(str).apply();
        String string = s().getString("notification_ids", "");
        if (string.isEmpty()) {
            return;
        }
        s().edit().putString("notification_ids", string.replace(str.concat(StringUtils.COMMA), "")).apply();
    }

    public boolean C(String str) {
        return false;
    }

    public void D(int i, String str, List list, boolean z5, boolean z10) {
        ur urVar;
        ob.e1 e1Var = (ob.e1) this.f29407c;
        int i10 = i - 1;
        if (i10 == 0) {
            ob.s0 s0Var = ((ob.l1) e1Var.f15951b).f30265g;
            ob.l1.k(s0Var);
            urVar = s0Var.f30417n;
        } else if (i10 != 1) {
            if (i10 == 3) {
                ob.s0 s0Var2 = ((ob.l1) e1Var.f15951b).f30265g;
                ob.l1.k(s0Var2);
                urVar = s0Var2.f30418o;
            } else if (i10 != 4) {
                ob.s0 s0Var3 = ((ob.l1) e1Var.f15951b).f30265g;
                ob.l1.k(s0Var3);
                urVar = s0Var3.f30416m;
            } else if (z5) {
                ob.s0 s0Var4 = ((ob.l1) e1Var.f15951b).f30265g;
                ob.l1.k(s0Var4);
                urVar = s0Var4.f30414k;
            } else if (z10) {
                ob.s0 s0Var5 = ((ob.l1) e1Var.f15951b).f30265g;
                ob.l1.k(s0Var5);
                urVar = s0Var5.f30413j;
            } else {
                ob.s0 s0Var6 = ((ob.l1) e1Var.f15951b).f30265g;
                ob.l1.k(s0Var6);
                urVar = s0Var6.f30415l;
            }
        } else if (z5) {
            ob.s0 s0Var7 = ((ob.l1) e1Var.f15951b).f30265g;
            ob.l1.k(s0Var7);
            urVar = s0Var7.f30412h;
        } else if (z10) {
            ob.s0 s0Var8 = ((ob.l1) e1Var.f15951b).f30265g;
            ob.l1.k(s0Var8);
            urVar = s0Var8.f30411g;
        } else {
            ob.s0 s0Var9 = ((ob.l1) e1Var.f15951b).f30265g;
            ob.l1.k(s0Var9);
            urVar = s0Var9.i;
        }
        int size = list.size();
        if (size == 1) {
            urVar.g(list.get(0), str);
            return;
        }
        if (size == 2) {
            urVar.h(list.get(0), str, list.get(1));
        } else if (size != 3) {
            urVar.f(str);
        } else {
            urVar.i(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void E(r21 r21Var) {
        com.google.android.gms.internal.ads.i0 i0Var = (com.google.android.gms.internal.ads.i0) this.f29407c;
        i0Var.getClass();
        String str = r21Var.f9686b;
        int i = r21Var.f9685a;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) q9.s.f31967e.f31970c.a(al.Jc)).booleanValue()) {
                i0Var.f6313c = str;
            }
        }
        switch (i) {
            case 8152:
                i0Var.j("onLMDOverlayOpened", new HashMap());
                break;
            case 8153:
                i0Var.j("onLMDOverlayClicked", new HashMap());
                break;
            case 8155:
                i0Var.j("onLMDOverlayClose", new HashMap());
                break;
            case 8157:
                i0Var.f6313c = null;
                i0Var.f6314d = null;
                i0Var.f6312b = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(i));
                i0Var.j("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(ob.w1 r2, int r3) {
        /*
            r1 = this;
            r0 = -30
            if (r3 == r0) goto L1e
            r0 = -20
            if (r3 == r0) goto L1b
            r0 = -10
            if (r3 == r0) goto L18
            if (r3 == 0) goto L1b
            r0 = 30
            if (r3 == r0) goto L15
            ob.h r3 = ob.h.UNSET
            goto L20
        L15:
            ob.h r3 = ob.h.INITIALIZATION
            goto L20
        L18:
            ob.h r3 = ob.h.MANIFEST
            goto L20
        L1b:
            ob.h r3 = ob.h.API
            goto L20
        L1e:
            ob.h r3 = ob.h.TCF
        L20:
            java.lang.Object r0 = r1.f29407c
            java.util.EnumMap r0 = (java.util.EnumMap) r0
            r0.put(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.i.F(ob.w1, int):void");
    }

    public void G(w1 w1Var, ob.h hVar) {
        ((EnumMap) this.f29407c).put(w1Var, hVar);
    }

    @Override // xh.e0
    public void a(io.flutter.embedding.engine.renderer.j jVar) {
        xh.f0 f0Var = (xh.f0) this.f29407c;
        io.flutter.embedding.engine.renderer.j jVar2 = f0Var.f36120c;
        if (jVar2 != null) {
            jVar2.g(f0Var.f36122e);
        }
        f0Var.f36120c = jVar;
    }

    @Override // com.google.android.gms.internal.ads.ov0
    public void b(int i, long j10) {
        ((p9.e) this.f29407c).i.b(i, System.currentTimeMillis() - j10);
    }

    @Override // h2.q
    public boolean c(View view) {
        com.google.firebase.messaging.y yVar = (com.google.firebase.messaging.y) this.f29407c;
        int currentItem = ((y6.m) view).getCurrentItem() - 1;
        y6.m mVar = (y6.m) yVar.f14902e;
        if (mVar.f36523s) {
            mVar.c(currentItem, true);
        }
        return true;
    }

    @Override // i4.c1
    public void d(i4.d1 d1Var) {
        y3.k kVar = (y3.k) this.f29407c;
        kVar.f36371r.d(kVar);
    }

    @Override // m4.i
    public void e(m4.k kVar, long j10, long j11) {
        long j12;
        m4.q qVar = (m4.q) kVar;
        v3.f fVar = (v3.f) this.f29407c;
        long j13 = qVar.f28674b;
        p3.l lVar = qVar.f28675c;
        p3.c0 c0Var = qVar.f28677e;
        i4.u uVar = new i4.u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        fVar.f34689n.getClass();
        fVar.f34693r.d(uVar, qVar.f28676d);
        w3.c cVar = (w3.c) qVar.f28679g;
        w3.c cVar2 = fVar.H;
        int size = cVar2 == null ? 0 : cVar2.f35040m.size();
        long j14 = cVar.b(0).f35061b;
        int i = 0;
        while (i < size && fVar.H.b(i).f35061b < j14) {
            i++;
        }
        if (cVar.f35032d) {
            if (size - i > cVar.f35040m.size()) {
                m3.b.s("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j15 = fVar.N;
                j12 = -9223372036854775807L;
                if (j15 == -9223372036854775807L || cVar.f35036h * 1000 > j15) {
                    fVar.M = 0;
                } else {
                    m3.b.s("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f35036h + ", " + fVar.N);
                }
            }
            int i10 = fVar.M;
            fVar.M = i10 + 1;
            if (i10 < fVar.f34689n.e(qVar.f28676d)) {
                fVar.E.postDelayed(fVar.f34698w, Math.min((fVar.M - 1) * 1000, 5000));
                return;
            } else {
                fVar.D = new androidx.datastore.preferences.protobuf.m();
                return;
            }
        }
        j12 = -9223372036854775807L;
        fVar.H = cVar;
        fVar.I = cVar.f35032d & fVar.I;
        fVar.J = j10 - j11;
        fVar.K = j10;
        fVar.O += i;
        synchronized (fVar.f34696u) {
            if (qVar.f28675c.f31172a.equals(fVar.F)) {
                Uri uriO = fVar.H.f35038k;
                if (uriO == null) {
                    uriO = a0.e.o(qVar.f28677e.f31133d);
                }
                fVar.F = uriO;
            }
        }
        w3.c cVar3 = fVar.H;
        if (!cVar3.f35032d || fVar.L != j12) {
            fVar.B(true);
            return;
        }
        d8.a aVar = cVar3.i;
        if (aVar == null) {
            fVar.y();
            return;
        }
        String str = aVar.f15576b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                fVar.L = m3.z.P(aVar.f15577c) - fVar.K;
                fVar.B(true);
                return;
            } catch (j3.d0 e3) {
                fVar.A(e3);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            fVar.C(aVar, new v3.e());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            fVar.C(aVar, new t.t0(3));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            fVar.y();
        } else {
            fVar.A(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // o9.b
    public Map f() {
        HashMap map = new HashMap();
        Objects.requireNonNull((k2) this.f29407c);
        map.put("com.google.android.gms.ads.MobileAds", new i2());
        return map;
    }

    @Override // xh.e0
    public void h() {
        xh.f0 f0Var = (xh.f0) this.f29407c;
        f0Var.f36119b.setAlpha(0.0f);
        io.flutter.embedding.engine.renderer.j jVar = f0Var.f36120c;
        if (jVar != null) {
            jVar.g(f0Var.f36122e);
        }
        f0Var.f36120c = null;
    }

    @Override // m4.i
    public com.google.android.gms.internal.ads.o i(m4.k kVar, long j10, long j11, IOException iOException, int i) {
        long jMin;
        m4.q qVar = (m4.q) kVar;
        v3.f fVar = (v3.f) this.f29407c;
        long j12 = qVar.f28674b;
        p3.l lVar = qVar.f28675c;
        p3.c0 c0Var = qVar.f28677e;
        i4.u uVar = new i4.u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        int i10 = qVar.f28676d;
        fVar.f34689n.getClass();
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof j3.d0) || (cause instanceof FileNotFoundException) || (cause instanceof p3.t) || (cause instanceof m4.m) || ((cause instanceof p3.i) && ((p3.i) cause).f31158b == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        com.google.android.gms.internal.ads.o oVar = jMin == -9223372036854775807L ? m4.n.f28670g : new com.google.android.gms.internal.ads.o(0, jMin, false);
        fVar.f34693r.g(uVar, i10, iOException, !oVar.a());
        return oVar;
    }

    public r3.a k() {
        return null;
    }

    @Override // oe.k
    public Object l() {
        Type type = (Type) this.f29407c;
        if (!(type instanceof ParameterizedType)) {
            throw new me.q("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new me.q("Invalid EnumSet type: " + type.toString());
    }

    @Override // m4.i
    public void m(m4.k kVar, long j10, long j11, boolean z5) {
        ((v3.f) this.f29407c).z((m4.q) kVar, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.ov0
    public void n(long j10, String str, int i) {
        ((p9.e) this.f29407c).i.e(i, System.currentTimeMillis() - j10, null, null, str);
    }

    @Override // m4.i
    public void o(m4.k kVar, long j10, long j11, int i) {
        i4.u uVar;
        m4.q qVar = (m4.q) kVar;
        v3.f fVar = (v3.f) this.f29407c;
        if (i == 0) {
            long j12 = qVar.f28674b;
            uVar = new i4.u(j10, qVar.f28675c);
        } else {
            long j13 = qVar.f28674b;
            p3.l lVar = qVar.f28675c;
            p3.c0 c0Var = qVar.f28677e;
            uVar = new i4.u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        }
        fVar.f34693r.h(uVar, qVar.f28676d, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // ed.b, k0.c
    public void onFailure(Throwable th2) {
        h2 h2Var;
        switch (this.f29406b) {
            case 0:
                fj.z zVar = (fj.z) this.f29407c;
                if (th2 instanceof a0.o) {
                    l1.c(null, zVar);
                    return;
                } else {
                    l1.b(zVar, th2);
                    return;
                }
            case 12:
                h2 h2Var2 = (h2) this.f29407c;
                synchronized (h2Var2.f33081a) {
                    try {
                        List list = h2Var2.f33090k;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((g0.a1) it.next()).b();
                            }
                            h2Var2.f33090k = null;
                        }
                    } finally {
                    }
                    break;
                }
                h2Var2.f33100u.s();
                q9.o oVar = h2Var2.f33082b;
                Iterator it2 = oVar.m().iterator();
                while (it2.hasNext() && (h2Var = (h2) it2.next()) != h2Var2) {
                    synchronized (h2Var.f33081a) {
                        try {
                            List list2 = h2Var.f33090k;
                            if (list2 != null) {
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    ((g0.a1) it3.next()).b();
                                }
                                h2Var.f33090k = null;
                            }
                        } finally {
                        }
                    }
                    h2Var.f33100u.s();
                }
                synchronized (oVar.f31947b) {
                    ((LinkedHashSet) oVar.f31950e).remove(h2Var2);
                    break;
                }
                return;
            default:
                x0.b0 b0Var = (x0.b0) this.f29407c;
                f2.g.h("In-progress recording shouldn't be null", b0Var.f35554r != null);
                if (b0Var.f35554r.f35610m) {
                    return;
                }
                com.google.android.gms.internal.auth.g.e("Recorder", "Encodings end with error: " + th2);
                b0Var.i(b0Var.D == null ? 8 : 6);
                return;
        }
    }

    @Override // xh.e0
    public void onResume() {
        xh.f0 f0Var = (xh.f0) this.f29407c;
        io.flutter.embedding.engine.renderer.j jVar = f0Var.f36120c;
        if (jVar != null) {
            jVar.a(f0Var.f36122e);
        }
    }

    @Override // ed.b, k0.c
    public void onSuccess(Object obj) {
        switch (this.f29406b) {
            case 0:
                l1.c(null, (fj.z) this.f29407c);
                break;
            case 12:
                break;
            default:
                com.google.android.gms.internal.auth.g.e("Recorder", "Encodings end successfully.");
                x0.b0 b0Var = (x0.b0) this.f29407c;
                b0Var.i(b0Var.U);
                break;
        }
    }

    public x3.c p() {
        return (x3.c) this.f29407c;
    }

    public HashMap q(String str) {
        String string = s().getString(str, null);
        if (string != null) {
            try {
                HashMap map = new HashMap(1);
                HashMap mapW = w(new JSONObject(string));
                mapW.put("to", str);
                map.put("message", mapW);
                return map;
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        return null;
    }

    public SharedPreferences s() {
        if (((SharedPreferences) this.f29407c) == null) {
            this.f29407c = a.a.f10b.getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return (SharedPreferences) this.f29407c;
    }

    public UUID t() {
        return j3.f.f26231a;
    }

    public String toString() {
        switch (this.f29406b) {
            case 2:
                StringBuilder sb2 = new StringBuilder("1");
                for (w1 w1Var : w1.values()) {
                    ob.h hVar = (ob.h) ((EnumMap) this.f29407c).get(w1Var);
                    if (hVar == null) {
                        hVar = ob.h.UNSET;
                    }
                    sb2.append(hVar.f30164b);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public int u() {
        return 1;
    }

    public void x() {
        ((z2.v) this.f29407c).f45998f.Q();
    }

    public void y() {
        y3.k kVar = (y3.k) this.f29407c;
        int i = kVar.f36372s - 1;
        kVar.f36372s = i;
        if (i > 0) {
            return;
        }
        int i10 = 0;
        for (y3.q qVar : kVar.f36374u) {
            qVar.d();
            i10 += qVar.J.f20935a;
        }
        j3.p0[] p0VarArr = new j3.p0[i10];
        int i11 = 0;
        for (y3.q qVar2 : kVar.f36374u) {
            qVar2.d();
            int i12 = qVar2.J.f20935a;
            int i13 = 0;
            while (i13 < i12) {
                qVar2.d();
                p0VarArr[i11] = qVar2.J.a(i13);
                i13++;
                i11++;
            }
        }
        kVar.f36373t = new i4.j1(p0VarArr);
        kVar.f36371r.j(kVar);
    }

    public j3.b0 z(q4.l lVar, e5.h hVar, int i) {
        m3.p pVar = (m3.p) this.f29407c;
        j3.b0 b0VarZ = null;
        int i10 = 0;
        loop0: while (true) {
            int i11 = 0;
            do {
                int i12 = i11 % 10;
                int i13 = i12 + 10;
                if (i12 == 0 && i11 != 0) {
                    byte[] bArr = pVar.f28589a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i14 = i11 == 0 ? 10 : 1;
                try {
                    lVar.V(pVar.f28589a, i13 - i14, i14);
                    pVar.M(i12);
                    pVar.L(i13);
                    if (pVar.a() < 3) {
                        throw new IndexOutOfBoundsException("position=" + pVar.f28590b + ", limit=" + pVar.f28591c);
                    }
                    int iC = pVar.C();
                    int i15 = pVar.f28590b - 3;
                    pVar.f28590b = i15;
                    if (iC != 4801587) {
                        if (q4.b.k(pVar.i()) != -1) {
                            break loop0;
                        }
                        if (i11 == 0) {
                            pVar.c(20);
                        }
                        i11++;
                    } else {
                        pVar.N(6);
                        int iY = pVar.y();
                        int i16 = iY + 10;
                        if (b0VarZ == null) {
                            byte[] bArr2 = new byte[i16];
                            System.arraycopy(pVar.f28589a, i15, bArr2, 0, 10);
                            lVar.V(bArr2, 10, iY);
                            b0VarZ = new e5.i(hVar).Z(i16, bArr2);
                        } else {
                            lVar.B(iY);
                        }
                        i10 += i16;
                    }
                } catch (EOFException unused) {
                }
            } while (i11 <= i);
        }
        lVar.L();
        lVar.B(i10);
        return b0VarZ;
    }

    public i(int i) {
        this.f29406b = i;
        switch (i) {
            case 7:
                this.f29407c = new m3.p(10);
                break;
            case 9:
                break;
            case 13:
                this.f29407c = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
            default:
                this.f29407c = new EnumMap(w1.class);
                break;
        }
    }

    public i(Context context) {
        this.f29406b = 11;
        ti.b bVar = new ti.b(context);
        this.f29407c = xc.f.b(new m7.a(16, xc.f.b(new r3.b(bVar, xc.f.b(sc.j.f32903b), new sc.c(bVar)))));
    }

    public i(EnumMap enumMap) {
        this.f29406b = 2;
        EnumMap enumMap2 = new EnumMap(w1.class);
        this.f29407c = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public i(a2 a2Var) {
        this.f29406b = 1;
        this.f29407c = (IncorrectJpegMetadataQuirk) a2Var.i(IncorrectJpegMetadataQuirk.class);
    }

    public i(EditText editText) {
        this.f29406b = 19;
        this.f29407c = new r3.b(editText);
    }

    public void A(i4.i0 i0Var) {
    }

    public void g(i4.i0 i0Var) {
    }
}

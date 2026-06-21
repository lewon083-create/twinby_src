package t;

import a0.q2;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import g0.u2;
import g0.x2;
import g0.z2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements g0.f0 {
    public boolean A;
    public x1 B;
    public final q9.o C;
    public final x1 D;
    public final HashSet E;
    public g0.w F;
    public final Object G;
    public boolean H;
    public final i1 I;
    public final k6.t0 J;
    public final d2 K;
    public final r3.b L;
    public volatile int M = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1.e f32967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u.p f32968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0.i f32969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0.d f32970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bb.e f32971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r3.b f32972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f32973h;
    public final b0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f32974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CameraDevice f32975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h1 f32977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicInteger f32978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ed.d f32979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j1.h f32980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f32981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f32982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f32983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y.a f32984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g0.n0 f32985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a0.e0 f32986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f32987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f32988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f32989y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f32990z;

    public c0(Context context, u.p pVar, String str, d0 d0Var, y.a aVar, g0.n0 n0Var, Executor executor, Handler handler, i1 i1Var, long j10, a0.e0 e0Var) throws a0.x {
        bb.e eVar = new bb.e(9);
        this.f32971f = eVar;
        this.f32976l = 0;
        this.f32978n = new AtomicInteger(0);
        this.f32981q = new LinkedHashMap();
        this.f32982r = 0;
        this.f32989y = false;
        this.f32990z = false;
        this.A = true;
        this.E = new HashSet();
        this.F = g0.z.f19810a;
        this.G = new Object();
        this.H = false;
        this.L = new r3.b(this);
        this.f32968c = pVar;
        this.f32984t = aVar;
        this.f32985u = n0Var;
        j0.d dVar = new j0.d(handler);
        this.f32970e = dVar;
        j0.i iVar = new j0.i(executor);
        this.f32969d = iVar;
        this.i = new b0(this, iVar, dVar, j10);
        this.f32967b = new a1.e(str, 25);
        ((androidx.lifecycle.d0) eVar.f2019c).i(new g0.p1(g0.e0.CLOSED));
        r3.b bVar = new r3.b(n0Var);
        this.f32972g = bVar;
        q9.o oVar = new q9.o();
        oVar.f31947b = new Object();
        oVar.f31948c = new LinkedHashSet();
        oVar.f31949d = new LinkedHashSet();
        oVar.f31950e = new LinkedHashSet();
        oVar.f31951f = new b1(oVar);
        oVar.f31946a = iVar;
        this.C = oVar;
        this.I = i1Var;
        this.f32986v = e0Var;
        try {
            u.i iVarB = pVar.b(str);
            o oVar2 = new o(iVarB, dVar, iVar, new m4.d(this), d0Var.f33009h);
            this.f32973h = oVar2;
            this.f32974j = d0Var;
            d0Var.w(oVar2);
            d0Var.f33008g.l((androidx.lifecycle.d0) bVar.f32189d);
            this.J = k6.t0.i(iVarB);
            this.f32977m = B();
            this.D = new x1(iVar, dVar, handler, oVar, d0Var.f33009h, w.a.f34941a);
            g0.a2 a2Var = d0Var.f33009h;
            this.f32987w = a2Var.h(LegacyCameraOutputConfigNullPointerQuirk.class) || a2Var.h(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
            this.f32988x = d0Var.f33009h.h(LegacyCameraSurfaceCleanupQuirk.class);
            x xVar = new x(this, str);
            this.f32983s = xVar;
            k6.t0 t0Var = new k6.t0(11, this);
            synchronized (n0Var.f19685b) {
                f2.g.h("Camera is already registered: " + this, !n0Var.f19688e.containsKey(this));
                n0Var.f19688e.put(this, new g0.m0(iVar, t0Var, xVar));
            }
            pVar.f33976a.E(iVar, xVar);
            this.K = new d2(context, str, pVar, new ob.a0(29), c0.b.f2178w1);
        } catch (u.a e3) {
            throw new a0.x(e3);
        }
    }

    public static String x(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String y(x1 x1Var) {
        StringBuilder sb2 = new StringBuilder("MeteringRepeating");
        x1Var.getClass();
        sb2.append(x1Var.hashCode());
        return sb2.toString();
    }

    public static String z(q2 q2Var) {
        return q2Var.i() + q2Var.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A(x1 x1Var) {
        int i;
        int i10;
        boolean z5;
        a0.e0 e0Var;
        x1Var.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (this.G) {
            try {
                i = 0;
                i10 = this.f32984t.b() == 2 ? 1 : 0;
            } finally {
            }
        }
        a1.e eVar = this.f32967b;
        eVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) eVar.f324d).entrySet()) {
            if (((u2) entry.getValue()).f19781e) {
                arrayList2.add((u2) entry.getValue());
            }
        }
        for (u2 u2Var : Collections.unmodifiableCollection(arrayList2)) {
            List list = u2Var.f19780d;
            if (list == null || list.get(i) != z2.f19817g) {
                if (u2Var.f19779c == null || u2Var.f19780d == null) {
                    z5 = true;
                    com.google.android.gms.internal.auth.g.O("Camera2CameraImpl", "Invalid stream spec or capture types in " + u2Var);
                    break;
                }
                g0.h2 h2Var = u2Var.f19777a;
                x2 x2Var = u2Var.f19778b;
                for (g0.a1 a1Var : h2Var.b()) {
                    d2 d2Var = this.K;
                    int iK = x2Var.k();
                    Size size = a1Var.f19516h;
                    g0.k2 k2VarM = x2Var.m();
                    g0.o oVarL = d2Var.l(iK);
                    g0.n2 n2Var = g0.n2.f19693c;
                    g0.k2 k2Var = g0.p2.f19713e;
                    g0.p2 p2VarF = ya.e.F(iK, size, oVarL, i10, n2Var, k2VarM);
                    int iK2 = x2Var.k();
                    Size size2 = a1Var.f19516h;
                    g0.n nVar = u2Var.f19779c;
                    a0.i0 i0Var = nVar.f19679c;
                    List list2 = u2Var.f19780d;
                    g0.v0 v0Var = nVar.f19682f;
                    int i11 = nVar.f19680d;
                    Range range = nVar.f19681e;
                    Boolean bool = (Boolean) x2Var.g(x2.f19804z, Boolean.FALSE);
                    Objects.requireNonNull(bool);
                    arrayList.add(new g0.e(p2VarF, iK2, size2, i0Var, list2, v0Var, i11, range, bool.booleanValue()));
                    i = i;
                }
            }
        }
        boolean z10 = i;
        z5 = true;
        HashMap map = new HashMap();
        map.put((w1) x1Var.f33319d, Collections.singletonList((Size) x1Var.f33320e));
        try {
            this.K.j(i10, arrayList, map, false, false, false);
            v("Surface combination with metering repeating supported!", null);
            e0Var = this.f32986v;
        } catch (IllegalArgumentException e3) {
            v("Surface combination with metering repeating  not supported!", e3);
        }
        return (e0Var == null || ((Boolean) e0Var.L.g(a0.e0.X, Boolean.TRUE)).booleanValue()) ? z10 : z5;
    }

    public final h1 B() {
        h1 h1Var;
        synchronized (this.G) {
            try {
                a0.e0 e0Var = this.f32986v;
                if (e0Var != null) {
                    g0.g gVar = z.f.f45775a;
                    Intrinsics.checkNotNullParameter(e0Var, "<this>");
                    if (e0Var.L.g(z.f.f45775a, null) != null) {
                        throw new ClassCastException();
                    }
                }
                h1Var = new h1(this.J, this.f32974j.f33009h, false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final void C(boolean z5) {
        if (!z5) {
            this.i.f32953e.f3689c = -1L;
        }
        this.i.a();
        this.L.o();
        v("Opening camera.", null);
        F(9);
        try {
            this.f32968c.f33976a.D(this.f32974j.f33002a, this.f32969d, u());
        } catch (SecurityException e3) {
            v("Unable to open camera due to " + e3.getMessage(), null);
            F(8);
            this.i.b();
        } catch (RuntimeException e7) {
            v("Unexpected error occurred when opening camera.", e7);
            G(5, new a0.g(null, 6), true);
        } catch (u.a e10) {
            v("Unable to open camera due to " + e10.getMessage(), null);
            if (e10.f33945b == 10001) {
                G(3, new a0.g(e10, 7), true);
                return;
            }
            r3.b bVar = this.L;
            if (((c0) bVar.f32189d).M != 9) {
                ((c0) bVar.f32189d).v("Don't need the onError timeout handler.", null);
                return;
            }
            ((c0) bVar.f32189d).v("Camera waiting for onError.", null);
            bVar.o();
            bVar.f32188c = new bb.e(bVar);
        }
    }

    public final void D() {
        f2.g.h(null, this.M == 10);
        g0.g2 g2VarA = this.f32967b.A();
        if (!g2VarA.c()) {
            v("Unable to create capture session due to conflicting configurations", null);
            return;
        }
        if (!this.f32985u.e(this.f32975k.getId(), this.f32984t.c(this.f32975k.getId()))) {
            v("Unable to create capture session in camera operating mode = " + this.f32984t.b(), null);
            return;
        }
        HashMap streamUseCaseMap = new HashMap();
        Collection<g0.h2> sessionConfigs = this.f32967b.C();
        Collection useCaseConfigs = this.f32967b.E();
        g0.g gVar = b2.f32957a;
        Intrinsics.checkNotNullParameter(sessionConfigs, "sessionConfigs");
        Intrinsics.checkNotNullParameter(useCaseConfigs, "useCaseConfigs");
        Intrinsics.checkNotNullParameter(streamUseCaseMap, "streamUseCaseMap");
        ArrayList arrayList = new ArrayList(useCaseConfigs);
        Iterator it = sessionConfigs.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            g0.h2 h2Var = (g0.h2) it.next();
            if (h2Var.f19589g.f19746b.L.containsKey(gVar) && h2Var.b().size() != 1) {
                String str = String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{Integer.valueOf(h2Var.b().size())}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                com.google.android.gms.internal.auth.g.k("StreamUseCaseUtil", str);
                break;
            }
            if (h2Var.f19589g.f19746b.L.containsKey(gVar)) {
                int i = 0;
                for (g0.h2 h2Var2 : sessionConfigs) {
                    if (((x2) arrayList.get(i)).n() == z2.f19817g) {
                        Intrinsics.checkNotNullExpressionValue(h2Var2.b(), "getSurfaces(...)");
                        f2.g.h("MeteringRepeating should contain a surface", !r11.isEmpty());
                        streamUseCaseMap.put(h2Var2.b().get(0), 1L);
                    } else if (h2Var2.f19589g.f19746b.L.containsKey(gVar)) {
                        List listB = h2Var2.b();
                        Intrinsics.checkNotNullExpressionValue(listB, "getSurfaces(...)");
                        if (!listB.isEmpty()) {
                            Object obj = h2Var2.b().get(0);
                            Object objA = h2Var2.f19589g.f19746b.a(gVar);
                            Intrinsics.b(objA);
                            streamUseCaseMap.put(obj, objA);
                        }
                    }
                    i++;
                }
            }
        }
        com.google.android.gms.internal.auth.g.e("StreamUseCaseUtil", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + streamUseCaseMap);
        h1 h1Var = this.f32977m;
        synchronized (h1Var.f33063a) {
            h1Var.f33074m = streamUseCaseMap;
        }
        h1 h1Var2 = this.f32977m;
        g0.h2 h2VarB = g2VarA.b();
        CameraDevice cameraDevice = this.f32975k;
        cameraDevice.getClass();
        x1 x1Var = this.D;
        k0.j.a(h1Var2.m(h2VarB, cameraDevice, new h2((g0.a2) x1Var.f33321f, (g0.a2) x1Var.f33322g, (q9.o) x1Var.f33320e, (j0.i) x1Var.f33317b, (j0.d) x1Var.f33318c, (Handler) x1Var.f33319d)), new w(this, h1Var2, 1), this.f32969d);
    }

    public final void E() {
        g0.h2 h2Var;
        List listUnmodifiableList;
        f2.g.h(null, this.f32977m != null);
        v("Resetting Capture Session", null);
        h1 h1Var = this.f32977m;
        synchronized (h1Var.f33063a) {
            h2Var = h1Var.f33068f;
        }
        synchronized (h1Var.f33063a) {
            listUnmodifiableList = Collections.unmodifiableList(h1Var.f33064b);
        }
        h1 h1VarB = B();
        this.f32977m = h1VarB;
        h1VarB.o(h2Var);
        this.f32977m.k(listUnmodifiableList);
        if (z.m(this.M) != 9) {
            v("Skipping Capture Session state check due to current camera state: " + z.n(this.M) + " and previous session status: " + h1Var.i(), null);
        } else if (this.f32987w && h1Var.i()) {
            v("Close camera before creating new session", null);
            F(7);
        }
        if (this.f32988x && h1Var.i()) {
            v("ConfigAndClose is required when close the camera.", null);
            this.f32989y = true;
        }
        h1Var.b();
        ed.d dVarN = h1Var.n();
        v("Releasing session in state ".concat(z.l(this.M)), null);
        this.f32981q.put(h1Var, dVarN);
        k0.j.a(dVarN, new w(this, h1Var, 0), hl.d.j());
    }

    public final void F(int i) {
        G(i, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:28:0x00a0, B:30:0x00a6, B:32:0x00b0, B:45:0x00e4, B:49:0x00ea, B:51:0x00f3, B:53:0x00f7, B:55:0x0107, B:58:0x010f, B:60:0x0113, B:61:0x0122, B:63:0x0128, B:65:0x013a, B:73:0x0166, B:74:0x0169, B:66:0x014a, B:68:0x014e, B:70:0x0152, B:34:0x00b8, B:36:0x00cd, B:40:0x00d4, B:42:0x00db), top: B:95:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(int r10, a0.g r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c0.G(int, a0.g, boolean):void");
    }

    public final ArrayList H(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q2 q2Var = (q2) it.next();
            arrayList2.add(new c(z(q2Var), q2Var.getClass(), this.A ? q2Var.f215o : q2Var.f216p, q2Var.f209h, q2Var.d(), q2Var.i, q2Var.e() == null ? null : u0.d.K(q2Var)));
        }
        return arrayList2;
    }

    public final void I(ArrayList arrayList) throws Exception {
        Size size;
        boolean zIsEmpty = this.f32967b.C().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            if (!this.f32967b.N(cVar.f32960a)) {
                a1.e eVar = this.f32967b;
                String str = cVar.f32960a;
                g0.h2 h2Var = cVar.f32962c;
                x2 x2Var = cVar.f32963d;
                g0.n nVar = cVar.f32965f;
                List list = cVar.f32966g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) eVar.f324d;
                u2 u2Var = (u2) linkedHashMap.get(str);
                if (u2Var == null) {
                    u2Var = new u2(h2Var, x2Var, nVar, list);
                    linkedHashMap.put(str, u2Var);
                }
                u2Var.f19781e = true;
                eVar.V(str, h2Var, x2Var, nVar, list);
                arrayList2.add(cVar.f32960a);
                if (cVar.f32961b == a0.a2.class && (size = cVar.f32964e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        v("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED", null);
        if (zIsEmpty) {
            this.f32973h.C(true);
            o oVar = this.f32973h;
            synchronized (oVar.f33174d) {
                oVar.f33186q++;
            }
        }
        r();
        N();
        M();
        L();
        E();
        if (this.M == 10) {
            D();
        } else {
            int iM = z.m(this.M);
            if (iM == 2 || iM == 3 || iM == 4) {
                J(false);
            } else if (iM != 5) {
                v("open() ignored due to being in state: ".concat(z.n(this.M)), null);
            } else {
                F(8);
                if (!this.f32981q.isEmpty() && !this.f32990z && this.f32976l == 0) {
                    f2.g.h("Camera Device should be open if session close is not complete", this.f32975k != null);
                    F(10);
                    D();
                }
            }
        }
        if (rational != null) {
            this.f32973h.f33178h.f33256e = rational;
        }
    }

    public final void J(boolean z5) {
        v("Attempting to force open the camera.", null);
        if (this.f32985u.d(this)) {
            C(z5);
        } else {
            v("No cameras available. Waiting for available camera before opening camera.", null);
            F(4);
        }
    }

    public final void K(boolean z5) {
        v("Attempting to open the camera.", null);
        if (this.f32983s.f33314b && this.f32985u.d(this)) {
            C(z5);
        } else {
            v("No cameras available. Waiting for available camera before opening camera.", null);
            F(4);
        }
    }

    public final void L() {
        g0.g2 g2VarY = this.f32967b.y();
        boolean zC = g2VarY.c();
        o oVar = this.f32973h;
        if (!zC) {
            oVar.f33195z = 1;
            oVar.f33178h.f33264n = 1;
            oVar.f33184o.f19728c = 1;
            this.f32977m.o(oVar.u());
            return;
        }
        int i = g2VarY.b().f19589g.f19747c;
        oVar.f33195z = i;
        oVar.f33178h.f33264n = i;
        oVar.f33184o.f19728c = i;
        g2VarY.a(oVar.u());
        this.f32977m.o(g2VarY.b());
    }

    public final void M() {
        if (ac.c.b(this.f32974j.f33003b)) {
            g0.g2 g2VarY = this.f32967b.y();
            if (g2VarY.c()) {
                int iIntValue = ((Integer) g2VarY.b().f19589g.a().getUpper()).intValue();
                o oVar = this.f32973h;
                if (iIntValue > 30) {
                    oVar.D(true);
                } else {
                    oVar.D(false);
                }
            }
        }
    }

    public final void N() throws Exception {
        Iterator it = this.f32967b.E().iterator();
        boolean zBooleanValue = false;
        while (it.hasNext()) {
            zBooleanValue |= ((Boolean) ((x2) it.next()).g(x2.A, Boolean.FALSE)).booleanValue();
        }
        p2 p2Var = this.f32973h.f33182m;
        if (p2Var.f33223d != zBooleanValue && zBooleanValue) {
            p0.c cVar = p2Var.f33222c;
            while (!cVar.g()) {
                ((a0.r1) cVar.b()).close();
            }
        }
        p2Var.f33223d = zBooleanValue;
    }

    @Override // a0.p2
    public final void c(q2 q2Var) {
        this.f32969d.execute(new r(this, z(q2Var), this.A ? q2Var.f215o : q2Var.f216p, q2Var.f209h, q2Var.i, q2Var.e() == null ? null : u0.d.K(q2Var), 0));
    }

    @Override // a0.p2
    public final void d(q2 q2Var) {
        this.f32969d.execute(new m3.c0(26, this, z(q2Var)));
    }

    @Override // a0.p2
    public final void e(q2 q2Var) {
        this.f32969d.execute(new r(this, z(q2Var), this.A ? q2Var.f215o : q2Var.f216p, q2Var.f209h, q2Var.i, q2Var.e() == null ? null : u0.d.K(q2Var), 2));
    }

    @Override // g0.f0
    public final g0.c0 g() {
        return this.f32973h;
    }

    @Override // a0.p2
    public final void h(q2 q2Var) {
        this.f32969d.execute(new r(this, z(q2Var), this.A ? q2Var.f215o : q2Var.f216p, q2Var.f209h, q2Var.i, q2Var.e() == null ? null : u0.d.K(q2Var), 1));
    }

    @Override // g0.f0
    public final g0.w i() {
        return this.F;
    }

    @Override // g0.f0
    public final void j(boolean z5) {
        this.f32969d.execute(new a1.b(4, this, z5));
    }

    @Override // g0.f0
    public final void k(Collection collection) {
        o oVar = this.f32973h;
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (oVar.f33174d) {
            oVar.f33186q++;
        }
        ArrayList<q2> arrayList2 = new ArrayList(arrayList);
        HashSet hashSet = this.E;
        for (q2 q2Var : arrayList2) {
            String strZ = z(q2Var);
            if (!hashSet.contains(strZ)) {
                hashSet.add(strZ);
                q2Var.w();
                q2Var.u();
            }
        }
        try {
            this.f32969d.execute(new q(this, new ArrayList(H(arrayList)), 0));
        } catch (RejectedExecutionException e3) {
            v("Unable to attach use cases.", e3);
            oVar.s();
        }
    }

    @Override // g0.f0
    public final void l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(H(arrayList2));
        for (q2 q2Var : new ArrayList(arrayList2)) {
            String strZ = z(q2Var);
            HashSet hashSet = this.E;
            if (hashSet.contains(strZ)) {
                q2Var.x();
                hashSet.remove(strZ);
            }
        }
        this.f32969d.execute(new q(this, arrayList3, 1));
    }

    @Override // g0.f0
    public final void m() {
        this.f32969d.execute(new t(this, 0));
    }

    @Override // g0.f0
    public final void o(boolean z5) {
        this.A = z5;
    }

    @Override // g0.f0
    public final g0.d0 p() {
        return this.f32974j;
    }

    @Override // g0.f0
    public final void q(g0.w wVar) {
        if (wVar == null) {
            wVar = g0.z.f19810a;
        }
        wVar.p();
        this.F = wVar;
        synchronized (this.G) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c0.r():void");
    }

    @Override // g0.f0
    public final ed.d release() {
        return i0.o.w(new s(this, 0));
    }

    public final void s() {
        ArrayList<g0.s0> arrayList;
        f2.g.h("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + z.n(this.M) + " (error: " + x(this.f32976l) + ")", this.M == 6 || this.M == 2 || (this.M == 8 && this.f32976l != 0));
        E();
        h1 h1Var = this.f32977m;
        synchronized (h1Var.f33063a) {
            try {
                if (h1Var.f33064b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(h1Var.f33064b);
                    h1Var.f33064b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            for (g0.s0 s0Var : arrayList) {
                Iterator it = s0Var.f19749e.iterator();
                while (it.hasNext()) {
                    ((g0.p) it.next()).a(s0Var.b());
                }
            }
        }
    }

    public final void t() {
        f2.g.h(null, this.M == 2 || this.M == 6);
        f2.g.h(null, this.f32981q.isEmpty());
        if (!this.f32989y) {
            w();
            return;
        }
        if (this.f32990z) {
            v("Ignored since configAndClose is processing", null);
            return;
        }
        if (!this.f32983s.f33314b) {
            this.f32989y = false;
            w();
            v("Ignore configAndClose and finish the close flow directly since camera is unavailable.", null);
        } else {
            v("Open camera to configAndClose", null);
            j1.k kVarW = i0.o.w(new s(this, 1));
            this.f32990z = true;
            kVarW.f26173c.a(new t(this, 1), this.f32969d);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f32974j.f33002a);
    }

    public final CameraDevice.StateCallback u() {
        ArrayList arrayList = new ArrayList(this.f32967b.A().b().f19585c);
        arrayList.add((b1) this.C.f31951f);
        arrayList.add(this.i);
        return hl.l.h(arrayList);
    }

    public final void v(String str, Throwable th2) {
        com.google.android.gms.internal.auth.g.f("Camera2CameraImpl", z.e("{", toString(), "} ", str), th2);
    }

    public final void w() {
        f2.g.h(null, this.M == 2 || this.M == 6);
        f2.g.h(null, this.f32981q.isEmpty());
        this.f32975k = null;
        if (this.M == 6) {
            F(3);
            return;
        }
        this.f32968c.f33976a.I(this.f32983s);
        F(1);
        j1.h hVar = this.f32980p;
        if (hVar != null) {
            hVar.b(null);
            this.f32980p = null;
        }
    }
}

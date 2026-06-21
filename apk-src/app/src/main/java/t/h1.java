package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f33065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h2 f33066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h2 f33067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g0.h2 f33068f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j1.k f33072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j1.h f33073l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ac.c f33077p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k6.t0 f33078q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x.a f33079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f33080s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33063a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f33064b = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f33069g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f33070h = Collections.EMPTY_LIST;
    public int i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f33071j = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashMap f33074m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fd.b f33075n = new fd.b(9);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fd.b f33076o = new fd.b(10);

    public h1(k6.t0 t0Var, g0.a2 a2Var, boolean z5) {
        p(3);
        this.f33078q = t0Var;
        this.f33065c = new g1(this);
        this.f33077p = new ac.c(a2Var.h(CaptureNoResponseQuirk.class));
        this.f33079r = new x.a(a2Var, 2);
        this.f33080s = z5;
    }

    public static e0 c(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback e0Var;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g0.p pVar = (g0.p) it.next();
            if (pVar == null) {
                e0Var = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                k3.f.G(pVar, arrayList2);
                e0Var = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new e0(arrayList2);
            }
            arrayList.add(e0Var);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new e0(arrayList);
    }

    public static HashMap d(HashMap map, HashMap map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) map.get(num)).iterator();
            if (it.hasNext()) {
                SurfaceUtil.a((Surface) map2.get(((g0.l) it.next()).f19641a));
                e1.b();
                throw null;
            }
            com.google.android.gms.internal.auth.g.k("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: 0, streamInfos size: " + arrayList.size());
        }
        return map3;
    }

    public static ArrayList g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v.h hVar = (v.h) it.next();
            if (!arrayList2.contains(hVar.f34619a.e())) {
                arrayList2.add(hVar.f34619a.e());
                arrayList3.add(hVar);
            }
        }
        return arrayList3;
    }

    public static HashMap h(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g0.l lVar = (g0.l) it.next();
            int i = lVar.f19644d;
            if (i > 0 && lVar.f19642b.isEmpty()) {
                List arrayList2 = (List) map.get(Integer.valueOf(i));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(i), arrayList2);
                }
                arrayList2.add(lVar);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    public final int a(ArrayList arrayList, m mVar) {
        m mVar2 = new m(1);
        Iterator it = arrayList.iterator();
        int iQ = -1;
        while (it.hasNext()) {
            CaptureRequest captureRequest = (CaptureRequest) it.next();
            h2 h2Var = this.f33067e;
            Objects.requireNonNull(h2Var);
            k6.t0 t0Var = h2Var.f33087g;
            t0Var.getClass();
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) ((r3.b) t0Var.f27180c).f32188c;
            List<CaptureRequest> listCreateHighSpeedRequestList = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(captureRequest) : Collections.EMPTY_LIST;
            Iterator<CaptureRequest> it2 = listCreateHighSpeedRequestList.iterator();
            while (it2.hasNext()) {
                mVar2.a(it2.next(), Collections.singletonList(new z1(captureRequest, mVar)));
            }
            h2 h2Var2 = this.f33067e;
            CameraCaptureSession.CaptureCallback captureCallbackC = h2Var2.f33100u.c(mVar2);
            f2.g.g(h2Var2.f33087g, "Need to call openCaptureSession before using this API.");
            iQ = ((r3.b) h2Var2.f33087g.f27180c).q(listCreateHighSpeedRequestList, h2Var2.f33084d, captureCallbackC);
        }
        return iQ;
    }

    public final void b() {
        synchronized (this.f33063a) {
            try {
                int iM = z.m(this.f33071j);
                if (iM == 0) {
                    throw new IllegalStateException("close() should not be possible in state: ".concat(z.o(this.f33071j)));
                }
                if (iM == 2) {
                    p(2);
                } else if (iM == 3) {
                    f2.g.g(this.f33066d, "The Opener shouldn't null in state:".concat(z.o(this.f33071j)));
                    this.f33066d.p();
                    p(2);
                } else if (iM == 6 || iM == 7) {
                    f2.g.g(this.f33066d, "The Opener shouldn't null in state:".concat(z.o(this.f33071j)));
                    this.f33066d.p();
                    p(6);
                    this.f33077p.s();
                    this.f33068f = null;
                }
            } finally {
            }
        }
    }

    public final void e() {
        if (this.f33071j == 2) {
            com.google.android.gms.internal.auth.g.e("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        p(2);
        this.f33067e = null;
        j1.h hVar = this.f33073l;
        if (hVar != null) {
            hVar.b(null);
            this.f33073l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v.h f(g0.l r6, java.util.HashMap r7, java.lang.String r8) {
        /*
            r5 = this;
            g0.a1 r0 = r6.f19641a
            java.util.List r1 = r6.f19642b
            java.lang.Object r0 = r7.get(r0)
            android.view.Surface r0 = (android.view.Surface) r0
            java.lang.String r2 = "Surface in OutputConfig not found in configuredSurfaceMap."
            f2.g.g(r0, r2)
            v.h r3 = new v.h
            int r4 = r6.f19644d
            r3.<init>(r4, r0)
            v.j r0 = r3.f34619a
            if (r8 == 0) goto L1e
            r0.i(r8)
            goto L22
        L1e:
            r8 = 0
            r0.i(r8)
        L22:
            int r8 = r6.f19643c
            r4 = 1
            if (r8 != 0) goto L2b
            r0.h(r4)
            goto L31
        L2b:
            if (r8 != r4) goto L31
            r8 = 2
            r0.h(r8)
        L31:
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L57
            r0.b()
            java.util.Iterator r8 = r1.iterator()
        L3e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r8.next()
            g0.a1 r1 = (g0.a1) r1
            java.lang.Object r1 = r7.get(r1)
            android.view.Surface r1 = (android.view.Surface) r1
            f2.g.g(r1, r2)
            r0.a(r1)
            goto L3e
        L57:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 33
            if (r7 < r8) goto L96
            k6.t0 r1 = r5.f33078q
            r1.getClass()
            if (r7 < r8) goto L65
            goto L66
        L65:
            r4 = 0
        L66:
            java.lang.String r7 = "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher."
            f2.g.h(r7, r4)
            java.lang.Object r7 = r1.f27180c
            v.b r7 = (v.b) r7
            android.hardware.camera2.params.DynamicRangeProfiles r7 = r7.b()
            if (r7 == 0) goto L96
            a0.i0 r6 = r6.f19645e
            java.lang.Long r7 = v.a.a(r6, r7)
            if (r7 != 0) goto L91
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CaptureSession"
            com.google.android.gms.internal.auth.g.k(r7, r6)
            goto L96
        L91:
            long r6 = r7.longValue()
            goto L98
        L96:
            r6 = 1
        L98:
            r0.g(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t.h1.f(g0.l, java.util.HashMap, java.lang.String):v.h");
    }

    public final boolean i() {
        boolean z5;
        synchronized (this.f33063a) {
            int i = this.f33071j;
            z5 = i == 8 || i == 7;
        }
        return z5;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j(ArrayList arrayList) {
        m mVar;
        ArrayList arrayList2;
        boolean z5;
        g0.v vVar;
        synchronized (this.f33063a) {
            try {
                if (this.f33071j != 8) {
                    com.google.android.gms.internal.auth.g.e("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    mVar = new m(1);
                    arrayList2 = new ArrayList();
                    com.google.android.gms.internal.auth.g.e("CaptureSession", "Issuing capture request.");
                    Iterator it = arrayList.iterator();
                    z5 = false;
                    while (it.hasNext()) {
                        g0.s0 s0Var = (g0.s0) it.next();
                        if (Collections.unmodifiableList(s0Var.f19745a).isEmpty()) {
                            com.google.android.gms.internal.auth.g.e("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator it2 = Collections.unmodifiableList(s0Var.f19745a).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    g0.a1 a1Var = (g0.a1) it2.next();
                                    if (!this.f33069g.containsKey(a1Var)) {
                                        com.google.android.gms.internal.auth.g.e("CaptureSession", "Skipping capture request with invalid surface: " + a1Var);
                                        break;
                                    }
                                } else {
                                    if (s0Var.f19747c == 2) {
                                        z5 = true;
                                    }
                                    g0.r0 r0Var = new g0.r0(s0Var);
                                    if (s0Var.f19747c == 5 && (vVar = s0Var.f19752h) != null) {
                                        r0Var.f19733h = vVar;
                                    }
                                    g0.h2 h2Var = this.f33068f;
                                    if (h2Var != null) {
                                        r0Var.c(h2Var.f19589g.f19746b);
                                    }
                                    r0Var.c(s0Var.f19746b);
                                    g0.s0 s0VarE = r0Var.e();
                                    h2 h2Var2 = this.f33067e;
                                    h2Var2.f33087g.getClass();
                                    CaptureRequest captureRequestF = hl.d.f(s0VarE, ((CameraCaptureSession) ((r3.b) h2Var2.f33087g.f27180c).f32188c).getDevice(), this.f33069g, false, this.f33079r);
                                    if (captureRequestF == null) {
                                        com.google.android.gms.internal.auth.g.e("CaptureSession", "Skipping issuing request without surface.");
                                        return;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = s0Var.f19749e.iterator();
                                    while (it3.hasNext()) {
                                        k3.f.G((g0.p) it3.next(), arrayList3);
                                    }
                                    mVar.a(captureRequestF, arrayList3);
                                    arrayList2.add(captureRequestF);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e3) {
                    com.google.android.gms.internal.auth.g.k("CaptureSession", "Unable to access camera: " + e3.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList2.isEmpty()) {
                    com.google.android.gms.internal.auth.g.e("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return;
                }
                if (this.f33075n.d(arrayList2, z5)) {
                    h2 h2Var3 = this.f33067e;
                    f2.g.g(h2Var3.f33087g, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((r3.b) h2Var3.f33087g.f27180c).f32188c).stopRepeating();
                    mVar.f33152c = new f1(this);
                }
                if (this.f33076o.b(arrayList2, z5)) {
                    mVar.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new e0(this)));
                }
                g0.h2 h2Var4 = this.f33068f;
                if (h2Var4 != null && h2Var4.f19590h == 1) {
                    a(arrayList2, mVar);
                    return;
                }
                h2 h2Var5 = this.f33067e;
                CameraCaptureSession.CaptureCallback captureCallbackC = h2Var5.f33100u.c(mVar);
                f2.g.g(h2Var5.f33087g, "Need to call openCaptureSession before using this API.");
                ((r3.b) h2Var5.f33087g.f27180c).q(arrayList2, h2Var5.f33084d, captureCallbackC);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(List list) {
        synchronized (this.f33063a) {
            try {
                switch (z.m(this.f33071j)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: ".concat(z.o(this.f33071j)));
                    case 1:
                    case 4:
                    case 5:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    case 2:
                    case 3:
                    case 6:
                        this.f33064b.addAll(list);
                        break;
                    case 7:
                        this.f33064b.addAll(list);
                        this.f33077p.e().a(new a0(3, this), hl.d.j());
                        break;
                }
            } finally {
            }
        }
    }

    public final void l(g0.h2 h2Var) {
        synchronized (this.f33063a) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            if (h2Var == null) {
                com.google.android.gms.internal.auth.g.e("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return;
            }
            if (this.f33071j != 8) {
                com.google.android.gms.internal.auth.g.e("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return;
            }
            g0.s0 s0Var = h2Var.f19589g;
            if (Collections.unmodifiableList(s0Var.f19745a).isEmpty()) {
                com.google.android.gms.internal.auth.g.e("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    h2 h2Var2 = this.f33067e;
                    f2.g.g(h2Var2.f33087g, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((r3.b) h2Var2.f33087g.f27180c).f32188c).stopRepeating();
                } catch (CameraAccessException e3) {
                    com.google.android.gms.internal.auth.g.k("CaptureSession", "Unable to access camera: " + e3.getMessage());
                    Thread.dumpStack();
                }
                return;
            }
            try {
                com.google.android.gms.internal.auth.g.e("CaptureSession", "Issuing request for session.");
                h2 h2Var3 = this.f33067e;
                h2Var3.f33087g.getClass();
                CaptureRequest captureRequestF = hl.d.f(s0Var, ((CameraCaptureSession) ((r3.b) h2Var3.f33087g.f27180c).f32188c).getDevice(), this.f33069g, true, this.f33079r);
                if (captureRequestF == null) {
                    com.google.android.gms.internal.auth.g.e("CaptureSession", "Skipping issuing empty request for session.");
                    return;
                }
                CameraCaptureSession.CaptureCallback captureCallbackC = this.f33077p.c(c(s0Var.f19749e, new CameraCaptureSession.CaptureCallback[0]));
                if (h2Var.f19590h != 1) {
                    this.f33067e.n(captureRequestF, captureCallbackC);
                    return;
                }
                k6.t0 t0Var = this.f33067e.f33087g;
                t0Var.getClass();
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) ((r3.b) t0Var.f27180c).f32188c;
                List<CaptureRequest> listCreateHighSpeedRequestList = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(captureRequestF) : Collections.EMPTY_LIST;
                h2 h2Var4 = this.f33067e;
                f2.g.g(h2Var4.f33087g, "Need to call openCaptureSession before using this API.");
                ((r3.b) h2Var4.f33087g.f27180c).G(listCreateHighSpeedRequestList, h2Var4.f33084d, captureCallbackC);
                return;
            } catch (CameraAccessException e7) {
                com.google.android.gms.internal.auth.g.k("CaptureSession", "Unable to access camera: " + e7.getMessage());
                Thread.dumpStack();
                return;
            }
            throw th2;
        }
    }

    public final ed.d m(g0.h2 h2Var, CameraDevice cameraDevice, h2 h2Var2) {
        ed.d dVarO;
        synchronized (this.f33063a) {
            try {
                if (z.m(this.f33071j) != 2) {
                    com.google.android.gms.internal.auth.g.k("CaptureSession", "Open not allowed in state: ".concat(z.o(this.f33071j)));
                    return new k0.l(1, new IllegalStateException("open() should not allow the state: ".concat(z.o(this.f33071j))));
                }
                p(4);
                ArrayList arrayList = new ArrayList(h2Var.b());
                this.f33070h = arrayList;
                this.f33066d = h2Var2;
                synchronized (h2Var2.f33095p) {
                    h2Var2.f33096q = arrayList;
                    dVarO = h2Var2.o(arrayList);
                }
                k0.b bVarJ = k0.j.j(k0.d.b(dVarO), new com.google.firebase.messaging.o(this, h2Var, cameraDevice, 14), this.f33066d.f33084d);
                k0.j.a(bVarJ, new m7.a(17, this), this.f33066d.f33084d);
                return k0.j.f(bVarJ);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0009, B:6:0x0011, B:24:0x006e, B:8:0x0015, B:10:0x0019, B:13:0x001f, B:15:0x003f, B:16:0x0043, B:18:0x0047, B:19:0x0052, B:20:0x0054, B:22:0x0056, B:23:0x006a, B:27:0x0072, B:28:0x0081), top: B:31:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0009, B:6:0x0011, B:24:0x006e, B:8:0x0015, B:10:0x0019, B:13:0x001f, B:15:0x003f, B:16:0x0043, B:18:0x0047, B:19:0x0052, B:20:0x0054, B:22:0x0056, B:23:0x006a, B:27:0x0072, B:28:0x0081), top: B:31:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ed.d n() {
        /*
            r5 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.Object r3 = r5.f33063a
            monitor-enter(r3)
            int r4 = r5.f33071j     // Catch: java.lang.Throwable -> L1d
            int r4 = t.z.m(r4)     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L72
            switch(r4) {
                case 2: goto L6a;
                case 3: goto L56;
                case 4: goto L43;
                case 5: goto L15;
                case 6: goto L1f;
                case 7: goto L15;
                default: goto L14;
            }     // Catch: java.lang.Throwable -> L1d
        L14:
            goto L6e
        L15:
            t.h2 r0 = r5.f33067e     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            r0.i()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r0 = move-exception
            goto L82
        L1f:
            r0 = 5
            r5.p(r0)     // Catch: java.lang.Throwable -> L1d
            ac.c r0 = r5.f33077p     // Catch: java.lang.Throwable -> L1d
            r0.s()     // Catch: java.lang.Throwable -> L1d
            t.h2 r0 = r5.f33066d     // Catch: java.lang.Throwable -> L1d
            int r1 = r5.f33071j     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = t.z.o(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L1d
            f2.g.g(r0, r1)     // Catch: java.lang.Throwable -> L1d
            t.h2 r0 = r5.f33066d     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.p()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L43
            r5.e()     // Catch: java.lang.Throwable -> L1d
            goto L6e
        L43:
            j1.k r0 = r5.f33072k     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L52
            t.f1 r0 = new t.f1     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L1d
            j1.k r0 = i0.o.w(r0)     // Catch: java.lang.Throwable -> L1d
            r5.f33072k = r0     // Catch: java.lang.Throwable -> L1d
        L52:
            j1.k r0 = r5.f33072k     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            return r0
        L56:
            t.h2 r0 = r5.f33066d     // Catch: java.lang.Throwable -> L1d
            int r2 = r5.f33071j     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = t.z.o(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L1d
            f2.g.g(r0, r1)     // Catch: java.lang.Throwable -> L1d
            t.h2 r0 = r5.f33066d     // Catch: java.lang.Throwable -> L1d
            r0.p()     // Catch: java.lang.Throwable -> L1d
        L6a:
            r0 = 2
            r5.p(r0)     // Catch: java.lang.Throwable -> L1d
        L6e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            k0.l r0 = k0.l.f26777d
            return r0
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1d
            int r2 = r5.f33071j     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = t.z.o(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1     // Catch: java.lang.Throwable -> L1d
        L82:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.h1.n():ed.d");
    }

    public final void o(g0.h2 h2Var) {
        synchronized (this.f33063a) {
            try {
                switch (z.m(this.f33071j)) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: ".concat(z.o(this.f33071j)));
                    case 1:
                    case 4:
                    case 5:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case 2:
                    case 3:
                    case 6:
                        this.f33068f = h2Var;
                        break;
                    case 7:
                        this.f33068f = h2Var;
                        if (h2Var == null) {
                            return;
                        }
                        if (!this.f33069g.keySet().containsAll(h2Var.b())) {
                            com.google.android.gms.internal.auth.g.k("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            com.google.android.gms.internal.auth.g.e("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            l(this.f33068f);
                        }
                        break;
                }
            } finally {
            }
        }
    }

    public final void p(int i) {
        if (z.m(i) > z.m(this.i)) {
            this.i = i;
        }
        this.f33071j = i;
        if (!com.google.android.gms.internal.auth.g.w() || z.m(this.i) < 3) {
            return;
        }
        com.google.android.gms.internal.auth.g.E(z.m(i), "CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]");
    }
}

package g0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f19730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f19731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f19732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f19733h;

    public r0(t.o oVar, u.i iVar, a2 a2Var, j0.i iVar2, j0.d dVar) {
        this.f19728c = 1;
        this.f19729d = oVar;
        Integer num = (Integer) iVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f19727b = num != null && num.intValue() == 2;
        this.f19732g = iVar2;
        this.f19733h = dVar;
        this.f19731f = a2Var;
        this.f19730e = new fd.b(a2Var, 11);
        this.f19726a = com.google.android.gms.internal.auth.g.x(new s3.q(3, iVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean h(android.hardware.camera2.TotalCaptureResult r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.r0.h(android.hardware.camera2.TotalCaptureResult, boolean):boolean");
    }

    public static boolean i(int i, TotalCaptureResult totalCaptureResult) {
        com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i);
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            com.google.android.gms.internal.auth.g.e("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
            return num != null && num.intValue() == 4;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((p) it.next());
        }
    }

    public void b(p pVar) {
        ArrayList arrayList = (ArrayList) this.f19731f;
        if (arrayList.contains(pVar)) {
            return;
        }
        arrayList.add(pVar);
    }

    public void c(v0 v0Var) {
        for (g gVar : v0Var.d()) {
            ((q1) this.f19730e).g(gVar, null);
            ((q1) this.f19730e).x(gVar, v0Var.c(gVar), v0Var.a(gVar));
        }
    }

    public void d(a1 a1Var) {
        ((HashSet) this.f19729d).add(a1Var);
    }

    public s0 e() {
        ArrayList arrayList = new ArrayList((HashSet) this.f19729d);
        u1 u1VarU = u1.u((q1) this.f19730e);
        int i = this.f19728c;
        boolean z5 = this.f19726a;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f19731f);
        boolean z10 = this.f19727b;
        r1 r1Var = (r1) this.f19732g;
        r2 r2Var = r2.f19734b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : r1Var.f19735a.keySet()) {
            arrayMap.put(str, r1Var.f19735a.get(str));
        }
        return new s0(arrayList, u1VarU, i, z5, arrayList2, z10, new r2(arrayMap), (v) this.f19733h);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t.m0 f(int r11, int r12, int r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f19729d
            r2 = r0
            t.o r2 = (t.o) r2
            x.a r7 = new x.a
            java.lang.Object r0 = r10.f19731f
            g0.a2 r0 = (g0.a2) r0
            r1 = 1
            r7.<init>(r0, r1)
            t.m0 r1 = new t.m0
            r5 = r2
            int r2 = r10.f19728c
            java.lang.Object r3 = r10.f19732g
            j0.i r3 = (j0.i) r3
            java.lang.Object r4 = r10.f19733h
            j0.d r4 = (j0.d) r4
            boolean r6 = r10.f19727b
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8 = r1
            java.util.ArrayList r9 = r8.f33162h
            if (r11 != 0) goto L2e
            t.i0 r1 = new t.i0
            r1.<init>(r5)
            r9.add(r1)
        L2e:
            r1 = 3
            if (r12 != r1) goto L4a
            t.q0 r1 = new t.q0
            java.lang.Object r2 = r10.f19732g
            j0.i r2 = (j0.i) r2
            java.lang.Object r3 = r10.f19733h
            j0.d r3 = (j0.d) r3
            m4.d r4 = new m4.d
            r6 = 22
            r4.<init>(r0, r6)
            r1.<init>(r5, r2, r3, r4)
            r9.add(r1)
        L48:
            r3 = r12
            goto La1
        L4a:
            boolean r0 = r10.f19726a
            if (r0 == 0) goto L48
            java.lang.Object r0 = r10.f19730e
            fd.b r0 = (fd.b) r0
            boolean r0 = r0.f16748a
            r2 = 1
            if (r0 != 0) goto L67
            int r3 = r10.f19728c
            if (r3 == r1) goto L67
            if (r13 != r2) goto L5e
            goto L67
        L5e:
            t.h0 r0 = new t.h0
            r0.<init>(r5, r12, r7)
            r9.add(r0)
            goto L48
        L67:
            if (r0 != 0) goto L8b
            r3.b r0 = r5.f33185p
            java.lang.Object r0 = r0.f32189d
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.get()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "isInVideoUsage: mVideoUsageControl value = "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Camera2CameraControlImp"
            com.google.android.gms.internal.auth.g.e(r3, r1)
            if (r0 <= 0) goto L89
            goto L8b
        L89:
            r6 = r2
            goto L8d
        L8b:
            r2 = 0
            goto L89
        L8d:
            t.s0 r1 = new t.s0
            java.lang.Object r0 = r10.f19732g
            r4 = r0
            j0.i r4 = (j0.i) r4
            java.lang.Object r0 = r10.f19733h
            j0.d r0 = (j0.d) r0
            r3 = r12
            r2 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r9.add(r1)
        La1:
            java.lang.String r12 = ", flashMode = "
            java.lang.String r0 = ", flashType = "
            java.lang.String r1 = "createPipeline: captureMode = "
            java.lang.StringBuilder r11 = t.z.i(r1, r11, r12, r3, r0)
            r11.append(r13)
            java.lang.String r12 = ", pipeline tasks = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "Camera2CapturePipeline"
            com.google.android.gms.internal.auth.g.e(r12, r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.r0.f(int, int, int):t.m0");
    }

    public Range g() {
        return (Range) ((q1) this.f19730e).g(s0.f19744k, n.f19676h);
    }

    public r0() {
        this.f19729d = new HashSet();
        this.f19730e = q1.v();
        this.f19728c = -1;
        this.f19726a = false;
        this.f19731f = new ArrayList();
        this.f19727b = false;
        this.f19732g = r1.a();
    }

    public r0(s0 s0Var) {
        HashSet hashSet = new HashSet();
        this.f19729d = hashSet;
        this.f19730e = q1.v();
        this.f19728c = -1;
        this.f19726a = false;
        ArrayList arrayList = new ArrayList();
        this.f19731f = arrayList;
        this.f19727b = false;
        this.f19732g = r1.a();
        hashSet.addAll(s0Var.f19745a);
        this.f19730e = q1.w(s0Var.f19746b);
        this.f19728c = s0Var.f19747c;
        arrayList.addAll(s0Var.f19749e);
        this.f19727b = s0Var.f19750f;
        r2 r2Var = s0Var.f19751g;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : r2Var.f19735a.keySet()) {
            arrayMap.put(str, r2Var.f19735a.get(str));
        }
        this.f19732g = new r1(arrayMap);
        this.f19726a = s0Var.f19748d;
    }
}

package t;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import g0.r2;
import g0.x2;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f33051a = new g0();

    public void a(x2 x2Var, g0.r0 r0Var) {
        g0.s0 s0Var = (g0.s0) x2Var.g(x2.f19798t, null);
        g0.u1 u1Var = g0.u1.N;
        g0.g gVar = g0.s0.i;
        HashSet hashSet = new HashSet();
        g0.q1 q1VarV = g0.q1.v();
        ArrayList arrayList = new ArrayList();
        g0.r1 r1VarA = g0.r1.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        g0.u1 u1VarU = g0.u1.u(q1VarV);
        ArrayList arrayList3 = new ArrayList(arrayList);
        r2 r2Var = r2.f19734b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = r1VarA.f19735a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i = -1;
        new g0.s0(arrayList2, u1VarU, -1, false, arrayList3, false, new r2(arrayMap), null);
        if (s0Var != null) {
            i = s0Var.f19747c;
            r0Var.a(s0Var.f19749e);
            u1Var = s0Var.f19746b;
        }
        r0Var.f19730e = g0.q1.w(u1Var);
        r0Var.f19728c = ((Integer) x2Var.g(s.b.M, Integer.valueOf(i))).intValue();
        r0Var.b(new d1((CameraCaptureSession.CaptureCallback) x2Var.g(s.b.Q, new f0())));
        r0Var.c(a0.c0.d(x2Var).c());
    }
}

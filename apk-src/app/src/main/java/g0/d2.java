package g0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends c2 {
    public static d2 d(x2 x2Var, Size size) {
        if (((t.x0) x2Var.g(x2.f19799u, null)) == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + ((String) x2Var.g(l0.k.I, x2Var.toString())));
        }
        d2 d2Var = new d2();
        h2 h2Var = (h2) x2Var.g(x2.f19797s, null);
        u1 u1Var = u1.N;
        int i = h2.a().f19589g.f19747c;
        if (h2Var != null) {
            i = h2Var.f19589g.f19747c;
            for (CameraDevice.StateCallback stateCallback : h2Var.f19585c) {
                ArrayList arrayList = d2Var.f19528c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : h2Var.f19586d) {
                ArrayList arrayList2 = d2Var.f19529d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            d2Var.f19527b.a(h2Var.f19589g.f19749e);
            u1Var = h2Var.f19589g.f19746b;
        }
        r0 r0Var = d2Var.f19527b;
        r0Var.getClass();
        r0Var.f19730e = q1.w(u1Var);
        if (x2Var instanceof v1) {
            Rational rational = x.b.f35495a;
            if (((PreviewPixelHDRnetQuirk) w.a.f34941a.i(PreviewPixelHDRnetQuirk.class)) != null && !x.b.f35495a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                q1 q1VarV = q1.v();
                q1VarV.y(s.b.u(CaptureRequest.TONEMAP_MODE), 2);
                d2Var.f19527b.c(new s.b(u1.u(q1VarV)));
            }
        }
        d2Var.f19527b.f19728c = ((Integer) x2Var.g(s.b.M, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) x2Var.g(s.b.O, new t.c1());
        ArrayList arrayList3 = d2Var.f19528c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) x2Var.g(s.b.P, new t.a1());
        ArrayList arrayList4 = d2Var.f19529d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        t.d1 d1Var = new t.d1((CameraCaptureSession.CaptureCallback) x2Var.g(s.b.Q, new t.f0()));
        d2Var.f19527b.b(d1Var);
        ArrayList arrayList5 = d2Var.f19530e;
        if (!arrayList5.contains(d1Var)) {
            arrayList5.add(d1Var);
        }
        int iO = x2Var.o();
        if (iO != 0) {
            r0 r0Var2 = d2Var.f19527b;
            r0Var2.getClass();
            if (iO != 0) {
                ((q1) r0Var2.f19730e).y(x2.E, Integer.valueOf(iO));
            }
        }
        int iQ = x2Var.q();
        if (iQ != 0) {
            r0 r0Var3 = d2Var.f19527b;
            r0Var3.getClass();
            if (iQ != 0) {
                ((q1) r0Var3.f19730e).y(x2.D, Integer.valueOf(iQ));
            }
        }
        q1 q1VarV2 = q1.v();
        g gVar = s.b.R;
        q1VarV2.y(gVar, (String) x2Var.g(gVar, null));
        g gVar2 = s.b.N;
        Long l10 = (Long) x2Var.g(gVar2, -1L);
        l10.getClass();
        q1VarV2.y(gVar2, l10);
        d2Var.f19527b.c(q1VarV2);
        d2Var.f19527b.c(a0.c0.d(x2Var).c());
        return d2Var;
    }

    public final void a(v0 v0Var) {
        this.f19527b.c(v0Var);
    }

    public final void b(a1 a1Var, a0.i0 i0Var, int i) {
        a1.m mVarA = l.a(a1Var);
        if (i0Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        mVarA.f366f = i0Var;
        mVarA.f362b = Integer.valueOf(i);
        this.f19526a.add(mVarA.b());
        this.f19527b.d(a1Var);
    }

    public final h2 c() {
        return new h2(new ArrayList(this.f19526a), new ArrayList(this.f19528c), new ArrayList(this.f19529d), new ArrayList(this.f19530e), this.f19527b.e(), this.f19531f, this.f19532g, this.f19533h, this.i);
    }
}

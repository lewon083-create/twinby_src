package t;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import g0.r2;
import io.appmetrica.analytics.impl.lp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33303a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f33305c;

    public v(Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f33305c = executor;
        this.f33304b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f33303a) {
            case 0:
                ((c0) this.f33305c).v("openCameraConfigAndClose camera closed", null);
                ((j1.h) this.f33304b).b(null);
                break;
            default:
                ((Executor) this.f33305c).execute(new u.j(this, cameraDevice, 0));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f33303a) {
            case 0:
                ((c0) this.f33305c).v("openCameraConfigAndClose camera disconnected", null);
                ((j1.h) this.f33304b).b(null);
                break;
            default:
                ((Executor) this.f33305c).execute(new u.j(this, cameraDevice, 1));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.f33303a) {
            case 0:
                ((c0) this.f33305c).v("openCameraConfigAndClose camera error " + i, null);
                ((j1.h) this.f33304b).b(null);
                break;
            default:
                ((Executor) this.f33305c).execute(new d.l(this, cameraDevice, i, 10));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        int i = this.f33303a;
        Object obj = this.f33305c;
        switch (i) {
            case 0:
                c0 c0Var = (c0) obj;
                j0.i iVar = c0Var.f32969d;
                c0Var.v("openCameraConfigAndClose camera opened", null);
                h1 h1Var = new h1(c0Var.J, new g0.a2(Collections.EMPTY_LIST), false);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                a0.l2 l2Var = new a0.l2(surface);
                k0.j.f(l2Var.f19513e).a(new m3.c0(28, surface, surfaceTexture), hl.d.j());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                g0.q1 q1VarV = g0.q1.v();
                ArrayList arrayList = new ArrayList();
                g0.r1 r1VarA = g0.r1.a();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                a1.m mVarA = g0.l.a(l2Var);
                mVarA.f366f = a0.i0.f112d;
                linkedHashSet.add(mVarA.b());
                c0Var.v("Start configAndClose.", null);
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                g0.u1 u1VarU = g0.u1.u(q1VarV);
                ArrayList arrayList10 = new ArrayList(arrayList);
                r2 r2Var = r2.f19734b;
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = r1VarA.f19735a;
                for (String str : arrayMap2.keySet()) {
                    arrayMap.put(str, arrayMap2.get(str));
                }
                g0.h2 h2Var = new g0.h2(arrayList5, arrayList6, arrayList7, arrayList8, new g0.s0(arrayList9, u1VarU, 1, false, arrayList10, false, new r2(arrayMap), null), null, null, 0, null);
                x1 x1Var = c0Var.D;
                k0.b bVarJ = k0.j.j(k0.d.b(i0.o.w(new k0.h(1, h1Var.m(h2Var, cameraDevice, new h2((g0.a2) x1Var.f33321f, (g0.a2) x1Var.f33322g, (q9.o) x1Var.f33320e, (j0.i) x1Var.f33317b, (j0.d) x1Var.f33318c, (Handler) x1Var.f33319d))))), new oi.i(13, h1Var, l2Var), iVar);
                Objects.requireNonNull(cameraDevice);
                bVarJ.a(new lp(29, cameraDevice), iVar);
                break;
            default:
                ((Executor) obj).execute(new u.j(this, cameraDevice, 2));
                break;
        }
    }

    public v(c0 c0Var, j1.h hVar) {
        this.f33305c = c0Var;
        this.f33304b = hVar;
    }
}

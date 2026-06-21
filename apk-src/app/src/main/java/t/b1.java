package t;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32956b;

    public b1(q9.o oVar) {
        this.f32955a = 1;
        this.f32956b = oVar;
    }

    public void a() {
        ArrayList<h2> arrayListM;
        synchronized (((q9.o) this.f32956b).f31947b) {
            arrayListM = ((q9.o) this.f32956b).m();
            ((LinkedHashSet) ((q9.o) this.f32956b).f31950e).clear();
            ((LinkedHashSet) ((q9.o) this.f32956b).f31948c).clear();
            ((LinkedHashSet) ((q9.o) this.f32956b).f31949d).clear();
        }
        for (h2 h2Var : arrayListM) {
            synchronized (h2Var.f33081a) {
                try {
                    List list = h2Var.f33090k;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((g0.a1) it.next()).b();
                        }
                        h2Var.f33090k = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            h2Var.f33100u.s();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((q9.o) this.f32956b).f31947b) {
            linkedHashSet.addAll((LinkedHashSet) ((q9.o) this.f32956b).f31950e);
            linkedHashSet.addAll((LinkedHashSet) ((q9.o) this.f32956b).f31948c);
        }
        ((j0.i) ((q9.o) this.f32956b).f31946a).execute(new a0(4, linkedHashSet));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f32955a) {
            case 0:
                Iterator it = ((ArrayList) this.f32956b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f32955a) {
            case 0:
                Iterator it = ((ArrayList) this.f32956b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.f32955a) {
            case 0:
                Iterator it = ((ArrayList) this.f32956b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((q9.o) this.f32956b).f31947b) {
                    linkedHashSet.addAll((LinkedHashSet) ((q9.o) this.f32956b).f31950e);
                    linkedHashSet.addAll((LinkedHashSet) ((q9.o) this.f32956b).f31948c);
                    break;
                }
                ((j0.i) ((q9.o) this.f32956b).f31946a).execute(new a1.q(linkedHashSet, i, 7));
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.f32955a) {
            case 0:
                Iterator it = ((ArrayList) this.f32956b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                break;
        }
    }

    public b1(ArrayList arrayList) {
        this.f32955a = 0;
        this.f32956b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof c1)) {
                ((ArrayList) this.f32956b).add(stateCallback);
            }
        }
    }

    private final void c(CameraDevice cameraDevice) {
    }
}

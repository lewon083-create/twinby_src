package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class k extends ca.a {
    public void h(v.s sVar) throws a {
        CameraDevice cameraDevice = (CameraDevice) this.f2253b;
        cameraDevice.getClass();
        v.r rVar = sVar.f34637a;
        rVar.e().getClass();
        List listF = rVar.f();
        if (listF == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (rVar.getExecutor() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        String id2 = cameraDevice.getId();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            String strD = ((v.h) it.next()).f34619a.d();
            if (strD != null && !strD.isEmpty()) {
                com.google.android.gms.internal.auth.g.O("CameraDeviceCompat", z.f("Camera ", id2, ": Camera doesn't support physicalCameraId ", strD, ". Ignoring."));
            }
        }
        e eVar = new e(rVar.getExecutor(), rVar.e());
        List listF2 = rVar.f();
        m mVar = (m) this.f2254c;
        mVar.getClass();
        Handler handler = mVar.f33968a;
        v.g gVarC = rVar.c();
        try {
            if (gVarC != null) {
                InputConfiguration inputConfiguration = gVarC.f34618a.f34617a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, v.s.a(listF2), eVar, handler);
            } else {
                if (rVar.d() != 1) {
                    cameraDevice.createCaptureSessionByOutputConfigurations(v.s.a(listF2), eVar, handler);
                    return;
                }
                ArrayList arrayList = new ArrayList(listF2.size());
                Iterator it2 = listF2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((v.h) it2.next()).f34619a.e());
                }
                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, eVar, handler);
            }
        } catch (CameraAccessException e3) {
            throw new a(e3);
        }
    }
}

package u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3.b f33976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayMap f33977b = new ArrayMap(4);

    public p(r3.b bVar) {
        this.f33976a = bVar;
    }

    public static p a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        return new p(i >= 30 ? new s(context, null) : i >= 29 ? new r(context, null) : i >= 28 ? new q(context, null) : new r3.b(context, new t(handler)));
    }

    public final i b(String str) {
        i iVar;
        synchronized (this.f33977b) {
            iVar = (i) this.f33977b.get(str);
            if (iVar == null) {
                try {
                    i iVar2 = new i(this.f33976a.w(str), str);
                    this.f33977b.put(str, iVar2);
                    iVar = iVar2;
                } catch (AssertionError e3) {
                    throw new a(e3.getMessage(), e3);
                }
            }
        }
        return iVar;
    }

    public final String[] c() {
        r3.b bVar = this.f33976a;
        bVar.getClass();
        try {
            return ((CameraManager) bVar.f32188c).getCameraIdList();
        } catch (CameraAccessException e3) {
            throw new a(e3);
        }
    }
}

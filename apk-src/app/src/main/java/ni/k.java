package ni;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements ii.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f29419d;

    @Override // ii.u
    public final boolean b(int i, String[] strArr, int[] iArr) {
        oi.i iVar;
        switch (this.f29417b) {
            case 0:
                a0.y yVar = (a0.y) this.f29419d;
                if (this.f29418c || i != 9796) {
                    return false;
                }
                this.f29418c = true;
                if (iArr.length == 0 || iArr[0] != 0) {
                    yVar.d(new j("CameraAccessDenied", "Camera access permission was denied."));
                } else if (iArr.length <= 1 || iArr[1] == 0) {
                    yVar.d(null);
                } else {
                    yVar.d(new j("AudioAccessDenied", "Audio access permission was denied."));
                }
                return true;
            default:
                int i10 = 0;
                if (!this.f29418c || i != 240 || (iVar = (oi.i) this.f29419d) == null) {
                    return false;
                }
                this.f29418c = false;
                if (iArr.length > 0 && iArr[0] == 0) {
                    i10 = 1;
                }
                HashMap map = (HashMap) iVar.f30688c;
                sb.g gVar = (sb.g) iVar.f30689d;
                map.put("authorizationStatus", Integer.valueOf(i10));
                gVar.b(map);
                return true;
        }
    }

    public k(a0.y yVar) {
        this.f29417b = 0;
        this.f29418c = false;
        this.f29419d = yVar;
    }
}

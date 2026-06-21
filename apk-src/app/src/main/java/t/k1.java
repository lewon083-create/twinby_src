package t;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u.i f33138b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33137a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33139c = 0;

    public k1(u.i iVar) {
        this.f33138b = iVar;
    }

    public final Range a() {
        return (Range) this.f33138b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    public final boolean b() {
        Range range = (Range) this.f33138b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
    }
}

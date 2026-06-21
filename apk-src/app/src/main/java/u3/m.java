package u3;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34141b;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(int i, int i10, int i11, int i12, j3.o oVar, boolean z5, h hVar) {
        StringBuilder sbI = t.z.i("AudioTrack init failed 0 Config(", i, ", ", i10, ", ");
        om1.t(sbI, i11, ", ", i12, ") ");
        sbI.append(oVar);
        sbI.append(z5 ? " (recoverable)" : "");
        super(sbI.toString(), hVar);
        this.f34141b = z5;
    }
}

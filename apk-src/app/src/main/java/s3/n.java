package s3;

import yads.oe2;
import yads.of1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements m3.k, of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f32611c;

    public /* synthetic */ n(float f10, int i) {
        this.f32610b = i;
        this.f32611c = f10;
    }

    @Override // m3.k, yads.of1
    public final void invoke(Object obj) {
        switch (this.f32610b) {
            case 0:
                ((j3.h0) obj).onVolumeChanged(this.f32611c);
                break;
            default:
                ((oe2) obj).onVolumeChanged(this.f32611c);
                break;
        }
    }
}

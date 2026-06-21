package s3;

import yads.oe2;
import yads.of1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements m3.k, of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32618d;

    public /* synthetic */ o(int i, int i10, int i11) {
        this.f32616b = i11;
        this.f32617c = i;
        this.f32618d = i10;
    }

    @Override // m3.k, yads.of1
    public final void invoke(Object obj) {
        switch (this.f32616b) {
            case 0:
                ((j3.h0) obj).onSurfaceSizeChanged(this.f32617c, this.f32618d);
                break;
            default:
                ((oe2) obj).onSurfaceSizeChanged(this.f32617c, this.f32618d);
                break;
        }
    }
}

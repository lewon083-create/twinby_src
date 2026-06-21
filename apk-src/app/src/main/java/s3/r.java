package s3;

import java.util.List;
import yads.oe2;
import yads.of1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements m3.k, of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f32640c;

    public /* synthetic */ r(List list, int i) {
        this.f32639b = i;
        this.f32640c = list;
    }

    @Override // m3.k, yads.of1
    public final void invoke(Object obj) {
        switch (this.f32639b) {
            case 0:
                ((j3.h0) obj).onCues(this.f32640c);
                break;
            default:
                ((oe2) obj).onCues(this.f32640c);
                break;
        }
    }
}

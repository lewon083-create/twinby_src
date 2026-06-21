package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hx3 {
    public static void a(zv3 zv3Var) {
        if (!zv3Var.f45557f) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (zv3Var.f45558g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}

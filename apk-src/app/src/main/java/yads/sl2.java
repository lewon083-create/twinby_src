package yads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class sl2 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wq f42969b = new zl.g0(21);

    public static sl2 a(Bundle bundle) {
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        if (i == 0) {
            return (sl2) w01.f44243e.fromBundle(bundle);
        }
        if (i == 1) {
            return (sl2) gc2.f38701d.fromBundle(bundle);
        }
        if (i == 2) {
            return (sl2) n33.f41164e.fromBundle(bundle);
        }
        if (i == 3) {
            return (sl2) h63.f39045e.fromBundle(bundle);
        }
        throw new IllegalArgumentException(og2.a("Unknown RatingType: ", i));
    }
}

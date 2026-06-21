package yads;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w82 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f44308a;

    public w82(x82 x82Var) {
        this.f44308a = x82Var;
    }

    public final Bitmap a(String str) {
        return (Bitmap) this.f44308a.get(str);
    }

    public final void a(String str, Bitmap bitmap) {
        this.f44308a.put(str, bitmap);
    }
}

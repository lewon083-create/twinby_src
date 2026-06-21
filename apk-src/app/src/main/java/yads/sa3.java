package yads;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sa3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f42872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l31 f42873b;

    public sa3(x82 x82Var, l31 l31Var) {
        this.f42872a = x82Var;
        this.f42873b = l31Var;
    }

    public final Bitmap a(String str) {
        this.f42873b.getClass();
        return (Bitmap) this.f42872a.get(l31.a(str, ImageView.ScaleType.CENTER_INSIDE));
    }

    public final void a(String str, Bitmap bitmap) {
        this.f42873b.getClass();
        this.f42872a.put(l31.a(str, ImageView.ScaleType.CENTER_INSIDE), bitmap);
    }
}

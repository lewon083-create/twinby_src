package yads;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr f41546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f41547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f41548c;

    public /* synthetic */ oi2(Context context) {
        this(new xr(context, 0));
    }

    public final Bitmap a(w41 w41Var) {
        String str = w41Var.f44275c;
        Bitmap bitmap = (Bitmap) this.f41547b.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        sa3 sa3Var = y82.f44950d.a(this.f41546a.f44796a).f44954c;
        String str2 = w41Var.f44275c;
        Bitmap bitmapA = sa3Var.a(str2);
        if (bitmapA != null && bitmapA.getWidth() == 1 && bitmapA.getHeight() == 1) {
            bitmapA = Bitmap.createScaledBitmap(bitmapA, w41Var.f44273a, w41Var.f44274b, false);
            sa3Var.a(str2, bitmapA);
        }
        if (bitmapA == null) {
            return null;
        }
        this.f41547b.put(str, bitmapA);
        return bitmapA;
    }

    public oi2(xr xrVar) {
        this.f41546a = xrVar;
        this.f41547b = new LinkedHashMap();
        this.f41548c = new LinkedHashMap();
    }
}

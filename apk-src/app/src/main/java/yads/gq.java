package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gq implements eq {
    @Override // yads.eq
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        return Intrinsics.a(bitmap, ((BitmapDrawable) drawable).getBitmap());
    }
}

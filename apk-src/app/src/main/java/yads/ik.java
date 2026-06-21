package yads;

import android.content.Context;
import android.content.res.TypedArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ik {
    public static final int a(Context context, int i) {
        int color;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            color = typedArrayObtainStyledAttributes.getColor(0, 0);
        } catch (Exception unused) {
            color = -16777216;
        }
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}

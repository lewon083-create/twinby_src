package i8;

import android.app.ActivityManager;
import android.text.PrecomputedText;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ ActivityManager.TaskDescription f(int i, String str) {
        return new ActivityManager.TaskDescription(str, 0, i);
    }

    public static /* bridge */ /* synthetic */ boolean y(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}

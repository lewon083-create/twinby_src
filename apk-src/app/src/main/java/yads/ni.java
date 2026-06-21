package yads;

import android.media.AudioManager;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ni {
    public static void a(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z5) {
        if (!z5) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(int i, int i10) {
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object a(AudioManager audioManager) {
        if (audioManager != null) {
            return audioManager;
        }
        throw new IllegalStateException();
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }
}

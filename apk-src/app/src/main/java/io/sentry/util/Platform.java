package io.sentry.util;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Platform {
    static boolean isAndroid;
    static boolean isJavaNinePlus;

    static {
        try {
            isAndroid = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            isAndroid = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                isJavaNinePlus = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                isJavaNinePlus = false;
            }
        } catch (Throwable unused2) {
            isJavaNinePlus = false;
        }
    }

    public static boolean isAndroid() {
        return isAndroid;
    }

    public static boolean isJavaNinePlus() {
        return isJavaNinePlus;
    }

    public static boolean isJvm() {
        return !isAndroid;
    }
}

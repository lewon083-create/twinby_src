package io.sentry.android.core.anr;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AnrProfileRotationHelper {
    private static final String OLD_FILE_NAME = "anr_profile_old";
    private static final String RECORDING_FILE_NAME = "anr_profile";
    private static final AtomicBoolean shouldRotate = new AtomicBoolean(true);
    private static final Object rotationLock = new Object();

    public static boolean deleteLastFile(@NotNull File file) {
        File file2 = new File(file, OLD_FILE_NAME);
        if (file2.exists()) {
            return file2.delete();
        }
        return true;
    }

    @NotNull
    public static File getFileForRecording(@NotNull File file) {
        performRotationIfNeeded(file);
        return new File(file, RECORDING_FILE_NAME);
    }

    @NotNull
    public static File getLastFile(@NotNull File file) {
        performRotationIfNeeded(file);
        return new File(file, OLD_FILE_NAME);
    }

    private static void performRotationIfNeeded(@NotNull File file) {
        AtomicBoolean atomicBoolean = shouldRotate;
        if (atomicBoolean.get()) {
            synchronized (rotationLock) {
                try {
                    if (atomicBoolean.get()) {
                        File file2 = new File(file, RECORDING_FILE_NAME);
                        File file3 = new File(file, OLD_FILE_NAME);
                        try {
                            file3.delete();
                        } catch (Throwable unused) {
                        }
                        try {
                            file2.renameTo(file3);
                        } catch (Throwable unused2) {
                        }
                        shouldRotate.set(false);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void rotate() {
        shouldRotate.set(true);
    }
}

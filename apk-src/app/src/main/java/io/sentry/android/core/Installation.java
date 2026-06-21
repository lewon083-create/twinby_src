package io.sentry.android.core;

import android.content.Context;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryUUID;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class Installation {
    static final String INSTALLATION = "INSTALLATION";

    @Nullable
    static String deviceId;
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    @NotNull
    protected static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();

    private Installation() {
    }

    public static String id(@NotNull Context context) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
        try {
            if (deviceId == null) {
                File file = new File(context.getFilesDir(), INSTALLATION);
                try {
                    if (!file.exists()) {
                        String strWriteInstallationFile = writeInstallationFile(file);
                        deviceId = strWriteInstallationFile;
                        if (iSentryLifecycleTokenAcquire != null) {
                            iSentryLifecycleTokenAcquire.close();
                        }
                        return strWriteInstallationFile;
                    }
                    deviceId = readInstallationFile(file);
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            String str = deviceId;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return str;
        } catch (Throwable th3) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @NotNull
    public static String readInstallationFile(@NotNull File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, UTF_8);
            randomAccessFile.close();
            return str;
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NotNull
    public static String writeInstallationFile(@NotNull File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String strGenerateSentryId = SentryUUID.generateSentryId();
            fileOutputStream.write(strGenerateSentryId.getBytes(UTF_8));
            fileOutputStream.flush();
            fileOutputStream.close();
            return strGenerateSentryId;
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}

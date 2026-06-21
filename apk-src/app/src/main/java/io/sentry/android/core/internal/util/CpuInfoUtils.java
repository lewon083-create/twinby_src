package io.sentry.android.core.internal.util;

import io.sentry.ISentryLifecycleToken;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class CpuInfoUtils {

    @NotNull
    static final String CPUINFO_MAX_FREQ_PATH = "cpufreq/cpuinfo_max_freq";

    @NotNull
    private static final String SYSTEM_CPU_PATH = "/sys/devices/system/cpu";
    private static final CpuInfoUtils instance = new CpuInfoUtils();

    @NotNull
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    @NotNull
    private final List<Integer> cpuMaxFrequenciesMhz = new ArrayList();

    private CpuInfoUtils() {
    }

    public static CpuInfoUtils getInstance() {
        return instance;
    }

    public void clear() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.cpuMaxFrequenciesMhz.clear();
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @NotNull
    public String getSystemCpuPath() {
        return SYSTEM_CPU_PATH;
    }

    @NotNull
    public List<Integer> readMaxFrequencies() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.cpuMaxFrequenciesMhz.isEmpty()) {
                List<Integer> list = this.cpuMaxFrequenciesMhz;
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return list;
            }
            File[] fileArrListFiles = new File(getSystemCpuPath()).listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList = new ArrayList();
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return arrayList;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String text = FileUtils.readText(new File(file, CPUINFO_MAX_FREQ_PATH));
                        if (text != null) {
                            this.cpuMaxFrequenciesMhz.add(Integer.valueOf((int) (Long.parseLong(text.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            List<Integer> list2 = this.cpuMaxFrequenciesMhz;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return list2;
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void setCpuMaxFrequencies(List<Integer> list) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.cpuMaxFrequenciesMhz.clear();
            this.cpuMaxFrequenciesMhz.addAll(list);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}

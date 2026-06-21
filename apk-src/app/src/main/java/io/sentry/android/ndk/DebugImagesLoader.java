package io.sentry.android.ndk;

import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.IDebugImagesLoader;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.ndk.NativeModuleListLoader;
import io.sentry.protocol.DebugImage;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class DebugImagesLoader implements IDebugImagesLoader {

    @Nullable
    private static volatile List<DebugImage> debugImages;

    @NotNull
    protected static final AutoClosableReentrantLock debugImagesLock = new AutoClosableReentrantLock();

    @NotNull
    private final NativeModuleListLoader moduleListLoader;

    @NotNull
    private final SentryOptions options;

    public DebugImagesLoader(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull NativeModuleListLoader nativeModuleListLoader) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.moduleListLoader = (NativeModuleListLoader) Objects.requireNonNull(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }

    @NotNull
    private Set<DebugImage> filterImagesByAddresses(@NotNull List<DebugImage> list, @NotNull Set<String> set) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < list.size()) {
            DebugImage debugImage = list.get(i);
            i++;
            DebugImage debugImage2 = i < list.size() ? list.get(i) : null;
            String imageAddr = debugImage2 != null ? debugImage2.getImageAddr() : null;
            Iterator<String> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        long j10 = Long.parseLong(it.next().replace("0x", ""), 16);
                        String imageAddr2 = debugImage.getImageAddr();
                        if (imageAddr2 != null) {
                            long j11 = Long.parseLong(imageAddr2.replace("0x", ""), 16);
                            Long imageSize = debugImage.getImageSize();
                            long jLongValue = imageSize != null ? imageSize.longValue() + j11 : imageAddr != null ? Long.parseLong(imageAddr.replace("0x", ""), 16) : Long.MAX_VALUE;
                            if (j10 >= j11 && j10 < jLongValue) {
                                hashSet.add(debugImage);
                                break;
                            }
                        } else {
                            continue;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return hashSet;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public void clearDebugImages() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = debugImagesLock.acquire();
        try {
            try {
                this.moduleListLoader.clearModuleList();
                this.options.getLogger().log(SentryLevel.INFO, "Debug images cleared.", new Object[0]);
            } finally {
            }
            debugImages = null;
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
        }
    }

    @Nullable
    public List<DebugImage> getCachedDebugImages() {
        return debugImages;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    @Nullable
    public List<DebugImage> loadDebugImages() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = debugImagesLock.acquire();
        try {
            if (debugImages == null) {
                try {
                    io.sentry.ndk.DebugImage[] debugImageArrLoadModuleList = this.moduleListLoader.loadModuleList();
                    if (debugImageArrLoadModuleList != null) {
                        debugImages = new ArrayList(debugImageArrLoadModuleList.length);
                        for (io.sentry.ndk.DebugImage debugImage : debugImageArrLoadModuleList) {
                            DebugImage debugImage2 = new DebugImage();
                            debugImage2.setCodeFile(debugImage.getCodeFile());
                            debugImage2.setDebugFile(debugImage.getDebugFile());
                            debugImage2.setUuid(debugImage.getUuid());
                            debugImage2.setType(debugImage.getType());
                            debugImage2.setDebugId(debugImage.getDebugId());
                            debugImage2.setCodeId(debugImage.getCodeId());
                            debugImage2.setImageAddr(debugImage.getImageAddr());
                            debugImage2.setImageSize(debugImage.getImageSize());
                            debugImage2.setArch(debugImage.getArch());
                            debugImages.add(debugImage2);
                        }
                        this.options.getLogger().log(SentryLevel.DEBUG, "Debug images loaded: %d", Integer.valueOf(debugImages.size()));
                    }
                } catch (Throwable th2) {
                    this.options.getLogger().log(SentryLevel.ERROR, th2, "Failed to load debug images.", new Object[0]);
                }
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return debugImages;
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

    @Override // io.sentry.android.core.IDebugImagesLoader
    @Nullable
    public Set<DebugImage> loadDebugImagesForAddresses(@NotNull Set<String> set) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = debugImagesLock.acquire();
        try {
            List<DebugImage> listLoadDebugImages = loadDebugImages();
            if (listLoadDebugImages == null) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            if (set.isEmpty()) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            Set<DebugImage> setFilterImagesByAddresses = filterImagesByAddresses(listLoadDebugImages, set);
            if (!setFilterImagesByAddresses.isEmpty()) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return setFilterImagesByAddresses;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "No debug images found for any of the %d addresses.", Integer.valueOf(set.size()));
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return null;
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

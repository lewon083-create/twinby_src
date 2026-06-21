package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Hint {

    @NotNull
    private static final Map<String, Class<?>> PRIMITIVE_MAPPINGS;

    @NotNull
    private final Map<String, Object> internalStorage = new HashMap();

    @NotNull
    private final List<Attachment> attachments = new ArrayList();

    @NotNull
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    @Nullable
    private Attachment screenshot = null;

    @Nullable
    private Attachment viewHierarchy = null;

    @Nullable
    private Attachment threadDump = null;

    @Nullable
    private ReplayRecording replayRecording = null;

    static {
        HashMap map = new HashMap();
        PRIMITIVE_MAPPINGS = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    private boolean isCastablePrimitive(@Nullable Object obj, @NotNull Class<?> cls) {
        Class<?> cls2 = PRIMITIVE_MAPPINGS.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    @NotNull
    public static Hint withAttachment(@Nullable Attachment attachment) {
        Hint hint = new Hint();
        hint.addAttachment(attachment);
        return hint;
    }

    @NotNull
    public static Hint withAttachments(@Nullable List<Attachment> list) {
        Hint hint = new Hint();
        hint.addAttachments(list);
        return hint;
    }

    public void addAttachment(@Nullable Attachment attachment) {
        if (attachment != null) {
            this.attachments.add(attachment);
        }
    }

    public void addAttachments(@Nullable List<Attachment> list) {
        if (list != null) {
            this.attachments.addAll(list);
        }
    }

    public void clear() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            Iterator<Map.Entry<String, Object>> it = this.internalStorage.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                if (next.getKey() == null || !next.getKey().startsWith("sentry:")) {
                    it.remove();
                }
            }
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

    public void clearAttachments() {
        this.attachments.clear();
    }

    @Nullable
    public Object get(@NotNull String str) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            Object obj = this.internalStorage.get(str);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return obj;
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

    @Nullable
    public <T> T getAs(@NotNull String str, @NotNull Class<T> cls) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            T t10 = (T) this.internalStorage.get(str);
            if (cls.isInstance(t10)) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return t10;
                }
            } else {
                if (!isCastablePrimitive(t10, cls)) {
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                    }
                    return null;
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            }
            return t10;
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
    public List<Attachment> getAttachments() {
        return new ArrayList(this.attachments);
    }

    @Nullable
    public ReplayRecording getReplayRecording() {
        return this.replayRecording;
    }

    @Nullable
    public Attachment getScreenshot() {
        return this.screenshot;
    }

    @Nullable
    public Attachment getThreadDump() {
        return this.threadDump;
    }

    @Nullable
    public Attachment getViewHierarchy() {
        return this.viewHierarchy;
    }

    public void remove(@NotNull String str) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.internalStorage.remove(str);
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

    public void replaceAttachments(@Nullable List<Attachment> list) {
        clearAttachments();
        addAttachments(list);
    }

    public void set(@NotNull String str, @Nullable Object obj) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.internalStorage.put(str, obj);
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

    public void setReplayRecording(@Nullable ReplayRecording replayRecording) {
        this.replayRecording = replayRecording;
    }

    public void setScreenshot(@Nullable Attachment attachment) {
        this.screenshot = attachment;
    }

    public void setThreadDump(@Nullable Attachment attachment) {
        this.threadDump = attachment;
    }

    public void setViewHierarchy(@Nullable Attachment attachment) {
        this.viewHierarchy = attachment;
    }
}

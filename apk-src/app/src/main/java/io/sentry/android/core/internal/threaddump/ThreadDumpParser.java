package io.sentry.android.core.internal.threaddump;

import io.sentry.SentryLevel;
import io.sentry.SentryLockReason;
import io.sentry.SentryOptions;
import io.sentry.SentryStackTraceFactory;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ThreadDumpParser {
    private final boolean isBackground;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final SentryStackTraceFactory stackTraceFactory;
    private static final Pattern BEGIN_MANAGED_THREAD_RE = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    private static final Pattern BEGIN_UNMANAGED_NATIVE_THREAD_RE = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    private static final Pattern NATIVE_RE = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");
    private static final Pattern JAVA_RE = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    private static final Pattern JNI_RE = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    private static final Pattern LOCKED_RE = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern SLEEPING_ON_RE = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern WAITING_ON_RE = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern WAITING_TO_LOCK_RE = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern WAITING_TO_LOCK_HELD_RE = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    private static final Pattern WAITING_TO_LOCK_UNKNOWN_RE = Pattern.compile(" *- waiting to lock an unknown object");
    private static final Pattern BLANK_RE = Pattern.compile("\\s+");

    @NotNull
    private final Map<String, DebugImage> debugImages = new HashMap();

    @NotNull
    private final List<SentryThread> threads = new ArrayList();

    public ThreadDumpParser(@NotNull SentryOptions sentryOptions, boolean z5) {
        this.options = sentryOptions;
        this.isBackground = z5;
        this.stackTraceFactory = new SentryStackTraceFactory(sentryOptions);
    }

    private void combineThreadLocks(@NotNull SentryThread sentryThread, @NotNull SentryLockReason sentryLockReason) {
        Map<String, SentryLockReason> heldLocks = sentryThread.getHeldLocks();
        if (heldLocks == null) {
            heldLocks = new HashMap<>();
        }
        SentryLockReason sentryLockReason2 = heldLocks.get(sentryLockReason.getAddress());
        if (sentryLockReason2 != null) {
            sentryLockReason2.setType(Math.max(sentryLockReason2.getType(), sentryLockReason.getType()));
        } else {
            heldLocks.put(sentryLockReason.getAddress(), new SentryLockReason(sentryLockReason));
        }
        sentryThread.setHeldLocks(heldLocks);
    }

    @Nullable
    private Integer getInteger(@NotNull Matcher matcher, int i, @Nullable Integer num) {
        String strGroup = matcher.group(i);
        return (strGroup == null || strGroup.length() == 0) ? num : Integer.valueOf(Integer.parseInt(strGroup));
    }

    @Nullable
    private Long getLong(@NotNull Matcher matcher, int i, @Nullable Long l10) {
        String strGroup = matcher.group(i);
        return (strGroup == null || strGroup.length() == 0) ? l10 : Long.valueOf(Long.parseLong(strGroup));
    }

    @Nullable
    private Integer getUInteger(@NotNull Matcher matcher, int i, @Nullable Integer num) {
        String strGroup = matcher.group(i);
        if (strGroup != null && strGroup.length() != 0) {
            int i10 = Integer.parseInt(strGroup);
            Integer numValueOf = Integer.valueOf(i10);
            if (i10 >= 0) {
                return numValueOf;
            }
        }
        return num;
    }

    private boolean matches(@NotNull Matcher matcher, @NotNull String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c9, code lost:
    
        r12 = new io.sentry.protocol.SentryStackFrame();
        r12.setPackage(r3.group(3));
        r12.setFunction(r3.group(6));
        r12.setLineno(getInteger(r3, 7, null));
        r12.setInstructionAddr("0x" + r3.group(2));
        r12.setPlatform("native");
        r4 = r3.group(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0106, code lost:
    
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0108, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x010a, code lost:
    
        r13 = io.sentry.android.core.internal.util.NativeEventUtils.buildIdToDebugId(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x010e, code lost:
    
        if (r13 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0116, code lost:
    
        if (r18.debugImages.containsKey(r13) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0118, code lost:
    
        r14 = new io.sentry.protocol.DebugImage();
        r14.setDebugId(r13);
        r14.setType("elf");
        r14.setCodeFile(r3.group(4));
        r14.setCodeId(r4);
        r18.debugImages.put(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0135, code lost:
    
        r12.setAddrMode("rel:".concat(r13));
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private io.sentry.protocol.SentryStackTrace parseStacktrace(@org.jetbrains.annotations.NotNull io.sentry.android.core.internal.threaddump.Lines r19, @org.jetbrains.annotations.NotNull io.sentry.protocol.SentryThread r20) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.threaddump.ThreadDumpParser.parseStacktrace(io.sentry.android.core.internal.threaddump.Lines, io.sentry.protocol.SentryThread):io.sentry.protocol.SentryStackTrace");
    }

    private SentryThread parseThread(@NotNull Lines lines) {
        SentryThread sentryThread = new SentryThread();
        Matcher matcher = BEGIN_MANAGED_THREAD_RE.matcher("");
        Matcher matcher2 = BEGIN_UNMANAGED_NATIVE_THREAD_RE.matcher("");
        if (!lines.hasNext()) {
            return null;
        }
        Line next = lines.next();
        boolean z5 = false;
        if (next == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (matches(matcher, next.text)) {
            Long l10 = getLong(matcher, 4, null);
            if (l10 == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            sentryThread.setId(l10);
            sentryThread.setName(matcher.group(1));
            String strGroup = matcher.group(5);
            if (strGroup != null) {
                if (strGroup.contains(" ")) {
                    sentryThread.setState(strGroup.substring(0, strGroup.indexOf(32)));
                } else {
                    sentryThread.setState(strGroup);
                }
            }
        } else if (matches(matcher2, next.text)) {
            Long l11 = getLong(matcher2, 3, null);
            if (l11 == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            sentryThread.setId(l11);
            sentryThread.setName(matcher2.group(1));
        }
        String name = sentryThread.getName();
        if (name != null) {
            boolean zEquals = name.equals(SentryThread.JsonKeys.MAIN);
            sentryThread.setMain(Boolean.valueOf(zEquals));
            sentryThread.setCrashed(Boolean.valueOf(zEquals));
            if (zEquals && !this.isBackground) {
                z5 = true;
            }
            sentryThread.setCurrent(Boolean.valueOf(z5));
        }
        sentryThread.setStacktrace(parseStacktrace(lines, sentryThread));
        return sentryThread;
    }

    @NotNull
    public List<DebugImage> getDebugImages() {
        return new ArrayList(this.debugImages.values());
    }

    @NotNull
    public List<SentryThread> getThreads() {
        return this.threads;
    }

    public void parse(@NotNull Lines lines) {
        Matcher matcher = BEGIN_MANAGED_THREAD_RE.matcher("");
        Matcher matcher2 = BEGIN_UNMANAGED_NATIVE_THREAD_RE.matcher("");
        while (lines.hasNext()) {
            Line next = lines.next();
            if (next == null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str = next.text;
            if (matches(matcher, str) || matches(matcher2, str)) {
                lines.rewind();
                SentryThread thread = parseThread(lines);
                if (thread != null) {
                    this.threads.add(thread);
                }
            }
        }
    }
}

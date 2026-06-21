package io.sentry.android.core.anr;

import d2.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AnrCulpritIdentifier {
    private static final List<String> systemAndFrameworkPackages;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class StackTraceKey {
        private final int endIdx;
        private final int hashCode = computeHashCode();

        @NotNull
        private final StackTraceElement[] stack;
        private final int startIdx;

        public StackTraceKey(@NotNull StackTraceElement[] stackTraceElementArr, int i, int i10) {
            this.stack = stackTraceElementArr;
            this.startIdx = i;
            this.endIdx = i10;
        }

        private int computeHashCode() {
            int iHashCode = 1;
            for (int i = this.startIdx; i <= this.endIdx; i++) {
                iHashCode = (iHashCode * 31) + this.stack[i].hashCode();
            }
            return iHashCode;
        }

        public boolean equals(Object obj) {
            int i;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StackTraceKey)) {
                return false;
            }
            StackTraceKey stackTraceKey = (StackTraceKey) obj;
            if (this.hashCode != stackTraceKey.hashCode || (i = (this.endIdx - this.startIdx) + 1) != (stackTraceKey.endIdx - stackTraceKey.startIdx) + 1) {
                return false;
            }
            for (int i10 = 0; i10 < i; i10++) {
                if (!this.stack[this.startIdx + i10].equals(stackTraceKey.stack[stackTraceKey.startIdx + i10])) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.hashCode;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(11);
        systemAndFrameworkPackages = arrayList;
        arrayList.add("java.lang");
        arrayList.add("java.util");
        arrayList.add("android.app");
        arrayList.add("android.os.Handler");
        arrayList.add("android.os.Looper");
        arrayList.add("android.view");
        arrayList.add("android.widget");
        arrayList.add("com.android.internal");
        arrayList.add("com.google.android");
        arrayList.add("kotlin");
        arrayList.add("kotlinx.coroutines");
    }

    @Nullable
    public static AggregatedStackTrace identify(@NotNull List<AnrStackTrace> list) {
        if (list.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (AnrStackTrace anrStackTrace : list) {
            StackTraceElement[] stackTraceElementArr = anrStackTrace.stack;
            if (stackTraceElementArr.length >= 2) {
                int i = 0;
                for (int length = stackTraceElementArr.length - 1; length >= 0; length--) {
                    if (!isSystemFrame(anrStackTrace.stack[length].getClassName())) {
                        i++;
                    }
                    float length2 = i / (r3.length - length);
                    StackTraceKey stackTraceKey = new StackTraceKey(anrStackTrace.stack, length, r3.length - 1);
                    AggregatedStackTrace aggregatedStackTrace = (AggregatedStackTrace) map.get(stackTraceKey);
                    if (aggregatedStackTrace == null) {
                        map.put(stackTraceKey, new AggregatedStackTrace(anrStackTrace.stack, length, r6.length - 1, anrStackTrace.timestampMs, length2));
                    } else {
                        aggregatedStackTrace.addOccurrence(anrStackTrace.timestampMs);
                    }
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return (AggregatedStackTrace) Collections.max(map.values(), new a(3));
    }

    public static boolean isSystemFrame(@NotNull String str) {
        Iterator<String> it = systemAndFrameworkPackages.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$identify$0(AggregatedStackTrace aggregatedStackTrace, AggregatedStackTrace aggregatedStackTrace2) {
        return Float.compare((aggregatedStackTrace.quality + 1.0f) * aggregatedStackTrace.count * aggregatedStackTrace.depth, (aggregatedStackTrace2.quality + 1.0f) * aggregatedStackTrace2.count * aggregatedStackTrace2.depth);
    }
}

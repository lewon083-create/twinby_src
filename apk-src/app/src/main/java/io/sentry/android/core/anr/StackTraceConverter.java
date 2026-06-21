package io.sentry.android.core.anr;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.profiling.SentryProfile;
import io.sentry.protocol.profiling.SentrySample;
import io.sentry.protocol.profiling.SentryThreadMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class StackTraceConverter {
    private static final String MAIN_THREAD_ID = "0";
    private static final String MAIN_THREAD_NAME = "main";

    @NotNull
    public static SentryProfile convert(@NotNull AnrProfile anrProfile) {
        List<AnrStackTrace> list = anrProfile.stacks;
        SentryProfile sentryProfile = new SentryProfile();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        Iterator<AnrStackTrace> it = list.iterator();
        while (it.hasNext()) {
            StackTraceElement[] stackTraceElementArr = it.next().stack;
            ArrayList arrayList3 = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                String strCreateFrameSignature = createFrameSignature(stackTraceElement);
                Integer numValueOf = (Integer) map.get(strCreateFrameSignature);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(arrayList.size());
                    arrayList.add(createSentryStackFrame(stackTraceElement));
                    map.put(strCreateFrameSignature, numValueOf);
                }
                arrayList3.add(numValueOf);
            }
            String strCreateStackSignature = createStackSignature(arrayList3);
            Integer numValueOf2 = (Integer) map2.get(strCreateStackSignature);
            if (numValueOf2 == null) {
                numValueOf2 = Integer.valueOf(arrayList2.size());
                arrayList2.add(new ArrayList(arrayList3));
                map2.put(strCreateStackSignature, numValueOf2);
            }
            SentrySample sentrySample = new SentrySample();
            sentrySample.setTimestamp(r5.timestampMs / 1000.0d);
            sentrySample.setStackId(numValueOf2.intValue());
            sentrySample.setThreadId("0");
            sentryProfile.getSamples().add(sentrySample);
        }
        sentryProfile.setFrames(arrayList);
        sentryProfile.setStacks(arrayList2);
        SentryThreadMetadata sentryThreadMetadata = new SentryThreadMetadata();
        sentryThreadMetadata.setName("main");
        sentryThreadMetadata.setPriority(5);
        sentryProfile.setThreadMetadata(Collections.singletonMap("0", sentryThreadMetadata));
        return sentryProfile;
    }

    @NotNull
    private static String createFrameSignature(@NotNull StackTraceElement stackTraceElement) {
        return stackTraceElement.getClassName() + "#" + stackTraceElement.getMethodName() + "#" + stackTraceElement.getFileName() + "#" + stackTraceElement.getLineNumber();
    }

    @NotNull
    private static SentryStackFrame createSentryStackFrame(@NotNull StackTraceElement stackTraceElement) {
        SentryStackFrame sentryStackFrame = new SentryStackFrame();
        sentryStackFrame.setFilename(stackTraceElement.getFileName());
        sentryStackFrame.setFunction(stackTraceElement.getMethodName());
        sentryStackFrame.setModule(stackTraceElement.getClassName());
        sentryStackFrame.setLineno(stackTraceElement.getLineNumber() > 0 ? Integer.valueOf(stackTraceElement.getLineNumber()) : null);
        if (stackTraceElement.isNativeMethod()) {
            sentryStackFrame.setNative(Boolean.TRUE);
        }
        return sentryStackFrame;
    }

    @NotNull
    private static String createStackSignature(@NotNull List<Integer> list) {
        StringBuilder sb2 = new StringBuilder();
        for (Integer num : list) {
            if (sb2.length() > 0) {
                sb2.append(StringUtils.COMMA);
            }
            sb2.append(num);
        }
        return sb2.toString();
    }
}

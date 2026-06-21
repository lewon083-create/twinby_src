package io.sentry.util;

import io.sentry.FilterString;
import io.sentry.SentryEvent;
import io.sentry.protocol.Message;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ErrorUtils {
    public static boolean isIgnored(@Nullable List<FilterString> list, @NotNull SentryEvent sentryEvent) {
        if (sentryEvent != null && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            Message message = sentryEvent.getMessage();
            if (message != null) {
                String message2 = message.getMessage();
                if (message2 != null) {
                    hashSet.add(message2);
                }
                String formatted = message.getFormatted();
                if (formatted != null) {
                    hashSet.add(formatted);
                }
            }
            Throwable throwable = sentryEvent.getThrowable();
            if (throwable != null) {
                hashSet.add(throwable.toString());
            }
            Iterator<FilterString> it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(it.next().getFilterString())) {
                    return true;
                }
            }
            for (FilterString filterString : list) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    if (filterString.matches((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

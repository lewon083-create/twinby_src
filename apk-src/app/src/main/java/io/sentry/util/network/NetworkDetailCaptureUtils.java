package io.sentry.util.network;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NetworkDetailCaptureUtils {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface NetworkBodyExtractor<T> {
        @Nullable
        NetworkBody extract(@NotNull T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface NetworkHeaderExtractor<T> {
        @NotNull
        Map<String, String> extract(@NotNull T t10);
    }

    private NetworkDetailCaptureUtils() {
    }

    @NotNull
    public static <T> ReplayNetworkRequestOrResponse createRequest(@NotNull T t10, @Nullable Long l10, boolean z5, @NotNull NetworkBodyExtractor<T> networkBodyExtractor, @NotNull List<String> list, @NotNull NetworkHeaderExtractor<T> networkHeaderExtractor) {
        return createRequestOrResponseInternal(t10, l10, z5, networkBodyExtractor, list, networkHeaderExtractor);
    }

    @NotNull
    private static <T> ReplayNetworkRequestOrResponse createRequestOrResponseInternal(@NotNull T t10, @Nullable Long l10, boolean z5, @NotNull NetworkBodyExtractor<T> networkBodyExtractor, @NotNull List<String> list, @NotNull NetworkHeaderExtractor<T> networkHeaderExtractor) {
        return new ReplayNetworkRequestOrResponse(l10, z5 ? networkBodyExtractor.extract(t10) : null, getCaptureHeaders(networkHeaderExtractor.extract(t10), list));
    }

    @NotNull
    public static <T> ReplayNetworkRequestOrResponse createResponse(@NotNull T t10, @Nullable Long l10, boolean z5, @NotNull NetworkBodyExtractor<T> networkBodyExtractor, @NotNull List<String> list, @NotNull NetworkHeaderExtractor<T> networkHeaderExtractor) {
        return createRequestOrResponseInternal(t10, l10, z5, networkBodyExtractor, list, networkHeaderExtractor);
    }

    @NotNull
    public static Map<String, String> getCaptureHeaders(@Nullable Map<String, String> map, @NotNull List<String> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            HashSet hashSet = new HashSet();
            for (String str : list) {
                if (str != null) {
                    hashSet.add(str.toLowerCase(Locale.ROOT));
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (hashSet.contains(entry.getKey().toLowerCase(Locale.ROOT))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }

    @Nullable
    public static NetworkRequestData initializeForUrl(@NotNull String str, @Nullable String str2, @Nullable List<String> list, @Nullable List<String> list2) {
        if (shouldCaptureUrl(str, list, list2)) {
            return new NetworkRequestData(str2);
        }
        return null;
    }

    private static boolean shouldCaptureUrl(@NotNull String str, @Nullable List<String> list, @Nullable List<String> list2) {
        if (list2 != null) {
            for (String str2 : list2) {
                if (str2 != null && str.matches(str2)) {
                    return false;
                }
            }
        }
        if (list == null) {
            return false;
        }
        for (String str3 : list) {
            if (str3 != null && str.matches(str3)) {
                return true;
            }
        }
        return false;
    }
}

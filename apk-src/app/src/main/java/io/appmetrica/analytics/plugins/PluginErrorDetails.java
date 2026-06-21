package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginErrorDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f25360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f25363f;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f25365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f25366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f25367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f25368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f25369f;

        @NonNull
        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f25364a, this.f25365b, (List) WrapUtils.getOrDefault(this.f25366c, new ArrayList()), this.f25367d, this.f25368e, (Map) WrapUtils.getOrDefault(this.f25369f, new HashMap()), 0);
        }

        @NonNull
        public Builder withExceptionClass(String str) {
            this.f25364a = str;
            return this;
        }

        @NonNull
        public Builder withMessage(String str) {
            this.f25365b = str;
            return this;
        }

        @NonNull
        public Builder withPlatform(String str) {
            this.f25367d = str;
            return this;
        }

        @NonNull
        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f25369f = map;
            return this;
        }

        @NonNull
        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f25366c = list;
            return this;
        }

        @NonNull
        public Builder withVirtualMachineVersion(String str) {
            this.f25368e = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i) {
        this(str, str2, list, str3, str4, map);
    }

    public String getExceptionClass() {
        return this.f25358a;
    }

    public String getMessage() {
        return this.f25359b;
    }

    public String getPlatform() {
        return this.f25361d;
    }

    @NonNull
    public Map<String, String> getPluginEnvironment() {
        return this.f25363f;
    }

    @NonNull
    public List<StackTraceItem> getStacktrace() {
        return this.f25360c;
    }

    public String getVirtualMachineVersion() {
        return this.f25362e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f25358a = str;
        this.f25359b = str2;
        this.f25360c = new ArrayList(list);
        this.f25361d = str3;
        this.f25362e = str4;
        this.f25363f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}

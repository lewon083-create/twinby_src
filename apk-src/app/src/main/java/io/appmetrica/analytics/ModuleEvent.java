package io.appmetrica.analytics;

import a0.u;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ModuleEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Category f21434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f21435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f21436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f21437h;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f21439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f21440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Category f21442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private HashMap f21443f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private HashMap f21444g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private HashMap f21445h;

        public /* synthetic */ Builder(int i, int i10) {
            this(i);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(Map<String, Object> map) {
            if (map != null) {
                this.f21445h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f21442e = category;
            return this;
        }

        public Builder withEnvironment(Map<String, Object> map) {
            if (map != null) {
                this.f21443f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f21444g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(String str) {
            this.f21439b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i) {
            this.f21441d = i;
            return this;
        }

        public Builder withValue(String str) {
            this.f21440c = str;
            return this;
        }

        private Builder(int i) {
            this.f21441d = 1;
            this.f21442e = Category.GENERAL;
            this.f21438a = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum Category {
        GENERAL,
        SYSTEM
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(int i) {
        return new Builder(i, 0);
    }

    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f21437h);
    }

    public Category getCategory() {
        return this.f21434e;
    }

    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f21435f);
    }

    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f21436g);
    }

    public String getName() {
        return this.f21431b;
    }

    public int getServiceDataReporterType() {
        return this.f21433d;
    }

    public int getType() {
        return this.f21430a;
    }

    public String getValue() {
        return this.f21432c;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ModuleEvent{type=");
        sb2.append(this.f21430a);
        sb2.append(", name='");
        sb2.append(this.f21431b);
        sb2.append("', value='");
        sb2.append(this.f21432c);
        sb2.append("', serviceDataReporterType=");
        sb2.append(this.f21433d);
        sb2.append(", category=");
        sb2.append(this.f21434e);
        sb2.append(", environment=");
        sb2.append(this.f21435f);
        sb2.append(", extras=");
        sb2.append(this.f21436g);
        sb2.append(", attributes=");
        return u.p(sb2, this.f21437h, '}');
    }

    private ModuleEvent(Builder builder) {
        this.f21430a = builder.f21438a;
        this.f21431b = builder.f21439b;
        this.f21432c = builder.f21440c;
        this.f21433d = builder.f21441d;
        this.f21434e = builder.f21442e;
        this.f21435f = CollectionUtils.getListFromMap(builder.f21443f);
        this.f21436g = CollectionUtils.getListFromMap(builder.f21444g);
        this.f21437h = CollectionUtils.getListFromMap(builder.f21445h);
    }
}

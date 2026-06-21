package io.appmetrica.analytics.modulesapi.internal.common;

import a0.u;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class InternalModuleEvent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f25232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Category f25233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f25234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f25235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f25236h;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f25238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f25239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f25240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Category f25241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f25242f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f25243g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f25244h;

        public Builder(int i) {
            this.f25237a = i;
        }

        @NotNull
        public InternalModuleEvent build() {
            return new InternalModuleEvent(this, null);
        }

        @Nullable
        public final Map<String, Object> getAttributes() {
            return this.f25244h;
        }

        @Nullable
        public final Category getCategory() {
            return this.f25241e;
        }

        @Nullable
        public final Map<String, Object> getEnvironment() {
            return this.f25242f;
        }

        @Nullable
        public final Map<String, byte[]> getExtras() {
            return this.f25243g;
        }

        @Nullable
        public final String getName() {
            return this.f25238b;
        }

        @Nullable
        public final Integer getServiceDataReporterType() {
            return this.f25240d;
        }

        public final int getType$modules_api_release() {
            return this.f25237a;
        }

        @Nullable
        public final String getValue() {
            return this.f25239c;
        }

        public final void setAttributes(@Nullable Map<String, ? extends Object> map) {
            this.f25244h = map;
        }

        public final void setCategory(@Nullable Category category) {
            this.f25241e = category;
        }

        public final void setEnvironment(@Nullable Map<String, ? extends Object> map) {
            this.f25242f = map;
        }

        public final void setExtras(@Nullable Map<String, byte[]> map) {
            this.f25243g = map;
        }

        public final void setName(@Nullable String str) {
            this.f25238b = str;
        }

        public final void setServiceDataReporterType(@Nullable Integer num) {
            this.f25240d = num;
        }

        public final void setValue(@Nullable String str) {
            this.f25239c = str;
        }

        @NotNull
        public final Builder withAttributes(@Nullable Map<String, ? extends Object> map) {
            if (map != null) {
                this.f25244h = new HashMap(map);
            }
            return this;
        }

        @NotNull
        public final Builder withCategory(@NotNull Category category) {
            this.f25241e = category;
            return this;
        }

        @NotNull
        public final Builder withEnvironment(@Nullable Map<String, ? extends Object> map) {
            if (map != null) {
                this.f25242f = new HashMap(map);
            }
            return this;
        }

        @NotNull
        public final Builder withExtras(@Nullable Map<String, byte[]> map) {
            if (map != null) {
                this.f25243g = new HashMap(map);
            }
            return this;
        }

        @NotNull
        public final Builder withName(@Nullable String str) {
            this.f25238b = str;
            return this;
        }

        @NotNull
        public final Builder withServiceDataReporterType(int i) {
            this.f25240d = Integer.valueOf(i);
            return this;
        }

        @NotNull
        public final Builder withValue(@Nullable String str) {
            this.f25239c = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Category {
        GENERAL,
        SYSTEM
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder newBuilder(int i) {
            return new Builder(i);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InternalModuleEvent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @NotNull
    public static final Builder newBuilder(int i) {
        return Companion.newBuilder(i);
    }

    @Nullable
    public final Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f25236h);
    }

    @Nullable
    public final Category getCategory() {
        return this.f25233e;
    }

    @Nullable
    public final Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f25234f);
    }

    @Nullable
    public final Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f25235g);
    }

    @Nullable
    public final String getName() {
        return this.f25230b;
    }

    @Nullable
    public final Integer getServiceDataReporterType() {
        return this.f25232d;
    }

    public final int getType() {
        return this.f25229a;
    }

    @Nullable
    public final String getValue() {
        return this.f25231c;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ModuleEvent{type=");
        sb2.append(this.f25229a);
        sb2.append(", name='");
        sb2.append(this.f25230b);
        sb2.append("', value='");
        sb2.append(this.f25231c);
        sb2.append("', serviceDataReporterType=");
        sb2.append(this.f25232d);
        sb2.append(", category=");
        sb2.append(this.f25233e);
        sb2.append(", environment=");
        sb2.append(this.f25234f);
        sb2.append(", extras=");
        sb2.append(this.f25235g);
        sb2.append(", attributes=");
        return u.p(sb2, this.f25236h, '}');
    }

    private InternalModuleEvent(Builder builder) {
        this.f25229a = builder.getType$modules_api_release();
        this.f25230b = builder.getName();
        this.f25231c = builder.getValue();
        this.f25232d = builder.getServiceDataReporterType();
        this.f25233e = builder.getCategory();
        this.f25234f = CollectionUtils.getListFromMap(builder.getEnvironment());
        this.f25235g = CollectionUtils.getListFromMap(builder.getExtras());
        this.f25236h = CollectionUtils.getListFromMap(builder.getAttributes());
    }
}

package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import com.google.android.gms.internal.ads.om1;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public final class ServiceModuleCounterReport {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f21740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21741d;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f21742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f21743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f21744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21745d;

        @NotNull
        public final ServiceModuleCounterReport build() {
            return new ServiceModuleCounterReport(this.f21742a, this.f21743b, this.f21744c, this.f21745d);
        }

        @NotNull
        public final Builder withName(@Nullable String str) {
            this.f21742a = str;
            return this;
        }

        @NotNull
        public final Builder withType(int i) {
            this.f21745d = i;
            return this;
        }

        @NotNull
        public final Builder withValue(@Nullable String str) {
            this.f21743b = str;
            return this;
        }

        @NotNull
        public final Builder withValueBytes(@Nullable byte[] bArr) {
            this.f21744c = bArr;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder newBuilder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public ServiceModuleCounterReport(@Nullable String str, @Nullable String str2, @Nullable byte[] bArr, int i) {
        this.f21738a = str;
        this.f21739b = str2;
        this.f21740c = bArr;
        this.f21741d = i;
    }

    public static /* synthetic */ ServiceModuleCounterReport copy$default(ServiceModuleCounterReport serviceModuleCounterReport, String str, String str2, byte[] bArr, int i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = serviceModuleCounterReport.f21738a;
        }
        if ((i10 & 2) != 0) {
            str2 = serviceModuleCounterReport.f21739b;
        }
        if ((i10 & 4) != 0) {
            bArr = serviceModuleCounterReport.f21740c;
        }
        if ((i10 & 8) != 0) {
            i = serviceModuleCounterReport.f21741d;
        }
        return serviceModuleCounterReport.copy(str, str2, bArr, i);
    }

    @Nullable
    public final String component1() {
        return this.f21738a;
    }

    @Nullable
    public final String component2() {
        return this.f21739b;
    }

    @Nullable
    public final byte[] component3() {
        return this.f21740c;
    }

    public final int component4() {
        return this.f21741d;
    }

    @NotNull
    public final ServiceModuleCounterReport copy(@Nullable String str, @Nullable String str2, @Nullable byte[] bArr, int i) {
        return new ServiceModuleCounterReport(str, str2, bArr, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceModuleCounterReport)) {
            return false;
        }
        ServiceModuleCounterReport serviceModuleCounterReport = (ServiceModuleCounterReport) obj;
        return this.f21741d == serviceModuleCounterReport.f21741d && Intrinsics.a(this.f21738a, serviceModuleCounterReport.f21738a) && Intrinsics.a(this.f21739b, serviceModuleCounterReport.f21739b) && Arrays.equals(this.f21740c, serviceModuleCounterReport.f21740c);
    }

    @Nullable
    public final String getName() {
        return this.f21738a;
    }

    public final int getType() {
        return this.f21741d;
    }

    @Nullable
    public final String getValue() {
        return this.f21739b;
    }

    @Nullable
    public final byte[] getValueBytes() {
        return this.f21740c;
    }

    public int hashCode() {
        int i = this.f21741d * 31;
        String str = this.f21738a;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21739b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        byte[] bArr = this.f21740c;
        return iHashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceModuleCounterReport(name=");
        sb2.append(this.f21738a);
        sb2.append(", value=");
        sb2.append(this.f21739b);
        sb2.append(", valueBytes=");
        sb2.append(Arrays.toString(this.f21740c));
        sb2.append(", type=");
        return om1.l(sb2, this.f21741d, ')');
    }
}

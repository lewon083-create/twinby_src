package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import java.math.BigDecimal;
import java.util.Currency;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class ModuleAdRevenue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigDecimal f25218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Currency f25219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ModuleAdType f25220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f25224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25225h;
    private final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f25226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f25227k;

    public ModuleAdRevenue(@NotNull BigDecimal bigDecimal, @NotNull Currency currency, @Nullable ModuleAdType moduleAdType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Map<String, String> map, boolean z5) {
        this.f25218a = bigDecimal;
        this.f25219b = currency;
        this.f25220c = moduleAdType;
        this.f25221d = str;
        this.f25222e = str2;
        this.f25223f = str3;
        this.f25224g = str4;
        this.f25225h = str5;
        this.i = str6;
        this.f25226j = map;
        this.f25227k = z5;
    }

    @Nullable
    public final String getAdNetwork() {
        return this.f25221d;
    }

    @Nullable
    public final String getAdPlacementId() {
        return this.f25224g;
    }

    @Nullable
    public final String getAdPlacementName() {
        return this.f25225h;
    }

    @NotNull
    public final BigDecimal getAdRevenue() {
        return this.f25218a;
    }

    @Nullable
    public final ModuleAdType getAdType() {
        return this.f25220c;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.f25222e;
    }

    @Nullable
    public final String getAdUnitName() {
        return this.f25223f;
    }

    public final boolean getAutoCollected() {
        return this.f25227k;
    }

    @NotNull
    public final Currency getCurrency() {
        return this.f25219b;
    }

    @Nullable
    public final Map<String, String> getPayload() {
        return this.f25226j;
    }

    @Nullable
    public final String getPrecision() {
        return this.i;
    }

    public /* synthetic */ ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, currency, (i & 4) != 0 ? null : moduleAdType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : map, (i & 1024) != 0 ? true : z5);
    }
}

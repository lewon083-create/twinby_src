package io.appmetrica.analytics.idsync.internal.model;

import a0.u;
import gf.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class RequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Preconditions f22044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f22045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f22048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f22049h;
    private final String i;

    public RequestConfig(@NotNull String str, @NotNull String str2, @NotNull Preconditions preconditions, @NotNull Map<String, ? extends List<String>> map, long j10, long j11, @NotNull List<Integer> list, boolean z5, @Nullable String str3) {
        this.f22042a = str;
        this.f22043b = str2;
        this.f22044c = preconditions;
        this.f22045d = map;
        this.f22046e = j10;
        this.f22047f = j11;
        this.f22048g = list;
        this.f22049h = z5;
        this.i = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RequestConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.RequestConfig");
        }
        RequestConfig requestConfig = (RequestConfig) obj;
        return this.f22046e == requestConfig.f22046e && this.f22047f == requestConfig.f22047f && Intrinsics.a(this.f22042a, requestConfig.f22042a) && Intrinsics.a(this.f22043b, requestConfig.f22043b) && Intrinsics.a(this.f22044c, requestConfig.f22044c) && Intrinsics.a(this.f22045d, requestConfig.f22045d) && Intrinsics.a(this.f22048g, requestConfig.f22048g) && this.f22049h == requestConfig.f22049h && Intrinsics.a(this.i, requestConfig.i);
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.f22045d;
    }

    @NotNull
    public final Preconditions getPreconditions() {
        return this.f22044c;
    }

    public final boolean getReportEventEnabled() {
        return this.f22049h;
    }

    @Nullable
    public final String getReportUrl() {
        return this.i;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.f22047f;
    }

    public final long getResendIntervalForValidResponse() {
        return this.f22046e;
    }

    @NotNull
    public final String getType() {
        return this.f22042a;
    }

    @NotNull
    public final String getUrl() {
        return this.f22043b;
    }

    @NotNull
    public final List<Integer> getValidResponseCodes() {
        return this.f22048g;
    }

    public int hashCode() {
        int iHashCode = (Boolean.hashCode(this.f22049h) + u.i(this.f22048g, (this.f22045d.hashCode() + ((this.f22044c.hashCode() + a.e(a.e(o.d(this.f22047f, Long.hashCode(this.f22046e) * 31, 31), 31, this.f22042a), 31, this.f22043b)) * 31)) * 31, 31)) * 31;
        String str = this.i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RequestConfig(type='");
        sb2.append(this.f22042a);
        sb2.append("', url='");
        sb2.append(this.f22043b);
        sb2.append("', preconditions=");
        sb2.append(this.f22044c);
        sb2.append(", headers=");
        sb2.append(this.f22045d);
        sb2.append(", resendIntervalForValidResponse=");
        sb2.append(this.f22046e);
        sb2.append(", resendIntervalForInvalidResponse=");
        sb2.append(this.f22047f);
        sb2.append(", validResponseCodes=");
        sb2.append(this.f22048g);
        sb2.append(", reportEventEnabled=");
        sb2.append(this.f22049h);
        sb2.append(", reportUrl=");
        return u.n(sb2, this.i, ')');
    }
}

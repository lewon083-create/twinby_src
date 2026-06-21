package com.vk.sdk.api.prettyCards.dto;

import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.sdk.api.base.dto.BaseRequestParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class PrettyCardsPrettyCardOrError {

    @b(VKApiCodes.PARAM_ERROR_CODE)
    private final int errorCode;

    @b("error_msg")
    @Nullable
    private final String errorMsg;

    @b("error_subcode")
    @Nullable
    private final Integer errorSubcode;

    @b("error_text")
    @Nullable
    private final String errorText;

    @b("request_params")
    @Nullable
    private final List<BaseRequestParam> requestParams;

    public PrettyCardsPrettyCardOrError(int i, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable List<BaseRequestParam> list) {
        this.errorCode = i;
        this.errorSubcode = num;
        this.errorMsg = str;
        this.errorText = str2;
        this.requestParams = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrettyCardsPrettyCardOrError copy$default(PrettyCardsPrettyCardOrError prettyCardsPrettyCardOrError, int i, Integer num, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = prettyCardsPrettyCardOrError.errorCode;
        }
        if ((i10 & 2) != 0) {
            num = prettyCardsPrettyCardOrError.errorSubcode;
        }
        if ((i10 & 4) != 0) {
            str = prettyCardsPrettyCardOrError.errorMsg;
        }
        if ((i10 & 8) != 0) {
            str2 = prettyCardsPrettyCardOrError.errorText;
        }
        if ((i10 & 16) != 0) {
            list = prettyCardsPrettyCardOrError.requestParams;
        }
        List list2 = list;
        String str3 = str;
        return prettyCardsPrettyCardOrError.copy(i, num, str3, str2, list2);
    }

    public final int component1() {
        return this.errorCode;
    }

    @Nullable
    public final Integer component2() {
        return this.errorSubcode;
    }

    @Nullable
    public final String component3() {
        return this.errorMsg;
    }

    @Nullable
    public final String component4() {
        return this.errorText;
    }

    @Nullable
    public final List<BaseRequestParam> component5() {
        return this.requestParams;
    }

    @NotNull
    public final PrettyCardsPrettyCardOrError copy(int i, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable List<BaseRequestParam> list) {
        return new PrettyCardsPrettyCardOrError(i, num, str, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrettyCardsPrettyCardOrError)) {
            return false;
        }
        PrettyCardsPrettyCardOrError prettyCardsPrettyCardOrError = (PrettyCardsPrettyCardOrError) obj;
        return this.errorCode == prettyCardsPrettyCardOrError.errorCode && Intrinsics.a(this.errorSubcode, prettyCardsPrettyCardOrError.errorSubcode) && Intrinsics.a(this.errorMsg, prettyCardsPrettyCardOrError.errorMsg) && Intrinsics.a(this.errorText, prettyCardsPrettyCardOrError.errorText) && Intrinsics.a(this.requestParams, prettyCardsPrettyCardOrError.requestParams);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final Integer getErrorSubcode() {
        return this.errorSubcode;
    }

    @Nullable
    public final String getErrorText() {
        return this.errorText;
    }

    @Nullable
    public final List<BaseRequestParam> getRequestParams() {
        return this.requestParams;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.errorCode) * 31;
        Integer num = this.errorSubcode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorMsg;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseRequestParam> list = this.requestParams;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.errorCode;
        Integer num = this.errorSubcode;
        String str = this.errorMsg;
        String str2 = this.errorText;
        List<BaseRequestParam> list = this.requestParams;
        StringBuilder sb2 = new StringBuilder("PrettyCardsPrettyCardOrError(errorCode=");
        sb2.append(i);
        sb2.append(", errorSubcode=");
        sb2.append(num);
        sb2.append(", errorMsg=");
        o.t(sb2, str, ", errorText=", str2, ", requestParams=");
        return z.h(sb2, list, ")");
    }

    public /* synthetic */ PrettyCardsPrettyCardOrError(int i, Integer num, String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : list);
    }
}

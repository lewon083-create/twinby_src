package com.vk.sdk.api.leadForms.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
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
public final class LeadFormsCreateResponse {

    @b("form_id")
    private final int formId;

    @b("url")
    @NotNull
    private final String url;

    public LeadFormsCreateResponse(int i, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.formId = i;
        this.url = url;
    }

    public static /* synthetic */ LeadFormsCreateResponse copy$default(LeadFormsCreateResponse leadFormsCreateResponse, int i, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = leadFormsCreateResponse.formId;
        }
        if ((i10 & 2) != 0) {
            str = leadFormsCreateResponse.url;
        }
        return leadFormsCreateResponse.copy(i, str);
    }

    public final int component1() {
        return this.formId;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final LeadFormsCreateResponse copy(int i, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new LeadFormsCreateResponse(i, url);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsCreateResponse)) {
            return false;
        }
        LeadFormsCreateResponse leadFormsCreateResponse = (LeadFormsCreateResponse) obj;
        return this.formId == leadFormsCreateResponse.formId && Intrinsics.a(this.url, leadFormsCreateResponse.url);
    }

    public final int getFormId() {
        return this.formId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (Integer.hashCode(this.formId) * 31);
    }

    @NotNull
    public String toString() {
        return "LeadFormsCreateResponse(formId=" + this.formId + ", url=" + this.url + ")";
    }
}

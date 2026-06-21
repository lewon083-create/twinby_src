package com.vk.sdk.api.leadForms.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class LeadFormsGetLeadsResponse {

    @b("leads")
    @NotNull
    private final List<LeadFormsLead> leads;

    @b("next_page_token")
    @Nullable
    private final String nextPageToken;

    public LeadFormsGetLeadsResponse(@NotNull List<LeadFormsLead> leads, @Nullable String str) {
        Intrinsics.checkNotNullParameter(leads, "leads");
        this.leads = leads;
        this.nextPageToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeadFormsGetLeadsResponse copy$default(LeadFormsGetLeadsResponse leadFormsGetLeadsResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = leadFormsGetLeadsResponse.leads;
        }
        if ((i & 2) != 0) {
            str = leadFormsGetLeadsResponse.nextPageToken;
        }
        return leadFormsGetLeadsResponse.copy(list, str);
    }

    @NotNull
    public final List<LeadFormsLead> component1() {
        return this.leads;
    }

    @Nullable
    public final String component2() {
        return this.nextPageToken;
    }

    @NotNull
    public final LeadFormsGetLeadsResponse copy(@NotNull List<LeadFormsLead> leads, @Nullable String str) {
        Intrinsics.checkNotNullParameter(leads, "leads");
        return new LeadFormsGetLeadsResponse(leads, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsGetLeadsResponse)) {
            return false;
        }
        LeadFormsGetLeadsResponse leadFormsGetLeadsResponse = (LeadFormsGetLeadsResponse) obj;
        return Intrinsics.a(this.leads, leadFormsGetLeadsResponse.leads) && Intrinsics.a(this.nextPageToken, leadFormsGetLeadsResponse.nextPageToken);
    }

    @NotNull
    public final List<LeadFormsLead> getLeads() {
        return this.leads;
    }

    @Nullable
    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    public int hashCode() {
        int iHashCode = this.leads.hashCode() * 31;
        String str = this.nextPageToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "LeadFormsGetLeadsResponse(leads=" + this.leads + ", nextPageToken=" + this.nextPageToken + ")";
    }

    public /* synthetic */ LeadFormsGetLeadsResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }
}

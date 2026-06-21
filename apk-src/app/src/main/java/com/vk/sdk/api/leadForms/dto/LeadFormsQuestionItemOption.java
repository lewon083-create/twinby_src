package com.vk.sdk.api.leadForms.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public final class LeadFormsQuestionItemOption {

    @b("key")
    @Nullable
    private final String key;

    @b("label")
    @NotNull
    private final String label;

    public LeadFormsQuestionItemOption(@NotNull String label, @Nullable String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.key = str;
    }

    public static /* synthetic */ LeadFormsQuestionItemOption copy$default(LeadFormsQuestionItemOption leadFormsQuestionItemOption, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leadFormsQuestionItemOption.label;
        }
        if ((i & 2) != 0) {
            str2 = leadFormsQuestionItemOption.key;
        }
        return leadFormsQuestionItemOption.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.label;
    }

    @Nullable
    public final String component2() {
        return this.key;
    }

    @NotNull
    public final LeadFormsQuestionItemOption copy(@NotNull String label, @Nullable String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new LeadFormsQuestionItemOption(label, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsQuestionItemOption)) {
            return false;
        }
        LeadFormsQuestionItemOption leadFormsQuestionItemOption = (LeadFormsQuestionItemOption) obj;
        return Intrinsics.a(this.label, leadFormsQuestionItemOption.label) && Intrinsics.a(this.key, leadFormsQuestionItemOption.key);
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        String str = this.key;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return z.f("LeadFormsQuestionItemOption(label=", this.label, ", key=", this.key, ")");
    }

    public /* synthetic */ LeadFormsQuestionItemOption(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}

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
public final class LeadFormsAnswerItem {

    @b("key")
    @Nullable
    private final String key;

    @b("value")
    @NotNull
    private final String value;

    public LeadFormsAnswerItem(@NotNull String value, @Nullable String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.key = str;
    }

    public static /* synthetic */ LeadFormsAnswerItem copy$default(LeadFormsAnswerItem leadFormsAnswerItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leadFormsAnswerItem.value;
        }
        if ((i & 2) != 0) {
            str2 = leadFormsAnswerItem.key;
        }
        return leadFormsAnswerItem.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.value;
    }

    @Nullable
    public final String component2() {
        return this.key;
    }

    @NotNull
    public final LeadFormsAnswerItem copy(@NotNull String value, @Nullable String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new LeadFormsAnswerItem(value, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsAnswerItem)) {
            return false;
        }
        LeadFormsAnswerItem leadFormsAnswerItem = (LeadFormsAnswerItem) obj;
        return Intrinsics.a(this.value, leadFormsAnswerItem.value) && Intrinsics.a(this.key, leadFormsAnswerItem.key);
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        String str = this.key;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return z.f("LeadFormsAnswerItem(value=", this.value, ", key=", this.key, ")");
    }

    public /* synthetic */ LeadFormsAnswerItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}

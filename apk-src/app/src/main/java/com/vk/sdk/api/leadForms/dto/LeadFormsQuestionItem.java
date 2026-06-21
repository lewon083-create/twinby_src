package com.vk.sdk.api.leadForms.dto;

import io.sentry.rrweb.RRWebOptionsEvent;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class LeadFormsQuestionItem {

    @b("key")
    @NotNull
    private final String key;

    @b("label")
    @Nullable
    private final String label;

    @b(RRWebOptionsEvent.EVENT_TAG)
    @Nullable
    private final List<LeadFormsQuestionItemOption> options;

    @b("type")
    @NotNull
    private final Type type;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        INPUT("input"),
        TEXTAREA("textarea"),
        RADIO("radio"),
        CHECKBOX("checkbox"),
        SELECT("select");


        @NotNull
        private final String value;

        Type(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public LeadFormsQuestionItem(@NotNull String key, @NotNull Type type, @Nullable String str, @Nullable List<LeadFormsQuestionItemOption> list) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        this.key = key;
        this.type = type;
        this.label = str;
        this.options = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeadFormsQuestionItem copy$default(LeadFormsQuestionItem leadFormsQuestionItem, String str, Type type, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leadFormsQuestionItem.key;
        }
        if ((i & 2) != 0) {
            type = leadFormsQuestionItem.type;
        }
        if ((i & 4) != 0) {
            str2 = leadFormsQuestionItem.label;
        }
        if ((i & 8) != 0) {
            list = leadFormsQuestionItem.options;
        }
        return leadFormsQuestionItem.copy(str, type, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    @NotNull
    public final Type component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.label;
    }

    @Nullable
    public final List<LeadFormsQuestionItemOption> component4() {
        return this.options;
    }

    @NotNull
    public final LeadFormsQuestionItem copy(@NotNull String key, @NotNull Type type, @Nullable String str, @Nullable List<LeadFormsQuestionItemOption> list) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        return new LeadFormsQuestionItem(key, type, str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsQuestionItem)) {
            return false;
        }
        LeadFormsQuestionItem leadFormsQuestionItem = (LeadFormsQuestionItem) obj;
        return Intrinsics.a(this.key, leadFormsQuestionItem.key) && this.type == leadFormsQuestionItem.type && Intrinsics.a(this.label, leadFormsQuestionItem.label) && Intrinsics.a(this.options, leadFormsQuestionItem.options);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final List<LeadFormsQuestionItemOption> getOptions() {
        return this.options;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.key.hashCode() * 31)) * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<LeadFormsQuestionItemOption> list = this.options;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeadFormsQuestionItem(key=" + this.key + ", type=" + this.type + ", label=" + this.label + ", options=" + this.options + ")";
    }

    public /* synthetic */ LeadFormsQuestionItem(String str, Type type, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, type, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
    }
}

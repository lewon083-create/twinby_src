package com.vk.sdk.api.groups.dto;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

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
public enum GroupsTagAddTagColor {
    FORTY_FIVE_4647("454647"),
    FORTY_FIVE_678F("45678f"),
    FOUR_BB34B("4bb34b"),
    FIFTY_ONE_81B8("5181b8"),
    FIFTY_THREE_9B9C("539b9c"),
    FIVE_C9CE6("5c9ce6"),
    SIXTY_THREE_B9BA("63b9ba"),
    SIX_BC76B("6bc76b"),
    SEVENTY_SIX_787A("76787a"),
    SEVENTY_NINE_2EC0("792ec0"),
    SEVEN_A6C4F("7a6c4f"),
    SEVEN_ECECF("7ececf"),
    NINE_E8D6B("9e8d6b"),
    A162DE("a162de"),
    AAAEB3("aaaeb3"),
    BBAA84("bbaa84"),
    E64646("e64646"),
    FF5C5C("ff5c5c"),
    FFA000("ffa000"),
    FFC107("ffc107");


    @NotNull
    private final String value;

    GroupsTagAddTagColor(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}

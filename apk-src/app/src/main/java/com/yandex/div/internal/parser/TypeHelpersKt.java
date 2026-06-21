package com.yandex.div.internal.parser;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

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
public abstract class TypeHelpersKt {

    @NotNull
    public static final TypeHelper<Boolean> TYPE_HELPER_BOOLEAN = new TypeHelper<Boolean>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_BOOLEAN$1
        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof Boolean;
        }
    };

    @NotNull
    public static final TypeHelper<Long> TYPE_HELPER_INT = new TypeHelper<Long>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_INT$1
        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof Long;
        }
    };

    @NotNull
    public static final TypeHelper<String> TYPE_HELPER_STRING = new TypeHelper<String>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_STRING$1

        @NotNull
        private final String typeDefault = "";

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof String;
        }
    };

    @NotNull
    public static final TypeHelper<Double> TYPE_HELPER_DOUBLE = new TypeHelper<Double>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_DOUBLE$1
        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof Double;
        }
    };

    @NotNull
    public static final TypeHelper<Uri> TYPE_HELPER_URI = new TypeHelper<Uri>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_URI$1
        private final Uri typeDefault = Uri.EMPTY;

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof Uri;
        }
    };

    @NotNull
    public static final TypeHelper<Integer> TYPE_HELPER_COLOR = new TypeHelper<Integer>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_COLOR$1
        private final int typeDefault = -16777216;

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof Integer;
        }
    };

    @NotNull
    public static final TypeHelper<JSONArray> TYPE_HELPER_JSON_ARRAY = new TypeHelper<JSONArray>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_JSON_ARRAY$1

        @NotNull
        private final JSONArray typeDefault = new JSONArray();

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof JSONArray;
        }
    };

    @NotNull
    public static final TypeHelper<JSONObject> TYPE_HELPER_DICT = new TypeHelper<JSONObject>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_DICT$1

        @NotNull
        private final JSONObject typeDefault = new JSONObject();

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof JSONObject;
        }
    };
}

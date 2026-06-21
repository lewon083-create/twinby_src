package com.yandex.div.internal.parser;

import com.yandex.div.evaluable.types.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.r;
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
public final class ParsingConvertersKt$STRING_TO_COLOR_INT$1 extends r implements Function1<Object, Integer> {
    public static final ParsingConvertersKt$STRING_TO_COLOR_INT$1 INSTANCE = new ParsingConvertersKt$STRING_TO_COLOR_INT$1();

    public ParsingConvertersKt$STRING_TO_COLOR_INT$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Integer invoke(@Nullable Object obj) {
        if (obj instanceof String) {
            return Integer.valueOf(Color.Companion.m593parseC4zCDoM((String) obj));
        }
        if (obj == null) {
            return null;
        }
        throw new ClassCastException("Received value of wrong type");
    }
}

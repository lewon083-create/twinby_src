package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.internal.core.DivVisitor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

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
public class DivViewCreator extends DivVisitor<View> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String[] TAGS = {"DIV2.TEXT_VIEW", "DIV2.IMAGE_VIEW", "DIV2.IMAGE_GIF_VIEW", "DIV2.OVERLAP_CONTAINER_VIEW", "DIV2.LINEAR_CONTAINER_VIEW", "DIV2.WRAP_CONTAINER_VIEW", "DIV2.GRID_VIEW", "DIV2.GALLERY_VIEW", "DIV2.PAGER_VIEW", "DIV2.TAB_VIEW", "DIV2.STATE", "DIV2.CUSTOM", "DIV2.INDICATOR", "DIV2.SLIDER", "DIV2.INPUT", "DIV2.SELECT", "DIV2.VIDEO", "DIV2.SWITCH"};

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

package io.sentry.android.replay.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yj.b;

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
@StabilityInferred(parameters = 0)
@Metadata
public final class ComposeTextLayout implements TextLayout {
    public static final int $stable = TextLayoutResult.$stable;

    @NotNull
    private final TextLayoutResult layout;

    public ComposeTextLayout(@NotNull TextLayoutResult layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
    }

    private final boolean getParagraphWidthExceedsNode() {
        return this.layout.getMultiParagraph().getWidth() > ((float) ((int) (this.layout.getSize-YbymL2g() >> 32)));
    }

    @Override // io.sentry.android.replay.util.TextLayout
    @Nullable
    public Integer getDominantTextColor() {
        return null;
    }

    @NotNull
    public final TextLayoutResult getLayout$sentry_android_replay_release() {
        return this.layout;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineBottom(int i) {
        return b.b(this.layout.getLineBottom(i));
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public float getLineLeft(int i) {
        if (getParagraphWidthExceedsNode()) {
            return 0.0f;
        }
        return this.layout.getLineLeft(i);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public float getLineRight(int i) {
        return getParagraphWidthExceedsNode() ? this.layout.getMultiParagraph().getLineWidth(i) : this.layout.getLineRight(i);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineTop(int i) {
        return b.b(this.layout.getLineTop(i));
    }
}

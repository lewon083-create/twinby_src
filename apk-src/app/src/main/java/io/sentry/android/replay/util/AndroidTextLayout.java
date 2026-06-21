package io.sentry.android.replay.util;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import com.vk.api.sdk.exceptions.VKApiCodes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@StabilityInferred(parameters = 0)
@Metadata
public final class AndroidTextLayout implements TextLayout {
    public static final int $stable = 8;

    @NotNull
    private final Layout layout;

    public AndroidTextLayout(@NotNull Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    @Nullable
    public Integer getDominantTextColor() {
        int i;
        if (!(this.layout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = this.layout.getText();
        Intrinsics.c(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, this.layout.getText().length(), ForegroundColorSpan.class);
        Intrinsics.b(foregroundColorSpanArr);
        int i10 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = this.layout.getText();
            Intrinsics.c(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = this.layout.getText();
            Intrinsics.c(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i = spanEnd - spanStart) > i10) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i10 = i;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(ViewsKt.toOpaque(numValueOf.intValue()));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineBottom(int i) {
        return this.layout.getLineBottom(i);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public float getLineLeft(int i) {
        if (this.layout.getEllipsizedWidth() <= 0 || this.layout.getEllipsizedWidth() >= this.layout.getWidth()) {
            return this.layout.getLineLeft(i);
        }
        return 0.0f;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public float getLineRight(int i) {
        return (this.layout.getEllipsizedWidth() <= 0 || this.layout.getEllipsizedWidth() >= this.layout.getWidth()) ? this.layout.getLineRight(i) : this.layout.getEllipsizedWidth();
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineTop(int i) {
        return this.layout.getLineTop(i);
    }
}

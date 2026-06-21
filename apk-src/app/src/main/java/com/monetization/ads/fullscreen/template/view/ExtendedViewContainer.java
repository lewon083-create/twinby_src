package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yads.fj1;
import yads.fz2;
import yads.gj1;
import yads.jj1;
import yads.kj1;
import yads.oy;
import yads.u10;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class ExtendedViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u10 f15063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kj1 f15064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kj1 f15065c;

    public ExtendedViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final oy a(float f10, float f11) {
        return new oy(new gj1(this, f10, getContext().getApplicationContext()), new fj1(this, f11, getContext().getApplicationContext()));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        u10 u10Var = this.f15063a;
        if (u10Var.f43520d != null && !u10Var.f43519c.isEmpty()) {
            canvas.clipPath(u10Var.f43519c);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        jj1 jj1VarA = this.f15065c.a(i, i10);
        super.onMeasure(jj1VarA.f39877a, jj1VarA.f39878b);
        this.f15063a.a();
    }

    public final void setMeasureSpecProvider(kj1 kj1Var) {
        this.f15065c = new oy(this.f15064b, kj1Var);
        requestLayout();
        invalidate();
    }

    public /* synthetic */ ExtendedViewContainer(Context context, AttributeSet attributeSet, int i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i);
    }

    public ExtendedViewContainer(Context context, AttributeSet attributeSet, int i) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalExtendedContainer, i, 0);
            int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_corner_radius, 0);
            dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_left_corner_radius, dimensionPixelSize5);
            dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_right_corner_radius, dimensionPixelSize5);
            dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_right_corner_radius, dimensionPixelSize5);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_left_corner_radius, dimensionPixelSize5);
            this.f15064b = a(typedArrayObtainStyledAttributes.getFloat(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_width, 1.0f), typedArrayObtainStyledAttributes.getFloat(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_height, 1.0f));
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f15064b = new fz2();
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
            dimensionPixelSize3 = 0;
            dimensionPixelSize4 = 0;
        }
        this.f15065c = this.f15064b;
        this.f15063a = new u10(this, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize);
        setWillNotDraw(false);
    }
}

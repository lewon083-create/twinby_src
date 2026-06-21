package com.monetization.ads.nativeads;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import yads.b03;
import yads.hk;
import yads.lv2;
import yads.nj3;
import yads.oj3;
import yads.ov2;
import yads.x20;

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
public class CustomizableMediaView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f15077f = R$layout.monetization_ads_internal_outstream_controls_default;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nj3 f15081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x20 f15082e;

    public CustomizableMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalMediaView);
            this.f15078a = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalMediaView_monetization_internal_video_controls_layout, f15077f);
            this.f15081d = oj3.a(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f15078a = f15077f;
            this.f15081d = null;
        }
        addOnAttachStateChangeListener(new hk(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ve.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CustomizableMediaView.a(this.f34858b);
            }
        }));
    }

    public final void a(int i) {
        this.f15078a = i;
    }

    public final int getHeightMeasureSpec() {
        return this.f15080c;
    }

    public final x20 getOnSizeChangedListener$mobileads_externalRelease() {
        return this.f15082e;
    }

    public final int getVideoControlsLayoutId() {
        return this.f15078a;
    }

    public final nj3 getVideoScaleType() {
        return this.f15081d;
    }

    public final int getWidthMeasureSpec() {
        return this.f15079b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        this.f15079b = i;
        this.f15080c = i10;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        ov2 ov2Var;
        super.onSizeChanged(i, i10, i11, i12);
        x20 x20Var = this.f15082e;
        if (x20Var == null || (ov2Var = (ov2) ((lv2) x20Var).f40705a.get()) == null) {
            return;
        }
        b03 b03Var = ov2Var.f41746f;
        if (i < b03Var.f36892b || i10 < b03Var.f36893c) {
            ov2Var.i.setValue(ov2Var, ov2.f41743j[2], ov2Var.f41745e);
        }
    }

    public final void setOnSizeChangedListener$mobileads_externalRelease(x20 x20Var) {
        this.f15082e = x20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CustomizableMediaView customizableMediaView) {
        x20 x20Var = customizableMediaView.f15082e;
        if (x20Var != null) {
            int width = customizableMediaView.getWidth();
            int height = customizableMediaView.getHeight();
            ov2 ov2Var = (ov2) ((lv2) x20Var).f40705a.get();
            if (ov2Var != null) {
                b03 b03Var = ov2Var.f41746f;
                if (width < b03Var.f36892b || height < b03Var.f36893c) {
                    ov2Var.i.setValue(ov2Var, ov2.f41743j[2], ov2Var.f41745e);
                }
            }
        }
    }

    public CustomizableMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

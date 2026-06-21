package com.monetization.ads.nativeads.view.pager;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.g;
import com.yandex.mobile.ads.R$id;
import io.sentry.android.replay.c;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import y6.m;
import yads.bx1;
import yads.gj0;
import yads.jm0;
import yads.pg0;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class MultiBannerControlsContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj0 f15083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jm0 f15084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15085c;

    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15083a = new gj0();
        this.f15084b = new jm0();
        this.f15085c = true;
    }

    public final void setOnClickLeftButtonListener(View.OnClickListener onClickListener) {
        View viewFindViewById = findViewById(R$id.left_scroll_control_button);
        ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public final void setOnClickRightButtonListener(View.OnClickListener onClickListener) {
        View viewFindViewById = findViewById(R$id.right_scroll_control_button);
        ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public final void a(m mVar) {
        ((ArrayList) mVar.f36509d.f36500e).add(new bx1(mVar, this));
        mVar.addOnLayoutChangeListener(new c(1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MultiBannerControlsContainer multiBannerControlsContainer, View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (view instanceof m) {
            boolean z5 = multiBannerControlsContainer.f15085c;
            jm0 jm0Var = multiBannerControlsContainer.f15084b;
            int i17 = i11 - i;
            int i18 = i12 - i10;
            pg0 pg0Var = jm0Var.f39906a;
            Context context = view.getContext();
            pg0Var.getClass();
            int iA = pg0.a(context, 144.0f);
            pg0 pg0Var2 = jm0Var.f39906a;
            Context context2 = view.getContext();
            pg0Var2.getClass();
            boolean z10 = i17 >= iA && i18 >= pg0.a(context2, 96.0f);
            multiBannerControlsContainer.f15085c = z10;
            if (z10 != z5) {
                m mVar = (m) view;
                int currentItem = mVar.getCurrentItem();
                g adapter = mVar.getAdapter();
                multiBannerControlsContainer.a(currentItem, adapter != null ? adapter.getItemCount() : 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, int i10) {
        View viewFindViewById = findViewById(R$id.left_scroll_control_button);
        ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
        View viewFindViewById2 = findViewById(R$id.right_scroll_control_button);
        ImageView imageView2 = viewFindViewById2 instanceof ImageView ? (ImageView) viewFindViewById2 : null;
        int i11 = R$id.dot_indicator;
        View viewFindViewById3 = findViewById(i11);
        ImageView imageView3 = viewFindViewById3 instanceof ImageView ? (ImageView) viewFindViewById3 : null;
        if (!this.f15085c) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(8);
            return;
        }
        View viewFindViewById4 = findViewById(i11);
        ImageView imageView4 = viewFindViewById4 instanceof ImageView ? (ImageView) viewFindViewById4 : null;
        boolean z5 = true;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            gj0 gj0Var = this.f15083a;
            Context context = getContext();
            gj0Var.f38772a.getClass();
            int iA = pg0.a(context, 6.0f);
            gj0Var.f38772a.getClass();
            int iB = b.b(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
            gj0Var.f38772a.getClass();
            int iB2 = b.b(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
            gj0Var.f38772a.getClass();
            int iB3 = b.b(TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics()));
            int i12 = ((i10 + 1) * iB) + (iA * i10);
            float f10 = iB3;
            RectF rectF = new RectF(0.0f, 0.0f, i12, f10);
            float[] fArr = new float[8];
            for (int i13 = 0; i13 < 8; i13++) {
                fArr[i13] = f10;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, null));
            shapeDrawable.setIntrinsicWidth(i12);
            shapeDrawable.setIntrinsicHeight(iB3);
            shapeDrawable.getPaint().setColor(-16777216);
            shapeDrawable.setAlpha(102);
            ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[i10];
            int i14 = 0;
            while (i14 < i10) {
                boolean z10 = z5;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.setIntrinsicHeight(iA);
                shapeDrawable2.setIntrinsicWidth(iA);
                shapeDrawable2.getPaint().setColor(-1);
                if (i14 != i) {
                    shapeDrawable2.setAlpha(102);
                }
                Unit unit = Unit.f27471a;
                shapeDrawableArr[i14] = shapeDrawable2;
                i14++;
                z5 = z10;
            }
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(shapeDrawable);
            if (i10 > 0) {
                arrayList.ensureCapacity(arrayList.size() + i10);
                Collections.addAll(arrayList, shapeDrawableArr);
            }
            LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) arrayList.toArray(new ShapeDrawable[arrayList.size()]));
            int i15 = 0;
            while (i15 < i10) {
                int i16 = iB + iA;
                int i17 = i15 + 1;
                layerDrawable.setLayerInset(i17, (i16 * i15) + iB, iB2, i12 - (i16 * i17), iB2);
                i15 = i17;
            }
            imageView4.setImageDrawable(layerDrawable);
        }
        View viewFindViewById5 = findViewById(R$id.left_scroll_control_button);
        ImageView imageView5 = viewFindViewById5 instanceof ImageView ? (ImageView) viewFindViewById5 : null;
        View viewFindViewById6 = findViewById(R$id.right_scroll_control_button);
        ImageView imageView6 = viewFindViewById6 instanceof ImageView ? (ImageView) viewFindViewById6 : null;
        if (imageView5 == null || imageView6 == null) {
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
            return;
        }
        if (i == 0) {
            imageView5.setVisibility(8);
            imageView6.setVisibility(0);
        } else if (i == i10 - 1) {
            imageView5.setVisibility(0);
            imageView6.setVisibility(8);
        } else {
            imageView5.setVisibility(0);
            imageView6.setVisibility(0);
        }
    }
}

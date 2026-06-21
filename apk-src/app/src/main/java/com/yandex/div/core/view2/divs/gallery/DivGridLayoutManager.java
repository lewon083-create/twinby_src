package com.yandex.div.core.view2.divs.gallery;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.k;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import fh.ud;
import java.util.HashSet;
import k6.f1;
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
@Metadata
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements DivGalleryItemHelper {

    @NotNull
    private final HashSet<View> childrenToRelayout;

    @NotNull
    private final ud div;

    @NotNull
    private final RecyclerView view;

    private final int getCrossSpacing() {
        if (getDiv().f18689a == null) {
            return getItemSpacing();
        }
        getBindingContext();
        throw null;
    }

    private final int getItemSpacing() {
        Expression expression = getDiv().f18690b;
        getBindingContext();
        throw null;
    }

    private final int spacingByOrientation(int i) {
        return i == getOrientation() ? getItemSpacing() : getCrossSpacing();
    }

    @Override // androidx.recyclerview.widget.i, com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @Nullable
    public View _getChildAt(int i) {
        return getChildAt(i);
    }

    @Override // androidx.recyclerview.widget.i, com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int _getPosition(@NotNull View view) {
        return getPosition(view);
    }

    @Override // androidx.recyclerview.widget.i
    public void calculateItemDecorationsForChild(@NotNull View view, @NotNull Rect rect) {
        super.calculateItemDecorationsForChild(view, rect);
        int i_getPosition = _getPosition(view);
        if (i_getPosition == -1) {
            return;
        }
        getItemDiv(i_getPosition);
    }

    @Override // androidx.recyclerview.widget.i
    public void detachViewAt(int i) {
        super.detachViewAt(i);
        _detachViewAt(i);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public BindingContext getBindingContext() {
        return null;
    }

    @NotNull
    public ud getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @Nullable
    public DivItemBuilderResult getItemDiv(int i) {
        Intrinsics.c(getView().getAdapter(), "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter");
        throw new ClassCastException();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int getLayoutManagerOrientation() {
        return getOrientation();
    }

    @Override // androidx.recyclerview.widget.i
    public int getPaddingBottom() {
        return super.getPaddingBottom() - (spacingByOrientation(1) / 2);
    }

    @Override // androidx.recyclerview.widget.i
    public int getPaddingLeft() {
        return super.getPaddingLeft() - (spacingByOrientation(0) / 2);
    }

    @Override // androidx.recyclerview.widget.i
    public int getPaddingRight() {
        return super.getPaddingRight() - (spacingByOrientation(0) / 2);
    }

    @Override // androidx.recyclerview.widget.i
    public int getPaddingTop() {
        return super.getPaddingTop() - (spacingByOrientation(1) / 2);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public RecyclerView getView() {
        return this.view;
    }

    @Override // androidx.recyclerview.widget.i
    public void layoutDecoratedWithMargins(@NotNull View view, int i, int i10, int i11, int i12) {
        DivGalleryItemHelper._layoutDecoratedWithMargins$default(this, view, i, i10, i11, i12, false, 32, null);
    }

    @Override // androidx.recyclerview.widget.i
    public void onAttachedToWindow(@NotNull RecyclerView recyclerView) {
        _onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.i
    public void onDetachedFromWindow(@NotNull RecyclerView recyclerView, @NotNull k kVar) {
        super.onDetachedFromWindow(recyclerView, kVar);
        _onDetachedFromWindow(recyclerView, kVar);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.i
    public void onLayoutCompleted(@Nullable f1 f1Var) {
        _onLayoutCompleted(f1Var);
        super.onLayoutCompleted(f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public void removeAndRecycleAllViews(@NotNull k kVar) {
        _removeAndRecycleAllViews(kVar);
        super.removeAndRecycleAllViews(kVar);
    }

    @Override // androidx.recyclerview.widget.i
    public void removeView(@NotNull View view) {
        super.removeView(view);
        _removeView(view);
    }

    @Override // androidx.recyclerview.widget.i
    public void removeViewAt(int i) {
        super.removeViewAt(i);
        _removeViewAt(i);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void superLayoutDecoratedWithMargins(@NotNull View view, int i, int i10, int i11, int i12) {
        super.layoutDecoratedWithMargins(view, i, i10, i11, i12);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public HashSet<View> getChildrenToRelayout() {
        return this.childrenToRelayout;
    }
}

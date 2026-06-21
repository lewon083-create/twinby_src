package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.util.Set;
import k6.f1;
import k6.t;
import k6.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
public final class DivLinearLayoutManager extends LinearLayoutManager implements DivGalleryItemHelper {
    @Override // androidx.recyclerview.widget.i
    public final boolean checkLayoutParams(w0 w0Var) {
        return w0Var instanceof t;
    }

    @Override // androidx.recyclerview.widget.i
    public final void detachViewAt(int i) {
        super.detachViewAt(i);
        _detachViewAt(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final w0 generateDefaultLayoutParams() {
        return new t(-2, -2);
    }

    @Override // androidx.recyclerview.widget.i
    public final w0 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final BindingContext getBindingContext() {
        return null;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final /* bridge */ /* synthetic */ Set getChildrenToRelayout() {
        return null;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final DivItemBuilderResult getItemDiv(int i) {
        throw null;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final int getLayoutManagerOrientation() {
        return this.f1665a;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final RecyclerView getView() {
        return null;
    }

    @Override // androidx.recyclerview.widget.i
    public final void layoutDecoratedWithMargins(View view, int i, int i10, int i11, int i12) {
        DivGalleryItemHelper._layoutDecoratedWithMargins$default(this, view, i, i10, i11, i12, false, 32, null);
    }

    @Override // androidx.recyclerview.widget.i
    public final void measureChildWithMargins(View view, int i, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.c(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.DivLinearLayoutManager.DivRecyclerViewLayoutParams");
        throw null;
    }

    @Override // androidx.recyclerview.widget.i
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        _onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final void onDetachedFromWindow(RecyclerView recyclerView, k kVar) {
        onDetachedFromWindow(recyclerView);
        _onDetachedFromWindow(recyclerView, kVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final void onLayoutCompleted(f1 f1Var) {
        _onLayoutCompleted(f1Var);
        super.onLayoutCompleted(f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public final void removeAndRecycleAllViews(k kVar) {
        _removeAndRecycleAllViews(kVar);
        super.removeAndRecycleAllViews(kVar);
    }

    @Override // androidx.recyclerview.widget.i
    public final void removeView(View view) {
        super.removeView(view);
        _removeView(view);
    }

    @Override // androidx.recyclerview.widget.i
    public final void removeViewAt(int i) {
        super.removeViewAt(i);
        _removeViewAt(i);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final void superLayoutDecoratedWithMargins(View view, int i, int i10, int i11, int i12) {
        super.layoutDecoratedWithMargins(view, i, i10, i11, i12);
    }

    @Override // androidx.recyclerview.widget.i
    public final w0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof t) {
            return new t((t) layoutParams);
        }
        if (layoutParams instanceof w0) {
            return new t((w0) layoutParams);
        }
        if (layoutParams instanceof DivLayoutParams) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            t tVar = new t(divLayoutParams);
            divLayoutParams.getMaxHeight();
            divLayoutParams.getMaxWidth();
            return tVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new t((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new t(layoutParams);
    }
}

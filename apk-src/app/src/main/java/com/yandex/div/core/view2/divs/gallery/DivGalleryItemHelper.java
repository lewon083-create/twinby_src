package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.yandex.div.R$id;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.DivItemBuilderResult;
import g2.q0;
import g2.r0;
import java.util.Set;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public interface DivGalleryItemHelper {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ void _layoutDecoratedWithMargins$default(DivGalleryItemHelper divGalleryItemHelper, View view, int i, int i10, int i11, int i12, boolean z5, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: _layoutDecoratedWithMargins");
        }
        if ((i13 & 32) != 0) {
            z5 = false;
        }
        divGalleryItemHelper._layoutDecoratedWithMargins(view, i, i10, i11, i12, z5);
    }

    static /* synthetic */ void trackVisibilityAction$default(DivGalleryItemHelper divGalleryItemHelper, View view, boolean z5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackVisibilityAction");
        }
        if ((i & 2) != 0) {
            z5 = false;
        }
        divGalleryItemHelper.trackVisibilityAction(view, z5);
    }

    default void _detachViewAt(int i) {
        View view_getChildAt = _getChildAt(i);
        if (view_getChildAt == null) {
            return;
        }
        trackVisibilityAction(view_getChildAt, true);
    }

    @Nullable
    View _getChildAt(int i);

    int _getPosition(@NotNull View view);

    default void _layoutDecoratedWithMargins(@NotNull View view, int i, int i10, int i11, int i12, boolean z5) {
        int layoutManagerOrientation = getLayoutManagerOrientation();
        int measuredWidth = (getView().getMeasuredWidth() - getView().getPaddingLeft()) - getView().getPaddingRight();
        int measuredHeight = (getView().getMeasuredHeight() - getView().getPaddingTop()) - getView().getPaddingBottom();
        if (layoutManagerOrientation == 0 ? getView().getMeasuredHeight() == 0 || measuredHeight == 0 || view.getMeasuredHeight() == 0 : layoutManagerOrientation == 1 && (getView().getMeasuredWidth() == 0 || measuredWidth == 0 || view.getMeasuredWidth() == 0)) {
            superLayoutDecoratedWithMargins(view, i, i10, i11, i12);
            if (z5) {
                return;
            }
            getChildrenToRelayout().add(view);
            return;
        }
        Integer num = (Integer) view.getTag(R$id.div_gallery_item_index);
        if (num != null) {
            getItemDiv(num.intValue());
        }
        getBindingContext();
        throw null;
    }

    default void _onAttachedToWindow(@NotNull RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            trackVisibilityAction$default(this, recyclerView.getChildAt(i), false, 2, null);
        }
    }

    default void _onDetachedFromWindow(@NotNull RecyclerView recyclerView, @NotNull k kVar) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            trackVisibilityAction(recyclerView.getChildAt(i), true);
        }
    }

    default void _onLayoutCompleted(@Nullable f1 f1Var) {
        for (View view : getChildrenToRelayout()) {
            _layoutDecoratedWithMargins(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
        }
        getChildrenToRelayout().clear();
    }

    default void _removeAndRecycleAllViews(@NotNull k kVar) {
        RecyclerView view = getView();
        int childCount = view.getChildCount();
        for (int i = 0; i < childCount; i++) {
            trackVisibilityAction(view.getChildAt(i), true);
        }
    }

    default void _removeView(@NotNull View view) {
        trackVisibilityAction(view, true);
    }

    default void _removeViewAt(int i) {
        View view_getChildAt = _getChildAt(i);
        if (view_getChildAt == null) {
            return;
        }
        trackVisibilityAction(view_getChildAt, true);
    }

    @NotNull
    BindingContext getBindingContext();

    @NotNull
    Set<View> getChildrenToRelayout();

    @Nullable
    DivItemBuilderResult getItemDiv(int i);

    int getLayoutManagerOrientation();

    @NotNull
    RecyclerView getView();

    void superLayoutDecoratedWithMargins(@NotNull View view, int i, int i10, int i11, int i12);

    default void trackVisibilityAction(@NotNull View view, boolean z5) {
        if (_getPosition(view) == -1) {
            return;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        q0 q0Var = new q0(viewGroup);
        Intrinsics.checkNotNullParameter(q0Var, "<this>");
        r0 r0Var = (r0) q0Var.iterator();
        if (((View) (!r0Var.hasNext() ? null : r0Var.next())) == null) {
            return;
        }
        getBindingContext();
        throw null;
    }
}

package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.internal.util.ClassUtil;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.gestures.UiElement;
import io.sentry.util.LazyEvaluator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidViewGestureTargetLocator implements GestureTargetLocator {
    private static final String ORIGIN = "old_view_system";

    @NotNull
    private final LazyEvaluator<Boolean> isAndroidXAvailable;

    public AndroidViewGestureTargetLocator(@NotNull LazyEvaluator<Boolean> lazyEvaluator) {
        this.isAndroidXAvailable = lazyEvaluator;
    }

    private UiElement createUiElement(@NotNull View view) {
        try {
            return new UiElement(view, ClassUtil.getClassName(view), ViewUtils.getResourceId(view), null, ORIGIN);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private static boolean isJetpackScrollingView(@NotNull View view, boolean z5) {
        if (z5) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    private static boolean isViewScrollable(@NotNull View view, boolean z5) {
        return (isJetpackScrollingView(view, z5) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
    }

    private static boolean isViewTappable(@NotNull View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    @Override // io.sentry.internal.gestures.GestureTargetLocator
    @Nullable
    public UiElement locate(@Nullable Object obj, float f10, float f11, UiElement.Type type) {
        if (!(obj instanceof View)) {
            return null;
        }
        View view = (View) obj;
        if (type == UiElement.Type.CLICKABLE && isViewTappable(view)) {
            return createUiElement(view);
        }
        if (type == UiElement.Type.SCROLLABLE && isViewScrollable(view, this.isAndroidXAvailable.getValue().booleanValue())) {
            return createUiElement(view);
        }
        return null;
    }
}

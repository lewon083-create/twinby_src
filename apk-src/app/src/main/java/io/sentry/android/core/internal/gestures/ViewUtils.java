package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.gestures.UiElement;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewUtils {
    private static final int[] coordinates = new int[2];

    @Nullable
    public static UiElement findTarget(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull View view, float f10, float f11, UiElement.Type type) {
        List<GestureTargetLocator> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        UiElement uiElement = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (touchWithinBounds(view2, f10, f11)) {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        linkedList.add(viewGroup.getChildAt(i));
                    }
                }
                for (int i10 = 0; i10 < gestureTargetLocators.size(); i10++) {
                    UiElement uiElementLocate = gestureTargetLocators.get(i10).locate(view2, f10, f11, type);
                    if (uiElementLocate != null) {
                        if (type == UiElement.Type.CLICKABLE) {
                            uiElement = uiElementLocate;
                        } else if (type == UiElement.Type.SCROLLABLE) {
                            return uiElementLocate;
                        }
                    }
                }
            }
        }
        return uiElement;
    }

    public static String getResourceId(@NotNull View view) {
        int id2 = view.getId();
        if (id2 == -1 || isViewIdGenerated(id2)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id2) : "";
    }

    public static String getResourceIdWithFallback(@NotNull View view) {
        try {
            return getResourceId(view);
        } catch (Resources.NotFoundException unused) {
            return "0x" + Integer.toString(view.getId(), 16);
        }
    }

    private static boolean isViewIdGenerated(int i) {
        return ((-16777216) & i) == 0 && (i & 16777215) != 0;
    }

    private static boolean touchWithinBounds(@Nullable View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        int[] iArr = coordinates;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i10 = iArr[1];
        return f10 >= ((float) i) && f10 <= ((float) (i + view.getWidth())) && f11 >= ((float) i10) && f11 <= ((float) (i10 + view.getHeight()));
    }
}

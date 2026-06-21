package io.sentry.internal.gestures;

import io.sentry.internal.gestures.UiElement;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface GestureTargetLocator {
    @Nullable
    UiElement locate(@Nullable Object obj, float f10, float f11, UiElement.Type type);
}

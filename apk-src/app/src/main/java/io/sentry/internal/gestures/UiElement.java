package io.sentry.internal.gestures;

import io.sentry.util.Objects;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class UiElement {

    @Nullable
    final String className;

    @NotNull
    final String origin;

    @Nullable
    final String resourceName;

    @Nullable
    final String tag;

    @NotNull
    final WeakReference<Object> viewRef;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum Type {
        CLICKABLE,
        SCROLLABLE
    }

    public UiElement(@Nullable Object obj, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4) {
        this.viewRef = new WeakReference<>(obj);
        this.className = str;
        this.resourceName = str2;
        this.tag = str3;
        this.origin = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UiElement.class == obj.getClass()) {
            UiElement uiElement = (UiElement) obj;
            if (Objects.equals(this.className, uiElement.className) && Objects.equals(this.resourceName, uiElement.resourceName) && Objects.equals(this.tag, uiElement.tag)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getClassName() {
        return this.className;
    }

    @NotNull
    public String getIdentifier() {
        String str = this.resourceName;
        return str != null ? str : (String) Objects.requireNonNull(this.tag, "UiElement.tag can't be null");
    }

    @NotNull
    public String getOrigin() {
        return this.origin;
    }

    @Nullable
    public String getResourceName() {
        return this.resourceName;
    }

    @Nullable
    public String getTag() {
        return this.tag;
    }

    @Nullable
    public Object getView() {
        return this.viewRef.get();
    }

    public int hashCode() {
        return Objects.hash(this.viewRef, this.resourceName, this.tag);
    }
}

package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class CurrentActivityHolder {

    @NotNull
    private static final CurrentActivityHolder instance = new CurrentActivityHolder();

    @Nullable
    private WeakReference<Activity> currentActivity;

    private CurrentActivityHolder() {
    }

    @NotNull
    public static CurrentActivityHolder getInstance() {
        return instance;
    }

    public void clearActivity() {
        this.currentActivity = null;
    }

    @Nullable
    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void setActivity(@NotNull Activity activity) {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference == null || weakReference.get() != activity) {
            this.currentActivity = new WeakReference<>(activity);
        }
    }

    public void clearActivity(@NotNull Activity activity) {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference == null || weakReference.get() == activity) {
            this.currentActivity = null;
        }
    }
}

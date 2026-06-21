package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.internal.measurement.b4;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.OnRootViewsChangedListener;
import io.sentry.android.replay.WindowsKt;
import io.sentry.android.replay.util.FixedWindowCallback;
import io.sentry.util.AutoClosableReentrantLock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.x;
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
@StabilityInferred(parameters = 0)
@Metadata
public final class GestureRecorder implements OnRootViewsChangedListener {
    public static final int $stable = 8;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final ArrayList<WeakReference<View>> rootViews;

    @NotNull
    private final AutoClosableReentrantLock rootViewsLock;

    @NotNull
    private final TouchRecorderCallback touchRecorderCallback;

    @NotNull
    private final WeakHashMap<Window, WeakReference<SentryReplayGestureRecorder>> wrappedWindows;

    @NotNull
    private final AutoClosableReentrantLock wrappedWindowsLock;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @StabilityInferred(parameters = 0)
    @Metadata
    public static final class SentryReplayGestureRecorder extends FixedWindowCallback {
        public static final int $stable = 8;

        @NotNull
        private final SentryOptions options;

        @Nullable
        private volatile TouchRecorderCallback touchRecorderCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SentryReplayGestureRecorder(@NotNull SentryOptions options, @Nullable TouchRecorderCallback touchRecorderCallback, @Nullable Window.Callback callback) {
            super(callback);
            Intrinsics.checkNotNullParameter(options, "options");
            this.options = options;
            this.touchRecorderCallback = touchRecorderCallback;
        }

        @Override // io.sentry.android.replay.util.FixedWindowCallback, android.view.Window.Callback
        public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
            if (motionEvent != null) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                Intrinsics.checkNotNullExpressionValue(motionEventObtainNoHistory, "obtainNoHistory(...)");
                try {
                    TouchRecorderCallback touchRecorderCallback = this.touchRecorderCallback;
                    if (touchRecorderCallback != null) {
                        touchRecorderCallback.onTouchEvent(motionEventObtainNoHistory);
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public final void inert() {
            this.touchRecorderCallback = null;
        }
    }

    public GestureRecorder(@NotNull SentryOptions options, @NotNull TouchRecorderCallback touchRecorderCallback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(touchRecorderCallback, "touchRecorderCallback");
        this.options = options;
        this.touchRecorderCallback = touchRecorderCallback;
        this.rootViews = new ArrayList<>();
        this.rootViewsLock = new AutoClosableReentrantLock();
        this.wrappedWindows = new WeakHashMap<>();
        this.wrappedWindowsLock = new AutoClosableReentrantLock();
    }

    private final void startGestureTracking(View view) {
        Window phoneWindow = WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.wrappedWindowsLock.acquire();
        try {
            WeakReference<SentryReplayGestureRecorder> weakReference = this.wrappedWindows.get(phoneWindow);
            if ((weakReference != null ? weakReference.get() : null) != null) {
                b4.f(iSentryLifecycleTokenAcquire, null);
                return;
            }
            Unit unit = Unit.f27471a;
            b4.f(iSentryLifecycleTokenAcquire, null);
            SentryReplayGestureRecorder sentryReplayGestureRecorder = new SentryReplayGestureRecorder(this.options, this.touchRecorderCallback, phoneWindow.getCallback());
            phoneWindow.setCallback(sentryReplayGestureRecorder);
            iSentryLifecycleTokenAcquire = this.wrappedWindowsLock.acquire();
            try {
                this.wrappedWindows.put(phoneWindow, new WeakReference<>(sentryReplayGestureRecorder));
                b4.f(iSentryLifecycleTokenAcquire, null);
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    private final void stopGestureTracking(View view) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire;
        Window phoneWindow = WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = phoneWindow.getCallback();
        if (callback instanceof SentryReplayGestureRecorder) {
            phoneWindow.setCallback(((SentryReplayGestureRecorder) callback).delegate);
            iSentryLifecycleTokenAcquire = this.wrappedWindowsLock.acquire();
            try {
                this.wrappedWindows.remove(phoneWindow);
                b4.f(iSentryLifecycleTokenAcquire, null);
                return;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        iSentryLifecycleTokenAcquire = this.wrappedWindowsLock.acquire();
        try {
            WeakReference<SentryReplayGestureRecorder> weakReference = this.wrappedWindows.get(phoneWindow);
            SentryReplayGestureRecorder sentryReplayGestureRecorder = weakReference != null ? weakReference.get() : null;
            this.wrappedWindows.remove(phoneWindow);
            b4.f(iSentryLifecycleTokenAcquire, null);
            if (sentryReplayGestureRecorder != null) {
                sentryReplayGestureRecorder.inert();
            }
        } catch (Throwable th2) {
        }
    }

    @Override // io.sentry.android.replay.OnRootViewsChangedListener
    public void onRootViewsChanged(@NotNull View root, boolean z5) {
        Intrinsics.checkNotNullParameter(root, "root");
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.rootViewsLock.acquire();
        try {
            if (z5) {
                this.rootViews.add(new WeakReference<>(root));
                startGestureTracking(root);
                Unit unit = Unit.f27471a;
            } else {
                stopGestureTracking(root);
                x.p(this.rootViews, new GestureRecorder$onRootViewsChanged$1$1(root));
            }
            b4.f(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    public final void stop() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.rootViewsLock.acquire();
        try {
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    stopGestureTracking(view);
                }
            }
            this.rootViews.clear();
            Unit unit = Unit.f27471a;
            b4.f(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }
}

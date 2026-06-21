package io.flutter.embedding.engine;

import a0.b1;
import a0.u;
import ai.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaExtractor;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import bi.c;
import bi.d;
import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import com.google.firebase.messaging.y;
import g2.n1;
import hi.j;
import ii.e;
import io.appmetrica.analytics.impl.lp;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.plugin.platform.p;
import io.flutter.plugin.platform.q;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ob.a0;
import xh.m;
import xh.r;
import xh.s;
import yh.b;
import yh.f;
import yh.g;
import z2.w;
import zh.h;
import zh.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static g asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private f accessibilityDelegate;
    private a deferredComponentManager;
    private ji.a localizationPlugin;
    private Long nativeShellHolderId;
    private i platformMessageHandler;
    private q platformViewsController;
    private p platformViewsController2;
    private j settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();

    @NonNull
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();

    @NonNull
    private final Set<k> flutterUiDisplayListeners = new CopyOnWriteArraySet();

    @NonNull
    private final Set<l> flutterUiResizeListeners = new CopyOnWriteArraySet();

    @NonNull
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j10) {
        g gVar = asyncWaitForVsyncDelegate;
        if (gVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.b bVar = (io.flutter.view.b) gVar;
        bVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        dl.k kVar = (dl.k) bVar.f25784a;
        io.flutter.view.q qVar = (io.flutter.view.q) kVar.f15873d;
        if (qVar != null) {
            qVar.f25881b = j10;
            kVar.f15873d = null;
        } else {
            qVar = new io.flutter.view.q(kVar, j10);
        }
        choreographer.postFrameCallback(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(@NonNull ByteBuffer byteBuffer, long j10) {
        bi.b bVar;
        b1 b1Var = 0;
        b1Var = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        f9.g gVar = new f9.g(j10);
        d dVar = new d();
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, iRemaining, options);
            dVar.f2155b = options.outMimeType;
            dVar.f2159f = options.outHeight;
            dVar.f2160g = options.outWidth;
        } catch (Exception e3) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e3);
        }
        if ("image/heif".equals(dVar.f2155b)) {
            try {
                c cVar = new c(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(cVar);
                h5.y(dVar, mediaExtractor);
            } catch (Exception e7) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e7);
            }
            nativeImageHeaderCallback(gVar.f16709b, dVar.f2154a, dVar.f2156c);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    dVar.f2158e = new x2.g(byteArrayInputStream).d(1, "Orientation");
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e10) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e10);
            }
        }
        if ("image/heif".equals(dVar.f2155b)) {
            int i = Build.VERSION.SDK_INT;
            if (i == 36) {
                bVar = new bi.b(b1Var, 0);
            } else if (i < 36) {
                bVar = new bi.b(b1Var, 1);
            }
            b1Var = bVar;
        }
        if (b1Var == 0) {
            b1Var = new b1(3, gVar);
        }
        return b1Var.q(byteBuffer, dVar);
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer) {
        e eVar;
        i iVar = this.platformMessageHandler;
        if (iVar == null || (eVar = (e) ((h) iVar).f46296g.remove(Integer.valueOf(i))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e3) {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                throw e3;
            }
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e3);
        } catch (Exception e7) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e7);
        }
    }

    private native long nativeAttach(@NonNull FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j10);

    private native void nativeDeferredComponentInstallFailure(int i, @NonNull String str, boolean z5);

    private native void nativeDestroy(long j10);

    private native void nativeDispatchEmptyPlatformMessage(long j10, @NonNull String str, int i);

    private native void nativeDispatchPlatformMessage(long j10, @NonNull String str, ByteBuffer byteBuffer, int i, int i10);

    private native void nativeDispatchPointerDataPacket(long j10, @NonNull ByteBuffer byteBuffer, int i);

    private native void nativeDispatchSemanticsAction(long j10, int i, int i10, ByteBuffer byteBuffer, int i11);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i);

    private native Bitmap nativeGetBitmap(long j10);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j10, int i, int i10);

    private static native void nativeInit(@NonNull Context context, @NonNull String[] strArr, String str, @NonNull String str2, @NonNull String str3, long j10, int i);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j10, int i);

    private native void nativeInvokePlatformMessageResponseCallback(long j10, int i, ByteBuffer byteBuffer, int i10);

    private native boolean nativeIsSurfaceControlEnabled(long j10);

    private native void nativeLoadDartDeferredLibrary(long j10, int i, @NonNull String[] strArr);

    @NonNull
    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j10);

    private native void nativeMarkTextureFrameAvailable(long j10, long j11);

    private native void nativeNotifyLowMemoryWarning(long j10);

    private native void nativeOnVsync(long j10, long j11, long j12);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j10, long j11, @NonNull WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z5);

    private native void nativeRegisterTexture(long j10, long j11, @NonNull WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j10, @NonNull String str, String str2, String str3, @NonNull AssetManager assetManager, List<String> list, long j11);

    private native void nativeScheduleFrame(long j10);

    private native void nativeSetAccessibilityFeatures(long j10, int i);

    private native void nativeSetSemanticsEnabled(long j10, boolean z5);

    private native void nativeSetViewportMetrics(long j10, float f10, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int[] iArr, int[] iArr2, int[] iArr3, int i24, int i25, int i26, int i27);

    private native FlutterJNI nativeSpawn(long j10, String str, String str2, String str3, List<String> list, long j11);

    private native void nativeSurfaceChanged(long j10, int i, int i10);

    private native void nativeSurfaceCreated(long j10, @NonNull Surface surface);

    private native void nativeSurfaceDestroyed(long j10);

    private native void nativeSurfaceWindowChanged(long j10, @NonNull Surface surface);

    private native void nativeUnregisterTexture(long j10, long j11);

    private native void nativeUpdateDisplayMetrics(long j10);

    private native void nativeUpdateJavaAssetManager(long j10, @NonNull AssetManager assetManager, @NonNull String str);

    private native void nativeUpdateRefreshRate(float f10);

    private void onPreEngineRestart() {
        Iterator<b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void setApplicationLocale(@NonNull String str) {
        ensureRunningOnMainThread();
        f fVar = this.accessibilityDelegate;
        if (fVar != null) {
            ((io.flutter.view.h) ((io.flutter.view.b) fVar).f25784a).f25857m = str;
        }
    }

    private void updateCustomAccessibilityActions(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr) {
        ensureRunningOnMainThread();
        f fVar = this.accessibilityDelegate;
        if (fVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.h hVar = (io.flutter.view.h) ((io.flutter.view.b) fVar).f25784a;
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.f fVarB = hVar.b(byteBuffer.getInt());
                fVarB.f25814c = byteBuffer.getInt();
                fVarB.f25815d = io.flutter.view.h.d(byteBuffer, strArr);
                fVarB.f25816e = io.flutter.view.h.d(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr, @NonNull ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        f fVar = this.accessibilityDelegate;
        if (fVar != null) {
            ((io.flutter.view.b) fVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(@NonNull b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(@NonNull k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(kVar);
    }

    public void addResizingFlutterUiListener(@NonNull l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(lVar);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = pVar.f25722m;
        SurfaceControl.Transaction transactionF = n1.f();
        for (int i = 0; i < arrayList.size(); i++) {
            transactionF = transactionF.merge(n1.h(arrayList.get(i)));
        }
        transactionF.apply();
        arrayList.clear();
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j10) {
        nativeCleanupMessageData(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        if (r4.hasNext() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0124, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0136, code lost:
    
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0139, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0141, code lost:
    
        if (r4.hasNext() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0143, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0155, code lost:
    
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0158, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String[] computePlatformResolvedLocale(@androidx.annotation.NonNull java.lang.String[] r10) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.computePlatformResolvedLocale(java.lang.String[]):java.lang.String[]");
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        Context context = qVar.f25731e.getContext();
        int width = qVar.f25731e.getWidth();
        int height = qVar.f25731e.getHeight();
        io.flutter.plugin.platform.a aVar = qVar.f25735j;
        io.flutter.plugin.platform.d dVar = new io.flutter.plugin.platform.d(context, width, height, 2);
        dVar.i = aVar;
        int i = qVar.f25742q;
        qVar.f25742q = i + 1;
        qVar.f25740o.put(i, dVar);
        return new FlutterOverlaySurface(i, dVar.getSurface());
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (pVar.f25724o == null) {
            SurfaceControl.Builder builderE = n1.e();
            builderE.setBufferSize(pVar.f25715e.getWidth(), pVar.f25715e.getHeight());
            builderE.setFormat(1);
            builderE.setName("Flutter Overlay Surface");
            builderE.setOpaque(false);
            builderE.setHidden(false);
            SurfaceControl surfaceControlBuild = builderE.build();
            SurfaceControl.Transaction transactionBuildReparentTransaction = pVar.f25715e.getRootSurfaceControl().buildReparentTransaction(surfaceControlBuild);
            transactionBuildReparentTransaction.setLayer(surfaceControlBuild, 1000);
            transactionBuildReparentTransaction.apply();
            pVar.f25724o = n1.d(surfaceControlBuild);
            pVar.f25725p = surfaceControlBuild;
        }
        return new FlutterOverlaySurface(0, pVar.f25724o);
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction transactionF = n1.f();
        pVar.f25722m.add(transactionF);
        return transactionF;
    }

    public void deferredComponentInstallFailure(int i, @NonNull String str, boolean z5) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i, str, z5);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = pVar.f25724o;
        if (surface != null) {
            surface.release();
            pVar.f25724o = null;
            pVar.f25725p = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        qVar.d();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(@NonNull String str, int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i);
    }

    public void dispatchPlatformMessage(@NonNull String str, ByteBuffer byteBuffer, int i, int i10) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i, i10);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i10);
    }

    public void dispatchPointerDataPacket(@NonNull ByteBuffer byteBuffer, int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, @NonNull io.flutter.view.e eVar) {
        dispatchSemanticsAction(i, eVar, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = pVar.f25723n;
        SurfaceControl.Transaction transactionF = n1.f();
        for (int i = 0; i < arrayList.size(); i++) {
            transactionF = transactionF.merge(n1.h(arrayList.get(i)));
        }
        arrayList.clear();
        pVar.f25715e.invalidate();
        pVar.f25715e.getRootSurfaceControl().applyTransactionOnDraw(transactionF);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float getScaledFontSize(float r7, int r8) {
        /*
            r6 = this;
            hi.j r0 = r6.settingsChannel
            r1 = 0
            if (r0 != 0) goto L6
            goto L69
        L6:
            bb.e r0 = r0.f20606a
            java.lang.Object r2 = r0.f2019c
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            java.lang.Object r3 = r0.f2020d
            hi.i r3 = (hi.i) r3
            if (r3 != 0) goto L1a
            java.lang.Object r3 = r2.poll()
            hi.i r3 = (hi.i) r3
            r0.f2020d = r3
        L1a:
            java.lang.Object r3 = r0.f2020d
            hi.i r3 = (hi.i) r3
            if (r3 == 0) goto L2d
            int r4 = r3.f20604a
            if (r4 >= r8) goto L2d
            java.lang.Object r3 = r2.poll()
            hi.i r3 = (hi.i) r3
            r0.f2020d = r3
            goto L1a
        L2d:
            java.lang.String r2 = "Cannot find config with generation: "
            java.lang.String r4 = "SettingsChannel"
            if (r3 != 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r2 = ", after exhausting the queue."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
        L47:
            r3 = r1
            goto L64
        L49:
            int r5 = r3.f20604a
            if (r5 == r8) goto L64
            java.lang.String r3 = ", the oldest config is now: "
            java.lang.StringBuilder r2 = l7.o.m(r8, r2, r3)
            java.lang.Object r0 = r0.f2020d
            hi.i r0 = (hi.i) r0
            int r0 = r0.f20604a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.e(r4, r0)
            goto L47
        L64:
            if (r3 != 0) goto L67
            goto L69
        L67:
            android.util.DisplayMetrics r1 = r3.f20605b
        L69:
            if (r1 != 0) goto L8a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "getScaledFontSize called with configurationId "
            r7.<init>(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r8 = ", which can't be found."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FlutterJNI"
            android.util.Log.e(r8, r7)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r7
        L8a:
            r8 = 2
            float r7 = android.util.TypedValue.applyDimension(r8, r7, r1)
            float r8 = r1.density
            float r7 = r7 / r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.getScaledFontSize(float, int):float");
    }

    public void handlePlatformMessage(@NonNull String str, ByteBuffer byteBuffer, int i, long j10) {
        zh.e eVar;
        boolean z5;
        i iVar = this.platformMessageHandler;
        if (iVar == null) {
            nativeCleanupMessageData(j10);
            return;
        }
        h hVar = (h) iVar;
        synchronized (hVar.f46294e) {
            try {
                eVar = (zh.e) hVar.f46292c.get(str);
                z5 = hVar.f46295f.get() && eVar == null;
                if (z5) {
                    if (!hVar.f46293d.containsKey(str)) {
                        hVar.f46293d.put(str, new LinkedList());
                    }
                    ((List) hVar.f46293d.get(str)).add(new zh.c(j10, byteBuffer, i));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            return;
        }
        hVar.c(str, eVar, byteBuffer, i, j10);
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (pVar.f25725p == null) {
            return;
        }
        SurfaceControl.Transaction transactionF = n1.f();
        transactionF.setVisibility(pVar.f25725p, false);
        transactionF.apply();
    }

    @SuppressLint({"NewApi"})
    public void hidePlatformView2(int i) {
        ensureRunningOnMainThread();
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        if (pVar.a(i)) {
            ((di.b) pVar.f25720k.get(i)).setVisibility(8);
        }
    }

    public void init(@NonNull Context context, @NonNull String[] strArr, String str, @NonNull String str2, @NonNull String str3, long j10, int i) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j10, i);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th2) {
            this.shellHolderLock.readLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [io.flutter.embedding.engine.FlutterJNI] */
    public void invokePlatformMessageResponseCallback(int i, @NonNull ByteBuffer byteBuffer, int i10) throws Throwable {
        FlutterJNI flutterJNIIsAttached;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            flutterJNIIsAttached = isAttached();
        } catch (Throwable th2) {
            th = th2;
            flutterJNIIsAttached = this;
        }
        try {
            if (flutterJNIIsAttached != 0) {
                FlutterJNI flutterJNI = this;
                flutterJNI.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i, byteBuffer, i10);
                flutterJNIIsAttached = flutterJNI;
            } else {
                flutterJNIIsAttached = this;
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
            }
            flutterJNIIsAttached.shellHolderLock.readLock().unlock();
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            flutterJNIIsAttached.shellHolderLock.readLock().unlock();
            throw th4;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i) {
        return nativeFlutterTextUtilsIsEmoji(i);
    }

    public boolean isCodePointEmojiModifier(int i) {
        return nativeFlutterTextUtilsIsEmojiModifier(i);
    }

    public boolean isCodePointEmojiModifierBase(int i) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i);
    }

    public boolean isCodePointRegionalIndicator(int i) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i);
    }

    public boolean isCodePointVariantSelector(int i) {
        return nativeFlutterTextUtilsIsVariationSelector(i);
    }

    public void loadDartDeferredLibrary(int i, @NonNull String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i, strArr);
    }

    public void loadLibrary(Context context) throws Throwable {
        r3.b bVarF;
        String[] strArrG;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        yf.a aVar = new yf.a(5);
        y yVar = new y(15);
        yVar.f14902e = aVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        yVar.r("Beginning load of %s...", PluginErrorDetails.Platform.FLUTTER);
        ob.y yVar2 = (ob.y) yVar.f14900c;
        HashSet hashSet = (HashSet) yVar.f14899b;
        if (hashSet.contains(PluginErrorDetails.Platform.FLUTTER)) {
            yVar.r("%s already loaded previously!", PluginErrorDetails.Platform.FLUTTER);
        } else {
            r3.b bVar = null;
            try {
                yVar2.getClass();
                System.loadLibrary(PluginErrorDetails.Platform.FLUTTER);
                hashSet.add(PluginErrorDetails.Platform.FLUTTER);
                yVar.r("%s (%s) was loaded normally!", PluginErrorDetails.Platform.FLUTTER, null);
            } catch (UnsatisfiedLinkError e3) {
                yVar.r("Loading the library normally failed: %s", Log.getStackTraceString(e3));
                yVar.r("%s (%s) was not loaded normally, re-linking...", PluginErrorDetails.Platform.FLUTTER, null);
                File fileM = yVar.m(context);
                if (!fileM.exists()) {
                    File dir = context.getDir("lib", 0);
                    File fileM2 = yVar.m(context);
                    yVar2.getClass();
                    File[] fileArrListFiles = dir.listFiles(new s8.a(System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER)));
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            if (!file.getAbsolutePath().equals(fileM2.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    a0 a0Var = (a0) yVar.f14901d;
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String strMapLibraryName = System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER);
                    a0Var.getClass();
                    try {
                        bVarF = a0.f(context, strArr, strMapLibraryName, yVar);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        if (bVarF == null) {
                            try {
                                strArrG = a0.g(context, strMapLibraryName);
                            } catch (Exception e7) {
                                strArrG = new String[]{e7.toString()};
                            }
                            StringBuilder sbP = om1.p("Could not find '", strMapLibraryName, "'. Looked for: ");
                            sbP.append(Arrays.toString(strArr));
                            sbP.append(", but only found: ");
                            throw new oc(u.o(sbP, Arrays.toString(strArrG), "."));
                        }
                        ZipFile zipFile = (ZipFile) bVarF.f32188c;
                        int i = 0;
                        while (true) {
                            int i10 = i + 1;
                            if (i < 5) {
                                yVar.r("Found %s! Extracting...", strMapLibraryName);
                                try {
                                    if (fileM.exists() || fileM.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) bVarF.f32189d);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(fileM);
                                                try {
                                                    try {
                                                        byte[] bArr = new byte[4096];
                                                        long j10 = 0;
                                                        while (true) {
                                                            int i11 = inputStream2.read(bArr);
                                                            if (i11 == -1) {
                                                                break;
                                                            }
                                                            fileOutputStream2.write(bArr, 0, i11);
                                                            j10 += (long) i11;
                                                        }
                                                        fileOutputStream2.flush();
                                                        fileOutputStream2.getFD().sync();
                                                        if (j10 == fileM.length()) {
                                                            a0.e(inputStream2);
                                                            a0.e(fileOutputStream2);
                                                            fileM.setReadable(true, false);
                                                            fileM.setExecutable(true, false);
                                                            fileM.setWritable(true);
                                                            break;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        inputStream = inputStream2;
                                                        fileOutputStream = fileOutputStream2;
                                                        a0.e(inputStream);
                                                        a0.e(fileOutputStream);
                                                        throw th;
                                                    }
                                                } catch (FileNotFoundException | IOException unused) {
                                                }
                                            } catch (FileNotFoundException unused2) {
                                                fileOutputStream2 = null;
                                                a0.e(inputStream2);
                                                a0.e(fileOutputStream2);
                                                i = i10;
                                            } catch (IOException unused3) {
                                                fileOutputStream2 = null;
                                                a0.e(inputStream2);
                                                a0.e(fileOutputStream2);
                                                i = i10;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                a0.e(inputStream);
                                                a0.e(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused4) {
                                            inputStream2 = null;
                                        } catch (IOException unused5) {
                                            inputStream2 = null;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            inputStream = null;
                                        }
                                        a0.e(inputStream2);
                                        a0.e(fileOutputStream2);
                                    }
                                } catch (IOException unused6) {
                                }
                                i = i10;
                            } else if (((yf.a) yVar.f14902e) != null) {
                                lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused7) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        bVar = bVarF;
                        if (bVar != null) {
                            try {
                                ((ZipFile) bVar.f32188c).close();
                            } catch (IOException unused8) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = fileM.getAbsolutePath();
                yVar2.getClass();
                System.load(absolutePath);
                hashSet.add(PluginErrorDetails.Platform.FLUTTER);
                yVar.r("%s (%s) was re-linked!", PluginErrorDetails.Platform.FLUTTER, null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j10);
    }

    public void maybeResizeSurfaceView(int i, int i10) {
        boolean z5;
        Iterator<l> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            s sVar = ((xh.q) it.next()).f36164a;
            View view = sVar.f36173g;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z10 = true;
                if (view.getHeight() != i10) {
                    layoutParams.height = i10;
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (view.getWidth() != i) {
                    layoutParams.width = i;
                } else {
                    z10 = z5;
                }
                if (z10) {
                    sVar.f36168b.set(false);
                    view.setLayoutParams(layoutParams);
                }
            } else {
                Log.e("FlutterView", "Flutter engine view not set.");
            }
        }
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        qVar.f25745t.clear();
        qVar.f25746u.clear();
    }

    public void onDisplayOverlaySurface(int i, int i10, int i11, int i12, int i13) {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = qVar.f25740o;
        if (sparseArray.get(i) == null) {
            throw new IllegalStateException(u.k(i, "The overlay surface (id:", ") doesn't exist"));
        }
        qVar.i();
        View view = (io.flutter.plugin.platform.d) sparseArray.get(i);
        if (view.getParent() == null) {
            qVar.f25731e.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        qVar.f25745t.add(Integer.valueOf(i));
    }

    public void onDisplayPlatformView(int i, int i10, int i11, int i12, int i13, int i14, int i15, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        qVar.i();
        SparseArray sparseArray = qVar.f25739n;
        SparseArray sparseArray2 = qVar.f25738m;
        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) sparseArray2.get(i);
        if (fVar == null) {
            return;
        }
        if (sparseArray.get(i) == null) {
            View view = fVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            w wVar = qVar.f25730d;
            di.b bVar = new di.b(wVar, wVar.getResources().getDisplayMetrics().density, qVar.f25729c);
            bVar.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.k(qVar, i, 0));
            sparseArray.put(i, bVar);
            view.setImportantForAccessibility(4);
            bVar.addView(view);
            qVar.f25731e.addView(bVar);
        }
        di.b bVar2 = (di.b) sparseArray.get(i);
        bVar2.f15796b = flutterMutatorsStack;
        bVar2.f15798d = i10;
        bVar2.f15799e = i11;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        bVar2.setLayoutParams(layoutParams);
        bVar2.setWillNotDraw(false);
        bVar2.setVisibility(0);
        bVar2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i14, i15);
        View view2 = ((io.flutter.plugin.platform.f) sparseArray2.get(i)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
        qVar.f25746u.add(Integer.valueOf(i));
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i, int i10, int i11, int i12, int i13, int i14, int i15, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (pVar.a(i)) {
            di.b bVar = (di.b) pVar.f25720k.get(i);
            bVar.f15796b = flutterMutatorsStack;
            bVar.f15798d = i10;
            bVar.f15799e = i11;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            layoutParams.leftMargin = i10;
            layoutParams.topMargin = i11;
            bVar.setLayoutParams(layoutParams);
            bVar.setWillNotDraw(false);
            bVar.setVisibility(0);
            bVar.bringToFront();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i14, i15);
            View view = ((io.flutter.plugin.platform.f) pVar.f25719j.get(i)).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams2);
                view.bringToFront();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public void onEndFrame() {
        ?? r32;
        ensureRunningOnMainThread();
        q qVar = this.platformViewsController;
        if (qVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z5 = false;
        if (!qVar.f25743r || !qVar.f25746u.isEmpty()) {
            if (qVar.f25743r) {
                m mVar = qVar.f25731e.f36172f;
                if (mVar != null ? mVar.c() : false) {
                    z5 = true;
                }
            }
            qVar.g(z5);
            return;
        }
        qVar.f25743r = false;
        s sVar = qVar.f25731e;
        lp lpVar = new lp(1, qVar);
        m mVar2 = sVar.f36172f;
        if (mVar2 == null || (r32 = sVar.f36174h) == 0) {
            return;
        }
        sVar.f36173g = r32;
        sVar.f36174h = null;
        io.flutter.embedding.engine.renderer.j jVar = sVar.f36176k.f25542b;
        if (jVar != null) {
            r32.resume();
            jVar.a(new r(sVar, jVar, lpVar));
            return;
        }
        mVar2.b();
        m mVar3 = sVar.f36172f;
        if (mVar3 != null) {
            mVar3.f36146b.close();
            sVar.removeView(sVar.f36172f);
            sVar.f36172f = null;
        }
        lpVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<k> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<k> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i, int i10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i, i10);
    }

    public void onSurfaceCreated(@NonNull Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(@NonNull Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j10, long j11, long j12) {
        nativeOnVsync(j10, j11, j12);
    }

    public long performNativeAttach(@NonNull FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j10, @NonNull TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j10, new WeakReference<>(textureRegistry$ImageConsumer), z5);
    }

    public void registerTexture(long j10, @NonNull SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j10, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(@NonNull b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(@NonNull k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(kVar);
    }

    public void removeResizingFlutterUiListener(@NonNull l lVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(lVar);
    }

    public void requestDartDeferredLibrary(int i) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(@NonNull String str, String str2, String str3, @NonNull AssetManager assetManager, List<String> list, long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j10);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(f fVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = fVar;
    }

    public void setAccessibilityFeatures(int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i);
        }
    }

    public void setAccessibilityFeaturesInNative(int i) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i);
    }

    public void setAsyncWaitForVsyncDelegate(g gVar) {
        asyncWaitForVsyncDelegate = gVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(ji.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(i iVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = iVar;
    }

    public void setPlatformViewsController(@NonNull q qVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = qVar;
    }

    public void setPlatformViewsController2(@NonNull p pVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = pVar;
    }

    public void setRefreshRateFPS(float f10) {
        refreshRateFPS = f10;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z5) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z5);
        }
    }

    public void setSemanticsEnabledInNative(boolean z5) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z5);
    }

    public void setSemanticsTreeEnabled(boolean z5) {
        ensureRunningOnMainThread();
        f fVar = this.accessibilityDelegate;
        if (fVar == null || z5) {
            return;
        }
        io.flutter.view.h hVar = (io.flutter.view.h) ((io.flutter.view.b) fVar).f25784a;
        hVar.f25852g.clear();
        io.flutter.view.g gVar = hVar.i;
        if (gVar != null) {
            hVar.h(gVar.f25819b, 65536);
        }
        hVar.i = null;
        hVar.f25860p = null;
        AccessibilityEvent accessibilityEventE = hVar.e(0, 2048);
        accessibilityEventE.setContentChangeTypes(1);
        hVar.i(accessibilityEventE);
    }

    public void setSettingsChannel(j jVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = jVar;
    }

    public void setViewportMetrics(float f10, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int[] iArr, int[] iArr2, int[] iArr3, int i24, int i25, int i26, int i27) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f10, i, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, iArr, iArr2, iArr3, i24, i25, i26, i27);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (pVar.f25725p == null) {
            return;
        }
        SurfaceControl.Transaction transactionF = n1.f();
        transactionF.setVisibility(pVar.f25725p, true);
        transactionF.apply();
    }

    @NonNull
    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI flutterJNINativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j10);
        Long l10 = flutterJNINativeSpawn.nativeShellHolderId;
        if ((l10 == null || l10.longValue() == 0) ? false : true) {
            return flutterJNINativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        p pVar = this.platformViewsController2;
        if (pVar == null) {
            throw new RuntimeException("");
        }
        synchronized (pVar) {
            try {
                pVar.f25723n.clear();
                for (int i = 0; i < pVar.f25722m.size(); i++) {
                    pVar.f25723n.add(n1.h(pVar.f25722m.get(i)));
                }
                pVar.f25722m.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void unregisterTexture(long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j10);
    }

    public void updateDisplayMetrics(int i, float f10, float f11, float f12) {
        displayWidth = f10;
        displayHeight = f11;
        displayDensity = f12;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(@NonNull AssetManager assetManager, @NonNull String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i, @NonNull io.flutter.view.e eVar, Object obj) {
        ByteBuffer byteBufferEncodeMessage;
        int iPosition;
        ensureAttachedToNative();
        if (obj != null) {
            byteBufferEncodeMessage = ii.w.INSTANCE.encodeMessage(obj);
            iPosition = byteBufferEncodeMessage.position();
        } else {
            byteBufferEncodeMessage = null;
            iPosition = 0;
        }
        dispatchSemanticsAction(i, eVar.f25811b, byteBufferEncodeMessage, iPosition);
    }

    public void dispatchSemanticsAction(int i, int i10, ByteBuffer byteBuffer, int i11) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i, i10, byteBuffer, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }
}

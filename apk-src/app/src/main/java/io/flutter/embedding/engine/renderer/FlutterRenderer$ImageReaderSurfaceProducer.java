package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.uz;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.o;
import io.flutter.view.p;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, o {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 7;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f25564id;
    private boolean released;
    final /* synthetic */ j this$0;
    private boolean ignoringFence = false;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    boolean notifiedDestroy = false;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final Object lock = new Object();
    private final ArrayDeque<f> imageReaderQueue = new ArrayDeque<>();
    private final HashMap<ImageReader, f> perImageReaders = new HashMap<>();
    private ArrayList<d> lastDequeuedImage = new ArrayList<>();
    private f lastReaderDequeuedFrom = null;
    p callback = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(j jVar, long j10) {
        this.this$0 = jVar;
        this.f25564id = j10;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (f fVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == fVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    fVar.f25578c = true;
                    fVar.f25576a.close();
                    fVar.f25577b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    Iterator<d> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().f25573a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                f fVar2 = this.lastReaderDequeuedFrom;
                if (fVar2 != null) {
                    fVar2.f25578c = true;
                    fVar2.f25576a.close();
                    fVar2.f25577b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private ImageReader createImageReader29() {
        return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 7, 256L);
    }

    private ImageReader createImageReader33() {
        a6.m.q();
        ImageReader.Builder builderK = a6.m.k(this.requestedWidth, this.requestedHeight);
        builderK.setMaxImages(7);
        builderK.setImageFormat(34);
        builderK.setUsage(256L);
        return builderK.build();
    }

    private f getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    f fVarPeekLast = this.imageReaderQueue.peekLast();
                    if (fVarPeekLast.f25576a.getSurface().isValid()) {
                        return fVarPeekLast;
                    }
                }
                this.createNewReader = false;
                return getOrCreatePerImageReader(createImageReader());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private f getOrCreatePerImageReader(ImageReader imageReader) {
        f fVar = this.perImageReaders.get(imageReader);
        if (fVar != null) {
            return fVar;
        }
        f fVarCreatePerImageReader = createPerImageReader(imageReader);
        this.perImageReaders.put(imageReader, fVarCreatePerImageReader);
        this.imageReaderQueue.add(fVarCreatePerImageReader);
        return fVarCreatePerImageReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dequeueImage$0() {
        if (this.released) {
            return;
        }
        this.this$0.f25607a.scheduleFrame();
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        this.this$0.h(this);
        this.this$0.f25613g.remove(this);
    }

    private void waitOnFence(Image image) {
        try {
            image.getFence().awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public Image acquireLatestImage() {
        d dVarDequeueImage = dequeueImage();
        if (dVarDequeueImage == null) {
            return null;
        }
        Image image = dVarDequeueImage.f25573a;
        maybeWaitOnFence(image);
        return image;
    }

    public ImageReader createImageReader() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return createImageReader33();
        }
        if (i >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public f createPerImageReader(ImageReader imageReader) {
        return new f(this, imageReader);
    }

    public double deltaMillis(long j10) {
        return j10 / 1000000.0d;
    }

    public d dequeueImage() {
        d dVar;
        boolean z5;
        synchronized (this.lock) {
            try {
                Iterator<f> it = this.imageReaderQueue.iterator();
                dVar = null;
                while (true) {
                    z5 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    ArrayDeque arrayDeque = next.f25577b;
                    d dVar2 = arrayDeque.isEmpty() ? null : (d) arrayDeque.removeFirst();
                    if (dVar2 == null) {
                        dVar = dVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f25573a.close();
                        }
                        this.lastDequeuedImage.add(dVar2);
                        this.lastReaderDequeuedFrom = next;
                        dVar = dVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<f> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().f25577b.isEmpty()) {
                        z5 = true;
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            this.this$0.f25611e.post(new c(this, 0));
        }
        return dVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() throws Throwable {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            j jVar = this.this$0;
            jVar.f25611e.post(new uz(this.f25564id, jVar.f25607a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getForcedNewSurface() {
        this.createNewReader = true;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        return getActiveReader().f25576a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return false;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.f25564id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int size;
        synchronized (this.lock) {
            try {
                Iterator<f> it = this.imageReaderQueue.iterator();
                size = 0;
                while (it.hasNext()) {
                    size += it.next().f25577b.size();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return size;
    }

    public int numTrims() {
        int i;
        synchronized (this.lock) {
            i = this.numTrims;
        }
        return i;
    }

    public void onImage(ImageReader imageReader, Image image) {
        d dVar;
        synchronized (this.lock) {
            f orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            ArrayDeque arrayDeque = orCreatePerImageReader.f25577b;
            if (orCreatePerImageReader.f25578c) {
                dVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f25579d;
                System.nanoTime();
                d dVar2 = new d(flutterRenderer$ImageReaderSurfaceProducer, image);
                arrayDeque.add(dVar2);
                while (arrayDeque.size() > 2) {
                    ((d) arrayDeque.removeFirst()).f25573a.close();
                }
                dVar = dVar2;
            }
        }
        if (dVar == null) {
            return;
        }
        this.this$0.f25607a.scheduleFrame();
    }

    @Override // io.flutter.view.o
    public void onTrimMemory(int i) {
        if (i < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        p pVar = this.callback;
        if (pVar != null) {
            this.notifiedDestroy = true;
            pVar.c();
        }
        cleanup();
        this.createNewReader = true;
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        f fVarPeekFirst;
        while (this.imageReaderQueue.size() > 1 && (fVarPeekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ImageReader imageReader = fVarPeekFirst.f25576a;
            ArrayDeque arrayDeque = fVarPeekFirst.f25577b;
            if (!arrayDeque.isEmpty() || fVarPeekFirst.f25579d.lastReaderDequeuedFrom == fVarPeekFirst) {
                return;
            }
            this.imageReaderQueue.removeFirst();
            this.perImageReaders.remove(imageReader);
            fVarPeekFirst.f25578c = true;
            imageReader.close();
            arrayDeque.clear();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        j jVar = this.this$0;
        jVar.f25607a.unregisterTexture(this.f25564id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f25607a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(p pVar) {
        this.callback = pVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i, int i10) {
        int iMax = Math.max(1, i);
        int iMax2 = Math.max(1, i10);
        if (this.requestedWidth == iMax && this.requestedHeight == iMax2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = iMax2;
        this.requestedWidth = iMax;
    }
}

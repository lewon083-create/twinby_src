package xh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class m extends View implements io.flutter.embedding.engine.renderer.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageReader f36146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Image f36147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bitmap f36148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f36149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36152h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i, int i10, int i11) {
        super(context, null);
        ImageReader imageReaderD = d(i, i10);
        this.f36150f = false;
        this.f36152h = false;
        this.f36146b = imageReaderD;
        this.f36151g = i11;
        setAlpha(0.0f);
        this.f36150f = i0.o.B(getContext());
    }

    public static ImageReader d(int i, int i10) {
        if (i <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i + ", set width=1");
            i = 1;
        }
        if (i10 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i10 + ", set height=1");
            i10 = 1;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i, i10, 1, 3, 768L) : ImageReader.newInstance(i, i10, 1, 3);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a(io.flutter.embedding.engine.renderer.j jVar) {
        if (t.z.m(this.f36151g) == 0) {
            Surface surface = this.f36146b.getSurface();
            jVar.f25609c = surface;
            jVar.f25607a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f36149e = jVar;
        this.f36152h = true;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f36152h) {
            setAlpha(0.0f);
            c();
            this.f36148d = null;
            Image image = this.f36147c;
            if (image != null) {
                image.close();
                this.f36147c = null;
            }
            invalidate();
            this.f36152h = false;
        }
    }

    public final boolean c() {
        if (!this.f36152h) {
            return false;
        }
        Image imageAcquireLatestImage = this.f36146b.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            Image image = this.f36147c;
            if (image != null) {
                image.close();
                this.f36147c = null;
            }
            this.f36147c = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public final void e(int i, int i10) {
        if (this.f36149e == null) {
            return;
        }
        if (i == this.f36146b.getWidth() && i10 == this.f36146b.getHeight()) {
            return;
        }
        Image image = this.f36147c;
        if (image != null) {
            image.close();
            this.f36147c = null;
        }
        this.f36146b.close();
        this.f36146b = d(i, i10);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f36149e;
    }

    public ImageReader getImageReader() {
        return this.f36146b;
    }

    @NonNull
    public Surface getSurface() {
        return this.f36146b.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Image image = this.f36147c;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                HardwareBuffer hardwareBuffer = image.getHardwareBuffer();
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                this.f36148d = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f36147c.getHeight();
                    Bitmap bitmap = this.f36148d;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f36148d.getHeight() != height) {
                        this.f36148d = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f36148d.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f36148d;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        if (!this.f36150f) {
            super.onMeasure(i, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i10), View.MeasureSpec.getMode(i10) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        if (!(i == this.f36146b.getWidth() && i10 == this.f36146b.getHeight()) && this.f36151g == 1 && this.f36152h) {
            e(i, i10);
            io.flutter.embedding.engine.renderer.j jVar = this.f36149e;
            Surface surface = this.f36146b.getSurface();
            jVar.f25609c = surface;
            jVar.f25607a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void pause() {
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void resume() {
    }
}

package androidx.camera.core;

import a0.e1;
import a0.e2;
import a0.n1;
import a0.p1;
import a0.r1;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.internal.auth.g;
import g0.k1;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1253a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(r1 r1Var) {
        if (!h(r1Var)) {
            g.k("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = r1Var.getWidth();
        int height = r1Var.getHeight();
        int iF = r1Var.f()[0].f();
        int iF2 = r1Var.f()[1].f();
        int iF3 = r1Var.f()[2].f();
        int iG = r1Var.f()[0].g();
        int iG2 = r1Var.f()[1].g();
        if (nativeShiftPixel(r1Var.f()[0].e(), iF, r1Var.f()[1].e(), iF2, r1Var.f()[2].e(), iF3, iG, iG2, width, height, iG, iG2, iG2) != 0) {
            g.k("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static r1 b(e2 e2Var, byte[] bArr) {
        f2.g.b(e2Var.e() == 256);
        bArr.getClass();
        Surface surface = e2Var.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            g.k("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        r1 r1VarAcquireLatestImage = e2Var.acquireLatestImage();
        if (r1VarAcquireLatestImage == null) {
            g.k("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return r1VarAcquireLatestImage;
    }

    public static Bitmap c(r1 r1Var) {
        if (r1Var.getFormat() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = r1Var.getWidth();
        int height = r1Var.getHeight();
        int iF = r1Var.f()[0].f();
        int iF2 = r1Var.f()[1].f();
        int iF3 = r1Var.f()[2].f();
        int iG = r1Var.f()[0].g();
        int iG2 = r1Var.f()[1].g();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r1Var.getWidth(), r1Var.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(r1Var.f()[0].e(), iF, r1Var.f()[1].e(), iF2, r1Var.f()[2].e(), iF3, iG, iG2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static e1 d(r1 r1Var, k1 k1Var, ByteBuffer byteBuffer, int i, boolean z5) {
        if (!h(r1Var)) {
            g.k("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!g(i)) {
            g.k("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = k1Var.getSurface();
        int width = r1Var.getWidth();
        int height = r1Var.getHeight();
        int iF = r1Var.f()[0].f();
        int iF2 = r1Var.f()[1].f();
        int iF3 = r1Var.f()[2].f();
        int iG = r1Var.f()[0].g();
        int iG2 = r1Var.f()[1].g();
        if (nativeConvertAndroid420ToABGR(r1Var.f()[0].e(), iF, r1Var.f()[1].e(), iF2, r1Var.f()[2].e(), iF3, iG, iG2, surface, byteBuffer, width, height, z5 ? iG : 0, z5 ? iG2 : 0, z5 ? iG2 : 0, i) != 0) {
            g.k("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            g.e("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - jCurrentTimeMillis) + "], image count: " + f1253a);
            f1253a = f1253a + 1;
        }
        r1 r1VarAcquireLatestImage = k1Var.acquireLatestImage();
        if (r1VarAcquireLatestImage == null) {
            g.k("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        e1 e1Var = new e1(r1VarAcquireLatestImage);
        e1Var.a(new n1(r1VarAcquireLatestImage, r1Var, 0));
        return e1Var;
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void f(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean g(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    public static boolean h(r1 r1Var) {
        return r1Var.getFormat() == 35 && r1Var.f().length == 3;
    }

    public static e1 i(r1 r1Var, k1 k1Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (!h(r1Var)) {
            g.k("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!g(i)) {
            g.k("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i > 0) {
            int width = r1Var.getWidth();
            int height = r1Var.getHeight();
            int iF = r1Var.f()[0].f();
            int iF2 = r1Var.f()[1].f();
            int iF3 = r1Var.f()[2].f();
            int iG = r1Var.f()[1].g();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage != null && nativeRotateYUV(r1Var.f()[0].e(), iF, r1Var.f()[1].e(), iF2, r1Var.f()[2].e(), iF3, iG, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) == 0) {
                imageWriter.queueInputImage(imageDequeueInputImage);
                r1 r1VarAcquireLatestImage = k1Var.acquireLatestImage();
                if (r1VarAcquireLatestImage == null) {
                    g.k("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                    return null;
                }
                e1 e1Var = new e1(r1VarAcquireLatestImage);
                e1Var.a(new n1(r1VarAcquireLatestImage, r1Var, 1));
                return e1Var;
            }
        }
        g.k("ImageProcessingUtil", "rotate YUV failure");
        return null;
    }

    public static e1 j(r1 r1Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i) {
        if (!h(r1Var)) {
            g.k("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!g(i)) {
            g.k("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i == 0 && r1Var.f().length == 3 && r1Var.f()[1].g() == 2 && nativeGetYUVImageVUOff(r1Var.f()[2].e(), r1Var.f()[1].e()) == -1) {
            return null;
        }
        int i10 = i % 180;
        int width = i10 == 0 ? r1Var.getWidth() : r1Var.getHeight();
        int height = i10 == 0 ? r1Var.getHeight() : r1Var.getWidth();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        if (nativeRotateYUV(r1Var.f()[0].e(), r1Var.f()[0].f(), r1Var.f()[1].e(), r1Var.f()[1].f(), r1Var.f()[2].e(), r1Var.f()[2].f(), r1Var.f()[2].g(), byteBuffer4, width, 1, byteBufferNativeNewDirectByteBuffer, width, 2, byteBuffer5, width, 2, byteBuffer, byteBuffer2, byteBuffer3, r1Var.getWidth(), r1Var.getHeight(), i) == 0) {
            return new e1(new p1(r1Var, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, width, height));
        }
        g.k("ImageProcessingUtil", "rotate YUV failure");
        return null;
    }

    public static void k(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            g.k("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, int i12, int i13, Surface surface, ByteBuffer byteBuffer4, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, int i12, int i13, Bitmap bitmap, int i14, int i15, int i16);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i10, int i11, int i12, boolean z5);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i, int i10);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, int i12, ByteBuffer byteBuffer4, int i13, int i14, ByteBuffer byteBuffer5, int i15, int i16, ByteBuffer byteBuffer6, int i17, int i18, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i19, int i20, int i21);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}

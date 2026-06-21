package q8;

import a0.u;
import ac.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import b3.f;
import com.google.android.gms.internal.auth.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import tj.k;
import ya.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o8.a {
    public static void c(Bitmap bitmap, int i, int i10, int i11, String str, int i12) {
        boolean z5;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        e.q("src width = " + width);
        e.q("src height = " + height);
        float fB = g.b(bitmap, i, i10);
        e.q("scale = " + fB);
        float f10 = width / fB;
        float f11 = height / fB;
        e.q("dst width = " + f10);
        e.q("dst height = " + f11);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f10, (int) f11, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        Bitmap bitmapB = g.B(bitmapCreateScaledBitmap, i11);
        int width2 = bitmapB.getWidth();
        int height2 = bitmapB.getHeight();
        if (width2 <= 0 || height2 <= 0) {
            throw new IllegalArgumentException(u.j(width2, height2, "Invalid image size: ", "x"));
        }
        if (i12 < 0 || i12 > 100) {
            throw new IllegalArgumentException(o.i(i12, "Invalid quality: "));
        }
        f fVar = new f(str, width2, height2, i12);
        if (fVar.f1851l) {
            throw new IllegalStateException("Already started");
        }
        fVar.f1851l = true;
        fVar.f1848h.f1818b.start();
        if (!fVar.f1851l) {
            throw new IllegalStateException("Already started");
        }
        int i13 = fVar.f1842b;
        if (i13 != 2) {
            throw new IllegalStateException(o.i(i13, "Not valid in input mode "));
        }
        synchronized (fVar) {
            try {
                b3.e eVar = fVar.f1848h;
                if (eVar != null) {
                    eVar.a(bitmapB);
                }
            } finally {
            }
        }
        if (!fVar.f1851l) {
            throw new IllegalStateException("Already started");
        }
        synchronized (fVar) {
            try {
                b3.e eVar2 = fVar.f1848h;
                if (eVar2 != null) {
                    eVar2.i();
                }
            } finally {
            }
        }
        c cVar = fVar.f1846f;
        synchronized (cVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = 5000;
            while (true) {
                z5 = cVar.f738b;
                if (z5 || jCurrentTimeMillis2 <= 0) {
                    break;
                }
                try {
                    cVar.wait(jCurrentTimeMillis2);
                } catch (InterruptedException unused) {
                }
                jCurrentTimeMillis2 -= System.currentTimeMillis() - jCurrentTimeMillis;
            }
            if (!z5) {
                cVar.f738b = true;
                cVar.f739c = new TimeoutException("timed out waiting for result");
            }
            Exception exc = (Exception) cVar.f739c;
            if (exc != null) {
                throw exc;
            }
        }
        fVar.b();
        fVar.a();
        fVar.close();
    }

    @Override // o8.a
    public final void a(Context context, byte[] byteArray, ByteArrayOutputStream outputStream, int i, int i10, int i11, int i12, boolean z5, int i13) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        File file = new File(context.getCacheDir(), string);
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i13;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        Intrinsics.b(bitmapDecodeByteArray);
        c(bitmapDecodeByteArray, i, i10, i12, absolutePath, i11);
        outputStream.write(k.a(file));
    }

    @Override // o8.a
    public final void b(Context context, String path, OutputStream outputStream, int i, int i10, int i11, int i12, boolean z5, int i13, int i14) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        File file = new File(context.getCacheDir(), string);
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i13;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path, options);
        Intrinsics.b(bitmapDecodeFile);
        c(bitmapDecodeFile, i, i10, i12, absolutePath, i11);
        outputStream.write(k.a(file));
    }

    @Override // o8.a
    public final int getType() {
        return 2;
    }
}

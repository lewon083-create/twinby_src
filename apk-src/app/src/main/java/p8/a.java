package p8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.gms.internal.auth.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import ya.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.CompressFormat f31254b;

    public a(int i) {
        this.f31253a = i;
        this.f31254b = i != 1 ? i != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    @Override // o8.a
    public final void a(Context context, byte[] byteArray, ByteArrayOutputStream outputStream, int i, int i10, int i11, int i12, boolean z5, int i13) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i13;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        float width = bitmapDecodeByteArray.getWidth();
        float height = bitmapDecodeByteArray.getHeight();
        e.q("src width = " + width);
        e.q("src height = " + height);
        float fB = g.b(bitmapDecodeByteArray, i, i10);
        e.q("scale = " + fB);
        float f10 = width / fB;
        float f11 = height / fB;
        e.q("dst width = " + f10);
        e.q("dst height = " + f11);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, (int) f10, (int) f11, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        Bitmap bitmapB = g.B(bitmapCreateScaledBitmap, i12);
        Bitmap.CompressFormat compressFormat = this.f31254b;
        bitmapB.compress(compressFormat, i11, byteArrayOutputStream);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray2, "toByteArray(...)");
        if (!z5 || compressFormat != Bitmap.CompressFormat.JPEG) {
            outputStream.write(byteArray2);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byteArrayOutputStream2.write(byteArray2);
        outputStream.write(new l8.a(byteArray).a(context, byteArrayOutputStream2).toByteArray());
    }

    @Override // o8.a
    public final void b(Context context, String path, OutputStream outputStream, int i, int i10, int i11, int i12, boolean z5, int i13, int i14) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        if (i14 <= 0) {
            return;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            options.inSampleSize = i13;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path, options);
            Intrinsics.b(bitmapDecodeFile);
            byte[] bArrC = g.c(bitmapDecodeFile, i, i10, i11, i12, this.f31253a);
            if (!z5 || this.f31254b != Bitmap.CompressFormat.JPEG) {
                outputStream.write(bArrC);
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(bArrC);
            outputStream.write(new l8.a(path).a(context, byteArrayOutputStream).toByteArray());
        } catch (OutOfMemoryError unused) {
            System.gc();
            b(context, path, outputStream, i, i10, i11, i12, z5, i13 * 2, i14 - 1);
        }
    }

    @Override // o8.a
    public final int getType() {
        return this.f31253a;
    }
}
